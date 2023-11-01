package p.zd4;
import android.content.ServiceConnection;
import p.ae4;
import java.lang.Object;
import p.ow7;
import android.content.ComponentName;
import android.os.IBinder;
import java.lang.String;
import p.co5;
import p.be4;
import android.os.IInterface;
import p.c53;
import p.b53;
import java.util.concurrent.Executor;
import java.lang.Runnable;
import p.jd;
import p.fw7;
import android.os.Handler;
import p.hw7;

public final class zd4 implements ServiceConnection	// class@002ed5 from classes.dex
{
    public final int a;
    public final Object b;

    public void zd4(ae4 p0){
       this.a = 0;
       this.b = p0;
       super();
    }
    public void zd4(ow7 p0){
       this.a = 1;
       this.b = p0;
       super();
    }
    public final void onServiceConnected(ComponentName p0,IBinder p1){
       IInterface iInterface;
       zd4 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             Object[] objArray = new Object[]{p0};
             tb.b.e("ServiceConnectionImpl.onServiceConnected\(%s\)", objArray);
             tb.a().post(new fw7(this, p1));
             return;
       }
       co5.o(p0, "name");
       co5.o(p1, "service");
       if ((iInterface = p1.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService")) != null && iInterface instanceof c53) {
       }else {
          iInterface = new b53(p1);
       }
       tb.g = iInterface;
       tb.e.execute(tb.k);
       return;
    }
    public final void onServiceDisconnected(ComponentName p0){
       zd4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             Object[] objArray = new Object[]{p0};
             tb.b.e("ServiceConnectionImpl.onServiceDisconnected\(%s\)", objArray);
             tb.a().post(new hw7(1, this));
             return;
       }
       co5.o(p0, "name");
       tb.e.execute(tb.l);
       tb.g = null;
       return;
    }
}
