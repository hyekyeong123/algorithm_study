package baekjoon;

import java.util.Scanner;

// 주사위 세개
// 난이도 : **(한번 틀림)
public class _2480 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max;
        int result = 0;

        if(a == b){
            if(b == c){
                result = 10000+(a * 1000);
            }else{
                result = 1000+(a * 100);
            }
        }
        else if(b == c){
            result = 1000+(b * 100);
        }

        // 1 5 1
        // a와 b도 다르고, b와 c 도 다르고
        else if(c == a){
            result = 1000+(c * 100);
        } else{
            // 가장 큰 눈 * 100
            max = a;
            if(b > max) max = b;
            if(c > max) max = c;
            result = max * 100;
        }

        System.out.print(result);
    }
}
