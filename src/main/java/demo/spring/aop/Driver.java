package demo.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.spring.aop.service.StockQuoteService;


/**
 * Main class to run example
 * */
public class Driver {

	private static final String CONFIG_PATH = "classpath*:app-context.xml";

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_PATH);
		
		StockQuoteService stockQuoteService = (StockQuoteService) context.getBean("stockQuoteService");
		System.out.println("Quote for IBM: "+ stockQuoteService.getStockQuote("IBM"));
		

	}

}
