package p.cf2;
import p.g87;
import android.view.View;
import java.util.ArrayList;
import java.lang.Object;
import p.h87;

public final class cf2 implements g87	// class@0011f6 from classes.dex
{
    public final View a;
    public final ArrayList b;

    public void cf2(View p0,ArrayList p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(h87 p0){
       p0.w(this);
       this.a.setVisibility(8);
       cf2 tb = this.b;
       int i = tb.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          tb.get(i1).setVisibility(0);
       }
       return;
    }
    public final void b(){
    }
    public final void c(){
    }
    public final void d(){
    }
    public final void e(h87 p0){
       p0.w(this);
       p0.a(this);
    }
}
