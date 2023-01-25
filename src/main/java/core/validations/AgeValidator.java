package core.validations;

import java.util.Scanner;

public class AgeValidator {

    Scanner scan = new Scanner(System.in);

    public int isValidAge(){

        int age = 0;

        do {
            age = scan.nextInt();
            if (age<0 || age>100){
                System.out.println("Lütfen geçerli bir yaş giriniz!");
                System.out.println("Tekar deneyiniz: ");
            }else if (age<21){
                System.out.println("Araç kiralamak için en az 21 yaşında olmalısınız!");
                System.out.println("Tekrar deneyiniz: ");
            }else {
                break;
            }

        }while (true);

        return age;
    }

}
