package jp.itacademy.samples.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class PreparingGoodsListener
 *
 */
@WebListener
public class PreparingGoodsListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public PreparingGoodsListener() {
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent e) {
    	
    	List<Goods> goods = new ArrayList<>();
    	
    	goods.add(new Goods(1001, "�₭����", 8, 10));
    	goods.add(new Goods(1002, "�ǂ���������", 10, 5));
     	goods.add(new Goods(1003, "��������", 20, 30));
    	goods.add(new Goods(1004, "�܂񂰂���", 30, 0));
     	goods.add(new Goods(1005, "��������ׂ�", 4980000, 1));
     	
     	ServletContext context = e.getServletContext();
     	context.setAttribute("goods", goods);
    	
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent e) {
    	
    	ServletContext context = e.getServletContext();
    	context.removeAttribute("books");
    	
    }
	
}
