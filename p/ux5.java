package p.ux5;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Throwable;
import p.tx5;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;

public final class ux5 implements Serializable	// class@00293e from classes.dex
{
    public final Object a;

    public void ux5(Object p0){
       this.a = p0;
    }
    public static final Throwable a(Object p0){
       p0 = (p0 instanceof tx5)? p0.a: null;
       return p0;
    }
    public final boolean equals(Object p0){
       boolean b = false;
       if (!p0 instanceof ux5) {
       }else if(!co5.c(this.a, p0.a)){
          b = true;
       }
       return b;
    }
    public final int hashCode(){
       ux5 ta;
       int i = ((ta = this.a) == null)? 0: ta.hashCode();
       return i;
    }
    public final String toString(){
       ux5 ta = this.a;
       String str = (ta instanceof tx5)? ta.toString(): "Success\("+ta+')';
       return str;
    }
}
