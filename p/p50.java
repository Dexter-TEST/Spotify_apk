package p.p50;
import java.lang.Runnable;
import java.lang.Object;
import p.zy4;
import io.reactivex.rxjava3.disposables.Disposable;
import p.wa2;
import p.kv6;
import org.json.JSONObject;
import java.lang.String;
import p.is7;
import p.q50;
import p.t50;
import p.oz4;
import p.lz4;

public final class p50 implements Runnable	// class@0021f1 from classes.dex
{
    public final int a;
    public final Object b;

    public void p50(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void run(){
       p50 tb = this.b;
       switch (this.a){
           case 0:
             tb.c.p();
             return;
           case 1:
             is7.b(is7.a("", tb));
             return;
           case 2:
             tb.c.cancel();
             return;
           case 3:
             tb.c.dispose();
             return;
           default:
             tb.d();
             return;
       }
    }
}
