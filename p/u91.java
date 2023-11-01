package p.u91;
import java.io.Serializable;
import p.p51;
import p.t91;
import java.lang.Class;
import java.lang.Object;
import p.eg3;
import p.am2;
import p.qg3;
import java.lang.String;
import p.xa4;
import p.if3;
import p.yf3;
import p.pc3;
import p.wf0;
import p.ne;
import p.ia7;
import p.he3;
import p.oc3;
import p.ts3;
import p.ei0;
import p.m00;
import p.n14;
import p.bg7;
import p.xt0;
import p.n91;
import java.lang.Number;
import p.v91;
import p.mu6;
import java.util.Date;
import java.text.DateFormat;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;

public abstract class u91 extends p51 implements Serializable	// class@002867 from classes.dex
{
    public final int a;
    public final am2 b;
    public final eg3 c;
    public DateFormat t;
    public n91 v;

    public void u91(u91 p0,t91 p1){
       super();
       p0.getClass();
       p0.getClass();
       this.b = null;
       p1.getClass();
       this.a = 0;
       this.c = null;
    }
    public void u91(u91 p0,t91 p1,eg3 p2){
       super();
       p0.getClass();
       p0.getClass();
       am2 uoam2 = (p2 == null)? null: p2.s0();
       this.b = uoam2;
       p1.getClass();
       this.a = 0;
       p1.getClass();
       this.c = p2;
       return;
    }
    public static xa4 H(eg3 p0,qg3 p1,String p2){
       Object[] objArray = new Object[]{p0.x(),p1};
       return new xa4(p0, p51.a(String.format("Unexpected token \(%s\), expected %s", objArray), p2), 0);
    }
    public final void A(String p0,Object[] p1){
       if (p1.length > 0) {
          p0 = String.format(p0, p1);
       }
       throw new xa4(this.c, p0, 0);
    }
    public final void B(if3 p0,String p1,Object[] p2){
       if (p2.length > 0) {
          p1 = String.format(p1, p2);
       }
       p0.handledType();
       throw new xa4(this.c, p1, 0);
    }
    public final void C(String p0,Object[] p1){
       if (p1.length > 0) {
          p0 = String.format(p0, p1);
       }
       throw new xa4(this.c, p0);
    }
    public final void D(Class p0,String p1,String p2,Object[] p3){
       if (p3.length > 0) {
          p2 = String.format(p2, p3);
       }
       xa4 oxa4 = new xa4(this.c, p2, 0);
       if (p1 != null) {
          oxa4.e(p0, p1);
       }
       throw oxa4;
    }
    public final void E(if3 p0,qg3 p1,String p2,Object[] p3){
       if (p3.length > 0) {
          p2 = String.format(p2, p3);
       }
       p0.handledType();
       throw u91.H(this.c, p1, p2);
    }
    public final void F(qg3 p0,String p1,Object[] p2){
       u91 tc;
       if (p2.length > 0) {
          p1 = String.format(p1, p2);
       }
       p2 = new Object[]{tc.x(),p0};
       tc = this.c;
       throw new xa4(tc, p51.a(String.format("Unexpected token \(%s\), expected %s", p2), p1));
    }
    public final pc3 G(Class p0,String p1,String p2){
       Object[] objArray = new Object[]{wf0.p(p0),p51.b(p1),p2};
       return new pc3(this.c, String.format("Cannot deserialize value of type %s from String %s: %s", objArray), p1);
    }
    public final ne e(){
       return null;
    }
    public final ia7 f(){
       throw null;
    }
    public final Object h(he3 p0,String p1){
       throw new oc3(this.c, p1);
    }
    public final he3 i(Class p0){
       if (p0 == null) {
          return null;
       }
       throw null;
    }
    public final ei0 j(ts3 p0,Class p1,int p2){
       throw null;
    }
    public final ei0 k(ts3 p0,Class p1){
       throw null;
    }
    public final if3 l(m00 p0,he3 p1){
       throw null;
    }
    public final if3 m(he3 p0){
       throw null;
    }
    public final ne n(){
       throw null;
    }
    public final void o(if3 p0){
       if (this.x(n14.b)) {
          return;
       }
       Object[] objArray = new Object[]{wf0.j(this.i(p0.handledType()))};
       throw new oc3(this.c, String.format("Invalid configuration: values of type %s cannot be merged", objArray));
    }
    public final Object p(Class p0,bg7 p1,eg3 p2,String p3,Object[] p4){
       if (p4.length > 0) {
          String.format(p3, p4);
       }
       throw null;
    }
    public final if3 q(if3 p0,m00 p1,he3 p2){
       if (p0 instanceof xt0) {
          this.v = new n91(p2, 3, this.v);
          p0 = p0.a(this, p1);
          this.v = this.v.c;
       }
       return p0;
    }
    public final void r(he3 p0,qg3 p1,eg3 p2,String p3,Object[] p4){
       if (p4.length > 0) {
          String.format(p3, p4);
       }
       throw null;
    }
    public final void s(eg3 p0,Class p1){
       Object[] objArray = new Object[0];
       this.r(this.i(p1), p0.x(), p0, null, objArray);
       throw null;
    }
    public final void t(eg3 p0,he3 p1){
       Object[] objArray = new Object[0];
       this.r(p1, p0.x(), p0, null, objArray);
       throw null;
    }
    public final void u(Class p0,Number p1,String p2,Object[] p3){
       if (p3.length > 0) {
          String.format(p2, p3);
       }
       throw null;
    }
    public final void v(Class p0,String p1,String p2,Object[] p3){
       if (p3.length > 0) {
          String.format(p2, p3);
       }
       throw null;
    }
    public final boolean w(v91 p0){
       boolean b = ((p0.a & this.a))? true: false;
       return b;
    }
    public final boolean x(n14 p0){
       throw false;
    }
    public final boolean y(mu6 p0){
       u91 tb = this.b;
       tb.getClass();
       boolean b = ((p0.b() & tb.b))? true: false;
       return b;
    }
    public final Date z(String p0){
       u91 tt;
       try{
          if ((tt = this.t) != null) {
             return tt.parse(p0);
          }
          throw null;
       }catch(java.text.ParseException e0){
          Object[] objArray = new Object[]{p0,wf0.f(e0)};
          throw new IllegalArgumentException(String.format("Failed to parse Date value \'%s\': %s", objArray));
       }
    }
}
