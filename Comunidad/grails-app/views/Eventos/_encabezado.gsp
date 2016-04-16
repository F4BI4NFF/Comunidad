<!DOCTYPE html>
<html>
<head>
<meta name = "viewport" content = "width = device-width, initial-scale = 1">
<title>Comunidad Archivo de Música</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"></link>

<style>
.jumbotron{
	background-color: #2633C1;
	color: white;
}

.navbar{
	background-color: #2633C1;
	color: white;
}

.nav.navbar-nav li a{
	color: white;
}

.nav.navbar-nav ul{
	background-color: #2633C1;
}


</style>

</head>

<body>

<div class = "container">
	<div class = "row">
		<div class = "jumbotron">
			<div class = "pull-left">
			<asset:image src="logo_bn.jpg" style="width:180px;height:200px;"/>
			</div>
		<center>
		<asset:image src="banner.jpg" style="width:850px;height:200px;"/>
		</center>
		</div>
	</div>
</div>

<div class = "container">
	<div class = "pull-right">
	<a href = "#">Registrarse</a> |
	<a href = "#">Iniciar Sesión</a> |
	<a href = "#">Perfil</a>
	</div>
</div>

<div class = "container">
<nav class = "navbar navbar-default">

	<div class="container-fluid">



    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
      	<li><a href="/"><b>Hogar</b></a></li>
        <li><a href="/noticias/index"><b>Noticias</b></a></li>
        <li><a href="/eventos/index"><b>Eventos</b></a></li>
        <li><a href="/foro/index"><b>Foro</b></a></li>
        <li><a href="/contacto/index"><b>Contacto</b></a></li>

      </ul>
      <!-- navbar-left will move the search to the left -->
      <form class="navbar-form navbar-right" role="search">
        <label class="radio-inline"><input type="radio" name="optradio">Personas</label>
        <label class="radio-inline"><input type="radio" name="optradio">Documentos</label>
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Buscar">
        </div>
        <button type="submit" class="btn btn-default"><span class = "glyphicon glyphicon-search"></button>
      </form>
    </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->

</nav>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</body>

</html>
