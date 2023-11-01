package p.bs6;
import java.text.DateFormat;
import java.lang.String;
import java.util.regex.Pattern;
import java.util.TimeZone;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.Boolean;
import java.lang.StringBuffer;
import java.util.Calendar;
import java.lang.Object;
import java.util.Date;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.text.ParseException;
import java.text.ParsePosition;
import java.lang.Character;
import p.ao4;
import java.text.FieldPosition;
import java.lang.Math;
import java.lang.System;
import java.lang.StringBuilder;
import java.lang.Class;

public final class bs6 extends DateFormat	// class@001129 from classes.dex
{
    public TimeZone a;
    public final Locale b;
    public Boolean c;
    public Calendar t;
    public DateFormat v;
    public final boolean w;
    public static final TimeZone A;
    public static final Locale B;
    public static final SimpleDateFormat C;
    public static final GregorianCalendar D;
    public static final Pattern x;
    public static final Pattern y;
    public static final String[] z;

    static {
       bs6.x = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d");
       bs6.y = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d\(?:[:]\\d\\d\)?\(\\.\\d+\)?\(Z|[+-]\\d\\d\(?:[:]?\\d\\d\)?\)?");
       String[] stringArray = new String[]{"yyyy-MM-dd\'T\'HH:mm:ss.SSSX","yyyy-MM-dd\'T\'HH:mm:ss.SSS","EEE, dd MMM yyyy HH:mm:ss zzz","yyyy-MM-dd"};
       bs6.z = stringArray;
       TimeZone timeZone = TimeZone.getTimeZone("UTC");
       bs6.A = timeZone;
       Locale uS = Locale.US;
       bs6.B = uS;
       SimpleDateFormat simpleDateFo = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", uS);
       bs6.C = simpleDateFo;
       simpleDateFo.setTimeZone(timeZone);
       bs6 uobs6 = new bs6();
       bs6.D = new GregorianCalendar(timeZone, uS);
    }
    public void bs6(){
       super();
       this.w = true;
       this.b = bs6.B;
    }
    public void bs6(TimeZone p0,Locale p1,Boolean p2,boolean p3){
       super();
       this.w = true;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.w = p3;
    }
    public static int c(int p0,String p1){
       p0++;
       return ((p1.charAt(p0) - 48) + ((p1.charAt(p0) - 48) * 10));
    }
    public static int d(String p0){
       return ((p0.charAt(3) - 48) + (((p0.charAt(2) - 48) * 10) + (((p0.charAt(1) - 48) * 100) + ((p0.charAt(0) - 48) * 1000))));
    }
    public static void g(StringBuffer p0,int p1){
       int i;
       if (!(i = p1 / 10)) {
          p0 = p0+'0';
       }else {
          p0 = p0+(char)(i + 48);
          p1 = p1 - (i * 10);
       }
       p0+(char)(p1 + '0');
       return;
    }
    public static void h(StringBuffer p0,int p1){
       int i;
       if (!(i = p1 / 100)) {
          p0 = p0+'0'+'0';
       }else if(i > 99){
          p0 = p0+i;
       }else {
          bs6.g(p0, i);
       }
       p1 = p1 - (i * 100);
       bs6.g(p0, p1);
       return;
    }
    public final Calendar a(TimeZone p0){
       bs6 tt;
       if ((tt = this.t) == null) {
          tt = bs6.D.clone();
          this.t = tt;
       }
       if (!tt.getTimeZone().equals(p0)) {
          tt.setTimeZone(p0);
       }
       tt.setLenient(this.isLenient());
       return tt;
    }
    public final Object clone(){
       return new bs6(this.a, this.b, this.c, this.w);
    }
    public final Date e(String p0){
       String str1;
       Object[] objArray;
       int i9;
       bs6 uobs6 = this;
       String str = p0;
       int i = p0.length();
       bs6 a = (uobs6.a != null && 90 != str.charAt((i - 1)))? uobs6.a: bs6.A;
       Calendar uCalendar = uobs6.a(a);
       uCalendar.clear();
       int i1 = 0;
       int i2 = 8;
       int i3 = 5;
       int i4 = 14;
       if (i <= 10) {
          if (bs6.x.matcher(str).matches()) {
             uCalendar.set(bs6.d(p0), (bs6.c(i3, str) - 1), bs6.c(i2, str), 0, 0, 0);
             uCalendar.set(14, i1);
             return uCalendar.getTime();
          }else {
             str1 = "yyyy-MM-dd";
          }
       }else {
          Matcher matcher = bs6.y.matcher(str);
          if (matcher.matches()) {
             int i5 = matcher.start(2);
             int i6 = matcher.end(2);
             int i7 = i6 - i5;
             int i8 = 16;
             if (i7 > 1) {
                i9 = bs6.c((i5 + 1), str) * 3600;
                if (i7 >= i3) {
                   i9 = i9 + (bs6.c((i6 - 2), str) * 60);
                }
                i9 = (str.charAt(i5) == '-')? i9 * -1000: i9 * 1000;
                uCalendar.set(15, i9);
                uCalendar.set(i8, i1);
             }
             i5 = bs6.d(p0);
             i6 = bs6.c(i3, str) - 1;
             i7 = bs6.c(i2, str);
             i9 = bs6.c(11, str);
             int i10 = bs6.c(i4, str);
             i = (i > i8 && str.charAt(i8) == ':')? bs6.c(17, str): 0;
             Matcher matcher1 = matcher;
             uCalendar.set(i5, i6, i7, i9, i10, i);
             i = matcher1.start(1) + 1;
             i2 = matcher1.end(1);
             if (i >= i2) {
                uCalendar.set(14, i1);
             }else if(i2 = i2 - i){
                if (i2 != 1) {
                   if (i2 != 2) {
                      if (i2 != 3 && i2 > 9) {
                         objArray = new Object[]{str,matcher1.group(1).substring(1)};
                         throw new ParseException(String.format("Cannot parse date \"%s\": invalid fractional seconds \'%s\'; can use at most 9 digits", objArray), i);
                      }else {
                         i1 = i1 + (str.charAt((i + 2)) - 48);
                      }
                   }
                   i1 = i1 + ((str.charAt((i + 1)) - 48) * 10);
                }
                i1 = i1 + ((str.charAt(i) - 48) * 100);
             }
             uCalendar.set(14, i1);
             return uCalendar.getTime();
          }else {
             str1 = "yyyy-MM-dd\'T\'HH:mm:ss.SSSX";
          }
       }
       objArray = new Object[]{str,str1,uobs6.c};
       throw new ParseException(String.format("Cannot parse date \"%s\": while it seems to fit format \'%s\', parsing fails \(leniency? %s\)", objArray), i1);
    }
    public final boolean equals(Object p0){
       boolean b = (p0 == this)? true: false;
       return b;
    }
    public final Date f(String p0,ParsePosition p1){
       char c;
       int i4;
       int i = 45;
       int i1 = 0;
       int i2 = (p0.length() >= 7 && (Character.isDigit(p0.charAt(i1)) && (Character.isDigit(p0.charAt(3)) && (p0.charAt(4) == i && Character.isDigit(p0.charAt(5))))))? 1: 0;
       if (i2) {
          try{
             return this.e(p0);
          }catch(java.lang.IllegalArgumentException e0){
             Object[] objArray = new Object[2];
             objArray[i1] = p0;
             objArray[v3] = e0.getMessage();
             throw new ParseException(String.format("Cannot parse date \"%s\", problem: %s", objArray), p1.getErrorIndex());
          }
       }else {
          i2 = p0.length();
          do {
          } while ((i2 = i2 - 1) >= 0 && ((c = p0.charAt(i2)) >= '0' && (c <= '9' || (i2 <= 0 && c == i))));
          if (i2 < 0) {
             if (p0.charAt(i1) != i) {
                String a = ao4.a;
                int i3 = a.length();
                if ((i = p0.length()) >= i3) {
                   if (i <= i3) {
                      i = 0;
                      while (true) {
                         if (i < i3) {
                            if (i4 = p0.charAt(i) - a.charAt(i)) {
                               if (i4 >= 0) {
                               }
                            }else {
                               i = i + 1;
                            }
                         }
                      }
                      if (!a) {
                      label_00bf :
                         if (this.v == null) {
                            SimpleDateFormat c1 = bs6.C;
                            bs6 ta = this.a;
                            bs6 tc = this.c;
                            bs6 tb = this.b;
                            if (!tb.equals(bs6.B)) {
                               c1 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", tb);
                               if (ta == null) {
                                  ta = bs6.A;
                               }
                               c1.setTimeZone(ta);
                            }else {
                               DateFormat uDateFormat = c1.clone();
                               if (ta != null) {
                                  uDateFormat.setTimeZone(ta);
                               }
                            }
                            if (tc != null) {
                               c1.setLenient(tc.booleanValue());
                            }
                            this.v = c1;
                         }
                         return this.v.parse(p0, p1);
                      }
                   }
                }
                a = 1;
             }
             try{
                return new Date(ao4.b(p0));
             }catch(java.lang.NumberFormatException e0){
                Object[] objArray1 = new Object[v3];
                objArray1[i1] = p0;
                throw new ParseException(String.format("Timestamp value %s out of 64-bit value range", objArray1), p1.getErrorIndex());
             }
          }else {
             goto label_00bf ;
          }
       }
    }
    public final StringBuffer format(Date p0,StringBuffer p1,FieldPosition p2){
       bs6 ta;
       int i2;
       if ((ta = this.a) == null) {
          ta = bs6.A;
       }
       Calendar uCalendar = this.a(ta);
       uCalendar.setTime(p0);
       int i = 1;
       int i1 = uCalendar.get(i);
       char c = '-';
       if (!uCalendar.get(0)) {
          if (i1 == i) {
             p1 = p1+"+0000";
          }else {
             p1 = p1+c;
             bs6.h(p1, (i1 - i));
          }
       }else if(i1 > 9999){
          p1 = p1+'+';
       }
       bs6.h(p1, i1);
       p1 = p1+c;
       bs6.g(p1, (uCalendar.get(2) + i));
       p1 = p1+c;
       bs6.g(p1, uCalendar.get(5));
       p1 = p1+'T';
       bs6.g(p1, uCalendar.get(11));
       char c1 = ':';
       p1 = p1+c1;
       bs6.g(p1, uCalendar.get(12));
       p1 = p1+c1;
       bs6.g(p1, uCalendar.get(13));
       p1 = p1+'.';
       i1 = uCalendar.get(14);
       if (!(i2 = i1 / 100)) {
          p1 = p1+'0';
       }else {
          p1 = p1+(char)(i2 + 48);
          i1 = i1 - (i2 * 100);
       }
       bs6.g(p1, i1);
       int offset = ta.getOffset(uCalendar.getTimeInMillis());
       bs6 tw = this.w;
       if (offset) {
          i1 = offset / 0xea60;
          i2 = Math.abs((i1 / 60));
          i1 = Math.abs((i1 % 60));
          if (offset >= 0) {
             c = '+';
          }
          p1 = p1+c;
          bs6.g(p1, i2);
          if (tw != null) {
             p1 = p1+c1;
          }
          bs6.g(p1, i1);
       }else if(tw != null){
          p1 = p1+"+00:00";
       }else {
          p1 = p1+"+0000";
       }
       return p1;
    }
    public final TimeZone getTimeZone(){
       return this.a;
    }
    public final int hashCode(){
       return System.identityHashCode(this);
    }
    public final boolean isLenient(){
       bs6 tc;
       boolean b = ((tc = this.c) != null && !tc.booleanValue())? false: true;
       return b;
    }
    public final Date parse(String p0){
       Date uDate;
       char c;
       p0 = p0.trim();
       int i = 0;
       ParsePosition parsePositio = new ParsePosition(i);
       if ((uDate = this.f(p0, parsePositio)) != null) {
          return uDate;
       }
       StringBuilder str = "";
       String[] z = bs6.z;
       int len = z.length;
       int i1 = 0;
       while (true) {
          c = '"';
          if (i1 < len) {
             object oobject = z[i1];
             str = (str.length() > 0)? str.append("\", \""): str.append(c);
             str = str.append(oobject);
             i1 = i1 + 1;
          }else {
             break ;
          }
       }
       Object[] objArray = new Object[]{p0,str+c};
       throw new ParseException(String.format("Cannot parse date \"%s\": not compatible with any of standard forms \(%s\)", objArray), parsePositio.getErrorIndex());
    }
    public final Date parse(String p0,ParsePosition p1){
       try{
          return this.f(p0, p1);
       }catch(java.text.ParseException e0){
          return null;
       }
    }
    public final void setLenient(boolean p0){
       Boolean uBoolean = Boolean.valueOf(p0);
       bs6 tc = this.c;
       int i = 1;
       if (uBoolean == tc) {
       }else if(uBoolean != null && uBoolean.equals(tc)){
          i = 0;
       }
       if (!i) {
          this.c = uBoolean;
          this.v = null;
       }
       return;
    }
    public final void setTimeZone(TimeZone p0){
       if (!p0.equals(this.a)) {
          this.v = null;
          this.a = p0;
       }
       return;
    }
    public final String toString(){
       Object[] objArray = new Object[]{bs6.class.getName(),this.a,this.b,this.c};
       return String.format("DateFormat %s: \(timezone: %s, locale: %s, lenient: %s\)", objArray);
    }
}
