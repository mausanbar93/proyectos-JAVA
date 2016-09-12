package calculadora;

import java.io.*;

/**
 *
 * @author Mauricio Sánchez Calculadora en JAVA
 */
public class Calculadora {

    public static void main(String[] args) {
        try {

            // Se crea las variables	
            int num1, num2, operar;
            // Se crea el buffer de almacenamiento
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("/*************************/");
            System.out.println("/****** CALCULADORA ******/");
            System.out.print("Ingrese el primer Numero (Debe ser el mayor de los dos) : ");
            num1 = Integer.parseInt(br.readLine());
            System.out.print("Ingrese el segundo Numero: ");
            num2 = Integer.parseInt(br.readLine());
            System.out.println("/*************************/");
            do {
                System.out.println("/** MENU DE OPERACIONES **/");
                System.out.println("1. SUMAR");
                System.out.println("2. RESTAR");
                System.out.println("3. MULTIPLICAR");
                System.out.println("4. DIVIDIR");
                System.out.println("5. CUADRADO");
                System.out.println("6. POTENCIACION");
                System.out.println("7. RAIZ");
                System.out.println("8. SALIR");
                System.out.println("Ingrese Opcion a ejecutar: ");
                operar = Integer.parseInt(br.readLine());
                
                // Logica del programa
                System.out.println("/*************************/");
                if (operar == 1) {
                    int suma = num1 + num2;
                    System.out.println("El resultado de la suma es: " + suma);
                }
                if (operar == 2) {
                    int resta = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resta);
                }
                if (operar == 3) {
                    int multi = num1 * num2;
                    System.out.println("El resultado de la multiplicacion es: " + multi);
                }
                if (operar == 4) {
                    int divi = num1 / num2;
                    System.out.println("El resultado de la division es: " + divi);
                }
                if (operar == 5) {
                    int cuad1 = num1 * num1;
                    int cuad2 = num2 * num2;
                    System.out.println("El resultado de la operacion para el primer numero es: " + cuad1);
                    System.out.println("El resultado de la operacion para el segundo numero es: " + cuad2);
                }
                if (operar == 6) {
                    int pot = (int) Math.pow(num1, num2);
                    System.out.println("El resultado de la potenciacion es: " + pot);
                }
                if (operar == 7) {
                    int raiz = (int) Math.pow(num1, (1 / num2));
                    System.out.println("El resultado de la raiz es: " + raiz);
                }

                if (operar == 8) {
                    System.out.println("ADIOS");
                }
                System.out.println("/*************************/");
            } while (operar != 8);
        } catch (Exception ex) {
        }
    }
}