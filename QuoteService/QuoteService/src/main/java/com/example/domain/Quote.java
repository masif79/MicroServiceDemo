package com.example.domain;

import java.util.Map;

/**
 * Created by aiqbal on 9/18/2017.
 */
public class Quote {

    private String id;
    private String product;
    private String productVersion;
    private Integer productId;
    private Map<String, Object> document;

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getProduct() {

        return product;
    }

    public void setProduct(String product) {

        this.product = product;
    }

    public String getProductVersion() {

        return productVersion;
    }

    public void setProductVersion(String productVersion) {

        this.productVersion = productVersion;
    }

    public Integer getProductId() {

        return productId;
    }

    public void setProductId(Integer productId) {

        this.productId = productId;
    }

    public Map<String, Object> getDocument() {

        return document;
    }

    public void setDocument(Map<String, Object> document) {

        this.document = document;
    }
}
