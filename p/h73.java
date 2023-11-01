package p.h73;
import com.google.common.collect.c;
import java.lang.Object;
import com.google.common.collect.b;
import p.ap5;
import java.util.List;
import java.util.Iterator;
import p.e73;
import java.util.ListIterator;

public final class h73 extends c	// class@0017f6 from classes.dex
{
    public final int c;
    public final int t;
    public final c v;

    public void h73(c p0,int p1,int p2){
       this.v = p0;
       super();
       this.c = p1;
       this.t = p2;
    }
    public final Object[] c(){
       return this.v.c();
    }
    public final int d(){
       return ((this.v.g() + this.c) + this.t);
    }
    public final int g(){
       return (this.v.g() + this.c);
    }
    public final Object get(int p0){
       ap5.f(p0, this.t);
       return this.v.get((p0 + this.c));
    }
    public final Iterator iterator(){
       return this.q(0);
    }
    public final boolean k(){
       return true;
    }
    public final ListIterator listIterator(){
       return this.q(0);
    }
    public final ListIterator listIterator(int p0){
       return this.q(p0);
    }
    public final int size(){
       return this.t;
    }
    public final List subList(int p0,int p1){
       return this.u(p0, p1);
    }
    public final c u(int p0,int p1){
       ap5.i(p0, p1, this.t);
       h73 tc = this.c;
       p0 = p0 + tc;
       p1 = p1 + tc;
       return this.v.u(p0, p1);
    }
}
