package Utility.Utility;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.lang3.RandomStringUtils;

import nl.flotsam.xeger.Xeger;

public class RandomTextGenerator {



public static void main(String[] args){
 //Generate Differnt types of Strings
 String testStr = generateRandomString("email","",9);
 System.out.println(testStr);
 testStr = generateRandomString("number","",10);
 System.out.println(testStr);
 testStr = generateRandomString("alphabet","",10);
 System.out.println(testStr);
 testStr = generateRandomString("alphanumeric","",10);
 System.out.println(testStr);
 testStr = generateRandomString("ascii","",10);
 System.out.println(testStr);
 testStr = generateRandomString("url","",0);
 System.out.println(testStr);
 testStr = generateRandomString("RegEx","ABCD-[0-9]{5}",0);
 System.out.println(testStr);
}
 
 
/**
 * Generates the random string
 * @param type
 * @param format
 * @param length
 * @return String
 */
public static String generateRandomString(String type,String format,int length){
String randomStr = "";
 
switch(type.toUpperCase()){
case "EMAIL":
    randomStr = RandomStringUtils.randomAlphanumeric(length) + "@abcd.com";
    break;
case "NUMBER":
    randomStr = RandomStringUtils.randomNumeric(length);
    break;
case "ALPHABET":
    randomStr = RandomStringUtils.randomAlphabetic(length);
    break;
case "ALPHANUMERIC":
    randomStr = RandomStringUtils.randomAlphanumeric(length);
    break;
case "ASCII":
   randomStr = RandomStringUtils.randomAscii(length);
   break;
case "URL":
 try {
     randomStr = new URL("https",RandomStringUtils.randomAlphabetic(6).toLowerCase()+"."+RandomStringUtils.randomNumeric(3),"/random").toString();
 } catch (MalformedURLException e) {
    e.printStackTrace();
  }
 break;
case "REGEX":
    Xeger gen = new Xeger(format);
    randomStr = gen.generate();
    break;
default:
    System.out.println("Type " + type + "is not found.");
    break;
}

return randomStr;
}

}