package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




double cantidadCompra,puntosAcumulados;

Scanner teclado = new Scanner(System.in);
System.out.println("Ingrese la cantidad de compra en (Pesos)");
cantidadCompra=teclado.nextInt();
teclado.close();
puntosAcumulados = cantidadCompra/10;



        String nivelFidelizacion = "";

        if (puntosAcumulados <=100 ) {nivelFidelizacion = "Bronce";}    
        if (puntosAcumulados >100 && puntosAcumulados <=500) {nivelFidelizacion = "Plata";}
        if (puntosAcumulados >500 && puntosAcumulados <=1000) {nivelFidelizacion = "Oro";
        double descuento= (cantidadCompra*10)/100;
        double descuento_aplicado = cantidadCompra-descuento;
        System.out.println("Se le realizará un descuento del 10% como valoración por su nivel de fidelización, su valor a pagar con el total del descuento es de : "+ descuento_aplicado); }
        if (puntosAcumulados >1000) {nivelFidelizacion = "Platino";
        double descuento= (cantidadCompra*10)/100;
        double descuento_aplicado = cantidadCompra-descuento;
        String cupon = "Redimible por un articulo del hogar";
        System.out.println("Se realizará un descuento del 10% como valoración por su nivel de fidelización, junto al cupón de premio: "+cupon+".");
        System.out.println("el total a pagar despues del descuento es de: "+ descuento_aplicado);}

        System.out.println("Su nivel de fidelización es: "+nivelFidelizacion+", con "+puntosAcumulados+" puntos acumulados");

        

    }
}