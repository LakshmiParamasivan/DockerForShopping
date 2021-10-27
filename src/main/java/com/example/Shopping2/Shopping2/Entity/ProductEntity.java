package com.example.Shopping2.Shopping2.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ProductsDetails")

public class ProductEntity {


        @Id
        @Column(name="prodId")
        int prodId;

        @Column(name="prod_Shp_Id")
        int prodShpId;

        @Column(name="prodName")
        String prodName;
        @Column(name="prodPrice")
        int prodPrice;
        @Column(name="prodQuantity")
        int quantity;
//
//    @ManyToOne(cascade = CascadeType.ALL)
////    @JoinColumn(name = "customerId")
//    private BuyerEntity buyerEntity;


    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="shpId")
    private Set<SellerEntity> sellerEntities;




        public ProductEntity() {
        }


        public String getProdName() {
            return prodName;
        }

        public void setProdName(String prodName) {
            this.prodName = prodName;
        }

        public int getProdPrice() {
            return prodPrice;
        }

        public void setProdPrice(int prodPrice) {
            this.prodPrice = prodPrice;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public ProductEntity(String prodName, int prodPrice, int quantity, int prodId) {
            this.prodName = prodName;
            this.prodPrice = prodPrice;
            this.quantity = quantity;
            this.prodId = prodId;
        }

        public int getProdId() {
            return prodId;
        }

        public void setProdId(int prodId) {
            this.prodId = prodId;
        }

    public Set<SellerEntity> getSellerEntities() {
        return sellerEntities;
    }
    public void setSellerEntities(java.util.Set<SellerEntity> sellerEntities) {
        this.sellerEntities = sellerEntities;
    }

    public int getProdShpId() {
        return prodShpId;
    }

    public void setProdShpId(int prodShpId) {
        this.prodShpId = prodShpId;
    }
//    public BuyerEntity getBuyerEntity() {
//        return buyerEntity;
//    }
//    public void setBuyerEntity(BuyerEntity buyerEntity) {
//        this.buyerEntity = buyerEntity;
//    }

    }


