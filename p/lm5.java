package p.lm5;
import p.hh3;
import p.ba0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import p.zg3;
import p.tf0;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import p.en6;

public abstract class lm5 extends ba0 implements hh3	// class@001d81 from classes.dex
{
    public final boolean x;

    public void lm5(Object p0,Class p1,String p2,String p3,int p4){
       boolean b = true;
       boolean b1 = (((p4 & 0x01)) == b)? true: false;
       super(p0, p1, p2, p3, b1);
       if (((p4 & 0x02)) != 2) {
          b = false;
       }
       this.x = b;
       return;
    }
    public final zg3 d(){
       zg3 ozg3;
       if (this.x != null) {
          ozg3 = this;
       }else if((ozg3 = this.a) == null){
          ozg3 = this.a();
          this.a = ozg3;
       }
       return ozg3;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (p0 instanceof lm5) {
          if (!this.c().equals(p0.c()) || (!this.t.equals(p0.t) || (!this.v.equals(p0.v) || !co5.c(this.b, p0.b)))) {
             b = false;
          }
          return b;
       }else if(p0 instanceof hh3){
          return p0.equals(this.d());
       }else {
          return false;
       }
    }
    public final int hashCode(){
       return (this.v.hashCode() + tp2.g(this.t, (this.c().hashCode() * 31), 31));
    }
    public final String toString(){
       zg3 ozg3;
       if ((ozg3 = this.d()) != this) {
          return ozg3.toString();
       }
       return en6.p("property ", this.t, " \(Kotlin reflection is not available\)");
    }
}
