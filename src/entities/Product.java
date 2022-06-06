package entities;

public class Product {
    private int productCode;
    private String name;
    private String description;
    private double purchasePrice;
    private double salePrice;
    private int quantityPurchased;
    private int soldAmount;
    private int availableQuantity;
    
    public Product(int productCode, String name, String description, double purchasePrice, double salePrice,
    int quantityPurchased, int soldAmount) {
        this.productCode = productCode;
        this.name = name;
        this.description = description;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
        this.quantityPurchased = quantityPurchased;
        this.soldAmount = soldAmount;
    }
    
    public int getProductCode() {
        return productCode;
    }
    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPurchasePrice() {
        return purchasePrice;
    }
    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    public double getSalePrice() {
        return salePrice;
    }
    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
    public int getQuantityPurchased() {
        return quantityPurchased;
    }
    public void setQuantityPurchased(int quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }
    public int getSoldAmount() {
        return soldAmount;
    }
    public void setSoldAmount(int soldAmount) {
        this.soldAmount = soldAmount;
    }
    public int getAvailableQuantity() {
        return availableQuantity;
    }
    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

}