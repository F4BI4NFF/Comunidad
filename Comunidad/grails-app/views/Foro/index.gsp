<g:render template = "encabezado"/>

<div class = "container">
	<div class = "row">
		<div class = "col-lg-4">
		<center>
		<h2>Bienvenido al Foro</h2>
		</center>
		</div>
		<div class = "col-lg-8">
			<div class = "well well-sm">
			<p><b>En este foro podrás iniciar temas de conversación con otros usuarios sobre cualquier tema relacionado con la exposición, música y arte.
			Si aún no tienes tu cuenta, no esperes más y participa junto al resto de los usuarios.</b></p>
			</div>
		</div>
	</div>

	<div class = "row">
		<div class = "col-lg-4">
		<center>
		<h3><i>Inicia un tema:</i></h3>
		<a href="#" class="btn btn-primary" role="button">Crear tema</a>
		</center>
		</div>
	</div>



	<hr>
	<div class = "row">
		<div class = "col-lg-1"></div>
		<div class = "col-lg-10">


			<table class = "table table-bordered">
				<thead>
					<th class = "col-lg-2">AUTOR</th>
					<th class = "col-lg-6">TÍTULO</th>
					<th class = "col-lg-2">COMENTARIOS</th>
					<th class = "col-lg-2">FECHA</th>
				</thead>
				<tbody> <!-- AQUI hace un g:each para poner cada entrada en la tabla -->
					<td>Pepe94</td>
					<td><a href="#">Mi primer post</a></td>
					<td>0</td>
					<td>12-04-2016</td>
				</tbody>
			</table>


		</div>

	</div>
</div>

<g:render template = "piepagina"/>
