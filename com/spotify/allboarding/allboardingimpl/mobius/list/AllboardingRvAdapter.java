package com.spotify.allboarding.allboardingimpl.mobius.list.AllboardingRvAdapter;
import p.dk3;
import p.fl3;
import p.a07;
import p.r61;
import p.cs0;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.kn;
import java.util.List;
import p.he5;
import p.fe5;
import p.ge5;
import p.en6;
import p.cd2;
import p.ee5;
import p.de5;
import p.vk;
import p.wc4;
import p.jx;
import p.iq6;
import p.xc4;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import p.zr5;
import p.ia6;
import p.kl6;
import java.lang.Integer;
import p.ng2;
import p.h57;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import android.content.res.Resources;
import p.xk;
import p.cl;
import p.bl;
import java.lang.Class;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import java.lang.Runnable;
import p.dl;
import p.qk7;
import p.r;
import p.oi;
import p.dz6;
import android.view.View$OnLayoutChangeListener;
import p.f5;
import android.view.View$OnClickListener;
import p.wk;
import p.zj7;
import p.s25;
import android.content.Context;
import android.graphics.drawable.Drawable;
import p.eb3;
import android.graphics.Color;
import p.ce1;
import p.wh7;
import p.dh7;
import p.kx;
import p.n6;
import p.os0;
import android.net.Uri;
import p.li0;
import p.l63;
import p.ez5;
import p.q77;
import android.widget.ImageView;
import p.hf6;
import p.ff6;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.graphics.drawable.LayerDrawable;
import androidx.recyclerview.widget.RecyclerView;
import p.ap5;
import p.tp2;

public final class AllboardingRvAdapter extends fl3 implements dk3	// class@000508 from classes.dex
{
    public final r61 v;
    public final ng2 w;
    public final ng2 x;
    public static final a07 y;

