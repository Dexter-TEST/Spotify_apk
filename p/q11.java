package p.q11;
import p.t11;
import java.lang.Comparable;
import java.lang.Class;
import java.lang.Object;
import java.lang.StringBuilder;
import p.qb1;
import p.no5;
import java.lang.Integer;
import p.r11;
import p.s11;
import java.lang.String;

public final class q11 extends t11	// class@00230e from classes.dex
{

    public void q11(Comparable p0){
       p0.getClass();
       super(p0);
    }
    public final void b(StringBuilder p0){
       p0+'('+this.a;
    }
    public final void c(StringBuilder p0){
       p0+this.a+']';
    }
    public final Comparable d(qb1 p0){
       return this.a;
    }
    public final boolean e(Comparable p0){
       boolean b = (this.a.compareTo(p0) < 0)? true: false;
       return b;
    }
    public final Comparable f(qb1 p0){
       return p0.a(this.a);
    }
    public final t11 g(qb1 p0){
       Integer integer;
       r11 b = ((integer = p0.a(this.a)) == null)? r11.b: new s11(integer);
       return b;
    }
    public final t11 h(qb1 p0){
       return this;
    }
    public final int hashCode(){
       return (~ this.a.hashCode());
    }
    public final String toString(){
       return "/"+this.a+"\\";
    }
}
