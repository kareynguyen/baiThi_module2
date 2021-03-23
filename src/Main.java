import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        InOut inOut = new InOut();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int choice;
                do {
                    menu();
                    choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            manager.show();
                            break;
                        case 2:
                            manager.add(inOut.input());
                            break;
                        case 3:
                            System.out.println("Nhập số điện thoại để sửa: ");
                            String input1 = sc.nextLine();
                            manager.update(input1);
                            break;
                        case 4:
                            System.out.println("Nhập số điện thoại để xóa: ");
                            String input2 = sc.nextLine();
                            manager.delete(input2);
                            break;
                        case 5:
                            System.out.println("Nhập số điện thoại để tìm: ");
                            String input3 = sc.nextLine();
                            System.out.println(manager.findByPhoneNumber(input3));
                            break;
                        case 6:
                            manager.readFromFile();
                            break;
                        case 7:
                            manager.writeToFile();
                            break;
                        case 8:
                            System.exit(0);
                            break;
                    }
                } while (choice != 8);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Mời chọn lại các nút chức năng từ 1 đến 8!");
            }
        }
    }

    public static void menu() {
        System.out.println("-----------CHƯƠNG TRÌNH QUẢN LÍ DANH BẠ-----------");
        System.out.println("Chọn chức năng theo số (để tiếp tục)");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Lưu vào file");
        System.out.println("8. Thoát");
        System.out.println("Chọn chức năng: ");
    }
}
