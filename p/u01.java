package p.u01;
import p.xz5;
import androidx.recyclerview.widget.RecyclerView;
import p.a06;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import p.wh7;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.LinearLayout$LayoutParams;
import p.sz5;
import android.view.ViewGroup$LayoutParams;
import android.widget.PopupWindow;
import android.content.res.Resources;
import p.xj0;
import android.graphics.Rect;
import p.zk2;
import p.eo5;
import android.graphics.drawable.Drawable;
import android.widget.AbsSeekBar;
import android.view.View$MeasureSpec;
import p.qz5;
import java.lang.CharSequence;
import p.d6;
import p.lb0;

public final class u01 implements xz5	// class@002817 from classes.dex
{
    public final Rect A;
    public final ViewGroup a;
    public final SeekBar b;
    public final TextView c;
    public final TextView t;
    public final View v;
    public final TextView w;
    public final xz5 x;
    public final PopupWindow y;
    public final int z;

    public void u01(RecyclerView p0,a06 p1){
       super();
       LayoutInflater layoutInflat = LayoutInflater.from(p0.getContext());
       ViewGroup viewGroup = layoutInflat.inflate(R.layout.crossfade, p0, false);
       this.a = viewGroup;
       this.b = wh7.m(viewGroup, R.id.seek_bar);
       this.c = wh7.m(viewGroup, R.id.min_text);
       this.t = wh7.m(viewGroup, R.id.max_text);
       this.x = p1;
       viewGroup.addView(p1.a, false, new LinearLayout$LayoutParams(-1, -2));
       View view = layoutInflat.inflate(R.layout.crossfade_label, p0, false);
       this.v = view;
       this.w = wh7.m(view, R.id.label);
       PopupWindow popupWindow = new PopupWindow(view);
       this.y = popupWindow;
       popupWindow.setFocusable(false);
       popupWindow.setTouchable(false);
       popupWindow.setClippingEnabled(false);
       popupWindow.setWidth(-2);
       popupWindow.setHeight(-2);
       this.z = xj0.e0(8.00f, p0.getResources());
       this.A = new Rect();
       eo5.P(this);
    }
    public final void a(boolean p0){
       u01 tb = this.b;
       u01 tA = this.A;
       tb.getThumb().copyBounds(tA);
       u01 tv = this.v;
       tv.measure(View$MeasureSpec.makeMeasureSpec(0, 0), View$MeasureSpec.makeMeasureSpec(0, 0));
       int i = tA.right - (tv.getMeasuredWidth() / 2);
       int i1 = ((tA.top - tv.getMeasuredHeight()) - tA.height()) - this.z;
       u01 ty = this.y;
       if (p0) {
          ty.update(this.b, i, i1, -1, -1);
       }else {
          ty.showAsDropDown(tb, i, i1);
       }
       return;
    }
    public final void d(View p0){
       this.x.d(p0);
    }
    public final void e(CharSequence p0){
       this.x.e(p0);
    }
    public final TextView getSubtitleView(){
       return this.x.getSubtitleView();
    }
    public final View getView(){
       return this.a;
    }
    public final View h(){
       return this.x.h();
    }
    public final void setActive(boolean p0){
       this.x.setActive(p0);
    }
    public final void setAppearsDisabled(boolean p0){
       this.x.setAppearsDisabled(p0);
    }
    public final void setSubtitle(CharSequence p0){
       this.x.setSubtitle(p0);
    }
    public final void setTitle(CharSequence p0){
       this.x.setTitle(p0);
    }
}
