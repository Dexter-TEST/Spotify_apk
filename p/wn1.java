package p.wn1;
import p.fr0;
import p.vs0;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import p.co5;

public final class wn1 implements fr0	// class@002b6c from classes.dex
{
    public final int a;
    public final vs0 b;

    public void wn1(vs0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       wn1 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             co5.o(p0, "<set-?>");
             tb.a = p0;
             return;
           case 1:
             tb.getClass();
             co5.o(p0, "<set-?>");
             tb.b = p0;
             return;
           default:
             tb.getClass();
             co5.o(p0, "<set-?>");
             tb.c = p0;
             return;
       }
    }
}
