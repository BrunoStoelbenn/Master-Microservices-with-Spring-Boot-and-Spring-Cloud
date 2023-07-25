package com.in28minutes.microservices.currencyexchangeservice;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.math.BigDecimal;

@Entity
public class CurrencyExchange {

    @Id
    private Long id;
    @Column(name = "currency_from")
    private String from;

    @Column(name = "currency_to")
    private String to;

    private BigDecimal conversionMultiple;

    private String environment;

    public CurrencyExchange() {

    }

    public CurrencyExchange(Long id, String from, String to, BigDecimal conversionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getFrom(){
        return this.from;
    }

    public void setFrom(String from){
        this.from = from;
    }

    public String getTo(){
        return this.to;
    }

    public void setTo(String to){
        this.to = to;
    }

    public BigDecimal getConversionMultiple(){
        return this.conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple){
        this.conversionMultiple = conversionMultiple;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}