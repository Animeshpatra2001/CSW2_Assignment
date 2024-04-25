/*10.In given large string, find the most occurring words in the string. 
Hint:-
a. Create a Hashtable which will keep track of <word, frequency>
b. Iterate through the string and keep track of word frequency by inserting
into Hash-Table.
c. When we have a new word, we will insert it into the Hashtable with
frequency 1. For all repetition of the word, we will increase the
frequency.
d. We can keep track of the most occurring words whenever we are
increasing the frequency we can see if this is the most occurring word or 
not.*/
package genericsCollection;

import java.util.Hashtable;

public class Q10_MostOccurringWords {
	public static void main(String[] args) {
		String text = "Wake up to reality! Nothing ever goes as planned in this accursed world. The longer you live, the more you realize that the only things that truly exist in this reality are merely pain, suffering and futility. Listen… Everywhere you look in this world, wherever there is light, there will always be shadows to be found as well. As long as there is a concept of victors, the vanquished will also exist. The selfish intent of wanting to preserve peace initiates wars and hatred is born in order to protect love. There are nexuses, causal relationships that cannot be separated. I want to sever the fate of this world. A world of only victors. A world of only peace. A world of only love. I will create such a world. I am…the ghost of the Uchihas. For truly this reality…is a hell.";
		text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();

		String[] words = text.split("\\s+");

		Hashtable<String, Integer> wordFrequency = new Hashtable<>();

		for (String word : words) {
			if (wordFrequency.containsKey(word)) {
				wordFrequency.put(word, wordFrequency.get(word) + 1);
			} else {
				wordFrequency.put(word, 1);
			}
		}

		int maxFrequency = 0;
		String mostOccurringWord = "";
		for (String word : wordFrequency.keySet()) {
			int frequency = wordFrequency.get(word);
			if (frequency > maxFrequency) {
				maxFrequency = frequency;
				mostOccurringWord = word;
			}
		}

		System.out.println("Most occurring word(s):");
		for (String word : wordFrequency.keySet()) {
			if (wordFrequency.get(word) == maxFrequency) {
				System.out.println(word + " - " + maxFrequency + " times");
			}
		}
	}
}
