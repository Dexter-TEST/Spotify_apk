package p.hu;
import p.ks6;
import java.lang.String;
import p.k85;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import p.j85;
import p.h85;
import p.i85;
import java.util.HashMap;
import p.lq5;
import java.lang.StringBuilder;

public final class hu implements ks6	// class@0018c8 from classes.dex
{
    public final String a;
    public final k85 b;
    public final boolean c;
    public final Map t;

    public void hu(String p0,k85 p1,boolean p2,Map p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final boolean a(){
       hu tb = this.b;
       tb.getClass();
       v1 = tb instanceof j85;
       v0 = tb instanceof h85;
       boolean b = (v1 && tb)? true: false;
       return b;
    }
    public final boolean b(){
       hu tb = this.b;
       tb.getClass();
       boolean b = (!tb instanceof h85 && !tb instanceof i85)? false: true;
       return b;
    }
    public final hu c(k85 p0){
       lq5 olq5 = new lq5(this, 0);
       olq5.v = new HashMap(this.t);
       olq5.j(p0);
       return olq5.g();
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof hu) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || (this.c != p0.c || !this.t.equals(p0.t)))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       int i = 0xf4243;
       int i1 = (((this.a.hashCode() ^ i) * i) ^ this.b.hashCode()) * i;
       int i2 = (this.c != null)? 1231: 1237;
       return (((i1 ^ i2) * i) ^ this.t.hashCode());
    }
    public final String toString(){
       return "PasswordModel{password="+this.a+", passwordState="+this.b+", passwordHasFocus="+this.c+", validatedPasswordStates="+this.t+"}";
    }
}
