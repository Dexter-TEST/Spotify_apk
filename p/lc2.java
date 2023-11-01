package p.lc2;
import p.ir0;
import p.hs5;
import p.nc2;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.StringBuilder;
import p.hs3;

public final class lc2 implements ir0	// class@001d26 from classes.dex
{
    public final hs5 a;
    public final nc2 b;
    public final String c;

    public void lc2(hs5 p0,nc2 p1,String p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void accept(Object p0){
       this.a.a = false;
       this.b.e.c("Blocking event "+this.c+" was not persisted due to error: "+p0.getMessage(), p0);
    }
}
