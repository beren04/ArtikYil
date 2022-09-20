package first;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Artık yıl olup olmadığını sorgulamak istediğiniz yılı giriniz:");
        int yil = input.nextInt();
        if(yil%100!=0){
            if(yil%4==0){
                System.out.println(yil+" bir artık yıldır");
            }else{
                System.out.println(yil+" artık bir yıl değildir");
            }
        }
        else if (yil%100==0) {
            if(yil%400==0){
                System.out.println(yil+" artık bir yıldır");
            }else{
                System.out.println(yil+" artık bir yıldır.");
            }
        }
    }
}
