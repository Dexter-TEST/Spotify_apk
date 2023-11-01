package p.ox3;
import p.ir0;
import p.es;
import java.lang.Object;
import p.wu;
import p.nx3;
import p.lx3;
import p.am0;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.spotify.base.java.logging.Logger;
import androidx.fragment.app.f;

public final class ox3 implements ir0	// class@0021ab from classes.dex
{
    public final int a;
    public final es b;

    public void ox3(es p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       ox3 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.getClass();
             Object[] objArray = new Object[0];
             Logger.c(p0, "Error in getting player state", objArray);
             tb.a.v(0, 0);
             return;
       }
       tb.i = p0;
       p0 = tb.a;
       am0 uoam0 = new am0(26, p0);
       p0.I.d(uoam0, 500, TimeUnit.MILLISECONDS);
       return;
    }
}
