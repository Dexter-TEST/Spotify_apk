package com.spotify.legacyglue.widgetstate.StateListAnimatorButton;
import p.jf;
import android.content.Context;
import android.util.AttributeSet;
import p.u44;
import android.graphics.Canvas;
import android.widget.Button;
import p.kq0;
import p.nr6;
import android.widget.TextView;
import android.view.View;
import p.mj5;
import p.oj5;
import p.ry7;
import android.content.res.TypedArray;
import p.t14;
import p.xe7;
import p.z00;
import android.graphics.drawable.Drawable;

public class StateListAnimatorButton extends jf	// class@000907 from classes.dex
{
    public nr6 t;
    public kq0 v;

    public void StateListAnimatorButton(Context p0,AttributeSet p1){
       super(p0, p1);
       this.t = new u44(this);
       this.j(p1, 0);
    }
    public void StateListAnimatorButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.t = new u44(this);
       this.j(p1, p2);
    }
    public static void a(StateListAnimatorButton p0,Canvas p1){
       super.onDraw(p1);
    }
    public static float b(StateListAnimatorButton p0){
       return super.getScaleX();
    }
    public static float c(StateListAnimatorButton p0){
       return super.getScaleY();
    }
    public static void f(StateListAnimatorButton p0,float p1){
       super.setScaleX(p1);
    }
    public static void g(StateListAnimatorButton p0,float p1){
       super.setScaleY(p1);
    }
    public static void i(StateListAnimatorButton p0,Canvas p1){
       super.onDraw(p1);
    }
    public final void drawableStateChanged(){
       StateListAnimatorButton tv;
       super.drawableStateChanged();
       if ((tv = this.v) != null) {
          tv.b();
       }
       return;
    }
    public float getScaleX(){
       StateListAnimatorButton tt;
       if ((tt = this.t) != null) {
          return tt.a();
       }
       return super.getScaleX();
    }
    public float getScaleY(){
       StateListAnimatorButton tt;
       if ((tt = this.t) != null) {
          return tt.n();
       }
       return super.getScaleY();
    }
    public final void j(AttributeSet p0,int p1){
       boolean booleanx;
       boolean b = false;
       this.setIncludeFontPadding(b);
       oj5.a(this).a();
       ry7.b(this, p0, p1);
       if (p0 != null) {
          int[] ointArray = new int[]{0x7f0302a7};
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, ointArray);
          booleanx = typedArray.getBoolean(b, b);
          typedArray.recycle();
       }else {
          booleanx = false;
       }
       t14 ot14 = (booleanx)? new t14(this, b): new u44(this);
       this.t = ot14;
       kq0 okq0 = new kq0(this);
       this.v = okq0;
       TypedArray typedArray1 = this.getContext().obtainStyledAttributes(p0, xe7.A, p1, b);
       okq0.b = typedArray1.getColor(2, 0xff000000);
       okq0.a = typedArray1.getColor(3, -1);
       p1 = 4;
       if (typedArray1.hasValue(p1)) {
          okq0.e.a = typedArray1.getColor(p1, -65281);
       }
       if (typedArray1.hasValue(1)) {
          p1.a = typedArray1.getColor(1, -65281);
       }
       okq0.e();
       typedArray1.recycle();
       return;
    }
    public final void onDraw(Canvas p0){
       this.t.g(p0);
    }
    public void setBackgroundDrawable(Drawable p0){
       StateListAnimatorButton tv;
       super.setBackgroundDrawable(p0);
       if ((tv = this.v) != null) {
          tv.e();
       }
       return;
    }
    public void setBackgroundResource(int p0){
       StateListAnimatorButton tv;
       super.setBackgroundResource(p0);
       if ((tv = this.v) != null) {
          tv.e();
       }
       return;
    }
    public void setScaleX(float p0){
       StateListAnimatorButton tt;
       if ((tt = this.t) != null) {
          tt.f(p0);
       }else {
          super.setScaleX(p0);
       }
       return;
    }
    public void setScaleY(float p0){
       StateListAnimatorButton tt;
       if ((tt = this.t) != null) {
          tt.h(p0);
       }else {
          super.setScaleY(p0);
       }
       return;
    }
    public void setTextAppearance(int p0){
       super.setTextAppearance(p0);
       ry7.a(this, p0);
    }
    public final void setTextAppearance(Context p0,int p1){
       super.setTextAppearance(p0, p1);
       ry7.a(this, p1);
    }
}
