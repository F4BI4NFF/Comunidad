package comunidad

class Usuario {
	static hasMany = [comentarios:Comentario, temas: Tema]

    // time stamps: automatically populated by GORM
    Date dateCreated 
    Date lastUpdated 

    //asociado a la cuenta/user
    String cuenta
    String pass
    String confirm         // plain text, not stored

    //datos visitante
    String nombre
    String mail

    //diferenciar a usuario
    int tipo 
    /*
	0 publico
	1 colaborador
	2 investigador
	3 editor
	4 moderador
    */
 

    static constraints = {
    	cuenta(blank: false,size:3..15,unique:true)
        pass(blank: false,size:6..15, password:true, validator:{ val, obj ->
            if (obj.pass != obj.confirm)
                flash.message= "user.password.dontmatch"
        } )
        nombre(blank: false,size:2..45)
        mail(blank: false, email:true)
    }

    Usuario(String cuenta, String pass, String confirm, String nombre, String mail){
        this.dateCreated = new Date()
        this.lastUpdated = new Date()
        this.cuenta = cuenta
        this.pass = pass
        this.confirm = confirm
        this.nombre = nombre
        this.mail = mail
        this.tipo = 1 //por defecto se crea un usuario colaborador
    }

    int get_tipo()}{
    	return tipo
    }

    def actualizar_up (Date d) {
        this.lastUpdated = d
    }
    def subir_permiso(){
    	this.tipo = 2
    }
    def subir_editor(){
    	this.tipo = 3
    }
    int verificar_adm(){
    	return this.tipo == 4
    }
     def actualizar_pass(String pass){
        this.pass = pass
    }
}

