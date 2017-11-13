<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html lang="en">
<head>

	<meta charset="utf-8">

	<title>Bike Computer</title>

	<meta http-equiv="X-UA-Compatible" content="IE=Edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="keywords" content="">
	<meta name="description" content="">

	<!-- stylesheets css -->
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/animate.min.css">

  	<link rel="stylesheet" href="css/et-line-font.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">

  	<link rel="stylesheet" href="css/vegas.min.css">
	<link rel="stylesheet" href="css/style.css">

	<link href='https://fonts.googleapis.com/css?family=Rajdhani:400,500,700' rel='stylesheet' type='text/css'>

</head>
<body>

<!-- preloader section -->
<section class="preloader">
	<div class="sk-circle">
       <div class="sk-circle1 sk-child"></div>
       <div class="sk-circle2 sk-child"></div>
       <div class="sk-circle3 sk-child"></div>
       <div class="sk-circle4 sk-child"></div>
       <div class="sk-circle5 sk-child"></div>
       <div class="sk-circle6 sk-child"></div>
      <div class="sk-circle7 sk-child"></div>
       <div class="sk-circle8 sk-child"></div>
       <div class="sk-circle9 sk-child"></div>
       <div class="sk-circle10 sk-child"></div>
       <div class="sk-circle11 sk-child"></div>
       <div class="sk-circle12 sk-child"></div>
     </div>
</section>

<!-- home section -->
<section id="home">
	<div class="container">
		<div class="row">

			<div class="col-md-offset-2 col-md-8 col-sm-12">
				<div class="home-thumb">
					<h1 class="wow fadeInUp" data-wow-delay="0.4s">WELCOME BIKE COMPUTER</h1>
          			<h3 class="wow fadeInUp" data-wow-delay="0.6s">LET's START OUR TRIP</h3>
          			<a href="#" data-toggle="modal" data-target="#login"class="btn btn-lg btn-default smoothScroll wow fadeInUp hidden-xs" data-wow-delay="0.8s">Login</a>
        			<a href="#" data-toggle="modal" data-target="#register" class="btn btn-lg btn-success smoothScroll wow fadeInUp" data-wow-delay="1.0s">Register</a>
				</div>
			</div>

		</div>
	</div>		
</section>

<!-- login -->
<div class="modal fade" id="login" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
      <div class="modal-content modal-popup">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
          <h2 class="modal-title">Loginr</h2>
        </div>
        <form action="./login" method="post">
          <input name="userName" type="text" class="form-control" id="userName" placeholder="User Name">
          <input name="password" type="text" class="form-control" id="password" placeholder="Password">
          <input name="submit" type="submit" class="form-control" id="submit" value="Start Now">
        </form>
      </div>
  </div>
</div>

<!-- register -->
<div class="modal fade" id="register" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
      <div class="modal-content modal-popup">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
          <h2 class="modal-title">Register</h2>
        </div>
        <form action="./register" method="post">
          <input name="username" type="text" class="form-control" id="username" placeholder="User Name">
          <input name="password" type="text" class="form-control" id="password" placeholder="Password">
		  <input name="passworda" type="text" class="form-control" id="passworda" placeholder="Password again">
		  <input name="gender" type="text" class="form-control" id="gender" placeholder="Gender">
		  <input name="height" type="text" class="form-control" id="height" placeholder="Height">
		  <input name="weight" type="text" class="form-control" id="weight" placeholder="Weight">
		  <input name="age" type="text" class="form-control" id="age" placeholder="Age">
		  <input name="occupation" type="text" class="form-control" id="occupation" placeholder="Occupation">
          <input name="submit" type="submit" class="form-control" id="RegisterSubmit" value="Start Now">
        </form>
        
      </div>
  </div>
</div>


<!-- Back top -->
<a href="#back-top" class="go-top"><i class="fa fa-angle-up"></i></a>

<!-- javscript js -->
<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>

<script src="js/vegas.min.js"></script>

<script src="js/wow.min.js"></script>
<script src="js/smoothscroll.js"></script>
<script src="js/custom.js"></script>

</body>
</html>