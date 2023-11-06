import java.util.Scanner;

public class validacion{


    public validacion() {
    }

    public int[] validaroLineal() {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[4];
        int gLineal;

        do {
            System.out.println("Por favor digita el valor de G debe ser un entero positivo: ");

            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            gLineal = scanner.nextInt();

            if (gLineal<= 0) {
                System.out.println(gLineal + " no es un número entero positivo. Por favor intenta de nuevo.");
            }
        } while (gLineal <= 0);

        System.out.println("Has ingresado un número entero positivo: " + gLineal);

        vector[0]=gLineal;
        int kLineal;
        do {
            System.out.println("Por favor digita el valor K debe ser un entero positivo: ");

            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            kLineal = scanner.nextInt();

            if (kLineal<= 0) {
                System.out.println(kLineal + " no es un número entero positivo. Por favor intenta de nuevo.");
            }
        } while (kLineal <= 0);

        System.out.println("Has ingresado un número entero positivo: " + kLineal);

        vector[1]=kLineal;
        int cLineal;
        do {
            System.out.println("Por favor digita el valor C debe ser un entero positivo: ");

            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            cLineal = scanner.nextInt();

            if (cLineal<= 0) {
                System.out.println(cLineal + " no es un número entero positivo. Por favor intenta de nuevo.");
            }
        } while (cLineal <= 0);

        System.out.println("Has ingresado un número entero positivo: " + cLineal);
        vector[2]=cLineal;

        int X_0Lineal;
        do {
            System.out.println("Por favor digita el valor X_0, debe ser un entero positivo: ");

            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            X_0Lineal = scanner.nextInt();

            if (X_0Lineal<= 0) {
                System.out.println(X_0Lineal + " no es un número entero positivo. Por favor intenta de nuevo.");
            }
        } while (X_0Lineal <= 0);

        System.out.println("Has ingresado un número entero positivo: " + X_0Lineal);

        vector[3]=X_0Lineal;
        return vector;


    }


    public int validarorCuadradosMedios() {
        Scanner scanner = new Scanner(System.in);

        int X_0Cuadrado;

        do {
            System.out.println("Por favor digita el valor X_0, debe ser un entero positivo: ");

            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            X_0Cuadrado = scanner.nextInt();

            if (X_0Cuadrado<= 0) {
                System.out.println(X_0Cuadrado + " no es un número entero positivo. Por favor intenta de nuevo.");
            }
        } while (X_0Cuadrado <= 0);

        System.out.println("Has ingresado un número entero positivo: " + X_0Cuadrado);

        return X_0Cuadrado;


    }

