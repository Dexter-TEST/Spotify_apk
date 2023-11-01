package p.t51;
import p.cf7;
import java.lang.String;
import java.text.DateFormat;
import java.util.Date;
import java.lang.Object;
import p.co5;
import java.lang.CharSequence;
import java.text.ParsePosition;
import java.lang.ThreadLocal;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p.we7;
import java.util.TimeZone;

public abstract class t51	// class@000342 from classes2.dex
{
    public static final cf7 a;
    public static final String[] b;
    public static final DateFormat[] c;

    static {
       t51.a = new cf7(10);
       String[] stringArray = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz","EEEE, dd-MMM-yy HH:mm:ss zzz","EEE MMM d HH:mm:ss yyyy","EEE, dd-MMM-yyyy HH:mm:ss z","EEE, dd-MMM-yyyy HH-mm-ss z","EEE, dd MMM yy HH:mm:ss z","EEE dd-MMM-yyyy HH:mm:ss z","EEE dd MMM yyyy HH:mm:ss z","EEE dd-MMM-yyyy HH-mm-ss z","EEE dd-MMM-yy HH:mm:ss z","EEE dd MMM yy HH:mm:ss z","EEE,dd-MMM-yy HH:mm:ss z","EEE,dd-MMM-yyyy HH:mm:ss z","EEE, dd-MM-yyyy HH:mm:ss z","EEE MMM d yyyy HH:mm:ss z"};
       t51.b = stringArray;
       DateFormat[] uDateFormatA = new DateFormat[stringArray.length];
       t51.c = uDateFormatA;
    }
    public static final Date a(String p0){
       object oobject;
       Date uDate1;
       co5.o(p0, "<this>");
       int i = (!p0.length())? 1: 0;
       if (i) {
          return null;
       }else {
          ParsePosition parsePositio = new ParsePosition(0);
          Date uDate = t51.a.get().parse(p0, parsePositio);
          if (parsePositio.getIndex() == p0.length()) {
             return uDate;
          }else {
             String[] b = t51.b;
             _monitor_enter(b);
             int len = b.length;
             int i1 = 0;
             while (true) {
                if (i1 < len) {
                   int i2 = i1 + 1;
                   DateFormat[] c = t51.c;
                   if ((oobject = c[i1]) == null) {
                      oobject = new SimpleDateFormat(t51.b[i1], Locale.US);
                      oobject.setTimeZone(we7.e);
                      c[i1] = oobject;
                   }
                   parsePositio.setIndex(0);
                   uDate1 = oobject.parse(p0, parsePositio);
                   if (parsePositio.getIndex()) {
                      break ;
                   }else {
                      i1 = i2;
                   }
                }else {
                   _monitor_exit(b);
                   return null;
                }
             }
             _monitor_exit(b);
             return uDate1;
          }
       }
    }
}
