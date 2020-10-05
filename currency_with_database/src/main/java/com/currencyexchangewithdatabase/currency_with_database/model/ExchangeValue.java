package com.currencyexchangewithdatabase.currency_with_database.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="exchange_value")
public class ExchangeValue {
	@Id
	@Column(name="exid")
	private Long id;
	
	@Column(name="exfrom")
	private String from;
	
	@Column(name="exto")
	private String to;
	
	@Column(name="exconvert")
	private BigDecimal convert;
	
	@Column(name="excport")
	private Integer port;
	
	public ExchangeValue() {
		// TODO Auto-generated constructor stub
	}
	public ExchangeValue(Long id, String from, String to, BigDecimal cnovert) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.convert = cnovert;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConvert() {
		return convert;
	}
	public void setConvert(BigDecimal convert) {
		this.convert = convert;
	}
	public int getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}

}
