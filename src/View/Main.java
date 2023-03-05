package View;

import Controller.CalcMatriz;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        int mat[][]= new int[3][5];


        for (int x=0; x<3; x++){
            for (int y=0; y<5; y++){
                mat[x][y]=  (int) (Math.random() * 10 + 1);
            }
        }
        for (int i=0; i<3; i++){
            CalcMatriz thread= new CalcMatriz(mat);
            thread.start();
        }
    }
}
