import java.util.Locale;

public class App {
    public static void main(String[] args) {

        // Bài 1:
        System.out.println("Nhập chuỗi: ");
        String s = BaiTH6.inputString();
        System.out.println(s);
        BaiTH6.printUpCase(s);

        // Bài 2:
        System.out.println("In chuỗi không bao gồm số: ");
        BaiTH6.printNonNum(s);

        // Bài 3:
        System.out.println("Nhập ký tự cần kiểm tra số lần xuất hiện trong chuỗi");
        char c = BaiTH6.inputChar();
        int countC = BaiTH6.findAndCountChar(s,c);
        System.out.format("Xuất hiện %d lần",countC);


        // Bài 4
        System.out.println("In số lượng từ trong chuỗi: ");
        int countWord = BaiTH6.countWord(s);
        System.out.println(countWord);

        // Bài 5:
        System.out.println("Nhập chuỗi cần nối: ");
        String s2 = BaiTH6.inputString();
        String s3 =s.concat(s2);
        System.out.println("Chuỗi sau khi nối là: "+s3);

        // Bài 6:
        System.out.println(BaiTH6.checkNum(s));


        // Bài 7:
        int countChar = BaiTH6.countChar(s);
        int countVowel =BaiTH6.countVowel(s);
        int countConsonant = countChar - countVowel;
        System.out.format("Số lượng từ nguyên âm %s và phụ âm %s",countVowel,countConsonant);

//        // Bài 8:
//        int a = BaiTH6.freqChar(s);
//        System.out.println("Ký tự xuất hiện nhiều thứ 2 trong chuỗi: "+a);


    }

}
