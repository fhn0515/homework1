package digui;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
    }



    public boolean solutionNew(int mun){
        return solution(mun)==1;
    }
    public int solution(int mun){
        if (mun==2){
            return 1;

        }
        if (mun==0){
            return 0;
        }
        return solution(mun/2);
    }

}
