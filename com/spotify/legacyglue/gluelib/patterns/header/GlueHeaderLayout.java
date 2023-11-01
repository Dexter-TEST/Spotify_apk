package com.spotify.legacyglue.gluelib.patterns.header.GlueHeaderLayout;
import p.kh4;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import p.xw5;
import android.graphics.drawable.Drawable;
import p.pw5;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import p.ry7;
import android.app.Activity;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import p.av0;
import com.spotify.legacyglue.gluelib.patterns.header.behavior.GlueHeaderAccessoryBehavior;
import p.mj2;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p.xu0;
import com.spotify.legacyglue.gluelib.patterns.header.behavior.HeaderBehavior;
import android.graphics.Canvas;
import p.o67;
import p.sk2;
import com.spotify.legacyglue.gluelib.patterns.header.behavior.GlueNoHeaderBehavior;
import android.os.Parcelable;
import p.dk2;
import p.cv0;
import android.view.AbsSavedState;
import java.lang.CharSequence;
import java.lang.String;
import com.spotify.legacyglue.gluelib.patterns.toolbarmenu.ToolbarManager;
import java.lang.Class;
import java.lang.Object;

public class GlueHeaderLayout extends kh4	// class@0008f1 from classes.dex
{
    public boolean T;
    public o67 U;
    public boolean V;
    public final Drawable W;

    public void GlueHeaderLayout(Context p0,AttributeSet p1){
       int i = 0;
       super(p0, p1, i);
       TypedValue typedValue = new TypedValue();
       if (p0.getTheme().resolveAttribute(R.attr.pasteActionBarBackground, typedValue, true)) {
          this.W = (typedValue.type == 3)? pw5.a(p0.getResources(), typedValue.resourceId, null): new ColorDrawable(typedValue.data);
       }else {
          this.W = new ColorDrawable(i);
       }
       return;
    }
    private int getTranslucentAreaHeight(){
       int i1;
       Context context = this.getContext();
       int i = ry7.u(context);
       if (!context instanceof Activity) {
       }else if((context.getWindow().getAttributes().flags & 0x4000000)){
          i1 = 1;
       label_0022 :
          if (i1) {
             i = i + ry7.F(context);
          }
          return i;
       }
       i1 = 0;
       goto label_0022 ;
    }
    public final View C(){
       View childAt;
       int childCount = this.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return null;
          }
          childAt = this.getChildAt(i);
          if (childAt.getLayoutParams().a instanceof GlueHeaderAccessoryBehavior) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return childAt;
    }
    public final View D(){
       View childAt;
       int childCount = this.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return null;
          }
          childAt = this.getChildAt(i);
          if (childAt instanceof mj2) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return childAt;
    }
    public final void E(View p0,boolean p1){
       View view;
       ViewGroup$LayoutParams layoutParams;
       if ((view = this.C()) != null) {
          this.removeView(view);
       }
       if (p0 != null) {
          av0 uoav0 = ((layoutParams = p0.getLayoutParams()) != null && p1)? CoordinatorLayout.k(layoutParams): new av0(-2, -2);
          uoav0.b(new GlueHeaderAccessoryBehavior());
          this.addView(p0, uoav0);
       }
       return;
    }
    public final void F(View p0,HeaderBehavior p1,boolean p2){
       View view1;
       View view = this.D();
       if (!p2 && view == p0) {
          return;
       }
       if ((view1 = this.D()) != null) {
          this.removeView(view1);
       }
       av0 uoav0 = new av0(-1, -2);
       uoav0.b(p1);
       this.addView(p0.getView(), 1, uoav0);
       return;
    }
    public final boolean drawChild(Canvas p0,View p1,long p2){
       if (this.V == null) {
          return super.drawChild(p0, p1, p2);
       }
       p0.save();
       p0.clipRect(0, this.getTranslucentAreaHeight(), this.getMeasuredWidth(), this.getMeasuredHeight());
       p0.restore();
       return super.drawChild(p0, p1, p2);
    }
    public o67 getToolbarUpdater(){
       return this.U;
    }
    public final void onDraw(Canvas p0){
       if (this.V != null) {
          GlueHeaderLayout tW = this.W;
          tW.setBounds(0, 0, this.getMeasuredWidth(), this.getTranslucentAreaHeight());
          tW.draw(p0);
       }
       return;
    }
    public final void onFinishInflate(){
       super.onFinishInflate();
       if (this.D() == null) {
          this.F(new sk2(this.getContext()), new GlueNoHeaderBehavior(), true);
       }
       return;
    }
    public final void onRestoreInstanceState(Parcelable p0){
       if (p0 instanceof dk2) {
          super.onRestoreInstanceState(p0.a);
       }else {
          super.onRestoreInstanceState(p0);
       }
       return;
    }
    public final Parcelable onSaveInstanceState(){
       dk2 uodk2 = new dk2(AbsSavedState.EMPTY_STATE);
       uodk2.a = super.onSaveInstanceState();
       return uodk2;
    }
    public void setAccessory(View p0){
       this.E(p0, false);
    }
    public void setFakeActionBarWhenNoHeader(boolean p0){
       this.V = p0;
       View view = this.D();
       if (view instanceof sk2) {
          view.setFakingActionBar(this.V);
       }
       this.setWillNotDraw((this.V ^ 1));
       return;
    }
    public void setSplitView(boolean p0){
       this.T = p0;
    }
    public void setTitle(CharSequence p0){
       GlueHeaderLayout tU;
       if ((tU = this.U) == null) {
          return;
       }
       if (p0 != null) {
          p0.toString();
       }
       tU.getClass();
       throw null;
    }
    public void setToolbarUpdater(o67 p0){
       this.U = p0;
    }
}
