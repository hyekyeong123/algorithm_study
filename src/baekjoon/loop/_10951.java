package baekjoon.loop;

import java.util.Scanner;

// while


public class _10951 {
    public static void main(String[] args)  {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);

        // 주의!!! 종료값이 나와 있지 않는 경우 !!! int를 받아올때까지만 반복
        while(scanner.hasNextInt()){
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(a+b);
        }
        scanner.close();
    }
}
/*
이 문제에서 가장 중요한 점이 파일 종료 조건이 없이 그냥 입력이 주어졌다는 것이다.
즉 입력에서 더이상의 읽을 수 있는 데이터가 존재하지 않을 때 반복문을 종료하라는 것이다.
이렇게 데이터가 더이상 존재하지 않을 때 우리는 EOF (End of File) 즉, 파일의 끝이라 한다.

Scanner 의 메소드들의 경우 더이상 읽을 데이터가 없으면 NoSuchElementException 을 던지게 된다.

이렇게 던져진 예외의 경우 두 가지 방법이 있다.
try-catch 문으로 예외발생시 반복문을 종료해주도록 처리함.
Scanner 의 메소드인 hasNext() 를 통해 처리해준다.

위의 방법 중에 우리는 hasNext() 라는 메소드를 이용할 것이다.
*/

