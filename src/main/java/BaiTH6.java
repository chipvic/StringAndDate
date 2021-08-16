import java.util.Scanner;

public class BaiTH6 {

    public static String inputString() {
        Scanner myStr = new Scanner(System.in);
        String str = myStr.nextLine();
        return str;
    }

    public static void printUpCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            String tmp = str.substring(i, i + 1);
            String upper = tmp.toUpperCase();
            if (tmp.equals(upper)) {
                System.out.format("%s ", tmp);
            }

        }
        System.out.println();
    }

    public static void printNonNum(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
            } else {
                System.out.format("%s ",str.charAt(i));
            }

        }
        System.out.println();

    }

    public static int countChar(String str) {
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i,i+1).equals(" ")) {

            } else {
                count +=1;

            }
        }
        return count;


    }

    public static int countVowel(String str){
        int count =0;
        for (int i = 0; i < str.length() ; i++) {
            if(str.substring(i,i+1).equals("u")||str.substring(i,i+1).equals("e")||str.substring(i,i+1).equals("o")||str.substring(i,i+1).equals("a")||str.substring(i,i+1).equals("i")){
                count = count+1;
            }

        }
        return count;
    }

}
