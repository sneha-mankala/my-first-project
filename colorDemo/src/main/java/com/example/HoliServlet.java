package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/playHoli")
public class HoliServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String[] colors = {"RED", "BLUE", "GREEN", "YELLOW", "PINK", "ORANGE", "PURPLE"};

        Random random = new Random();
        String color = colors[random.nextInt(colors.length)];

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Holi Color</title>");
        out.println("<style>");
        out.println("body{background:#0d1117;color:white;text-align:center;font-family:Arial;}");
        out.println(".box{margin-top:100px;padding:40px;border-radius:15px;border:2px solid cyan;width:400px;margin-left:auto;margin-right:auto;}");
        out.println(".color{font-size:40px;font-weight:bold;color:"+color.toLowerCase()+";}");
        out.println("button{padding:10px 20px;border-radius:20px;border:none;background:cyan;cursor:pointer;}");
        out.println("</style>");
        out.println("</head>");

        out.println("<body>");
        out.println("<h1>ACE Engg College</h1>");
        out.println("<div class='box'>");
        out.println("<h2>🎉Happy Holi!🎉</h2>");
        out.println("<p>Your color for today is:</p>");
        out.println("<div class='color'>" + color + "</div>");
        out.println("<br>");
        out.println("<a href='playHoli'><button>Play Again</button></a>");
        out.println("</div>");
        out.println("</body>");

        out.println("</html>");
    }
}