package com.stc.assessment.reverse.string;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abc(adbfc)s)s(sss()";
        int startIndex = -1;
        int endIndex = -1;
        String reverseString = str;
        for(int i =0; i<str.length(); i++){

            if(str.charAt(i) == '(')
                startIndex = i;
            else if (str.charAt(i) == ')') {
                endIndex = i;
            }
            if(startIndex != -1 && endIndex != -1 && startIndex < endIndex){
                reverseString =reverseString.substring(0,startIndex+1) + reverseString(str.substring(startIndex+1,endIndex))
                        + reverseString.substring(endIndex);
                startIndex = -1;
                endIndex = -1;
            }
        }
        System.out.println(reverseString);
    }

    private static String reverseString(String substring) {

        char[] returnedStr = new char[substring.length()];
        int right = substring.length()-1;
        int left = 0;
        while(left <= right){
            char temp = substring.charAt(left);
            returnedStr[left] = substring.charAt(right);
            returnedStr[right] = temp;
            left++;
            right--;
        }
        return new String(returnedStr);
    }
}
