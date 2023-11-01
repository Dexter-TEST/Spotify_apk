package p.g81;
import java.lang.Runnable;
import java.lang.Object;
import androidx.fragment.app.f;
import android.content.DialogInterface;
import p.xa1;
import p.h81;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.d;
import androidx.fragment.app.o;

public final class g81 implements Runnable	// class@0016b9 from classes.dex
{
    public final int a;
    public final Object b;

    public void g81(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void run(){
       g81 tb = this.b;
       switch (this.a){
           case 0:
             tb.b.endViewTransition(tb.c);
             tb.d.a();
             return;
           case 1:
             tb.t.onDismiss(tb.C);
             return;
           default:
             tb.x(true);
             return;
       }
    }
}
