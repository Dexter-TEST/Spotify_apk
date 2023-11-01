package p.gq6;
import p.xh6;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Math;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.io.Serializable;
import java.lang.NullPointerException;

public final class gq6 implements xh6	// class@00175e from classes.dex
{
    public final AtomicLong a;
    public int b;
    public long c;
    public final int t;
    public AtomicReferenceArray v;
    public final int w;
    public AtomicReferenceArray x;
    public final AtomicLong y;
    public static final Object A;
    public static final int z;

    static {
       gq6.z = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
       gq6.A = new Object();
    }
    public void gq6(int p0){
       super();
       AtomicLong uAtomicLong = new AtomicLong();
       this.a = uAtomicLong;
       this.y = new AtomicLong();
       p0 = 1 << (Integer.numberOfLeadingZeros((Math.max(8, p0) - 1)) - 32);
       int i = p0 - 1;
       AtomicReferenceArray uAtomicRefer = new AtomicReferenceArray((p0 + 1));
       this.v = uAtomicRefer;
       this.t = i;
       this.b = Math.min((p0 / 4), gq6.z);
       this.x = uAtomicRefer;
       this.w = i;
       this.c = (long)(i - 1);
       uAtomicLong.lazySet(0);
    }
    public final void a(Serializable p0,Object p1){
       int i;
       gq6 tv = this.v;
       gq6 ta = this.a;
       long l = ta.get();
       long l1 = 2 + l;
       gq6 tt = this.t;
       if (tv.get(((int)l1 & tt)) == null) {
          i = tt & (int)l;
          tv.lazySet((i + 1), p1);
          tv.lazySet(i, p0);
          ta.lazySet(l1);
       }else {
          AtomicReferenceArray uAtomicRefer = new AtomicReferenceArray(tv.length());
          this.v = uAtomicRefer;
          i = tt & (int)l;
          uAtomicRefer.lazySet((i + 1), p1);
          uAtomicRefer.lazySet(i, p0);
          tv.lazySet((tv.length() - 1), uAtomicRefer);
          tv.lazySet(i, gq6.A);
          ta.lazySet(l1);
       }
       return;
    }
    public final Object c(){
       AtomicReferenceArray obj;
       gq6 tx = this.x;
       gq6 tw = this.w;
       int i = (int)this.y.get() & tw;
       if ((obj = tx.get(i)) != gq6.A) {
          return obj;
       }
       int i1 = tw + 1;
       obj = tx.get(i1);
       tx.lazySet(i1, null);
       this.x = obj;
       return obj.get(i);
    }
    public final void clear(){
       do {
          if (this.poll() == null) {
          }
       } while (!this.isEmpty());
       return;
    }
    public final boolean isEmpty(){
       boolean b = (!(this.a.get() - this.y.get()))? true: false;
       return b;
    }
    public final boolean offer(Object p0){
       if (p0 == null) {
          throw new NullPointerException("Null is not a valid element");
       }
       gq6 tv = this.v;
       gq6 ta = this.a;
       long l = ta.get();
       gq6 tt = this.t;
       int i = (int)l & tt;
       if ((l - this.c) < 0) {
          tv.lazySet(i, p0);
          ta.lazySet((l + 1));
          return true;
       }else {
          long l1 = (long)this.b + l;
          if (tv.get(((int)l1 & tt)) == null) {
             this.c = l1 - 1;
             tv.lazySet(i, p0);
             ta.lazySet((l + 1));
             return true;
          }else {
             l1 = l + 1;
             if (tv.get(((int)l1 & tt)) == null) {
                tv.lazySet(i, p0);
                ta.lazySet(l1);
                return true;
             }else {
                AtomicReferenceArray uAtomicRefer = new AtomicReferenceArray(tv.length());
                this.v = uAtomicRefer;
                this.c = ((long)tt + l) - 1;
                uAtomicRefer.lazySet(i, p0);
                tv.lazySet((tv.length() - 1), uAtomicRefer);
                tv.lazySet(i, gq6.A);
                ta.lazySet(l1);
                return true;
             }
          }
       }
    }
    public final Object poll(){
       AtomicReferenceArray obj;
       Object obj1;
       gq6 tx = this.x;
       gq6 ty = this.y;
       long l = ty.get();
       gq6 tw = this.w;
       int i = (int)l & tw;
       int i1 = ((obj = tx.get(i)) == gq6.A)? 1: 0;
       if (obj != null && !i1) {
          tx.lazySet(i, null);
          ty.lazySet((l + 1));
          return obj;
       }else if(i1){
          int i2 = tw + 1;
          obj = tx.get(i2);
          tx.lazySet(i2, null);
          this.x = obj;
          if ((obj1 = obj.get(i)) != null) {
             obj.lazySet(i, null);
             ty.lazySet((l + 1));
          }
          return obj1;
       }else {
          return null;
       }
    }
}
