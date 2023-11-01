package p.ao3;
import java.util.concurrent.Callable;
import p.mp;
import java.lang.Object;
import p.vp;
import java.lang.Boolean;
import p.r45;

public final class ao3 implements Callable	// class@000fc0 from classes.dex
{
    public final int a;
    public final mp b;

    public void ao3(mp p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object call(){
       ao3 tb = this.b;
       switch (this.a){
           case 0:
             return tb.a();
           case 1:
             return tb.a();
           case 2:
             return Boolean.valueOf(tb.c());
           default:
             return tb.a();
       }
    }
}
