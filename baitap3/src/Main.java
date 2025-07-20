import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
      for(int i = 1 ; i <= 5 ; i ++ )
      {
          System.out.println("    Cap so thu "+ i +"      ");
    //Nhap hai so nguyen
          System.out.print("Nhap so a : ");
          int a = sc.nextInt();
          System.out.print("Nhap so b : ");
          int b = sc.nextInt();
     //Cac phep toan
     System.out.println("Tong : " + (a+b));
     System.out.println("Hieu : "+(a-b));
     System.out.println("Tich : "+(a*b));
     //Phep toan chia (b khac 0 va chia het,chia du)
          if(b!=0)
          {
              System.out.println("Thuong : "+(a/b));
              System.out.println("Du : "+(a%b));
          }
          else
          {
              System.out.println("Khong the thuc hien phep chia do b=0 ");
          }
          //so sanh hai so
          if(a==b)
          {
              System.out.println("Hai so bang nhau OK ");
          }
          else
          {
              System.out.println("Hai so khong bang nhau NO OK ");
          }
      }


    }
}