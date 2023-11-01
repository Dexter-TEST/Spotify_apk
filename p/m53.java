package p.m53;
import java.lang.String;
import java.util.TimeZone;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.lang.Math;
import java.lang.IndexOutOfBoundsException;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.CharSequence;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import java.lang.Class;
import java.text.ParseException;
import java.lang.Character;
import java.lang.NumberFormatException;

public abstract class m53	// class@001e2a from classes.dex
{
    public static final TimeZone a;

    static {
       m53.a = TimeZone.getTimeZone("UTC");
    }
    public static boolean a(String p0,int p1,char p2){
       boolean b = (p1 < p0.length() && p0.charAt(p1) == p2)? true: false;
       return b;
    }
    public static Date b(String p0,ParsePosition p1){
       String message;
       ParseException parseExcepti;
       int b;
       int i6;
       int i7;
       char c2;
       int i8;
       int i9;
       TimeZone timeZone;
       String str1;
       String str = p0;
       ParsePosition parsePositio = p1;
       try{
          int index = p1.getIndex();
          int i = index + 4;
          index = m53.c(str, index, i);
          char c = '-';
          if (m53.a(str, i, c)) {
             i = i + 1;
          }
          int i1 = i + 2;
          i = m53.c(str, i, i1);
          if (m53.a(str, i1, c)) {
             i1 = i1 + 1;
          }
          int i2 = i1 + 2;
          i1 = m53.c(str, i1, i2);
          if (!(b = m53.a(str, i2, 'T')) && p0.length() <= i2) {
             parsePositio.setIndex(i2);
             return new GregorianCalendar(index, (i - 1), i1).getTime();
          }else {
             int i3 = 43;
             int i4 = 90;
             if (b) {
                i2 = i2 + 1;
                b = i2 + 2;
                i2 = m53.c(str, i2, b);
                char c1 = ':';
                if (m53.a(str, b, c1)) {
                   b = b + 1;
                }
                int i5 = b + 2;
                b = m53.c(str, b, i5);
                if (m53.a(str, i5, c1)) {
                   i5 = i5 + 1;
                }
                if (p0.length() > i5 && ((c1 = str.charAt(i5)) != i4 && (c1 != i3 && c1 != c))) {
                   i6 = i5 + 2;
                   if ((i5 = m53.c(str, i5, i6)) > 59 && i5 < 63) {
                      i5 = 59;
                   }
                   if (m53.a(str, i6, '.')) {
                      i6 = i6 + 1;
                      i7 = i6 + 1;
                      while (true) {
                         if (i7 < p0.length()) {
                            if ((c2 = str.charAt(i7)) >= '0' && c2 <= '9') {
                               i7 = i7 + 1;
                               str1 = 45;
                            }else {
                            label_00b9 :
                               i8 = Math.min(i7, (i6 + 3));
                               i9 = m53.c(str, i6, i8);
                               if ((i8 = i8 - i6) != 1) {
                                  if (i8 == 2) {
                                     i9 = i9 * 10;
                                  }
                               }else {
                                  i9 = i9 * 100;
                               }
                               i6 = i7;
                            }
                         }else {
                            i7 = p0.length();
                            goto label_00b9 ;
                         }
                      }
                      GregorianCalendar gregorianCal = new GregorianCalendar(timeZone);
                      gregorianCal.setLenient(false);
                      gregorianCal.set(1, index);
                      gregorianCal.set(2, (i - 1));
                      gregorianCal.set(5, i1);
                      gregorianCal.set(11, i2);
                      gregorianCal.set(12, b);
                      gregorianCal.set(13, i5);
                      gregorianCal.set(14, i9);
                      parsePositio.setIndex(i6);
                      return gregorianCal.getTime();
                   }else {
                      i9 = 0;
                   }
                }else {
                   i8 = i2;
                   i2 = i5;
                label_00d7 :
                   i6 = i2;
                   i9 = 0;
                   i5 = 0;
                   i2 = i8;
                }
             }else {
                str1 = 0;
                b = 0;
                goto label_00d7 ;
             }
             if (p0.length() > i6) {
                c = str.charAt(i6);
                i7 = 5;
                TimeZone a = m53.a;
                if (c == i4) {
                   i6 = i6 + 1;
                }else if(c != i3 && c != '-'){
                   throw new IndexOutOfBoundsException("Invalid time zone indicator \'"+c+"\'");
                }else {
                   str1 = str.substring(i6);
                   if (str1.length() < i7) {
                      str1 = str1+"00";
                   }
                   i6 = i6 + str1.length();
                   if (!"+0000".equals(str1) && !"+00:00".equals(str1)) {
                      str1 = "GMT"+str1;
                      a = TimeZone.getTimeZone(str1);
                      String iD = a.getID();
                      if (!iD.equals(str1) && !iD.replace(":", "").equals(str1)) {
                         throw new IndexOutOfBoundsException("Mismatching time zone indicator: "+str1+" given, resolves to "+a.getID());
                      }
                   }
                }
                timeZone = a;
             }else {
                throw new IllegalArgumentException("No time zone indicator");
             }
          }
       }catch(java.lang.IndexOutOfBoundsException e0){
       }catch(java.lang.NumberFormatException e0){
       }catch(java.lang.IllegalArgumentException e0){
       }
       if (!message.isEmpty()) {
          message = "\("+e0.getClass().getName()+"\)";
       }
    }
    public static int c(String p0,int p1,int p2){
       int i1;
       int i2;
       if (p1 < 0 || (p2 > p0.length() || p1 > p2)) {
          throw new NumberFormatException(p0);
       }
       int i = 10;
       if (p1 < p2) {
          i1 = p1 + 1;
          if ((i2 = Character.digit(p0.charAt(p1), i)) >= 0) {
             i2 = - i2;
          }else {
             throw new NumberFormatException("Invalid number: "+p0.substring(p1, p2));
          }
       }else {
          i2 = 0;
          i1 = p1;
       }
       while (true) {
          if (i1 >= p2) {
             return (- i2);
          }
          int i3 = i1 + 1;
          if ((i1 = Character.digit(p0.charAt(i1), i)) >= 0) {
             i2 = i2 * 10;
             i2 = i2 - i1;
             i1 = i3;
          }else {
             break ;
          }
       }
       throw new NumberFormatException("Invalid number: "+p0.substring(p1, p2));
    }
}
