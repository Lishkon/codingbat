package String02;

public class StarOut {
    public String starOut(String str) {
        int count = 0;
        int firstIn = str.indexOf("*");
        int lastIn = str.indexOf("*");
        int temp = 0;
        String pOne = "";
        String pTwo = "";

        if (str.contains("*")) {

            // getting the amount of the star appearances in the string
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '*') {
                    count++;
                }
            }
            if (count > 1) {
                lastIn = firstIn + count - 1;
            }
            temp = str.indexOf("*");
            pOne = str.substring(0, temp - count);
            pTwo = str.substring(temp + count);
            // pOne = str.substring(0, (str.indexOf(count)-count));

        }

        return "firstIn: " + firstIn + " lastIn: " + lastIn;
    }

    public static void main(String[] args) {
        StarOut st = new StarOut();
        System.out.println(st.starOut("tk***sjjt"));

    }
}
