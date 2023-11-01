package p.wo4;
import java.io.Serializable;
import p.he3;
import p.mg3;
import p.ka7;
import java.lang.Object;
import p.xo4;
import p.d81;
import java.lang.Class;
import p.cd2;
import java.lang.Throwable;
import p.wa6;
import p.vf3;
import p.e81;
import p.gb6;
import p.m00;

public final class wo4 implements Serializable	// class@002b78 from classes.dex
{
    public final he3 a;
    public final mg3 b;
    public static final wo4 c;

    static {
       wo4.c = new wo4(null, null, null);
    }
    public void wo4(he3 p0,mg3 p1,ka7 p2){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final wo4 a(xo4 p0,he3 p1){
       wo4 ta = this.a;
       if (p1 == null) {
          if (ta != null && this.b != null) {
             return new wo4(null, null, null);
          }
          return this;
       }else if(p1.equals(ta)){
          return this;
       }else if(p1.k()){
          d81 uod81 = p0.b();
          try{
             uod81.getClass();
             uod81.getClass();
             throw null;
          }catch(p.yf3 e3){
             throw new cd2(3, e3);
          }
       }else {
          p0.getClass();
          throw null;
       }
    }
    public final void b(vf3 p0,Object p1,d81 p2){
       p2.getClass();
       wo4 ta = this.a;
       if (this.b != null) {
          p2.getClass();
          if (p1 == null) {
             p2.B(p0);
          }else if(ta != null && !ta.a.isAssignableFrom(p1.getClass())){
             p2.m(p1, ta);
          }
          throw null;
       }else if(ta != null){
          p2.getClass();
          if (p1 == null) {
             p2.B(p0);
          }else if(!ta.a.isAssignableFrom(p1.getClass())){
             p2.m(p1, ta);
          }
          p2.p(ta, true, null);
          throw null;
       }else {
          p2.D(p0, p1);
       }
       return;
    }
}
