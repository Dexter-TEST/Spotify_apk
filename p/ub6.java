package p.ub6;
import java.lang.Runnable;
import com.google.android.material.behavior.SwipeDismissBehavior;
import android.view.View;
import java.lang.Object;
import p.fk3;
import p.kj3;
import java.lang.String;
import p.co5;
import p.bi7;
import p.wh7;
import p.dh7;
import p.u44;

public final class ub6 implements Runnable	// class@00287d from classes.dex
{
    public final int a;
    public boolean b;
    public final Object c;
    public final Object t;

    public void ub6(SwipeDismissBehavior p0,View p1,boolean p2){
       this.a = 1;
       this.t = p0;
       super();
       this.c = p1;
       this.b = p2;
    }
    public void ub6(fk3 p0,kj3 p1){
       this.a = 0;
       co5.o(p0, "registry");
       co5.o(p1, "event");
       super();
       this.c = p0;
       this.t = p1;
    }
    public final void run(){
       SwipeDismissBehavior a;
       ub6 tt = this.t;
       ub6 tc = this.c;
       switch (this.a){
           case 0:
             if (this.b == null) {
                tc.f(tt);
                this.b = true;
             }
             break;
           default:
             if ((a = tt.a) != null && a.g()) {
                dh7.m(tc, this);
             }else if(this.b != null && (a = tt.b) != null){
                a.B(tc);
             }
             return;
       }
       return;
    }
}
