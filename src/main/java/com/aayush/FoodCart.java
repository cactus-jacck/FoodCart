package com.aayush;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/food-cart")
public class FoodCart extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		//get the data from database (model)
		List<Food> foodList = new ArrayList<>();
		foodList = FoodCartDbUtil.getFoodList();
		req.setAttribute("foodItems", foodList);
//        String[] foodItems = {"biryani", "nihari", "rohu"};
//        req.setAttribute("foodItems", foodItems);

        //redirect to a different page (view)
        RequestDispatcher rd = req.getRequestDispatcher("show-food.jsp");
        rd.forward(req,res);

	}

}
