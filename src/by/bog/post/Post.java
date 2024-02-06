package by.bog.post;

import java.util.Arrays;

public class Post {
    private Letter[] letters;

    public Post() {
        Letter letter1 = new Letter(1, "Vadim", "Nikita");
        Letter letter2 = new Letter(2, "Nikita", "Vadim");
        this.letters = new Letter[]{letter1, letter2};
    }

    public Letter[] getLetters() {
        return letters;
    }

    public void addLetter(Letter letter) {
        //----
        Letter[] letters1 = new Letter[letters.length + 1];
        //----
        for (int i = 0; i < letters.length; i++) {
            letters1[i] = letters[i];
        }
        //---
        letters1[letters1.length - 1] = letter;
        //---
        letters = letters1;
    }

    public void addLettersFromKeyboard() {

    }

    @Override
    public String toString() {
        return "Post{" +
                "letters=" + Arrays.toString(letters) +
                '}';
    }
}
