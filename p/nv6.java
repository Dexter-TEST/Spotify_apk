package p.nv6;
import p.is3;
import java.lang.String;
import java.util.concurrent.LinkedBlockingQueue;
import java.lang.Object;
import p.se4;
import p.t63;
import java.util.Queue;
import java.lang.Exception;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Boolean;
import p.ov6;
import java.lang.reflect.Method;

public final class nv6 implements is3	// class@0002d8 from classes2.dex
{
    public final String a;
    public is3 b;
    public Boolean c;
    public Method t;
    public t63 v;
    public final Queue w;
    public final boolean x;

    public void nv6(String p0,LinkedBlockingQueue p1,boolean p2){
       super();
       this.a = p0;
       this.w = p1;
       this.x = p2;
    }
    public final void a(){
       this.c().a();
    }
    public final void b(Object[] p0){
       this.c().b(p0);
    }
    public final is3 c(){
       if (this.b != null) {
          return this.b;
       }
       if (this.x != null) {
          return se4.a;
       }
       if (this.v == null) {
          this.v = new t63(this, this.w);
       }
       return this.v;
    }
    public final void d(Object p0,Exception p1){
       this.c().d(p0, p1);
    }
    public final void e(String p0,Exception p1){
       this.c().e(p0, p1);
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || nv6.class != p0.getClass()) {
          return false;
       }
       if (!this.a.equals(p0.a)) {
          return false;
       }
       return true;
    }
    public final void f(Integer p0){
       this.c().f(p0);
    }
    public final boolean g(){
       nv6 tc;
       if ((tc = this.c) != null) {
          return tc.booleanValue();
       }
       try{
          Class[] uClassArray = new Class[]{ov6.class};
          this.t = this.b.getClass().getMethod("log", uClassArray);
          this.c = Boolean.TRUE;
       }catch(java.lang.NoSuchMethodException e0){
          this.c = Boolean.FALSE;
       }
       return this.c.booleanValue();
    }
    public final String getName(){
       return this.a;
    }
    public final void h(String p0){
       this.c().h(p0);
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final void i(String p0,Object p1,String p2){
       this.c().i(p0, p1, p2);
    }
}
