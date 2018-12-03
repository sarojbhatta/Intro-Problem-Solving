/*
Given two strings, a and b, create a bigger string made of 
the first char of a, the first char of b, the second char of a, 
the second char of b, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz") ? "axbycz"
mixString("Hi", "There") ? "HTihere"
mixString("xxxx", "There") ? "xTxhxexre"
*/

public String mixString(String a, String b) {
  int len = Math.max(a.length(), b.length());
  String result = "";
  for (int i = 0; i<len; i++){
    if (i<a.length()){
      result = result + a.charAt(i);
    }
    if (i<b.length()){
      result = result + b.charAt(i);
    }
  }
  return result;
}
