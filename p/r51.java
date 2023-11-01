package p.r51;
import p.yt0;
import p.is6;
import java.lang.Class;
import java.lang.Boolean;
import java.text.DateFormat;
import java.util.concurrent.atomic.AtomicReference;
import p.tf3;
import p.he3;
import p.qo5;
import p.gb6;
import p.m00;
import p.mg3;
import p.js6;
import p.rf3;
import p.qf3;
import java.lang.String;
import java.lang.Object;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import p.wa6;
import java.lang.IllegalArgumentException;
import java.util.Date;
import p.vf3;

public abstract class r51 extends is6 implements yt0	// class@00247a from classes.dex
{
    public final Boolean t;
    public final DateFormat v;
    public final AtomicReference w;

    public void r51(Class p0,Boolean p1,DateFormat p2){
       super(0, p0);
       this.t = p1;
       this.v = p2;
       AtomicReference uAtomicRefer = (p2 == null)? null: new AtomicReference();
       this.w = uAtomicRefer;
       return;
    }
    public final void acceptJsonFormatVisitor(tf3 p0,he3 p1){
       this.e(p0.a);
    }
    public final mg3 b(gb6 p0,m00 p1){
       rf3 orf3;
       rf3 a;
       SimpleDateFormat simpleDateFo;
       if ((orf3 = js6.c(p1, p0, this.a)) == null) {
          return this;
       }
       rf3 b = orf3.b;
       if (b.a()) {
          return this.g(Boolean.TRUE, null);
       }
       int i = 1;
       int i1 = ((a = orf3.a) != null && a.length() > 0)? 1: 0;
       rf3 c = orf3.c;
       p0.getClass();
       if (i1) {
          if (c == null) {
             i = 0;
          }
          if (i) {
             simpleDateFo = new SimpleDateFormat(a, c);
             if (orf3.d()) {
                simpleDateFo.setTimeZone(orf3.c());
                return this.g(Boolean.FALSE, simpleDateFo);
             }else {
                throw null;
             }
          }else {
             throw null;
          }
       }else if(c != null){
          simpleDateFo = 1;
       }else {
          simpleDateFo = 0;
       }
       boolean b1 = orf3.d();
       b = (b == qf3.w)? 1: 0;
       if (!simpleDateFo && (!b1 && !b)) {
          return this;
       }else {
          throw null;
       }
    }
    public final boolean e(gb6 p0){
       r51 tt;
       if ((tt = this.t) != null) {
          return tt.booleanValue();
       }
       if (this.v != null) {
          return false;
       }
       if (p0 != null) {
          return p0.w(wa6.t);
       }
       throw new IllegalArgumentException("Null SerializerProvider passed for ".concat(this.a.getName()));
    }
    public final void f(Date p0,vf3 p1,gb6 p2){
       r51 tv;
       DateFormat andSet;
       if ((tv = this.v) == null) {
          p2.getClass();
          if (p2.w(wa6.t)) {
             p1.o0(p0.getTime());
          }else {
             p1.x0(p2.l().format(p0));
          }
          return;
       }else {
          r51 tw = this.w;
          if ((andSet = tw.getAndSet(null)) == null) {
             andSet = tv.clone();
          }
          p1.x0(andSet.format(p0));
          do {
          } while (tw.compareAndSet(null, andSet) || tw.get() != null);
          return;
       }
    }
    public abstract r51 g(Boolean p0,DateFormat p1);
    public final boolean isEmpty(gb6 p0,Object p1){
       return false;
    }
}
