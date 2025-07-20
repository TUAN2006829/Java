import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên : ");
        String name = sc.nextLine();
        System.out.print("Tuổi : ");
        int tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Lớp : ");
        String lophoc = sc.nextLine();
        System.out.print("GPA : ");
        double gpa = sc.nextDouble();
        System.out.print("Tên : "+name+ " - Tuổi : "+ tuoi + " - Lớp "+ lophoc+" - GPA "+gpa);




    }
}