package p.a67;
import android.view.View;
import android.window.OnBackInvokedDispatcher;
import java.lang.Runnable;
import android.window.OnBackInvokedCallback;
import java.lang.Object;
import java.util.Objects;
import p.m15;

public abstract class a67	// class@000f23 from classes.dex
{

    public static OnBackInvokedDispatcher a(View p0){
       return p0.findOnBackInvokedDispatcher();
    }
    public static OnBackInvokedCallback b(Runnable p0){
       Objects.requireNonNull(p0);
       return new m15(1, p0);
    }
    public static void c(Object p0,Object p1){
       p0.registerOnBackInvokedCallback(0xf4240, p1);
    }
    public static void d(Object p0,Object p1){
       p0.unregisterOnBackInvokedCallback(p1);
    }
}
