package p.gh2;
import p.fh2;
import p.bh3;
import p.ba0;
import java.lang.Class;
import java.lang.String;
import p.aa0;
import java.lang.Object;
import p.zg3;
import p.ns5;
import p.co5;
import p.tf0;
import p.tp2;

public class gh2 extends ba0 implements fh2, bh3	// class@001709 from classes.dex
{
    public final int x;
    public final int y;

    public void gh2(int p0,Class p1,String p2,String p3){
       super(aa0.a, p1, p2, p3, false);
       this.x = p0;
       this.y = 0;
    }
    public void gh2(int p0,Object p1,Class p2,String p3,String p4){
       super(p1, p2, p3, p4, false);
       this.x = p0;
       this.y = 0;
    }
    public final zg3 a(){
       ns5.a.getClass();
       return this;
    }
    public final boolean d(Object p0){
       ba0 ta;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (p0 instanceof gh2) {
          if (!this.t.equals(p0.t) || (!this.v.equals(p0.v) || (this.y != p0.y || (this.x != p0.x || (!co5.c(this.b, p0.b) || !co5.c(this.c(), p0.c())))))) {
             b = false;
          }
          return b;
       }else if(p0 instanceof bh3){
          if ((ta = this.a) == null) {
             this.a();
             this.a = this;
             ta = this;
          }
          return p0.equals(ta);
       }else {
          return false;
       }
    }
    public final int e(){
       int i = (this.c() == null)? 0: this.c().hashCode() * 31;
       return (this.v.hashCode() + tp2.g(this.t, i, 31));
    }
    public final boolean equals(Object p0){
       return this.d(p0);
    }
    public final String f(){
       ba0 ta;
       if ((ta = this.a) == null) {
          this.a();
          this.a = this;
          ta = this;
       }
       if (ta != this) {
          return ta.toString();
       }else {
          ba0 tt = this.t;
          String str = ("<init>".equals(tt))? "constructor \(Kotlin reflection is not available\)": tp2.m("function ", tt, " \(Kotlin reflection is not available\)");
          return str;
       }
    }
    public final int getArity(){
       return this.x;
    }
    public final int hashCode(){
       return this.e();
    }
    public final String toString(){
       return this.f();
    }
}
