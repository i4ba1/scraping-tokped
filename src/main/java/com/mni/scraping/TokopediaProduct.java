package com.mni.scraping;

public class TokopediaProduct {
    private String productName;
    private String productDescription;
    private String productImageSrc;
    private Integer productPrice;

    public TokopediaProduct(){

    }

    public TokopediaProduct(String productName, String productDescription, String productImageSrc, Integer productPrice) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productImageSrc = productImageSrc;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductImageSrc() {
        return productImageSrc;
    }

    public void setProductImageSrc(String productImageSrc) {
        this.productImageSrc = productImageSrc;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }
}
