import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;
//import javax.servlet.*;
//import javax.servlet.http.*;
import java.sql.*;

public class UpdateServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        int srNo = Integer.parseInt(request.getParameter("srNo"));
        String name = request.getParameter("name");
        String contact = request.getParameter("contact");
        String email = request.getParameter("email");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mydata", "root", "");
            PreparedStatement pst = con.prepareStatement("UPDATE data SET Name=?, Contact=?, Email=? WHERE Sr_no=?");
            pst.setString(1, name);
            pst.setString(2, contact);
            pst.setString(3, email);
            pst.setInt(4, srNo);
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                out.println("Record updated successfully!");
            } else {
                out.println("Failed to update record!");
            }
            con.close();
        } catch (Exception e) {
            out.println("Error: " + e);
        }

        out.close();
    }
}
