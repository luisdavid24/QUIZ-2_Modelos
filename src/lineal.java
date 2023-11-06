import java.util.ArrayList;

public class lineal {
    int G;
    int K;
    int M=2;
    int C;
    int A;
    int X_0;
    ArrayList<Integer> arrayX = new ArrayList<Integer>();
    ArrayList<Float> arrayR = new ArrayList<Float>();

    public lineal(int g, int k, int c, int x_0) {
        G = g;
        K = k;
        C = c;
        A = (4*K)+1;
        X_0 = x_0;
    }

    public void operar(){
        int contador=0;
        M=numeroM(G);
        arrayX.add(X_0);
        while( contador<M){
            int longitud=arrayX.size()-1;
            int auxX=(arrayX.get(longitud)*A+C)%M;
            arrayX.add(auxX);
            Float auxR=numeroR(auxX);
            arrayR.add(auxR);
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
    public int numeroX( int exponente){
        int resultado=2;
        int contador=1;
        while(contador<exponente){
            resultado*=resultado;
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
        System.out.println("//////     RESULTADOS lineal  //////");
        for (int i = 0; i < arrayR.size(); i++) {
            System.out.println(" X_"+(i+1)+": "+arrayX.get(i+1)+" R_"+(i+1)+": "+arrayR.get(i));

        }

    }

}
