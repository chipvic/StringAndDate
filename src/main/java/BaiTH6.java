import java.util.Scanner;

public class BaiTH6 {

    public static String inputString() {
        Scanner myStr = new Scanner(System.in);
        String str = myStr.nextLine();
        return str;
    }

    public static char inputChar() {
        Scanner myChar = new Scanner(System.in);
        char c = myChar.next().charAt(0);
        return c;
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
                System.out.format("%s ", str.charAt(i));
            }

        }
        System.out.println();

    }

    public static int countWord(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((Character.isSpaceChar(str.charAt(i)) && !Character.isSpaceChar(str.charAt(i + 1))) || (i == 0 && !Character.isSpaceChar(str.charAt(i)))) {
                count += 1;
            }

        }
        return count;
    }

    public static int findAndCountChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count += 1;
            }

        }
        return count;
    }

    public static boolean checkNum(String str) {
        boolean check = true;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                check = false;
                break;
            }

        }

        return check;

    }

    public static int countChar(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(" ")) {

            } else {
                count += 1;

            }
        }
        return count;


    }


    public static int countVowel(String str) {
        String tmp = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.substring(i, i + 1).equals("u") || tmp.substring(i, i + 1).equals("e") || tmp.substring(i, i + 1).equals("o") || tmp.substring(i, i + 1).equals("a") || tmp.substring(i, i + 1).equals("i")) {
                count = count + 1;
            }

        }
        return count;
    }

    public static int freqChar(String str) {
        int no1 = 0;
        int no2 = 0;
        int notmp = 0;
        String tmp = str.trim();
        tmp = tmp.toLowerCase();
        for (int i = 0; i < tmp.length(); i++) {
            notmp = findAndCountChar(tmp, tmp.charAt(i));
            tmp = tmp.replace(tmp.charAt(i), ' ');
            if (notmp > no1) {
                no2 = no1;
                no1 = notmp;
            } else {
                if ((notmp < no1) && (notmp > no2)) {
                    no2 = notmp;
                }
            }
            tmp = tmp.trim();
        }

        return no2;
    }

}
