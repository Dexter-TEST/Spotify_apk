package p.ie3;
import java.lang.String;
import java.lang.System;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Character;

public abstract class ie3	// class@001978 from classes.dex
{
    public static final int a;

    static {
       int i;
       int i1;
       String property = System.getProperty("java.version");
       try{
          i = 0;
          String[] stringArray = property.split("[._]");
          i1 = Integer.parseInt(stringArray[i]);
          int i2 = 1;
          if (i1 == i2 && stringArray.length > i2) {
             i1 = Integer.parseInt(stringArray[i2]);
          }
       }catch(java.lang.NumberFormatException e0){
          i1 = -1;
       }
       if (i1 == -1) {
          try{
             StringBuilder str = "";
             for (; i < e0.length(); i = i + 1) {
                char c = e0.charAt(i);
                if (Character.isDigit(c)) {
                   str = str.append(c);
                }else {
                   break ;
                }
             }
             i1 = Integer.parseInt(str);
          }catch(java.lang.NumberFormatException e0){
             i1 = -1;
          }
       }
       if (i1 == -1) {
          i1 = 6;
       }
       ie3.a = i1;
    }
}
