package com.example.service;

import com.example.domain.Quote;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

/**
 * Created by aiqbal on 9/18/2017.
 */
@Service
public class QuoteService {

    public Optional<Quote> getQuote(String quoteId ){

        final Quote quote = new Quote();
        quote.setId(quoteId);
        return Optional.of(quote);
    }

    public Quote saveQuote( String product, String productVersion, Integer productId, Map<String, Object> doc ){

        Quote quote = new Quote();
        quote.setProduct(product);
        System.out.println("Quote saved");
        return quote;
    }
}
