package p.v4;
import java.lang.ref.WeakReference;
import p.a5;
import java.lang.Object;
import java.lang.ref.ReferenceQueue;

public final class v4 extends WeakReference	// class@002981 from classes.dex
{
    public final a5 a;

    public void v4(a5 p0,Object p1,ReferenceQueue p2){
       super(p1, p2);
       this.a = p0;
    }
}
