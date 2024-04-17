<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Add New Record</title>
</head>
<body>
    <h1>Add New Record</h1>
    <form action="AddServlet" method="post">
        Name: <input type="text" name="name"><br>
        Contact: <input type="text" name="contact"><br>
        Email: <input type="text" name="email"><br>
        <input type="submit" value="Submit">
    </form>
    <br>
    <a href="index.jsp">Back to Home</a>
</body>
</html>
