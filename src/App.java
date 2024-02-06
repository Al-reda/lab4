import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(readStudent());
    }

    public static ArrayList<String> readStudent(){
        ArrayList<String> list = new ArrayList<String>();
        try {
            Scanner sc =new Scanner(new File("Student List.txt"));
            while(sc.hasNextLine()){
                list.add(sc.nextLine());
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        return list;
    }
}
