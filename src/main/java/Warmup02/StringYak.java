package Warmup02;

public class StringYak {
    /*
        stringYak("yakpak") → "pak"
        stringYak("pakyak") → "pak"
        stringYak("yak123ya") → "123ya"
     */
    // This code only works for non-case-sensetive input data. It won't work with inputs like "YakPak".
    public String stringYak(String str) {
        String output = "";
        if (str.contains("yak")) {
            output = str.replaceAll("yak","");
        }
        return  output;
    }
}
