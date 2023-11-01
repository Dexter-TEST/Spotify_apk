package p.cg;
import android.app.Activity;
import android.window.OnBackInvokedDispatcher;
import java.lang.Object;
import p.jg;
import android.window.OnBackInvokedCallback;
import java.util.Objects;
import p.bg;

public abstract class cg	// class@001205 from classes.dex
{

    public static OnBackInvokedDispatcher a(Activity p0){
       return p0.getOnBackInvokedDispatcher();
    }
    public static OnBackInvokedCallback b(Object p0,jg p1){
       Objects.requireNonNull(p1);
       bg uobg = new bg(p1);
       p0.registerOnBackInvokedCallback(0xf4240, uobg);
       return uobg;
    }
    public static void c(Object p0,Object p1){
       p0.unregisterOnBackInvokedCallback(p1);
    }
}
