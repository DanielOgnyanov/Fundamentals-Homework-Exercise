import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String words = scanner.nextLine();

        System.out.println(countVowels(words));

    }

    public static int countVowels(String words) {
        String[] text = words.split("");
        int counter =0;
        for (int i = 0; i < text.length; i++) {
            if(text[i].equals("a")||text[i].equals("A")){
                counter++;
            }else if(text[i].equals("e")||text[i].equals("E")){
                counter++;
            }else if(text[i].equals("i")||text[i].equals("I")){
                counter++;
            }else if(text[i].equals("o")||text[i].equals("O")){
                counter++;
            }else if(text[i].equals("u")||text[i].equals("U")){
                counter++;
            }else if(text[i].equals("y")||text[i].equals("Y")){
                counter++;
            }
        }
        return counter;
    }
}
