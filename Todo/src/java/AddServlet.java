import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;
//import javax.servlet.*;
//import javax.servlet.http.*;
import java.sql.*;

public class AddServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("name");
        String contact = request.getParameter("contact");
        String email = request.getParameter("email");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mydata", "root", "");
            PreparedStatement pst = con.prepareStatement("INSERT INTO data(Name, Contact, Email) VALUES (?, ?, ?)");
            pst.setString(1, name);
            pst.setString(2, contact);
            pst.setString(3, email);
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                out.println("Record added successfully!");
            } else {
                out.println("Failed to add record!");
            }
            con.close();
        } catch (Exception e) {
            out.println("Error: " + e);
        }

        out.close();
    }
}
