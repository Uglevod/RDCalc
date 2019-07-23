/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

 

/**
 *
 * @author uglevod
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
         
        
        
        int[] ai=new int[2];
       String out="";
        
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter line");
        
         
       
         String[] res=Check.ch(reader.readLine());
       
        
         if (res[3]=="Rim") {
         ai[0]=RomanToDecimal.romanToDecimal(res[0]);
         ai[1]=RomanToDecimal.romanToDecimal(res[1]);
         }
         
         if (res[3]=="Dec") {
         ai[0]=Integer.parseInt(res[0]);
         ai[1]=Integer.parseInt(res[1]);
         }
         
         
         
         if(res[3]!="Err") { 
          switch (res[2]) {
                case "+":
                    out=ai[0]+ai[1]+"";
                    break;
                case "-":
                    out=ai[0]-ai[1]+"";
                    break;
                case "*":
                    out=ai[0]*ai[1]+"";
                    break;
                case "/":
                    out=ai[0]/ai[1]+"";
                    break;
          }
         }
          
         if (res[3]=="Rim") {
          
          
         out=DecimalToRoman.toRoman( Integer.parseInt(out)); 
           
         }
         
         
        if (res[3]=="Err") {
         //out="Ошибка ввода";
            throw new IOException();
         } 
         
         
        System.out.println(out);         
    }
    
}
