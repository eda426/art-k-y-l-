import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen bir yıl giriniz:");
        int yıl= input.nextInt();

        if((yıl%4==0 && yıl % 100 !=0) || (yıl % 400==0))
        {
            System.out.println(yıl+" "+"bir artık yıldır!");
        }
        else
        {
            System.out.println(yıl+" "+"artık yıl değildir!");
        }
    }
}