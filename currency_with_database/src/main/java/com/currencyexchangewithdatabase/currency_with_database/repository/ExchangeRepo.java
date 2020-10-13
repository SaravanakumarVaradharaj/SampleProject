package com.currencyexchangewithdatabase.currency_with_database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.currencyexchangewithdatabase.currency_with_database.model.ExchangeValue;

public interface ExchangeRepo extends JpaRepository<ExchangeValue,Long>{
	ExchangeValue findByFromAndTo(String from,String to);
	ExchangeValue findByFrom(String from);
}
