package com.shopflow.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Document(collection = "orders")
public class Order {

    @Id
    private String id;

    private String product;
    private Double total;
    private String status = "Pending";

    // Auto-set to today's date when order is created
    private LocalDate date = LocalDate.now();

    // Filled from the logged-in user automatically in the controller
    private String customerName;
    private String customerId;

    // ── Getters & Setters ─────────────────────────────────────────────────────

    public String getId()                     { return id; }
    public void setId(String id)              { this.id = id; }

    public String getProduct()              { return product; }
    public void setProduct(String product)  { this.product = product; }

    public Double getTotal()                { return total; }
    public void setTotal(Double total)      { this.total = total; }

    public String getStatus()               { return status; }
    public void setStatus(String status)    { this.status = status; }

    public LocalDate getDate()              { return date; }
    public void setDate(LocalDate date)     { this.date = date; }

    public String getCustomerName()                   { return customerName; }
    public void setCustomerName(String customerName)  { this.customerName = customerName; }

    public String getCustomerId()                     { return customerId; }
    public void setCustomerId(String customerId)      { this.customerId = customerId; }
}