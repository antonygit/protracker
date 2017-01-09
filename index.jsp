<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script>

$(document).ready(function() {
	$(".b").click(function() {	
		
		var id=$(this).val();
		$.ajax({
			type: "POST",
			url: 'Servlet1',
			data:"id="+id,
			success: function (res) {
				var val=res.split("$");
				$("#roll").val(val[0]);
				$("#name").val(val[1]);
				$("#email").val(val[2]);
			 
			},
			
    });
		

	});
});

 
 


</script>
</head>
<body>
<button class="b" value="1">1</button>
<button class="b" value="2">2</button>
<button class="b"  value="3">3</button>
<button class="b"  value="4">4</button>
<button class="b"  value="5">5</button>
<button class="b"  value="6">6</button>
<button class="b"  value="7">7</button>
<input type="text" id="roll">
<input type="text" id="name">
<input type="text" id="email">




</body>
</html>