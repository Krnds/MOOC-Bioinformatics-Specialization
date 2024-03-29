package fr.karinedias.week1;

import java.io.File;
import java.util.Scanner;

public class PatternCount {

	// pseudocode :
//    PatternCount(Text, Pattern)
//    count ← 0
//    for i ← 0 to |Text| − |Pattern|
//        if Text(i, |Pattern|) = Pattern
//            count ← count + 1
//    return count

	// Dataset :
	// GCTGAGGGAGACTGAGGGCTGAGGGCTGAGGGCCTGAGGGAACCTGAGGGCTGAGGGTACGTGCCTGAGGGCTGAGGGGCTGAGGGACTGAGGGCTGAGGGACTGAGGGGTGCTGAGGGCTGAGGGAACTGAGGGGCTGAGGGAGACTGAGGGCGCGAAACCTGAGGGAGCTGAGGGAATCTGAGGGCACTGAGGGCTGAGGGTAAGCGGCTGAGGGCTGAGGGATAATGACTCTGAGGGCTGAGGGTACTGAGGGTCCTCTGAGGGACTGAGGGACCCTGAGGGTCCACAACTACTAGATTCTGAGGGACCAACTGAGGGTTTCTGAGGGCCTGAGGGCGCTGAGGGTCTTCTGAGGGCCTGAGGGCCTGAGGGGTGGGCCGTCTGAGGGCTACTGAGGGCGCCGCTGAGGGCCTGAGGGGCTGAGGGGCCACTGAGCTGAGGGTGCTGAGGGCTGAGGGTCTGAGGGTCCTCTGAGGGCTGAGGGCAACCTGAGGGCTGAGGGTGCAACTGAGGGCAAGCTGAGGGATACTGAGGGGCCTGAGGGGTTCTGAGGGTCTGAGGGTCTGAGGGACTGAGGGGTAAAGCTGAGGGGGTACTCTGAGGGTACTGAGGGTCCACTGAGGGCCCTGAGGGCTGAGGGTACTCTGAGGGAATTCTGAGGGTCCTGAGGGAACAACAAACTGAGGGCAACTGAGGGCCCCTGAGGGCACCCTGAGGGCACTGAGGGCTGAGGGAGTCTGAGGGACCTGAGGGCTGAGGGCTCTGAGGGACTGAGGGCTCTGAGGGCTTCCCCTGAGGGCCCTGAGGGTTTTCGTAGGCACTGAGGGGATACTGAGGGAATTGGGGCTGAGGGAAAGGCTGAGGGGGCTGAGGGGCCTGAGGGTACGGACCTGAGGGCGCTGAGGGCTGAGGGCTGAGGGAAGTACACACTGAGGGAGGCTGAGGGAAGACCTGAGGGACCTGAGGGCTGAGGGGGGCCTGAGGGAGCTGAGGGCACTCTAACTGAGGGATACTGAGGGCGACATTCTGAGGGCTAACTGAGGGCTGAGGGCTGCGTCTGAGGG
	// Pattern : CTGAGGGCT

	public static void openFile() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Name of the file containing the dataset :");
		String file = sc.next();
		File data = new File(file);
	}

	public static int patternCount(String Text, String Pattern) {

		int count = 0;
		for (int i = 0; i <= Text.length() - Pattern.length(); i++) {
			if (Text.substring(i, (i + Pattern.length())).equals(Pattern)) {
				count++;
			}
		}

		return count;
	}

	public String toString(String p, String s) {

		return ("Pattern \"" + p + "\" retrouvé " + patternCount(p, s) + " fois.");
	}

	public static void main(String[] args) {
		PatternCount p = new PatternCount();
		String dataset = "GAATACACCTTGAGCACACCTTGAGACCTTGAACCACCTTGAAACCTTGAACCTTGATGACCTTGACAGCACCTTGACAAAATCAGATCTACCTTGAAGTGCTAACCTTGACACCTTGATACCTTGAGTACCTTGAACCTTGAACCTTGACTAACCTTGATGCCACCTTGAACCTTGAGTACCTTGATGACCTTGACCACCTTGAGGACCTTGAACCTTGAACCTTGAACCTTGAACGACCTTGAACCTTGAATGACCTTGAACCTTGAAAGTATGACCTTGAAACCTTGACACCTTGAACGGAAAAGGGCATCGAACCTTGATACCTTGAGCTCACCTTGAACCTTGAAAACCTTGACACCTTGAGAACCTTGACTACCTTGAACCTTGACGATACCTTGAGTTACCTTGACACCTTGAATACCTTGAGCTCAACACCTTGAGACCTTGAAAGGGGGTGCATACCTTGAGGCATAGTAACTACCTTGAAGACAGACCTTGATACCTTGACAAACCTTGATACCTTGATCCACCTGGACCTTGACCAACCTTGATTACCTTGAACCTTGACACCTTGAACACCTTGAGCACCTTGAACCTTGAACGTGACTACCTTGAATGTACCACCTTGAAACCTTGAACCTTGAACCTTGAACCTTGAACCTTGACCCCACCTTGAACTCTGGACCTTGATGACCTTGAAACCTTGAATCCATGACGACCTTGACACCTTGATACCTTGAACCTTGATGACCTTGATTAGAATGCTACCTTGAACCTTGAACCTTGATCAGGTACCTACTCGATCAACCTTGATGTACCTTGAACCTTGATTACAGAGTCGCCACCTTGAGACCTTGAAAAAGACCTTGAACCTTGAACCTTGAACTCACGGAGACCTTGAACCTTGAAACCTTGATGCAACCTTGATAAACCTTGATAACCTTGACTGACCTTGATAACCTTGAACCTTGATCACCTTGACTACCTTGAACCTTGA";
		String pattern = "ACCTTGAAC";
		System.out.println(p.patternCount(dataset, pattern));
		p.toString(dataset, pattern);

	}

	// TODO : copy and paste dataset and pattern
	// TODO: just open file for the dataset (first line) and the pattern (second
	// line)
}
