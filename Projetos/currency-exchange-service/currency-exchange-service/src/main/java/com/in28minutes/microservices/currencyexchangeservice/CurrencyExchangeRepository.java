package com.in28minutes.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

//NoJpaRepository, eu passo duas coisas, a primeira é a entidade a ser gerenciada automaticamente e a
//segunda é o tipo da primary key, que no caso é Long
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
    CurrencyExchange findByFromAndTo(String from, String to);
}
