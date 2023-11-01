package p.mh;
import android.widget.Spinner;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.view.View;
import p.n37;
import p.ej4;
import android.content.res.TypedArray;
import p.if;
import p.mt0;
import p.jh;
import p.p86;
import android.graphics.drawable.Drawable;
import p.wl3;
import java.lang.String;
import p.u5;
import java.lang.Object;
import p.gh;
import java.lang.CharSequence;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.view.View$MeasureSpec;
import android.widget.AdapterView;
import java.lang.Math;
import android.widget.Adapter;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import p.lh;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.widget.AbsSpinner;
import android.os.Parcelable;
import p.kh;
import android.view.AbsSavedState;
import android.view.ViewTreeObserver;
import p.lc0;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.MotionEvent;
import p.uc2;
import p.dh;
import p.hh;
import android.content.res.Resources$Theme;
import android.widget.ListAdapter;
import p.eb3;

public final class mh extends Spinner	// class@001e9b from classes.dex
{
    private final if a;
    public final Context b;
    public final u5 c;
    public SpinnerAdapter t;
    public final boolean v;
    public final lh w;
    public int x;
    public final Rect y;
    public static final int[] z;

    static {
       int[] ointArray = new int[]{0x10102f1};
       mh.z = ointArray;
    }
    public void mh(Context p0,AttributeSet p1){
       int resourceId;
       TypedArray typedArray1;
       CharSequence[] textArray;
       mh tt;
       super(p0, p1, 0x7f0305a7);
       this.y = new Rect();
       n37.a(this.getContext(), this);
       int[] y = ej4.Y;
       int i = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, y, R.attr.spinnerStyle, i);
       this.a = new if(this);
       this.b = (resourceId = typedArray.getResourceId(4, i))? new mt0(p0, resourceId): p0;
       resourceId = -1;
       SpinnerAdapter spinnerAdapt = null;
       try{
          typedArray1 = p0.obtainStyledAttributes(p1, mh.z, R.attr.spinnerStyle, i);
          try{
             if (typedArray1.hasValue(i)) {
                resourceId = typedArray1.getInt(i, i);
             }
             typedArray1.recycle();
          label_0059 :
             int i1 = 2;
             if (resourceId) {
                if (resourceId == 1) {
                   jh ojh = new jh(this, this.b, p1);
                   p86 op86 = p86.m(this.b, p1, y, e0);
                   this.x = op86.b.getLayoutDimension(3, -2);
                   ojh.g(op86.e(true));
                   ojh.T = typedArray.getString(i1);
                   op86.o();
                   this.w = ojh;
                   this.c = new u5(this, this, ojh, true);
                }
             }else {
                gh ogh = new gh(this);
                this.w = ogh;
                ogh.c = typedArray.getString(i1);
             }
             if ((textArray = typedArray.getTextArray(i)) != null) {
                ArrayAdapter uArrayAdapte = new ArrayAdapter(p0, 0x1090008, textArray);
                uArrayAdapte.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                this.setAdapter(uArrayAdapte);
             }
             typedArray.recycle();
             this.v = true;
             if ((tt = this.t) != null) {
                this.setAdapter(tt);
                this.t = spinnerAdapt;
             }
             this.a.d(p1, e0);
             return;
          }catch(java.lang.Exception e0){
          }
          if (typedArray1) {
          }else {
             goto label_0059 ;
          }
       }catch(java.lang.Exception e0){
          typedArray1 = spinnerAdapt;
       }
    }
    public final int a(SpinnerAdapter p0,Drawable p1){
       int itemViewType;
       int i = 0;
       if (p0 == null) {
          return i;
       }
       int i1 = View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), i);
       int i2 = View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), i);
       int i3 = Math.max(i, this.getSelectedItemPosition());
       int i4 = Math.min(p0.getCount(), (i3 + 15));
       View view = null;
       i3 = 0;
       for (int i5 = Math.max(i, (i3 - ((i4 - i3) - 15))); i5 < i4; i5 = i5 + 1) {
          if ((itemViewType = p0.getItemViewType(i5)) != i) {
             view = null;
             i = itemViewType;
          }
          view = p0.getView(i5, view, this);
          if (view.getLayoutParams() == null) {
             view.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
          }
          view.measure(i1, i2);
          i3 = Math.max(i3, view.getMeasuredWidth());
       }
       if (p1 != null) {
          mh ty = this.y;
          p1.getPadding(ty);
          i3 = i3 + (ty.left + ty.right);
       }
       return i3;
    }
    public final void drawableStateChanged(){
       mh ta;
       super.drawableStateChanged();
       if ((ta = this.a) != null) {
          ta.a();
       }
       return;
    }
    public int getDropDownHorizontalOffset(){
       mh tw;
       if ((tw = this.w) != null) {
          return tw.b();
       }
       return super.getDropDownHorizontalOffset();
    }
    public int getDropDownVerticalOffset(){
       mh tw;
       if ((tw = this.w) != null) {
          return tw.l();
       }
       return super.getDropDownVerticalOffset();
    }
    public int getDropDownWidth(){
       if (this.w != null) {
          return this.x;
       }
       return super.getDropDownWidth();
    }
    public final lh getInternalPopup(){
       return this.w;
    }
    public Drawable getPopupBackground(){
       mh tw;
       if ((tw = this.w) != null) {
          return tw.d();
       }
       return super.getPopupBackground();
    }
    public Context getPopupContext(){
       return this.b;
    }
    public CharSequence getPrompt(){
       mh tw;
       CharSequence uCharSequenc = ((tw = this.w) != null)? tw.m(): super.getPrompt();
       return uCharSequenc;
    }
    public ColorStateList getSupportBackgroundTintList(){
       mh ta;
       ColorStateList uColorStateL = ((ta = this.a) != null)? ta.b(): null;
       return uColorStateL;
    }
    public PorterDuff$Mode getSupportBackgroundTintMode(){
       mh ta;
       PorterDuff$Mode mode = ((ta = this.a) != null)? ta.c(): null;
       return mode;
    }
    public final void onDetachedFromWindow(){
       mh tw;
       super.onDetachedFromWindow();
       if ((tw = this.w) != null && tw.a()) {
          tw.dismiss();
       }
       return;
    }
    public final void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       if (this.w != null && View$MeasureSpec.getMode(p0) == Integer.MIN_VALUE) {
          this.setMeasuredDimension(Math.min(Math.max(this.getMeasuredWidth(), this.a(this.getAdapter(), this.getBackground())), View$MeasureSpec.getSize(p0)), this.getMeasuredHeight());
       }
       return;
    }
    public final void onRestoreInstanceState(Parcelable p0){
       ViewTreeObserver viewTreeObse;
       super.onRestoreInstanceState(p0.getSuperState());
       if (p0.a != null && (viewTreeObse = this.getViewTreeObserver()) != null) {
          viewTreeObse.addOnGlobalLayoutListener(new lc0(2, this));
       }
       return;
    }
    public final Parcelable onSaveInstanceState(){
       mh tw;
       kh okh = new kh(super.onSaveInstanceState());
       boolean b = ((tw = this.w) != null && tw.a())? true: false;
       okh.a = b;
       return okh;
    }
    public final boolean onTouchEvent(MotionEvent p0){
       mh tc;
       if ((tc = this.c) != null && tc.onTouch(this, p0)) {
          return true;
       }
       return super.onTouchEvent(p0);
    }
    public final boolean performClick(){
       mh tw;
       if ((tw = this.w) == null) {
          return super.performClick();
       }
       if (!tw.a()) {
          tw.k(dh.b(this), dh.a(this));
       }
       return true;
    }
    public void setAdapter(Adapter p0){
       this.setAdapter(p0);
    }
    public void setAdapter(SpinnerAdapter p0){
       mh tw;
       mh tb;
       if (this.v == null) {
          this.t = p0;
          return;
       }else {
          super.setAdapter(p0);
          if ((tw = this.w) != null) {
             if ((tb = this.b) == null) {
                tb = this.getContext();
             }
             tw.p(new hh(p0, tb.getTheme()));
          }
          return;
       }
    }
    public void setBackgroundDrawable(Drawable p0){
       mh ta;
       super.setBackgroundDrawable(p0);
       if ((ta = this.a) != null) {
          ta.e();
       }
       return;
    }
    public void setBackgroundResource(int p0){
       mh ta;
       super.setBackgroundResource(p0);
       if ((ta = this.a) != null) {
          ta.f(p0);
       }
       return;
    }
    public void setDropDownHorizontalOffset(int p0){
       mh tw;
       if ((tw = this.w) != null) {
          tw.i(p0);
          tw.j(p0);
       }else {
          super.setDropDownHorizontalOffset(p0);
       }
       return;
    }
    public void setDropDownVerticalOffset(int p0){
       mh tw;
       if ((tw = this.w) != null) {
          tw.h(p0);
       }else {
          super.setDropDownVerticalOffset(p0);
       }
       return;
    }
    public void setDropDownWidth(int p0){
       if (this.w != null) {
          this.x = p0;
       }else {
          super.setDropDownWidth(p0);
       }
       return;
    }
    public void setPopupBackgroundDrawable(Drawable p0){
       mh tw;
       if ((tw = this.w) != null) {
          tw.g(p0);
       }else {
          super.setPopupBackgroundDrawable(p0);
       }
       return;
    }
    public void setPopupBackgroundResource(int p0){
       this.setPopupBackgroundDrawable(eb3.m(this.getPopupContext(), p0));
    }
    public void setPrompt(CharSequence p0){
       mh tw;
       if ((tw = this.w) != null) {
          tw.f(p0);
       }else {
          super.setPrompt(p0);
       }
       return;
    }
    public void setSupportBackgroundTintList(ColorStateList p0){
       mh ta;
       if ((ta = this.a) != null) {
          ta.h(p0);
       }
       return;
    }
    public void setSupportBackgroundTintMode(PorterDuff$Mode p0){
       mh ta;
       if ((ta = this.a) != null) {
          ta.i(p0);
       }
       return;
    }
}
