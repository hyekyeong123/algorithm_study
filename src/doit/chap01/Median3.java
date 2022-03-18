package doit.chap01;

import java.sql.PreparedStatement;
import java.util.Scanner;

// 세가지 정수값 중 중앙값 구하기

public class Median3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하세요");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int result = 0;

        // a는 b보다 크고
        if(a >= b){
            if(b >= c){
                result = b;
            } else if(a <= c){   // a는  b보다 크나 c보다 작을때
                result = a;
            } else{ //  a는 b보다 크고 c보다 크다. 또한 b는 c보다 작다.
                result = c;
            }
        } else if(a > c){ // a는 b보다 작고 c보다 클때
            result =  a;
        } else if(b > c){ // a는 b보다 작고 b는 c보다 클때, a는 c보다 작을때
            result = c;
        } else{ // a는 b보다 작고
            result = b;
        }


    }
}
