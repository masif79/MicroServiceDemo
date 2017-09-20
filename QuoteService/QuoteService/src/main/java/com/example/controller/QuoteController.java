package com.example.controller;

import com.example.domain.Quote;
import com.example.service.QuoteService;
import com.example.service.external.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

/**
 * Created by aiqbal on 9/18/2017.
 */
@RestController
@RequestMapping
@Component
public class QuoteController {

    @Autowired
    ProductService productService;
    @Autowired
    QuoteService quoteService;

    @RequestMapping( value="/{quoteId}", method= RequestMethod.GET )
    public String getQuote(@PathVariable String quoteId ){
        System.out.println("getQuote: " + quoteId);
        Optional<Quote> quote = quoteService.getQuote( quoteId );
        if ( quote.isPresent() ){
            return quote.get().getId();
        }
        return null;
    }

    //@RequestMapping( value="/{product}/premium", method=RequestMethod.GET )
    @RequestMapping( value="/premium/{product}", method=RequestMethod.GET )
    public String calculateQuote( @PathVariable String product){

        System.out.println("calculateQuote: " + product);
        //calculate the premium for the incoming quote using the metadata
        Map prodData = productService.getProductMetadata(product);
        System.out.println("ProdData: " + prodData.get(product));

        //save quote
        Quote quote = quoteService.saveQuote( product, "v1", 1, null);

        //return stubbed data

        return quote.getProduct();
    }
}
