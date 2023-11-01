package p.jh;
import p.lh;
import p.wl3;
import p.mh;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.widget.PopupWindow;
import p.n8;
import java.lang.Object;
import java.lang.CharSequence;
import android.widget.AbsListView;
import android.view.View;
import p.dh;
import android.widget.AdapterView;
import p.ue1;
import android.view.ViewTreeObserver;
import p.lc0;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import p.ih;
import android.widget.PopupWindow$OnDismissListener;
import android.widget.ListAdapter;
import android.graphics.drawable.Drawable;
import p.bl7;
import android.widget.SpinnerAdapter;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.lang.Math;

public final class jh extends wl3 implements lh	// class@001adc from classes.dex
{
    public CharSequence T;
    public ListAdapter U;
    public final Rect V;
    public int W;
    public final mh X;

    public void jh(mh p0,Context p1,AttributeSet p2){
       this.X = p0;
       super(p1, p2, 0x7f0305a7, 0);
       this.V = new Rect();
       this.F = p0;
       this.O = true;
       this.P.setFocusable(true);
       this.G = new n8(this, true, p0);
    }
    public final void f(CharSequence p0){
       this.T = p0;
    }
    public final void i(int p0){
       this.W = p0;
    }
    public final void k(int p0,int p1){
       ViewTreeObserver viewTreeObse;
       boolean b = this.a();
       this.s();
       wl3 tP = this.P;
       tP.setInputMethodMode(2);
       this.c();
       wl3 tc = this.c;
       tc.setChoiceMode(1);
       dh.d(tc, p0);
       dh.c(tc, p1);
       jh tX = this.X;
       p1 = tX.getSelectedItemPosition();
       tc = this.c;
       if (this.a() && tc != null) {
          tc.setListSelectionHidden(false);
          tc.setSelection(p1);
          if (tc.getChoiceMode()) {
             tc.setItemChecked(p1, 1);
          }
       }
       if (b) {
          return;
       }else if((viewTreeObse = tX.getViewTreeObserver()) != null){
          lc0 olc0 = new lc0(3, this);
          viewTreeObse.addOnGlobalLayoutListener(olc0);
          tP.setOnDismissListener(new ih(this, olc0));
       }
       return;
    }
    public final CharSequence m(){
       return this.T;
    }
    public final void p(ListAdapter p0){
       super.p(p0);
       this.U = p0;
    }
    public final void s(){
       Rect right;
       int paddingLeft;
       mh x;
       Drawable uDrawable = this.d();
       jh tX = this.X;
       if (uDrawable != null) {
          uDrawable.getPadding(tX.y);
          right = (bl7.a(tX))? tX.y.right: - tX.y.left;
       }else {
          mh y1 = tX.y;
          paddingLeft = 0;
          y1.right = paddingLeft;
          y1.left = paddingLeft;
          right = 0;
       }
       paddingLeft = tX.getPaddingLeft();
       int paddingRight = tX.getPaddingRight();
       int width = tX.getWidth();
       if ((x = tX.x) == -2) {
          int i = tX.a(this.U, this.d());
          mh y = tX.y;
          int i1 = (tX.getContext().getResources().getDisplayMetrics().widthPixels - y.left) - y.right;
          if (i > i1) {
             i = i1;
          }
          this.r(Math.max(i, ((width - paddingLeft) - paddingRight)));
       }else if(x == -1){
          this.r(((width - paddingLeft) - paddingRight));
       }else {
          this.r(x);
       }
       width = (bl7.a(tX))? (((width - paddingRight) - this.v) - this.W) + right: (paddingLeft + this.W) + right;
       this.w = width;
       return;
    }
}
