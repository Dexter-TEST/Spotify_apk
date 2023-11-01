package p.gi;
import p.g57;
import android.widget.ToggleButton;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p.n37;
import p.if;
import p.wh;
import android.widget.TextView;
import p.rg;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;

public class gi extends ToggleButton implements g57	// class@001718 from classes.dex
{
    private final if a;
    private final wh b;
    private rg c;

    public void gi(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       n37.a(this.getContext(), this);
       if oif = new if(this);
       this.a = oif;
       oif.d(p1, p2);
       wh owh = new wh(this);
       this.b = owh;
       owh.m(p1, p2);
       this.getEmojiTextViewHelper().c(p1, p2);
    }
    private rg getEmojiTextViewHelper(){
       if (this.c == null) {
          this.c = new rg(this);
       }
       return this.c;
    }
    public final void drawableStateChanged(){
       gi ta;
       super.drawableStateChanged();
       if ((ta = this.a) != null) {
          ta.a();
       }
       if ((ta = this.b) != null) {
          ta.b();
       }
       return;
    }
    public ColorStateList getSupportBackgroundTintList(){
       gi ta;
       ColorStateList uColorStateL = ((ta = this.a) != null)? ta.b(): null;
       return uColorStateL;
    }
    public PorterDuff$Mode getSupportBackgroundTintMode(){
       gi ta;
       PorterDuff$Mode mode = ((ta = this.a) != null)? ta.c(): null;
       return mode;
    }
    public ColorStateList getSupportCompoundDrawablesTintList(){
       return this.b.j();
    }
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode(){
       return this.b.k();
    }
    public void setAllCaps(boolean p0){
       super.setAllCaps(p0);
       this.getEmojiTextViewHelper().d(p0);
    }
    public void setBackgroundDrawable(Drawable p0){
       gi ta;
       super.setBackgroundDrawable(p0);
       if ((ta = this.a) != null) {
          ta.e();
       }
       return;
    }
    public void setBackgroundResource(int p0){
       gi ta;
       super.setBackgroundResource(p0);
       if ((ta = this.a) != null) {
          ta.f(p0);
       }
       return;
    }
    public final void setCompoundDrawables(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       gi tb;
       super.setCompoundDrawables(p0, p1, p2, p3);
       if ((tb = this.b) != null) {
          tb.b();
       }
       return;
    }
    public final void setCompoundDrawablesRelative(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       gi tb;
       super.setCompoundDrawablesRelative(p0, p1, p2, p3);
       if ((tb = this.b) != null) {
          tb.b();
       }
       return;
    }
    public void setEmojiCompatEnabled(boolean p0){
       this.getEmojiTextViewHelper().e(p0);
    }
    public void setFilters(InputFilter[] p0){
       super.setFilters(this.getEmojiTextViewHelper().a(p0));
    }
    public void setSupportBackgroundTintList(ColorStateList p0){
       gi ta;
       if ((ta = this.a) != null) {
          ta.h(p0);
       }
       return;
    }
    public void setSupportBackgroundTintMode(PorterDuff$Mode p0){
       gi ta;
       if ((ta = this.a) != null) {
          ta.i(p0);
       }
       return;
    }
    public void setSupportCompoundDrawablesTintList(ColorStateList p0){
       this.b.s(p0);
       this.b.b();
    }
    public void setSupportCompoundDrawablesTintMode(PorterDuff$Mode p0){
       this.b.t(p0);
       this.b.b();
    }
}
