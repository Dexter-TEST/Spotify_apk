package p.tw5;
import java.lang.Runnable;
import java.lang.Object;
import p.uw5;
import p.h83;
import p.j83;
import android.view.ViewGroup$LayoutParams;
import android.view.View;

public final class tw5 implements Runnable	// class@0027f7 from classes.dex
{
    public final int a;
    public final int b;
    public final Object c;

    public void tw5(int p0,int p1,Object p2){
       this.a = p1;
       this.c = p2;
       this.b = p0;
       super();
    }
    public final void run(){
       tw5 tb = this.b;
       tw5 tc = this.c;
       switch (this.a){
           case 0:
           default:
             h83 a = tc.a;
             ViewGroup$LayoutParams layoutParams = a.i.getLayoutParams();
             layoutParams.height = (int)((float)tb * a.j);
             a.i.setLayoutParams(layoutParams);
             return;
       }
       tc.p(tb);
       return;
    }
}
