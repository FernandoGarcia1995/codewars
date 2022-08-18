package codewars.nivel.siete;


//Definition
//Jumping number is the number that All adjacent digits in it differ by 1.
//
//Task
//Given a number, Find if it is Jumping or not .
//
//Input >> Output Examples
//jumpingNumber(9) ==> return "Jumping!!"
//Explanation:
//It's single-digit number
//jumpingNumber(79) ==> return "Not!!"


public class JumpingNumber
{
    public static String jumpingNumber(int number)
    {
      boolean checker = true;
      int result = 0;
      int []splitArray = JumpingNumber.splitNumbers(number);
      
      for(int i = 1;i<splitArray.length;i++) {
        
        result = splitArray[i -1] - splitArray[i];
        
        if(result != 1 && result != -1)
          checker = false;
        
      }
      
      if(checker)
        return "Jumping!!";
      else
        return "Not!!";
    }
    
    private static int[] splitNumbers(int num)  
    {  
      char []array = String.valueOf(num).toCharArray();
      int [] arrayConvert = new int[array.length];
      
      for(int i = 0;i<array.length;i++) {
        arrayConvert[i] = Character.getNumericValue(array[i]);   
      }
      
      return arrayConvert;
    }

}