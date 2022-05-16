package codewars.nivel.cinco;
import java.util.*;

public class CrossWordPuzzle {
  private static String[] words = {
    "AA", "AB", "AD", "AE", "AG", "AH", "AI", "AL",
    "AM", "AN", "AR", "AS", "AT", "AW", "AX", "AY",
    "BA", "BE", "BI", "BO", "BY", "CH", "DA", "DE",
    "DI", "DO", "EA", "ED", "EE", "EF", "EH", "EL",
    "EM", "EN", "ER", "ES", "ET", "EW", "EX", "FA",
    "FE", "FY", "GI", "GO", "GU", "HA", "HE", "HI",
    "HM", "HO", "ID", "IF", "IN", "IO", "IS", "IT",
    "JA", "JO", "KA", "KI", "KO", "KY", "LA", "LI",
    "LO", "MA", "ME", "MI", "MM", "MO", "MU", "MY",
    "NA", "NE", "NI", "NO", "NU", "NY", "OB", "OD",
    "OE", "OF", "OH", "OI", "OK", "OM", "ON", "OO",
    "OP", "OR", "OS", "OU", "OW", "OX", "OY", "PA",
    "PE", "PI", "PO", "QI", "RE", "SH", "SI", "SO",
    "ST", "TA", "TE", "TI", "TO", "UG", "UH", "UM",
    "UN", "UP", "UR", "US", "UT", "WE", "WO", "XI",
    "XU", "YA", "YE", "YO", "YU", "ZA", "ZE", "ZO"
  };
  
  private static Map<Character, Integer> values = new HashMap<Character, Integer> () {{
    put('A', 1); put('B', 3); put('C', 3); put('D', 2); put('E', 1); put('F', 4);
    put('G', 2); put('H', 4); put('I', 1); put('J', 8); put('K', 5); put('L', 1);
    put('M', 3); put('N', 1); put('O', 1); put('P', 3); put('Q',10); put('R', 1);
    put('S', 1); put('T', 1); put('U', 1); put('V', 4); put('W', 4); put('X', 8);
    put('Y', 4); put('Z',10);
  }};
  
  public static List<Object[]> crossword2x2(String[] puzzle) {
    
    System.out.println("puzzle = " + puzzle[0] + "\n         " + puzzle[1] + "\n");
    System.out.println("words[0] = " + words[0] + "\n");
    
    List<Object[]> arrayList = new ArrayList<Object[]>();

   
    
	return null;

  }

}