package p.p81;
import p.yl0;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.ry7;
import androidx.appcompat.widget.AppCompatCheckBox;
import android.widget.TextView;
import android.widget.LinearLayout;
import p.lq5;
import android.widget.LinearLayout$LayoutParams;
import android.content.res.Resources;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import java.lang.NullPointerException;

public final class p81 implements yl0	// class@00220d from classes.dex
{
    public final int a;
    public final Object b;
    public Object c;

    public void p81(Activity p0){
       View view1;
       View view2;
       this.a = 0;
       co5.o(p0, "context");
       super();
       this.b = p0;
       View view = LayoutInflater.from(p0).inflate(R.layout.titled_checkbox_row, null, 0);
       int i = 0x7f0a0100;
       if ((view1 = ry7.q(view, i)) != null) {
          i = 0x7f0a0623;
          if ((view2 = ry7.q(view, i)) != null) {
             View view3 = view;
             lq5 view4 = new lq5(view3, view1, view2, view3, 7);
             LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-1, -2);
             layoutParams.setMargins(p0.getResources().getDimensionPixelSize(R.dimen.titled_checkbox_row_margin), p0.getResources().getDimensionPixelSize(R.dimen.titled_checkbox_row_margin), p0.getResources().getDimensionPixelSize(R.dimen.titled_checkbox_row_margin), p0.getResources().getDimensionPixelSize(R.dimen.titled_checkbox_row_margin));
             view.b.setLayoutParams(layoutParams);
             this.c = view;
             return;
          }
       }
       throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
    public void p81(View p0){
       this.a = 1;
       co5.o(p0, "fragmentView");
       super();
       this.b = p0;
    }
    public final View getView(){
       switch (this.a){
           case 0:
           default:
             return this.b;
       }
       lq5 b = this.c.b;
       co5.l(b, "binding.root");
       return b;
    }
}
