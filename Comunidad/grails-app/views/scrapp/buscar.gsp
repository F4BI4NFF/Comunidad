<g:render template = "encabezado"/>
<div class = "container">

    <h2> <div align = "center" > La busqueda seleccionada tuvo las siguientes </div></h2>
    Algunos de los resultados presentados en la pagina son los siguientes. Para una búsqueda mas precisa conecte al sitio original.
    <hr>
        <div class = "container">
            <h4>Personas encontradas en <a href="http://arpa.ucv.cl/">Arpa</a>:  </h4>
        </div>
        <g:each in="${datos}" var="dato">
            <div class = "container">
                ${raw(dato)}
            </div>
        </g:each>
    <hr>
        <div class = "container">
            <h4>Elementos encontrados en <a href="http://www.memoriachilena.cl/602/w3-channel.html">Memoria chilena</a>: </h4>
        </div>
    <hr>
        <div class = "container">
            <h4>Elementos encontrados en <a href ="http://www.descubre.bibliotecanacional.cl/">Descubre.BibliotecaNacional</a>: </h4>
        </div>
    <hr>
        <div class = "container">
            <h4>Elementos encontrados en <a href="http://www.musicapopular.cl/">Musica Popular</a>: </h4>
        </div>
        <g:each in="${datos2}" var="dato">
            <div class = "container">
                ${raw(dato)}
            </div>
        </g:each>
        <div class = "container">
            <h4>Elementos encontrados en <a href="http://www.difusion.musicachilena.cl/">Musica Chilena</a>: </h4>
        </div>
        <g:each in="${datos3}" var="dato">
            <div class = "container">
                ${raw(dato)}
            </div>
        </g:each>

</div>
<g:render template = "piepagina"/>
