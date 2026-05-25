package com.shopflow.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {

    @Id
    private String id;

    private String  name;
    private String  category;
    private Double  price;
    private Integer stock;
    private String  emoji;
    private String  description;

    // ── Getters & Setters ──────────────────────────────────────────────────────

    public String getId()                   { return id; }
    public void setId(String id)            { this.id = id; }

    public String getName()               { return name; }
    public void setName(String name)      { this.name = name; }

    public String getCategory()               { return category; }
    public void setCategory(String category)  { this.category = category; }

    public Double getPrice()              { return price; }
    public void setPrice(Double price)    { this.price = price; }

    public Integer getStock()             { return stock; }
    public void setStock(Integer stock)   { this.stock = stock; }

    public String getEmoji()              { return emoji; }
    public void setEmoji(String emoji)    { this.emoji = emoji; }

    public String getDescription()                  { return description; }
    public void setDescription(String description)  { this.description = description; }
}