    public int[] productosMedios() {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[4];


        int X_0Producto;

        do {
            System.out.println("Por favor digita el valor X_0, debe ser un entero positivo: ");

            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            X_0Producto = scanner.nextInt();

            if (X_0Producto<= 0) {
                System.out.println(X_0Producto + " no es un número entero positivo. Por favor intenta de nuevo.");
            }
        } while (X_0Producto <= 0);

        System.out.println("Has ingresado un número entero positivo: " + X_0Producto);

        vector[0]=X_0Producto;
        int X_1Producto;

        do {
            System.out.println("Por favor digita el valor X_1, debe ser un entero positivo: ");

            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            X_1Producto = scanner.nextInt();

            if (X_1Producto<= 0) {
                System.out.println(X_1Producto + " no es un número entero positivo. Por favor intenta de nuevo.");
            }
        } while (X_1Producto <= 0);

        System.out.println("Has ingresado un número entero positivo: " + X_1Producto);
        vector[1]=X_1Producto;

        return vector;
    }
    public int[] validarMultConstante() {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[2];
        int aMultiplicacion;

        do {
            System.out.println("Por favor digita el valor de A,debe ser un entero positivo: ");

            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            aMultiplicacion = scanner.nextInt();

            if (aMultiplicacion<= 0) {
                System.out.println(aMultiplicacion + " no es un número entero positivo. Por favor intenta de nuevo.");
            }
        } while (aMultiplicacion <= 0);

        System.out.println("Has ingresado un número entero positivo: " + aMultiplicacion);

        vector[0]=aMultiplicacion;
        int X_0Multiplicacion;

        do {
            System.out.println("Por favor digita el valor X_0, debe ser un entero positivo: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            X_0Multiplicacion = scanner.nextInt();

            if (X_0Multiplicacion<= 0) {
                System.out.println(X_0Multiplicacion + " no es un número entero positivo. Por favor intenta de nuevo.");
            }
        } while (X_0Multiplicacion <= 0);

        System.out.println("Has ingresado un número entero positivo: " + X_0Multiplicacion);
        vector[1]=X_0Multiplicacion;

        return vector;
    }

    public int[] validarMultiplicacion(){
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[4];
       

        int X_0Multi;

        do {
            System.out.println("Por favor digita el valor de X_0,debe ser un entero positivo: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            X_0Multi = scanner.nextInt();

            if (X_0Multi<= 0) {
                System.out.println(X_0Multi + " no es un número entero positivo. Por favor intenta de nuevo.");
            }
        } while (X_0Multi <= 0);

        System.out.println("Has ingresado un número entero positivo: " + X_0Multi);

        vector[0]=X_0Multi;
        int gMulti;

        do {
            System.out.println("Por favor digita el valor de G,debe ser un entero positivo: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            gMulti = scanner.nextInt();

            if (gMulti<= 0) {
                System.out.println(gMulti + " no es un número entero positivo. Por favor intenta de nuevo.");
            }
        } while (gMulti <= 0);

        System.out.println("Has ingresado un número entero positivo: " + gMulti);
        vector[1]=gMulti;



        int kMulti;

        do {
            System.out.println("Por favor digita el valor de K, debe ser un entero positvo: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            kMulti = scanner.nextInt();

            if (kMulti<= 0) {
                System.out.println(kMulti + " no es un número entero positivo. Por favor intenta de nuevo.");
            }
        } while (kMulti <= 0);

        System.out.println("Has ingresado un número entero positivo: " + kMulti);
        vector[2]=kMulti;

        int aMulti;

        do {
            System.out.println("Por favor digita el valor de A:,debe ser un entero positivo ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            aMulti = scanner.nextInt();

            if (aMulti<= 0) {
                System.out.println(aMulti + " no es un número entero positivo. Por favor intenta de nuevo.");
            }
        } while (aMulti <= 0);

        System.out.println("Has ingresado un número entero positivo: " + aMulti);
        vector[3]=aMulti;


        return vector;


    }

    public int[] validarAditivo(){
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[6];

        int mAditivo;

        do {
            System.out.println("Por favor digita el valor de M, debe ser un entero positivo: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            mAditivo = scanner.nextInt();

            if (mAditivo<= 0) {
                System.out.println(mAditivo + " no es un número entero positivo. Por favor intenta de nuevo.");
            }
        } while (mAditivo <= 0);

        System.out.println("Has ingresado un número entero positivo: " + mAditivo);

        vector[0]=mAditivo;

        int X_0Aditivo;

        do {
            System.out.println("Por favor digita el valor de X_0,debe ser entero positivo: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            X_0Aditivo = scanner.nextInt();

            if (X_0Aditivo<= 0) {
                System.out.println(X_0Aditivo + " no es un número entero positivo. Por favor intenta de nuevo.");
            }
        } while (X_0Aditivo <= 0);

        System.out.println("Has ingresado un número entero positivo: " + X_0Aditivo);
        vector[1]=X_0Aditivo;



        int X_1Aditivo;

        do {
            System.out.println("Por favor digita el valor de X_1, debe ser un entero positivo: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            X_1Aditivo = scanner.nextInt();

            if (X_1Aditivo<= 0) {
                System.out.println(X_1Aditivo + " no es un número entero positivo. Por favor intenta de nuevo.");
            }
        } while (X_1Aditivo <= 0);

        System.out.println("Has ingresado un número entero positivo: " + X_1Aditivo);
        vector[2]=X_1Aditivo;

        int X_2Aditivo;

        do {
            System.out.println("Por favor digita el valor de X_2, debe ser un entero positivo: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            X_2Aditivo = scanner.nextInt();

            if (X_2Aditivo<= 0) {
                System.out.println(X_2Aditivo + " no es un número entero positivo. Por favor intenta de nuevo.");
            }
        } while (X_2Aditivo <= 0);

        System.out.println("Has ingresado un número entero positivo: " + X_2Aditivo);
        vector[3]=X_2Aditivo;


        int X_3Aditivo;

        do {
            System.out.println("Por favor digita el valor de X_3, debe ser un entero positivo: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            X_3Aditivo = scanner.nextInt();

            if (X_3Aditivo<= 0) {
                System.out.println(X_2Aditivo + " no es un número entero positivo. Por favor intenta de nuevo.");
            }
        } while (X_3Aditivo <= 0);

        System.out.println("Has ingresado un número entero positivo: " + X_3Aditivo);
        vector[4]=X_3Aditivo;

        int X_4Aditivo;

        do {
            System.out.println("Por favor digita el valor de X_4,debe ser un entero positivo: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            X_4Aditivo = scanner.nextInt();

            if (X_4Aditivo<= 0) {
                System.out.println(X_2Aditivo + " no es un número entero positivo. Por favor intenta de nuevo.");
            }
        } while (X_4Aditivo <= 0);

        System.out.println("Has ingresado un número entero positivo: " + X_4Aditivo);
        vector[5]=X_4Aditivo;

        return vector;


    }


    public int[] validarNoLinealCuadratica(){
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[5];

        int gCuadratica;

        do {
            System.out.println("Por favor digita el valor de G,debe ser un entero positivo: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            gCuadratica = scanner.nextInt();

            if (gCuadratica<= 0) {
                System.out.println(gCuadratica + " no es un número entero positivo. Por favor intenta de nuevo.");
            }
        } while (gCuadratica <= 0);

        System.out.println("Has ingresado un número entero positivo: " + gCuadratica);

        vector[0]=gCuadratica;

        int cCuadratica;

        do {
            System.out.println("Por favor digita el valor de C, debe ser un entero positivo e impar: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            cCuadratica = scanner.nextInt();

            if (cCuadratica<= 0 && cCuadratica % 2==0) {
                System.out.println(cCuadratica + " no es un número entero positivo tampoco es impar. Por favor intenta de nuevo.");
            }
        } while (cCuadratica <= 0);

        System.out.println("Has ingresado un número entero positivo: " + cCuadratica);
        vector[1]=cCuadratica;



        int aCuadratica;

        do {

            System.out.println("Por favor digita el valor de A,debe ser un entero positivo y par: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            aCuadratica = scanner.nextInt();

            if (aCuadratica<= 0 && aCuadratica%2 !=0 ) {
                System.out.println(aCuadratica + " no es un número entero positivo ni par. Por favor intenta de nuevo.");
            }
        } while (aCuadratica <= 0);

        System.out.println("Has ingresado un número entero positivo: " + aCuadratica);
        vector[2]=aCuadratica;

        int bCuadratica;

        do {

            System.out.println("Por favor digita el valor de B,debe ser un entero positivo: ");

            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            bCuadratica = scanner.nextInt();

            if (bCuadratica<= 0) {
                System.out.println(bCuadratica + " no es un número entero positivo. Por favor intenta de nuevo.");
            }
        } while (bCuadratica <= 0);

        System.out.println("Has ingresado un número entero positivo: " + bCuadratica);
        vector[3]=bCuadratica;


        int X_0Cuadratica;

        do {
            System.out.println("Por favor digita el valor de X_0, debe ser un entero positivo: ");
            while (!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println(input + " no es un número entero. Por favor intenta de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
            }

            X_0Cuadratica = scanner.nextInt();

            if (X_0Cuadratica<= 0) {
                System.out.println(X_0Cuadratica + " no es un número entero positivo. Por favor intenta de nuevo.");
            }
        } while (X_0Cuadratica <= 0);

        System.out.println("Has ingresado un número entero positivo: " + X_0Cuadratica);
        vector[4]=X_0Cuadratica;



        return vector;


    }
}
