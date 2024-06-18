<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add New Record</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h1>Add New Record</h1>
    
    <form action="AddServlet" method="post">
        Name: <input type="text" name="name"><br><br>
        Contact: <input type="text" name="contact"><br><br>
        Email: <input type="text" name="email"><br><br>
        <input type="submit" value="Submit" id="sub">
    </form>
    <br>
    <a href="index.jsp">Back to Home</a>
</body>
</html>
