import java.util.Scanner;
import java.lang.String;

public class Main {
            public String str = new String();
            public static void main(String[] args) {
                Scanner in=new Scanner(System.in);
                System.out.println("введите строку");
                String str = in.nextLine();
                String[] words = str.split(" ");
                int count = 0;
                int k = 0;
                int k1 = 0;
                int n = 0;
                int h = 0;
                int max = 0;
                String str1 = " ";
                int p = 0;

        int zachem = 0;

        /*char[] glasnye = {'ё','у','е','ы','а','о','э','я','и','ю'};
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < glasnye.length; j++) {
                if (i == 0){
                    if (str.charAt(0) == glasnye[j]){
                        zachem++;
                    }
                }
                if (str.charAt(i) == ' ') {
                    if (str.charAt(i+1) == glasnye[j]) {
                        zachem++;
                    }
                }
            }
        }
        System.out.println(zachem);*/


        /*for (int i = 0; i < words.length; i++) {
            if (words[i].toLowerCase().startsWith("a") || (words[i].toLowerCase().startsWith("e") || (words[i].toLowerCase().startsWith("i") || (words[i].toLowerCase().startsWith("y")))) || (words[i].toLowerCase().startsWith("u")) || (words[i].toLowerCase().startsWith("o"))|| (words[i].toLowerCase().startsWith("а")) || (words[i].toLowerCase().startsWith("е")) || (words[i].toLowerCase().startsWith("ё")) || (words[i].toLowerCase().startsWith("и")) || (words[i].toLowerCase().startsWith("о")) || (words[i].toLowerCase().startsWith("у")) || (words[i].toLowerCase().startsWith("ы")) || (words[i].toLowerCase().startsWith("э")) || (words[i].toLowerCase().startsWith("ю")) || (words[i].toLowerCase().startsWith("я"))) {
                count++;
            }
        }
        System.out.println(count);*/

        char[] chArray = str.toCharArray();
        for (int i = 0;i < str.length(); i++){
            if (chArray[i] != ' '){
                k++;
            } else if (k == 3){
                p++;
                k = 0;
                System.out.println("номера");
                System.out.println(p);
            } else {
                p++;
                k = 0;
            }
        }


        for (int i = 0;i < str.length(); i++){
            if (chArray[i] != ' '){
                k1++;
            } else{
                k1 = 0;
                h++;
            }
            if (k1 >= max){
                max = k1;
                str1 = words[h];
            }
        }
        System.out.println(str1);
    }
}
