/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Inicio {
    public class Preguntasyrespuestas{
    
    private int Valorpregunta=2;
    public int puntaje=0;
    private String Preguntas;
    private String Respuestas;

    public Preguntasyrespuestas(String Preguntas, String Respuestas) {
        this.Preguntas = Preguntas;
        this.Respuestas = Respuestas;
    }

    public String getRespuestas() {
        return Respuestas;
    }

    public void setRespuestas(String Respuestas) {
        this.Respuestas = Respuestas;
    }

    public int getValorpregunta() {
        return Valorpregunta;
    }

    public void setValorpregunta(int Valorpregunta) {
        this.Valorpregunta = Valorpregunta;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getPreguntas() {
        return Preguntas;
    }

    public void setPreguntas(String Preguntas) {
        this.Preguntas = Preguntas;
    } 

    
    Scanner preguntas=new Scanner (System.in);
    
    
} 

 
String Preguntas ;
String Respuestas;
int Valorpregunta=0;
int puntaje; 

    public void datospreguntasyrespuestas(){
        String Pregunta1="A que esta Orientado el lenguaje de programacion java";
        String respuesta1="POO";
        String Pregunta2="¿Qué es una variable en Java?";
        String respuesta2="Es un espacio de memoria en el que guardamos un determinado valor o dato.";
        String Pregunta3="¿Qué es una clase en Java?";
        String respuesta3="Se define la forma de un objeto; en ella se agrupan datos y métodos que operarán sobre esos datos.";
        String Pregunta4="¿Qué es una librería en Java?";
        String respuesta4="Es un conjunto de clases que facilitan operaciones y tareas ofreciendo al programador";
        String Pregunta5="¿Para qué sirve el ´this' en Java? ";
        String respuesta5="Esto se puede usar para acceder a los miembros de la clase y como referencia a la instancia actual";
        String Pregunta6="¿Qué es el polimorfismo? ";
        String respuesta6="significa que tiene muchas formas.";
        String Pregunta7="¿Qué es la encapsulación?";
        String respuesta7="Mantener el código protegido. ";
        String Pregunta8="¿Para qué sirve el especificador Publico?";
        String respuesta8="son visibles en el mismo paquete, así como en el paquete externo que es para los otros paquetes.";
        String Pregunta9="¿Para qué sirve el especificador Privado?";
        String respuesta9="Solo se ven en la misma clase y no para otras clases en el mismo paquete";
        String Pregunta10="¿Para qué sirve el try en Java?";
        String respuesta10="prever excepciones en el transcurso de la ejecución de un programa";
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Que inicie el juego ");
        System.out.println("1-Primera pregunta : " +Pregunta1);
        
        String Respuestas = entrada.nextLine();
        if (respuesta1.equalsIgnoreCase(respuesta1)){
            puntaje=+1;
            System.out.println("Respuesta Correcta ");
        }else{
            System.out.println("Respuesta incorrecta, La respuesta corresta es : "+respuesta1);
            
        }
        System.out.println("2-Segunda pregunta  " + Pregunta2);
        
        String Preguntas2 = entrada.next();
        
        if (respuesta2.equalsIgnoreCase(respuesta2)){
            puntaje=+1;
            System.out.println("Respuesta Correcta ");
        }else{
            System.out.println("Respuesta incorrecta, La respuesta corresta es : "+respuesta2);
        }
        System.out.println("3- Tercera pregunta  " + Pregunta3);
        
        String Preguntas3 = entrada.next();
        
        if (respuesta3.equalsIgnoreCase(respuesta3)){
           puntaje=+1;
            System.out.println("Respuesta Correcta ");
        }else{
            System.out.println("Respuesta incorrecta, La respuesta corresta es : "+respuesta3);
        }    
        
        System.out.println("4- Cuarta pregunta  " + Pregunta4);
        
        String Preguntas4 = entrada.next();
        
        if (respuesta4.equalsIgnoreCase(respuesta4)){
            puntaje=+1;
            System.out.println("Respuesta Correcta ");
        }else{
            System.out.println("Respuesta incorrecta, La respuesta corresta es : "+respuesta4);
        }
        
        System.out.println("5-Quinta pregunta  " + Pregunta5);
        
        String Preguntas5 = entrada.next();
        
        if (respuesta5.equalsIgnoreCase(respuesta5)){
           puntaje=+1;
            System.out.println("Respuesta Correcta ");
        }else{
            System.out.println("Respuesta incorrecta, La respuesta corresta es : "+respuesta5);
        }
            
        System.out.println("6-Sexta pregunta  " + Pregunta6);
        
        String Preguntas6 = entrada.next();
        
        if (respuesta6.equalsIgnoreCase(respuesta6)){
            puntaje=+1;
            System.out.println("Respuesta Correcta ");
        }else{
            System.out.println("Respuesta incorrecta, La respuesta corresta es : "+respuesta6);
        }
        
        System.out.println("7-Séptima pregunta " + Pregunta7);
        
        String Preguntas7 = entrada.next();
        
        if (respuesta7.equalsIgnoreCase(respuesta7)){
           puntaje=+1;
            System.out.println("Respuesta Correcta ");
        }else{
            System.out.println("Respuesta incorrecta, La respuesta corresta es : "+respuesta7);
        }
        
        System.out.println("8-Octava pregunta  " + Pregunta8);
        
       String Preguntas8 = entrada.next();
        
        if (respuesta8.equalsIgnoreCase(respuesta8)){
           puntaje=+1;
            System.out.println("Respuesta Correcta ");
        }else{
            System.out.println("Respuesta incorrecta, La respuesta corresta es : "+respuesta8);
        }
        
        System.out.println("9-Novena pregunta " + Pregunta9);
        
        String Preguntas9 = entrada.next();
        
        if (respuesta9.equalsIgnoreCase(respuesta9)){
            puntaje=+1;
            System.out.println("Respuesta Correcta ");
        }else{
            System.out.println("Respuesta incorrecta, La respuesta corresta es : "+respuesta9);
        }
        System.out.println("10-Décima pregunta " + Pregunta10);
        
        String Preguntas10 = entrada.next();
        
        if (respuesta10.equalsIgnoreCase(respuesta10)){
          puntaje=+1;
            System.out.println("Respuesta Correcta ");
        }else{
            System.out.println("Respuesta incorrecta, La respuesta corresta es : "+respuesta10);
        }   
        
        System.out.println("Tu Puntaje fue : " + Valorpregunta*puntaje);
    } 
    
    
}


    

