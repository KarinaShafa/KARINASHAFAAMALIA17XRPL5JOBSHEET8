/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Js8;

/**
 *
 * @author ASUS
 */
public class HurufK {
public static void main(String[] args){
        int sp;
        for (sp = 0; sp < 2; sp++){
            System.out.println("");
        }
        for (int k= 0; k<2;k++){
            System.out.print("KK");
            for (int ksp = 2; ksp > k; ksp--){
                System.out.print(" ");
            }
            System.out.println("KK"); 
        }
        for (int ka = 0; ka< 2; ka++){
            System.out.print("KK");
        }
        System.out.println("");
        for (int k= 1;k<3;k++){
            System.out.print("KK");
            for(int ksp = 0;ksp <k;ksp++){
                System.out.print(" ");
                
            }
            System.out.println("KK");
        }
    }

        
    }
