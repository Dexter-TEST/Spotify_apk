package p.f56;
import p.b5;
import p.g56;
import java.lang.Object;
import p.rw6;
import p.xy5;
import p.nw6;
import p.zh6;
import java.lang.String;
import p.tw6;
import android.database.Cursor;

public final class f56 implements b5	// class@001563 from classes.dex
{
    public final int a;
    public final g56 b;

    public void f56(g56 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       String[] b = g56.b;
       f56 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.a.i().Y().f0(new zh6("VACUUM", b)).close();
             return;
       }
       tb.a.i().Y().f0(new zh6("PRAGMA wal_checkpoint\(RESTART\)", b)).close();
       return;
    }
}
