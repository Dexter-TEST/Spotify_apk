package p.xd4;
import p.tc3;
import p.ae4;
import java.lang.String;
import io.reactivex.rxjava3.core.FlowableEmitter;
import java.util.Set;
import java.lang.Object;
import p.co5;
import java.util.concurrent.atomic.AtomicBoolean;
import p.c53;
import java.util.Collection;
import p.v62;
import p.h16;
import io.reactivex.rxjava3.core.Emitter;

public final class xd4 extends tc3	// class@002c56 from classes.dex
{
    public final int b;
    public final Object c;

    public void xd4(ae4 p0,String[] p1){
       this.b = 0;
       this.c = p0;
       super(p1);
    }
    public void xd4(String[] p0,FlowableEmitter p1){
       this.b = 1;
       this.c = p1;
       super(p0);
    }
    public final void a(Set p0){
       ae4 g;
       xd4 tc = this.c;
       switch (this.b){
           case 0:
             try{
                co5.o(p0, "tables");
                if (!tc.i.get() && (g = tc.g) != null) {
                   String[] stringArray = new String[0];
                   Object[] objArray = p0.toArray(stringArray);
                   co5.j(objArray, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                   g.q(objArray, tc.b);
                }
             }catch(android.os.RemoteException e0){
             }
             break;
           default:
             if (!tc.d()) {
                tc.onNext(h16.a);
             }
             return;
       }
       return;
    }
}
