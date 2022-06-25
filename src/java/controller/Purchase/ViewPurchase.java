/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Purchase;


import dao.GameDao;
import dao.ProductDao;
import dao.UserDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.Game;
import modal.Product;
import modal.User;

/**
 *
 * @author LENNOVO
 */
@WebServlet(name = "ViewPurchase", urlPatterns = {"/viewpurchase"})
public class ViewPurchase extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProductDao dbProduct = new ProductDao();
        GameDao dbGame = new GameDao();
        UserDao dbUser = new UserDao();
        ArrayList<Product> p = dbProduct.getProduct();
        ArrayList<Game> g = dbGame.listGame();
        ArrayList<User> u = dbUser.getAllUser();
        request.setAttribute("u", u);
        request.setAttribute("p", p);
        request.setAttribute("g", g);
        request.getRequestDispatcher("/view/Purchase/Purchase.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String raw_id = request.getParameter("productID");

        int id = Integer.parseInt(raw_id);
        ProductDao dbProduct = new ProductDao();
        Product p = dbProduct.getProductById(id);
        PrintWriter out = response.getWriter();
        System.out.println(id);
        out.print("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n"
                + "            <div class=\"modal-dialog\">\n"
                + "                <div class=\"modal-content\">\n"
                + "                    <div class=\"modal-header\">\n"
                + "                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Detail Information Of Product</h5>\n"
                + "                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n"
                + "                    </div>\n"
                + "                    <div class=\"modal-body\" >\n"
                + "                        <div class=\"nameProductdetail\" >\n"
                + "                            <p>"+p.getName()+"</p>\n"
                + "                            <p style=\"color: gray; font-size: 10px;\" >"+p.getTime()+"</p>\n"
                + "                        </div>\n"
                + "                        <div class=\"description-product\" style=\"border: 1px solid #000000;\">\n"
                + "                            <p>"+p.getDescription()+"</p>\n"
                + "                            <p>"+p.getPrice()+"$</p>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                    <div class=\"modal-footer\">\n"
                + "                        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\n"
                + "                        <button type=\"button\" class=\"btn btn-primary\">Contact</button>\n"
                + "                    </div>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "        </div>");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
