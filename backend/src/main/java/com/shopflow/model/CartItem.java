package com.shopflow.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cart_items")
public class CartItem {

    @Id
    private String id;

    private String customerId;
    private String productId;
    private String productName;
    private Double price;
    private Integer quantity;

    // ── Getters & Setters ──────────────────────────────────────────────────────

    public String getId()                       { return id; }
    public void setId(String id)                { this.id = id; }

    public String getCustomerId()                     { return customerId; }
    public void setCustomerId(String customerId)      { this.customerId = customerId; }

    public String getProductId()                { return productId; }
    public void setProductId(String productId)  { this.productId = productId; }

    public String getProductName()                    { return productName; }
    public void setProductName(String productName)    { this.productName = productName; }

    public Double getPrice()                  { return price; }
    public void setPrice(Double price)        { this.price = price; }

    public Integer getQuantity()                  { return quantity; }
    public void setQuantity(Integer quantity)      { this.quantity = quantity; }
}

