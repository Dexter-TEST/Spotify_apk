package com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import java.util.LinkedHashMap;
import android.content.res.Resources;
import android.view.View;
import p.xj0;
import p.yk2;
import p.hm1;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import p.uw5;
import android.view.ViewGroup$LayoutParams;
import p.ap5;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarOverflowHelper;
import p.or6;
import p.lp6;
import p.sp6;
import android.graphics.drawable.Drawable;
import p.sg;
import p.dh7;
import p.jm7;
import android.view.View$OnClickListener;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import android.view.MenuItem;
import java.lang.Integer;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import p.ox7;
import android.view.View$MeasureSpec;
import p.jl;
import p.b17;
import android.widget.ImageButton;
import java.lang.Math;
import p.ry7;

public class GlueToolbarLayout extends ViewGroup	// class@0008e9 from classes.dex
{
    private final Map mEndViews;
    private final GlueToolbarOverflowHelper mGlueToolbarOverflowHelper;
    private final int mHorizontalToolbarPadding;
    private View$OnClickListener mOverflowClickListener;
    private ImageButton mOverflowView;
    private final Map mStartViews;
    private final TextView mTextView;
    private int mTextViewLeft;
    private static final int BUTTON_SIZE_DP = 40;

    public void GlueToolbarLayout(Context p0){
       super(p0, null);
    }
    public void GlueToolbarLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void GlueToolbarLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.mStartViews = new LinkedHashMap();
       this.mEndViews = new LinkedHashMap();
       this.mHorizontalToolbarPadding = xj0.e0(6.00f, this.getResources());
       this.mOverflowClickListener = new yk2();
       co5.o(p0, "context");
       hm1 ohm1 = new hm1(p0, null, 0x7f03022a);
       this.mTextView = ohm1;
       ohm1.setId(R.id.glue_toolbar_title);
       ohm1.setGravity(17);
       ohm1.setEllipsize(TextUtils$TruncateAt.END);
       ohm1.setMaxLines(1);
       uw5.t(p0, ohm1, R.attr.pasteTextAppearanceBodyMediumBold);
       ohm1.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
       ap5.n(ohm1);
       this.addView(ohm1);
       this.mGlueToolbarOverflowHelper = new GlueToolbarOverflowHelper(p0);
    }
    public static void a(GlueToolbarLayout p0,View p1){
       p0.lambda$createOverflowButton$1(p1);
    }
    public static void b(View p0){
       GlueToolbarLayout.lambda$new$0(p0);
    }
    private void clearOverflow(){
       this.mOverflowView = null;
       this.mGlueToolbarOverflowHelper.clearOverflowMenu();
    }
    private void createOverflowButton(){
       or6 oor6 = new or6(this.getContext());
       oor6.setImageDrawable(new lp6(this.getContext(), sp6.U, (float)this.getResources().getDimensionPixelSize(R.dimen.toolbar_context_menu_icon_size)));
       dh7.q(oor6, null);
       oor6.setOnClickListener(new jm7(4, this));
       this.addView(ToolbarSide.END, oor6, R.id.legacy_overflow);
       this.mGlueToolbarOverflowHelper.setAnchorView(oor6);
       this.mOverflowView = oor6;
    }
    private void lambda$createOverflowButton$1(View p0){
       this.mGlueToolbarOverflowHelper.openOverflowMenu();
       this.mOverflowClickListener.onClick(p0);
    }
    private static void lambda$new$0(View p0){
    }
    public void addOverflowItem(MenuItem p0){
       if (this.mOverflowView == null) {
          this.createOverflowButton();
       }
       this.mGlueToolbarOverflowHelper.addOverflowItem(p0);
       return;
    }
    public void addView(ToolbarSide p0,View p1,int p2){
       if (!this.mStartViews.containsKey(Integer.valueOf(p2)) && !this.mEndViews.containsKey(Integer.valueOf(p2))) {
          GlueToolbarLayout tmStartViews = (p0 == ToolbarSide.START)? this.mStartViews: this.mEndViews;
          tmStartViews.put(Integer.valueOf(p2), p1);
          this.addView(p1);
       }
       return;
    }
    public void clear(ToolbarSide p0){
       GlueToolbarLayout tmStartViews = (p0 == ToolbarSide.START)? this.mStartViews: this.mEndViews;
       Iterator iterator = tmStartViews.values().iterator();
       while (iterator.hasNext()) {
          this.removeView(iterator.next());
       }
       this.clearOverflow();
       tmStartViews.clear();
       return;
    }
    public View findView(int p0){
       View view = this.mStartViews.get(Integer.valueOf(p0));
       View view1 = this.mEndViews.get(Integer.valueOf(p0));
       if (view != null) {
       }else {
          view = view1;
       }
       return view;
    }
    public TextView getTextView(){
       return this.mTextView;
    }
    public Collection getViews(ToolbarSide p0){
       if (p0 == ToolbarSide.START) {
          return this.mStartViews.values();
       }
       return this.mEndViews.values();
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.mGlueToolbarOverflowHelper.dismiss();
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       Collection uCollection;
       Collection uCollection1;
       View view;
       int i;
       int i1;
       int i2;
       GlueToolbarLayout tmHorizontal = this.mHorizontalToolbarPadding;
       if (ox7.y(this)) {
          uCollection = this.mEndViews.values();
          uCollection1 = this.mStartViews.values();
       }else {
          uCollection = this.mStartViews.values();
          uCollection1 = this.mEndViews.values();
       }
       Iterator iterator = uCollection.iterator();
       while (iterator.hasNext()) {
          view = iterator.next();
          p4 = this.getMeasuredHeight() / 2;
          i = view.getMeasuredHeight() / 2;
          p4 = p4 - i;
          i = view.getMeasuredWidth() + tmHorizontal;
          i1 = view.getMeasuredHeight() + p4;
          view.layout(tmHorizontal, p4, i, i1);
          i2 = tmHorizontal + view.getMeasuredWidth();
       }
       tmHorizontal = this.mHorizontalToolbarPadding;
       iterator = uCollection1.iterator();
       while (iterator.hasNext()) {
          view = iterator.next();
          p3 = this.getMeasuredHeight() / 2;
          p4 = view.getMeasuredHeight() / 2;
          p3 = p3 - p4;
          p4 = this.getMeasuredWidth() - tmHorizontal;
          p4 = p4 - view.getMeasuredWidth();
          i = this.getMeasuredWidth() - tmHorizontal;
          i1 = view.getMeasuredHeight() + p3;
          view.layout(p4, p3, i, i1);
          i2 = tmHorizontal + view.getMeasuredWidth();
       }
       this.mTextView.layout(this.mTextViewLeft, ((this.getMeasuredHeight() / 2) - (this.mTextView.getMeasuredHeight() / 2)), (this.mTextView.getMeasuredWidth() + this.mTextViewLeft), ((this.mTextView.getMeasuredHeight() / 2) + (this.getMeasuredHeight() / 2)));
       return;
    }
    public void onMeasure(int p0,int p1){
       Collection uCollection;
       Collection uCollection1;
       View view;
       int i = 0;
       int i1 = 1;
       int i2 = (!View$MeasureSpec.getMode(p0))? 1: 0;
       jl.h((i2 ^ i1), "GlueToolbarLayout does not support UNSPECIFIED width measure spec");
       if (!View$MeasureSpec.getMode(p1)) {
          i = 1;
       }
       jl.h((i ^ 0x01), "GlueToolbarLayout does not support UNSPECIFIED height measure spec");
       p0 = View$MeasureSpec.getSize(p0);
       p1 = View$MeasureSpec.getSize(p1);
       GlueToolbarLayout tmHorizontal = this.mHorizontalToolbarPadding;
       i = xj0.e0(40.00f, this.getResources());
       i1 = b17.s(i);
       i = b17.s(i);
       int i3 = View$MeasureSpec.makeMeasureSpec(p0, Integer.MIN_VALUE);
       int i4 = View$MeasureSpec.makeMeasureSpec(p1, Integer.MIN_VALUE);
       if (ox7.y(this)) {
          uCollection = this.mEndViews.values();
          uCollection1 = this.mStartViews.values();
       }else {
          uCollection = this.mStartViews.values();
          uCollection1 = this.mEndViews.values();
       }
       Iterator iterator = uCollection.iterator();
       GlueToolbarLayout glueToolbarL = tmHorizontal;
       while (iterator.hasNext()) {
          view = iterator.next();
          if (view instanceof ImageButton) {
             view.measure(i1, i);
          }else {
             view.measure(i3, i4);
          }
          glueToolbarL = glueToolbarL + view.getMeasuredWidth();
       }
       iterator = uCollection1.iterator();
       while (iterator.hasNext()) {
          view = iterator.next();
          if (view instanceof ImageButton) {
             view.measure(i1, i);
          }else {
             view.measure(i3, i4);
          }
          tmHorizontal = tmHorizontal + view.getMeasuredWidth();
       }
       this.mTextView.measure(i3, i4);
       float f = (float)p0 / 2.00f;
       float f1 = f - ((float)this.mTextView.getMeasuredWidth() / 2.00f);
       float f2 = ((float)this.mTextView.getMeasuredWidth() / 2.00f) + f;
       f = Math.max(f1, (float)glueToolbarL);
       this.mTextViewLeft = (int)Math.floor((double)f);
       this.mTextView.measure(b17.s((int)Math.ceil((double)(Math.min(f2, (float)(p0 - tmHorizontal)) - f))), i4);
       this.setMeasuredDimension(p0, p1);
       return;
    }
    public void removeView(int p0){
       View view = this.mStartViews.remove(Integer.valueOf(p0));
       View view1 = this.mEndViews.remove(Integer.valueOf(p0));
       if (view != null) {
          this.removeView(view);
       }
       if (view1 != null) {
          this.removeView(view1);
       }
       return;
    }
    public void setOnOverflowClickListener(View$OnClickListener p0){
       this.mOverflowClickListener = ry7.r(p0, this.mOverflowClickListener);
    }
}
