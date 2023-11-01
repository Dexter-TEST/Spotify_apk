package com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import androidx.appcompat.widget.AppCompatImageView;
import java.lang.String;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import p.co5;
import p.q24;
import p.em0;
import p.e63;
import android.view.View;
import p.n6;
import android.graphics.drawable.ColorDrawable;
import p.ej4;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import p.ox7;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.lang.Math;
import android.view.ViewGroup$LayoutParams;
import p.oi;
import p.kb;
import p.bd6;
import p.wf2;
import java.lang.Number;
import android.view.ViewOutlineProvider;
import p.af0;
import p.cl;
import p.oe5;
import p.lp6;
import p.sp6;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import p.li0;
import p.wc1;
import p.bl;
import android.net.Uri;
import p.dl;
import p.r61;
import p.l63;
import java.util.LinkedHashMap;
import java.lang.Class;
import java.util.Map;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import p.fl6;
import p.ib1;
import p.cq5;
import p.en6;
import p.kj0;
import p.ks5;
import p.ii0;
import java.lang.Boolean;
import p.ji0;
import p.n63;
import p.wp5;
import p.fj0;
import p.p24;
import p.o63;
import android.graphics.drawable.StateListDrawable;
import p.xj0;

public final class ArtworkView extends AppCompatImageView	// class@000893 from classes.dex
{
    public dl A;
    public final em0 B;
    public o63 C;
    public gi3 D;
    public final ColorDrawable t;
    public final q24 v;
    public final int w;
    public final float x;
    public LayerDrawable y;
    public sp6 z;
    public static final String E;

