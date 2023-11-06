import java.util.ArrayList;

public class multiplicacionConstante {
    int D;
    int A;
    int X_0;
    ArrayList<Integer> arrayY = new ArrayList<Integer>();
    ArrayList<Integer> arrayX = new ArrayList<Integer>();
    ArrayList<Double> arrayR = new ArrayList<Double>();

    public multiplicacionConstante(int d, int a, int x_0) {
        D = d;
        A = a;
        X_0 = x_0;
    }
    public void operar(){
        int contador=0;
        int resultadoY=A*X_0;
        arrayX.add(X_0);
        while( contador<10){
            int resultadoX=cortar(resultadoY);
            Double auxR=numeroR(resultadoX);
            System.out.println("resultadoY: "+resultadoY);
            System.out.println("resultadoX: "+resultadoX);
            System.out.println("auxR: "+auxR);
            arrayY.add(resultadoY);
            arrayX.add(resultadoX);
            arrayR.add(auxR);

            int longitud=arrayX.size();
            resultadoY=A*arrayX.get(longitud-1);
            System.out.println("resultadoY2: "+resultadoY);
            contador++;
        }

    }
    public int cortar(int num){
        String numeroString = Integer.toString(num);
        String[] vectorString = new String[numeroString.length()];
        for (int i = 0; i < numeroString.length(); i++) {
            vectorString[i] = String.valueOf(numeroString.charAt(i));
        }

        int longitud=vectorString.length;

        if (longitud % 2 == 0) {
            int puntoMedio=(longitud-1)/2;
            puntoMedio=puntoMedio-1;
            int resultado=valorMedio(puntoMedio,vectorString);
            if (resultado<1000){
                resultado=valorMedio((puntoMedio-1),vectorString);
            }
            return resultado;

        } else {
            int puntoMedio=(longitud-1)/2;
            puntoMedio=puntoMedio-1;
            int resultado=valorMedio(puntoMedio,vectorString);
            if (resultado<1000){
                resultado=valorMedio((puntoMedio-1),vectorString);
            }
            return resultado;
        }


    }
    public static int valorMedio(int indice,String[] vector) {
        String[] aux = new String[4];
        int i=0;
        while (i<4){
            aux[i]=vector[indice];
            i++;
            indice++;
        }
        String cadenaConcatenada = String.join("", aux);
        int numeroEntero = Integer.parseInt(cadenaConcatenada);
        return numeroEntero;
    }
    public double numeroR(int num){
        double base = 10; // Base
        double exponente =4; // Exponente

        double resultado = Math.pow(base, exponente);
        double v = (num) / resultado;

        return v;
    }

    public void Imprimir(){
        System.out.println("/////   RESULTADOS multiplicacion constante   /////");
        System.out.println("D: "+D);
        System.out.println("A: "+A);
        System.out.println("X_0: "+X_0);
        for (int i = 0; i < arrayY.size(); i++) {
            System.out.println("Y_"+(i+1)+": "+arrayY.get(i)+" X_"+(i+1)+": "+arrayX.get(i+1)+" R_"+(i+1)+": "+arrayR.get(i));

        }

    }
}
