package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagrams {

	
	
	
	
	public static void checkAnagramUsingList(String str1, String str2) {
		List<Character> charList = new ArrayList<Character>();
		int count = 0;

		if (str1.length() == str2.length()) {

			for (int i = 0; i < str1.length(); i++) {
				charList.add(str1.charAt(i));
			}

			for (int j = 0; j < str2.length(); j++) {
				
				if (charList.contains(str2.charAt(j))) {
					count++;
				}

			}
			if (count == str2.length()) {
				System.out.println("Two Strings are anagrams!");
				System.out.println("Count: " + count);
			} else {
				System.out.println("Two Strings are not anagrams!");
			}
		} else {
			System.out.println("Two Strings are not anagrams because length do not match!");
		}

	}

	
	
	public static void checkAnagramUsingArraysSort(String str1, String str2){
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		
		if(Arrays.equals(ch1, ch2)){
			System.out.println("Strings are anagram!");
			
		}
		else{
			System.out.println("Strings are not anagram!");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		checkAnagramUsingArraysSort("abcd", "ccbc");
		

	}

}
