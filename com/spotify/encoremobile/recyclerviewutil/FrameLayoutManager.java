package com.spotify.encoremobile.recyclerviewutil.FrameLayoutManager;
import p.hr5;
import p.ir5;
import p.pr5;
import p.vr5;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup$MarginLayoutParams;

public class FrameLayoutManager extends hr5	// class@00089c from classes.dex
{

    public void FrameLayoutManager(){
       super();
    }
    public final ir5 D(){
       return new ir5(-1, -1);
    }
    public final void D0(int p0){
    }
    public final void q0(pr5 p0,vr5 p1){
       this.B(p0);
       int i = this.O();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          View view = p0.d(i1);
          ir5 layoutParams = view.getLayoutParams();
          Rect rect = this.b.N(view);
          int i2 = rect.left + rect.right;
          i2 = i2 + 0;
          int i3 = rect.top + rect.bottom;
          i3 = i3 + 0;
          int i4 = this.getPaddingRight() + this.getPaddingLeft();
          i4 = i4 + i2;
          int i5 = hr5.J(0, this.F, this.D, i4, layoutParams.width);
          i4 = this.getPaddingBottom() + this.getPaddingTop();
          i4 = i4 + i3;
          i2 = hr5.J(0, this.G, this.E, i4, layoutParams.height);
          if (this.K0(view, i5, i2, layoutParams)) {
             view.measure(i5, i2);
          }
          this.l(view);
          layoutParams = view.getLayoutParams();
          hr5 tG = this.G;
          hr5 tF = this.F;
          i3 = this.getPaddingTop();
          int paddingLeft = this.getPaddingLeft();
          int paddingRight = this.getPaddingRight();
          i4 = this.getPaddingBottom();
          int i6 = tG - i3;
          i6 = i6 - i4;
          i6 = i6 - hr5.M(view);
          i6 = i6 / 2;
          int i7 = tF - paddingLeft;
          i7 = i7 - paddingRight;
          i7 = i7 - hr5.N(view);
          i7 = i7 / 2;
          paddingLeft = paddingLeft + i7;
          paddingLeft = paddingLeft + layoutParams.leftMargin;
          i3 = i3 + i6;
          i3 = i3 + layoutParams.topMargin;
          i2 = tF - paddingRight;
          i2 = i2 - layoutParams.rightMargin;
          i2 = i2 - i7;
          i5 = tG - i4;
          i5 = i5 - layoutParams.bottomMargin;
          i5 = i5 - i6;
          layoutParams = view.getLayoutParams().b;
          paddingLeft = paddingLeft + layoutParams.left;
          i3 = i3 + layoutParams.top;
          i2 = i2 - layoutParams.right;
          i5 = i5 - layoutParams.bottom;
          view.layout(paddingLeft, i3, i2, i5);
       }
       return;
    }
}
