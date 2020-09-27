package sample;

import java.util.Scanner;

class Main{

    static int scan(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static void main(String []args){

        int K = scan();

        for(int i = 1; i < 65; i++){
            List.createCircle(i);
            System.out.print("N = " + i + " ");
            List.deleteEveryK(K);
        }
    }
}
