package com.currencyexchangewithdatabase.currency_with_database.control;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
//import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currencyexchangewithdatabase.currency_with_database.model.ExchangeValue;
import com.currencyexchangewithdatabase.currency_with_database.repository.ExchangeRepo;

@RestController
public class ExchangeControl {
	@Autowired
	ExchangeRepo repo;
	@Autowired
	Environment env;
@GetMapping("/moneyexchange/from/{from}/to/{to}")
public ExchangeValue getExchangevalue(@PathVariable String from,@PathVariable String to) {
	//ExchangeValue exchange=	new ExchangeValue(100L,from, to,BigDecimal.valueOf(65));
	ExchangeValue exchange=repo.findByFromAndTo(from, to);
	exchange.setPort(Integer.valueOf(env.getProperty("local.server.port")));
	return exchange;
}
@GetMapping("/moneyexchange/from/{from}")
public ExchangeValue getExchangevalue(@PathVariable String from) {
	//ExchangeValue exchange=	new ExchangeValue(100L,from, to,BigDecimal.valueOf(65));
	ExchangeValue exchange=repo.findByFrom(from);
	exchange.setPort(Integer.valueOf(env.getProperty("local.server.port")));
	return exchange;
}
}
