package p.jm0;
import p.ek3;
import p.kh3;
import android.app.Activity;
import p.fk3;
import android.view.KeyEvent;
import android.view.Window;
import android.view.View;
import p.mi;
import android.view.Window$Callback;
import android.os.Bundle;
import p.uu5;
import p.gg1;
import p.uj3;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;

public abstract class jm0 extends Activity implements ek3, kh3	// class@001b01 from classes.dex
{
    public final fk3 a;

    public void jm0(){
       super();
       this.a = new fk3(this);
    }
    public boolean dispatchKeyEvent(KeyEvent p0){
       View decorView;
       if ((decorView = this.getWindow().getDecorView()) != null && mi.l(decorView, p0)) {
          return true;
       }
       return mi.m(this, decorView, this, p0);
    }
    public final boolean dispatchKeyShortcutEvent(KeyEvent p0){
       View decorView;
       if ((decorView = this.getWindow().getDecorView()) != null && mi.l(decorView, p0)) {
          return true;
       }
       return super.dispatchKeyShortcutEvent(p0);
    }
    public final boolean e(KeyEvent p0){
       return super.dispatchKeyEvent(p0);
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       gg1.I(this);
    }
    public void onSaveInstanceState(Bundle p0){
       jm0 ta = this.a;
       ta.getClass();
       ta.e("markState");
       ta.h(uj3.c);
       super.onSaveInstanceState(p0);
    }
}
