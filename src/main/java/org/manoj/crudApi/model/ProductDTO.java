package org.manoj.crudApi.model;

public class ProductDTO {

    private String productId;

    private String productName;

    private String productType;

    private String description;

    private String displayName;

    private String manufactureName;

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

    @Override
    public String toString() {
        return "ProductDTO{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                ", description='" + description + '\'' +
                ", displayName='" + displayName + '\'' +
                ", manufactureName='" + manufactureName + '\'' +
                '}';
    }
}
