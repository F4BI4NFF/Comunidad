package comunidad

class Persona {
	String nombre //nombre completo
	//gustos

    static constraints = {
    	nombre(blank: false,size:3..45,unique:true)
    }

    Persona(String nombre){
    	this.nombre = nombre
    }
}
