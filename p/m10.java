package p.m10;
import p.p10;
import p.s10;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class m10 extends p10	// class@001e02 from classes.dex
{
    public final int a;

    public void m10(int p0){
       super();
       this.a = p0;
    }
    public final Object a(s10 p0,s10 p1,s10 p2){
       return p0.apply(this);
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof m10) {
          return false;
       }
       if (p0.a != this.a) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (Integer.valueOf(this.a).hashCode() + 0);
    }
    public final String toString(){
       return tp2.n("AgeConfigurationReceived{minAge=", this.a, '}');
    }
}
