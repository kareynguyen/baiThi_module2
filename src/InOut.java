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

        String regexGroup = "^[a-zA-z]+";
        String group;
        do {
            System.out.println("Nhập tên nhóm (dùng kí tự chữ cái): ");
            group = sc.nextLine();
        } while (!Pattern.matches(regexGroup, group));

        String regexName = "^[a-zA-z]+";
        String name;
        do {
            System.out.println("Nhập tên khách hàng (dùng kí tự chữ cái): ");
            name = sc.nextLine();
        } while (!Pattern.matches(regexName, name));

        String regexGender = "^[a-zA-z]+";
        String gender;
        do {
            System.out.println("Nhập giới tính (dùng kí tự chữ cái): ");
            gender = sc.nextLine();
        } while (!Pattern.matches(regexGender, gender));

        String regexAddress = "^[a-zA-z]+";
        String address;
        do {
            System.out.println("Nhập địa chỉ (dùng kí tự chữ cái): ");
            address = sc.nextLine();
        } while (!Pattern.matches(regexAddress, address));

        String regexDob = "[0-3]{1}[0-9]{1}(/|-)[0-1]{1}[0-9]{1}(/|-)[1]{1}[0-9]{3}";
        ;
        String dob;
        do {
            System.out.println("Nhập ngày sinh (dùng kí tự số theo dạng [DD-MM-YYYY]): ");
            dob = sc.nextLine();
        } while (!Pattern.matches(regexDob, dob));

        String regexEmail = "^[a-zA-z]+[a-zA-z0-9]*@{1}\\w+mail.com$";
        String email;
        do {
            System.out.println("Nhập email: ");
            email = sc.nextLine();
        } while (!Pattern.matches(regexEmail, email));
        PhoneBook phoneBook = new PhoneBook(phoneNumber, group, name, gender, address, dob, email);
        return phoneBook;
    }
}
