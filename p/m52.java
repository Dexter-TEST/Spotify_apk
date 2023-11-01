package p.m52;
import p.la6;
import p.zf2;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.Iterator;
import p.l52;

public final class m52 implements la6	// class@001e29 from classes.dex
{
    public final la6 a;
    public final zf2 b;
    public final zf2 c;

    public void m52(la6 p0,zf2 p1,zf2 p2){
       co5.o(p0, "sequence");
       co5.o(p1, "transformer");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final Iterator iterator(){
       return new l52(this);
    }
}
