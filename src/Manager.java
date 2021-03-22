import java.util.*;

public class Manager {

    static FileProcess fileProcess = new FileProcess();
    static ArrayList<PhoneBook> list = fileProcess.readFile();
    static InOut inOut = new InOut();

    public void show() {
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).display());
            }return;
        }else {
            System.out.println("Không có sản phẩm nào");
        }
    }

    public PhoneBook findByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < list.size(); i++) {
            if (phoneNumber == list.get(i).getPhoneNumber()) {
                return list.get(i);
            }
        }
        return null;
    }

    public void add(PhoneBook phoneBook) {
        if (findByPhoneNumber(phoneBook.getPhoneNumber()) != null) {
            System.out.println("Số điện thoại bị trùng");
        } else {
            list.add(phoneBook);
            System.out.println("Đã thêm vào danh bạ");
        }
    }

    public boolean update(String phoneNumber) {
        for (int i = 0; i < list.size(); i++) {
            if ((phoneNumber) != null) {
                System.out.println("Đã tìm thấy số điện thoại. Mời nhập thông tin cần sửa!");
                list.set(i, inOut.input());
                System.out.println("Cập nhật thành công");
                break;
            } else {
                System.out.println("Không tìm được danh bạ với số điện thoại trên");
                break;
            }
        }
        return false;
    }

    public boolean delete(String phoneNumber) {
        if (findByPhoneNumber(phoneNumber) != null) {
            list.remove(findByPhoneNumber(phoneNumber));
            System.out.println("Deleted successfully!");
            return true;
        }else {
            System.out.println("Không tìm được danh bạ với số điện thoại trên");
        }
        return false;
    }

    public void writeToFile() {
        fileProcess.writeFile(list);
    }

    public void readFromFile() {
        fileProcess.readFile();
    }
}
