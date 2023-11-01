package p.kk2;
import p.sj2;
import java.lang.Object;
import android.view.LayoutInflater;
import android.widget.ScrollView;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import android.content.res.Resources;
import p.xj0;
import p.do5;
import java.lang.CharSequence;
import p.hv5;
import android.text.TextPaint;
import android.graphics.Paint$FontMetrics;
import android.graphics.Paint;
import java.lang.Math;

public final class kk2 implements sj2	// class@001c2c from classes.dex
{
    public TextView a;
    public TextView b;
    public ImageView c;
    public hv5 t;
    public String v;
    public String w;
    public final boolean x;

    public void kk2(){
       super();
       this.x = false;
    }
    public final void d(LayoutInflater p0,ScrollView p1){
       TextView[] textViewArra;
       boolean b = true;
       View view = p0.inflate(R.layout.glue_dialog_content_image_title_body, p1, b);
       this.a = view.findViewById(R.id.title);
       this.b = view.findViewById(R.id.body);
       ImageView imageView = view.findViewById(R.id.image);
       this.c = imageView;
       if (this.x != null && imageView != null) {
          imageView.getLayoutParams().width = xj0.e0(168.00f, p1.getResources());
          this.c.getLayoutParams().height = xj0.e0(168.00f, p1.getResources());
       }
       if (!view.isInEditMode()) {
          if (this.c != null) {
             textViewArra = new TextView[b];
             textViewArra[0] = this.a;
             do5.z0(textViewArra);
             do5.y0(textViewArra);
          }else {
             textViewArra = new TextView[b];
             textViewArra[0] = this.a;
             do5.y0(textViewArra);
          }
          textViewArra = new TextView[b];
          textViewArra[0] = this.b;
          do5.z0(textViewArra);
          do5.x0(view);
       }
       this.a.setText(this.v);
       this.b.setText(this.w);
       return;
    }
    public final void f(){
       kk2 tc;
       kk2 tt;
       if ((tc = this.c) == null) {
          return;
       }
       if ((tt = this.t) != null) {
          tt.e(tc);
       }
       return;
    }
    public final int g(){
       return (int)Math.ceil((double)Math.abs(this.b.getPaint().getFontMetrics().descent));
    }
}
