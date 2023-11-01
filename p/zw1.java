package p.zw1;
import p.aw4;
import java.lang.Object;
import p.dw4;
import p.iw4;

public final class zw1 implements aw4	// class@002f79 from classes.dex
{
    public int a;
    public boolean b;
    public static final zw1 c;

    static {
       zw1.c = new zw1(0, 0);
    }
    public void zw1(int p0,boolean p1){
       this.b = p1;
       this.a = p0;
       super();
    }
    public dw4 call(){
       return new iw4(this.a, this.b);
    }
}
