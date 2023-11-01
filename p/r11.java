package p.r11;
import p.t11;
import java.lang.Comparable;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.AssertionError;
import p.qb1;
import p.pb1;
import java.lang.Class;
import java.lang.Integer;
import java.lang.IllegalStateException;
import java.lang.System;

public final class r11 extends t11	// class@002455 from classes.dex
{
    public static final r11 b;

    static {
       r11.b = new r11();
    }
    public void r11(){
       super("");
    }
    private Object readResolve(){
       return r11.b;
    }
    public final int a(t11 p0){
       int i = (p0 == this)? 0: -1;
       return i;
    }
    public final void b(StringBuilder p0){
       p0+"\(-8";
    }
    public final void c(StringBuilder p0){
       throw new AssertionError();
    }
    public final int compareTo(Object p0){
       int i = (p0 == this)? 0: -1;
       return i;
    }
    public final Comparable d(qb1 p0){
       throw new AssertionError();
    }
    public final boolean e(Comparable p0){
       return true;
    }
    public final Comparable f(qb1 p0){
       p0.getClass();
       return Integer.valueOf(Integer.MIN_VALUE);
    }
    public final t11 g(qb1 p0){
       throw new IllegalStateException();
    }
    public final t11 h(qb1 p0){
       throw new AssertionError("this statement should be unreachable");
    }
    public final int hashCode(){
       return System.identityHashCode(this);
    }
    public final String toString(){
       return "-8";
    }
}
