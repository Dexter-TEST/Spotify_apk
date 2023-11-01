package p.zc2;
import java.lang.Runnable;
import androidx.fragment.app.Fragment;
import java.lang.Object;

public final class zc2 implements Runnable	// class@002eca from classes.dex
{
    public final int a;
    public final Fragment b;

    public void zc2(Fragment p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       zc2 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.callStartTransitionListener(false);
             return;
       }
       tb.startPostponedEnterTransition();
       return;
    }
}
