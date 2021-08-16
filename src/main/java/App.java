import java.util.Locale;

public class App {
    public static void main(String[] args){

//        String s4 = "java";
//        String s5 = s4.toLowerCase();
//        char c = s4.charAt(0);
//        System.out.println(c);
//
//        int idx = s4.indexOf("j");
//        System.out.println(idx);
//
//        int idxSubStr = s4.indexOf("va");
//        System.out.println(idxSubStr);
//
//        String s9 = "Java for OneMount Group";
//        int idxSubS9 = s9.indexOf("Group");
//        System.out.println(s9.substring(9));
//        System.out.println(s9.substring(9,17));;
//        System.out.println(idxSubS9);

        // Bài 1:
        System.out.println("Nhập chuỗi và in những ký tự hoa");
        String s = BaiTH6.inputString();
        System.out.println(s);
        BaiTH6.printUpCase(s);

        // Bài 2:
        System.out.println("In chuỗi không bao gồm số");
        BaiTH6.printNonNum(s);

        // Bài 4
        int count = BaiTH6.countChar(s);
        System.out.println(count);

        // Bài 7:
        int countVowel =BaiTH6.countVowel(s);
        int countNonVo = count - countVowel;
        System.out.format("Số lượng từ nguyên âm %s và phụ âm %s",countVowel,countNonVo);






    }

}
