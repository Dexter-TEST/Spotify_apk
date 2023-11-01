package p.x96;
import p.u96;
import java.lang.Runtime;
import java.lang.Integer;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Thread;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;

public abstract class x96	// class@0003b8 from classes2.dex
{
    public static final u96 a;
    public static final int b;
    public static final AtomicReference[] c;

    static {
       int i = 0;
       byte[] uobyteArray = new byte[i];
       x96.a = new u96(uobyteArray, i, i, i);
       int i1 = Integer.highestOneBit(((Runtime.getRuntime().availableProcessors() * 2) - 1));
       x96.b = i1;
       AtomicReference[] uAtomicRefer = new AtomicReference[i1];
       for (; i < i1; i = i + 1) {
          uAtomicRefer[i] = new AtomicReference();
       }
       x96.c = uAtomicRefer;
    }
    public static final void a(u96 p0){
       u96 ou96;
       u96 c;
       int i = 1;
       int i1 = (p0.f == null && p0.g == null)? 1: 0;
       if (i1) {
          if (p0.d != null) {
             return;
          }else {
             object oobject = x96.c[(int)(Thread.currentThread().getId() & ((long)x96.b - 1))];
             if ((ou96 = oobject.get()) == x96.a) {
                return;
             }else if(ou96 != null){
                c = ou96.c;
             }else {
                c = null;
             }
             if (c >= 0x10000) {
                return;
             }else {
                p0.f = ou96;
                p0.b = 0;
                p0.c = c + 8192;
                while (true) {
                   if (!oobject.compareAndSet(ou96, p0)) {
                      if (oobject.get() != ou96) {
                         i = 0;
                      }
                   }
                   if (!i) {
                      p0.f = null;
                      break ;
                   }
                   break ;
                }
                return;
             }
          }
       }else {
          throw new IllegalArgumentException("Failed requirement.".toString());
       }
    }
    public static final u96 b(){
       u96 andSet;
       object oobject = x96.c[(int)(Thread.currentThread().getId() & ((long)x96.b - 1))];
       u96 a = x96.a;
       if ((andSet = oobject.getAndSet(a)) == a) {
          return new u96();
       }
       if (andSet == null) {
          oobject.set(null);
          return new u96();
       }else {
          oobject.set(andSet.f);
          andSet.f = null;
          andSet.c = 0;
          return andSet;
       }
    }
}
