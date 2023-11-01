package p.lf;
import p.g57;
import android.widget.CheckedTextView;
import android.content.Context;
import android.util.AttributeSet;
import p.d57;
import android.view.View;
import p.n37;
import p.wh;
import android.widget.TextView;
import p.if;
import p.mf;
import p.ej4;
import p.p86;
import android.content.res.TypedArray;
import p.wh7;
import android.graphics.drawable.Drawable;
import p.eb3;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import p.ne1;
import p.rg;
import android.view.ActionMode$Callback;
import p.vv7;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public final class lf extends CheckedTextView implements g57	// class@001d46 from classes.dex
{
    private final mf a;
    private final if b;
    private final wh c;
    private rg t;

    public void lf(Context p0,AttributeSet p1,int p2){
       int i1;
       d57.a(p0);
       super(p0, p1, p2);
       n37.a(this.getContext(), this);
       wh owh = new wh(this);
       this.c = owh;
       owh.m(p1, p2);
       owh.b();
       if oif = new if(this);
       this.b = oif;
       oif.d(p1, p2);
       this.a = new mf(this);
       int[] o = ej4.O;
       p86 op86 = p86.m(this.getContext(), p1, o, p2);
       wh7.n(this, this.getContext(), o, p1, op86.b, p2);
       int i = 1;
       if (op86.l(i) && (i1 = op86.i(i, 0))) {
          try{
             this.setCheckMarkDrawable(eb3.m(this.getContext(), i1));
          label_0060 :
             if (!i && (op86.l(0) && (i = op86.i(0, 0)))) {
                this.setCheckMarkDrawable(eb3.m(this.getContext(), i));
             }
             i = 2;
             if (op86.l(i)) {
                this.setCheckMarkTintList(op86.b(i));
             }
             i = 3;
             if (op86.l(i)) {
                this.setCheckMarkTintMode(ne1.c(op86.h(i, -1), null));
             }
             op86.o();
             this.getEmojiTextViewHelper().c(p1, p2);
             return;
          }catch(android.content.res.Resources$NotFoundException e0){
          }
       label_005f :
          i = 0;
          goto label_0060 ;
       }else {
          goto label_005f ;
       }
    }
    private rg getEmojiTextViewHelper(){
       if (this.t == null) {
          this.t = new rg(this);
       }
       return this.t;
    }
    public final void drawableStateChanged(){
       lf tc;
       super.drawableStateChanged();
       if ((tc = this.c) != null) {
          tc.b();
       }
       if ((tc = this.b) != null) {
          tc.a();
       }
       if ((tc = this.a) != null) {
          tc.a();
       }
       return;
    }
    public ActionMode$Callback getCustomSelectionActionModeCallback(){
       return vv7.W(super.getCustomSelectionActionModeCallback());
    }
    public ColorStateList getSupportBackgroundTintList(){
       lf tb;
       ColorStateList uColorStateL = ((tb = this.b) != null)? tb.b(): null;
       return uColorStateL;
    }
    public PorterDuff$Mode getSupportBackgroundTintMode(){
       lf tb;
       PorterDuff$Mode mode = ((tb = this.b) != null)? tb.c(): null;
       return mode;
    }
    public ColorStateList getSupportCheckMarkTintList(){
       lf ta;
       mf b = ((ta = this.a) != null)? ta.b: null;
       return b;
    }
    public PorterDuff$Mode getSupportCheckMarkTintMode(){
       lf ta;
       mf c = ((ta = this.a) != null)? ta.c: null;
       return c;
    }
    public ColorStateList getSupportCompoundDrawablesTintList(){
       return this.c.j();
    }
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode(){
       return this.c.k();
    }
    public final InputConnection onCreateInputConnection(EditorInfo p0){
       InputConnection inputConnect = super.onCreateInputConnection(p0);
       ej4.i0(this, p0, inputConnect);
       return inputConnect;
    }
    public void setAllCaps(boolean p0){
       super.setAllCaps(p0);
       this.getEmojiTextViewHelper().d(p0);
    }
    public void setBackgroundDrawable(Drawable p0){
       lf tb;
       super.setBackgroundDrawable(p0);
       if ((tb = this.b) != null) {
          tb.e();
       }
       return;
    }
    public void setBackgroundResource(int p0){
       lf tb;
       super.setBackgroundResource(p0);
       if ((tb = this.b) != null) {
          tb.f(p0);
       }
       return;
    }
    public void setCheckMarkDrawable(int p0){
       this.setCheckMarkDrawable(eb3.m(this.getContext(), p0));
    }
    public void setCheckMarkDrawable(Drawable p0){
       lf ta;
       super.setCheckMarkDrawable(p0);
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
       lf tc;
       super.setCompoundDrawables(p0, p1, p2, p3);
       if ((tc = this.c) != null) {
          tc.b();
       }
       return;
    }
    public final void setCompoundDrawablesRelative(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       lf tc;
       super.setCompoundDrawablesRelative(p0, p1, p2, p3);
       if ((tc = this.c) != null) {
          tc.b();
       }
       return;
    }
    public void setCustomSelectionActionModeCallback(ActionMode$Callback p0){
       super.setCustomSelectionActionModeCallback(vv7.Z(p0, this));
    }
    public void setEmojiCompatEnabled(boolean p0){
       this.getEmojiTextViewHelper().e(p0);
    }
    public void setSupportBackgroundTintList(ColorStateList p0){
       lf tb;
       if ((tb = this.b) != null) {
          tb.h(p0);
       }
       return;
    }
    public void setSupportBackgroundTintMode(PorterDuff$Mode p0){
       lf tb;
       if ((tb = this.b) != null) {
          tb.i(p0);
       }
       return;
    }
    public void setSupportCheckMarkTintList(ColorStateList p0){
       lf ta;
       if ((ta = this.a) != null) {
          ta.b = p0;
          ta.d = true;
          ta.a();
       }
       return;
    }
    public void setSupportCheckMarkTintMode(PorterDuff$Mode p0){
       lf ta;
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
    public final void setTextAppearance(Context p0,int p1){
       lf tc;
       super.setTextAppearance(p0, p1);
       if ((tc = this.c) != null) {
          tc.n(p0, p1);
       }
       return;
    }
}
