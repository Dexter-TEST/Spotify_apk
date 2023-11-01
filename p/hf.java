package p.hf;
import p.g57;
import android.widget.AutoCompleteTextView;
import android.content.Context;
import android.util.AttributeSet;
import p.d57;
import android.view.View;
import p.n37;
import p.p86;
import android.graphics.drawable.Drawable;
import p.if;
import p.wh;
import android.widget.TextView;
import p.qg;
import android.widget.EditText;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.ActionMode$Callback;
import p.vv7;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import p.ej4;
import p.eb3;

public class hf extends AutoCompleteTextView implements g57	// class@001843 from classes.dex
{
    private final if a;
    private final wh b;
    private final qg c;
    public static final int[] t;

    static {
       int[] ointArray = new int[]{0x1010176};
       hf.t = ointArray;
    }
    public void hf(Context p0,AttributeSet p1,int p2){
       KeyListener keyListener1;
       d57.a(p0);
       super(p0, p1, p2);
       n37.a(this.getContext(), this);
       p86 op86 = p86.m(this.getContext(), p1, hf.t, p2);
       boolean i = 0;
       if (op86.l(i)) {
          this.setDropDownBackgroundDrawable(op86.e(i));
       }
       op86.o();
       if oif = new if(this);
       this.a = oif;
       oif.d(p1, p2);
       wh owh = new wh(this);
       this.b = owh;
       owh.m(p1, p2);
       owh.b();
       qg oqg = new qg(this);
       this.c = oqg;
       oqg.b(p1, p2);
       KeyListener keyListener = this.getKeyListener();
       if ((keyListener instanceof NumberKeyListener ^ 0x01)) {
          boolean b = super.isFocusable();
          i = super.isClickable();
          boolean b1 = super.isLongClickable();
          int inputType = super.getInputType();
          if ((keyListener1 = oqg.a(keyListener)) != keyListener) {
             super.setKeyListener(keyListener1);
             super.setRawInputType(inputType);
             super.setFocusable(b);
             super.setClickable(i);
             super.setLongClickable(b1);
          }
       }
       return;
    }
    public final void drawableStateChanged(){
       hf ta;
       super.drawableStateChanged();
       if ((ta = this.a) != null) {
          ta.a();
       }
       if ((ta = this.b) != null) {
          ta.b();
       }
       return;
    }
    public ActionMode$Callback getCustomSelectionActionModeCallback(){
       return vv7.W(super.getCustomSelectionActionModeCallback());
    }
    public ColorStateList getSupportBackgroundTintList(){
       hf ta;
       ColorStateList uColorStateL = ((ta = this.a) != null)? ta.b(): null;
       return uColorStateL;
    }
    public PorterDuff$Mode getSupportBackgroundTintMode(){
       hf ta;
       PorterDuff$Mode mode = ((ta = this.a) != null)? ta.c(): null;
       return mode;
    }
    public ColorStateList getSupportCompoundDrawablesTintList(){
       return this.b.j();
    }
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode(){
       return this.b.k();
    }
    public InputConnection onCreateInputConnection(EditorInfo p0){
       InputConnection inputConnect = super.onCreateInputConnection(p0);
       ej4.i0(this, p0, inputConnect);
       return this.c.c(inputConnect, p0);
    }
    public void setBackgroundDrawable(Drawable p0){
       hf ta;
       super.setBackgroundDrawable(p0);
       if ((ta = this.a) != null) {
          ta.e();
       }
       return;
    }
    public void setBackgroundResource(int p0){
       hf ta;
       super.setBackgroundResource(p0);
       if ((ta = this.a) != null) {
          ta.f(p0);
       }
       return;
    }
    public final void setCompoundDrawables(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       hf tb;
       super.setCompoundDrawables(p0, p1, p2, p3);
       if ((tb = this.b) != null) {
          tb.b();
       }
       return;
    }
    public final void setCompoundDrawablesRelative(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       hf tb;
       super.setCompoundDrawablesRelative(p0, p1, p2, p3);
       if ((tb = this.b) != null) {
          tb.b();
       }
       return;
    }
    public void setCustomSelectionActionModeCallback(ActionMode$Callback p0){
       super.setCustomSelectionActionModeCallback(vv7.Z(p0, this));
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
       hf ta;
       if ((ta = this.a) != null) {
          ta.h(p0);
       }
       return;
    }
    public void setSupportBackgroundTintMode(PorterDuff$Mode p0){
       hf ta;
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
       hf tb;
       super.setTextAppearance(p0, p1);
       if ((tb = this.b) != null) {
          tb.n(p0, p1);
       }
       return;
    }
}
