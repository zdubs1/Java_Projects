import java.util.Scanner;

public class Lab9Driver {
    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);

        System.out.print("Enter the name of the first band booster: ");
        String booster1Name = ky.nextLine();
        BandBooster booster1 = new BandBooster(booster1Name);
        System.out.print("Enter the name of the second band booster: ");
        String booster2Name = ky.nextLine();
        BandBooster booster2 = new BandBooster(booster1Name);

        System.out.print("Enter the number of weeks for which booster data will be entered: ");
        int weeks = ky.nextInt();
        for(int i = 1; i <= weeks; i++){
            System.out.print("Enter the number of boxes for " + booster1Name + "for week " + 1 + ": ");
            int temp = ky.nextInt();
            booster1.updateSales(temp);
            System.out.print("Enter the number of boxes for " + booster2Name + "for week " + 1 + ": ");
            temp = ky.nextInt();
            booster2.updateSales(temp);

            System.out.println(booster1.toString());
            System.out.println(booster2.toString());
        }
    }
}
