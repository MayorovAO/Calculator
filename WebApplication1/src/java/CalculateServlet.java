/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Milkey
 */
@WebServlet(urlPatterns = {"/CalculateServlet"})
public class CalculateServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        String result ="";
        String n1 = request.getParameter("no1");
        String n2 = request.getParameter("no2");
        String opt = request.getParameter("opt");
        switch(opt){
            case "p" :{
            result += (Double.parseDouble(n1) + Double.parseDouble(n2));
            break;
            }
            case "m" :{
            result += Double.parseDouble(n1) - Double.parseDouble(n2);
            break;
            }
            case "mul" :{
             result += Double.parseDouble(n1) * Double.parseDouble(n2);
            break;
            }
            case "d" :{
                if(Double.parseDouble(n2)!=0){
                 result += Double.parseDouble(n1) / Double.parseDouble(n2);
                }
                else{
                    result = "division by 0";
                }
            }
        }
        session.setAttribute("result", result);
        RequestDispatcher reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/Index.jsp");
        reqDispatcher.forward(request,response);
        
    }
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        doPost(request,response);
    }
}
