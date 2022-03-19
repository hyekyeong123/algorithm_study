package baekjoon;

import java.util.Scanner;

// n plus

public class _8393 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 3
        int result = 0;

        // i = 0, 1, 2, 3
        for (int i = 0; i <= n; i++){
            result = result+i;
        }
        System.out.println(result);
    }
}
