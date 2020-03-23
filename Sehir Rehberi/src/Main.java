import java.util.Scanner;

public class Main {



    public static void Menu(){
        System.out.println("______________________");
        System.out.println("Şehir Rehberine Hoşgeldiniz");
        System.out.println("1-Şehir Ekle");
        System.out.println("2-Şehir Seç");
        System.out.println("3-Çıkış");
        System.out.println("______________________");
    }
    static MenuSystem menuSystem = new MenuSystem();
    public static void infoCity(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Şehir Numarasını Giriniz...");
        int position = sc.nextInt();
        menuSystem.infoCity(position-1);
    }

    public static void main(String[] args) {





        menuSystem.start();
        boolean exit = false;
        while (!exit) {
            Menu();
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();

            sc.nextLine();

            switch (choose) {
                case 1:
                    menuSystem.cityAdd();
                    break;
                case 2:
                    menuSystem.listCity();
                    infoCity();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Programdan Çıkılıyor!!");
                    break;
            }

        }
    }
}
