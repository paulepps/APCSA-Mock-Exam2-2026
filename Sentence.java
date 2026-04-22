import java.util.ArrayList;

public class Sentence {
    
    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public ArrayList<Integer> getBlankPositions() {
        ArrayList<Integer> blankPositions = new ArrayList<>();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                blankPositions.add(i);
            }
        }
        return blankPositions;
    }

    public int countWords() {
        String[] words = sentence.split(" ");
        return words.length;
    }

    public String[] getWords() {
        int wordCount = countWords();
        ArrayList<Integer> blankPositions = getBlankPositions();

        String[] words = new String[wordCount];

        int beginIndex = 0;
        for (int i = 0; i < wordCount - 1; i++) {
            words[i] = sentence.substring(beginIndex, blankPositions.get(i));
            beginIndex = blankPositions.get(i) + 1;
        }
        words[wordCount - 1] = sentence.substring(beginIndex); // Add the last word after the last blank
        return words;
    }

    public static void main(String[] args) {
        Sentence sentence = new Sentence("I love you!");
        System.out.println("Blank positions: " + sentence.getBlankPositions());

        sentence = new Sentence("The cat sat on the mat.");
        System.out.println("Blank positions: " + sentence.getBlankPositions());

        sentence = new Sentence("Why?");
        System.out.println("Blank positions: " + sentence.getBlankPositions());

        sentence = new Sentence("The bird flew away.");
        for (String word : sentence.getWords()) {
            System.out.print(word + " ");
        }   
        System.out.println();

        sentence = new Sentence("Wow!");
        for (String word : sentence.getWords()) {
            System.out.print(word + " ");
        }   
        System.out.println();

        sentence = new Sentence("Hi! How are you?");
        for (String word : sentence.getWords()) {
            System.out.print(word + " ");
        }   
        System.out.println();

    }
}
