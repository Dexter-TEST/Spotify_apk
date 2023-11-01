package p.dw7;
import android.os.IBinder$DeathRecipient;
import p.ow7;
import java.lang.Object;
import java.lang.String;
import p.jd;
import java.lang.ref.Reference;
import p.tp2;
import java.util.Iterator;
import java.util.ArrayList;
import p.bw7;
import android.os.RemoteException;
import java.lang.Exception;
import p.l08;

public final class dw7 implements IBinder$DeathRecipient	// class@0013d0 from classes.dex
{
    public final ow7 a;

    public void dw7(ow7 p0){
       this.a = p0;
    }
    public final void binderDied(){
       ow7 c;
       bw7 a;
       dw7 ta = this.a;
       Object[] objArray = new Object[0];
       ta.b.e("reportBinderDeath", objArray);
       tp2.v(ta.j.get());
       Object[] objArray1 = new Object[]{c};
       c = ta.c;
       ta.b.e("%s : Binder has died.", objArray1);
       ow7 d = ta.d;
       Iterator iterator = d.iterator();
       while (iterator.hasNext()) {
          RemoteException remoteExcept = new RemoteException(String.valueOf(c).concat(" : Binder has died."));
          if ((a = iterator.next().a) != null) {
             a.a(remoteExcept);
          }
       }
       d.clear();
       ta.d();
       return;
    }
}
