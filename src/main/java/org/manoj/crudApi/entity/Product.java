package org.manoj.crudApi.entity;

import jakarta.persistence.*;

@Entity
@Table(name="PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "PID")
    private String productId;

    @Column(name = "PNAME")
    private String productName;

    @Column(name = "PTYPE")
    private String productType;

    @Column(name = "PDESC")
    private String description;

    @Column(name = "DNAME")
    private String displayName;

    @Column(name = "MNAME")
    private String manufactureName;

    public Integer getId() {
        return Id;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductType() {
        return productType;
    }

    public String getDescription() {
        return description;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getManufactureName() {
        return manufactureName;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setManufactureName(String manufactureName) {
        this.manufactureName = manufactureName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Id=" + Id +
                ", productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                ", description='" + description + '\'' +
                ", displayName='" + displayName + '\'' +
                ", manufactureName='" + manufactureName + '\'' +
                '}';
    }
}
