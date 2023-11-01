package p.jf;
import p.er;
import p.g57;
import android.widget.Button;
import android.content.Context;
import android.util.AttributeSet;
import p.d57;
import android.view.View;
import p.n37;
import p.if;
import p.wh;
import android.widget.TextView;
import p.rg;
import p.bl7;
import android.view.ActionMode$Callback;
import p.vv7;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.view.accessibility.AccessibilityEvent;
import java.lang.String;
import java.lang.Class;
import java.lang.CharSequence;
import android.view.accessibility.AccessibilityRecord;
import android.view.accessibility.AccessibilityNodeInfo;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;

public class jf extends Button implements er, g57	// class@001aca from classes.dex
{
    private final if a;
    private final wh b;
    private rg c;

    public void jf(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f0300df);
    }
    public void jf(Context p0,AttributeSet p1,int p2){
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
       this.getEmojiTextViewHelper().c(p1, p2);
    }
    private rg getEmojiTextViewHelper(){
       if (this.c == null) {
          this.c = new rg(this);
       }
       return this.c;
    }
    public void drawableStateChanged(){
       jf ta;
       super.drawableStateChanged();
       if ((ta = this.a) != null) {
          ta.a();
       }
       if ((ta = this.b) != null) {
          ta.b();
       }
       return;
    }
    public int getAutoSizeMaxTextSize(){
       jf tb;
       if (bl7.b) {
          return super.getAutoSizeMaxTextSize();
       }
       if ((tb = this.b) != null) {
          return tb.e();
       }
       return -1;
    }
    public int getAutoSizeMinTextSize(){
       jf tb;
       if (bl7.b) {
          return super.getAutoSizeMinTextSize();
       }
       if ((tb = this.b) != null) {
          return tb.f();
       }
       return -1;
    }
    public int getAutoSizeStepGranularity(){
       jf tb;
       if (bl7.b) {
          return super.getAutoSizeStepGranularity();
       }
       if ((tb = this.b) != null) {
          return tb.g();
       }
       return -1;
    }
    public int[] getAutoSizeTextAvailableSizes(){
       jf tb;
       if (bl7.b) {
          return super.getAutoSizeTextAvailableSizes();
       }
       if ((tb = this.b) != null) {
          return tb.h();
       }
       int[] ointArray = new int[0];
       return ointArray;
    }
    public int getAutoSizeTextType(){
       jf tb;
       int i = 0;
       if (bl7.b) {
          if (super.getAutoSizeTextType() == 1) {
             i = 1;
          }
          return i;
       }else if((tb = this.b) != null){
          return tb.i();
       }else {
          return i;
       }
    }
    public ActionMode$Callback getCustomSelectionActionModeCallback(){
       return vv7.W(super.getCustomSelectionActionModeCallback());
    }
    public ColorStateList getSupportBackgroundTintList(){
       jf ta;
       ColorStateList uColorStateL = ((ta = this.a) != null)? ta.b(): null;
       return uColorStateL;
    }
    public PorterDuff$Mode getSupportBackgroundTintMode(){
       jf ta;
       PorterDuff$Mode mode = ((ta = this.a) != null)? ta.c(): null;
       return mode;
    }
    public ColorStateList getSupportCompoundDrawablesTintList(){
       return this.b.j();
    }
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode(){
       return this.b.k();
    }
    public void onInitializeAccessibilityEvent(AccessibilityEvent p0){
       super.onInitializeAccessibilityEvent(p0);
       p0.setClassName(Button.class.getName());
    }
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo p0){
       super.onInitializeAccessibilityNodeInfo(p0);
       p0.setClassName(Button.class.getName());
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       jf tb;
       super.onLayout(p0, p1, p2, p3, p4);
       if ((tb = this.b) != null && !bl7.b) {
          tb.c();
       }
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       super.onTextChanged(p0, p1, p2, p3);
       jf tb = ((tb = this.b) != null && (!bl7.b && tb.l()))? 1: 0;
       if (tb) {
          this.b.c();
       }
       return;
    }
    public void setAllCaps(boolean p0){
       super.setAllCaps(p0);
       this.getEmojiTextViewHelper().d(p0);
    }
    public final void setAutoSizeTextTypeUniformWithConfiguration(int p0,int p1,int p2,int p3){
       jf tb;
       if (bl7.b) {
          super.setAutoSizeTextTypeUniformWithConfiguration(p0, p1, p2, p3);
       }else if((tb = this.b) != null){
          tb.p(p0, p1, p2, p3);
       }
       return;
    }
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] p0,int p1){
       jf tb;
       if (bl7.b) {
          super.setAutoSizeTextTypeUniformWithPresetSizes(p0, p1);
       }else if((tb = this.b) != null){
          tb.q(p0, p1);
       }
       return;
    }
    public void setAutoSizeTextTypeWithDefaults(int p0){
       jf tb;
       if (bl7.b) {
          super.setAutoSizeTextTypeWithDefaults(p0);
       }else if((tb = this.b) != null){
          tb.r(p0);
       }
       return;
    }
    public void setBackgroundDrawable(Drawable p0){
       jf ta;
       super.setBackgroundDrawable(p0);
       if ((ta = this.a) != null) {
          ta.e();
       }
       return;
    }
    public void setBackgroundResource(int p0){
       jf ta;
       super.setBackgroundResource(p0);
       if ((ta = this.a) != null) {
          ta.f(p0);
       }
       return;
    }
    public void setCustomSelectionActionModeCallback(ActionMode$Callback p0){
       super.setCustomSelectionActionModeCallback(vv7.Z(p0, this));
    }
    public void setEmojiCompatEnabled(boolean p0){
       this.getEmojiTextViewHelper().e(p0);
    }
    public void setFilters(InputFilter[] p0){
       super.setFilters(this.getEmojiTextViewHelper().a(p0));
    }
    public void setSupportAllCaps(boolean p0){
       jf tb;
       if ((tb = this.b) != null) {
          tb.a.setAllCaps(p0);
       }
       return;
    }
    public void setSupportBackgroundTintList(ColorStateList p0){
       jf ta;
       if ((ta = this.a) != null) {
          ta.h(p0);
       }
       return;
    }
    public void setSupportBackgroundTintMode(PorterDuff$Mode p0){
       jf ta;
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
       jf tb;
       super.setTextAppearance(p0, p1);
       if ((tb = this.b) != null) {
          tb.n(p0, p1);
       }
       return;
    }
    public final void setTextSize(int p0,float p1){
       jf tb;
       if (bl7.b) {
          super.setTextSize(p0, p1);
       }else if((tb = this.b) != null){
          tb.u(p0, p1);
       }
       return;
    }
}
