package p.n11;
import android.content.ServiceConnection;
import java.lang.Object;
import android.content.ComponentName;
import p.lq5;
import android.os.IBinder;
import p.p43;
import java.lang.String;
import android.os.IInterface;
import p.q43;
import p.o43;
import android.content.Context;
import java.lang.IllegalStateException;

public abstract class n11 implements ServiceConnection	// class@001f46 from classes.dex
{
    public Context a;

    public void n11(){
       super();
    }
    public abstract void a(ComponentName p0,lq5 p1);
    public final void onServiceConnected(ComponentName p0,IBinder p1){
       q43 oq43;
       IInterface iInterface;
       if (this.a == null) {
          throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
       }
       if (p1 == null) {
          oq43 = null;
       }else if((iInterface = p1.queryLocalInterface("android.support.customtabs.ICustomTabsService")) != null && iInterface instanceof q43){
          oq43 = iInterface;
       }else {
          oq43 = new o43(p1);
       }
       this.a(p0, new lq5(this, oq43, p0, this.a));
       return;
    }
}
