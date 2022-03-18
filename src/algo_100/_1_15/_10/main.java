package algo_100._1_15._10;

public class main {
    public static void main(String[] args) {
        int inputNum = 4;

        int num = 1;

        // 4행(바깥쪽) 4열(안쪽)이 나와야 한다.
        for (int i= 0; i<inputNum; i++){
            for (int j= 0; j<inputNum; j++){
                //System.out.printf("%4d",num);
                //num++;
                // or
                System.out.printf("%4d",i*inputNum+1+j);
            }
            System.out.println();
        }
    }
}
