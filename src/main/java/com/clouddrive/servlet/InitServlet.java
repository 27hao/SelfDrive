package com.clouddrive.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.clouddrive.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 * Servlet implementation class InitServlet
 */
@WebServlet(value = "/InitServlet",loadOnStartup = 1)
public class InitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	private ApplicationContext applicationContext;
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		BaseDao.setApplicationContext(applicationContext);
	}

}
