package p.ey;
import p.bl2;
import android.os.Bundle;
import java.lang.Boolean;
import java.lang.Object;
import android.os.IInterface;
import p.fp0;
import android.app.PendingIntent;
import java.lang.String;
import android.os.Parcelable;
import java.util.ArrayList;

public abstract class ey	// class@001524 from classes.dex
{
    public Object a;
    public boolean b;
    public final bl2 c;
    public final int d;
    public final Bundle e;
    public final bl2 f;

    public void ey(bl2 p0,int p1,Bundle p2){
       this.f = p0;
       this.c = p0;
       super();
       this.a = Boolean.TRUE;
       this.b = false;
       this.d = p1;
       this.e = p2;
    }
    public final void a(Object p0){
       ey td;
       int i = 1;
       ey tf = this.f;
       IInterface iInterface = null;
       if ((td = this.d) == null) {
          if (!this.c()) {
             tf.o(i, iInterface);
             this.b(new fp0(8, iInterface));
             return;
          }
       }else {
          tf.o(i, iInterface);
          if ((i = this.e) != null) {
             iInterface = i.getParcelable("pendingIntent");
          }
          this.b(new fp0(td, iInterface));
       }
       return;
    }
    public abstract void b(fp0 p0);
    public abstract boolean c();
    public final void d(){
       this.e();
       bl2 k = this.c.k;
       _monitor_enter(k);
       this.c.k.remove(this);
       _monitor_exit(k);
    }
    public final void e(){
       _monitor_enter(this);
       this.a = null;
       _monitor_exit(this);
    }
}
