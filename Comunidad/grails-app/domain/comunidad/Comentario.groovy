package comunidad

class Comentario {
	static belongsTo = [user:Usuario, tema:Tema]  //Noticia: Noticia, seccion: Seccion] 	//relacion "or" entre notiica y seccion

	String cuerpo
	Date fecha = new Date()

    static constraints = {
    	cuerpo(blank: false)
    }
    Comentario(String cuerpo,Usuario user, Tema tema){
    	this.cuerpo = cuerpo
    	this.tema = tema
    	this.user = user
    }
    void set_cuerpo(String cuerpo){
		this.cuerpo = cuerpo
	}
/*
    String obtener_autor(){
        return this.autor.get_nombre()
    }
    */
    String obtener_usuario(){
        return this.user.cuenta
    }
/*
    static Comentario añadircomentario_O(String cuerpo, Autor autor, Usuario user, Seccion seccion){
    	Comentario comentario = new Comentario(cuerpo, "Autor",autor, user,seccion)
    	return comentario
    }
*/

}





