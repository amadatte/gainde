package sn.douane.gainde.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends javax.servlet.http.HttpServlet implements
		javax.servlet.Servlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Projet Maven la centrale-web : Servlet Lancée");
		out.flush();
		out.close();
	}
}