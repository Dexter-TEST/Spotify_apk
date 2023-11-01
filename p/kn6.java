package p.kn6;
import p.h25;
import p.mn6;
import java.lang.Integer;
import java.lang.Object;
import p.dt0;
import p.ln6;

public final class kn6 implements h25	// class@001c4b from classes.dex
{
    public final int a;
    public final mn6 b;
    public final Integer c;

    public void kn6(mn6 p0,Integer p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void a(dt0 p0){
       kn6 tc = this.c;
       kn6 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.C().o(tc.intValue());
             return;
       }
       tb.C().o(tc.intValue());
       return;
    }
}
