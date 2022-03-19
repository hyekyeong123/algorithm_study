package baekjoon;

import java.util.Scanner;

// 알람 시계
// 45분전으로
public class _2884 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // 시간
        int b = scanner.nextInt(); // 분
        int count = 0;
        if(b >= 45){
            b = b - 45;
        }else{
            if(a != 0){
                a= a-1;
            }else{
                a = 23;
            }

            b = 45 - b; // 10 -> 35
            b = 60-b;
        }
        System.out.print(a+" ");
        System.out.print(b);
    }
}
