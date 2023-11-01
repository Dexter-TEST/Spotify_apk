package p.ug;
import p.g57;
import android.widget.MultiAutoCompleteTextView;
import android.content.Context;
import android.util.AttributeSet;
import p.d57;
import android.view.View;
import p.n37;
import p.p86;
import android.graphics.drawable.Drawable;
import android.widget.AutoCompleteTextView;
import p.if;
import p.wh;
import android.widget.TextView;
import p.qg;
import android.widget.EditText;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import p.ej4;
import p.eb3;

public final class ug extends MultiAutoCompleteTextView implements g57	// class@0028aa from classes.dex
{
    private final if a;
    private final wh b;
    private final qg c;
    public static final int[] t;

    static {
       int[] ointArray = new int[]{0x1010176};
       ug.t = ointArray;
    }
    public void ug(Context p0,AttributeSet p1){
       KeyListener keyListener1;
       d57.a(p0);
       boolean i = 0x7f03005f;
       super(p0, p1, i);
       n37.a(this.getContext(), this);
       p86 op86 = p86.m(this.getContext(), p1, ug.t, i);
       boolean i1 = 0;
       if (op86.l(i1)) {
          this.setDropDownBackgroundDrawable(op86.e(i1));
       }
       op86.o();
       if oif = new if(this);
       this.a = oif;
       oif.d(p1, i);
       wh owh = new wh(this);
       this.b = owh;
       owh.m(p1, i);
       owh.b();
       qg oqg = new qg(this);
       this.c = oqg;
       oqg.b(p1, i);
       KeyListener keyListener = this.getKeyListener();
       if ((keyListener instanceof NumberKeyListener ^ 0x01)) {
          i = this.isFocusable();
          i1 = this.isClickable();
          boolean b = this.isLongClickable();
          int inputType = this.getInputType();
          if ((keyListener1 = oqg.a(keyListener)) != keyListener) {
             super.setKeyListener(keyListener1);
             this.setRawInputType(inputType);
             this.setFocusable(i);
             this.setClickable(i1);
             this.setLongClickable(b);
          }
       }
       return;
    }
    public final void drawableStateChanged(){
       ug ta;
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
       ug ta;
       ColorStateList uColorStateL = ((ta = this.a) != null)? ta.b(): null;
       return uColorStateL;
    }
    public PorterDuff$Mode getSupportBackgroundTintMode(){
       ug ta;
       PorterDuff$Mode mode = ((ta = this.a) != null)? ta.c(): null;
       return mode;
    }
    public ColorStateList getSupportCompoundDrawablesTintList(){
       return this.b.j();
    }
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode(){
       return this.b.k();
    }
    public final InputConnection onCreateInputConnection(EditorInfo p0){
       InputConnection inputConnect = super.onCreateInputConnection(p0);
       ej4.i0(this, p0, inputConnect);
       return this.c.c(inputConnect, p0);
    }
    public void setBackgroundDrawable(Drawable p0){
       ug ta;
       super.setBackgroundDrawable(p0);
       if ((ta = this.a) != null) {
          ta.e();
       }
       return;
    }
    public void setBackgroundResource(int p0){
       ug ta;
       super.setBackgroundResource(p0);
       if ((ta = this.a) != null) {
          ta.f(p0);
       }
       return;
    }
    public final void setCompoundDrawables(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       ug tb;
       super.setCompoundDrawables(p0, p1, p2, p3);
       if ((tb = this.b) != null) {
          tb.b();
       }
       return;
    }
    public final void setCompoundDrawablesRelative(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       ug tb;
       super.setCompoundDrawablesRelative(p0, p1, p2, p3);
       if ((tb = this.b) != null) {
          tb.b();
       }
       return;
    }
    public void setDropDownBackgroundResource(int p0){
       this.setDropDownBackgroundDrawable(eb3.m(this.getContext(), p0));
    }
    public void setEmojiCompatEnabled(boolean p0){
       this.c.d(p0);
    }
    public void setKeyListener(KeyListener p0){
       super.setKeyListener(this.c.a(p0));
    }
    public void setSupportBackgroundTintList(ColorStateList p0){
       ug ta;
       if ((ta = this.a) != null) {
          ta.h(p0);
       }
       return;
    }
    public void setSupportBackgroundTintMode(PorterDuff$Mode p0){
       ug ta;
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
    public final void setTextAppearance(Context p0,int p1){
       ug tb;
       super.setTextAppearance(p0, p1);
       if ((tb = this.b) != null) {
          tb.n(p0, p1);
       }
       return;
    }
}
