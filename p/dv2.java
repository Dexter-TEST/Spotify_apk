package p.dv2;
import android.view.View$OnClickListener;
import android.view.View$OnLongClickListener;
import p.du2;
import java.lang.Object;
import java.lang.Class;
import java.lang.AssertionError;
import java.lang.String;
import android.view.View;
import p.ju2;
import p.cu2;
import p.dt5;
import p.m73;

public final class dv2 implements View$OnClickListener, View$OnLongClickListener	// class@0013c2 from classes.dex
{
    public final du2 a;
    public String b;
    public ju2 c;
    public View t;
    public boolean v;

    public void dv2(du2 p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final void a(){
       if (this.v == null) {
          return;
       }
       throw new AssertionError("Listener is already in use");
    }
    public final void b(){
       if (this.b == null) {
          throw new AssertionError("Event name not set");
       }
       if (this.c == null) {
          throw new AssertionError("Model not set");
       }
       if (this.t != null) {
          return;
       }
       throw new AssertionError("View not set");
    }
    public final void c(String p0){
       this.a();
       this.b = p0;
    }
    public final void d(){
       this.a();
       this.b();
       this.v = true;
       this.t.setFocusable(true);
       this.t.setClickable(true);
       this.t.setOnClickListener(this);
    }
    public final void e(){
       this.a();
       this.b();
       this.v = true;
       this.t.setLongClickable(true);
       this.t.setOnLongClickListener(this);
    }
    public final void f(View p0){
       this.a();
       p0.getClass();
       this.t = p0;
    }
    public final void g(ju2 p0){
       this.a();
       p0.getClass();
       this.c = p0;
    }
    public final void onClick(View p0){
       this.a.a(new cu2(this.b, this.c, dt5.x));
    }
    public final boolean onLongClick(View p0){
       this.a.a(new cu2(this.b, this.c, dt5.x));
       return true;
    }
}
