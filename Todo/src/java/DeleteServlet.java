import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.*;


public class DeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        int srNo = Integer.parseInt(request.getParameter("d"));

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydada", "root", "");
            PreparedStatement pst = con.prepareStatement("DELETE FROM data WHERE Sr_no=?");
            pst.setInt(1, srNo);
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                out.println("Record deleted successfully!");
            } else {
                out.println("Failed to delete record!");
            }
            con.close();
        } catch (Exception e) {
            out.println("Error: " + e);
        } finally {
            out.close();
        }
    }
}
