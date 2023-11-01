package p.c87;
import p.la6;
import p.zf2;
import java.lang.Object;
import java.util.Iterator;
import p.b87;

public final class c87 implements la6	// class@0011bb from classes.dex
{
    public final la6 a;
    public final zf2 b;

    public void c87(la6 p0,zf2 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Iterator iterator(){
       return new b87(this);
    }
}
