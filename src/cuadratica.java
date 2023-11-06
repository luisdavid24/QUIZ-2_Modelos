import java.util.ArrayList;

public class cuadratica {
    private int G;
    private int M;
    private int C;
    private int A;
    private int B;

    private int X_0;
    ArrayList<Integer> arrayX = new ArrayList<Integer>();
    ArrayList<Float> arrayR = new ArrayList<Float>();

    public cuadratica(int g, int c, int a, int b, int x_0) {
        G = g;
        M = 1;
        C = c;
        A = a;
        B = b;
        X_0 = x_0;
    }
    public int numeroM( int exponente){
        int resultado=2;
        int contador=1;
        while(contador<exponente){
            resultado*=2;
            contador++;
        }

        return resultado;
    }

    public void operar(){
        int contador=0;
        M=numeroM(G);
        arrayX.add(X_0);
        /*int resutaldo=generarX(A,B,C,X_0,M);
        arrayX.add(resutaldo);*/

        while(contador<M){
            int longitud=arrayX.size()-1;
            int xAux=arrayX.get(longitud);
            int resutaldo=generarX(A,B,C,xAux,M);
            arrayX.add(resutaldo);
            float auxR=generarR(resutaldo,M);
            arrayR.add(auxR);
            contador++;
        }

    }

    public int generarX(int A,int B,int C,int X_0,int M){
        int resultado=A*X_0*X_0+B*X_0+C;
        resultado=resultado%M;
        return resultado;
    }

    public void Imprimir(){
        System.out.println("//////     RESULTADOS Cuadratica  //////");
        System.out.println(" X_"+(0)+": "+arrayX.get(0));
        for (int i = 1; i < arrayX.size(); i++) {
            System.out.println(" X_"+(i)+": "+arrayX.get(i)+" R_"+i+": "+arrayR.get(i-1));

        }


    }

    public float generarR(int X,int M){
        float resultado= (float) X /(M-1);
        return resultado;
    }
}
