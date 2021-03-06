package com.peak.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.peak.beans.Coyote;

public class testServket extends HttpServlet {
	
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		
		
		/* Cr�ation et initialisation du message. */
		String paramAuteur = request.getParameter( "auteur" );
		String message = "Transmission de variables : OK ! " + paramAuteur;
			
		/* Cr�ation du bean */
		Coyote premierBean = new Coyote();
		/* Initialisation de ses propri�t�s */
		premierBean.setNom( "Coyote" );
		premierBean.setPrenom( "Wile E." );
			
		/* Stockage du message et du bean dans l'objet request */
		request.setAttribute( "test", message );
		request.setAttribute( "coyote", premierBean );
			
		/* Transmission de la paire d'objets request/response � notre JSP */
		this.getServletContext().getRequestDispatcher( "/WEB-INF/test.jsp" ).forward( request, response );
	}
	
	

}
