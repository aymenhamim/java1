package com.exemple;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/compteur")
public class ServletCompteur extends HttpServlet {
	private int compteur;
	
	@Override
	public void init() throws ServletException{
		compteur = 0;
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/plain	");
		PrintWriter out = res.getWriter();
		
		compteur++;
		out.println("depuis son chargement, on a accédé à cette Servlet: " +compteur +"fois.");
	}

}
