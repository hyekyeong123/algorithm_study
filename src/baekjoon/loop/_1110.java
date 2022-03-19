package baekjoon.loop;

import java.util.Scanner;

// while
// 더하기 사이클

// 난이도 ***
public class _1110 {
    public static void main(String[] args)  {

        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();

        int temp = 0;
        int first= 0;
        int end = 0;
        int count = 0;

        // 그러고보니 이렇게 짜면 a가 0일때 틀림 껄껄
       while(true){
            if(count == 0){
                temp = a; // 26
            }else if(temp == a){
                break;
            }
//            System.out.println("temp : "+temp);

            first = temp / 10;
            end = temp % 10;

            temp = (end*10) + ((first+end) % 10);
            // temp = 68
            count++;
        }
        System.out.println(count);
    }
}


