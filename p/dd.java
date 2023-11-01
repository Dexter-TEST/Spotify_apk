package p.dd;
import p.gs3;
import java.lang.String;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.lang.StringBuilder;
import java.lang.Object;
import android.util.Log;

public final class dd extends gs3	// class@00132a from classes.dex
{
    public final int a;
    public final Object b;

    public void dd(String p0,int p1){
       this.a = p1;
       if (p1 != 1) {
          super();
          this.b = p0;
          return;
       }else {
          super();
          this.b = Logger.getLogger(p0);
          return;
       }
    }
    public final void b(String p0){
       switch (this.a){
           case 0:
           default:
             this.b.log(Level.FINE, p0);
             return;
       }
       return;
    }
    public final void c(String p0){
       dd tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.log(Level.SEVERE, p0);
             return;
       }
       Log.e("isoparser", String.valueOf(tb)+":"+p0);
       return;
    }
    public final void d(String p0){
       switch (this.a){
           case 0:
           default:
             this.b.log(Level.WARNING, p0);
             return;
       }
       return;
    }
}
