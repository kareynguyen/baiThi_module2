import java.util.Scanner;
import java.util.regex.Pattern;

public class InOut {
    Scanner sc = new Scanner(System.in);

    public PhoneBook input() {

        String regexPhoneNumber = "^[0-9]{10}";
        String phoneNumber;
        do {
            System.out.println("Nhập số điện thoại (dùng kí tự số): ");
            phoneNumber = sc.nextLine();
        } while (!Pattern.matches(regexPhoneNumber, phoneNumber));

        System.out.println("Nhập tên nhóm");
        String group = sc.nextLine();

        String regexName = "^[a-zA-z]+";
        String name;
        do {
            System.out.println("Nhập tên khách hàng (dùng kí tự chữ cái): ");
            name = sc.nextLine();
        } while (!Pattern.matches(regexName, name));

        String regexGender = "^[a-zA-z]+";
        String gender;
        do {
            System.out.println("Nhập giới tính (nam/nu): ");
            gender = sc.nextLine();
        } while (!Pattern.matches(regexGender, gender));

        System.out.println("Nhập địa chỉ");
        String address = sc.nextLine();

        String regexDob = "[0-3]{1}[0-9]{1}(/|-)[0-1]{1}[0-9]{1}(/|-)[1]{1}[0-9]{3}";
        String dob;
        do {
            System.out.println("Nhập ngày sinh (dùng kí tự số theo dạng [DD-MM-YYYY]): ");
            dob = sc.nextLine();
        } while (!Pattern.matches(regexDob, dob));

        String regexEmail = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
        String email;
        do {
            System.out.println("Nhập email: ");
            email = sc.nextLine();
        } while (!Pattern.matches(regexEmail, email));
        PhoneBook phoneBook = new PhoneBook(phoneNumber, group, name, gender, address, dob, email);
        return phoneBook;
    }
}
