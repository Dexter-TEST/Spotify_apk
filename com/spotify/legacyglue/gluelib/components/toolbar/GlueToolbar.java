package com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import p.zk2;
import android.view.MenuItem;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import android.view.View;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;

public interface abstract GlueToolbar implements zk2	// class@0008e7 from classes.dex
{

    void addOverflowItem(MenuItem p0);
    void addView(ToolbarSide p0,View p1,int p2);
    void clear(ToolbarSide p0);
    View findView(int p0);
    int getBackgroundColor();
    CharSequence getTitle();
    float getTitleAlpha();
    float getToolbarBackgroundAlpha();
    Drawable getToolbarBackgroundDrawable();
    float getToolbarViewsAlpha(ToolbarSide p0);
    View getView();
    boolean isBackgroundTransparent();
    void removeView(int p0);
    void setBackgroundColor(int p0);
    void setBackgroundTransparent(boolean p0);
    void setOnOverflowClickListener(View$OnClickListener p0);
    void setTitle(CharSequence p0);
    void setTitleAlpha(float p0);
    void setToolbarBackgroundAlpha(float p0);
    void setToolbarBackgroundDrawable(Drawable p0);
    void setToolbarViewsAlpha(ToolbarSide p0,float p1);
}
