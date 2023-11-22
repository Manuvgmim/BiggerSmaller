/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biggersmaller;

import java.util.Scanner;

/**
 *
 * @author manuv
 */
public class BiggerSmaller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Aqui he inicializado las dos variables para evitarme problemas luego
        int small=0,big=0;
          Scanner scanner = new Scanner(System.in);
        System.out.println("This program can give you the biggest and smallest number of three");
        System.out.println("Write a number");
        int variable_1 = scanner.nextInt();
        
        System.out.println("Write another number");
        int variable_2 = scanner.nextInt();
        
        
        System.out.println("Write the third number");
        int variable_3 = scanner.nextInt();
        //Aqui he borrado la variable string porque yo las variables las quiero guradar en un entero
        
        
        
        if(variable_1 > variable_2 && variable_1 > variable_3){
             big = variable_1;
            if(variable_2 > variable_3){
            
                 small = variable_3;
                }else{
                //Aqui he puesto la variable 2 en vez de la tres para por si es mas pequeña la 2 la variable small este bien    
                 small = variable_2;
                }
            System.out.println("The biggest number is " + big + " The smallest number is:" + small );            
        }
        
        if(variable_2 > variable_1 && variable_2 > variable_3){
            big = variable_2;
            if(variable_1 > variable_3){
                    
            small = variable_3;
                }else{
            //Aqui he borrado la variable medio porque en ningún momento esta siendo printeada   
                 
                small = variable_1;
            }
            System.out.println("The biggest number is " + big + "The smallest number is:" + small);        
            
        }
        //He cambiado los simbolos de < por > para que el codigo funcione bien
        if(variable_3 > variable_1 && variable_3 > variable_2){
            big= variable_3;
            if(variable_2 > variable_1){
           //Aqui faltaba seleccionar la variable1 como la mas pequeña
            small = variable_1;
                }else{
                    
                    
                    small = variable_2;
                }
                    
            System.out.println("The biggest number is " + big + "The smallest number is:" + small);   
    }
    
}
}
