package Controller;

public class CalcMatriz extends Thread {

    private int mat[][]= new int[3][5];
    public CalcMatriz(int[][] mat) {
        this.mat= mat;
    }


    @Override
    public void run() {
        somaMatriz();
    }

    public void somaMatriz(){
        int soma=0;
        int linha= 1;

        for (int x=0; x<3; x++){
            for (int y=0; y<5; y++){
                soma = soma + mat[x][y];
            }
            System.out.println("TID #"+ getId() +" ===> Linha "+ linha++ +": " + soma);
            soma= 0;
        }
    }
}
