package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

//2.Create an arrayList of words. Remove every word that ends with “e”.

public class WordsArrayList {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<String>();

		words.add("kasu");
		words.add("Produce");
		words.add("Tree");
		words.add("kidy");
		words.add("Ethiopica");

		Iterator<String> letter = words.iterator();
		while (letter.hasNext()) {
			String word = letter.next();
			if (word.endsWith("e")) {
				letter.remove();
			}
		}
		System.out.println(words);
	}
}
