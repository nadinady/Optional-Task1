import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String stringToParse;
        stringToParse = scannerString();
        if(stringToParse.matches("(\\-?\\d+(\\ )?)+")) {
            searchMaxElement(parseString(stringToParse));
            searchMinElement(parseString(stringToParse));
        }
        else System.out.println("Incorrect input");



    }
    static String scannerString () {
        String stringToParse;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter integers");
        stringToParse = in.nextLine();
        return stringToParse;
    }
    static String [] parseString (String stringToParse) {
        return stringToParse.split(" ");
    }
    static void searchMaxElement(String [] parseString) {
        String tempString = new String();
        int maxLenth =0;
        int tempLenth =0;
        for (String arr: parseString) {
            tempLenth=arr.length();
            if (arr.indexOf("-")>-1) {
                tempLenth--;
            }
            if (maxLenth < tempLenth) {
                maxLenth = tempLenth;
                tempString = arr;

            }
        }
        System.out.println("Max number is " + tempString + " with length " + maxLenth);



    }
    static void searchMinElement(String [] parseString) {
        String tempString = new String();
        int minLenth =Integer.MAX_VALUE;
        int tempLenth =0;
        for (String arr: parseString) {
            tempLenth=arr.length();
            if (arr.indexOf("-")>-1) {
                tempLenth--;
            }
            if (tempLenth < minLenth) {
                minLenth = tempLenth;
                tempString = arr;

            }
        }
        System.out.println("Min number is " + tempString + " with length " + minLenth);



    }

}
