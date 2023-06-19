import java.util.Scanner;

    public class Kazuate{
        public static void main(String[] args) {
            int targetNumber = (int) (Math.random() * 90) + 10; // 10から99までの乱数を生成
            int maxAttempts = 5; // 最大試行回数

            System.out.println("数当てゲームを開始します！");
            System.out.println("2桁の正の整数を当ててください。");

            Scanner scanner = new Scanner(System.in);
            int attempts = 0;

            while (attempts < maxAttempts) {
                System.out.print("予想した数を入力してください: ");
                int guess = scanner.nextInt();

                if (guess == targetNumber) {
                    System.out.println("当たり！おめでとうございます！");
                    break;
                } else if (guess > targetNumber) {
                    System.out.println("設定された数より大きいです。");
                } else {
                    System.out.println("設定された数より小さいです。");
                }

                attempts++;

                if (attempts == maxAttempts) {
                    System.out.println("ゲームオーバー！正解は " + targetNumber + " でした。");
                } else if (Math.abs(guess - targetNumber) >= 20) {
                    System.out.println("数が大きく外れています！");
                }
            }

            scanner.close();
            System.out.println("ゲーム終了！");
        }
    }
