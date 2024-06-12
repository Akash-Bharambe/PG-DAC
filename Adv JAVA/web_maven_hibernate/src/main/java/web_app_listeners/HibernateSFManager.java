package web_app_listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import utils.HibernateUtils;

/**
 * Application Lifecycle Listener implementation class HibernateSFManager
 *
 */
@WebListener
public class HibernateSFManager implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public HibernateSFManager() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
    	 System.out.println("in ctx destroyed");
         HibernateUtils.getFactory().close();//SF : close , DBCP cleaned up !
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         System.out.println("in ctx inited");
         HibernateUtils.getFactory();//static init block : hib up n running
    }
	
}
