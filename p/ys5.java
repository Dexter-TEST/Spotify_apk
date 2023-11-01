package p.ys5;
import com.google.common.collect.c;
import java.lang.Object;
import java.lang.System;
import p.ap5;
import java.util.Objects;

public final class ys5 extends c	// class@002e1c from classes.dex
{
    public final Object[] c;
    public final int t;
    public static final ys5 v;

    static {
       Object[] objArray = new Object[0];
       ys5.v = new ys5(0, objArray);
    }
    public void ys5(int p0,Object[] p1){
       super();
       this.c = p1;
       this.t = p0;
    }
    public final int b(int p0,Object[] p1){
       ys5 tt = this.t;
       System.arraycopy(this.c, 0, p1, p0, tt);
       return (p0 + tt);
    }
    public final Object[] c(){
       return this.c;
    }
    public final int d(){
       return this.t;
    }
    public final int g(){
       return 0;
    }
    public final Object get(int p0){
       ap5.f(p0, this.t);
       object oobject = this.c[p0];
       Objects.requireNonNull(oobject);
       return oobject;
    }
    public final boolean k(){
       return false;
    }
    public final int size(){
       return this.t;
    }
}
