package p.um0;
import p.ek3;
import p.p15;
import p.v26;
import android.app.Dialog;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.u26;
import p.ir2;
import androidx.activity.b;
import p.am0;
import java.lang.Runnable;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.Window;
import p.ry7;
import p.do5;
import p.ye7;
import p.vj3;
import p.fk3;
import p.t26;
import android.os.Bundle;
import android.os.Build$VERSION;
import android.window.OnBackInvokedDispatcher;
import java.lang.Class;
import p.kj3;

public class um0 extends Dialog implements ek3, p15, v26	// class@0028d7 from classes.dex
{
    public fk3 a;
    public final u26 b;
    public final b c;

    public void um0(Context p0,int p1){
       co5.o(p0, "context");
       super(p0, p1);
       this.b = ir2.p(this);
       this.c = new b(new am0(2, this));
    }
    public static void b(um0 p0){
       co5.o(p0, "this$0");
       super.onBackPressed();
    }
    public final b a(){
       return this.c;
    }
    public void addContentView(View p0,ViewGroup$LayoutParams p1){
       co5.o(p0, "view");
       this.c();
       super.addContentView(p0, p1);
    }
    public final void c(){
       Window window = this.getWindow();
       co5.i(window);
       View decorView = window.getDecorView();
       co5.l(decorView, "window!!.decorView");
       ry7.R(decorView, this);
       window = this.getWindow();
       co5.i(window);
       decorView = window.getDecorView();
       co5.l(decorView, "window!!.decorView");
       do5.o0(decorView, this);
       window = this.getWindow();
       co5.i(window);
       decorView = window.getDecorView();
       co5.l(decorView, "window!!.decorView");
       ye7.S(decorView, this);
    }
    public final vj3 getLifecycle(){
       um0 ta;
       if ((ta = this.a) == null) {
          ta = new fk3(this);
          this.a = ta;
       }
       return ta;
    }
    public final t26 getSavedStateRegistry(){
       return this.b.b;
    }
    public final void onBackPressed(){
       this.c.b();
    }
    public void onCreate(Bundle p0){
       um0 ta;
       super.onCreate(p0);
       if (Build$VERSION.SDK_INT >= 33) {
          OnBackInvokedDispatcher onBackInvoke = this.getOnBackInvokedDispatcher();
          co5.l(onBackInvoke, "onBackInvokedDispatcher");
          um0 tc = this.c;
          tc.getClass();
          tc.e = onBackInvoke;
          tc.c();
       }
       this.b.b(p0);
       if ((ta = this.a) == null) {
          ta = new fk3(this);
          this.a = ta;
       }
       ta.f(kj3.ON_CREATE);
       return;
    }
    public final Bundle onSaveInstanceState(){
       Bundle uBundle = super.onSaveInstanceState();
       co5.l(uBundle, "super.onSaveInstanceState\(\)");
       this.b.c(uBundle);
       return uBundle;
    }
    public void onStart(){
       um0 ta;
       super.onStart();
       if ((ta = this.a) == null) {
          ta = new fk3(this);
          this.a = ta;
       }
       ta.f(kj3.ON_RESUME);
       return;
    }
    public void onStop(){
       um0 ta;
       if ((ta = this.a) == null) {
          ta = new fk3(this);
          this.a = ta;
       }
       ta.f(kj3.ON_DESTROY);
       this.a = null;
       super.onStop();
       return;
    }
    public void setContentView(int p0){
       this.c();
       super.setContentView(p0);
    }
    public void setContentView(View p0){
       co5.o(p0, "view");
       this.c();
       super.setContentView(p0);
    }
    public void setContentView(View p0,ViewGroup$LayoutParams p1){
       co5.o(p0, "view");
       this.c();
       super.setContentView(p0, p1);
    }
}
