package p.eu3;
import p.z6;
import java.lang.Object;
import p.zf2;
import p.y6;
import p.gu3;
import java.lang.String;
import p.co5;
import com.spotify.lite.appmain.MainActivity;
import java.lang.Boolean;
import java.lang.Class;
import p.fp3;
import io.reactivex.rxjava3.core.Observable;
import p.rz3;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.fn0;

public final class eu3 implements z6	// class@0014fc from classes.dex
{
    public final int a;
    public final Object b;

    public void eu3(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void b(Object p0){
       eu3 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.getClass();
             if (p0.booleanValue()) {
                tb.Q.c(tb.d0.c.distinctUntilChanged().subscribe(new rz3(tb, 3)));
             }
             return;
       }
       co5.o(tb, "$tmp0");
       tb.invoke(p0);
       return;
    }
}
