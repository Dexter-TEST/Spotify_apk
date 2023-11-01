package p.ct5;
import com.google.common.collect.c;
import java.lang.Object;
import p.ap5;
import java.util.Objects;

public final class ct5 extends c	// class@001274 from classes.dex
{
    public final Object[] c;
    public final int t;
    public final int v;

    public void ct5(int p0,int p1,Object[] p2){
       super();
       this.c = p2;
       this.t = p0;
       this.v = p1;
    }
    public final Object get(int p0){
       ap5.f(p0, this.v);
       object oobject = this.c[((p0 * 2) + this.t)];
       Objects.requireNonNull(oobject);
       return oobject;
    }
    public final boolean k(){
       return true;
    }
    public final int size(){
       return this.v;
    }
}
