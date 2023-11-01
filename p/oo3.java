package p.oo3;
import java.lang.Runnable;
import java.lang.Object;
import p.j8;
import p.an5;
import p.av2;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingDisplayFragment;

public final class oo3 implements Runnable	// class@00215d from classes.dex
{
    public final int a;
    public final boolean b;
    public final Object c;

    public void oo3(int p0,Object p1,boolean p2){
       this.a = p0;
       this.c = p1;
       this.b = p2;
       super();
    }
    public final void run(){
       oo3 tb = this.b;
       oo3 tc = this.c;
       switch (this.a){
           case 0:
           default:
             InAppMessagingDisplayFragment.u(tc, tb);
             return;
       }
       tc.v.onNext(new av2(tb));
       return;
    }
}
