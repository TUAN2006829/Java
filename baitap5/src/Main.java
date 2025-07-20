public class Main {
    public static void main(String[] args)
    {
        System.out.println("bảng cửu chương sô 5 ");
        for( int i =1 ; i <=10 ; i++)
        {
            System.out.println(" 5 x "+i+"="+(5*i));
        }
        //in tong
        int tongchanfor = 0 ;
        for ( int  i=2 ; i<=100 ; i+=2 )
        {
            tongchanfor+=i;
        }
        System.out.print(" Tong cac phan tu chan la : " + tongchanfor);
        int tongchanwhile = 0;
                int i = 2 ;
        while (i<=100)
        {
            tongchanwhile +=i ;
            i+=2;
        }
        System.out.println(" tong cac so phan tu chan tu 1 den 100 la : "+tongchanwhile);
    }
}