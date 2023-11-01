package p.og7;
import p.fg7;
import android.graphics.PorterDuff$Mode;
import android.graphics.Matrix;
import android.graphics.Rect;
import p.mg7;
import android.content.res.ColorStateList;
import android.graphics.PorterDuffColorFilter;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import p.xw5;
import android.graphics.drawable.Drawable;
import p.pw5;
import p.ng7;
import android.graphics.drawable.Drawable$ConstantState;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;
import java.lang.String;
import java.lang.Throwable;
import android.util.Log;
import p.ce1;
import android.graphics.Canvas;
import java.lang.Math;
import p.eb3;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import p.lg7;
import p.ig7;
import android.graphics.Paint;
import android.graphics.ColorFilter;
import p.be1;
import p.tu6;
import android.content.res.TypedArray;
import p.ej4;
import android.util.TypedValue;
import p.jj0;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;
import java.lang.Object;
import p.wh6;
import java.util.ArrayDeque;
import p.hg7;
import p.kg7;
import p.v95;
import p.vv7;
import p.xl0;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Join;
import java.util.ArrayList;
import p.gg7;
import java.lang.Boolean;
import java.lang.Runnable;

public final class og7 extends fg7	// class@002119 from classes.dex
{
    public mg7 b;
    public PorterDuffColorFilter c;
    public ColorFilter t;
    public boolean v;
    public boolean w;
    public final float[] x;
    public final Matrix y;
    public final Rect z;
    public static final PorterDuff$Mode A;

