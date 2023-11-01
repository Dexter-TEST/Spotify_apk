package p.rd4;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import p.ud4;
import java.io.File;
import java.lang.Object;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.lang.Class;
import java.lang.String;
import p.od4;
import java.io.FileNotFoundException;
import java.lang.Throwable;
import p.td4;
import p.co5;
import p.xz6;
import p.yt6;
import p.by6;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.io.IOException;
import p.tp2;

public final class rd4 implements ObservableOnSubscribe	// class@0024c6 from classes.dex
{
    public final ud4 a;
    public final File b;
    public final File c;

    public void rd4(ud4 p0,File p1,File p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void subscribe(ObservableEmitter p0){
       int i1;
       int b1;
       rd4 ta = this.a;
       ta.getClass();
       ud4 b = ta.b;
       b.a(this.b.getAbsolutePath());
       rd4 tc = this.c;
       if (!tc.exists() && !tc.mkdirs()) {
          b.b();
          p0.tryOnError(new FileNotFoundException(tc.getAbsolutePath()));
       }else {
          td4 otd4 = new td4(p0);
          int i = 50;
          do {
             String absolutePath = tc.getAbsolutePath();
             co5.o(absolutePath, "volume");
             b.c = new xz6(absolutePath, b.a);
             try{
                i1 = 3;
                b1 = b.d(otd4);
                od4 b2 = b.b;
                co5.i(b2);
                if (co5.c("cancelled", b2.c.get("moving-state"))) {
                }else if(b1){
                   b1 = 2;
                }else {
                   b1 = 1;
                }
                if (b1 == 2) {
                }
                break ;
             }catch(p.ox6 e0){
                Iterator iterator = e0.g.iterator();
                if (!iterator.hasNext()) {
                }else {
                   tp2.v(iterator.next());
                   throw null;
                }
             }
             b1 = 3;
             otd4.b = true;
          } while ((i = i - 1) <= 0);
          if (b1 == i1) {
             e0.b();
             p0.tryOnError(new IOException(tp2.y(b1)));
          }else {
             p0.onComplete();
          }
       }
       return;
    }
}
