package codewars.nivel.cinco;
import java.util.LinkedList;

//Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
//
//Examples
//pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
//pigIt('Hello world !');     // elloHay orldway !

public class PigLatin {
       public static String pigIt(String str) {
         
         String x [] = str.split(" ");
         LinkedList<String> get;
         String result = "";
         StringBuilder sd;
         char nuevo;
         
         for(int i = 0;i<x.length;i++){
                
         nuevo = x[i].charAt(0);
         
             if(nuevo != '!' && nuevo != '?'){
         
                  sd  = new StringBuilder(x[i] + nuevo + "ay" + " ");
                  sd.deleteCharAt(0);   
                  result = result + sd.toString();
         
                       }else{
                         result = result + nuevo; 
                        }
         }
         
         if(result.charAt(result.length() -1) == ' ')
         
             return result.substring(0, result.length()-1);
         else
             
             return result;
         
    }
}