<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Update Record</title>
</head>
<body>
    <h1>Update Record</h1>
    <%
    int srNo = Integer.parseInt(request.getParameter("u"));
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mydata", "root", "");
        PreparedStatement pst = con.prepareStatement("SELECT * FROM data WHERE Sr_no=?");
        pst.setInt(1, srNo);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
    %>
    <form action="UpdateServlet" method="post">
        <input type="hidden" name="srNo" value="<%= rs.getInt("Sr_no") %>">
        Name: <input type="text" name="name" value="<%= rs.getString("Name") %>"><br>
        Contact: <input type="text" name="contact" value="<%= rs.getString("Contact") %>"><br>
        Email: <input type="text" name="email" value="<%= rs.getString("Email") %>"><br>
        <input type="submit" value="Update">
    </form>
    <% 
        }
        con.close();
    } catch(Exception e) {
        out.println("Error: " + e);
    }
    %>
    <br>
    <a href="index.jsp">Back to Home</a>
</body>
</html>
