package p.xg;
import p.g57;
import android.widget.RadioButton;
import android.content.Context;
import android.util.AttributeSet;
import p.d57;
import android.view.View;
import p.n37;
import p.nf;
import android.widget.CompoundButton;
import p.if;
import p.wh;
import android.widget.TextView;
import p.rg;
import java.lang.Class;
import java.lang.Object;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import p.eb3;
import android.text.InputFilter;

public class xg extends RadioButton implements g57	// class@002c75 from classes.dex
{
    private final nf a;
    private final if b;
    private final wh c;
    private rg t;

    public void xg(Context p0,AttributeSet p1,int p2){
       d57.a(p0);
       super(p0, p1, p2);
       n37.a(this.getContext(), this);
       nf onf = new nf(this);
       this.a = onf;
       onf.b(p1, p2);
       if oif = new if(this);
       this.b = oif;
       oif.d(p1, p2);
       wh owh = new wh(this);
       this.c = owh;
       owh.m(p1, p2);
       this.getEmojiTextViewHelper().c(p1, p2);
    }
    private rg getEmojiTextViewHelper(){
       if (this.t == null) {
          this.t = new rg(this);
       }
       return this.t;
    }
    public final void drawableStateChanged(){
       xg tb;
       super.drawableStateChanged();
       if ((tb = this.b) != null) {
          tb.a();
       }
       if ((tb = this.c) != null) {
          tb.b();
       }
       return;
    }
    public int getCompoundPaddingLeft(){
       xg ta;
       int compoundPadd = super.getCompoundPaddingLeft();
       if ((ta = this.a) != null) {
          ta.getClass();
       }
       return compoundPadd;
    }
    public ColorStateList getSupportBackgroundTintList(){
       xg tb;
       ColorStateList uColorStateL = ((tb = this.b) != null)? tb.b(): null;
       return uColorStateL;
    }
    public PorterDuff$Mode getSupportBackgroundTintMode(){
       xg tb;
       PorterDuff$Mode mode = ((tb = this.b) != null)? tb.c(): null;
       return mode;
    }
    public ColorStateList getSupportButtonTintList(){
       xg ta;
       nf b = ((ta = this.a) != null)? ta.b: null;
       return b;
    }
    public PorterDuff$Mode getSupportButtonTintMode(){
       xg ta;
       nf c = ((ta = this.a) != null)? ta.c: null;
       return c;
    }
    public ColorStateList getSupportCompoundDrawablesTintList(){
       return this.c.j();
    }
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode(){
       return this.c.k();
    }
    public void setAllCaps(boolean p0){
       super.setAllCaps(p0);
       this.getEmojiTextViewHelper().d(p0);
    }
    public void setBackgroundDrawable(Drawable p0){
       xg tb;
       super.setBackgroundDrawable(p0);
       if ((tb = this.b) != null) {
          tb.e();
       }
       return;
    }
    public void setBackgroundResource(int p0){
       xg tb;
       super.setBackgroundResource(p0);
       if ((tb = this.b) != null) {
          tb.f(p0);
       }
       return;
    }
    public void setButtonDrawable(int p0){
       this.setButtonDrawable(eb3.m(this.getContext(), p0));
    }
    public void setButtonDrawable(Drawable p0){
       xg ta;
       super.setButtonDrawable(p0);
       if ((ta = this.a) != null) {
          if (ta.f != null) {
             ta.f = false;
          }else {
             ta.f = true;
             ta.a();
          }
       }
       return;
    }
    public final void setCompoundDrawables(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       xg tc;
       super.setCompoundDrawables(p0, p1, p2, p3);
       if ((tc = this.c) != null) {
          tc.b();
       }
       return;
    }
    public final void setCompoundDrawablesRelative(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       xg tc;
       super.setCompoundDrawablesRelative(p0, p1, p2, p3);
       if ((tc = this.c) != null) {
          tc.b();
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
       xg tb;
       if ((tb = this.b) != null) {
          tb.h(p0);
       }
       return;
    }
    public void setSupportBackgroundTintMode(PorterDuff$Mode p0){
       xg tb;
       if ((tb = this.b) != null) {
          tb.i(p0);
       }
       return;
    }
    public void setSupportButtonTintList(ColorStateList p0){
       xg ta;
       if ((ta = this.a) != null) {
          ta.b = p0;
          ta.d = true;
          ta.a();
       }
       return;
    }
    public void setSupportButtonTintMode(PorterDuff$Mode p0){
       xg ta;
       if ((ta = this.a) != null) {
          ta.c = p0;
          ta.e = true;
          ta.a();
       }
       return;
    }
    public void setSupportCompoundDrawablesTintList(ColorStateList p0){
       this.c.s(p0);
       this.c.b();
    }
    public void setSupportCompoundDrawablesTintMode(PorterDuff$Mode p0){
       this.c.t(p0);
       this.c.b();
    }
}
