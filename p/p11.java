package p.p11;
import p.t11;
import java.lang.Comparable;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.AssertionError;
import java.lang.String;
import p.qb1;
import p.pb1;
import java.lang.Class;
import java.lang.Integer;
import java.lang.IllegalStateException;
import java.lang.System;

public final class p11 extends t11	// class@0021cd from classes.dex
{
    public static final p11 b;

    static {
       p11.b = new p11();
    }
    public void p11(){
       super("");
    }
    private Object readResolve(){
       return p11.b;
    }
    public final int a(t11 p0){
       int i = (p0 == this)? 0: 1;
       return i;
    }
    public final void b(StringBuilder p0){
       throw new AssertionError();
    }
    public final void c(StringBuilder p0){
       p0+"+8\)";
    }
    public final int compareTo(Object p0){
       int i = (p0 == this)? 0: 1;
       return i;
    }
    public final Comparable d(qb1 p0){
       p0.getClass();
       return Integer.valueOf(Integer.MAX_VALUE);
    }
    public final boolean e(Comparable p0){
       return false;
    }
    public final Comparable f(qb1 p0){
       throw new AssertionError();
    }
    public final t11 g(qb1 p0){
       throw new AssertionError("this statement should be unreachable");
    }
    public final t11 h(qb1 p0){
       throw new IllegalStateException();
    }
    public final int hashCode(){
       return System.identityHashCode(this);
    }
    public final String toString(){
       return "+8";
    }
}
