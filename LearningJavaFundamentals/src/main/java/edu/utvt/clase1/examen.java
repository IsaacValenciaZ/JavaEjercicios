package edu.utvt.clase1;

import java.util.Scanner;

public class examen {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Ingresa el número de ciclos: ");
                int ciclos = scanner.nextInt();

                System.out.println("\nImprimiendo el número de ciclos ");

                for (int primero = 0; primero < ciclos; primero++) {
                    for (int segundo = 0; segundo < (ciclos - primero); segundo++) {
                        System.out.print(".");
                    }
                    System.out.println();
                }

                scanner.close();
            }
        }


