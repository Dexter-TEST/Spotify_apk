package p.z14;
import p.hf;
import android.content.Context;
import android.util.AttributeSet;
import p.b17;
import android.graphics.Rect;
import android.view.View;
import p.lv1;
import android.content.res.TypedArray;
import p.ty0;
import android.text.method.KeyListener;
import java.lang.String;
import java.lang.Object;
import android.view.accessibility.AccessibilityManager;
import p.wl3;
import android.widget.PopupWindow;
import android.widget.ListAdapter;
import android.widget.AutoCompleteTextView;
import p.l86;
import java.lang.CharSequence;
import com.google.android.material.textfield.TextInputLayout;
import android.view.ViewParent;
import android.os.Build;
import java.util.Locale;
import android.widget.TextView;
import android.view.View$MeasureSpec;
import android.widget.AdapterView;
import java.lang.Math;
import android.widget.Adapter;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable;
import com.google.android.material.internal.CheckableImageButton;

public final class z14 extends hf	// class@002e6b from classes.dex
{
    public final wl3 v;
    public final AccessibilityManager w;
    public final Rect x;

    public void z14(Context p0,AttributeSet p1){
       int i = 0;
       super(b17.D(p0, p1, R.attr.autoCompleteTextViewStyle, i), p1, 0x7f03005f);
       this.x = new Rect();
       p0 = this.getContext();
       int[] ointArray = new int[i];
       TypedArray typedArray = ty0.q(p0, p1, lv1.s, R.attr.autoCompleteTextViewStyle, 0x7f1303e1, ointArray);
       KeyListener keyListener = null;
       if (typedArray.hasValue(i) && !typedArray.getInt(i, i)) {
          this.setKeyListener(keyListener);
       }
       this.w = p0.getSystemService("accessibility");
       wl3 owl3 = new wl3(p0, keyListener, 0x7f030398, i);
       this.v = owl3;
       owl3.O = true;
       wl3 p = owl3.P;
       p.setFocusable(true);
       owl3.F = this;
       p.setInputMethodMode(2);
       owl3.p(this.getAdapter());
       owl3.G = new l86(this, true);
       typedArray.recycle();
       return;
    }
    public static void a(z14 p0,Object p1){
       p0.setText(p0.convertSelectionToString(p1), false);
    }
    public final TextInputLayout b(){
       ViewParent parent = this.getParent();
       while (true) {
          if (parent == null) {
             return null;
          }
          if (parent instanceof TextInputLayout) {
             break ;
          }else {
             parent = parent.getParent();
          }
       }
       return parent;
    }
    public CharSequence getHint(){
       TextInputLayout textInputLay;
       if ((textInputLay = this.b()) != null && textInputLay.V != null) {
          return textInputLay.getHint();
       }
       return super.getHint();
    }
    public final void onAttachedToWindow(){
       TextInputLayout textInputLay;
       super.onAttachedToWindow();
       if ((textInputLay = this.b()) != null && (textInputLay.V != null && (super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")))) {
          this.setHint("");
       }
       return;
    }
    public final void onMeasure(int p0,int p1){
       int itemViewType;
       Drawable uDrawable;
       super.onMeasure(p0, p1);
       if (View$MeasureSpec.getMode(p0) == Integer.MIN_VALUE) {
          p1 = this.getMeasuredWidth();
          ListAdapter adapter = this.getAdapter();
          TextInputLayout textInputLay = this.b();
          int i = 0;
          if (adapter != null && textInputLay != null) {
             int i1 = View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), i);
             int i2 = View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), i);
             z14 tv = this.v;
             int i3 = (!tv.a())? -1: tv.c.getSelectedItemPosition();
             i3 = Math.min(adapter.getCount(), (Math.max(i, i3) + 15));
             View view = null;
             int i5 = 0;
             for (int i4 = Math.max(i, (i3 - 15)); i4 < i3; i4 = i4 + 1) {
                if ((itemViewType = adapter.getItemViewType(i4)) != i) {
                   view = null;
                   i = itemViewType;
                }
                view = adapter.getView(i4, view, textInputLay);
                if (view.getLayoutParams() == null) {
                   view.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
                }
                view.measure(i1, i2);
                i5 = Math.max(i5, view.getMeasuredWidth());
             }
             if ((uDrawable = tv.d()) != null) {
                z14 tx = this.x;
                uDrawable.getPadding(tx);
                i5 = i5 + (tx.left + tx.right);
             }
             i = textInputLay.getEndIconView().getMeasuredWidth() + i5;
          }
          this.setMeasuredDimension(Math.min(Math.max(p1, i), View$MeasureSpec.getSize(p0)), this.getMeasuredHeight());
       }
       return;
    }
    public void setAdapter(ListAdapter p0){
       super.setAdapter(p0);
       this.v.p(this.getAdapter());
    }
    public final void showDropDown(){
       z14 tw;
       if ((tw = this.w) != null && tw.isTouchExplorationEnabled()) {
          this.v.c();
       }else {
          super.showDropDown();
       }
       return;
    }
}
