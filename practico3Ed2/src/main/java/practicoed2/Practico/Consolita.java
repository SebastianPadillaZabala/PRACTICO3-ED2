/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicoed2.Practico;

import Arbol.AVL;
import Arbol.ArbolB;
import Arbol.ArbolBinarioBusqueda;
import Arbol.ArbolMViasBusqueda;
import Arbol.ExcepcionClaveNoExiste;
import Arbol.ExcepcionClaveYaExiste;
import Arbol.IArbolBusqueda;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Sebastian Padilla
 */
public class Consolita {

    /**
     * @param args the command line arguments
     * @throws Arbol.ExcepcionClaveYaExiste
     * @throws Arbol.ExcepcionClaveNoExiste
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws ExcepcionClaveYaExiste, ExcepcionClaveNoExiste, IOException {
        // TODO code application logic here
        IArbolBusqueda<Integer, String> arbolMVias = new ArbolMViasBusqueda<>();
        IArbolBusqueda<Integer, String> arbolB = new ArbolB<>();
        arbolMVias.insertar(50, "diego");
        arbolMVias.insertar(60, "oscar");
        arbolMVias.insertar(40, "liz");
        arbolMVias.insertar(38, "enzo");
        arbolMVias.insertar(39, "julio");
        arbolMVias.insertar(55, "oso");
        arbolMVias.insertar(54, "osito");
        arbolMVias.insertar(53, "osote");
        arbolMVias.insertar(20, "dudu");
        arbolMVias.insertar(22, "diana");

        /* arbolB.insertar(50, "diego");
        arbolB.insertar(60, "oscar");
        arbolB.insertar(40, "liz");
        arbolB.insertar(39, "enzo");
        arbolB.insertar(45, "julio");
        arbolB.insertar(70, "oso");
        arbolB.insertar(20, "dudu");
        arbolB.insertar(22, "diana");
         */
        System.out.println("ARBOLMVIAS DE BUSQUEDA: ");
        
        ((ArbolMViasBusqueda) arbolMVias).verArbol();
        // System.out.println("ARBOLB: ");
        System.out.println("1) Ejercicio 1");
        System.out.println("2) Ejercicio 2");
        System.out.println("3) Ejercicio 3 no lo pude hacer");
        System.out.println("4) Ejercicio 4 no lo pude hacer");
        System.out.println("5) Ejercicio 5 solo esta codificado");
        System.out.println("6) Ejercicio 6");
        System.out.println("7) Ejercicio 7 solo esta codificado");
        System.out.println("8) Ejercicio 8 solo esta codificado");
        System.out.println("9) Ejercicio 9");
        System.out.println("10) Ejercicio 10");
        System.out.println("11) Ejercicio 11 no lo pude hacer");
        System.out.println("12) Ejercicio 12");
        int num = - 1;
        Scanner entrada = new Scanner(System.in);
        while (num != 0) {
            num = entrada.nextInt();
            switch (num) {
                case 1: 
                    ((ArbolMViasBusqueda) arbolMVias).verArbol();
                    System.out.println("Ya estan los datos insertados en el ARBOLMVIAS desde la consola");
                    break;
                
                case 2:
                    arbolMVias.eliminar(60);
                    System.out.println("Se elimino la clave 45 desde la consola");
                    ((ArbolMViasBusqueda) arbolMVias).verArbol();
                    break;
                
                case 3: 
                    System.out.println("No lo hice Ing.");
                    break;
                
                case 4: 
                    System.out.print("No lo hice ing. ");
                    break;
                
                case 5: 

                    break;
                
                case 6: 
                    int r =arbolMVias.ejercicio6P3();
                    System.out.println("Cantidad de Nodos con Datos vacio (recursivo): " + r);
                    break;
                
                case 7: 

                    break;
                
                case 8: 

                    break;
                
                case 9: 
                    boolean b;
                    b = arbolMVias.ejercicio9P3();
                    System.out.println("Solo hay hojas en el último nivel del ArbolMVias?: " + b);
                    break;
                
                case 10: 
                    boolean bandera = arbolMVias.ejercicio10P3(); 
                    System.out.println("El árbol m-vias esta balanceado según las reglas de un árbol B: "+ bandera);
                    break;
                
                case 11: 

                    break;
                
                case 12: 
                    int x = arbolMVias.ejercicio12P3(0);
                    System.out.println("La cantidad de nodos que tienen todos sus hijos distintos de vacío luego del nivel ingresado es: " + x);
                    break;
                
            }
        }
    }

}
