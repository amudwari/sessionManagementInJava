<!DOCTYPE html>
<html>
<head>
<title>enter success</title>

 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>

<body>
<header style="height: 30px;background-color: yellow;">
</header>
<div class= "container">
<hr/>

           <p>Success!! Data has been Successfully entered! </p>            
  
  <table class="table">
 	 <thead>
  	   <tr>
        <th>Email</th>
        <th>Password</th>
        <th>Name</th>
        <th>Phone</th>
        <th>Address</th>
        
      </tr>
    </thead>

		<tbody>
		<tr> 
           <td> ${data.email}</td>
            <td> ${data.password}</td>
              <td> ${data.name}</td>
               <td> ${data.phone}</td>
                <td> ${data.address}</td>

         </tr>    
	</tbody>
	</table>
</div>

</body>
</html>