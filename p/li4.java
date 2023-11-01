package p.li4;
import p.tq0;
import android.content.Context;
import p.ce7;
import java.lang.String;
import java.lang.Object;
import p.co5;
import android.net.ConnectivityManager;
import p.ki4;
import p.ji4;
import p.mi4;
import p.es3;
import java.lang.Class;
import android.net.ConnectivityManager$NetworkCallback;
import p.yh4;
import java.lang.Throwable;
import p.wh4;

public final class li4 extends tq0	// class@001d5d from classes.dex
{
    public final ConnectivityManager f;
    public final ki4 g;

    public void li4(Context p0,ce7 p1){
       super(p0, p1);
       p0 = this.b.getSystemService("connectivity");
       co5.j(p0, "null cannot be cast to non-null type android.net.ConnectivityManager");
       this.f = p0;
       this.g = new ki4(0, this);
    }
    public final Object a(){
       return mi4.a(this.f);
    }
    public final void d(){
       String str = "Received exception while registering network callback";
       try{
          es3.c().getClass();
          yh4.a(this.f, this.g);
       }catch(java.lang.IllegalArgumentException e1){
          es3.c().b(mi4.a, str, e1);
       }catch(java.lang.SecurityException e1){
          es3.c().b(mi4.a, str, e1);
       }
       return;
    }
    public final void e(){
       String str = "Received exception while unregistering network callback";
       try{
          es3.c().getClass();
          wh4.c(this.f, this.g);
       }catch(java.lang.IllegalArgumentException e1){
          es3.c().b(mi4.a, str, e1);
       }catch(java.lang.SecurityException e1){
          es3.c().b(mi4.a, str, e1);
       }
       return;
    }
}
