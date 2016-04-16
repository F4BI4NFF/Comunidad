<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'Seccion.label', default: 'Seccion')}" />
        <title><g:message code="default.create.label" args="[entityName]" /></title>
    </head>
    <body>
    <h2> <div align = "center" >Todas las personas integradas a nuestro sistema </div></h2>

    <hr>

        <div class = "container">
            <g:each in="${nombres}" var="nombre">
                <div class = "row">
                    ${nombre} <- con una referencia despues
                </div>
            </g:each>
        </div>

    </body>
</html>
