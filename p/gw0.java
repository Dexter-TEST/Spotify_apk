package p.gw0;
import p.zv6;
import p.ow0;
import java.lang.Object;

public final class gw0 implements zv6	// class@00178d from classes.dex
{
    public final int a;
    public final ow0 b;

    public void gw0(ow0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object get(){
       gw0 tb = this.b;
       switch (this.a){
           case 0:
           default:
             ow0.s(tb);
             return tb;
       }
       ow0.s(tb);
       return tb;
    }
}
