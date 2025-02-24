
import java.util.Arrays;
import java.util.Scanner;

public class PalindromeChecker {
  boolean calcPali(String str1 , String str2){
    int[] freq1 = new int[256] ;
    int[] freq2 = new int[256] ;

    if (str1.length() != str2.length()) {
      return false; 
    }

    for (int i = 0; i < str1.length(); i++) {
      char ch = str1.charAt(i) ; 
      char ch2 = str2.charAt(i) ;
      freq1[ch]++ ; 
      freq2[ch2]++ ; 
    }
    return Arrays.equals(freq1, freq2) ;
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    String str1 = s.nextLine() ; 
    String str2 = s.nextLine() ;
    s.close();

    PalindromeChecker p = new PalindromeChecker() ; 

    System.out.println("is palindrome: "+p.calcPali(str1, str2));
  }
}
