package p.f50;
import p.b50;
import java.lang.Object;
import android.view.View;
import p.i50;
import androidx.fragment.app.f;
import p.h50;
import p.dz3;
import p.xy3;
import p.ry3;
import p.ty3;

public final class f50 extends b50	// class@00155d from classes.dex
{
    public final int a;
    public final Object b;

    public void f50(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(View p0){
    }
    public final void b(View p0,int p1){
       f50 tb = this.b;
       switch (this.a){
           case 0:
             if (p1 == 5) {
                tb.cancel();
             }
             break;
           case 1:
             if (p1 == 5) {
                tb.v(false, false);
             }
             return;
             break;
           default:
             if (p1 == 5) {
                tb.C().e(ry3.a);
             }
             return;
       }
       return;
    }
}
