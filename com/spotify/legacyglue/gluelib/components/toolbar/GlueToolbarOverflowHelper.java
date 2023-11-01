package com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarOverflowHelper;
import android.view.View$OnKeyListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.PopupWindow$OnDismissListener;
import android.widget.AdapterView$OnItemClickListener;
import android.content.Context;
import java.lang.Object;
import java.util.ArrayList;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarOverflowHelper$MenuAdapter;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarOverflowHelper$1;
import java.util.List;
import android.view.MenuItem;
import p.wl3;
import android.view.ViewTreeObserver;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Adapter;
import p.l64;
import android.view.KeyEvent;
import android.util.AttributeSet;
import android.widget.PopupWindow;
import android.widget.ListAdapter;
import java.lang.Class;
import android.content.res.Resources;
import p.xj0;

class GlueToolbarOverflowHelper implements View$OnKeyListener, ViewTreeObserver$OnGlobalLayoutListener, PopupWindow$OnDismissListener, AdapterView$OnItemClickListener	// class@0008ec from classes.dex
{
    private View mAnchorView;
    private final Context mContext;
    private final GlueToolbarOverflowHelper$MenuAdapter mMenuAdapter;
    private final List mOverflowEntries;
    private wl3 mPopup;
    private ViewTreeObserver mTreeObserver;

    public void GlueToolbarOverflowHelper(Context p0){
       super();
       this.mOverflowEntries = new ArrayList();
       this.mMenuAdapter = new GlueToolbarOverflowHelper$MenuAdapter(this, null);
       this.mContext = p0;
    }
    public static List access$100(GlueToolbarOverflowHelper p0){
       return p0.mOverflowEntries;
    }
    public void addOverflowItem(MenuItem p0){
       this.mOverflowEntries.add(p0);
    }
    public void clearOverflowMenu(){
       this.mAnchorView = null;
       this.mOverflowEntries.clear();
    }
    public void dismiss(){
       if (this.isShowing()) {
          this.mPopup.dismiss();
       }
       return;
    }
    public boolean isShowing(){
       GlueToolbarOverflowHelper tmPopup;
       boolean b = ((tmPopup = this.mPopup) != null && tmPopup.a())? true: false;
       return b;
    }
    public void onDismiss(){
       GlueToolbarOverflowHelper tmTreeObserv;
       this.mPopup = null;
       if ((tmTreeObserv = this.mTreeObserver) != null) {
          if (!tmTreeObserv.isAlive()) {
             this.mTreeObserver = this.mAnchorView.getViewTreeObserver();
          }
          this.mTreeObserver.removeOnGlobalLayoutListener(this);
          this.mTreeObserver = null;
       }
       return;
    }
    public void onGlobalLayout(){
       GlueToolbarOverflowHelper tmAnchorView;
       if (this.isShowing()) {
          if ((tmAnchorView = this.mAnchorView) != null && tmAnchorView.isShown()) {
             if (this.isShowing()) {
                this.mPopup.c();
             }
          }else {
             this.dismiss();
          }
       }
       return;
    }
    public void onItemClick(AdapterView p0,View p1,int p2,long p3){
       GlueToolbarOverflowHelper tmPopup;
       MenuItem item = p0.getAdapter().getItem(p2);
       if ((tmPopup = this.mPopup) != null && (tmPopup.a() && item.isEnabled())) {
          this.mPopup.dismiss();
       }
       if (item.isEnabled()) {
          item.f();
       }
       return;
    }
    public boolean onKey(View p0,int p1,KeyEvent p2){
       if (p2.getAction() != 1 || p1 != 82) {
          return false;
       }
       this.mPopup.dismiss();
       return true;
    }
    public void openOverflowMenu(){
       int i = 0;
       wl3 owl3 = new wl3(this.mContext, null, 0x7f030398, i);
       this.mPopup = owl3;
       owl3.P.setOnDismissListener(this);
       GlueToolbarOverflowHelper tmPopup = this.mPopup;
       tmPopup.G = this;
       tmPopup.p(this.mMenuAdapter);
       tmPopup = this.mPopup;
       boolean b = true;
       tmPopup.O = b;
       tmPopup.P.setFocusable(b);
       tmPopup = this.mAnchorView;
       tmPopup.getClass();
       if (this.mTreeObserver == null) {
          i = 1;
       }
       ViewTreeObserver viewTreeObse = tmPopup.getViewTreeObserver();
       this.mTreeObserver = viewTreeObse;
       if (i) {
          viewTreeObse.addOnGlobalLayoutListener(this);
       }
       GlueToolbarOverflowHelper tmPopup1 = this.mPopup;
       tmPopup1.F = tmPopup;
       tmPopup1.C = 0x800005;
       tmPopup1.r(xj0.d0(220.00f, this.mContext.getResources()));
       this.mPopup.P.setInputMethodMode(2);
       this.mPopup.c();
       owl3 = this.mPopup.c;
       owl3.getClass();
       owl3.setOnKeyListener(this);
       return;
    }
    public void setAnchorView(View p0){
       this.mAnchorView = p0;
    }
}
