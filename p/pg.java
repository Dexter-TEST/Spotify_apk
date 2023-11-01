package p.pg;
import p.l25;
import p.g57;
import android.widget.EditText;
import android.content.Context;
import android.util.AttributeSet;
import p.d57;
import android.view.View;
import p.n37;
import p.if;
import p.wh;
import android.widget.TextView;
import p.oh;
import p.h37;
import p.qg;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.textclassifier.TextClassifier;
import p.og;
import p.wr0;
import android.view.ActionMode$Callback;
import p.vv7;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.text.Editable;
import android.os.Build$VERSION;
import java.lang.CharSequence;
import p.nh;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.Class;
import java.lang.Object;
import p.ej4;
import java.lang.String;
import p.wh7;
import p.sg1;
import android.os.Bundle;
import android.os.BaseBundle;
import p.up0;
import p.t93;
import p.co5;
import p.u93;
import android.view.DragEvent;
import android.content.ContextWrapper;
import android.app.Activity;
import p.zg;
import android.content.ClipboardManager;
import android.content.ClipData;
import p.uv1;
import p.tr0;
import android.graphics.drawable.Drawable;

public class pg extends EditText implements l25, g57	// class@00225c from classes.dex
{
    private final if a;
    private final wh b;
    private final oh c;
    public final h37 t;
    private final qg v;
    public og w;

