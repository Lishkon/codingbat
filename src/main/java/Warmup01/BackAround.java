package Warmup01;


/*
 *  Url - https://codingbat.com/prob/p161642
 **/
public class BackAround {
    public String backAround (String str) {
        char appender = str.charAt(str.length()-1);
        return appender + str + appender;
    }

}
