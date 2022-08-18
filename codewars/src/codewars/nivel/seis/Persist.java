package codewars.nivel.seis;

//Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.
//
//For example (Input --> Output):
//
//39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
//999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
//4 --> 0 (because 4 is already a one-digit number)

import java.util.Stack;

public class Persist {
      public static int persistence(long n) {
        
        
        Stack<Integer> obj = new Stack<Integer>();
        
        int newNumero = (int) n;
        int Numero = 0;
        int auxNumero = 1;
        int cont = 0;
        boolean salir = true;
        
      if(n>=10){  
          
        while (salir){
            
           if(newNumero>0){
               
            Numero = (newNumero % 10);
            newNumero = newNumero / 10;
            obj.push(Numero);
            
           }else{
     
           for(int i = 0;obj.size()>0;i++){
                auxNumero = auxNumero * obj.pop();
           }
           
                cont++;
                newNumero = auxNumero;
                auxNumero = 1;
                
                 if(newNumero<10){
                     salir=false;
                 }
           }

        }
        return cont;
        
      }else{
      
      return 0;
      
      }
}
}