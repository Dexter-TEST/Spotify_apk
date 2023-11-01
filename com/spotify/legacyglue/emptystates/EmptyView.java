package com.spotify.legacyglue.emptystates.EmptyView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import p.ze;
import android.content.res.Resources;
import p.xj0;
import p.uw5;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import p.tu6;
import android.content.res.ColorStateList;
import p.vv7;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import p.wh7;
import p.dh7;
import android.util.DisplayMetrics;
import java.lang.Float;
import java.lang.Math;
import java.lang.IllegalArgumentException;
import android.text.TextUtils;

public final class EmptyView extends LinearLayout	// class@0008e6 from classes.dex
{
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final ze t;
    public int v;
    public float w;
    public boolean x;

    public void EmptyView(Context p0,AttributeSet p1){
       ViewGroup$LayoutParams layoutParams;
       Drawable uDrawable;
       int i1;
       int i2;
       LinearLayout linearLayout = this;
       String obj = p0;
       AttributeSet uAttributeSe = p1;
       co5.o(obj, "context");
       super(p0, p1);
       linearLayout.setOrientation(1);
       linearLayout.setGravity(17);
       View.inflate(obj, R.layout.paste_empty, linearLayout);
       View view = linearLayout.findViewById(R.id.title);
       co5.l(view, "findViewById\(R.id.title\)");
       linearLayout.a = view;
       View view1 = linearLayout.findViewById(R.id.text);
       co5.l(view1, "findViewById\(R.id.text\)");
       linearLayout.b = view1;
       View view2 = linearLayout.findViewById(R.id.image);
       co5.l(view2, "findViewById\(R.id.image\)");
       linearLayout.c = view2;
       ViewGroup viewGroup = linearLayout.findViewById(R.id.accessory);
       linearLayout.t = new ze(viewGroup);
       linearLayout.v = xj0.e0(96.00f, this.getResources());
       TypedArray typedArray = obj.obtainStyledAttributes(uAttributeSe, uw5.c, R.attr.pasteDefaultsEmptyViewStyle, 0);
       co5.l(typedArray, "obtainStyledAttributes\(s…efStyleAttr, defStyleRes\)");
       linearLayout.setTitle(typedArray.getString(1));
       linearLayout.setText(typedArray.getString(2));
       linearLayout.setImageDrawable(typedArray.getDrawable(0));
       typedArray.recycle();
       typedArray = obj.obtainStyledAttributes(uAttributeSe, tu6.H, R.attr.pasteDefaultsEmptyViewStyle, 0);
       co5.l(typedArray, "obtainStyledAttributes\(s…efStyleAttr, defStyleRes\)");
       int resourceId = typedArray.getResourceId(6, 0);
       ColorStateList colorStateLi = typedArray.getColorStateList(7);
       int resourceId1 = typedArray.getResourceId(3, 0);
       ColorStateList colorStateLi1 = typedArray.getColorStateList(4);
       int dimensionPix = typedArray.getDimensionPixelOffset(1, 0);
       int dimensionPix1 = typedArray.getDimensionPixelOffset(5, 0);
       String str = "obtainStyledAttributes\(s…efStyleAttr, defStyleRes\)";
       int dimensionPix2 = typedArray.getDimensionPixelOffset(0, 0);
       linearLayout.v = typedArray.getDimensionPixelSize(2, linearLayout.v);
       if (resourceId) {
          vv7.Q(view, resourceId);
       }
       if (resourceId1) {
          vv7.Q(view1, resourceId1);
       }
       if (colorStateLi != null) {
          view.setTextColor(colorStateLi);
       }
       if (colorStateLi1 != null) {
          view1.setTextColor(colorStateLi1);
       }
       obj = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams";
       if (dimensionPix > 0) {
          layoutParams = view2.getLayoutParams();
          co5.j(layoutParams, obj);
          layoutParams.bottomMargin = dimensionPix;
       }
       if (dimensionPix1 > 0) {
          layoutParams = view1.getLayoutParams();
          co5.j(layoutParams, obj);
          layoutParams.topMargin = dimensionPix1;
       }
       if (dimensionPix2 > 0) {
          ViewGroup$LayoutParams layoutParams1 = viewGroup.getLayoutParams();
          co5.j(layoutParams1, obj);
          layoutParams1.topMargin = dimensionPix2;
       }
       typedArray.recycle();
       try{
          obj = 1;
          int[] ointArray = new int[obj];
          ointArray[0] = 0x1010054;
          Context uContext = p0;
          int i = 0x7f0304ac;
          try{
             TypedArray typedArray1 = uContext.obtainStyledAttributes(uAttributeSe, ointArray, i, 0);
             co5.l(typedArray1, str);
             uDrawable = typedArray1.getDrawable(0);
             try{
                typedArray1.recycle();
             }catch(android.content.res.Resources$NotFoundException e0){
             }
          }catch(android.content.res.Resources$NotFoundException e0){
             uDrawable = null;
             dh7.q(e0, uDrawable);
             DisplayMetrics displayMetri = p0.getResources().getDisplayMetrics();
             float f = 32.00f;
             if ((((float)displayMetri.widthPixels / displayMetri.density) - 0x43a00000) <= 0) {
                i1 = xj0.d0(f, this.getResources());
                i2 = xj0.d0(16.00f, this.getResources());
             }else {
                i1 = xj0.d0(48.00f, this.getResources());
                i2 = xj0.d0(f, this.getResources());
             }
             e0.setPadding(i1, i2, i1, i2);
             return;
          }
       }catch(android.content.res.Resources$NotFoundException e0){
          dimensionPix1 = p0;
       }
    }
    public final View getAccessoryView(){
       return this.t.c;
    }
    public final ImageView getImageView(){
       return this.c;
    }
    public final TextView getTextView(){
       return this.b;
    }
    public final TextView getTitleView(){
       return this.a;
    }
    public final void onMeasure(int p0,int p1){
       Drawable drawable;
       this.t.c();
       EmptyView tc = this.c;
       if ((drawable = tc.getDrawable()) != null) {
          EmptyView tw = (this.x != null)? this.w: (float)drawable.getIntrinsicWidth() / (float)drawable.getIntrinsicHeight();
          EmptyView tv = this.v;
          float f = (float)tv / tw;
          if (!Float.isNaN(f)) {
             tc.getLayoutParams().width = tv;
             tc.getLayoutParams().height = Math.round(f);
          }else {
             throw new IllegalArgumentException("Cannot round NaN value.");
          }
       }
       super.onMeasure(p0, p1);
       return;
    }
    public final void setAccessoryView(View p0){
       this.t.b(p0);
    }
    public final void setImageAspectRatio(float p0){
       this.w = p0;
       this.x = true;
    }
    public final void setImageDrawable(Drawable p0){
       EmptyView tc = this.c;
       if (p0 != null) {
          tc.setVisibility(0);
          tc.setImageDrawable(p0);
       }else {
          tc.setVisibility(8);
       }
       return;
    }
    public final void setImageResource(int p0){
       EmptyView tc = this.c;
       if (p0) {
          tc.setVisibility(0);
          tc.setImageResource(p0);
       }else {
          tc.setVisibility(8);
       }
       return;
    }
    public final void setImageWidth(int p0){
       this.v = p0;
    }
    public final void setText(int p0){
       this.setText(this.getContext().getString(p0));
    }
    public final void setText(CharSequence p0){
       int i = (TextUtils.isEmpty(p0))? 8: 0;
       EmptyView tb = this.b;
       tb.setVisibility(i);
       tb.setText(p0);
       return;
    }
    public final void setTitle(int p0){
       this.a.setText(p0);
    }
    public final void setTitle(CharSequence p0){
       this.a.setText(p0);
    }
}
