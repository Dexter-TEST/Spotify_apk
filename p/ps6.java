package p.ps6;
import java.lang.Object;
import java.lang.String;
import java.lang.System;
import java.util.concurrent.TimeUnit;
import java.lang.StringBuilder;
import p.te5;
import java.util.Locale;
import java.lang.Double;
import p.os6;
import java.lang.Enum;
import java.lang.AssertionError;

public final class ps6	// class@0022c3 from classes.dex
{
    public boolean a;
    public long b;

    public void ps6(){
       super();
    }
    public final String toString(){
       String str1;
       long l = 0;
       long l1 = (this.a != null)? (System.nanoTime() - this.b) + l: l;
       TimeUnit dAYS = TimeUnit.DAYS;
       TimeUnit nANOSECONDS = TimeUnit.NANOSECONDS;
       if ((dAYS.convert(l1, nANOSECONDS) - l) <= 0) {
          dAYS = TimeUnit.HOURS;
          if ((dAYS.convert(l1, nANOSECONDS) - l) <= 0) {
             dAYS = TimeUnit.MINUTES;
             if ((dAYS.convert(l1, nANOSECONDS) - l) <= 0) {
                dAYS = TimeUnit.SECONDS;
                if ((dAYS.convert(l1, nANOSECONDS) - l) <= 0) {
                   dAYS = TimeUnit.MILLISECONDS;
                   if ((dAYS.convert(l1, nANOSECONDS) - l) <= 0) {
                      dAYS = TimeUnit.MICROSECONDS;
                      if ((dAYS.convert(l1, nANOSECONDS) - l) <= 0) {
                         dAYS = nANOSECONDS;
                      }
                   }
                }
             }
          }
       }
       Object[] objArray = new Object[]{Double.valueOf(((double)l1 / (double)nANOSECONDS.convert(1, dAYS)))};
       StringBuilder str = String.format(Locale.ROOT, "%.4g", objArray)+" ";
       switch (os6.a[dAYS.ordinal()]){
           case 1:
             str1 = "ns";
             break;
           case 2:
             str1 = "µs";
             break;
           case 3:
             str1 = "ms";
             break;
           case 4:
             str1 = "s";
             break;
           case 5:
             str1 = "min";
             break;
           case 6:
             str1 = "h";
             break;
           case 7:
             str1 = "d";
             break;
           default:
             throw new AssertionError();
       }
       return str+str1;
    }
}
