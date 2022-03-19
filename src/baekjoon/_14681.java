package baekjoon;

import java.util.Scanner;

// 사분면 고르기

public class _14681 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a > 0){
            if(b > 0){
                System.out.println(1);
            }else{
                System.out.println(4);
            }
        }else{
            if(b > 0){
                System.out.println(2);
            }else{
                System.out.println(3);
            }
        }
    }
}
