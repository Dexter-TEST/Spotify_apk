package p.ni2;
import p.la6;
import p.yf4;
import java.lang.Object;
import p.wc;
import p.n26;
import java.util.Iterator;
import p.mi2;
import p.u42;

public final class ni2 implements la6	// class@001fe2 from classes.dex
{
    public final int a;
    public final zf2 b;
    public final Object c;

    public void ni2(la6 p0,yf4 p1){
       this.a = 1;
       super();
       this.c = p0;
       this.b = p1;
    }
    public void ni2(wc p0,n26 p1){
       this.a = 0;
       super();
       this.c = p0;
       this.b = p1;
    }
    public final Iterator iterator(){
       switch (this.a){
           case 0:
           default:
             return new u42(this);
       }
       return new mi2(this);
    }
}
