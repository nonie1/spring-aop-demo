package demo.spring.aop.service;

import demo.spring.aop.dao.StockQuoteDao;

/**
 * Sample stock quote service
 * */
public class StockQuoteService {
	
	private StockQuoteDao stockQuoteDao;
	
	public Double getStockQuote(String ticker)
	{
		return stockQuoteDao.getStockQuote(ticker);
	}
	

	public StockQuoteDao getStockQuoteDao() {
		return stockQuoteDao;
	}

	public void setStockQuoteDao(StockQuoteDao stockQuoteDao) {
		this.stockQuoteDao = stockQuoteDao;
	}
	
	
	

}
