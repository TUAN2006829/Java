import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        //Tạo mảng
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        //in
        System.out.println("Nhap 5 so nguyen : ");
        for(int i=0 ; i<5 ; i++)

            {
                System.out.println("So thu "+(i+1));
            arr[i] = sc.nextInt();
        }
        //in phan tu vua nhap
        System.out.println("cac phan tu vua nhap :");
        for(int i=0 ; i<5 ; i++)
        {
            System.out.print(arr[i] + " ");
        }

        //tinh tong cac phan tu
        int tong = 0 ;
        for (int i=0 ; i<5 ; i++ )
        {
            tong = tong  + arr[i];
        }
        System.out.println(" Tong cac phan tu la : " + tong );

        //Gia tri lon nhat
            int max = arr[0];
            for (int i=1 ; i < 5 ; i++)
            {
            if(arr[i]>max )
            {
             max = arr[i];
            }
            }
        System.out.println("Giá trị lớn nhất: " + max);
    }
}