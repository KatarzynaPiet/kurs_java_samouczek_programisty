package klasy_wewnetrzne.exercise;

import java.util.*;

public class SortingWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> words = new LinkedList<>();
        int counter = 5;

        System.out.println("Podaj wyrazy:");
        while(counter != 0){
            words.add(input.next());
            counter--;
        }
        System.out.println("Podane wyrazy:");
        printList(words);

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                return word1.length() - word2.length();
            }
        });
        System.out.println();
        System.out.println("Wyrazy po sortowaniu:");
        printList(words);
    }

    public static void printList(List<String> words){
        for(String word: words){
            System.out.println(word);
        }
    }

}
