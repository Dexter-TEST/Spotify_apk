package p.kp0;
import java.lang.Runnable;
import android.view.View;
import java.lang.Object;
import p.gy5;
import p.mp0;

public final class kp0 implements Runnable	// class@001c57 from classes.dex
{
    public final int a;
    public final View b;

    public void kp0(View p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       kp0 tb = this.b;
       switch (this.a){
           case 0:
             tb.setVisibility(8);
             return;
           case 1:
             tb.setVisibility(8);
             return;
           default:
             tb.setVisibility(0);
             return;
       }
    }
}
