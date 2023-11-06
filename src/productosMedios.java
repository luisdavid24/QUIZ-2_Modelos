import java.util.ArrayList;

public class productosMedios {
    int D;
    int X_0;
    int X_1;
    ArrayList<Integer> arrayY = new ArrayList<Integer>();
    ArrayList<Integer> arrayX = new ArrayList<Integer>();
    ArrayList<Double> arrayR = new ArrayList<Double>();
    public productosMedios(int d, int x_0, int x_1) {
        D = d;
        X_0 = x_0;
        X_1 = x_1;
    }

    public void operar(){
        int contador=0;
        arrayX.add(X_0);
        arrayX.add(X_1);

        while( contador<10){
            int resultadoY=arrayX.get( (arrayX.size()-1))*arrayX.get( (arrayX.size()-2));
            int resultadoX=cortar(resultadoY);
            Double auxR=numeroR(resultadoX);
            arrayY.add(resultadoY);
            arrayX.add(resultadoX);
            arrayR.add(auxR);
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

    public void Imprimir(){
        System.out.println("RESULTADOS productos medios");
        System.out.println("D: "+D);
        System.out.println("X_0: "+X_0);
        System.out.println("X_1: "+X_1);
        for (int i = 0; i < arrayY.size(); i++) {
            System.out.println("Y_"+(i+2)+": "+arrayY.get(i)+" X_"+(i+2)+": "+arrayX.get(i+2)+" R_"+(i+1)+": "+arrayR.get(i));

        }

    }
    public double numeroR(int num){
        double base = 10; // Base
        double exponente =4; // Exponente

        double resultado = Math.pow(base, exponente);
        double v = (num) / resultado;

        return v;
    }



}