    public void pg(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f0301ef);
    }
    public void pg(Context p0,AttributeSet p1,int p2){
       KeyListener keyListener1;
       d57.a(p0);
       super(p0, p1, p2);
       n37.a(this.getContext(), this);
       if oif = new if(this);
       this.a = oif;
       oif.d(p1, p2);
       wh owh = new wh(this);
       this.b = owh;
       owh.m(p1, p2);
       owh.b();
       this.c = new oh(this);
       this.t = new h37();
       qg oqg = new qg(this);
       this.v = oqg;
       oqg.b(p1, p2);
       KeyListener keyListener = this.getKeyListener();
       if ((keyListener instanceof NumberKeyListener ^ 0x01)) {
          boolean b = super.isFocusable();
          boolean b1 = super.isClickable();
          boolean b2 = super.isLongClickable();
          int inputType = super.getInputType();
          if ((keyListener1 = oqg.a(keyListener)) != keyListener) {
             super.setKeyListener(keyListener1);
             super.setRawInputType(inputType);
             super.setFocusable(b);
             super.setClickable(b1);
             super.setLongClickable(b2);
          }
       }
       return;
    }
    public static void b(pg p0,TextClassifier p1){
       super.setTextClassifier(p1);
    }
    private og getSuperCaller(){
       if (this.w == null) {
          this.w = new og(this);
       }
       return this.w;
    }
    public final wr0 a(wr0 p0){
       return this.t.a(this, p0);
    }
    public final void drawableStateChanged(){
       pg ta;
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
       pg ta;
       ColorStateList uColorStateL = ((ta = this.a) != null)? ta.b(): null;
       return uColorStateL;
    }
    public PorterDuff$Mode getSupportBackgroundTintMode(){
       pg ta;
       PorterDuff$Mode mode = ((ta = this.a) != null)? ta.c(): null;
       return mode;
    }
    public ColorStateList getSupportCompoundDrawablesTintList(){
       return this.b.j();
    }
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode(){
       return this.b.k();
    }
    public Editable getText(){
       if (Build$VERSION.SDK_INT >= 28) {
          return super.getText();
       }
       return super.getEditableText();
    }
    public CharSequence getText(){
       return this.getText();
    }
    public TextClassifier getTextClassifier(){
       pg tc;
       oh b;
       if (Build$VERSION.SDK_INT >= 28 || (tc = this.c) == null) {
          return super.getTextClassifier();
       }
       if ((b = tc.b) == null) {
          b = nh.a(tc.a);
       }
       return b;
    }
    public InputConnection onCreateInputConnection(EditorInfo p0){
       int sDK_INT;
       String[] stringArray;
       t93 ot93;
       String[] stringArray1;
       EditorInfo extras;
       InputConnection inputConnect = super.onCreateInputConnection(p0);
       this.b.getClass();
       wh.o(this, inputConnect, p0);
       ej4.i0(this, p0, inputConnect);
       if (inputConnect != null && ((sDK_INT = Build$VERSION.SDK_INT) <= 30 && (stringArray = wh7.f(this)) != null)) {
          if (sDK_INT >= 25) {
             sg1.c(p0, stringArray);
          }else if(p0.extras == null){
             p0.extras = new Bundle();
          }
          p0.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", stringArray);
          p0.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", stringArray);
          up0 oup0 = new up0(0, this);
          if (sDK_INT >= 25) {
             ot93 = new t93(inputConnect, oup0);
          }else {
             String[] c = co5.c;
             if (sDK_INT >= 25) {
                if ((stringArray1 = sg1.e(p0)) != null) {
                label_0057 :
                   c = stringArray1;
                }
             }else if((extras = p0.extras) == null){
                if ((stringArray1 = extras.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES")) == null) {
                   stringArray1 = p0.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                }
                if (stringArray1 != null) {
                   goto label_0057 ;
                }
             }
             if (c.length) {
                ot93 = new u93(inputConnect, oup0);
             }
          }
          inputConnect = ot93;
       }
       return this.v.c(inputConnect, p0);
    }
    public final boolean onDragEvent(DragEvent p0){
       int sDK_INT = Build$VERSION.SDK_INT;
       int i = 0;
       if (sDK_INT < 31 && (sDK_INT >= 24 && (p0.getLocalState() == null && wh7.f(this) != null))) {
          Context context = this.getContext();
          while (true) {
             if (context instanceof ContextWrapper) {
                if (context instanceof Activity) {
                label_0030 :
                   if (context == null) {
                      this.toString();
                   }else if(p0.getAction() == 1 || p0.getAction() != 3){
                      i = zg.a(p0, this, context);
                   }
                }else {
                   context = context.getBaseContext();
                }
             }else {
                context = null;
                goto label_0030 ;
             }
          }
          return true;
       }
       if (i) {
       }else {
          return super.onDragEvent(p0);
       }
    }
    public final boolean onTextContextMenuItem(int p0){
       ClipboardManager systemServic;
       int i = 0;
       if (Build$VERSION.SDK_INT < 31 && wh7.f(this) != null) {
          int i1 = 0x1020022;
          if (p0 == i1 || p0 == 0x1020031) {
             ClipData uClipData = ((systemServic = this.getContext().getSystemService("clipboard")) == null)? null: systemServic.getPrimaryClip();
             if (uClipData != null && uClipData.getItemCount() > 0) {
                uv1 ouv1 = new uv1(uClipData, true);
                if (p0 != i1) {
                   i = 1;
                }
                ouv1.b.setFlags(i);
                wh7.j(this, ouv1.b.build());
             }
             i = 1;
          }
       }
       if (i) {
          return true;
       }else {
          return super.onTextContextMenuItem(p0);
       }
    }
    public void setBackgroundDrawable(Drawable p0){
       pg ta;
       super.setBackgroundDrawable(p0);
       if ((ta = this.a) != null) {
          ta.e();
       }
       return;
    }
    public void setBackgroundResource(int p0){
       pg ta;
       super.setBackgroundResource(p0);
       if ((ta = this.a) != null) {
          ta.f(p0);
       }
       return;
    }
    public final void setCompoundDrawables(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       pg tb;
       super.setCompoundDrawables(p0, p1, p2, p3);
       if ((tb = this.b) != null) {
          tb.b();
       }
       return;
    }
    public final void setCompoundDrawablesRelative(Drawable p0,Drawable p1,Drawable p2,Drawable p3){
       pg tb;
       super.setCompoundDrawablesRelative(p0, p1, p2, p3);
       if ((tb = this.b) != null) {
          tb.b();
       }
       return;
    }
    public void setCustomSelectionActionModeCallback(ActionMode$Callback p0){
       super.setCustomSelectionActionModeCallback(vv7.Z(p0, this));
    }
    public void setEmojiCompatEnabled(boolean p0){
       this.v.d(p0);
    }
    public void setKeyListener(KeyListener p0){
       super.setKeyListener(this.v.a(p0));
    }
    public void setSupportBackgroundTintList(ColorStateList p0){
       pg ta;
       if ((ta = this.a) != null) {
          ta.h(p0);
       }
       return;
    }
    public void setSupportBackgroundTintMode(PorterDuff$Mode p0){
       pg ta;
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
    public void setTextAppearance(Context p0,int p1){
       pg tb;
       super.setTextAppearance(p0, p1);
       if ((tb = this.b) != null) {
          tb.n(p0, p1);
       }
       return;
    }
    public void setTextClassifier(TextClassifier p0){
       pg tc;
       if (Build$VERSION.SDK_INT < 28 && (tc = this.c) != null) {
          tc.b = p0;
          return;
       }else {
          pg.b(this.getSuperCaller().a, p0);
          return;
       }
    }
}
