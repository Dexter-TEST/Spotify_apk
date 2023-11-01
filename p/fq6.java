package p.fq6;
import p.xh6;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.lang.String;
import java.lang.Integer;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Math;
import java.lang.Object;
import java.lang.NullPointerException;

public final class fq6 extends AtomicReferenceArray implements xh6	// class@00161c from classes.dex
{
    public final int a;
    public final AtomicLong b;
    public long c;
    public final AtomicLong t;
    public final int v;
    public static final Integer w;

    static {
       fq6.w = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    }
    public void fq6(int p0){
       super((1 << (Integer.numberOfLeadingZeros((p0 - 1)) - 32)));
       this.a = this.length() - 1;
       this.b = new AtomicLong();
       this.t = new AtomicLong();
       this.v = Math.min((p0 / 4), fq6.w.intValue());
    }
    public final void clear(){
       do {
          if (this.poll() == null) {
          }
       } while (!this.isEmpty());
       return;
    }
    public final boolean isEmpty(){
       boolean b = (!(this.b.get() - this.t.get()))? true: false;
       return b;
    }
    public final boolean offer(Object p0){
       if (p0 == null) {
          throw new NullPointerException("Null is not a valid element");
       }
       fq6 tb = this.b;
       long l = tb.get();
       fq6 ta = this.a;
       int i = (int)l & ta;
       if ((l - this.c) >= 0) {
          long l1 = (long)this.v + l;
          if (this.get((ta & (int)l1)) == null) {
             this.c = l1;
          }else if(this.get(i) != null){
             return false;
          }
       }
       this.lazySet(i, p0);
       tb.lazySet((l + 1));
       return true;
    }
    public final Object poll(){
       Object obj;
       fq6 tt = this.t;
       long l = tt.get();
       int i = (int)l & this.a;
       if ((obj = this.get(i)) == null) {
          return null;
       }
       tt.lazySet((l + 1));
       this.lazySet(i, null);
       return obj;
    }
}
