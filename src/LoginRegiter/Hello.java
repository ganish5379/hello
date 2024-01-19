package LoginRegiter;

import java.util.Scanner;

public class Hello {
  static  Scanner scanner = new Scanner(System.in);
    static String telnomer1="",parol0="";

    public static void main(String[] args) { qaytish();
    }
    public static void qaytish(){

        System.out.print("1-Login\n2-Regitrasiy\n3-Exit\nBo'limni tanlang:");
        int select = scanner.nextInt();
        switch (select){
            case 1:login();break;
            case 2:register();break;
            case 3:exit();

        }

    }

      public static void qaytish1(){
          System.out.print("Yoshingiz:");
          int yosh = scanner.nextInt();

      }
    public static void exit(){
        System.out.println("Tizimdan chiqish👍👍");
    }
    public static void  login(){
        System.out.println("➡️ Login bo'limidasiz");
        scanner = new Scanner(System.in);
     System.out.print("Telefon nomer:");
      String telnomer=scanner.nextLine();
     System.out.print("Parol:");
     String parol=scanner.nextLine();
     if (telnomer.equals(telnomer1) && parol.equals(parol0)){
         System.out.println("Muvaffaqiyatli kirdingiz");
         exit();
     }else {
         System.out.println("Ro'yhatdan o'tishingiz kerak ");
         qaytish();
         System.out.println("Tel nomer yoki parol xato");
         login();
     }
    }
    public static void register() {
        System.out.println("➡️Register bo'limidasiz");
        scanner = new Scanner(System.in);
        System.out.print("Ismingiz:");
        String name = scanner.nextLine();
        System.out.print("Familyangiz:");
        String Family = scanner.nextLine();
        System.out.print("Tug'ilgan sanangiz:");
        String yil = scanner.nextLine();
        System.out.print("Yoshingiz:");
        int yosh = scanner.nextInt();
        if (yosh>17){
        }else {
            System.out.println("Yoshingiz 18 yoshdan katta bo'lishi kerak");
            qaytish1();
        }
        System.out.print("gmail:");
         scanner = new Scanner(System.in);
        String gmail = scanner.nextLine();
        System.out.print("Adres:");
        String adres = scanner.nextLine();
        System.out.print("Telefon nomer:");
        telnomer1 = scanner.nextLine();
        if (telnomer1.length()==12);
        else {
            System.out.println("Namuna:998995554555");
        }
        System.out.print("Parol:");
        parol0 = scanner.nextLine();
        if (parol0.length()>8);
        else {
            System.out.println("Kamida 8 belgidan iborat bo'lishi kerak");
        }
        System.out.print("Qayta Parol:");
        String parol1 = scanner.nextLine();
        if (parol0==parol1);
        else {
            System.out.println("Parol noto'g'ri");
        }
        System.out.println("Muvaffaqiyatli ruyxatdan o'tdingiz");
        qaytish();



    }
}
