package codewars.nivel.cinco;

import java.util.ArrayList;
import java.util.List;


//Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)
//
//HH = hours, padded to 2 digits, range: 00 - 99
//MM = minutes, padded to 2 digits, range: 00 - 59
//SS = seconds, padded to 2 digits, range: 00 - 59
//The maximum time never exceeds 359999 (99:59:59) (NO FINALIZADO ESTA PARTE)
//
//You can find some examples in the test fixtures. 



public class HumanReadableTime {

	public static String makeReadable(int seconds) {
		return parseDateFormat(getRecursiveTime(seconds,"HOURS", new ArrayList<Integer>()));
	}
	
	private static List<Integer> getRecursiveTime(int seconds, String name, List<Integer> out) {
		
		int result = 0;
		int rest = 0;
		
		if(name.equals("HOURS")) {
			
			if (seconds >= 3600) {
				result = seconds / 3600;
				rest =  seconds % 3600;
				out.add(result);
			
				return getRecursiveTime(rest, "MINUTES", out);
			} else {
				out.add(0);
				return getRecursiveTime(seconds, "MINUTES", out);
			}
			
		}else if(name.equals("MINUTES"))
			
			if (seconds >= 60) {
				result = seconds / 60;
				rest =  seconds % 60;
				out.add(result);
			
				return getRecursiveTime(rest, "SECONDS", out);
			} else {
				out.add(0);
				return getRecursiveTime(seconds, "SECONDS", out);
			}

		else if(name.equals("SECONDS")) {
			out.add(seconds);
			return getRecursiveTime(seconds, "END", out);
		}
		
		return out;
	}
	
	private static String parseDateFormat(List<Integer> date) {
		
		String dataParse = "";
		List<String> dataFormat = new ArrayList<String>();
		
		for(Integer data : date) {
			if(data < 10) {
				dataParse = "0" + data.toString();
			}else {
				dataParse = data.toString();
			}
			dataFormat.add(dataParse);
		}
		

		return String.format("%1$s:%2$s:%3$s",
                dataFormat.get(0), dataFormat.get(1),dataFormat.get(2));
	}
	

}
