package com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarImpl;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import java.lang.Object;
import android.widget.TextView;
import android.view.MenuItem;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import android.view.View;
import android.graphics.drawable.ColorDrawable;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Math;
import p.wh7;
import p.dh7;
import android.view.View$OnClickListener;

public class GlueToolbarImpl implements GlueToolbar	// class@0008e8 from classes.dex
{
    private int mBackgroundAlpha;
    private Drawable mBackgroundDrawable;
    private boolean mIsTransparent;
    private final TextView mTitleView;
    private final GlueToolbarLayout mToolbarView;

    public void GlueToolbarImpl(GlueToolbarLayout p0){
       super();
       this.mToolbarView = p0;
       this.mTitleView = p0.getTextView();
    }
    public void addOverflowItem(MenuItem p0){
       this.mToolbarView.addOverflowItem(p0);
    }
    public void addView(ToolbarSide p0,View p1,int p2){
       this.mToolbarView.addView(p0, p1, p2);
    }
    public void clear(ToolbarSide p0){
       this.mToolbarView.clear(p0);
    }
    public View findView(int p0){
       return this.mToolbarView.findView(p0);
    }
    public int getBackgroundColor(){
       GlueToolbarImpl tmBackground;
       int color = ((tmBackground = this.mBackgroundDrawable) != null && tmBackground instanceof ColorDrawable)? tmBackground.getColor(): 0;
       return color;
    }
    public CharSequence getTitle(){
       return this.mTitleView.getText();
    }
    public float getTitleAlpha(){
       return this.mTitleView.getAlpha();
    }
    public float getToolbarBackgroundAlpha(){
       return (float)this.mBackgroundAlpha;
    }
    public Drawable getToolbarBackgroundDrawable(){
       return this.mBackgroundDrawable;
    }
    public float getToolbarViewsAlpha(ToolbarSide p0){
       Iterator iterator = this.mToolbarView.getViews(p0).iterator();
       float f = 0;
       while (iterator.hasNext()) {
          f = Math.max(f, iterator.next().getAlpha());
       }
       return f;
    }
    public View getView(){
       return this.mToolbarView;
    }
    public boolean isBackgroundTransparent(){
       return this.mIsTransparent;
    }
    public void removeView(int p0){
       this.mToolbarView.removeView(p0);
    }
    public void setBackgroundColor(int p0){
       ColorDrawable uColorDrawab = new ColorDrawable(p0);
       this.mBackgroundDrawable = uColorDrawab;
       dh7.q(this.mToolbarView, uColorDrawab);
    }
    public void setBackgroundTransparent(boolean p0){
       this.mIsTransparent = p0;
       GlueToolbarImpl tmToolbarVie = this.mToolbarView;
       Drawable uDrawable = (p0)? null: this.mBackgroundDrawable;
       dh7.q(tmToolbarVie, uDrawable);
       return;
    }
    public void setOnOverflowClickListener(View$OnClickListener p0){
       this.mToolbarView.setOnOverflowClickListener(p0);
    }
    public void setTitle(CharSequence p0){
       this.mTitleView.setText(p0);
    }
    public void setTitleAlpha(float p0){
       this.mTitleView.setAlpha(p0);
    }
    public void setToolbarBackgroundAlpha(float p0){
       GlueToolbarImpl tmBackground;
       int i = (int)(p0 * 0x437f0000);
       this.mBackgroundAlpha = i;
       if ((tmBackground = this.mBackgroundDrawable) != null) {
          tmBackground.setAlpha(i);
       }
       return;
    }
    public void setToolbarBackgroundDrawable(Drawable p0){
       this.mBackgroundDrawable = p0;
       if (p0 != null) {
          p0.setAlpha(this.mBackgroundAlpha);
       }
       dh7.q(this.mToolbarView, this.mBackgroundDrawable);
       return;
    }
    public void setToolbarViewsAlpha(ToolbarSide p0,float p1){
       Iterator iterator = this.mToolbarView.getViews(p0).iterator();
       while (iterator.hasNext()) {
          View view = iterator.next();
          view.setAlpha(p1);
          int i = (!(0 - p1))? 4: 0;
          view.setVisibility(i);
       }
       return;
    }
}
