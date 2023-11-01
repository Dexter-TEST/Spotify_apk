package p.v42;
import p.la6;
import p.zf2;
import java.lang.Object;
import java.util.Iterator;
import p.u42;

public final class v42 implements la6	// class@00297b from classes.dex
{
    public final la6 a;
    public final boolean b;
    public final zf2 c;

    public void v42(la6 p0,boolean p1,zf2 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final Iterator iterator(){
       return new u42(this);
    }
}
