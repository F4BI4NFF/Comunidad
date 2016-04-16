<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'Scrapp.label', default: 'Scrapp')}" />
        <title><g:message code="Scrapping Facebook" args="[entityName]" /></title>
    </head>
    <body>
    <h2> <div align = "center" >Todo los datos extraidos de FAcebook </div></h2>

    <hr>
        <div class = "container">
            ${datos}
            <g:each in="${datos}" var="a">
                <div class = "row">
                    ${a} <- con una referencia despues
                </div>
            </g:each>
        </div>

    </body>
</html>