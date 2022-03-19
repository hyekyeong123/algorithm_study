package baekjoon;

import java.util.Scanner;

// 별 찍기 2

public class _2439 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i= 0; i<n; i++){
            for (int k = 0; k < n; k++){
                if(i +k < n-1){
                    System.out.print (" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

