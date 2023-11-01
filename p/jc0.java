package p.jc0;
import p.p85;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import p.do5;
import p.mj5;
import p.oj5;
import java.util.Collection;
import java.lang.Object;
import java.util.Collections;
import android.text.TextPaint;
import android.graphics.Paint$FontMetricsInt;
import android.graphics.Paint;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;
import java.lang.Math;
import p.b17;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.lang.String;
import android.graphics.Canvas;
import p.ox7;
import p.fc0;
import p.ap5;
import p.u27;
import p.gc0;
import java.lang.Enum;
import java.lang.IllegalArgumentException;
import android.content.res.Resources;
import p.xj0;
import java.lang.Integer;
import p.uw5;
import p.n6;
import p.cc0;

public final class jc0 extends p85	// class@001aa8 from classes.dex
{
    public float A;
    public final ImageView v;
    public final TextView w;
    public final TextView x;
    public fc0 y;
    public boolean z;

    public void jc0(Context p0){
       super(p0, null, 0);
       this.z = false;
       this.A = 0x3f800000;
       this.setOrientation(1);
       LayoutInflater.from(this.getContext()).inflate(R.layout.glue_card, this);
       ImageView imageView = this.findViewById(0x1020006);
       this.v = imageView;
       TextView textView = this.findViewById(R.id.title);
       this.w = textView;
       TextView textView1 = this.findViewById(R.id.subtitle);
       this.x = textView1;
       this.setGravity(1);
       TextView[] textViewArra = new TextView[]{textView,textView1};
       do5.z0(textViewArra);
       do5.y0(textViewArra);
       do5.x0(this);
       this.setClickable(1);
       mj5 omj5 = oj5.b(this);
       View[] viewArray = new View[]{imageView};
       Collections.addAll(omj5.d, viewArray);
       View[] viewArray1 = new View[]{textView,textView1};
       Collections.addAll(omj5.c, viewArray1);
       omj5.a();
       if (this.isInEditMode()) {
       }else {
          textView1.setVisibility(8);
       }
       return;
    }
    public static int b(TextView p0,int p1){
       Paint$FontMetricsInt fontMetricsI = p0.getPaint().getFontMetricsInt();
       ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
       return (((((fontMetricsI.bottom - fontMetricsI.top) + fontMetricsI.leading) * p1) + layoutParams.topMargin) + layoutParams.bottomMargin);
    }
    public final void a(int p0){
       int i = View$MeasureSpec.makeMeasureSpec(0, 0);
       float f = (float)p0;
       f = Math.round((((this.A * 0x3f000000) + 0x3f000000) * f));
       this.w.measure(b17.s(f), i);
       this.x.measure(b17.s(f), i);
       this.v.measure(b17.s(Math.round((this.A * f))), i);
    }
    public final void c(){
       jc0 tw;
       jc0 tx;
       if (this.z == null && ((tw = this.w) != null && (tx = this.x) != null)) {
          super.setContentDescription(tw.getText()+"\n"+tx.getText());
       }
       return;
    }
    public final void dispatchDraw(Canvas p0){
       jc0 ty;
       super.dispatchDraw(p0);
       if ((ty = this.y) != null) {
          p0.save();
          float f = 2.00f;
          float f1 = 0x3f800000;
          jc0 tv = this.v;
          fc0 j = ty.j;
          fc0 k = ty.k;
          if (ox7.y(this)) {
             p0.translate((float)(Math.round((((f1 - this.A) * (float)this.getMeasuredWidth()) / f)) + k), (float)((tv.getMeasuredHeight() - j) - k));
          }else {
             p0.translate((float)(((p0.getWidth() - j) - k) - Math.round((((f1 - this.A) * (float)this.getMeasuredWidth()) / f))), (float)((tv.getMeasuredHeight() - j) - k));
          }
          ty.draw(p0);
          p0.restore();
       }
       return;
    }
    public final void drawableStateChanged(){
       super.drawableStateChanged();
       int[] drawableStat = this.getDrawableState();
       int len = drawableStat.length;
       int i1 = 0;
       for (int i = 0; i < len; i = i + 1) {
          int i2 = (drawableStat[i] == -16842910)? 1: 0;
          i1 = i1 | i2;
       }
       if (i1) {
          this.setAlpha(0.40f);
       }
       return;
    }
    public float getCardImageWidthRatio(){
       return this.A;
    }
    public ImageView getImageView(){
       return this.v;
    }
    public TextView getSubtitleView(){
       return this.x;
    }
    public TextView getTitleView(){
       return this.w;
    }
    public final void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       jc0 tv = this.v;
       int i = (this.getMeasuredWidth() / 2) - (tv.getMeasuredWidth() / 2);
       jc0 tw = this.w;
       p3 = (this.getMeasuredWidth() / 2) - (tw.getMeasuredWidth() / 2);
       int i1 = tw.getMeasuredWidth() + p3;
       int i2 = tv.getMeasuredHeight() + 0;
       tv.layout(i, 0, (tv.getMeasuredWidth() + i), i2);
       tv = 8;
       if (tw.getVisibility() != tv) {
          ViewGroup$MarginLayoutParams layoutParams = tw.getLayoutParams();
          i2 = i2 + layoutParams.topMargin;
          tw.layout(p3, i2, i1, (tw.getMeasuredHeight() + i2));
          i2 = (tw.getMeasuredHeight() + i2) + layoutParams.bottomMargin;
       }
       jc0 tx = this.x;
       if (tx.getVisibility() != tv) {
          i2 = i2 + tx.getLayoutParams().topMargin;
          tx.layout(p3, i2, i1, (tx.getMeasuredHeight() + i2));
       }
       return;
    }
    public final void onMeasure(int p0,int p1){
       int i1;
       jc0 tw;
       int size = View$MeasureSpec.getSize(p1);
       int size1 = View$MeasureSpec.getSize(p0);
       boolean b = false;
       int i = 1;
       if (b17.q(p0) && b17.q(p1)) {
          if (size1 < size) {
             b = true;
          }
          ap5.e(b);
          this.a(size1);
          this.setMeasuredDimension(size1, size);
          return;
       }else if(!View$MeasureSpec.getMode(p0)){
          i1 = 1;
       }else {
          tw = 0;
       }
       int i2 = (!View$MeasureSpec.getMode(p1))? 1: 0;
       if (i1 == i2) {
          super.onMeasure(p0, p1);
          return;
       }else {
          p0 = 8;
          jc0 tv = this.v;
          tw = this.w;
          jc0 tx = this.x;
          if (i2) {
             this.a(size1);
          }else {
             size1 = View$MeasureSpec.makeMeasureSpec(b, b);
             i2 = u27.b(tx);
             if (tw.getVisibility() == p0 && i2 == 2) {
                i2 = 1;
             }else {
                i = u27.b(tw);
             }
             size = Math.round(((float)((size - jc0.b(tw, i)) - jc0.b(tx, i2)) / this.A));
             float f = (float)size;
             i = View$MeasureSpec.makeMeasureSpec(Math.round((((this.A * 0x3f000000) + 0x3f000000) * f)), 0x40000000);
             tw.measure(i, size1);
             tx.measure(i, size1);
             tv.measure(View$MeasureSpec.makeMeasureSpec(Math.round((this.A * f)), 0x40000000), size1);
             size1 = size;
          }
          tv = tv.getMeasuredHeight();
          if (tw.getVisibility() != p0) {
             if (tw.getVisibility() == p0) {
                i1 = 0;
             }else {
                ViewGroup$MarginLayoutParams layoutParams1 = tw.getLayoutParams();
                i1 = (tw.getMeasuredHeight() + layoutParams1.topMargin) + layoutParams1.bottomMargin;
             }
             tv = tv + i1;
          }
          if (tx.getVisibility() != p0) {
             if (tx.getVisibility() != p0) {
                ViewGroup$MarginLayoutParams layoutParams = tx.getLayoutParams();
                b = (tx.getMeasuredHeight() + layoutParams.topMargin) + layoutParams.bottomMargin;
             }
             tv = tv + b;
          }
          this.setMeasuredDimension(size1, tv);
          return;
       }
    }
    public void setAccessoryDrawable(fc0 p0){
       this.y = p0;
       this.postInvalidate();
    }
    public void setAppearance(gc0 p0){
       int i = 0x7f0a0099;
       int i1 = 0x7f0a009a;
       jc0 tx = this.x;
       jc0 tw = this.w;
       switch (p0.ordinal()){
           case 0:
             tw.setVisibility(4);
             tx.setVisibility(4);
             break;
           case 1:
             tw.setVisibility(0);
             tx.setVisibility(4);
             break;
           case 2:
             uw5.t(this.getContext(), tx, R.attr.pasteTextAppearanceBodySmall);
             tw.setVisibility(0);
             tx.setTextColor(n6.b(this.getContext(), R.color.opacity_white_70));
             tx.setVisibility(0);
             break;
           case 3:
             uw5.t(this.getContext(), tx, R.attr.pasteTextAppearanceMetadata);
             tw.setVisibility(0);
             tx.setTextColor(n6.b(this.getContext(), R.color.opacity_white_70));
             tx.setVisibility(0);
             break;
           case 4:
             uw5.t(this.getContext(), tw, R.attr.pasteTextAppearanceBodyMedium);
             tw.setVisibility(0);
             tw.setTextColor(n6.b(this.getContext(), R.color.opacity_white_70));
             tx.setVisibility(8);
             this.A = 0x3f28f5c3;
             this.setTextLayout(cc0.b);
             tw.setTag(i1, Integer.valueOf(xj0.e0(24.00f, this.getResources())));
             tw.setTag(i, Integer.valueOf(xj0.e0(8.00f, this.getResources())));
             break;
           case 5:
             tw.setVisibility(8);
             tx.setVisibility(8);
             this.A = 0x3f28f5c3;
             break;
           case 6:
             uw5.t(this.getContext(), tw, R.attr.pasteTextAppearanceBodySmall);
             tw.setVisibility(0);
             tw.setTextColor(n6.b(this.getContext(), R.color.opacity_white_70));
             tx.setVisibility(8);
             this.setTextLayout(cc0.b);
             tw.setTag(i1, Integer.valueOf(xj0.e0(24.00f, this.getResources())));
             tw.setTag(i, Integer.valueOf(xj0.e0(8.00f, this.getResources())));
             break;
           case 7:
             tw.setVisibility(8);
             tx.setTag(i1, Integer.valueOf(xj0.e0(20.00f, this.getResources())));
             uw5.t(this.getContext(), tx, R.attr.pasteTextAppearanceBodySmall);
             tx.setTextColor(n6.b(this.getContext(), R.color.opacity_white_70));
             tx.setMaxLines(2);
             tx.setVisibility(0);
             break;
           default:
             throw new IllegalArgumentException("Unsupported CardAppearance: "+p0);
       }
       do5.x0(this);
       return;
    }
    public void setCardImageWidthRatio(float p0){
       boolean b = ((0x3fe0000000000000 - (double)p0) >= 0 && (p0 - 0x3f800000) <= 0)? true: false;
       ap5.e(b);
       this.A = p0;
       return;
    }
    public void setContentDescription(CharSequence p0){
       super.setContentDescription(p0);
       boolean b = (p0 != null)? true: false;
       this.z = b;
       this.c();
       return;
    }
    public void setImageResource(int p0){
       this.v.setImageResource(p0);
    }
    public void setSubtitle(CharSequence p0){
       this.x.setText(p0);
       this.c();
    }
    public void setTextLayout(cc0 p0){
       int i = p0.ordinal();
       jc0 tx = this.x;
       jc0 tw = this.w;
       if (i) {
          if (i != 1) {
             if (i == 2) {
                tw.setMaxLines(1);
                tx.setMaxLines(2);
             }
          }else {
             tw.setMaxLines(2);
             tx.setMaxLines(1);
          }
       }else {
          tw.setMaxLines(1);
          tx.setMaxLines(1);
       }
       return;
    }
    public void setTitle(CharSequence p0){
       this.w.setText(p0);
       this.c();
    }
}
