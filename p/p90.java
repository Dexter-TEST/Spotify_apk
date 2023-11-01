package p.p90;
import android.graphics.drawable.Drawable;
import android.content.Context;
import java.util.Calendar;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import java.lang.Object;
import android.widget.TextView;
import android.widget.ImageView;
import p.zg0;
import java.lang.String;
import p.co5;
import android.graphics.Canvas;
import android.view.View$MeasureSpec;
import android.graphics.ColorFilter;

public final class p90 extends Drawable	// class@002215 from classes.dex
{
    public final View a;
    public final TextView b;
    public final TextView c;

    public void p90(Context p0,Calendar p1){
       super();
       View view = LayoutInflater.from(p0).inflate(R.layout.calendar_view, null);
       this.a = view;
       View view1 = view.findViewById(R.id.month);
       view1.getClass();
       this.b = view1;
       view = view.findViewById(R.id.day);
       view.getClass();
       this.c = view;
    }
    public static final p90 a(ImageView p0,zg0 p1){
       co5.o(p0, "imageView");
       co5.o(p1, "clock");
       Drawable drawable = p0.getDrawable();
       if (drawable instanceof p90) {
       }else {
          Calendar instance = Calendar.getInstance();
          co5.l(instance, "clock.calendar");
          drawable = new p90(p0.getContext(), instance);
          p0.setImageDrawable(drawable);
       }
       return drawable;
    }
    public final void draw(Canvas p0){
       co5.o(p0, "canvas");
       this.a.draw(p0);
    }
    public final int getOpacity(){
       int i = (this.a.isOpaque())? -1: 0;
       return i;
    }
    public final void setAlpha(int p0){
       this.a.setAlpha((float)p0);
    }
    public final void setBounds(int p0,int p1,int p2,int p3){
       super.setBounds(p0, p1, p2, p3);
       p90 ta = this.a;
       ta.measure(View$MeasureSpec.makeMeasureSpec((p2 - p0), 0x40000000), View$MeasureSpec.makeMeasureSpec((p3 - p1), 0x40000000));
       ta.layout(p0, p1, p2, p3);
    }
    public final void setColorFilter(ColorFilter p0){
       p90 ta = this.a;
       if (ta instanceof ImageView) {
          ta.setColorFilter(p0);
       }
       return;
    }
}
