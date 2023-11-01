package p.ni4;
import p.q60;
import android.content.Context;
import p.ce7;
import p.tq0;
import java.lang.String;
import java.lang.Object;
import p.co5;
import android.net.ConnectivityManager;
import p.ji4;
import p.mi4;
import android.content.IntentFilter;
import android.content.Intent;
import p.es3;
import java.lang.Class;

public final class ni4 extends q60	// class@001fe4 from classes.dex
{
    public final ConnectivityManager g;

    public void ni4(Context p0,ce7 p1){
       super(p0, p1);
       p0 = this.b.getSystemService("connectivity");
       co5.j(p0, "null cannot be cast to non-null type android.net.ConnectivityManager");
       this.g = p0;
    }
    public final Object a(){
       return mi4.a(this.g);
    }
    public final IntentFilter f(){
       return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }
    public final void g(Intent p0){
       co5.o(p0, "intent");
       if (co5.c(p0.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
          es3.c().getClass();
          this.c(mi4.a(this.g));
       }
       return;
    }
}
