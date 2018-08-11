/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra1;

import java.io.IOException;
import java.util.Scanner;

// historia de los lenguajes de programacion

/**
 *
 * @author Ernesto Orellana
 * 
 */
public class Menu {
    int op, n1=0, n2=0, n3=0, pro=0; // Variables tipo enteras
    int bina; // Binario 
    Scanner read = new Scanner (System.in); // Leemos Variables
    Funciones fun = new Funciones(); //Llamamos Funciones
    
    public void MostrarMenu() throws IOException{
     do{
            System.out.println("----Menu Principal----");
            System.out.println("1.- Numero Par");
            System.out.println("2.- Multiplicacion");
            System.out.println("3.- 2 Numeros, Determinar Mayor");
            System.out.println("4.- 3 Numeros, Determinar Mayor");
            System.out.println("5.- Tabla de multiplicar");
            System.out.println("6.- Secuencia de numeros");
            System.out.println("7.- Secuencia de numeros hasta negativo");
            System.out.println("8.- Producto mendiante sumas");
            System.out.println("9.- Division mediante restas");
            System.out.println("10.- Mostrar Producto hasta presionar tecla");
            System.out.println("11.- Lee una secuencia de números y determina cual es el mayor de ellos ");
            System.out.println("12.- Calcular valor binario numero ingresado ");
            System.out.println("13.- Generar enteros de 3 en 3 comenzando por 2 hasta el valor máximo menor que Calculando la suma de los enteros generados que sean divisibles por 5");
            System.out.println("14.- Calcular la media de una secuencia de números, el proceso finalizará cuando el usuario pulse F");
            System.out.println("15.- Generar los N primeros términos de la serie de Fibonacci");
            System.out.println("16.- Leer una secuencia se números y mostrar cuáles de ellos es el mayor y el menor");
            System.out.println("17.- Leer una secuencia de números y sumar solo los pares mostrando el resultado del proceso. ");
            System.out.println("18.- Leer una secuencia de números y mostrar los 30 primeros pares leídos");
            System.out.println("19.- Leer una secuencia de números y mostrar la suma de los 30 números que ocupan posiciones de lectura par. ");
            System.out.println("20.- Leer un número y determinar su factorial");
            System.out.println("21.- Leer un número y determinar si es o no es primo ");
            System.out.println("22.- Leer una secuencia de 30 números y mostrar la suma de los primos");
            System.out.println("23.- Leer una secuencia de 30 números y mostrar la suma de su factorial. ");
            System.out.println("24.- Calcular el valor del número E (Euler) =(1/n!)");
            System.out.println("25.- Ejecutar la siguiente formula (n i)=n! / (i! * (n-i)!)");
            System.out.println("26.- Salir");
            System.out.print("Ingrese una opcion: ");
            op = read.nextInt();
            
            switch(op){
                case 1:
                    System.out.print("Ingrese un numero: ");
                    n1 = read.nextInt();
                    fun.pares(n1);
                    System.in.read();
                break;
                case 2:
                    System.out.print("Ingrese el primer numero: ");
                    n1 = read.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    n2 = read.nextInt();
                    fun.produs(n1, n2);
                    System.in.read();
                break;
                case 3:
                    System.out.print("Ingrese el primer numero: ");
                    n1 = read.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    n2 = read.nextInt();
                    fun.nummay(n1, n2);
                    System.in.read();
                break;
                case 4:
                    System.out.print("Ingrese el primer numero: ");
                    n1 = read.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    n2 = read.nextInt();
                    System.out.print("Ingrese el tercer numero: ");
                    n3 = read.nextInt();
                    fun.nummay3(n1, n2, n3);
                    System.in.read();
                break;
                case 5:
                    System.out.print("Ingrese el numero de la tabla de multiplicar: ");
                    n1 = read.nextInt();
                    fun.tablamult(n1);
                    System.in.read();
                break;
                case 6:
                    fun.produsum();
                    System.in.read();
                break;
                case 7:
                    fun.nega();
                    System.in.read();
                break;
                case 8:
                    System.out.print("Ingrese el primer dato: ");
                    n1 = read.nextInt();
                    System.out.print("Ingrese el segundo dato: ");
                    n2 = read.nextInt();
                    fun.prosum(n1, n2);
                    System.in.read();
                break;
                case 9:
                    System.out.print("Ingrese el Dividiendo: ");
                    n1 = read.nextInt();
                    System.out.print("Ingrese el Divisor: ");
                    n2 = read.nextInt();
                    fun.divirest(n1, n2);
                    System.in.read();
                break;
                case 10:
                        fun.tof();
                        System.in.read();
                break;
                case 11:
                    System.out.print("Ingrese cuantos numeros desea ingresar: ");
                    n1 = read.nextInt();
                    fun.onceava_opcion(n1);
                    System.in.read();
                    break;
                case 12:
                    System.out.print("Ingrese en numero a convertir: ");
                    bina = read.nextInt();
                    fun.doceava_opcion(bina);
                    System.in.read();
                    break;
                case 13:
                    fun.treceava_opcion();
                    System.in.read();
                    break;
                case 14:
                    fun.catorceava_opcion();
                    System.in.read();
                    break;
                case 15:
                    fun.quinceava_opcion();
                    System.in.read();
                    break;
                case 16:
                    fun.dieciseisava_opcion();
                    System.in.read();
                    break;
                case 17:
                    fun.diecisieteava_opcion();
                    System.in.read();
                    break;
                case 18:
                    fun.dieciochoava_opcion();
                    System.in.read();
                    break;
                case 19:
                    fun.diecinueveava_opcion();
                    System.in.read();
                    break;
                case 20:
                    fun.veinteava_opcion();
                    System.in.read();
                    break;
                case 21:
                    System.out.print("Ingrese en numero a determinar si es primo o no: ");
                    n1 = read.nextInt();
                    fun.veintiunava_opcion(n1);
                    System.in.read();
                    break;
                case 22:
                    fun.veintidosava_opcion();
                    System.in.read();
                    break;
                case 23:
                    System.out.println("Sacar Factorial Numero");
                    System.out.print("Ingrese un numero: ");
                    n1 = read.nextInt();
                    fun.veintitresava_opcion(n1);
                    break;
                case 24:
                   System.out.println("Valor de i: ");
                   n1 = fun.veinticuatroava_opcion();
                   System.out.println("Valor de n: ");
                   do{
                       n2 = fun.veinticuatroava_opcion();
                       
                   }while(n2<n1);
                   System.out.println("Resultado de " + n1 + " sobre " + n2 + "=" + fun.factorial(n1)/fun.factorial(n2)*fun.factorial(n1-n2));
                    break;
                case 25:
                    System.out.print("Trabajando...");
                    System.in.read();
                    break;
                case 26:
                    System.out.println("Saliendo del sistema...");
                    System.in.read();
                    System.exit(0);
                break;
                default:
                    System.out.print("Opcion no valida regresando al menu principal!");
                    System.in.read();
                break;
            }
        }while(op != 11);
        
    }
    
}