    static {
       ArtworkView.E = String.valueOf(R.id.cover_art_tag);
    }
    public void ArtworkView(Context p0,AttributeSet p1){
       co5.o(p0, "context");
       super(p0, p1, 0);
       this.v = new q24();
       this.B = new em0(23, this);
       this.D = e63.t;
       ColorDrawable uColorDrawab = new ColorDrawable(n6.b(this.getContext(), R.color.gray_7));
       this.t = uColorDrawab;
       uColorDrawab.setAlpha(128);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, ej4.C, 0, 0);
       co5.l(typedArray, "context.obtainStyledAttr…,\n            0\n        \)");
       this.w = typedArray.getDimensionPixelSize(1, 0);
       this.setPlaceholderBackgroundColor(n6.c(p0, typedArray.getResourceId(3, R.color.encore_placeholder_background)));
       this.x = typedArray.getFloat(2, 0x3f800000);
       ox7.H(this, 0);
       typedArray.recycle();
    }
    public static final int b(ArtworkView p0){
       return p0.getCoverArtSize();
    }
    private final float getContentRadius(){
       Context context = this.getContext();
       co5.l(context, "context");
       return Math.max((((float)context.getResources().getDisplayMetrics().densityDpi / (float)160) * 4.00f), ((float)this.getCoverArtSize() * 0.03f));
    }
    private final int getCoverArtSize(){
       int width = (this.getLayoutParams().width <= null)? this.getWidth(): this.getLayoutParams().width;
       return width;
    }
    public static void getImageLoaderColorCallback$annotations(){
    }
    public final void d(oi p0){
       Drawable uDrawable;
       li0 d1;
       bl a;
       ArtworkView a1;
       Uri eMPTY;
       String str;
       l63 p;
       kj0 tag;
       gi3 ogi3 = this;
       ArtworkView obj = p0;
       ogi3.D = new kb(obj, 3, ogi3);
       ArtworkView v = ogi3.v;
       v.setShapeAppearanceModel(new bd6().e(ogi3.D.invoke().floatValue()));
       ArtworkView d = ogi3.D;
       co5.o(d, "cornerRadius");
       int i = 1;
       int i1 = (!(d.invoke().floatValue()))? 1: 0;
       if (i1) {
          ogi3.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
          ogi3.setClipToOutline(false);
       }else {
          ogi3.setClipToOutline(i);
          ogi3.setOutlineProvider(new af0(i, d));
       }
       cl j = obj.J;
       vj3 ovj3 = null;
       int i2 = 2;
       if (j == null) {
          uDrawable = ovj3;
       }else {
          Context context = this.getContext();
          co5.l(context, "context");
          int coverArtSize = this.getCoverArtSize();
          ArtworkView x = ogi3.x;
          ArtworkView w = ogi3.w;
          if (((double)x - 0x3ff0000000000000) < 0 && this.getCoverArtSize() > 0) {
             w = w + ((int)((float)this.getCoverArtSize() * x) / i2);
          }
          ArtworkView uArtworkView = w;
          oe5 m = j.m;
          if (ogi3.z == m) {
             uDrawable = ogi3.y;
          }else {
             lp6 olp6 = new lp6(context, m, (float)(coverArtSize - (uArtworkView * 2)));
             olp6.c(n6.c(context, R.color.encore_placeholder_icon));
             Drawable[] uDrawableArr = new Drawable[i2];
             uDrawableArr[0] = v;
             uDrawableArr[i] = olp6;
             uDrawable = new LayerDrawable(uDrawableArr);
             uDrawable.setLayerInset(1, uArtworkView, uArtworkView, uArtworkView, uArtworkView);
             ogi3.y = uDrawable;
             ogi3.z = m;
          }
       }
       d = ogi3.C;
       String e = ArtworkView.E;
       if (d != null) {
          co5.o(e, "tagName");
          if ((d1 = d.d) != null) {
             d1.dispose();
          }
       }
       if ((a = obj.H.a) == null) {
          ogi3.setImageDrawable(uDrawable);
       }else if((a1 = ogi3.A) != null){
          int i3 = (!a.length())? 1: 0;
          if (i3) {
             eMPTY = Uri.EMPTY;
             str = "EMPTY";
          }else {
             eMPTY = Uri.parse(a);
             str = "parse\(coverArtUri\)";
          }
          co5.l(eMPTY, str);
          d1 = a1.a.a(eMPTY);
          co5.o(e, "name");
          li0 b = d1.b;
          if ((p = b.p) == null) {
             p = new LinkedHashMap();
             b.p = p;
          }
          String str1 = String.class;
          li0 obj1 = str1.cast(e);
          co5.i(obj1);
          p.put(str1, obj1);
          ogi3.C = d1;
          if (uDrawable != null) {
             d1.c(uDrawable);
          }
          if (this.getScaleType() == ImageView$ScaleType.CENTER_CROP && (v = ogi3.C) != null) {
             v.b.L = i;
             int width = this.getWidth();
             int height = this.getHeight();
             if (width > 0 && height > 0) {
                li0 b1 = v.b;
                b1.getClass();
                b1.K = new cq5(new fl6(new ib1(width), new ib1(height)));
                b1.M = ovj3;
                b1.N = ovj3;
                b1.O = 0;
                if (width = en6.A(i)) {
                   if (width != i) {
                      if (width == i2) {
                         b1.j = i;
                      }
                   }else {
                      b1.j = i2;
                   }
                }else {
                   b1.j = i2;
                }
             }
          }
          if (obj.I != null) {
             if ((obj = ogi3.C) != null) {
                obj.f = false;
                int ks5 i4 = 0x7f0a01a9;
                if ((tag = ogi3.getTag(i4)) == null) {
                   tag = new kj0(ogi3);
                   ogi3.setTag(i4, tag);
                }
                i4 = new ks5();
                ks5 oks5 = new ks5();
                obj1 = obj.b;
                obj1.d = new ii0(tag, i4, oks5);
                obj1.M = ovj3;
                obj1.N = ovj3;
                obj1.O = 0;
                obj1.r = Boolean.valueOf(obj.f);
                obj1.e = new ji0(obj, oks5, tag, i4);
                obj.d = obj.a.b(obj1.a());
             }
          }else if((obj = ogi3.C) != null){
             obj.b(ogi3);
          }
       }else {
          co5.N("viewContext");
          throw ovj3;
       }
       return;
    }
    public final fj0 getImageLoaderColorCallback(){
       return null;
    }
    public final ColorStateList getPlaceholderBackgroundColor(){
       return this.v.a.c;
    }
    public final float getRadius(){
       return this.D.invoke().floatValue();
    }
    public final o63 getRequestCreator(){
       return this.C;
    }
    public void setImageDrawable(Drawable p0){
       if (p0 != null && !p0.isStateful()) {
          Drawable[] uDrawableArr = new Drawable[]{p0,this.t};
          StateListDrawable stateListDra = new StateListDrawable();
          stateListDra.addState(xj0.t, new LayerDrawable(uDrawableArr));
          stateListDra.addState(xj0.v, p0);
          StateListDrawable stateListDra1 = stateListDra;
       }
       super.setImageDrawable(p0);
       return;
    }
    public final void setImageLoaderColorCallback(fj0 p0){
    }
    public final void setPlaceholderBackgroundColor(ColorStateList p0){
       this.v.k(p0);
    }
    public final void setRequestCreator(o63 p0){
       this.C = p0;
    }
    public final void setViewContext(dl p0){
       co5.o(p0, "viewContext");
       this.A = p0;
    }
}
