<g:render template = "encabezado"/>
<div class = "container">

    <h2> <div align = "center" > La busqueda seleccionada tuvo las siguientes </div></h2>

    <hr>
        <div class = "container">
            <h4>Personas encontradas en Arpa: </h4>
        </div>
        <g:each in="${datos}" var="dato">
            <div class = "container">
                ${raw(dato)}
            </div>
        </g:each>
    <hr>
        <div class = "container">
            <h4>Elementos encontrados en Memoria chilena: </h4>
        </div>
    <hr>
        <div class = "container">
            <h4>Elementos encontrados en Descubre.BibliotecaNacional: </h4>
        </div>
    <hr>
        <div class = "container">
            <h4>Elementos encontrados en Musica Popular: </h4>
        </div>
        <g:each in="${datos2}" var="dato">
            <div class = "container">
                ${raw(dato)}
            </div>
        </g:each>

</div>
<g:render template = "piepagina"/>
