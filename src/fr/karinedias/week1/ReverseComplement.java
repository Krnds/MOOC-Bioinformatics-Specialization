package fr.karinedias.week1;

public class ReverseComplement {

	/*
	 * Reverse Complement Problem: Find the reverse complement of a DNA string.
	 * 
	 * Input: A DNA string Pattern. Output: Patternrc , the reverse complement of
	 * Pattern.
	 */

	String input;
	String patternrc;

	public ReverseComplement(String pattern) {
		this.input = pattern;
	}

	// method for finding base complementary
	private char complementarity(char base) {

		char baseReturn = 0;

		switch (base) {
		case 'A':
			baseReturn = 'T';
			break;
		case 'T':
			baseReturn = 'A';
		case 'G':
			baseReturn = 'C';
		case 'C':
			baseReturn = 'G';
		default:
			break;
		}

		return baseReturn;
	}

	private String reverse(String str) {

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		return reverse;
	}
}
