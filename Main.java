import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //自動販売機のドリンクについて（名前、料金、在庫）
        String[] drinkNames = new String[]{"コーラ", "お茶", "水"};
        int[] drinkPrices = new int[]{150, 100, 100};
        int[] drinkStocks = new int[]{3, 4, 2};
        int[] drinkNumbers = new int[]{0, 1, 2};

        System.out.println("いらっしゃいませ");
        System.out.println();

        //自身の金額を入力してもらう
        Scanner scanner = new Scanner(System.in);
        System.out.println("金額を入力してください");
        int money = Integer.parseInt(scanner.nextLine());
        System.out.println();

        //商品の名前、金額、値段の表示
        if (money >= 150) {
            for (int i = 0; i < 3; i++) {
                System.out.print(drinkNames[i]);
                System.out.print("、");
            }
            System.out.println();

            System.out.println("商品番号");
            for (int i = 0; i < 3; i++) {
                System.out.print(drinkNumbers[i]);
                System.out.print("、");
            }
            for (int i = 0; i < 3; i++) {
                System.out.print(drinkPrices[i]);
                System.out.print("、");
            }
            System.out.println();

        } else if (money >= 100) {
            for (int i = 1; i < 3; i++) {
                System.out.print(drinkNames[i]);
                System.out.print("、");
            }
            System.out.println();
            System.out.println("商品番号");
            for (int i = 1; i < 3; i++) {
                System.out.print(drinkNumbers[i]);
                System.out.print("、");
            }
            System.out.println();
            for (int i = 1; i < 3; i++) {
                System.out.print(drinkPrices[i]);
                System.out.print("、");
            }
            System.out.println();

        }else {
            System.out.println("金額が不足しています");
        }

        System.out.println("商品番号を入力してください");
        int buyDrinkNumber = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println();

        if (drinkStocks[buyDrinkNumber] > 0) {
            int change = money - drinkPrices[buyDrinkNumber];
            int remainingDrinkStocks = drinkStocks[buyDrinkNumber] -1;
            System.out.println(drinkNames[buyDrinkNumber] + "がでてきました");
            System.out.println("お釣りは" + change + "円です。");
            System.out.println("残りの在庫は" + remainingDrinkStocks + "です。");
        }else {
            System.out.println("売り切れです");
        }

    }
}
