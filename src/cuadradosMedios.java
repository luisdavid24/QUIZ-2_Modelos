import java.util.ArrayList;

public class cuadradosMedios {
    int D;
    int X_0;
    ArrayList<Integer> arrayY = new ArrayList<Integer>();
    ArrayList<Integer> arrayX = new ArrayList<Integer>();
    ArrayList<Double> arrayR = new ArrayList<Double>();

    public cuadradosMedios(int d, int x_0) {
        D = d;
        X_0 = x_0;
    }

    public void operar(){
        int contador=0;
        int aux=X_0;
        int auxY=aux*aux;
        while( contador<10){
            int auxX=cortar(auxY);
            Double auxR=numeroR(auxX);
            arrayY.add(auxY);
            arrayX.add(auxX);
            arrayR.add(auxR);

            auxY=auxX*auxX;
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
        System.out.println("D: "+D);
        System.out.println("X_0: "+X_0);
        for (int i = 0; i < arrayY.size(); i++) {
            System.out.println("Y_"+(i+1)+": "+arrayY.get(i)+" X_"+(i+1)+": "+arrayX.get(i)+" R_"+(i+1)+": "+arrayR.get(i));

        }

    }
}
