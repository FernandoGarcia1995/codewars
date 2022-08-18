package codewars.nivel.siete;

//Return the number (count) of vowels in the given string.
//
//We will consider a, e, i, o, u as vowels for this Kata (but not y).
//
//The input string will only consist of lower case letters and/or spaces.

public class VowelsCount {

	public static int getCount(String str) {
		int vowelsCount = 0;

		for (int i = 0; i < str.length(); i++) {

			char ejemplo = str.charAt(i);
			if (ejemplo == 'a' || ejemplo == 'e' || ejemplo == 'i' || ejemplo == 'o' || ejemplo == 'u')
				vowelsCount++;
		}

		return vowelsCount;
	}

}
