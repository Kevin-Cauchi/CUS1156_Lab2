/*
Project: Lab 2
CUS1156: Software Design Methods
Author: Kevin Cauchi
Date : 10/2/2023
GITHUB 
*/

import java.util.ArrayList;

public class UniqueWords {
    /**
     * Counts the number of unique strings in a list.
     *
     * @param list ArrayList of strings to be examined
     * @return number of unique strings in the list
     */
    public static int countUnique(ArrayList<String> list) {
        int count = 0;
        
        for (int i = 0; i < list.size(); i++) {
            String currentWord = list.get(i);
            boolean isUnique = true;
            
            for (int j = i + 1; j < list.size(); j++) {
                if (currentWord.equals(list.get(j))) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("orange");
        words.add("blackboard");
        words.add("apple");
        words.add("orange");
        words.add("sun");
        words.add("moon");

        int unique = countUnique(words);
        System.out.println(words + " has " + unique + " unique words");
    }
}




/*
 CODE OUTPUT:
 
 [apple, orange, blackboard, apple, orange, sun, moon] has 5 unique words


 */
