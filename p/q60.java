package p.q60;
import p.tq0;
import android.content.Context;
import p.ce7;
import p.fg;
import java.lang.Object;
import p.es3;
import p.r60;
import java.lang.Class;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;

public abstract class q60 extends tq0	// class@00233a from classes.dex
{
    public final fg f;

    public void q60(Context p0,ce7 p1){
       super(p0, p1);
       this.f = new fg(1, this);
    }
    public final void d(){
       es3.c().getClass();
       this.b.registerReceiver(this.f, this.f());
    }
    public final void e(){
       es3.c().getClass();
       this.b.unregisterReceiver(this.f);
    }
    public abstract IntentFilter f();
    public abstract void g(Intent p0);
}
