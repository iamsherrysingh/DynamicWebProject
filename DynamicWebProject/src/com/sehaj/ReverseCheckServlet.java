package com.sehaj;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReverseCheckServlet extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		StringBuilder i =new StringBuilder(req.getParameter("input1"));
		StringBuilder j =new StringBuilder(req.getParameter("input2"));
		PrintWriter out=res.getWriter();
		System.out.println(i.toString()+"    "+j.toString());
		if(i.toString().equals(j.reverse().toString()))
		{
			out.println("The strings ARE reverse of each other");
		}
		else
		{
			out.println("The strings are NOT reverse of each other");
		}
		System.out.println("Printing something to console");   //Printing to console

	}
}

