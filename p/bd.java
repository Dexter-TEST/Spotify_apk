package p.bd;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ad;
import java.util.logging.Level;
import java.lang.Throwable;
import java.util.Map;
import p.bv6;
import android.util.Log;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import p.av6;
import java.lang.Math;

public final class bd extends Handler	// class@00017c from classes2.dex
{
    public static final bd a;

    static {
       bd.a = new bd();
    }
    public void bd(){
       super();
    }
    public final void close(){
    }
    public final void flush(){
    }
    public final void publish(LogRecord p0){
       int i;
       String str;
       int i3;
       int i4;
       co5.o(p0, "record");
       String loggerName = p0.getLoggerName();
       co5.l(loggerName, "record.loggerName");
       if (p0.getLevel().intValue() > Level.INFO.intValue()) {
          i = 5;
       }else if(p0.getLevel().intValue() == Level.INFO.intValue()){
          i = 4;
       }else {
          i = 3;
       }
       String message = p0.getMessage();
       co5.l(message, "record.message");
       Throwable thrown = p0.getThrown();
       if ((str = ad.b.get(loggerName)) == null) {
          str = bv6.L0(23, loggerName);
       }
       if (Log.isLoggable(str, i)) {
          if (thrown != null) {
             message = message+10+Log.getStackTraceString(thrown);
          }
          int i1 = message.length();
          int i2 = 0;
          while (i2 < i1) {
             if ((i3 = av6.m0(message, 10, i2, false, 4)) == -1) {
                i3 = i1;
             }
             while (true) {
                i4 = i2 + 4000;
                i4 = Math.min(i3, i4);
                String str1 = message.substring(i2, i4);
                co5.l(str1, "this as java.lang.String…ing\(startIndex, endIndex\)");
                Log.println(i, str, str1);
                if (i4 >= i3) {
                   break ;
                }else {
                   i2 = i4;
                }
             }
             i2 = i4 + 1;
          }
       }
       return;
    }
}
