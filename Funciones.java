/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra1;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Funciones {
    
    Scanner read = new Scanner (System.in);
    
    
      public Funciones(){
       //Constructor
      }
      //Primera Opcion
      public void pares(int nu1){
          if(nu1%2==0)
              System.out.println("El número " + nu1 + " es par");
          else
              System.out.println("El numero "+ nu1 + "es impar");
      }
      
      //Segunda Opcion
      public void produs(int nu1, int nu2){
         System.out.println("El producto de " + nu1 + " y " + nu2 + " es: " + nu1*nu2);
      }
      
      //Tercera Opcion
      public void nummay(int nu1, int nu2){
          if(nu1>nu2)
              System.out.println("El numero mayor es: " + nu1);
          else
              System.out.println("El numero mayor es: " + nu2);
      }
      
      //Cuarta Opcion
      public void nummay3(int nu1, int nu2, int nu3) {          
          if (nu1 > nu2) {
            if (nu1 > nu3) {
                System.out.println("El mayor es: " + nu1);
            } else {
                System.out.println("El mayor es: " + nu3);
            }
            
        } else if (nu2 > nu3) {
            System.out.println("El mayor es: " + nu2);
        } else {
            System.out.println("El mayor es: " + nu3);
        } 
          
    }
      
      //Quinta Opcion
      public void tablamult(int nu1){
          for(int i = 1; i<=10; i++) {
                System.out.println(i + " * " + nu1 + " = " + i*nu1);
            }
      }
      
      //Sexta Opcion
      public void produsum(){
          int num=0, suma=0, producto=1;
          for(int i=1; i<=30; i++){
             System.out.print("Ingrese el dato " +i+": ");
             num = read.nextInt();
             suma = suma + num;
             producto = producto * num;
          }
          System.out.println("La suma total es: "+suma);
          System.out.println("El Producto total es: "+producto);
      }
      
      //Septima Opcion
      public void nega(){
          int num=0, i=0, suma=0;
          do{
             i++;
             System.out.print("Ingrese el dato " +i+": ");
             num = read.nextInt();   
             if(num>0){
             suma= suma + num;
             }
          }while(num>0);
          System.out.println("La Suma total es: "+suma);
      }
      
    //Octava Opcion
    public void prosum(int nu1, int nu2){
        int pro=0;
        while(nu2!=0){
            pro=pro+nu1;
            nu2 = nu2 - 1;
        }
        
        System.out.println("El producto es: " + pro);
        
    }
    
    //Novena Opcion
    public void divirest(int nu1, int nu2){
        int cociente=0, resi = 0;
        if(nu1==0){
            System.out.print("No se pudo realizar la formula");
        } else {
            resi=nu1;
            while(resi>=nu2){
                resi = resi - nu2;
                cociente = cociente + 1;
            }
        }
        System.out.println("El Cociente es: " + cociente);
        System.out.println("El Residuo es: " + resi);
    }

   
    //Decima Opcion
    public void tof(){
        String opi;
        int i=0, num=0, produ=1;
        
        do{
            i++;
            System.out.print("Ingrese el dato " +i+": ");
            num = read.nextInt();
            produ = produ * num;
            
            System.out.println("Desea continuar? F=No, S=Si");
            opi = new Scanner(System.in).nextLine();
            opi = opi.toUpperCase();
            
        }while (!opi.equals("F"));
        
        System.out.println("El producto total es: " + produ);
    }

    
    // Onceava Opcion
    //Secuencia Numeros determinar cual es el mayor.
    
    public void onceava_opcion(int secuencia){
        
        int nu1=0, nu2=0, mayor=0;
        
        for(int i=1; i<=secuencia; i++){
            System.out.println("Ingrese el dato " + i);
            nu1 = read.nextInt();
            if(nu2<nu1){
                mayor=nu1;
            }
            
            nu2=nu1;  
        }
        
        System.out.print("El numero mayor es: "+ mayor);
        
    }
    
    // Doceava opcion
    // Mostrar valor binario de numero ingresado
    
    public void doceava_opcion(int numero_binario){
        double expo = 0, bin = 0, dig;
        
        while(numero_binario!=0){
                dig = numero_binario % 2;     
                bin = bin + dig * Math.pow(10, expo);   
                expo++;
                numero_binario = numero_binario/2;
        }
        System.out.printf("Binario: %.0f", bin);
    }

    //Treceava opcion
    //Generar Enteros de 3 en 3 hasta 2
    
    public void treceava_opcion(){
    int suma=0;
    for(int i=1; i<30; i+=3){
        i= i%5;
        if(i==0){
           suma = suma + i;            
        }
        
    }
    System.out.print("La suma es: " + suma);
    }
    
    public void catorceava_opcion(){
        int num_leer, contador=0, media, acomulador=0;
        String opi;
        
        do{
            System.out.printf(" Digite un numero: ");
            num_leer=read.nextInt();
            System.out.printf(" Precione 'f' para salir y 's' para seguir");
            opi = new Scanner(System.in).nextLine();
            opi = opi.toUpperCase();
            contador++;
            acomulador = acomulador + num_leer;
        }while (!opi.equals("F"));
        
        media = (acomulador / contador);
        
        System.out.println(" La media es: "+media);    
    }
    
  
    
    
    
    
    public void quinceava_opcion(){
        
        int numeroN,num_serieF1=1, num_serieF2=1, serieFibonaci=0;
        
        
        do{
            System.out.printf("Ingrese el valor N 'osea el valor maximo para la serie': ");
            numeroN=read.nextInt();
        
            if(numeroN<1){
            System.out.println(" El numero "+numeroN+" no es valido");
            }  
        }while(numeroN<1);
        
        if(numeroN>=1){
            do{
                serieFibonaci=num_serieF1+num_serieF2;
                num_serieF1=serieFibonaci-num_serieF1;
                num_serieF2=serieFibonaci;
                
            }while(serieFibonaci<=numeroN); 
        }
        
    }
    
    public void dieciseisava_opcion(){
         int num_leer=0, Nmayor, Nmenor, validadorMayor, validadorMenor;
        
        validadorMayor=num_leer-1;
        validadorMenor=num_leer+1;
        
        
        do{
            System.out.printf("Ingrese un numero: ");
            num_leer=read.nextInt();
          
            if(num_leer>validadorMayor){
                validadorMayor=num_leer;
            }
            else
            if(num_leer<validadorMenor){
                validadorMenor=num_leer;
            }
  
            
        }while(num_leer%2==0);
        
        System.out.println(" EL numero mayor es: "+validadorMayor);
        System.out.println(" EL numero menor es: "+validadorMenor);

    }
    
    public void diecisieteava_opcion(){
        int tam_secu, num_leer, sumaPares=0;
        
        System.out.printf("Ingrese la secuencia a ejecutar: ");
        tam_secu=read.nextInt();
        
        for(int i=0; i<tam_secu; i++){
            System.out.printf("Ingrese un numero: ");
            num_leer=read.nextInt();
            
            if(num_leer%2==0){
                sumaPares=sumaPares+num_leer;
            }
        }
        System.out.println("La suma de los numeros pares ingresados es: "+sumaPares);

    }
    
    public void dieciochoava_opcion(){
        int contador=0, num_leer,  i;
        int vector[];
        vector = new int[5];
        
        for(i=0; i<5; i++){
            System.out.printf("Ingrese un numero: ");
            num_leer=read.nextInt();
           
            if(num_leer%2==0){
                vector[contador]=num_leer;
                contador++;  
            }
        }
        
        System.out.println(" Los primeros 30 numeros pares leidos son: ");
        for(i=0; i<contador; i++){
            System.out.printf(" "+vector[i]+" ");
        }
    }
    
    public void diecinueveava_opcion(){
         int matriz[];
        int ingreso=0, suma=0;
        matriz = new int [50];
        
        for(int i=1; i<=30; i++){
            System.out.println("Ingrese un numero: ");
            ingreso=read.nextInt();
            matriz[i]=ingreso;
        }
        for(int j=2; j<=30; j+=2){
            suma=suma+matriz[j];
            System.out.println("Posicion No. " +j+ " Es igual a: " +matriz[j]);
            
        }
       
    
    }
    
    public void veinteava_opcion(){
        
        int num_leer, factorial=1, proceso, aux;
        System.out.printf("Ingrese un numero para ver su factorial: ");
        num_leer=read.nextInt();
        System.out.println(" El factorial de "+num_leer+ " es: "+factorial(num_leer));
    }
    
    public void veintiunava_opcion(int numero){
   
        /**
         * 
         * 
        boolean primo = true; 
        for(int i = 2; i < n1; i++) {
            if (n1 % i == 0) {
               primo = false;
           }
        }
    
    if(primo){
        System.out.print("el numero es primo.");
   }else{
       System.out.print("el numero no es primo.");
 *   }
 *
 * 
 * 
 * 
   */
        
        int contador;
        
        contador = 0;
 
        for(int i = 1; i <= numero; i++)
        {
            if((numero % i) == 0)
            {
                contador++;
            }
        }
 
        if(contador <= 2)
        {
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }

        
            
    }
    
    public void veintidosava_opcion(){
        //22.	Leer una secuencia de 30 números y mostrar la suma de los primos. 
        
        
        int contador, numero=0, suma=0;
        
        contador = 0;
        
       for(int j=0; j<30; j++){
           numero = 0; 
           contador = 0;
           System.out.print("Ingrese el dato " + j + ": ");
           numero = read.nextInt();
 
        for(int i = 1; i <= numero; i++){
            if((numero % i) == 0){
                contador++;
            }
        }
        
        if(contador <= 2){
            suma = suma + numero;
         }
        
       }
       
       System.out.print("La suma total de primos es: " + suma);
       
    }
    
    public void veintitresava_opcion(int nume){
        int fact = 1;
        for (int i = 1; i <= nume; i++) {
            fact *= i;
        }
        
        System.out.print("El Factorial es: " + fact);
    }
    
    
    
    
    
    
    
    
    public int veinticuatroava_opcion(){
      int a;
      do{
          System.out.print("Escribe un valor: ");
          a = read.nextInt();
      }while(a<0);
      
      return a;
    }
    
    public int factorial(int x){
        int f=1;
         for (int i = 1; i <= x; i++) {
            f *= i;
        }
         return f;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}//Fin Clase
