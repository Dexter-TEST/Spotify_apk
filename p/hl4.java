package p.hl4;
import java.lang.Runnable;
import androidx.fragment.app.k;
import java.lang.Object;
import android.app.Activity;
import p.yk4;
import p.ae2;
import androidx.fragment.app.o;
import java.lang.String;
import androidx.fragment.app.f;

public final class hl4 implements Runnable	// class@001875 from classes.dex
{
    public final int a;
    public final k b;

    public void hl4(k p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       hl4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             new yk4().B(tb.y(), "contextMenu");
             return;
       }
       tb.runOnUiThread(new hl4(tb, 1));
       return;
    }
}
