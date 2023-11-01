package p.n15;
import java.lang.Object;
import p.wf2;
import android.window.OnBackInvokedCallback;
import java.lang.String;
import p.co5;
import p.m15;
import android.window.OnBackInvokedDispatcher;

public final class n15	// class@001f4a from classes.dex
{
    public static final n15 a;

    static {
       n15.a = new n15();
    }
    public void n15(){
       super();
    }
    public final OnBackInvokedCallback a(wf2 p0){
       co5.o(p0, "onBackInvoked");
       return new m15(0, p0);
    }
    public final void b(Object p0,int p1,Object p2){
       co5.o(p0, "dispatcher");
       co5.o(p2, "callback");
       p0.registerOnBackInvokedCallback(p1, p2);
    }
    public final void c(Object p0,Object p1){
       co5.o(p0, "dispatcher");
       co5.o(p1, "callback");
       p0.unregisterOnBackInvokedCallback(p1);
    }
}
