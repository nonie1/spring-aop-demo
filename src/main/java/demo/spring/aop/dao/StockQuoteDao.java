package demo.spring.aop.dao;

import java.util.Random;

/**
 * Sample stock quote service
 * */
public class StockQuoteDao {
	
	
	public Double getStockQuote(String ticker)
	{
		
		Random r = new Random();
		System.out.println("Generating quote for : "+ticker);
		return r.nextDouble();
		
	}

}
