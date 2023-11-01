package p.zl7;
import p.tb0;
import java.lang.Object;
import android.os.FileObserver;
import p.pb4;
import p.sb4;
import p.fn0;
import p.s36;
import java.util.Objects;
import p.am0;
import java.lang.Runnable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Scheduler;
import com.android.installreferrer.api.InstallReferrerClient;

public final class zl7 implements tb0	// class@002f20 from classes.dex
{
    public final int a;
    public final Object b;

    public void zl7(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void cancel(){
       zl7 tb = this.b;
       switch (this.a){
           case 0:
             Objects.requireNonNull(tb);
             s36.c.c(new am0(24, tb));
             return;
           case 1:
             tb.g();
             tb.b();
             return;
           case 2:
             tb.stopWatching();
             return;
           default:
             tb.endConnection();
             return;
       }
    }
}
