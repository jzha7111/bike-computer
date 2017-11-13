<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html lang="en">
<head>

	<meta charset="utf-8">

	<title>Bike Computer</title>
<!--
Comila Template
http://www.templatemo.com/tm-490-comila
-->
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
		<%String speed = (String)session.getAttribute("speed"); %>
		<%String heart = (String)session.getAttribute("heart"); %>
		<%String destination = (String)session.getAttribute("destination"); %>
		<%String length = (String)session.getAttribute("length"); %>
		<%String calorie = (String)session.getAttribute("calorie"); %>
		<%String original = (String)session.getAttribute("original"); %>
		<%String cadence = (String)session.getAttribute("cadence"); %>
		<table>
 		 <tbody>
		    <tr>
      			<td><h2>Average Speed: <%=speed%></h2>
      				<br/>
      				<h2>Heart Rate: <%=heart%></h2>
      				<br/>
					<br/>
					<h2>Original: <%=original%></h2>
					<br/>
					<h2>Average Cadence: <%=cadence%></h2>
      			</td>
      			<td><img src="images/bike.png" /></td>
				<td><h2>Destination: <%=destination%></h2>
					<br/>
					<br/>
					<br/>
					<h2>Length:  <%=length%></h2>
					<br/>
     		        <h2>Calorie: <%=calorie%></h2>
     		    </td>
 		  	 </tr>
 		  </tbody>
 	  </table>
	</div>	
	
</section>



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