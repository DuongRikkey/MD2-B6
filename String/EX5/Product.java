package String.EX5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Product {
    private String productID;
    private String productName;
    private float price;
    private String description;
    private Date created;
    private String categoryName;
    private byte productStatus;

    public Product() {}
    public Product(String productID, float price, String description, Date created, String categoryName, byte productStatus) {
        this.productID = productID;
        this.price = price;
        this.description = description;
        this.created = created;
        this.categoryName = categoryName;
        this.productStatus = productStatus;


    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public byte getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(byte productStatus) {
        this.productStatus = productStatus;
    }
    public void inputProduct() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");

        //Nhập ProductID với ragex check


        do {
            System.out.println("Enter product ID: VD C123,AB45,B124 ");
            productID = sc.nextLine().trim().toUpperCase();
            if(productID.isEmpty()) {
                System.out.println("Không được để trống");
            }
        }
        while (!Pattern.matches("^[CSA]\\d{3}$", productID));
        //Nhập ProductName
        do {
            System.out.println("Enter product name từ 10->50 ký tự ");
            productName = sc.nextLine();
            if(productName.isEmpty() || productName.length() < 10 || productName.length() > 50) {
                System.out.println("Sản phẩm lỗi c pháp");
            }
        }
        while (productName.length()<10||productName.length()>50);

        do {
            System.out.println("Enter product price: ");
            price = Float.parseFloat(sc.nextLine());
        }
        while (price <=0);

//        sc.close();
        System.out.println("Enter product description: ");
        description = sc.nextLine();

        do {
            System.out.println("Ngày nhập sản phâẩm ");
            String date=sc.nextLine();
            try{
                created=dateFormat.parse(date);
            break;}
            catch (ParseException e){
                System.out.println("Ngày ko ok");
            }
        } while (true);

        System.out.println("Nhập tên danh mục");
        categoryName=sc.nextLine();




        do {
            System.out.println("Nhập trạng thái sản phẩm");
            productStatus=Byte.parseByte(sc.nextLine());
        }
        while (productStatus<0|| productStatus>3);
    }
       public  void displayProduct() {

        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
           System.out.println("Thông tin sản phẩm");
           System.out.println("Mã sản phẩm"+productID);
           System.out.println("Tên sản phẩm"+productName);
           System.out.println("Giá sản phẩm: " + price);
           System.out.println("Mô tả sản phẩm: " + description);
           System.out.println("Ngày nhập sản phẩm: " + dateFormat.format(created));
           System.out.println("Tên danh mục: " + categoryName);
           System.out.println("Trạng thái sản phẩm: " + ((productStatus==0)?"Đang bán":(productStatus==1)?"hết hàng":"Không bán"));

       }




    }



