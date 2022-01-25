package fr.formation.inti.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Servlet implementation class ForwordExampleServlet
 */
@WebServlet(urlPatterns = {"/forword","/param"}, initParams = {@WebInitParam(name = "driver",value ="com.jdbc.coucou")})
public class ForwordExampleServlet extends HttpServlet {
	
	private static final Log log = LogFactory.getLog(ForwordExampleServlet.class);
	
	private String driver;
	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForwordExampleServlet() {
        super();
        log.info("-----------------> new ForwordExampleServlet");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		log.info("-----------------> new init");
		driver = config.getInitParameter("driver");
		log.info("-----------------> param driver : "+driver);
	}
	

	/**
//	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	}
	
//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		super.service(req, res);
//		HttpServletRequest request = (HttpServletRequest) req;
//		log.info("-----------------> Methode service "+request.getMethod());
//	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.info("-----------------> doGet");
		String forword = request.getParameter("f");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/"+forword);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
