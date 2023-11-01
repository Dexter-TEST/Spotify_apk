package p.d50;
import java.lang.Runnable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.View;
import java.lang.Object;
import p.bi7;
import p.wh7;
import p.dh7;

public final class d50 implements Runnable	// class@0012dc from classes.dex
{
    public final View a;
    public boolean b;
    public int c;
    public final BottomSheetBehavior t;

    public void d50(BottomSheetBehavior p0,View p1,int p2){
       this.t = p0;
       super();
       this.a = p1;
       this.c = p2;
    }
    public final void run(){
       BottomSheetBehavior h;
       d50 tt = this.t;
       if ((h = tt.H) != null && h.g()) {
          dh7.m(this.a, this);
       }else {
          tt.F(this.c);
       }
       this.b = false;
       return;
    }
}
