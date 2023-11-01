package p.gb6;
import p.p51;
import p.f02;
import p.oc7;
import p.tn4;
import p.oe7;
import p.d81;
import p.va6;
import p.fb6;
import java.lang.Class;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import p.dp5;
import java.util.HashMap;
import p.ne;
import p.ia7;
import p.he3;
import java.lang.String;
import p.oc3;
import p.vf3;
import p.mg3;
import p.ja7;
import p.wv5;
import java.lang.Throwable;
import p.wf0;
import p.yf3;
import java.io.Closeable;
import java.text.DateFormat;
import p.vj1;
import p.m00;
import p.yt0;
import p.wa6;
import p.a27;
import p.le;

public abstract class gb6 extends p51	// class@0016da from classes.dex
{
    public final oe7 a;
    public final mg3 b;
    public final mg3 c;
    public final mg3 t;
    public final mg3 v;
    public final dp5 w;
    public DateFormat x;
    public final boolean y;
    public static final oc7 A;
    public static final f02 z;

    static {
       gb6.z = new f02();
       gb6.A = new oc7();
    }
    public void gb6(){
       super();
       this.b = gb6.A;
       this.t = tn4.c;
       this.v = gb6.z;
       this.a = new oe7(2);
       this.w = null;
       this.y = true;
    }
    public void gb6(d81 p0,va6 p1,fb6 p2){
       dp5 uodp5;
       super();
       this.b = gb6.A;
       this.t = tn4.c;
       f02 z = gb6.z;
       this.v = z;
       gb6 a = p0.a;
       this.a = a;
       this.b = p0.b;
       this.c = p0.c;
       gb6 t = p0.t;
       this.t = t;
       this.v = p0.v;
       boolean b = (t == z)? true: false;
       this.y = b;
       p1.getClass();
       p1.getClass();
       if ((uodp5 = a.b.get()) == null) {
          _monitor_enter(a);
          if ((uodp5 = a.b.get()) == null) {
             dp5 uodp51 = new dp5(a.a);
             a.b.set(uodp51);
             uodp5 = uodp51;
          }
          _monitor_exit(a);
       }
       this.w = uodp5;
       return;
    }
    public final ne e(){
       return null;
    }
    public final ia7 f(){
       throw null;
    }
    public final Object h(he3 p0,String p1){
       throw new oc3(null, p1);
    }
    public final mg3 i(Class p0){
       throw null;
    }
    public final mg3 j(he3 p0){
       mg3 omg3;
       try{
          if ((omg3 = this.k(p0)) != null) {
             gb6 ta = this.a;
             _monitor_enter(ta);
             if (ta.a.put(new ja7(p0, false), omg3) == null) {
                ta.b.set(null);
             }
             if (omg3 instanceof wv5) {
                omg3.a(this);
             }
             _monitor_exit(ta);
          }
          return omg3;
       }catch(java.lang.IllegalArgumentException e6){
          throw new yf3(null, wf0.f(e6), e6);
       }
    }
    public final mg3 k(he3 p0){
       throw null;
    }
    public final DateFormat l(){
       gb6 tx;
       if ((tx = this.x) != null) {
          return tx;
       }
       throw null;
    }
    public final void m(Object p0,he3 p1){
       if (p1.l() && wf0.u(p1.a).isAssignableFrom(p0.getClass())) {
          return;
       }
       Object[] objArray = new Object[]{p1,wf0.c(p0)};
       this.h(p1, String.format("Incompatible types: declared root type \(%s\) vs %s", objArray));
       throw null;
    }
    public final void n(vf3 p0){
       if (this.y != null) {
          p0.k0();
       }else {
          this.t.serialize(null, p0, this);
       }
       return;
    }
    public final mg3 o(Class p0){
       object oobject;
       vj1 ovj1;
       mg3 omg3;
       int i1;
       gb6 tw = this.w;
       tw.getClass();
       int i = 1;
       if ((oobject = tw.a[((p0.getName().hashCode() + i) & tw.b)]) == null) {
       label_0048 :
          ovj1 = null;
       }else if(oobject.d == p0 && oobject.a != null){
          i1 = 1;
       }else {
          i1 = 0;
       }
       if (i1) {
          ovj1 = oobject.b;
       }else if((ovj1 = oobject.c) != null){
          i1 = (ovj1.d == p0 && ovj1.a != null)? 1: 0;
          if (i1) {
             ovj1 = ovj1.b;
          }
       }else {
          goto label_0048 ;
       }
    }
    public final mg3 p(he3 p0,boolean p1,m00 p2){
       vj1 ovj1;
       mg3 omg3;
       int i;
       gb6 tw = this.w;
       tw.getClass();
       object oobject = tw.a[((p0.b - 2) & tw.b)];
       boolean b = true;
       if (oobject == null) {
       label_004a :
          ovj1 = null;
       }else if(oobject.a != null && p0.equals(oobject.e)){
          i = 1;
       }else {
          i = 0;
       }
       if (i) {
          ovj1 = oobject.b;
       }else if((ovj1 = oobject.c) != null){
          i = (ovj1.a != null && p0.equals(ovj1.e))? 1: 0;
          if (i) {
             ovj1 = ovj1.b;
          }
       }else {
          goto label_004a ;
       }
    }
    public final mg3 q(Class p0,m00 p1){
       mg3 omg3;
       if ((omg3 = this.w.a(p0)) == null && (omg3 = this.a.o(p0)) == null) {
          throw null;
       }
       return this.v(omg3, p1);
    }
    public final mg3 r(m00 p0,he3 p1){
       mg3 omg3;
       if (p1 != null) {
          if ((omg3 = this.w.b(p1)) == null && ((omg3 = this.a.p(p1)) == null && (omg3 = this.j(p1)) == null)) {
             return this.u(p1.a);
          }
          return this.v(omg3, p0);
       }else {
          Object[] objArray = new Object[0];
          this.y("Null passed for `valueType` of `findValueSerializer\(\)`", objArray);
          throw null;
       }
    }
    public final mg3 s(he3 p0){
       mg3 omg3;
       if ((omg3 = this.w.b(p0)) == null && ((omg3 = this.a.p(p0)) == null && (omg3 = this.j(p0)) == null)) {
          omg3 = this.u(p0.a);
       }
       return omg3;
    }
    public final ne t(){
       throw null;
    }
    public final mg3 u(Class p0){
       if (p0 == Object.class) {
          return this.b;
       }
       return new oc7(p0);
    }
    public final mg3 v(mg3 p0,m00 p1){
       if (p0 != null && p0 instanceof yt0) {
          p0 = p0.b(this, p1);
       }
       return p0;
    }
    public final boolean w(wa6 p0){
       throw false;
    }
    public final void x(a27 p0,String p1,Object[] p2){
       Object[] objArray = new Object[2];
       objArray[0] = wf0.p(p0.h());
       if (p2.length > 0) {
          p1 = String.format(p1, p2);
       }
       objArray[1] = p1;
       throw new oc3(null, String.format("Invalid type definition for type %s: %s", objArray), 0);
    }
    public final void y(String p0,Object[] p1){
       if (p1.length > 0) {
          p0 = String.format(p0, p1);
       }
       throw new yf3(null, p0, null);
    }
    public abstract mg3 z(le p0,Object p1);
}
