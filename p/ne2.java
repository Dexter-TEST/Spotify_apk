package p.ne2;
import p.ar5;
import java.lang.Object;
import p.oe2;
import p.jt2;
import p.e33;
import java.util.IdentityHashMap;
import p.hz6;
import p.km;
import android.view.View;

public final class ne2 extends ar5	// class@001fbe from classes.dex
{
    public final int a;
    public final Object b;

    public void ne2(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void ne2(oe2 p0){
       this.a = 0;
       this.b = p0;
       super();
    }
    public final void a(){
       ne2 tb = this.b;
       switch (this.a){
           case 0:
             tb.b(true);
             return;
           case 1:
             tb.a();
             return;
           case 2:
             jt2 c = tb.c;
             c.b.clear();
             c.c.clear();
             return;
           default:
             tb.y.setVisibility(0);
             tb.y.forceLayout();
             tb.y.requestLayout();
             return;
       }
    }
    public final void b(int p0,int p1,Object p2){
       switch (this.a){
           case 0:
             this.a();
             return;
           case 1:
             this.b.a();
             return;
           case 2:
             this.g();
             return;
           default:
             this.g();
             return;
       }
    }
    public final void c(int p0,int p1){
       switch (this.a){
           case 0:
             this.a();
             return;
           case 1:
             this.b.a();
             return;
           default:
             return;
       }
    }
    public final void d(int p0,int p1){
       switch (this.a){
           case 0:
             this.a();
             return;
           case 1:
             this.b.a();
             return;
           default:
             return;
       }
    }
    public final void e(int p0,int p1){
       ne2 tb = this.b;
       switch (this.a){
           case 0:
             this.a();
             return;
           case 1:
             tb.a();
             return;
           case 2:
             jt2 c = tb.c;
             c.b.clear();
             c.c.clear();
             return;
           default:
             return;
       }
    }
    public final void g(){
       ne2 tb = this.b;
       switch (this.a){
           case 0:
             this.a();
             return;
           case 1:
             tb.a();
             return;
           case 2:
             jt2 c = tb.c;
             c.b.clear();
             c.c.clear();
             return;
           default:
             return;
       }
    }
}
