import java.io.*;
import java.util.ArrayList;

public class FileProcess {
    public ArrayList<PhoneBook> readFile(){
        ArrayList<PhoneBook> list = new ArrayList<>();
        try{
            FileReader fileReader = new FileReader(("PhoneBook.txt"));
            BufferedReader reader = new BufferedReader(fileReader);

            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null){
                String[] phoneBookString = line.split(",");
                PhoneBook phoneBook = new PhoneBook();
                phoneBook.setPhoneNumber(phoneBookString[0]);
                phoneBook.setGroup(phoneBookString[1]);
                phoneBook.setName(phoneBookString[2]);
                phoneBook.setGender(phoneBookString[3]);
                phoneBook.setAddress(phoneBookString[4]);
                phoneBook.setDob(phoneBookString[5]);
                phoneBook.setEmail(phoneBookString[6]);

                System.out.println(phoneBook.display());
                list.add(phoneBook);
            }
            reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public void writeFile(ArrayList<PhoneBook> list){
        try {
            FileWriter writer = new FileWriter("PhoneBook.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("SDT, NHÓM, HỌ TÊN, GIỚI TÍNH, ĐỊA CHỈ, NGÀY SINH, EMAIL\n");
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i).toString());
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
