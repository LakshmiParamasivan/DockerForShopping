package com.example.Shopping2.Shopping2.Entity;

import javax.persistence.*;

@Entity
@Table(name="Order_Details")
public class OrderEntity {
    @Id
    @Column(name="Order_Id")
    private int orderId;

    @Column(name="Cart_Id")
    private int cartId;

    @Column(name = "Product_Name")
    private String productName;

    @Column(name = "Product_Price")
    private float productPrice;

    @Column(name="ProductQuantity")
    private float productQuantity;

    @Column(name = "Total_Amount")
    private float totalAmount;

    @Column(name="Customer_Address")
    private String customerAddress;

    @OneToOne(cascade = CascadeType.ALL)
    private CartEntity cartEntity;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public float getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(float productQuantity) {
        this.productQuantity = productQuantity;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public CartEntity getCartEntity() {
        return cartEntity;
    }

    public void setCartEntity(CartEntity cartEntity) {
        this.cartEntity = cartEntity;
    }
}
