package p.un5;
import p.s32;
import java.lang.String;
import java.nio.charset.Charset;
import java.io.File;
import java.lang.Object;
import java.io.Closeable;
import p.xj0;
import p.tn5;
import java.lang.StringBuilder;
import java.lang.Throwable;
import android.util.Log;
import p.aw1;
import p.sn5;
import p.xl0;
import java.lang.System;
import java.util.Locale;
import java.lang.Long;

public final class un5 implements s32	// class@0028e5 from classes.dex
{
    public final File a;
    public final int b;
    public tn5 c;
    public static final Charset t;

    static {
       un5.t = Charset.forName("UTF-8");
    }
    public void un5(File p0){
       super();
       this.a = p0;
       this.b = 0x10000;
    }
    public final void a(){
       xj0.l(this.c, "There was a problem closing the Crashlytics log file.");
       this.c = null;
    }
    public final void b(){
       un5 ta = this.a;
       if (this.c == null) {
          try{
             this.c = new tn5(ta);
          }catch(java.io.IOException e1){
             Log.e("FirebaseCrashlytics", "Could not open log file: "+ta, e1);
          }
       }
       return;
    }
    public final String f(){
       byte[] uobyteArray;
       String str = ((uobyteArray = this.h()) != null)? new String(uobyteArray, un5.t): null;
       return str;
    }
    public final byte[] h(){
       xl0 oxl0;
       un5 tc;
       byte[] uobyteArray1;
       byte[] uobyteArray = null;
       if (this.a.exists()) {
          this.b();
          if ((tc = this.c) != null) {
             int[] ointArray = new int[]{0};
             int i = tc.k0();
             try{
                uobyteArray1 = new byte[i];
                this.c.y(new aw1(this, uobyteArray1, ointArray));
             }catch(java.io.IOException e4){
                Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e4);
             }
             oxl0 = new xl0(this, uobyteArray1, ointArray[0]);
          label_0039 :
             if (oxl0 == null) {
                return uobyteArray;
             }else {
                xl0 b = oxl0.b;
                uobyteArray = new byte[b];
                System.arraycopy(oxl0.c, 0, uobyteArray, 0, b);
                return uobyteArray;
             }
          }
       }
       oxl0 = uobyteArray;
       goto label_0039 ;
    }
    public final void k(){
       this.a();
       this.a.delete();
    }
    public final void o(String p0,long p1){
       try{
          this.b();
          String str = " ";
          un5 tb = this.b;
          String str1 = "...";
          if (this.c == null) {
          }else if(p0 == null){
             p0 = "null";
          }
          int i = tb / 4;
          if (p0.length() > i) {
             p0 = str1+p0.substring((p0.length() - i));
          }
          Object[] objArray = new Object[]{Long.valueOf(p1),p0.replaceAll("\r", str).replaceAll("\n", str)};
          this.c.b(String.format(Locale.US, "%d %s%n", objArray).getBytes(un5.t));
          while (!this.c.J() && this.c.k0() > tb) {
             this.c.h0();
          }
       }catch(java.io.IOException e6){
          Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e6);
       }
          return;
    }
}
