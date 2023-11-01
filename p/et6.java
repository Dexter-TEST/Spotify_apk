package p.et6;
import java.lang.Runnable;
import com.spotify.liteappstorage.files.StorageLocationMovingService;
import java.lang.Object;
import java.lang.Class;
import android.content.ContextWrapper;
import com.jakewharton.processphoenix.ProcessPhoenix;
import p.eq3;
import p.rn6;
import java.lang.String;
import p.tn6;
import p.wn6;

public final class et6 implements Runnable	// class@0014f6 from classes.dex
{
    public final int a;
    public final StorageLocationMovingService b;

    public void et6(StorageLocationMovingService p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       String str;
       et6 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             ProcessPhoenix.b(tb);
             return;
           case 1:
             tb.a();
             return;
           default:
             rn6 h = eq3.h;
             if ((str = tb.t.g(h, null)) != null) {
                wn6 own6 = tb.t.edit();
                own6.c(eq3.g, str);
                own6.c(h, null);
                own6.f();
             }
             return;
       }
    }
}
