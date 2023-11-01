package p.w91;
import p.fr0;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.util.concurrent.atomic.AtomicLong;
import java.io.File;

public final class w91 implements fr0	// class@002aed from classes.dex
{
    public final int a;
    public final Object b;

    public void w91(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void accept(Object p0){
       w91 tb = this.b;
       switch (this.a){
           case 0:
           default:
             if (p0.isFile()) {
                tb.addAndGet(p0.length());
             }
             return;
       }
       tb.deleteDatabase(p0);
       return;
    }
}
