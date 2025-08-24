//Return last digit of the given number
import java.io.*;
import java.util.*;
class UserMainCode{
  public int lastDigitOf(int input1){
    int lastDigit=input1%10;
    if(lastDigit<0)
    lastDigit=-lastDigit;
    return lastDigit;
	}
}
