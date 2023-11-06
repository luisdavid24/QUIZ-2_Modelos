import java.util.ArrayList;

public class multiplicacion {
    int X_0;
    int G;
    int K;
    int M;
    int A;
    ArrayList<Integer> arrayX = new ArrayList<Integer>();
    ArrayList<Float> arrayR = new ArrayList<Float>();


    public multiplicacion(int x_0, int g, int k, int a) {
        X_0 = x_0;
        G = g;
        K = k;
        M = 2;
        A = (8 *K+5);
    }

    public void operar(){
        int contador=0;
        M=numeroM(G);
        int V=M/4;
        arrayX.add(X_0);
        while( contador<V){
            int longitud=arrayX.size()-1;
            int auxArray=arrayX.get(longitud);
            int auxX=(auxArray*A)%M;
            arrayX.add(auxX);
            arrayR.add(numeroR(auxX));
            contador++;
        }

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

    public float numeroR(int num){
        int divisor=M-1;

        float v = (float) num /divisor;
        return v;
    }

    public void Imprimir(){
        System.out.println("//////     RESULTADOS multiplicativo  //////");
        for (int i = 0; i < arrayR.size(); i++) {
            System.out.println(" X_"+(i+1)+": "+arrayX.get(i+1)+" R_"+(i+1)+": "+arrayR.get(i));

        }

    }
}
