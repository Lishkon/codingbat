package Warmup02;

import String01.StartWord;

public class Draft {
    public static void main(String[] args) {
        StartWord sw = new StartWord();
        String word = "zip";
        String str = "hip";
//        int lnth = word.length();
//        String res = "";
        String reg = "." + word.substring(1);
//        String reg = ".ip";
//        System.out.println(str.substring(0,word.length()).matches(reg));
        System.out.println(sw.startWord(str, word));

    }
}

