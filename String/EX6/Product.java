package String.EX6;

import java.util.Scanner;

public class Product {
    private String productid;
    private String productName;
    private float importPrice;
    private float exportPrice;
    private float profit;
    private int quantity;
    private String descriptions;
    private boolean status;

    // Constructor không tham số
    public Product() {}

    // Constructor có tham số
    public Product(String productid, String productName, float importPrice, float exportPrice, int quantity, String descriptions, boolean status) {
        this.productid = productid;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.descriptions = descriptions;
        this.status = status;
        this.calProfit(); // Tính lợi nhuận khi khởi tạo
    }

    // Các phương thức getter và setter
    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
        this.calProfit(); // Cập nhật lợi nhuận khi giá xuất thay đổi
    }

    public float getProfit() {
        return profit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Phương thức tính lợi nhuận
    public void calProfit() {
        this.profit = this.exportPrice - this.importPrice;
    }

    // Phương thức nhập dữ liệu
    public void inputData(Scanner scanner, Product[] arrProduct) {
        // TODO: Nhập dữ liệu với validate theo yêu cầu
    }

    // Phương thức hiển thị dữ liệu
    public void displayData() {
        System.out.println("Product ID: " + productid);
        System.out.println("Product Name: " + productName);
        System.out.println("Import Price: " + importPrice);
        System.out.println("Export Price: " + exportPrice);
        System.out.println("Profit: " + profit);
        System.out.println("Quantity: " + quantity);
        System.out.println("Descriptions: " + descriptions);
        System.out.println("Status: " + (status ? "Đang bán" : "Không bán"));
    }
}
