import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập tên của bạn : ");
        String name = sc.nextLine();
        System.out.print("Hãy nhập tuổi của bạn : ");
        int tuoi = sc.nextInt();
        System.out.print("Chiều cao ( mét ): ");
        double cao = sc.nextDouble();
        System.out.print("Xin chào:" + name+" , bạn " + tuoi + " tuổi"+ " và cao "+cao+" mét");
    }
}