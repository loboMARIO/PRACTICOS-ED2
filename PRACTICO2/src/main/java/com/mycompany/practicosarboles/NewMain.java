/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicosarboles;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         MVias<Integer,String> arbol=new MVias<>(4);
        arbol.insertar(80,"a");
        arbol.insertar(120,"b");
        arbol.insertar(200,"c");
        arbol.insertar(50,"d");
        arbol.insertar(70, "e");
        arbol.insertar(75,"f");
        arbol.insertar(72,"g");
        arbol.insertar(98,"h");
        arbol.insertar(110,"i");
        arbol.insertar(130,"j");
        arbol.insertar(140,"a");
        arbol.insertar(150, "b");
        arbol.insertar(134, "c");
        arbol.insertar(160, "d");
        arbol.insertar(170, "b");
        arbol.insertar(190, "c");
        arbol.insertar(158, "d");
        arbol.insertar(400, "b");
        arbol.insertar(500, "c");
        arbol.insertar(560, "d");
        Scanner entrada=new Scanner(System.in);
        Scanner datos=new Scanner(System.in);
        System.out.println("                            SELECCION EL NUMERO DE PREGUNTA QUE DESEE");
        System.out.println("1:TODOS LOS METODOS DE LA INTERFAZ IMPLEMENTADOS");
        System.out.println("2:PREGUNTA 2");
        System.out.println("3:PREGUNTA 3");
        System.out.println("4:PREGUNTA 4");
        System.out.println("5:PREGUNTA 5");
        System.out.println("6:PREGUNTA 6");
        System.out.println("7:PREGUNTA 7");
        System.out.println("8:PREGUNTA 8");
        System.out.println("9:PREGUNTA 9");
        System.out.println("\n Recorrido Por Niveles ===> "+arbol.recorridoPorNiveles());
        System.out.println("\n Recorrido In Orden ===> "+arbol.recorridoEnInOrden());
        int numeroPregunta;
        boolean a=true;
        while (a==true) {
           int x=0; 
            System.out.print("\nIngrese una Opcion: ");
            numeroPregunta=entrada.nextInt();System.out.println("");
            
        switch(numeroPregunta){
            case 1:
                System.out.println("TENGO LOS METODOS IMPLEMENTADOS POR FAVOR VERIFIQUE LOS CODIGOS EN SU RESPECTIVA CLASE");
                break;
                
            case 2:
                System.out.println("NO DISPONIBLE");
                 break;   
                 
             case 3:
                 System.out.print("INGRESE EL NIVEL A BUSCAR : ");
                 x=datos.nextInt();
                 System.out.print("CANTIDAD DE NODOS NO VACIOS EN EL NIVEL "+x+" DEL ARBOL M-VIAS: "+arbol.contarDatosNoVaciosEnNivel(x)+"\n");
                 break;
                 
             case 4:
                 System.out.print("INGRESE EL NIVEL A BUSCAR : ");
                 int niv=datos.nextInt();
                 System.out.print("CANTIDAD DE NODOS HOJA EN EL NIVEL "+x+" DEL ARBOL M-VIAS: "+arbol.cantidadDeHojasEnUnNivel(niv));
                 break;
                 
             case 5:
                 System.out.print("INGRESE EL HASTA DONDE SE BUSCARA : ");
                 x=datos.nextInt();
                 System.out.print("CANTIDAD DE NODOS NO VACIOS EN EL NIVEL "+x+" DEL ARBOL M-VIAS: "+arbol.cantidadDeVaciosYNoVaciosAntesDeN(x));
                 break;
                 
             case 6:
                 System.out.print("LA CNATIDAD DE HOJAS EN EL FINAL ES : ");
                 System.out.print("VERDADERO SI SOLO HAY HOJAS EN EL ULTIMO NIVEL DE UN NODO M-VIAS: "+arbol. HaySoloHojasAlFinal());
                 break;
                 
             case 7:
                 System.out.println("NO DISPONIBLE");
                 break;
                 
             case 8:
                 System.out.println("BUSCAR EL SUCESOR EN INORDEN DE :  ");
                 int claveABuscar=datos.nextInt();
                 System.out.print("EL SUCESOR IN ORDEN DE "+ claveABuscar+" es:  "+arbol.sucesorInOrden(claveABuscar));
                 break;
                
             case 9:
                 System.out.print("TODOS LOS NODOS HOJAS NO TIENEN DATOS VACIOS:  ");
                 System.out.print("VERDADERO SI TODOS LOS NODOS NO HOJAS NO TIENEN DATOS VACIOS:  "+arbol.todosLosNosHojasNoTieneVacios());
                 break;
                 
             case 10:
                 a=false;
                 break;
                 
             default :
                 System.out.println("ingrese una opcion valida");
                 
        }
         
         System.out.println("\n\n\n\n\n\n");
            System.out.println("                            SELECCION EL NUMERO DE PREGUNTA QUE DESEE");
        System.out.println("1:TODOS LOS METODOS DE LA INTERFAZ IMPLEMENTADOS");
        System.out.println("2:PREGUNTA 2");
        System.out.println("3:PREGUNTA 3");
        System.out.println("4:PREGUNTA 4");
        System.out.println("5:PREGUNTA 5");
        System.out.println("6:PREGUNTA 6");
        System.out.println("7:PREGUNTA 7");
        System.out.println("8:PREGUNTA 8");
        System.out.println("9:PREGUNTA 9");
        System.out.println("\n Recorrido Por Niveles ===> "+arbol.recorridoPorNiveles());
        System.out.println("\n Recorrido In Orden ===> "+arbol.recorridoEnInOrden());
        }
        
    }
    
}
