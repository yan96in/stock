package com.yan96in.stock.news.bean;

import java.util.List;

import org.springframework.stereotype.Component;

import com.yan96in.stock.trading.bean.StockBean;
@Component
public class NewsBean {
	//新闻id
	private String newsId;
	//新闻标题
	private String newsTitle;
	//新闻类型.1表示要闻,2表示7*24实时
	private int newsType;
	//新闻来源
	private String newsSource;
	//相关股票
	private List<StockBean> relativeStocks;
	//新闻内容
	private String newsContent;
}
