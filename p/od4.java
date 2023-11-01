package p.od4;
import p.nd4;
import p.yt6;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.concurrent.CopyOnWriteArraySet;
import p.xz6;
import java.util.HashMap;
import java.lang.IllegalStateException;
import p.t32;
import p.fv1;
import p.a32;
import java.lang.Throwable;
import com.spotify.base.java.logging.Logger;
import p.kg4;
import java.util.Iterator;
import p.tp2;
import p.by6;
import java.lang.Thread$UncaughtExceptionHandler;
import java.lang.Thread;
import p.sf;
import p.o11;
import java.util.concurrent.atomic.AtomicBoolean;

public final class od4 implements nd4	// class@0020fb from classes.dex
{
    public final yt6 a;
    public xz6 b;
    public xz6 c;
    public int d;
    public o11 e;
    public Thread$UncaughtExceptionHandler f;
    public final CopyOnWriteArraySet g;

    public void od4(yt6 p0){
       co5.o(p0, "fileFactory");
       super();
       this.a = p0;
       this.d = 1;
       this.g = new CopyOnWriteArraySet();
    }
    public final void a(String p0){
       co5.o(p0, "cacheLocation");
       od4 ta = this.a;
       xz6 oxz6 = new xz6(p0, ta);
       this.b = oxz6;
       this.c(1);
       xz6 c = oxz6.c;
       String str = "moving-state";
       String str1 = "destination";
       if (co5.c("sending", c.get(str))) {
          this.c(2);
          if ((c = c.get(str1)) != null) {
             this.c = new xz6(c, ta);
          }else {
             throw new IllegalStateException("Required value was null.".toString());
          }
       }else if(co5.c("sent", c.get(str))){
          this.c(3);
          if ((c = c.get(str1)) != null) {
             this.c = new xz6(c, ta);
          }else {
             throw new IllegalStateException("Required value was null.".toString());
          }
       }else if(co5.c("received", c.get(str))){
          this.c(3);
          this.c = oxz6;
          if ((c = c.get("source")) != null) {
             this.b = new xz6(c, ta);
          }else {
             throw new IllegalStateException("Required value was null.".toString());
          }
       }else if(co5.c("cancelled", c.get(str))){
          this.c(5);
          this.c = oxz6;
       }
       return;
    }
    public final void b(){
       od4 tb;
       int i = 1;
       try{
          od4 tc = this.c;
          if ((tb = this.b) != null) {
             if (tc != null) {
                this.a.i().t(tc.a);
             }
             tb.a();
          }else {
             throw new IllegalStateException("Could not revert");
          }
       }catch(java.io.IOException e1){
          Object[] objArray = new Object[i];
          objArray[0] = e1.getMessage();
          Logger.i("Unable to revert change: %s", objArray);
       }
       this.c(i);
       return;
    }
    public final void c(int p0){
       kg4.t(p0, "state");
       this.d = p0;
       Iterator iterator = this.g.iterator();
       if (!iterator.hasNext()) {
          return;
       }
       tp2.v(iterator.next());
       throw null;
    }
    public final boolean d(by6 p0){
       od4 tc = this.c;
       od4 tb = this.b;
       if (tc == null || tb == null) {
          throw new IllegalStateException("Could not sync folders");
       }
       this.c(2);
       xz6 a = tc.a;
       xz6 c = tb.c;
       c.put("moving-state", "sending");
       c.put("destination", a.getAbsolutePath());
       tb.b();
       xz6 a1 = tb.a;
       xz6 c1 = tc.c;
       c1.put("moving-state", "receiving");
       c1.put("source", a1.getAbsolutePath());
       tc.b();
       this.f = Thread.getDefaultUncaughtExceptionHandler();
       Thread.setDefaultUncaughtExceptionHandler(new sf(this));
       od4 tc1 = this.c;
       od4 tb1 = this.b;
       if (tc1 == null || tb1 == null) {
          throw new IllegalStateException("Could not do sync folders");
       }
       o11 oo11 = new o11(tb1.a, tc1.a, p0, this.a);
       this.e = oo11;
       oo11.w.set(true);
       boolean b = oo11.r(oo11.b, oo11.c);
       if (co5.c("cancelled", c.get("moving-state"))) {
          this.c(5);
       }else {
          c.put("moving-state", "sent");
          c.put("destination", a.getAbsolutePath());
          tb.b();
          c1.put("moving-state", "received");
          c1.put("source", a1.getAbsolutePath());
          tc.b();
          this.c(3);
       }
       Thread.setDefaultUncaughtExceptionHandler(this.f);
       return b;
    }
}
