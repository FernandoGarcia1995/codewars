package codewars.nivel.seis;

//What's in a name?
//..Or rather, what's a name in? For us, a particular string is where we are looking for a name.
//
//Task
//Write a function, taking two strings in parameter, that tests whether or not the first string contains all of the letters of the second string, in order.
//
//The function should return true if that is the case, and else false. Letter comparison should be case-INsensitive.

//examples

//nameInStr("Across the rivers", "chris") --> true Contains all of the letters in "chris", in order.
//nameInStr("Under a sea", "chris") --> false  Contains only some of the letters in "chris".

public class NameInStr {

	public static boolean nameInStr(String str, String name) {
		char frase[] = str.toCharArray();

		char nombre[] = name.toCharArray();

		boolean salir = true;

		boolean comprobar = false;

		int cont = 0;

		int contFrase = 0;

		while (salir) {

			if (contFrase < frase.length && cont < nombre.length) {

				if (nombre[cont] == frase[contFrase]) {
					cont++;
					contFrase++;
				} else
					contFrase++;
			} else if (cont == nombre.length) {
				comprobar = true;
				salir = false;

			} else {
				salir = false;
			}

		}
		return comprobar;
	}
}
