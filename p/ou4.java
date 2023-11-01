package p.ou4;
import p.zv6;
import p.ko1;
import p.tn6;
import java.lang.Object;
import p.yf2;

public final class ou4 implements zv6	// class@002191 from classes.dex
{
    public final int a;
    public final ko1 b;
    public final tn6 c;

    public void ou4(ko1 p0,tn6 p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final Object get(){
       ou4 tc = this.c;
       ou4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return tb.b.apply(tc);
       }
       return tb.b.apply(tc);
    }
}
