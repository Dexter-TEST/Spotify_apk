package p.h50;
import p.lg;
import android.content.Context;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import p.f50;
import java.lang.Object;
import p.rf;
import android.app.Dialog;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import android.view.ViewGroup$LayoutParams;
import android.view.LayoutInflater;
import p.uf;
import p.wh7;
import p.j15;
import p.jh7;
import p.k8;
import android.view.View$OnClickListener;
import p.e50;
import p.n3;
import p.vl3;
import android.view.View$OnTouchListener;
import android.view.Window;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Build$VERSION;
import p.um0;

public final class h50 extends lg	// class@0017e1 from classes.dex
{
    public boolean A;
    public boolean B;
    public boolean C;
    public b50 D;
    public final boolean E;
    public final f50 F;
    public BottomSheetBehavior w;
    public FrameLayout x;
    public CoordinatorLayout y;
    public FrameLayout z;
    public static final int G;

    public void h50(Context p0,int p1){
       TypedValue typedValue;
       boolean b = true;
       if (!p1) {
          typedValue = new TypedValue();
          typedValue = (p0.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, b))? typedValue.resourceId: 0x7f1302bd;
       }
       super(p0, typedValue);
       this.A = b;
       this.B = b;
       this.F = new f50(0, this);
       this.d().g(b);
       int[] ointArray = new int[b];
       ointArray[0] = 0x7f0301fd;
       this.E = this.getContext().getTheme().obtainStyledAttributes(ointArray).getBoolean(0, 0);
       return;
    }
    public final void cancel(){
       if (this.w == null) {
          this.g();
       }
       super.cancel();
       return;
    }
    public final void g(){
       if (this.x == null) {
          FrameLayout uFrameLayout = View.inflate(this.getContext(), R.layout.design_bottom_sheet_dialog, null);
          this.x = uFrameLayout;
          this.y = uFrameLayout.findViewById(R.id.coordinator);
          uFrameLayout = this.x.findViewById(R.id.design_bottom_sheet);
          this.z = uFrameLayout;
          BottomSheetBehavior uBottomSheet = BottomSheetBehavior.z(uFrameLayout);
          this.w = uBottomSheet;
          uBottomSheet = uBottomSheet.Q;
          h50 tF = this.F;
          if (!uBottomSheet.contains(tF)) {
             uBottomSheet.add(tF);
          }
          this.w.C(this.A);
       }
       return;
    }
    public final FrameLayout h(View p0,int p1,ViewGroup$LayoutParams p2){
       this.g();
       CoordinatorLayout uCoordinator = this.x.findViewById(R.id.coordinator);
       if (p1 && p0 == null) {
          p0 = this.getLayoutInflater().inflate(p1, uCoordinator, false);
       }
       if (this.E != null) {
          jh7.u(this.z, new uf(4, this));
       }
       this.z.removeAllViews();
       if (p2 == null) {
          this.z.addView(p0);
       }else {
          this.z.addView(p0, p2);
       }
       uCoordinator.findViewById(R.id.touch_outside).setOnClickListener(new k8(2, this));
       wh7.o(this.z, new e50(false, this));
       this.z.setOnTouchListener(new vl3(1, this));
       return this.x;
    }
    public final void onAttachedToWindow(){
       Window window;
       h50 tx;
       super.onAttachedToWindow();
       if ((window = this.getWindow()) != null) {
          int i = (this.E != null && Color.alpha(window.getNavigationBarColor()) < 255)? 1: 0;
          if ((tx = this.x) != null) {
             tx.setFitsSystemWindows((i ^ 0x01));
          }
          if ((tx = this.y) != null) {
             tx.setFitsSystemWindows((i ^ 0x01));
          }
          if (i) {
             window.getDecorView().setSystemUiVisibility(768);
          }
       }
       return;
    }
    public final void onCreate(Bundle p0){
       Window window;
       super.onCreate(p0);
       if ((window = this.getWindow()) != null) {
          window.setStatusBarColor(0);
          window.addFlags(Integer.MIN_VALUE);
          if (Build$VERSION.SDK_INT < 23) {
             window.addFlags(0x4000000);
          }
          window.setLayout(-1, -1);
       }
       return;
    }
    public final void onStart(){
       h50 tw;
       super.onStart();
       if ((tw = this.w) != null && tw.G == 5) {
          tw.E(4);
       }
       return;
    }
    public final void setCancelable(boolean p0){
       h50 tw;
       super.setCancelable(p0);
       if (this.A != p0) {
          this.A = p0;
          if ((tw = this.w) != null) {
             tw.C(p0);
          }
       }
       return;
    }
    public final void setCanceledOnTouchOutside(boolean p0){
       super.setCanceledOnTouchOutside(p0);
       if (p0 && this.A == null) {
          this.A = true;
       }
       this.B = p0;
       this.C = true;
       return;
    }
    public final void setContentView(int p0){
       super.setContentView(this.h(null, p0, null));
    }
    public final void setContentView(View p0){
       super.setContentView(this.h(p0, 0, null));
    }
    public final void setContentView(View p0,ViewGroup$LayoutParams p1){
       super.setContentView(this.h(p0, 0, p1));
    }
}
