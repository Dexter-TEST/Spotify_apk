package p.jr3;
import java.util.concurrent.Callable;
import java.lang.Object;
import p.r45;
import android.content.Context;
import android.content.ClipData;
import java.lang.StringBuilder;
import android.content.ClipData$Item;
import java.lang.CharSequence;
import java.lang.String;
import p.h35;
import p.ud4;
import java.io.File;
import java.lang.Class;
import p.od4;
import com.spotify.base.java.logging.Logger;
import p.xz6;
import p.by6;
import java.util.HashMap;
import p.co5;
import p.t32;
import p.yt6;
import p.fv1;
import p.a32;
import p.ox6;
import java.lang.IllegalStateException;
import p.eq3;
import p.tv;
import p.bq3;
import p.zk;
import java.util.concurrent.CountDownLatch;
import p.a3;
import android.os.Bundle;
import p.tm2;
import p.fs2;
import p.om2;
import p.xm2;

public final class jr3 implements Callable	// class@001b2d from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void jr3(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public final Object call(){
       zk b;
       od4 d;
       Object[] objArray;
       String absolutePath;
       ClipData uClipData;
       int i = 0;
       String str = null;
       jr3 tc = this.c;
       jr3 tb = this.b;
       switch (this.a){
           case 0:
             co5.o(tb, "this$0");
             co5.o(tc, "$callable");
             tb.a = tc.call();
             if ((b = tb.b) != null) {
                b.countDown();
             }
             return str;
             break;
           case 1:
           case 2:
             tb.getClass();
             ud4 b1 = tb.b;
             b1.a(tc.getAbsolutePath());
             if ((d = b1.d) == 5) {
                objArray = new Object[i];
                Logger.i("Interrupted move, attempting revert again", objArray);
                b1.b();
                absolutePath = tc.getAbsolutePath();
             }else if(d != 1){
                objArray = new Object[i];
                Logger.e("Finalizing move", objArray);
                d = b1.a;
                od4 c = b1.c;
                od4 b2 = b1.b;
                if (c != null && b2 != null) {
                   xz6 a = b2.a;
                   if (b1.d != 1) {
                      b1.d(by6.u);
                      if (!co5.c("cancelled", b2.c.get("moving-state"))) {
                         int i1 = 4;
                         try{
                            b1.c(i1);
                            d.i().t(a);
                            c.a();
                         }catch(java.io.IOException e0){
                            throw new ox6("Unable to delete old cache folder: ".concat(a.getAbsolutePath()));
                         }
                      }
                      b1.c(1);
                      xz6 oxz6 = new xz6(c.a, e0);
                      b1.b = oxz6;
                      absolutePath = oxz6.a.getAbsolutePath();
                   }
                }
                throw new IllegalStateException("Could not finalize move");
             }else {
                objArray = new Object[i];
                Logger.e("Move completed, nothing to do", objArray);
                absolutePath = tc.getAbsolutePath();
             }
             break;
           case 3:
             if ((uClipData = tb.f()) != null) {
                StringBuilder str1 = new StringBuilder(10);
                for (; i < uClipData.getItemCount(); i = i + 1) {
                   str1 = str1.append(uClipData.getItemAt(i).coerceToText(tc));
                }
                if (str1.length()) {
                   str = str1;
                }
             }
             return new h35(str);
             break;
           default:
             tm2 i2 = new tm2(tb, "me", tc, fs2.a, null, 48);
             return i.c();
       }
       return tb.e.h(tc);
    }
}
