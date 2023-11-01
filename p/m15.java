package p.m15;
import android.window.OnBackInvokedCallback;
import java.lang.Object;
import p.wf2;
import java.lang.String;
import p.co5;
import java.lang.Runnable;

public final class m15 implements OnBackInvokedCallback	// class@001e07 from classes.dex
{
    public final int a;
    public final Object b;

    public void m15(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onBackInvoked(){
       switch (this.a){
           case 0:
           default:
             this.b.run();
             return;
       }
       m15 tb = this.b;
       co5.o(tb, "$onBackInvoked");
       tb.invoke();
       return;
    }
}
