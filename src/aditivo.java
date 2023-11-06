import java.util.ArrayList;

public class aditivo {
    int M;
    int X_0;
    int X_1;
    int X_2;
    int X_3;
    int X_4;

    ArrayList<Integer> arrayX = new ArrayList<Integer>();
    ArrayList<Float> arrayR = new ArrayList<Float>();

    public aditivo(int m, int x_0, int x_1, int x_2, int x_3, int x_4) {
        M = m;
        X_0 = x_0;
        X_1 = x_1;
        X_2 = x_2;
        X_3 = x_3;
        X_4 = x_4;
    }
    public void operar(){
        int contador=0;
        int i=4;
        int j=0;
        arrayX.add(X_0);
        arrayX.add(X_1);
        arrayX.add(X_2);
        arrayX.add(X_3);
        arrayX.add(X_4);
        while( contador<10){
            int auxX=(arrayX.get(i)+arrayX.get(j))%M;
            arrayX.add(auxX);
            int divisor=M-1;
            float auxR=(float)auxX/divisor;
            arrayR.add(auxR);
            i++;
            j++;
            contador++;
        }

    }
    public void Imprimir(){
        System.out.println("//////     RESULTADOS aditivo  //////");
        for (int i = 0; i < arrayR.size(); i++) {
            System.out.println(" X_"+(i+5)+": "+arrayX.get(i+5)+" R_"+(i+1)+": "+arrayR.get(i));

        }

    }

}
