package bala;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StringComp{
public static String[] filterWords(String[] words, String letters) {


ArrayList<String> wordss = new ArrayList<String>();

for (int i = 0; i < words.length; i++) {

for (char c : letters.toCharArray()) {

if (words[i].contains(String.valueOf(c))) {

wordss.add(words[i]);

}

}


}

return wordss.toArray(new String[0]);


}

/* Ignore and do not change the code below */

public static void main(String args[]) {

Scanner in = new Scanner(System.in);

int n = in.nextInt();

if (in.hasNextLine()) {

in.nextLine();

}

String[] words = new String[n];

for (int i = 0; i < n; i++) {

words[i] = in.nextLine();

}

String letters = in.nextLine();

PrintStream outStream = System.out;

System.setOut(System.err);

String[] remaining = filterWords(words, letters);

System.setOut(outStream);

for (int i = 0; i < remaining.length; i++) {



System.out.println(remaining[i]);

}

}

/* Ignore and do not change the code above */

}

