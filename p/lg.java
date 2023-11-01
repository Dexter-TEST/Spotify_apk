package p.lg;
import p.kf;
import p.um0;
import android.content.Context;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import p.kg;
import p.rf;
import p.jg;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.app.Dialog;
import android.view.Window;
import java.lang.Object;
import android.view.KeyEvent;
import p.kh3;
import android.view.Window$Callback;
import p.mi;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.LayoutInflater$Factory;
import android.view.LayoutInflater$Factory2;
import p.do5;
import java.lang.String;
import java.lang.CharSequence;

public class lg extends um0 implements kf	// class@001d4f from classes.dex
{
    public jg t;
    public final kg v;

    public void lg(Context p0,int p1){
       TypedValue typedValue;
       TypedValue typedValue1;
       if (!p1) {
          typedValue = new TypedValue();
          p0.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
          typedValue = typedValue.resourceId;
       }else {
          int i = p1;
       }
       super(p0, typedValue);
       this.v = new kg(this);
       rf orf = this.d();
       if (!p1) {
          typedValue1 = new TypedValue();
          p0.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue1, true);
          typedValue1 = typedValue1.resourceId;
       }
       p0.l0 = typedValue1;
       orf.d();
       return;
    }
    public final void addContentView(View p0,ViewGroup$LayoutParams p1){
       this.d().a(p0, p1);
    }
    public final rf d(){
       if (this.t == null) {
          this.t = new jg(this.getContext(), this.getWindow(), this, this);
       }
       return this.t;
    }
    public final void dismiss(){
       super.dismiss();
       this.d().e();
    }
    public final boolean dispatchKeyEvent(KeyEvent p0){
       return mi.m(this.v, this.getWindow().getDecorView(), this, p0);
    }
    final boolean e(KeyEvent p0){
       return super.dispatchKeyEvent(p0);
    }
    public final void f(){
    }
    public final View findViewById(int p0){
       jg ojg = this.d();
       ojg.w();
       return ojg.C.findViewById(p0);
    }
    public final void invalidateOptionsMenu(){
       this.d().b();
    }
    public void onCreate(Bundle p0){
       jg ojg = this.d();
       LayoutInflater layoutInflat = LayoutInflater.from(ojg.B);
       if (layoutInflat.getFactory() == null) {
          layoutInflat.setFactory2(ojg);
       }else {
          v0 = layoutInflat.getFactory2() instanceof jg;
       }
       super.onCreate(p0);
       this.d().d();
       return;
    }
    public final void onStop(){
       super.onStop();
       jg ojg = this.d();
       ojg.C();
       if ((ojg = ojg.F) != null) {
          ojg.q0(false);
       }
       return;
    }
    public final void p(){
    }
    public void setContentView(int p0){
       this.d().h(p0);
    }
    public void setContentView(View p0){
       this.d().i(p0);
    }
    public void setContentView(View p0,ViewGroup$LayoutParams p1){
       this.d().j(p0, p1);
    }
    public final void setTitle(int p0){
       super.setTitle(p0);
       this.d().m(this.getContext().getString(p0));
    }
    public void setTitle(CharSequence p0){
       super.setTitle(p0);
       this.d().m(p0);
    }
    public final void t(){
    }
}
