import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        validacion val=new validacion();
        int[] vector;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Quiz #2 de modelos y simulacion.");
        System.out.println("True para poder seleccionar una opcion y false para salir ");
        boolean opcionBoolean = scanner.nextBoolean();
        while(opcionBoolean){
            System.out.println("Estas son las opciones, por favor digite el numero correspondiente a la opcion desea: \n1.cuadradosMedios \n2.productosMedios \n3.multiplicacionConstante \n4.lineal \n5.multiplicacion \n6.aditivo \n7.cuadratica");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    int X_0Cuadrado;
                    X_0Cuadrado = val.validarorCuadradosMedios();
                    cuadradosMedios cuadrado=new cuadradosMedios(4,X_0Cuadrado);
                    cuadrado.operar();
                    cuadrado.Imprimir();
                    break;
                case 2:
                    vector =val.productosMedios();
                    productosMedios producto=new productosMedios(4,vector[0],vector[1]);
                    producto.operar();
                    producto.Imprimir();
                    break;
                case 3:
                    vector =val.validarMultConstante();
                    multiplicacionConstante mult=new multiplicacionConstante(4,vector[0],vector[1]);
                    mult.operar();
                    mult.Imprimir();
                    break;
                case 4:
                    vector =val.validaroLineal();
                    lineal lin= new lineal(vector[0],vector[1],vector[2],vector[3]);
                    lin.operar();
                    lin.Imprimir();
                    break;
                case 5:
                    vector=val.validarMultiplicacion();
                    multiplicacion multi=new multiplicacion(vector[0],vector[1],vector[2],vector[3]);
                    multi.operar();
                    multi.Imprimir();
                    break;
                case 6:
                    vector=val.validarAditivo();
                    aditivo adit=new aditivo(vector[0],vector[1], vector[2], vector[3], vector[4], vector[5]);
                    adit.operar();
                    adit.Imprimir();
                    break;
                case 7:
                    vector=val.validarNoLinealCuadratica();
                    cuadratica cua=new cuadratica(vector[0],vector[1],vector[2],vector[3],vector[4]);
                    cua.operar();
                    cua.Imprimir();
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            System.out.println("True para poder seleccionar una opcion y false  para salir ");
            opcionBoolean = scanner.nextBoolean();

        }



    }
}