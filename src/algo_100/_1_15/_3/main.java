package algo_100._1_15._3;

public class main {
    public static void main(String[] args) {

//        System.out.println("임의의 숫자 10개를 입력해주세요.");
//        Scanner scanner = new Scanner(System.in);
//        int[] inputNum = new int[10];
//        for (int i=0; i<10; i++){
//            inputNum[i] = scanner.nextInt();
//        }
        int[] inputNum = {1, 2, 2, 3, 1, 4, 2, 2, 4, 3, 5, 3, 2};
        int mode[] = new int[10];
        // index -> 출현한 수
        // index 값 -> index(출현한 수)가 몇번 나왔는지 저장하는 용도
        // mode[3] = 5 ; => 3번이라는 수가 5번 출현했다.

        for (int i=0; i<inputNum.length; i++){
            mode[inputNum[i]] = mode[inputNum[i]]+1;
        }

        // 최대값의 인덱스가 최빈수
        int modeNum = 0; // 최빈수
        int max = 0; // 최빈수가 나온 횟수

        // 먼저 최대값을 구해야함
        for (int i=0; i<mode.length; i++){
           if(max < mode[i]){
               max = mode[i];
               modeNum = i;
           }
        }

        // modeNum = asList(mode).indexOf(max);
        System.out.println(modeNum + " ("+ max+")회");
    }
}
