package edu.utvt.clase1;

public class ElseIfStatement {
    public static void main(String[] args) {
        int age = 21;

        if (age <= 12)
            System.out.print("Eres un niño");
        else if (age < 17)
            System.out.print("Eres un adolescente");
        else if (age < 35)
            System.out.print("Eres un adulto joven");
        else
            System.out.print("Eres un adulto");

    }
}
