package baekjoon;

import java.util.Scanner;

// 상대오차가 10⁻⁹ 이내여야 한다는 단서
// float로 계산하면 틀린다.

public class _1008 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println( (double) a / b);
    }
}