    static {
       og7.A = PorterDuff$Mode.SRC_IN;
    }
    public void og7(){
       super();
       this.w = true;
       float[] uofloatArray = new float[9];
       this.x = uofloatArray;
       this.y = new Matrix();
       this.z = new Rect();
       this.b = new mg7();
    }
    public void og7(mg7 p0){
       super();
       this.w = true;
       float[] uofloatArray = new float[9];
       this.x = uofloatArray;
       this.y = new Matrix();
       this.z = new Rect();
       this.b = p0;
       this.c = this.b(p0.c, p0.d);
    }
    public static og7 a(Resources p0,int p1,Resources$Theme p2){
       int i;
       if (Build$VERSION.SDK_INT >= 24) {
          og7 oog7 = new og7();
          oog7.a = pw5.a(p0, p1, p2);
          ng7 ong7 = new ng7(oog7.a.getConstantState());
          return oog7;
       }else {
          try{
             XmlResourceParser xml = p0.getXml(p1);
             AttributeSet uAttributeSe = Xml.asAttributeSet(xml);
             do {
             } while ((i = xml.next()) != 2 && i != 1);
             if (i != 2) {
                throw new XmlPullParserException("No start tag found");
             }
             og7 oog71 = new og7();
             oog71.inflate(p0, xml, uAttributeSe, p2);
             return oog71;
          }catch(org.xmlpull.v1.XmlPullParserException e6){
             Log.e("VectorDrawableCompat", "parser error", e6);
          }catch(java.io.IOException e6){
             Log.e("VectorDrawableCompat", "parser error", e6);
          }
          return null;
       }
    }
    public final PorterDuffColorFilter b(ColorStateList p0,PorterDuff$Mode p1){
       if (p0 != null && p1 != null) {
          return new PorterDuffColorFilter(p0.getColorForState(this.getState(), 0), p1);
       }
       return null;
    }
    public final boolean canApplyTheme(){
       fg7 ta;
       if ((ta = this.a) != null) {
          ce1.b(ta);
       }
       return false;
    }
    public final void draw(Canvas p0){
       fg7 a;
       og7 t;
       mg7 f5;
       mg7 b1;
       Paint paint;
       fg7 uofg7 = this;
       Canvas uCanvas = p0;
       if ((a = uofg7.a) != null) {
          a.draw(uCanvas);
          return;
       }else {
          og7 z = uofg7.z;
          uofg7.copyBounds(z);
          if (z.width() > 0 && z.height() > 0) {
             if ((t = uofg7.t) == null) {
                t = uofg7.c;
             }
             og7 y = uofg7.y;
             uCanvas.getMatrix(y);
             og7 x = uofg7.x;
             y.getValues(x);
             int i = 0;
             float f = Math.abs(x[i]);
             float f1 = Math.abs(x[4]);
             int i1 = 1;
             float f2 = Math.abs(x[3]);
             float f3 = 0x3f800000;
             float f4 = 0;
             if ((f4 - Math.abs(x[i1])) || (f4 - f2)) {
                f = 0x3f800000;
                f1 = 0x3f800000;
             }
             int i2 = 2048;
             int i3 = Math.min(i2, (int)((float)z.width() * f));
             int i4 = Math.min(i2, (int)((float)z.height() * f1));
             if (i3 > 0 && i4 > 0) {
                i2 = p0.save();
                uCanvas.translate((float)z.left, (float)z.top);
                int i5 = (this.isAutoMirrored() && eb3.o(this) == i1)? 1: 0;
                if (i5) {
                   uCanvas.translate((float)z.width(), f4);
                   uCanvas.scale(0xbf800000, f3);
                }
                z.offsetTo(i, i);
                og7 b = uofg7.b;
                if ((f5 = b.f) != null) {
                   f5 = (i3 == f5.getWidth() && i4 == b.f.getHeight())? 1: 0;
                   if (f5) {
                   label_00cb :
                      if (uofg7.w == null) {
                         b = uofg7.b;
                         b.f.eraseColor(i);
                         b1 = b.b;
                         b1.a(b1.g, lg7.p, new Canvas(b.f), i3, i4);
                      }else {
                         b = uofg7.b;
                         b = (b.k == null && (b.g == b.c && (b.h == b.d && (b.j == b.e && b.i == b.b.getRootAlpha()))))? 1: 0;
                         if (!b) {
                            b = uofg7.b;
                            b.f.eraseColor(i);
                            b1 = b.b;
                            b1.a(b1.g, lg7.p, new Canvas(b.f), i3, i4);
                            x = uofg7.b;
                            x.g = x.c;
                            x.h = x.d;
                            x.i = x.b.getRootAlpha();
                            x.j = x.e;
                            x.k = i;
                         }
                      }
                      x = uofg7.b;
                      if (x.b.getRootAlpha() < 255) {
                         i = 1;
                      }
                      if (!i && t == null) {
                         paint = null;
                      }else if(x.l == null){
                         Paint paint1 = new Paint();
                         x.l = paint1;
                         paint1.setFilterBitmap(i1);
                      }
                      x.l.setAlpha(x.b.getRootAlpha());
                      x.l.setColorFilter(t);
                      paint = x.l;
                      uCanvas.drawBitmap(x.f, null, z, paint);
                      uCanvas.restoreToCount(i2);
                   }
                }
                b.f = Bitmap.createBitmap(i3, i4, Bitmap$Config.ARGB_8888);
                b.k = i1;
                goto label_00cb ;
             }
          }
          return;
       }
    }
    public final int getAlpha(){
       fg7 ta;
       if ((ta = this.a) != null) {
          return be1.a(ta);
       }
       return this.b.b.getRootAlpha();
    }
    public final int getChangingConfigurations(){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ta.getChangingConfigurations();
       }
       return (super.getChangingConfigurations() | this.b.getChangingConfigurations());
    }
    public final ColorFilter getColorFilter(){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ce1.c(ta);
       }
       return this.t;
    }
    public final Drawable$ConstantState getConstantState(){
       if (this.a != null && Build$VERSION.SDK_INT >= 24) {
          return new ng7(this.a.getConstantState());
       }
       this.b.a = this.getChangingConfigurations();
       return this.b;
    }
    public final int getIntrinsicHeight(){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ta.getIntrinsicHeight();
       }
       return (int)this.b.b.i;
    }
    public final int getIntrinsicWidth(){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ta.getIntrinsicWidth();
       }
       return (int)this.b.b.h;
    }
    public final int getOpacity(){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ta.getOpacity();
       }
       return -3;
    }
    public final void inflate(Resources p0,XmlPullParser p1,AttributeSet p2){
       fg7 ta;
       if ((ta = this.a) != null) {
          ta.inflate(p0, p1, p2);
          return;
       }else {
          this.inflate(p0, p1, p2, null);
          return;
       }
    }
    public final void inflate(Resources p0,XmlPullParser p1,AttributeSet p2,Resources$Theme p3){
       fg7 a;
       TypedValue type;
       ColorStateList uColorStateL;
       String str;
       int i7;
       mg7 omg7;
       int i8;
       hg7 m;
       TypedArray typedArray2;
       String str4;
       fg7 uofg7 = this;
       Resources resources = p0;
       XmlPullParser xmlPullParse = p1;
       AttributeSet uAttributeSe = p2;
       Resources$Theme theme = p3;
       if ((a = uofg7.a) != null) {
          ce1.d(a, resources, xmlPullParse, uAttributeSe, theme);
          return;
       }else {
          og7 b = uofg7.b;
          b.b = new lg7();
          TypedArray typedArray = ej4.h0(resources, theme, uAttributeSe, tu6.a);
          og7 b1 = uofg7.b;
          mg7 b2 = b1.b;
          int i = ej4.L(typedArray, xmlPullParse, "tintMode", 6, -1);
          PorterDuff$Mode sRC_IN = PorterDuff$Mode.SRC_IN;
          int i1 = 9;
          int i2 = 5;
          int i3 = 3;
          if (i != i3) {
             if (i != i2) {
                if (i != i1) {
                   switch (i){
                       case 14:
                         sRC_IN = PorterDuff$Mode.MULTIPLY;
                         break;
                       case 15:
                         sRC_IN = PorterDuff$Mode.SCREEN;
                         break;
                       case 16:
                         sRC_IN = PorterDuff$Mode.ADD;
                         break;
                       default:
                   }
                }else {
                   sRC_IN = PorterDuff$Mode.SRC_ATOP;
                }
             }
          }else {
             sRC_IN = PorterDuff$Mode.SRC_OVER;
          }
          b1.d = sRC_IN;
          int i4 = 0;
          int i5 = 2;
          i1 = 1;
          if (ej4.R(xmlPullParse, "tint")) {
             TypedValue typedValue = new TypedValue();
             typedArray.getValue(i1, typedValue);
             if ((type = typedValue.type) != i5) {
                if (type >= 28 && type <= 31) {
                   uColorStateL = ColorStateList.valueOf(typedValue.data);
                }else {
                   Resources resources1 = typedArray.getResources();
                   i5 = typedArray.getResourceId(i1, i4);
                   try{
                      ThreadLocal a1 = jj0.a;
                      uColorStateL = jj0.a(resources1, resources1.getXml(i5), theme);
                   }catch(java.lang.Exception e0){
                      Log.e("CSLCompat", "Failed to inflate ColorStateList.", e0);
                   }
                   uColorStateL = null;
                }
                if (uColorStateL != null) {
                   b1.c = uColorStateL;
                }
                mg7 e = b1.e;
                if (ej4.R(xmlPullParse, "autoMirrored")) {
                   e = typedArray.getBoolean(i2, e);
                }
                b1.e = e;
                b2.j = ej4.K(typedArray, xmlPullParse, "viewportWidth", 7, b2.j);
                float f = ej4.K(typedArray, xmlPullParse, "viewportHeight", 8, b2.k);
                b2.k = f;
                if ((b2.j) > 0) {
                   if ((f) > 0) {
                      b2.h = typedArray.getDimension(i3, b2.h);
                      f = typedArray.getDimension(2, b2.i);
                      b2.i = f;
                      if ((b2.h) > 0) {
                         if ((f) > 0) {
                            b2.setAlpha(ej4.K(typedArray, xmlPullParse, "alpha", 4, b2.getAlpha()));
                            if ((str = typedArray.getString(i4)) != null) {
                               b2.m = str;
                               b2.o.put(str, b2);
                            }
                            typedArray.recycle();
                            b.a = this.getChangingConfigurations();
                            b.k = i1;
                            og7 b3 = uofg7.b;
                            mg7 b4 = b3.b;
                            ArrayDeque uArrayDeque = new ArrayDeque();
                            uArrayDeque.push(b4.g);
                            int eventType = p1.getEventType();
                            i5 = p1.getDepth() + 1;
                            int i6 = 1;
                            while (eventType != i1 && (p1.getDepth() >= i5 && eventType == i3)) {
                               String str1 = "group";
                               if (eventType == 2) {
                                  String name = p1.getName();
                                  ig7 oig7 = uArrayDeque.peek();
                                  String str2 = "fillType";
                                  String str3 = "pathData";
                                  i7 = i5;
                                  lg7 o = b4.o;
                                  if ("path".equals(name)) {
                                     hg7 ohg7 = new hg7();
                                     TypedArray typedArray1 = ej4.h0(resources, theme, uAttributeSe, tu6.c);
                                     if (!ej4.R(xmlPullParse, str3)) {
                                        omg7 = b4;
                                     }else if((str1 = typedArray1.getString(0)) != null){
                                        ohg7.b = str1;
                                     }
                                     if ((str1 = typedArray1.getString(2)) != null) {
                                        ohg7.a = vv7.k(str1);
                                     }
                                     ohg7.g = ej4.J(typedArray1, xmlPullParse, theme, "fillColor", 1);
                                     omg7 = b4;
                                     ohg7.i = ej4.K(typedArray1, xmlPullParse, "fillAlpha", 12, ohg7.i);
                                     i8 = ej4.L(typedArray1, xmlPullParse, "strokeLineCap", 8, -1);
                                     m = ohg7.m;
                                     if (i8) {
                                        if (i8 != 1) {
                                           if (i8 == 2) {
                                              m = Paint$Cap.SQUARE;
                                           }
                                        }else {
                                           m = Paint$Cap.ROUND;
                                        }
                                     }else {
                                        m = Paint$Cap.BUTT;
                                     }
                                     ohg7.m = m;
                                     i8 = ej4.L(typedArray1, xmlPullParse, "strokeLineJoin", 9, -1);
                                     hg7 n = ohg7.n;
                                     if (i8) {
                                        if (i8 != 1) {
                                           if (i8 == 2) {
                                              n = Paint$Join.BEVEL;
                                           }
                                        }else {
                                           n = Paint$Join.ROUND;
                                        }
                                     }else {
                                        n = Paint$Join.MITER;
                                     }
                                     ohg7.n = n;
                                     ohg7.o = ej4.K(typedArray1, xmlPullParse, "strokeMiterLimit", 10, ohg7.o);
                                     ohg7.e = ej4.J(typedArray1, xmlPullParse, theme, "strokeColor", 3);
                                     ohg7.h = ej4.K(typedArray1, xmlPullParse, "strokeAlpha", 11, ohg7.h);
                                     ohg7.f = ej4.K(typedArray1, xmlPullParse, "strokeWidth", 4, ohg7.f);
                                     ohg7.k = ej4.K(typedArray1, xmlPullParse, "trimPathEnd", 6, ohg7.k);
                                     ohg7.l = ej4.K(typedArray1, xmlPullParse, "trimPathOffset", 7, ohg7.l);
                                     ohg7.j = ej4.K(typedArray1, xmlPullParse, "trimPathStart", 5, ohg7.j);
                                     ohg7.c = ej4.L(typedArray1, xmlPullParse, str2, 13, ohg7.c);
                                     typedArray1.recycle();
                                     oig7.b.add(ohg7);
                                     if (ohg7.getPathName() != null) {
                                        o.put(ohg7.getPathName(), ohg7);
                                     }
                                     i8 = b3.a | ohg7.d;
                                     b3.a = i8;
                                     i6 = 0;
                                  }else {
                                     omg7 = b4;
                                     if ("clip-path".equals(name)) {
                                        gg7 ogg7 = new gg7();
                                        if (ej4.R(xmlPullParse, str3)) {
                                           typedArray2 = ej4.h0(resources, theme, uAttributeSe, tu6.t);
                                           i4 = 0;
                                           if ((str1 = typedArray2.getString(i4)) != null) {
                                              ogg7.b = str1;
                                           }
                                           if ((str4 = typedArray2.getString(1)) != null) {
                                              ogg7.a = vv7.k(str4);
                                           }
                                           ogg7.c = ej4.L(typedArray2, xmlPullParse, str2, 2, i4);
                                           typedArray2.recycle();
                                        }
                                        oig7.b.add(ogg7);
                                        if (ogg7.getPathName() != null) {
                                           o.put(ogg7.getPathName(), ogg7);
                                        }
                                        i8 = ogg7.d | b3.a;
                                        b3.a = i8;
                                     }else if(str1.equals(name)){
                                        ig7 oig71 = new ig7();
                                        typedArray2 = ej4.h0(resources, theme, uAttributeSe, tu6.b);
                                        oig71.c = ej4.K(typedArray2, xmlPullParse, "rotation", 5, oig71.c);
                                        oig71.d = typedArray2.getFloat(1, oig71.d);
                                        oig71.e = typedArray2.getFloat(2, oig71.e);
                                        oig71.f = ej4.K(typedArray2, xmlPullParse, "scaleX", 3, oig71.f);
                                        oig71.g = ej4.K(typedArray2, xmlPullParse, "scaleY", 4, oig71.g);
                                        oig71.h = ej4.K(typedArray2, xmlPullParse, "translateX", 6, oig71.h);
                                        oig71.i = ej4.K(typedArray2, xmlPullParse, "translateY", 7, oig71.i);
                                        if ((str3 = typedArray2.getString(0)) != null) {
                                           oig71.l = str3;
                                        }
                                        oig71.c();
                                        typedArray2.recycle();
                                        oig7.b.add(oig71);
                                        uArrayDeque.push(oig71);
                                        if (oig71.getGroupName() != null) {
                                           o.put(oig71.getGroupName(), oig71);
                                        }
                                        i8 = oig71.k | b3.a;
                                        b3.a = i8;
                                     }
                                     m = 5;
                                  }
                                  o = 3;
                               }else {
                                  omg7 = b4;
                                  i7 = i5;
                                  if (eventType == 3 && str1.equals(p1.getName())) {
                                     uArrayDeque.pop();
                                  }
                               }
                               eventType = p1.next();
                               i5 = i7;
                               b4 = omg7;
                               i1 = 1;
                               i3 = 3;
                            }
                            if (!i6) {
                               uofg7.c = uofg7.b(b.c, b.d);
                               return;
                            }else {
                               throw new XmlPullParserException("no path defined");
                            }
                         }else {
                            throw new XmlPullParserException(typedArray.getPositionDescription()+"<vector> tag requires height > 0");
                         }
                      }else {
                         throw new XmlPullParserException(typedArray.getPositionDescription()+"<vector> tag requires width > 0");
                      }
                   }else {
                      throw new XmlPullParserException(typedArray.getPositionDescription()+"<vector> tag requires viewportHeight > 0");
                   }
                }else {
                   throw new XmlPullParserException(typedArray.getPositionDescription()+"<vector> tag requires viewportWidth > 0");
                }
             }else {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: "+typedValue);
             }
          }else {
          }
       }
    }
    public final void invalidateSelf(){
       fg7 ta;
       if ((ta = this.a) != null) {
          ta.invalidateSelf();
          return;
       }else {
          super.invalidateSelf();
          return;
       }
    }
    public final boolean isAutoMirrored(){
       fg7 ta;
       if ((ta = this.a) != null) {
          return be1.d(ta);
       }
       return this.b.e;
    }
    public final boolean isStateful(){
       fg7 ta;
       og7 tb;
       boolean b1;
       if ((ta = this.a) != null) {
          return ta.isStateful();
       }
       if (!super.isStateful()) {
          if ((tb = this.b) != null) {
             mg7 b = tb.b;
             if (b.n == null) {
                b.n = Boolean.valueOf(b.g.a());
             }
             if (b.n.booleanValue() || ((b = this.b.c) != null || !b.isStateful())) {
             label_003c :
                b1 = true;
             label_003d :
                return b1;
             }
          }
          b1 = false;
          goto label_003d ;
       }else {
          goto label_003c ;
       }
    }
    public final Drawable mutate(){
       fg7 ta;
       if ((ta = this.a) != null) {
          ta.mutate();
          return this;
       }else if(this.v == null && super.mutate() == this){
          this.b = new mg7(this.b);
          this.v = true;
       }
       return this;
    }
    public final void onBoundsChange(Rect p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          ta.setBounds(p0);
       }
       return;
    }
    public final boolean onStateChange(int[] p0){
       fg7 ta;
       mg7 d;
       if ((ta = this.a) != null) {
          return ta.setState(p0);
       }
       og7 tb = this.b;
       mg7 c = tb.c;
       boolean b = true;
       if (c != null && (d = tb.d) != null) {
          this.c = this.b(c, d);
          this.invalidateSelf();
          c = 1;
       }else {
          c = 0;
       }
       d = tb.b;
       if (d.n == null) {
          d.n = Boolean.valueOf(d.g.a());
       }
       if (d.n.booleanValue()) {
          boolean b1 = tb.b.g.b(p0);
          tb.k = tb.k | b1;
          if (b1) {
             this.invalidateSelf();
          label_004e :
             return b;
          }
       }
       b = c;
       goto label_004e ;
    }
    public final void scheduleSelf(Runnable p0,long p1){
       fg7 ta;
       if ((ta = this.a) != null) {
          ta.scheduleSelf(p0, p1);
          return;
       }else {
          super.scheduleSelf(p0, p1);
          return;
       }
    }
    public final void setAlpha(int p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          ta.setAlpha(p0);
          return;
       }else if(this.b.b.getRootAlpha() != p0){
          this.b.b.setRootAlpha(p0);
          this.invalidateSelf();
       }
       return;
    }
    public final void setAutoMirrored(boolean p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          be1.e(ta, p0);
          return;
       }else {
          this.b.e = p0;
          return;
       }
    }
    public final void setColorFilter(ColorFilter p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          ta.setColorFilter(p0);
          return;
       }else {
          this.t = p0;
          this.invalidateSelf();
          return;
       }
    }
    public final void setTint(int p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          eb3.A(ta, p0);
          return;
       }else {
          this.setTintList(ColorStateList.valueOf(p0));
          return;
       }
    }
    public final void setTintList(ColorStateList p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          ce1.h(ta, p0);
          return;
       }else {
          og7 tb = this.b;
          if (tb.c != p0) {
             tb.c = p0;
             this.c = this.b(p0, tb.d);
             this.invalidateSelf();
          }
          return;
       }
    }
    public final void setTintMode(PorterDuff$Mode p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          ce1.i(ta, p0);
          return;
       }else {
          og7 tb = this.b;
          if (tb.d != p0) {
             tb.d = p0;
             this.c = this.b(tb.c, p0);
             this.invalidateSelf();
          }
          return;
       }
    }
    public final boolean setVisible(boolean p0,boolean p1){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ta.setVisible(p0, p1);
       }
       return super.setVisible(p0, p1);
    }
    public final void unscheduleSelf(Runnable p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          ta.unscheduleSelf(p0);
          return;
       }else {
          super.unscheduleSelf(p0);
          return;
       }
    }
}
