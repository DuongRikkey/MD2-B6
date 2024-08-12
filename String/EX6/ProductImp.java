package String.EX6;

import java.util.Scanner;

public class ProductImp {
    public static void main(String[] args) {
        Product[] products = new Product[100];
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("***********************MENU**************************");
            System.out.println("1. Nhập thông tin n sản phẩm (n nhập từ bàn phím)");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Tính lợi nhuận các sản phẩm");
            System.out.println("4. Sắp xếp các sản phẩm theo lợi nhuận giảm dần");
            System.out.println("5. Thống kê các sản phẩm theo giá");
            System.out.println("6. Tìm các sản phẩm theo tên sản phẩm");
            System.out.println("7. Nhập sản phẩm");
            System.out.println("8. Bán sản phẩm");
            System.out.println("9. Cập nhật trạng thái sản phẩm");
            System.out.println("10. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    // TODO: Nhập thông tin sản phẩm
                    break;
                case 2:
                    // TODO: Hiển thị thông tin sản phẩm
                    break;
                case 3:
                    // TODO: Tính lợi nhuận các sản phẩm
                    break;
                case 4:
                    // TODO: Sắp xếp các sản phẩm theo lợi nhuận giảm dần
                    break;
                case 5:
                    // TODO: Thống kê các sản phẩm theo giá
                    break;
                case 6:
                    // TODO: Tìm các sản phẩm theo tên sản phẩm
                    break;
                case 7:
                    // TODO: Nhập sản phẩm
                    break;
                case 8:
                    // TODO: Bán sản phẩm
                    break;
                case 9:
                    // TODO: Cập nhật trạng thái sản phẩm
                    break;
                case 10:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }
    }
}
