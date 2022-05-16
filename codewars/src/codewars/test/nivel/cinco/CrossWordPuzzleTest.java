package codewars.test.nivel.cinco;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import org.junit.jupiter.api.Test;

import codewars.nivel.cinco.CrossWordPuzzle;

class CrossWordPuzzleTest {

	@Test
	void puzzle1() {
		String[] puzzle = { "#_", "_G" };
		List<Object[]> expected = new ArrayList<Object[]>();
		expected.add(new Object[] { "AG", "UG", 6 });
		expected.add(new Object[] { "UG", "AG", 6 });
		tester(puzzle, expected);
	}

	@Test
	void puzzle2() {
		String[] puzzle = { "_V", "_#" };
		List<Object[]> expected = new ArrayList<Object[]>();
		tester(puzzle, expected);
	}

	@Test
	void puzzle3() {
		String[] puzzle = { "Q_", "#_" };
		List<Object[]> expected = new ArrayList<Object[]>();
		expected.add(new Object[] { "QI", "IF", 16 });
		expected.add(new Object[] { "QI", "ID", 14 });
		expected.add(new Object[] { "QI", "IN", 13 });
		expected.add(new Object[] { "QI", "IO", 13 });
		expected.add(new Object[] { "QI", "IS", 13 });
		expected.add(new Object[] { "QI", "IT", 13 });
		tester(puzzle, expected);
	}

	@Test
	void puzzle4() {
		String[] puzzle = { "__", "#P" };
		List<Object[]> expected = new ArrayList<Object[]>();
		expected.add(new Object[] { "ZO", "OP", 15 });
		expected.add(new Object[] { "JO", "OP", 13 });
		expected.add(new Object[] { "XU", "UP", 13 });
		expected.add(new Object[] { "KO", "OP", 10 });
		expected.add(new Object[] { "HO", "OP", 9 });
		expected.add(new Object[] { "WO", "OP", 9 });
		expected.add(new Object[] { "YO", "OP", 9 });
		expected.add(new Object[] { "YU", "UP", 9 });
		expected.add(new Object[] { "BO", "OP", 8 });
		expected.add(new Object[] { "MO", "OP", 8 });
		expected.add(new Object[] { "MU", "UP", 8 });
		expected.add(new Object[] { "PO", "OP", 8 });
		expected.add(new Object[] { "DO", "OP", 7 });
		expected.add(new Object[] { "GO", "OP", 7 });
		expected.add(new Object[] { "GU", "UP", 7 });
		expected.add(new Object[] { "IO", "OP", 6 });
		expected.add(new Object[] { "LO", "OP", 6 });
		expected.add(new Object[] { "NO", "OP", 6 });
		expected.add(new Object[] { "NU", "UP", 6 });
		expected.add(new Object[] { "OO", "OP", 6 });
		expected.add(new Object[] { "OU", "UP", 6 });
		expected.add(new Object[] { "SO", "OP", 6 });
		expected.add(new Object[] { "TO", "OP", 6 });
		tester(puzzle, expected);
	}

	private static void tester(String[] puzzle, List<Object[]> expected) {
		List<Object[]> submitted = CrossWordPuzzle.crossword2x2(puzzle);
		int subLength = submitted.size();
		int expLength = expected.size();
		if (subLength != expLength) {
			assertEquals(expLength, subLength, "Incorrect List size");
		}
		for (int i = 0; i < expLength; i++) {
			for (int j = 0; j < 3; j++) {
				if (submitted.get(i)[j] != expected.get(i)[j]) {
					String valid = "{\"" + expected.get(i)[0] + "\", \"" + expected.get(i)[1] + "\", "
							+ expected.get(i)[2] + "}";
					String invalid = "{\"" + submitted.get(i)[0] + "\", \"" + submitted.get(i)[1] + "\", "
							+ submitted.get(i)[2] + "}";
					assertEquals(valid, invalid, "Invalid solution");
				}
			}
		}
		assertEquals(1, 1);
	}
}
