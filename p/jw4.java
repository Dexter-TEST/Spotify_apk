package p.jw4;
import p.dw4;
import java.util.ArrayList;
import p.ak4;
import java.lang.Object;
import java.util.AbstractCollection;
import java.lang.Throwable;
import p.yj4;
import p.bw4;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Integer;
import java.util.AbstractList;
import io.reactivex.rxjava3.core.Observer;

public final class jw4 extends ArrayList implements dw4	// class@001b5a from classes.dex
{
    public int a;

    public void jw4(){
       super(16);
    }
    public final void a(){
       this.add(ak4.a);
       this.a = this.a + 1;
    }
    public final void c(Object p0){
       this.add(p0);
       this.a = this.a + 1;
    }
    public final void d(Throwable p0){
       this.add(new yj4(p0));
       this.a = this.a + 1;
    }
    public final void g(bw4 p0){
       bw4 c;
       if (p0.getAndIncrement()) {
          return;
       }
       bw4 b = p0.b;
       int i = 1;
       while (true) {
          if (p0.isDisposed()) {
          }else {
             jw4 ta = this.a;
             int i1 = ((c = p0.c) != null)? c.intValue(): 0;
             while (true) {
                if (i1 < ta) {
                   if (ak4.a(b, this.get(i1))) {
                      return;
                   }else if(p0.isDisposed()){
                      return;
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   p0.c = Integer.valueOf(i1);
                   if (!(i = - i)) {
                   }else {
                      continue ;
                   }
                }
             }
             return;
          }
       }
       return;
    }
}
