<%@ page import="java.sql.*" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>CRUD Example</title>
</head>
<body>
    <h1>CRUD Example</h1>
    <table border="1">
        <tr>
            <th>Sr No.</th>
            <th>Name</th>
            <th>Contact</th>
            <th>Email</th>
            <th>Action</th>
        </tr>
        <% 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydada", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM data");
            while(rs.next()) {
        %>
        <tr>
            <td><%= rs.getInt("Sr_no") %></td>
            <td><%= rs.getString("Name") %></td>
            <td><%= rs.getString("Contact") %></td>
            <td><%= rs.getString("Email") %></td>
            <td>
                <a href="update.jsp?u=<%= rs.getInt("Sr_no") %>">Update</a> | 
                <a href="DeleteServlet?d=<%= rs.getInt("Sr_no") %>">Delete</a>
            </td>
        </tr>
        <% 
            }
            con.close();
        } catch(Exception e) {
            out.println("Error: " + e);
        }
        %>
    </table>
    <br>
    <a href="add.jsp">Add New Record</a>
</body>
</html>
