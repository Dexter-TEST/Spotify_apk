package p.uh5;
import p.th5;
import java.lang.Object;

public final class uh5 extends th5	// class@0028af from classes.dex
{
    public final Object d;

    public void uh5(int p0){
       super(p0, 1);
       this.d = new Object();
    }
    public final Object a(){
       uh5 td = this.d;
       _monitor_enter(td);
       _monitor_exit(td);
       return super.a();
    }
    public final boolean b(Object p0){
       uh5 td = this.d;
       _monitor_enter(td);
       _monitor_exit(td);
       return super.b(p0);
    }
}
