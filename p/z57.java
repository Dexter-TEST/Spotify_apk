package p.z57;
import java.lang.Runnable;
import androidx.appcompat.widget.Toolbar;
import java.lang.Object;
import androidx.appcompat.widget.e;
import p.l64;

public final class z57 implements Runnable	// class@002e92 from classes.dex
{
    public final int a;
    public final Toolbar b;

    public void z57(Toolbar p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       Toolbar g0;
       z57 tb = this.b;
       switch (this.a){
           case 0:
           default:
             l64 ol64 = ((g0 = tb.g0) == null)? null: g0.b;
             if (ol64 != null) {
                ol64.collapseActionView();
             }
             return;
       }
       tb.m();
       return;
    }
}
