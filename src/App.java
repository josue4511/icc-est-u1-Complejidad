import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int[] datos = {5, 2, 8, 1, 9, 4, 3, 7, 6};
        int n = datos.length;
        System.out.println("Eliga opcion ah ejecutar");
        System.out.println("1.Constantes");
        System.out.println("2.Cuadratica");
        System.out.println("3.Cubica");
        System.out.println("4.Exponencial");
        System.out.println("5.Factorial");
        System.out.println("6.Lineal");
        System.out.println("7.Linearithmic");
        System.out.println("8.Logaritmica");
        int opcion = lector.nextInt();
        if (opcion == 1) {
            Constante constante = new Constante();
        System.out.println("Primer elemento: " + constante.obtenerPrimerElemento(datos));
        }

        if (opcion == 2) {
            Cuadratica cuadratica = new Cuadratica();
            cuadratica.bubbleSort(datos);
            System.out.println("Arreglo ordenado: " + java.util.Arrays.toString(datos));
        }

        if (opcion == 3){
            int sumaObjetivo = 16;
            Cubica cubica = new Cubica();
            cubica.buscarTriosQueSumen(datos, sumaObjetivo);
           
        }
        if (opcion == 4){
            Exponencial exponencial = new Exponencial();
            int nFibonacci = n; 
            System.out.println("Fibonacci de " + nFibonacci + " es: " + exponencial.fibonacciRecursivo(nFibonacci));
        }
        if(opcion == 5){
            Factorial factorial = new Factorial();
             String nFactorial = "ABC";
             String respuesta = "";
            factorial.generarPermutaciones(nFactorial, respuesta);
            System.out.println("Permutaciones de " + nFactorial + ":");
        }
        if (opcion == 6){
            Lineal lineal = new Lineal();
            lineal.imprimirLista(datos);
        }
        if (opcion == 7){
            Linearithmic linearithmic = new Linearithmic();
            linearithmic.ordenar(datos);
            System.out.println("Arreglo ordenado: " + java.util.Arrays.toString(datos));
        }
        if (opcion == 8){
            System.out.println("Ingresa el numero a buscar en el arreglo ordenado:");
            int mit = lector.nextInt();
            Logaritmica logaritmica = new Logaritmica();
            logaritmica.busquedaBinaria(datos, 5 );
            System.out.println("El numero " + mit + " se encuentra en el arreglo: " + logaritmica.busquedaBinaria(datos, mit));
        }
         else {
            System.out.println("Opcion no valida");
         
        }



        
    }
    
}

