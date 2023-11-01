package p.vk5;
import java.lang.Runnable;
import java.lang.Object;
import p.wk5;
import p.qq7;
import com.spotify.liteappstorage.files.StorageLocationMovingService;
import java.lang.String;
import p.wn6;
import p.tn6;
import p.eq3;
import p.rn6;

public final class vk5 implements Runnable	// class@002a12 from classes.dex
{
    public final int a;
    public final boolean b;
    public final Object c;
    public final Object t;

    public void vk5(Object p0,Object p1,boolean p2,int p3){
       this.a = p3;
       this.c = p0;
       this.t = p1;
       this.b = p2;
       super();
    }
    public final void run(){
       vk5 tb = this.b;
       vk5 tt = this.t;
       vk5 tc = this.c;
       switch (this.a){
           case 0:
           default:
             wn6 own6 = tc.t.edit();
             own6.c(eq3.h, tt);
             own6.a(eq3.i, tb);
             own6.f();
             return;
       }
       tc.b(tt, tb);
       return;
    }
}