    static {
       AllboardingRvAdapter.y = new a07(1);
    }
    public void AllboardingRvAdapter(r61 p0,cs0 p1,cs0 p2){
       co5.o(p0, "imageLoader");
       super(AllboardingRvAdapter.y);
       this.v = p0;
       this.w = p1;
       this.x = p2;
    }
    public final int f(int p0){
       he5 ohe5 = this.t.f.get(p0);
       if (ohe5 instanceof fe5) {
          ohe5 = 0x7f0d002f;
       }else {
          int i = 10;
          if (ohe5 instanceof ge5) {
             if (ohe5 = en6.A(ohe5.b)) {
                if (ohe5 == 1) {
                   ohe5 = 0x7f0d0030;
                }else {
                   throw new cd2(i);
                }
             }else {
                ohe5 = 0x7f0d002c;
             }
          }else if(ohe5 instanceof ee5){
             ohe5 = 0x7f0d002e;
          }else if(ohe5 instanceof de5){
             de5 c = ohe5.c;
             if (c instanceof vk) {
                return 0x7f0d002a;
             }else if(c instanceof wc4){
                ohe5 = 0x7f0d002b;
             }else if(c instanceof jx){
                return 0x7f0d002d;
             }else if(c instanceof iq6){
                return 0x7f0d0031;
             }else if(c instanceof xc4){
                ohe5 = 0x7f0d0032;
             }else {
                throw new IllegalStateException("This Picker object seems invalid -> "+ohe5);
             }
          }else {
             throw new cd2(i);
          }
       }
       return ohe5;
    }
    public final void n(zr5 p0,int p1){
       AllboardingRvAdapter w;
       ee5 b;
       de5 c;
       xk v1;
       ArtworkView a;
       wk v2;
       de5 c1;
       kx v3;
       li0 b1;
       hf6 v4;
       ff6 v5;
       GradientDrawable c1;
       fl3 uofl3 = this;
       h57 oh57 = p0;
       he5 ohe5 = uofl3.t.f.get(p1);
       if (!oh57 instanceof ia6) {
          if (oh57 instanceof kl6) {
             if ((w = uofl3.w) != null) {
                co5.l(ohe5, "item");
                w.b(ohe5, Integer.valueOf(p1));
             }
          }else {
             int i = 0;
             int i1 = 1;
             int i2 = 8;
             if (oh57 instanceof h57) {
                co5.j(ohe5, "null cannot be cast to non-null type com.spotify.allboarding.allboardingdomain.model.PickerItem.SectionTitle");
                oh57.u.setText(ohe5.a);
                h57 v = oh57.v;
                co5.l(v, "subtitleTv");
                if ((b = ohe5.b) == null) {
                   i1 = 0;
                }
                if (!i1) {
                   i = 8;
                }
                v.setVisibility(i);
                if (b != null) {
                   v.setText(b);
                }
                oh57 = oh57.w;
                oh57.setPadding(oh57.getResources().getDimensionPixelOffset(R.dimen.spacer_8), oh57.getResources().getDimensionPixelOffset(R.dimen.spacer_8), oh57.getResources().getDimensionPixelOffset(R.dimen.spacer_8), oh57.getResources().getDimensionPixelOffset(R.dimen.spacer_8));
             }else {
                String str = "null cannot be cast to non-null type com.spotify.allboarding.allboardingdomain.model.PickerItem.Picker";
                if (oh57 instanceof xk) {
                   co5.j(ohe5, str);
                   c = ohe5.c;
                   co5.j(c, "null cannot be cast to non-null type com.spotify.allboarding.allboardingdomain.model.Artist");
                   co5.o(ohe5.b(), "<set-?>");
                   if ((v1 = oh57.v) != null) {
                      v1.b(ohe5, Integer.valueOf(oh57.d()));
                   }
                   oh57.x.setText(c.b);
                   v1 = oh57.u;
                   v1.setSelected(ohe5.t);
                   cl uocl = new cl(new bl(c.y));
                   xk y = oh57.y;
                   y.getClass();
                   y.removeCallbacks(y.B);
                   if ((a = y.A) != null) {
                      a.a.getClass();
                      r.c(y).a();
                   }
                   if (y.getWidth() > 0 && y.getHeight() > 0) {
                      y.d(uocl);
                   }else {
                      y.addOnLayoutChangeListener(new dz6(y, uocl));
                   }
                   v1.setOnClickListener(new f5(5, oh57, ohe5));
                }else {
                   int i3 = 3;
                   int i4 = 4;
                   if (oh57 instanceof wk) {
                      co5.j(ohe5, str);
                      c = ohe5.c;
                      co5.j(c, "null cannot be cast to non-null type com.spotify.allboarding.allboardingdomain.model.MoreArtists");
                      if ((v2 = oh57.v) != null) {
                         v2.b(ohe5, Integer.valueOf(oh57.d()));
                      }
                      v2 = oh57.x;
                      v2.setText(c.b);
                      s25.a(v2, new zj7(i3, i4, v2));
                      wk u = oh57.u;
                      Drawable uDrawable = ((uDrawable = eb3.m(u.getContext(), R.drawable.allboarding_item_circle_placeholder)) != null)? eb3.L(uDrawable): null;
                      if (uDrawable != null) {
                         ce1.g(uDrawable, Color.parseColor(c.x));
                      }
                      dh7.q(v2, uDrawable);
                      u.setOnClickListener(new f5(i4, oh57, ohe5));
                   }else {
                      int i5 = 2;
                      if (oh57 instanceof kx) {
                         co5.j(ohe5, str);
                         c1 = ohe5.c;
                         co5.j(c1, "null cannot be cast to non-null type com.spotify.allboarding.allboardingdomain.model.Banner");
                         if ((v3 = oh57.v) != null) {
                            v3.b(ohe5, Integer.valueOf(oh57.d()));
                         }
                         oh57.y.setText(c1.b);
                         v3 = oh57.u;
                         v3.setSelected(ohe5.t);
                         Drawable uDrawable1 = os0.b(v3.getContext(), R.drawable.allboarding_item_banner_placeholder);
                         li0 oli0 = oh57.x.a(Uri.parse(c1.v));
                         if (uDrawable1 != null) {
                            oli0.c(uDrawable1);
                            oli0.a(uDrawable1);
                         }else {
                            oli0.e = i;
                         }
                         b1 = oli0.b;
                         b1.L = i5;
                         b1.L = i1;
                         oli0.d(new ez5(Integer.valueOf((int)v3.getResources().getDimension(R.dimen.allboarding_item_banner_radius))));
                         View view = v3.findViewById(R.id.image);
                         co5.l(view, "view.findViewById<ImageView>\(R.id.image\)");
                         oli0.b(view);
                         v3.setOnClickListener(new f5(6, oh57, ohe5));
                      }else if(oh57 instanceof hf6){
                         co5.j(ohe5, str);
                         de5 c2 = ohe5.c;
                         co5.j(c2, "null cannot be cast to non-null type com.spotify.allboarding.allboardingdomain.model.Square");
                         if ((v4 = oh57.v) != null) {
                            v4.b(ohe5, Integer.valueOf(oh57.d()));
                         }
                         v4 = oh57.y;
                         v4.setText(c2.b);
                         iq6 z = c2.z;
                         int i6 = (!z.length())? 1: 0;
                         hf6 z1 = oh57.z;
                         if (i6) {
                            v4.setTextAlignment(i4);
                            z1.setVisibility(i2);
                         }else {
                            v4.setTextAlignment(i5);
                            z1.setText(z);
                            z1.setVisibility(i);
                         }
                         v4 = oh57.u;
                         v4.setSelected(ohe5.t);
                         Drawable uDrawable2 = os0.b(v4.getContext(), R.drawable.allboarding_item_squircle_pillow_placeholder);
                         co5.i(uDrawable2);
                         iq6 y1 = c2.y;
                         if (!y1.length()) {
                            i = 1;
                         }
                         hf6 a1 = oh57.A;
                         if (i) {
                            a1.setImageDrawable(uDrawable2);
                         }else {
                            b1 = oh57.x.a(Uri.parse(y1));
                            b1.c(uDrawable2);
                            b1.a(uDrawable2);
                            li0 b2 = b1.b;
                            b2.L = i5;
                            b2.L = i1;
                            b1.d(new ez5(Integer.valueOf(v4.getResources().getDimensionPixelSize(R.dimen.allboarding_item_pillow_corner_radius))));
                            co5.l(a1, "image");
                            b1.b(a1);
                         }
                         v4.setOnClickListener(new f5(i2, oh57, ohe5));
                      }else if(oh57 instanceof ff6){
                         co5.j(ohe5, str);
                         c1 = ohe5.c;
                         co5.j(c1, "null cannot be cast to non-null type com.spotify.allboarding.allboardingdomain.model.MoreSquares");
                         if ((v5 = oh57.v) != null) {
                            v5.b(ohe5, Integer.valueOf(oh57.d()));
                         }
                         v5 = oh57.x;
                         v5.setText(c1.b);
                         s25.a(v5, new zj7(i3, i4, v5));
                         GradientDrawable gradientDraw = new GradientDrawable();
                         ff6 u1 = oh57.u;
                         gradientDraw.setCornerRadius(u1.getResources().getDimension(R.dimen.allboarding_item_pillow_more_background_radius));
                         gradientDraw.setColor(Color.parseColor(c1.x));
                         c1 = new GradientDrawable();
                         int[] ointArray = new int[i5];
                         ointArray[i] = n6.b(u1.getContext(), R.color.pillow_textprotection_from);
                         ointArray[i1] = n6.b(u1.getContext(), R.color.pillow_textprotection_to);
                         c1.setColors(ointArray);
                         c1.setOrientation(GradientDrawable$Orientation.TL_BR);
                         Drawable[] uDrawableArr = new Drawable[i5];
                         uDrawableArr[i] = gradientDraw;
                         uDrawableArr[i1] = c1;
                         LayerDrawable layerDrawabl = new LayerDrawable(uDrawableArr);
                         i1 = (int)u1.getResources().getDimension(R.dimen.allboarding_item_pillow_more_background_inset);
                         i2 = layerDrawabl.getNumberOfLayers();
                         for (; i < i2; i = i + 1) {
                            layerDrawabl.setLayerInset(i, i1, i1, i1, i1);
                         }
                         dh7.q(v5, layerDrawabl);
                         u1.setOnClickListener(new f5(7, oh57, ohe5));
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public final zr5 o(int p0,RecyclerView p1){
       kl6 okl6;
       co5.o(p1, "parent");
       Context context = p1.getContext();
       co5.l(context, "parent.context");
       View view = ap5.s(context, p0, p1, 4);
       if (p0 == 0x7f0d002c) {
       }else if(p0 == 0x7f0d0030){
          context = 0;
       label_0021 :
          if (context) {
             co5.l(view, "view");
             okl6 = new kl6(view);
          }else if(p0 == 0x7f0d002f){
             co5.l(view, "view");
             okl6 = new ia6(view);
          }else if(p0 == 0x7f0d002e){
             co5.l(view, "view");
             okl6 = new h57(view);
          }else {
             AllboardingRvAdapter tv = this.v;
             AllboardingRvAdapter tx = this.x;
             AllboardingRvAdapter tw = this.w;
             if (p0 == 0x7f0d002a) {
                co5.l(view, "view");
                okl6 = new xk(view, tw, tx, tv);
             }else if(p0 == 0x7f0d002b){
                co5.l(view, "view");
                okl6 = new wk(view, tw, tx);
             }else if(p0 == 0x7f0d002d){
                co5.l(view, "view");
                okl6 = new kx(view, tw, tx, tv);
             }else if(p0 == 0x7f0d0031){
                co5.l(view, "view");
                okl6 = new hf6(view, tw, tx, tv);
             }else if(p0 == 0x7f0d0032){
                co5.l(view, "view");
                okl6 = new ff6(view, tw, tx);
             }else {
                throw new IllegalStateException(tp2.k("I don\'t know objects of that viewType ", p0));
             }
          }
          return okl6;
       }
       context = 1;
       goto label_0021 ;
    }
}
