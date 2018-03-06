package com.yan96in.stock.trading.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yan96in.stock.trading.bean.StockBean;
@RestController
public class TradingController {
	@Autowired
	private StockBean stock;
	@RequestMapping("/trading")
	public String trading() {
		return "trading page. to be coming ...";
	}
}
