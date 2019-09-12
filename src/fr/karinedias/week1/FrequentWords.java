package fr.karinedias.week1;

import java.util.ArrayList;
import java.util.Collections;


//TODO: implement FrequentWords with set data types.

public class FrequentWords extends PatternCount {

	/*
	 * pseudocode : FrequentWords(Text, k) FrequentPatterns ← an empty set for i ← 0
	 * to |Text| − k Pattern ← the k-mer Text(i, k) Count(i) ← PatternCount(Text,
	 * Pattern) maxCount ← maximum value in array Count for i ← 0 to |Text| − k if
	 * Count(i) = maxCount add Text(i, k) to FrequentPatterns remove duplicates from
	 * FrequentPatterns return FrequentPatterns
	 */

	public static ArrayList<String> frequentWords(String text, int k) {
		// find the most frequent k-mer of text
		// Set<PatternCount> FrequentPatterns = new Set<PatternCount> ();

		// add all possible patterns into an arraylist :
		ArrayList<String> patterns = new ArrayList<String>();
		// create another array for frequentWords aka k-mers of k length found in text
		ArrayList<String> frequentWords = new ArrayList<String>();

		for (int i = 0; i <= text.length() - k; i++) {
			patterns.add(text.substring(i, i + k));
		}

		// compare if some are equals :
		for (int i = 0; i <= patterns.size(); i++) {
			for (int j = i + 1; j <= patterns.size() - 1; j++) {
				if (patterns.get(i).equals(patterns.get(j))) {
					//if (count(text, patterns.get(i)) == maxCount(patterns))
					

//					for i ← 0 to |Text| − k
//		            if Count(i) = maxCount
//		                add Text(i, k) to FrequentPatterns
//		        remove duplicates from FrequentPatterns
//		        return FrequentPatterns
					
					
				}
			}
		}

		return frequentWords;

	}

	
	public static int maxCount(ArrayList<Integer> list) {
		return Collections.max(list);
	}
	
	//method for counting how many k-mers there is in total in the text. Here k-mers are simply put as pattern
	public static ArrayList<Integer> count(String text, String pattern) {
//		 Count(i) ← PatternCount(Text, Pattern)
//	        maxCount ← maximum value in array Count
//	        for i ← 0 to |Text| − k
//	            if Count(i) = maxCount
//	                add Text(i, k) to FrequentPatterns
//	        remove duplicates from FrequentPatterns
//	        return FrequentPatterns
		ArrayList<Integer> patternCounter = new ArrayList<Integer>();
		patternCounter.add(patternCount(text, pattern));
		
		return patternCounter;
	}
	
	public static void main(String[] args) {

		System.out.println(frequentWords("ACGTTGCATGTCGCATGATGCATGAGAGCT", 4));
	}

}

/*
 * Sample Input:
 * 
 * ACGTTGCATGTCGCATGATGCATGAGAGCT 4
 * 
 * Sample Output:
 * 
 * CATG GCAT
 */
