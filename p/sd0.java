package p.sd0;
import p.i87;
import android.view.ViewGroup;
import p.h87;
import p.uw5;
import p.g87;

public final class sd0 extends i87	// class@002605 from classes.dex
{
    public boolean a;
    public final ViewGroup b;

    public void sd0(ViewGroup p0){
       this.b = p0;
       super();
       this.a = false;
    }
    public final void a(h87 p0){
       if (this.a == null) {
          uw5.u(this.b, false);
       }
       p0.w(this);
       return;
    }
    public final void b(){
       uw5.u(this.b, false);
    }
    public final void c(){
       uw5.u(this.b, true);
    }
    public final void d(){
       uw5.u(this.b, false);
       this.a = true;
    }
}
