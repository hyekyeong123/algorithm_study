package baekjoon;

import java.util.Scanner;

// 별 찍기 1

public class _2438 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i= 0; i<n; i++){
            for (int k = 0; k < i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

