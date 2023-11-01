package p.gi1;
import p.ji1;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.ni1;
import java.lang.StringBuilder;
import p.hr7;

public final class gi1 extends ji1	// class@001711 from classes.dex
{
    public final String a;

    public void gi1(String p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(ni1 p0,ni1 p1,ni1 p2){
       return p0.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof gi1) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return hr7.a("EmailChanged{email=", this.a, '}');
    }
}
