/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio_vectores;

//leer 5 numeros por teclado

import java.util.Scanner;

//almacenarlo en un vector
//calcular las media de numeros positivos y negativos
//contar el numero de ceros

/**
 *
 * @author Felix Castro
 */
public class promeVector {
    public static void main(String[] args) {
        //leer datos por teclado
        Scanner entrada = new Scanner(System.in);
        
        //definicion de variables, vaectores, contadores y acumuladores
        float [] numeros;
        int cantNumeros;
        float sumPositivos = 0;
        float sumNegativos = 0;
        int contPositivos = 0;
        int contNegativos = 0;
        int contCeros = 0;
        float mediPositivos;
        float mediNegativos;
        
        System.out.println("CALCULADORA DE PROMEDIOS");
        System.out.println("---------------------------------");
        
        System.out.println("Digite entre cuantos numeros requiere calcular "
                + "promedio");
        cantNumeros = entrada.nextInt();
        
        //le damos tamaño al vector de 5
        numeros = new float[cantNumeros];
        
        System.out.println("---------------------------------");
        
        //llenamos el vector
        System.out.println("Ingresando y guardando numeros en el vector");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println((i+1)+".Ingrese un numero");
            numeros[i] = entrada.nextFloat();
            
            if (numeros[i] == 0) {
                contCeros++;
            } else {
                if (numeros[i] > 0) {
                    sumPositivos += numeros[i];
                    contPositivos++;
                } else {
                    sumNegativos += numeros[i];
                    contNegativos++;
                }
            }
        }
        
        //media o promedio de numeros positivos
        if (contPositivos == 0) {
            System.out.println("No hay numeros positivos para calcular "
                    + "el promedio");
        } else {
            mediPositivos = sumPositivos/contPositivos;
            System.out.println("El promedio de numeros "
                + "positivos es: "+mediPositivos);
        }
                
        //media o promedio de numeros negativos
        if (contNegativos == 0) {
            System.out.println("No hay numeros negativos para calcular "
                    + "el promedio");
        } else {
            mediNegativos = sumNegativos/contNegativos;
            System.out.println("El promedio de numeros "
                + "negativos es: "+mediNegativos);
        }
        
        //imprimos la cantidad de ceros
        System.out.println("La cantidad de ceros es: "+contCeros);
    }
}
