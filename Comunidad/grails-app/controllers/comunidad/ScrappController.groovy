package comunidad

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional


import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements
import org.jsoup.parser.Tag

import geb.Browser
@Transactional
class ScrappController{


	def index(){

		def nombres = []

		def actual = ['algo']
		def contador = 0
		def extra = "?buscar=&pagina="

		Browser.drive{
		    // driver.webClient.javaScriptEnabled = true
		    while(actual != []){
			    go "http://arpa.ucv.cl/dic/resultado.php"+extra+contador  
			    contador++ 
			                 
			    /*$("input", name: "q").value("geb")
			    $("input", class: "searchButton").click()   
			    waitFor(10){ $("div", class:'currentPlugin') } */
			         
				actual = $("div", id:'datos').collect{div->
			      div.find("h2").find("a").text()    
			    }
			    nombres = nombres + actual
			}
		}

		//algo antes de hacer esto, alguna confirmacion


        // con todos los nombres ya tomados se prosigue
        nombres.each{	
	        def u = new Persona(it)
	        u.save(flush:true)
	    }
	    //revisar base de datos

		[nombres:nombres]



		//def url = 'http://arpa.ucv.cl/dic/resultado.php'.toURL()

		//def result = url.findAll{ it == 'datos'}

		/* parsear con exp regulares
		url.eachLine {
		    if (it =~ /href/) {
		        result << it
		    }
		}

		def json = new JsonBuilder(url)
		def result = json.findAll{a -> a.contains('id') } devuelve todo junto pegado como un string
*/



		//def code = new URL( 'http://arpa.ucv.cl/dic/resultado.php' ).text //me parsea el codigo  real



/*
	no funciona porke el doctype de la pagina esta viejo?
		tr = new XmlSlurper().parseText(response)
		tr.depthFirst().collect { it }.findAll { it.name() == "a" }.each {
			list << it.text()
		    list2 << it.@href.text()
    	}

*/


	}
	@Transactional
	def todos(){
		def extra = "?buscar=&pagina="
		def contador = 0
		def actual = ['algo']
		def todos = []
		def links
		while(actual != []){
			Document doc = Jsoup.connect("http://arpa.ucv.cl/dic/resultado.php"+extra+contador).timeout(1500).get();
			contador++

			actual = doc.select("#datos h2 a")
			links = actual.collect{ it.attr("abs:href") } //links dento href
			//links = (info.collect{it.toString()})*.replaceAll("profile.php","http://arpa.ucv.cl/dic/profile.php") 
				//info = (actual.collect{it.toString()})*.replaceAll("profile.php","http://arpa.ucv.cl/dic/profile.php") //super util el lista*.replaceall

			todos = todos + links
		} //todas las paginas de cada persona rescatadas

		//se busca lo necesario y se guarda en la BD
		def nombre, mail,gustos
		for(url in todos){
			Document doc = Jsoup.connect(url).timeout(1500).get();

			nombre = doc.select("#resultados #ficha h2").first().text()

			extra = doc.select("#resultados #ficha li").first()
			mail = extra.ownText()

			gustos =doc.select("#resultados #ficha a[href]")
			gustos = gustos.collect{it.text()} //gustos
			/* agregar a la clase correo */
			Correo c = new Correo(mail,nombre,gustos)
			if( !c.save(flush:true)){
				render "no se agrego 1"
			} else{
				render " se agregó 1"
			}
		}
	}

	def buscar(){
		def busq = params.busqueda

		Document doc = Jsoup.connect("http://arpa.ucv.cl/dic/resultado.php").data("buscar", busq).timeout(1500).post()
		def search = doc.select("#datos h2") //#id datos
		def info = (search.collect{it.toString()})*.replaceAll("profile.php","http://arpa.ucv.cl/dic/profile.php") //super util el lista*.replaceall

		def links = []//search.attr("abs:href")

		//busq = a.replaceAll(' ','+')
		Document doc2 = Jsoup.connect("http://www.musicapopular.cl/").ignoreHttpErrors(true).data("s",busq).timeout(1500).post()
		def search2 = doc2.select("article h2 a") //div con class = contblabla
		def info2 = search2.collect{it.toString()}

		Document doc3 = Jsoup.connect("http://www.difusion.musicachilena.cl/").data("s",busq).timeout(1500).post()
		def search3 = doc3.select("article h2 a")
		def info3 = search3.collect{it.toString()} //string para el {raw()}

		[datos:info,datos2:info2, datos3:info3]
/*
 Document doc = Jsoup.connect("http://www.facebook.com")
  .data("email", "myemailid")
  .data("pass", "mypassword")
  // and other hidden fields which are being passed in post request.
  .userAgent("Mozilla")
  .post();
   System.out.println(doc);*/
		


		/*
Elements links = content.getElementsByTag("a");
for (Element link : links) {
  String linkHref = link.attr("href");
  String linkText = link.text();
}*/
		//datos.attr("href")	
		//doc.getElementById("content");
		//Element element = document.select("div.title").first();
		//Elements elements = document.select("a[href]");

	}


	def bla(){
		Document doc = Jsoup.connect("http://www.memoriachilena.cl/602/w3-channel.html").timeout(1500).post()

		render "${doc}"

	} 


}



/*
		def actual = ['algo']

		Browser.drive{
		    // driver.webClient.javaScriptEnabled = true
		    //while(actual != []){
			    go url+path  			                 
			    /*$("input", name: "q").value("geb")
			    $("input", class: "searchButton").click()   
			    waitFor(10){ $("div", class:'currentPlugin') } 
				$("input", type:'email').value(mail)
		        $("input", type:'password').value(pass) //no vean mi contraseña qls o los mato
		        $("input", type: 'submit').click()
		        browser.at SecurePage
			         
				actual = $("div", id:'datos').collect{div->
			      div.find("h2").find("a").text()    
			    }
			    datos = datos + actual
		}*/