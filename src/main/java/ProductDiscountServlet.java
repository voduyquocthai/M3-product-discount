import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.DatagramPacket;

@WebServlet(name = "ProductDiscountServlet", urlPatterns = "/productDiscount")
public class ProductDiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String description = request.getParameter("description");
        double price = Double.parseDouble(request.getParameter("list_price"));
        double discountPercent = Double.parseDouble(request.getParameter("discount_percent"));
        double discountAmount = price * discountPercent / 100;
        double discountPrice = price - discountAmount;

        PrintWriter writer = response.getWriter();

        writer.println("<html>");

        writer.println("<h2>" + "Product's Description: " + description + "</h2>");
        writer.println("<h2>" + "Discount Amount: " + discountAmount + "</h2>");
        writer.println("<h2>" + "Discounted Price: " + discountPrice + "</h2>");

        writer.println("</html>");

    }
}
