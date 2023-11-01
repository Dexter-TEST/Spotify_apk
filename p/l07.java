package p.l07;
import java.lang.Object;
import p.q12;
import p.bl2;
import p.m07;

public abstract class l07	// class@001cbd from classes.dex
{
    public final q12[] a;
    public final boolean b;
    public final int c;

    public void l07(){
       super();
       this.a = null;
       this.b = false;
       this.c = 0;
    }
    public void l07(q12[] p0,boolean p1,int p2){
       super();
       this.a = p0;
       boolean b = (p0 != null && p1)? true: false;
       this.b = b;
       this.c = p2;
       return;
    }
    public abstract void a(bl2 p0,m07 p1);
}
