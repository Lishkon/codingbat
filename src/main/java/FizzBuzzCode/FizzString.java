package FizzBuzzCode;


public class FizzString {

    public String fizzString(String str) {
        String result = "";
        if (str.startsWith("f") && (!(str.endsWith("b")))) result += "Fizz";
        else if ((!(str.startsWith("f")) && str.endsWith("b"))) result += "Buzz";
        else if (str.startsWith("f") && (str.endsWith("b"))) result += "FizzBuzz";
        else result = str;
        return result;
    }

}
