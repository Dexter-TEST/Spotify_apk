package p.lj2;
import android.app.Dialog;
import p.i70;
import android.content.Context;
import p.sj2;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import p.mw;
import android.widget.ScrollView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.Resources;
import java.lang.Class;
import java.lang.Object;
import android.os.Bundle;

public final class lj2 extends Dialog	// class@001d64 from classes.dex
{
    public boolean a;
    public final Button b;
    public final Button c;
    public i70 t;
    public final sj2 v;
    public static final i70 w;

    static {
       lj2.w = new i70();
    }
    public void lj2(Context p0,sj2 p1){
       super(p0, 0x7f1302d3);
       this.t = lj2.w;
       this.v = p1;
       View view = this.getLayoutInflater().inflate(R.layout.glue_dialog, null);
       Button uButton = view.findViewById(R.id.button_positive);
       this.b = uButton;
       Button uButton1 = view.findViewById(R.id.button_negative);
       this.c = uButton1;
       mw.b(uButton);
       mw.b(uButton1);
       ScrollView scrollView = view.findViewById(R.id.content);
       p1.d(this.getLayoutInflater(), scrollView);
       lj2.b(scrollView, (- p1.g()));
       this.setContentView(view);
    }
    public static void b(View p0,int p1){
       if (p0.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          p0.bottomMargin = p1;
       }
       return;
    }
    public final void a(boolean p0){
       int i = (p0)? 0: 8;
       this.c.setVisibility(i);
       lj2 tb = this.b;
       if (!p0) {
          lj2.b(tb, this.getContext().getResources().getDimensionPixelSize(R.dimen.single_positive_button_margin));
       }else {
          lj2.b(tb, this.getContext().getResources().getDimensionPixelSize(R.dimen.glue_dialog_button_spacing));
       }
       return;
    }
    public final void onAttachedToWindow(){
       super.onAttachedToWindow();
       if (this.a == null) {
          this.t.getClass();
       }
       return;
    }
    public final void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.t.getClass();
    }
    public final void onRestoreInstanceState(Bundle p0){
       this.a = true;
    }
    public final void show(){
       super.show();
       this.v.f();
    }
}
