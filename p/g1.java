package p.g1;
import java.util.RandomAccess;
import p.h1;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.h0;
import p.fv1;

public final class g1 extends h1 implements RandomAccess	// class@001682 from classes.dex
{
    public final h1 a;
    public final int b;
    public final int c;

    public void g1(h1 p0,int p1,int p2){
       co5.o(p0, "list");
       super();
       this.a = p0;
       this.b = p1;
       fv1.p(p1, p2, p0.a());
       this.c = p2 - p1;
    }
    public final int a(){
       return this.c;
    }
    public final Object get(int p0){
       fv1.n(p0, this.c);
       return this.a.get((this.b + p0));
    }
}
