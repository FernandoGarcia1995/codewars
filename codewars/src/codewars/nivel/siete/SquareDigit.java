package codewars.nivel.siete;

import java.util.ArrayList;
import java.util.Collections;

//Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
//
//For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
//
//Note: The function accepts an integer and returns an integer

public class SquareDigit {
	boolean señal = true;
	int result;
	ArrayList<Integer> acumulador = new ArrayList();

	public int squareDigits(int n) {

		while (señal) {
			if (n > 0) {
				result = n % 10;
				acumulador.add(result);
				n = n / 10;
			} else {
				señal = false;
			}

		}

		return finalNumber(acumulador);
	}

	public int finalNumber(ArrayList<Integer> obj) {
		StringBuffer sb = new StringBuffer();
		Collections.reverse(obj);

		for (int retenedor : obj) {
			sb.append(retenedor * retenedor);
		}

		return Integer.valueOf(String.valueOf(sb));
	}

}