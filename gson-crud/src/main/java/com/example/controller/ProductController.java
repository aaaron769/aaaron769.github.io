package com.example.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.dao.ProductDAO;
import com.example.model.Product;
import com.google.gson.Gson;

/**
 * Servlet implementation class ProductController
 */
@WebServlet({"/product", ""})
public class ProductController extends HttpServlet {
//    we have a static constant here
    private static final long serialVersionUID = 1L;
// this is the declaring the productDao type dao
    private ProductDAO dao;
    // I don't know about this
    Gson mapper = new Gson();
//initialize are the first method to be called durting the first
//    request came to berowseer ]    we are instanciate the ProductDAO object;
    @Override
    public void init() throws ServletException {
        dao = new ProductDAO();
    }
// the service method doGet will accept the HttpServletRequest and HttpServlet Response
    /**
     * @param request  the request from the client
     * @param response the response send to back to client
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("products", dao.getAllProducts()); // binding the data to product variable and show up in client
        RequestDispatcher view = request.getRequestDispatcher("product.jsp"); // forwarding to product.jsp our binded data
        view.forward(request, response);// forwarded request and response
    }

    /**
     * @param request the response
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String jsonSting = request.getParameter("prd");// getting the parameter called product
        // creating product from the request
        Product product = mapper.fromJson(jsonSting, Product.class);


        // we are giving id to new product which is thee map size+1 in the Product deo
        product.setId(dao.genId());
        //---------In here we are adding the product to productDAO------------,
        // in Product Dao into the map which has key id (size of map +1) and value the product object,
        dao.addProduct(product);
        // we are printing the product to the view as the form of Json.
        PrintWriter out = response.getWriter();
        out.print(mapper.toJson(product));
    }

}
