package com.spotify.liteui.entityview.hubs.DownloadHeaderView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import p.d83;
import android.view.KeyEvent$Callback;
import android.content.res.Resources;
import android.view.View;
import android.animation.ValueAnimator;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import p.ye;
import java.lang.Object;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import p.vf;
import android.widget.ProgressBar;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.StringBuilder;
import java.lang.String;
import p.et0;
import p.jl;
import android.widget.TextView;
import p.en6;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.view.ViewGroup;
import android.widget.LinearLayout$LayoutParams;
import p.vv7;
import p.n6;
import p.lp6;
import p.sp6;
import p.xj0;
import android.graphics.drawable.Drawable;
import p.pd1;

public class DownloadHeaderView extends LinearLayout	// class@000972 from classes.dex
{
    public TextView A;
    public pd1 B;
    public int C;
    public int D;
    public final d83 E;
    public boolean a;
    public vf b;
    public ObjectAnimator c;
    public ObjectAnimator t;
    public int v;
    public ProgressBar w;
    public ViewGroup x;
    public SwitchCompat y;
    public TextView z;

    public void DownloadHeaderView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.v = 1;
       this.E = new d83(this, 2);
       Resources resources = this.getResources();
       this.C = resources.getDimensionPixelSize(R.dimen.download_header_content_height) - 1;
       this.D = resources.getDimensionPixelSize(R.dimen.download_header_progress_bar_height) - 1;
    }
    public final ValueAnimator a(View p0,int p1,int p2){
       ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.topMargin = p1;
       ValueAnimator valueAnimato = new ValueAnimator();
       int[] ointArray = new int[]{p1,p2};
       valueAnimato.setIntValues(ointArray);
       valueAnimato.setDuration((long)400);
       valueAnimato.addUpdateListener(new ye(this, layoutParams, p0, 2));
       return valueAnimato;
    }
    public final void b(int p0,View p1,boolean p2){
       if (p2) {
          this.b.a(p1, this.a(p1, (- p0), 0), 0);
       }else {
          p1.setVisibility(0);
       }
       return;
    }
    public final void c(int p0,View p1,boolean p2){
       if (p2) {
          this.b.a(p1, this.a(p1, 0, (- p0)), true);
       }else {
          p1.setVisibility(8);
       }
       return;
    }
    public final void d(int p0,int p1){
       DownloadHeaderView v;
       int i7;
       DownloadHeaderView x;
       DownloadHeaderView uDownloadHea = this;
       int i = p0;
       int i1 = 4;
       if (i == i1) {
          uDownloadHea.w.setProgress(p1);
       }
       CompoundButton$OnCheckedChangeListener onCheckedCha = null;
       uDownloadHea.y.setOnCheckedChangeListener(onCheckedCha);
       DownloadHeaderView y = uDownloadHea.y;
       int i2 = 2;
       boolean b = (i != 3 && (i != i2 && i != true))? true: false;
       y.setChecked(b);
       uDownloadHea.y.setOnCheckedChangeListener(uDownloadHea.E);
       if ((y = uDownloadHea.v) == i) {
          return;
       }else if(y != true){
          b = true;
       }else {
          b = false;
       }
       if (y == i1) {
          uDownloadHea.c(uDownloadHea.D, uDownloadHea.w, b);
       }
       y = (i != i2 && i != true)? 1: 0;
       int i3 = ((v = uDownloadHea.v) != i2 && v != true)? 1: 0;
       int i4 = 10;
       int i5 = 9;
       int i6 = (i != 6 && (i != 7 && (i != 8 && (i != i5 && i != i4))))? 0: 1;
       v = (v != 6 && (v != 7 && (v != 8 && (v != i5 && v != i4))))? 0: 1;
       if (i6) {
          DownloadHeaderView z = uDownloadHea.z;
          if (i) {
             switch ((i - 1)){
                 case 5:
                 case 9:
                   i7 = 0x7f120192;
                   break;
                 case 6:
                   i7 = 0x7f120194;
                   break;
                 case 7:
                   i7 = 0x7f120193;
                   break;
                 case 8:
                   i7 = 0x7f120195;
                   break;
                 default:
                   jl.k("State "+et0.w(p0)+" is not a waiting state.");
             }
             z.setText(i7);
          }else {
             throw onCheckedCha;
          }
       }
       if (uDownloadHea.v == i2) {
          if (y) {
             uDownloadHea.b(uDownloadHea.C, uDownloadHea.x, b);
          }else {
             uDownloadHea.x.setVisibility(8);
          }
          if (i6) {
             uDownloadHea.b(uDownloadHea.C, uDownloadHea.z, b);
          }else {
             uDownloadHea.z.setVisibility(8);
          }
       }else if(i == i2){
          if (i3) {
             uDownloadHea.c(uDownloadHea.C, uDownloadHea.x, b);
          }
          if (v) {
             uDownloadHea.c(uDownloadHea.C, uDownloadHea.z, b);
          }
       }else if(i3 && !y){
          x = uDownloadHea.x;
          if (b) {
             uDownloadHea.b.a(x, uDownloadHea.t, true);
          }else {
             x.setVisibility(8);
          }
       }
       if (v && !i6) {
          x = uDownloadHea.z;
          if (b) {
             uDownloadHea.b.a(x, uDownloadHea.t, true);
          }else {
             x.setVisibility(8);
          }
       }
       if (y && !i3) {
          y = uDownloadHea.x;
          if (b) {
             uDownloadHea.b.a(y, uDownloadHea.c, false);
          }else {
             y.setVisibility(false);
          }
       }
       if (i6 && !v) {
          y = uDownloadHea.z;
          if (b) {
             uDownloadHea.b.a(y, uDownloadHea.c, false);
          }else {
             y.setVisibility(false);
          }
       }
       if (i == i1) {
          uDownloadHea.b(uDownloadHea.D, uDownloadHea.w, b);
       }
       uDownloadHea.v = i;
       this.e();
       return;
    }
    public final void e(){
       DownloadHeaderView tA;
       int i;
       if ((tA = this.A) == null) {
          return;
       }
       if ((i = en6.A(this.v)) != 2) {
          if (i != 4) {
             i = (this.a == null)? 0x7f12018e: 0x7f120191;
          }else if(this.a == null){
             i = 0x7f12018d;
          }else {
             i = 0x7f120190;
          }
       }else if(this.a == null){
          i = 0x7f12018c;
       }else {
          i = 0x7f12018f;
       }
       tA.setText(i);
       return;
    }
    public SwitchCompat getDownloadButton(){
       return this.y;
    }
    public final void onFinishInflate(){
       super.onFinishInflate();
       if (this.isInEditMode()) {
          return;
       }
       this.b = new vf(27);
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(null, View.ALPHA, new float[2]{0,0x3f800000});
       this.c = objectAnimat;
       objectAnimat.setDuration(400);
       objectAnimat = ObjectAnimator.ofFloat(null, View.ALPHA, new float[2]{0x3f800000,0});
       this.t = objectAnimat;
       objectAnimat.setDuration(400);
       this.x = this.findViewById(R.id.button_download_layout);
       lp6 SwitchCompat objectAnimat1 = new SwitchCompat(this.getContext(), null, 0x7f0305dc);
       this.y = objectAnimat1;
       this.x.addView(objectAnimat1, new LinearLayout$LayoutParams(-2, this.getResources().getDimensionPixelSize(R.dimen.download_header_button_height)));
       this.w = this.findViewById(R.id.progress_bar);
       this.z = this.findViewById(R.id.text_waiting);
       this.A = this.findViewById(R.id.title);
       this.e();
       vv7.Q(this.A, R.style.TextAppearance.Encore.BalladBold);
       this.A.setTextColor(n6.b(this.getContext(), R.color.white));
       objectAnimat1 = new lp6(this.getContext(), sp6.J, (float)xj0.e0(16.00f, this.getContext().getResources()));
       objectAnimat1.b(n6.b(this.getContext(), R.color.gray_50));
       this.z.setCompoundDrawablesWithIntrinsicBounds(objectAnimat1, null, null, null);
       this.y.setOnCheckedChangeListener(this.E);
       return;
    }
    public void setObserver(pd1 p0){
       this.B = p0;
    }
    public void setSongsOnly(boolean p0){
       this.a = p0;
       this.e();
    }
}
