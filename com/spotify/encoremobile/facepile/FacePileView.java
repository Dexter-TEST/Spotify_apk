package com.spotify.encoremobile.facepile.FacePileView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ap5;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.encoremobile.facepile.FacePileContainer;
import p.w51;
import com.spotify.encoremobile.facepile.FaceView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import p.do5;
import java.util.Arrays;
import p.ys5;
import com.google.common.collect.c;
import android.graphics.Path;
import android.graphics.Path$FillType;
import android.graphics.Path$Direction;
import java.util.Iterator;
import p.r61;
import p.fy1;
import java.util.AbstractCollection;
import java.util.List;
import p.ey1;
import p.dj0;
import java.lang.Integer;
import p.d1;

public class FacePileView extends LinearLayout	// class@00089a from classes.dex
{
    public final ys5 a;
    public final FacePileContainer b;
    public final boolean c;
    public final int t;
    public final float v;

    public void FacePileView(Context p0,AttributeSet p1){
       int i3;
       Context context;
       co5.o(p0, "context");
       int i = 0;
       super(p0, p1, i);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, ap5.E);
       co5.l(typedArray, "context.obtainStyledAttr…R.styleable.FacePileView\)");
       int dimensionPix = typedArray.getDimensionPixelSize(1, this.getResources().getDimensionPixelSize(R.dimen.face_size));
       this.t = typedArray.getDimensionPixelSize(3, this.getResources().getDimensionPixelSize(R.dimen.second_face_left_margin));
       int integer = typedArray.getInteger(2, 2);
       this.c = typedArray.getBoolean(4, 1);
       this.v = typedArray.getDimension(i, 0);
       typedArray.recycle();
       LayoutInflater layoutInflat = LayoutInflater.from(this.getContext());
       View view = layoutInflat.inflate(R.layout.face_pile_container, this, i);
       co5.j(view, "null cannot be cast to non-null type com.spotify.encoremobile.facepile.FacePileContainer");
       this.b = view;
       this.addView(view);
       w51.h(4, "initialCapacity");
       Object[] objArray = new Object[4];
       int i1 = 0;
       int i2 = 0;
       while (i1 < integer) {
          View view1 = layoutInflat.inflate(R.layout.face_view_layout, this.b, i);
          co5.j(view1, "null cannot be cast to non-null type com.spotify.encoremobile.facepile.FaceView");
          if (!i1) {
             view1.setId(R.id.face_pile_first);
          }else {
             FacePileView tt = this.t;
             ViewGroup$LayoutParams layoutParams = view1.getLayoutParams();
             co5.j(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
             context = view1.getContext();
             co5.l(context, "faceView.context");
             context = (context.getResources().getConfiguration().getLayoutDirection() == 1)? 1: 0;
             layoutParams.rightMargin = (context)? tt: tt;
             view1.setLayoutParams(layoutParams);
          }
          if ((this.v) <= 0) {
             i3 = integer - i1;
             float f = (float)i3 - 0x3f800000;
             f = f * this.getResources().getDisplayMetrics().density;
             view1.setElevation(f);
          }
          view1.setDuplicateParentStateEnabled(1);
          i3 = i2 + 1;
          if (objArray.length < i3) {
             objArray = Arrays.copyOf(objArray, do5.t(objArray.length, i3));
          }
          objArray[i2] = view1;
          this.b.addView(view1);
          i1 = i1 + 1;
          i2 = i3;
       }
       ys5 oys5 = c.m(i2, objArray);
       co5.l(oys5, "faceViewListBuilder.build\(\)");
       this.a = oys5;
       this.setFaceSize(dimensionPix);
       return;
    }
    private final void setFaceSize(int p0){
       float f = (float)p0 / 2.00f;
       FacePileView tb = this.b;
       tb.b = (2.00f * f) + (float)this.t;
       FacePileView tv = this.v;
       if ((tv) <= 0) {
          tb.a = null;
       }else {
          Path path = new Path();
          path.setFillType(Path$FillType.INVERSE_EVEN_ODD);
          path.addCircle(f, f, (tv + f), Path$Direction.CW);
          tb.a = path;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          FaceView uFaceView = iterator.next();
          ViewGroup$LayoutParams layoutParams = uFaceView.getLayoutParams();
          layoutParams.width = p0;
          layoutParams.height = p0;
          uFaceView.setLayoutParams(layoutParams);
       }
       return;
    }
    public final void a(r61 p0,fy1 p1){
       Iterator iterator2;
       ey1 uoey11;
       ey1 d;
       ey1 d1;
       FacePileView ta = this.a;
       co5.o(ta, "faceViews");
       if (ta.isEmpty()) {
       }else {
          Iterator iterator = ta.iterator();
          fy1 a = p1.a;
          Iterator iterator1 = a.iterator();
          int i = 0;
          ys5 t = ta.t;
          p1 = p1.d;
          ey1 uoey1 = null;
          if (a.size() > t && this.c != null) {
             int i1 = t - 1;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                ey1 uoey12 = iterator1.next();
                if ((d1 = uoey12.d) == null) {
                   d1 = (p1 != null)? dj0.m0(i2, p1): uoey1;
                }
                uoey12.d = d1;
                iterator.next().b(p0, uoey12);
             }
             FaceView uFaceView = iterator.next();
             Object[] objArray = new Object[]{Integer.valueOf((a.size() - i1))};
             String str = uFaceView.getContext().getString(R.string.encore_face_overflow_template, objArray);
             co5.l(str, "lastFaceView.context.get…emplate, additionalCount\)");
             uoey11 = new ey1(str);
             if (p1 != null) {
                uoey1 = dj0.r0(p1);
             }
             uoey11.d = uoey1;
             uFaceView.b(p0, uoey11);
          }else {
             while (true) {
                iterator2 = iterator;
                if (iterator2.hasNext() && iterator1.hasNext()) {
                   uoey11 = iterator1.next();
                   if ((d = uoey11.d) == null) {
                      d = (p1 != null)? dj0.m0(i, p1): uoey1;
                   }
                   uoey11.d = d;
                   iterator2.next().b(p0, uoey11);
                   i = i + 1;
                }else {
                   break ;
                }
             }
             while (iterator2.hasNext()) {
                iterator2.next().b(p0, uoey1);
             }
          }
       }
       return;
    }
}
