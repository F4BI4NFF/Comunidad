package comunidad

class Correo {
	String mail
	String nombre
	String gustos = "00000000000000000"  //codificacion de los gustos [0,0,0,0...]

    static constraints = {
    	mail(email:true,unique:true)
    	nombre(blank:false,size:3..45)
    	gustos(size:3..45)
    }

    Correo(String mail, String nombre, List gustos){ //para suscribir correo
    	this.mail = mail
    	this.nombre = nombre
    	/*gustos*/
        char[] gustos_array = this.gustos.toCharArray()
   
        if( "antropología" in gustos){
            gustos_array[0] = '1'
        }
        if( "patrimonio natural" in gustos){
            gustos_array[1] = '1'
        }
        if( "arqueología" in gustos){
            gustos_array[2] = '1'
        }
        if( "geografía" in gustos){
            gustos_array[3] = '1'
        }
        if( "patrimonio cultural" in gustos){
            gustos_array[4] = '1'
        }
        if( "arquitectura" in gustos){
            gustos_array[5] = '1'
        }
        if( "folklore" in gustos){
            gustos_array[6] = '1'
        }
        if( "cine/video" in gustos){
            gustos_array[7] = '1'
        }
        if( "fotografía" in gustos){
            gustos_array[8] = '1'
        }
        if( "música" in gustos){
            gustos_array[9] = '1'
        }
        if( "teatro" in gustos){
            gustos_array[10] = '1'
        }
        if( "artes gráficas" in gustos){
            gustos_array[11] = '1'
        }
        if( "colonias/inmigrantes" in gustos){
            gustos_array[12] = '1'
        }
        if( "cultura religiosa" in gustos){
            gustos_array[13] = '1'
        }
        if( "cultura cívica" in gustos){
            gustos_array[14] = '1'
        }
        if( "escrituras/monumentos" in gustos){
            gustos_array[15] = '1'
        }
        if( "espacios públicos" in gustos){
            gustos_array[16] = '1'
        }
        this.gustos = String.valueOf(gustos_array)   
    }

    void actualizar_gustos(List gustos){
    	set_gustos(gustos)
    }
    /*remove, eliminar correo*/

    void set_gustos(List gustos){
    	//String myName = "000"
		char[] gustos_array = this.gustos.toCharArray()
   
    	if( "antropología" in gustos){
    		gustos_array[0] = '1'
    	}
    	if( "patrimonio natural" in gustos){
    		gustos_array[1] = '1'
    	}
    	if( "arqueología" in gustos){
    		gustos_array[2] = '1'
    	}
    	if( "geografía" in gustos){
    		gustos_array[3] = '1'
    	}
    	if( "patrimonio cultural" in gustos){
    		gustos_array[4] = '1'
    	}
    	if( "arquitectura" in gustos){
    		gustos_array[5] = '1'
    	}
    	if( "folklore" in gustos){
    		gustos_array[6] = '1'
    	}
    	if( "cine/video" in gustos){
    		gustos_array[7] = '1'
    	}
    	if( "fotografía" in gustos){
    		gustos_array[8] = '1'
    	}
    	if( "música" in gustos){
    		gustos_array[9] = '1'
    	}
    	if( "teatro" in gustos){
    		gustos_array[10] = '1'
    	}
    	if( "artes gráficas" in gustos){
    		gustos_array[11] = '1'
    	}
    	if( "colonias/inmigrantes" in gustos){
    		gustos_array[12] = '1'
    	}
    	if( "cultura religiosa" in gustos){
    		gustos_array[13] = '1'
    	}
    	if( "cultura cívica" in gustos){
    		gustos_array[14] = '1'
    	}
    	if( "escrituras/monumentos" in gustos){
    		gustos_array[15] = '1'
    	}
    	if( "espacios públicos" in gustos){
    		gustos_array[16] = '1'
    	}
    	this.gustos = String.valueOf(gustos_array)   
    }
}
