package p.d02;
import p.h87;
import java.lang.String;
import java.lang.IllegalArgumentException;
import p.o87;
import p.pl7;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Integer;
import android.view.ViewGroup;
import android.view.View;
import android.view.ViewParent;
import android.animation.ObjectAnimator;
import p.al7;
import p.cl7;
import android.util.Property;
import p.c02;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import p.b02;
import p.g87;
import java.lang.Float;
import p.n87;
import android.graphics.Matrix;
import p.dl7;
import android.graphics.RectF;
import java.lang.Math;
import android.widget.ImageView;
import android.content.Context;
import android.widget.ImageView$ScaleType;
import android.view.ViewGroupOverlay;
import android.graphics.Picture;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import p.l55;
import android.graphics.Bitmap$Config;
import android.view.View$MeasureSpec;
import p.vf;
import java.lang.Class;
import p.nl7;
import p.qf2;
import p.ol7;
import android.animation.Animator$AnimatorPauseListener;

public final class d02 extends h87	// class@0012b0 from classes.dex
{
    public int O;
    public static final String[] P;

    static {
       String[] stringArray = new String[]{"android:visibility:visibility","android:visibility:parent"};
       d02.P = stringArray;
    }
    public void d02(){
       super();
       this.O = 3;
    }
    public void d02(int p0){
       super();
       this.O = 3;
       if ((p0 & 0xfc)) {
          throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
       }
       this.O = p0;
       return;
    }
    public static pl7 N(o87 p0,o87 p1){
       pl7 opl7 = new pl7();
       opl7.a = false;
       opl7.b = false;
       String str = "android:visibility:parent";
       ViewGroup viewGroup = null;
       int i = -1;
       if (p0 != null) {
          o87 a = p0.a;
          if (a.containsKey("android:visibility:visibility")) {
             opl7.c = a.get("android:visibility:visibility").intValue();
             opl7.e = a.get(str);
          label_0033 :
             if (p1 != null) {
                a = p1.a;
                if (a.containsKey("android:visibility:visibility")) {
                   opl7.d = a.get("android:visibility:visibility").intValue();
                   opl7.f = a.get(str);
                label_0056 :
                   if (p0 != null && p1 != null) {
                      pl7 c = opl7.c;
                      pl7 d = opl7.d;
                      if (c != d || opl7.e != opl7.f) {
                         if (c != d) {
                            if (c == null) {
                               opl7.b = false;
                               opl7.a = true;
                            }else if(d == null){
                               opl7.b = true;
                               opl7.a = true;
                            }
                         }else if(opl7.f == null){
                            opl7.b = false;
                            opl7.a = true;
                         }else if(opl7.e == null){
                            opl7.b = true;
                            opl7.a = true;
                         }
                      }
                   }else if(p0 == null && opl7.d == null){
                      opl7.b = true;
                      opl7.a = true;
                   }else if(p1 == null && opl7.c == null){
                      opl7.b = false;
                      opl7.a = true;
                   }
                   return opl7;
                }
             }
             opl7.d = i;
             opl7.f = viewGroup;
             goto label_0056 ;
          }
       }
       opl7.c = i;
       opl7.e = viewGroup;
       goto label_0033 ;
    }
    public final void L(o87 p0){
       o87 b = p0.b;
       p0 = p0.a;
       p0.put("android:visibility:visibility", Integer.valueOf(b.getVisibility()));
       p0.put("android:visibility:parent", b.getParent());
       int[] ointArray = new int[2];
       b.getLocationOnScreen(ointArray);
       p0.put("android:visibility:screenLocation", ointArray);
    }
    public final ObjectAnimator M(View p0,float p1,float p2){
       if (!(p2 - p1)) {
          return null;
       }
       al7.a.h(p0, p1);
       float[] uofloatArray = new float[]{p2};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, al7.b, uofloatArray);
       objectAnimat.addListener(new c02(p0));
       this.a(new b02(this, 0, p0));
       return objectAnimat;
    }
    public final void e(o87 p0){
       this.L(p0);
    }
    public final void h(o87 p0){
       this.L(p0);
       p0.a.put("android:fade:transitionAlpha", Float.valueOf(al7.a.g(p0.b)));
    }
    public final Animator l(ViewGroup p0,o87 p1,o87 p2){
       int i1;
       ObjectAnimator objectAnimat;
       d02 uod021;
       View parent;
       Float uFloat;
       float f2;
       View tag;
       o87 oo873;
       pl7 opl71;
       String str1;
       int[] ointArray;
       Float uFloat1;
       float f3;
       ObjectAnimator objectAnimat1;
       int visibility;
       o87 oo874;
       View parent1;
       int i6;
       boolean b3;
       boolean b4;
       Bitmap uBitmap;
       ViewParent viewParent;
       int i7;
       int i9;
       d02 uod02 = this;
       View view = p0;
       o87 oo87 = p1;
       o87 oo871 = p2;
       pl7 opl7 = d02.N(p1, p2);
       if (opl7.a != null && (opl7.e != null && opl7.f == null)) {
          String str = "android:fade:transitionAlpha";
          float f = 0;
          int i = 1;
          float f1 = 0x3f800000;
          boolean b = false;
          if (opl7.b != null) {
             if (((uod02.O & i)) == i && oo871) {
                o87 b1 = oo871.b;
                if (!oo87) {
                   parent = b1.getParent();
                   o87 oo872 = uod02.o(parent, b);
                   if (d02.N(oo872, uod02.r(parent, b)).a == null) {
                   }
                }else if(oo87 && (uFloat = oo87.a.get(str)) != null){
                   f2 = uFloat.floatValue();
                }else {
                   f2 = 0;
                }
                if (f1 - f2) {
                   f = f2;
                }
                i1 = uod02.M(b1, f, f1);
             label_0065 :
                objectAnimat = i1;
                uod021 = uod02;
             }
             i1 = 0;
             goto label_0065 ;
          }else {
             opl7 = opl7.d;
             int i2 = 2;
             if (((uod02.O & i2)) != i2 || oo87 == null) {
             label_02e9 :
                uod021 = uod02;
             label_02ea :
                objectAnimat = null;
             }else if(oo871 != null){
                oo871 = oo871.b;
             }else {
                oo871 = null;
             }
             o87 b2 = oo87.b;
             if ((tag = b2.getTag(R.id.save_overlay_view)) != null) {
                oo873 = oo87;
                opl71 = opl7;
                str1 = str;
                parent = null;
             }else if(oo871 != null && oo871.getParent() != null){
                if (opl7 == 4 || b2 == oo871) {
                   tag = null;
                label_00aa :
                   int i3 = 0;
                label_00af :
                   if (i3) {
                      if (b2.getParent() == null) {
                         oo874 = ointArray;
                         opl71 = opl7;
                         tag = b2;
                      label_00bc :
                         str1 = str;
                      }else if(b2.getParent() instanceof View){
                         parent1 = b2.getParent();
                         if (d02.N(uod02.r(parent1, i), uod02.o(parent1, i)).a == null) {
                            Matrix matrix = new Matrix();
                            matrix.setTranslate((float)(- parent1.getScrollX()), (float)(- parent1.getScrollY()));
                            dl7 a1 = al7.a;
                            a1.i(b2, matrix);
                            a1.j(view, matrix);
                            RectF rectF = new RectF(f, f, (float)b2.getWidth(), (float)b2.getHeight());
                            matrix.mapRect(rectF);
                            int i4 = Math.round(rectF.left);
                            i3 = Math.round(rectF.top);
                            int i5 = Math.round(rectF.right);
                            i2 = Math.round(rectF.bottom);
                            ImageView imageView = new ImageView(b2.getContext());
                            imageView.setScaleType(ImageView$ScaleType.CENTER_CROP);
                            if (n87.a) {
                               i6 = b2.isAttachedToWindow() ^ i;
                               b3 = p0.isAttachedToWindow();
                            }else {
                               i6 = 0;
                               b3 = false;
                            }
                            if ((b4 = n87.b) && i6) {
                               if (!b3) {
                                  oo874 = ointArray;
                                  opl71 = opl7;
                                  str1 = str;
                                  uBitmap = null;
                               }else {
                                  viewParent = b2.getParent();
                                  oo874 = ointArray;
                                  p0.getOverlay().add(b2);
                                  i7 = viewParent.indexOfChild(b2);
                               label_0172 :
                                  opl71 = opl7;
                                  int i8 = Math.round(rectF.width());
                                  i9 = Math.round(rectF.height());
                                  if (i8 > 0 && i9 > 0) {
                                     str1 = str;
                                     float f4 = Math.min(0x3f800000, (1048576.00f / (float)(i8 * i9)));
                                     i8 = Math.round(((float)i8 * f4));
                                     i9 = Math.round(((float)i9 * f4));
                                     matrix.postTranslate((- rectF.left), (- rectF.top));
                                     matrix.postScale(f4, f4);
                                     if (n87.c) {
                                        Picture picture = new Picture();
                                        Canvas uCanvas = picture.beginRecording(i8, i9);
                                        uCanvas.concat(matrix);
                                        b2.draw(uCanvas);
                                        picture.endRecording();
                                        uBitmap = l55.c(picture);
                                     }else {
                                        uBitmap = Bitmap.createBitmap(i8, i9, Bitmap$Config.ARGB_8888);
                                        Canvas uCanvas1 = new Canvas(uBitmap);
                                        uCanvas1.concat(matrix);
                                        b2.draw(uCanvas1);
                                     }
                                  }else {
                                     str1 = str;
                                     uBitmap = null;
                                  }
                                  if (b4 && i6) {
                                     p0.getOverlay().remove(b2);
                                     viewParent.addView(b2, i7);
                                  }
                               }
                            }else {
                               oo874 = ointArray;
                               i7 = 0;
                               viewParent = null;
                               goto label_0172 ;
                            }
                            if (uBitmap != null) {
                               imageView.setImageBitmap(uBitmap);
                            }
                            imageView.measure(View$MeasureSpec.makeMeasureSpec((i5 - i4), 0x40000000), View$MeasureSpec.makeMeasureSpec((i2 - i3), 0x40000000));
                            imageView.layout(i4, i3, i5, i2);
                            tag = imageView;
                         }else {
                            oo874 = ointArray;
                            opl71 = opl7;
                            str1 = str;
                            i9 = parent1.getId();
                            if (parent1.getParent() == null && i9 != -1) {
                               view.findViewById(i9);
                            }
                         }
                      }else {
                      label_0221 :
                         oo874 = ointArray;
                         opl71 = opl7;
                         goto label_00bc ;
                      }
                   }else {
                      goto label_0221 ;
                   }
                   oo873 = p1;
                   oo871 = oo874;
                   i = 0;
                }
             }else if(oo871 != null){
                tag = oo871;
                ointArray = 0;
                goto label_00aa ;
             }
             i7 = 0;
             tag = null;
             parent1 = 1;
             goto label_00af ;
             oo873 = oo873.a;
             if (tag != null) {
                if (!i) {
                   ointArray = oo873.get("android:visibility:screenLocation");
                   int[] ointArray1 = new int[2];
                   view.getLocationOnScreen(ointArray1);
                   tag.offsetLeftAndRight(((ointArray[0] - ointArray1[0]) - tag.getLeft()));
                   tag.offsetTopAndBottom(((ointArray[1] - ointArray1[1]) - tag.getTop()));
                   new vf(view).b.add(tag);
                }
                al7.a.getClass();
                if ((uFloat1 = oo873.get(str1)) != null) {
                   f1 = uFloat1.floatValue();
                   f3 = 0;
                }else {
                   f3 = 0;
                   f1 = 0x3f800000;
                }
                uod021 = this;
                objectAnimat1 = uod021.M(tag, f1, f3);
                if (!i) {
                   if (objectAnimat1 == null) {
                      new vf(view).b.remove(tag);
                   }else {
                      b2.setTag(R.id.save_overlay_view, tag);
                      uod021.a(new nl7(uod021, view, tag, b2));
                   }
                }
             }else {
                uod021 = this;
                String str2 = str1;
                if (parent != null) {
                   visibility = parent.getVisibility();
                   dl7 a = al7.a;
                   a.f(parent, 0);
                   a.getClass();
                   if ((uFloat1 = oo873.get(str2)) != null) {
                      f1 = uFloat1.floatValue();
                      f3 = 0;
                   }else {
                      f3 = 0;
                      f1 = 0x3f800000;
                   }
                   if ((objectAnimat1 = uod021.M(parent, f1, f3)) != null) {
                      ol7 ool7 = new ol7(opl71, parent);
                      objectAnimat1.addListener(ool7);
                      objectAnimat1.addPauseListener(ool7);
                      uod021.a(ool7);
                   }else {
                      a.f(parent, visibility);
                   }
                }else {
                   goto label_02ea ;
                }
             }
             objectAnimat = objectAnimat1;
          }
       }else {
          goto label_02e9 ;
       }
       return objectAnimat;
    }
    public final String[] q(){
       return d02.P;
    }
    public final boolean s(o87 p0,o87 p1){
       boolean b;
       if (p0 != null || (p1 != null && (p0 == null || (p1 == null || p1.a.containsKey("android:visibility:visibility") == p0.a.containsKey("android:visibility:visibility"))))) {
          pl7 opl7 = d02.N(p0, p1);
          if (opl7.a != null && (opl7.c == null && opl7.d != null)) {
             b = true;
          label_002d :
             return b;
          }
       }
       b = false;
       goto label_002d ;
    }
}
