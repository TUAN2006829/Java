import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();


        str = str.trim();


        boolean doiXung = true;
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                doiXung = false;
                break;
            }
            left++;
            right--;
        }


        if (doiXung) {
            System.out.println(str.toUpperCase() + " -> Chuỗi này đối xứng!");
        } else {
            System.out.println(str.toLowerCase() + " -> Chuỗi này không đối xứng!");
        }
    }
}