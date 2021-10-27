package com.example.Shopping2.Shopping2.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "SellerDetails")
public class SellerEntity {



        @Id
        @Column(name="shpId")
        private long shpId;
        @Column(name="shipperName")
        private String shipperName;
        @Column(name="shipperAddress")
        private String shipperAddress;

    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "sellerEntities")
    private Set<ProductEntity> productEntityList;

        public SellerEntity() {
        }

        public long getShpId() {
            return shpId;
        }

        public void setShpId(long shpId) {
            this.shpId = shpId;
        }

        public String getShipperName() {
            return shipperName;
        }

        public void setShipperName(String shipperName) {
            this.shipperName = shipperName;
        }

        public String getShipperAddress() {
            return shipperAddress;
        }

        public void setShipperAddress(String shipperAddress) {
            this.shipperAddress = shipperAddress;
        }

    public Set<ProductEntity> getProductEntityList() {
        return productEntityList;
    }

    public void setProductEntityList(Set<ProductEntity> productEntityList) {
        this.productEntityList = productEntityList;
    }
}


