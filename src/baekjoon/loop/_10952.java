package baekjoon.loop;

import java.util.Scanner;

// while

// Scanner를 do 안에 두면 런타임 에러가 발생한다.
public class _10952 {
    public static void main(String[] args)  {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);


        do{
            a = scanner.nextInt();
            b = scanner.nextInt();
            if(a != 0 && b != 0){
                System.out.println(a+b);
            }
        }while(a != 0 && b != 0);
    }
}


