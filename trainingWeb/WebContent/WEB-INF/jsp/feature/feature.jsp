	<!-- Content -->
	<style>
		#sig-canvas {
		  border: 2px dotted #CCCCCC;
		  border-radius: 15px;
		  cursor: crosshair;}
		  
		.hide {display:none}
	</style>
	
<div class="container">

		<div class="row">
			<div class="col-md-12">
				<h1>E-Signature</h1>
				<p>Signez ci-dessous sans dépasser du cadre</p>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
		 		<canvas id="sig-canvas" width="620" height="160">
		 			Get a better browser, bro.
		 		</canvas>
		 	</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<button class="btn btn-primary" id="sig-submitBtn">Valider</button>
				<button class="btn btn-default" id="sig-clearBtn">Effacer</button>
			</div>
		</div>
		<br/>
		<div class="row hide">
			<div class="col-md-12">
				<textarea id="sig-dataUrl" class="form-control" rows="5">Data URL for your signature will go here!</textarea>
			</div>
		</div>
		<br/>
		<div class="row">
			<div class="col-md-12">
				<img id="sig-image" src="" alt="Votre signature est envoyé !"/>
			</div>
		</div>
		
			
	</div>