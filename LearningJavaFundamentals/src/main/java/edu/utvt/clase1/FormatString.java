package edu.utvt.clase1;

public class FormatString {
    public static void main(String[] args) {

        String name= "Isaac Valencia";
        String age= "15";

    //Concatenacion de cadenas en JAVA
        String message = "Hola " + name + " con tue dad actual " + age + " ya eres mayor de edad.";
        System.out.println(message);

        StringBuffer sb = new StringBuffer();
        sb.append("Hola ");
        sb.append(name);
        sb.append(" con tu edad actual  ");
        sb.append(age);
        sb.append(" ya eres mayor de edad. ");

        System.out.println(sb.toString());

        //String.Format
        String DefaultMessage = "Hola %s  con tu edad actual  %s ya eres mayor de edad.";
        String newMessage = String.format(DefaultMessage, name, age);
        System.out.println(newMessage);
        //necesito especificar el tipo de dato con una letra especifica



    }
}
