package p.ee;
import p.c57;
import p.sr6;
import p.be;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.content.res.Resources$Theme;
import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import java.lang.String;
import org.xmlpull.v1.XmlPullParser;
import java.lang.Object;
import p.eo5;
import android.content.res.TypedArray;
import p.ej4;
import p.fe1;
import p.hk0;
import p.ge1;
import android.util.DisplayMetrics;
import java.lang.Class;
import p.mw5;
import android.util.StateSet;
import p.og7;
import org.xmlpull.v1.XmlPullParserException;
import java.lang.StringBuilder;
import p.rr6;
import java.lang.Integer;
import p.jo6;
import p.ie;
import java.lang.Long;
import p.qv3;
import p.xe7;
import android.graphics.drawable.AnimationDrawable;
import p.ce;
import p.ae;
import android.graphics.drawable.Animatable;

public final class ee extends sr6 implements c57	// class@001472 from classes.dex
{
    public be G;
    public xe7 H;
    public int I;
    public int J;
    public boolean K;

    public void ee(be p0,Resources p1){
       super();
       this.I = -1;
       this.J = -1;
       this.d(new be(p0, this, p1));
       this.onStateChange(this.getState());
       this.jumpToCurrentState();
    }
    public static ee e(Context p0,Resources$Theme p1,Resources p2,AttributeSet p3,XmlResourceParser p4){
       DisplayMetrics densityDpi;
       boolean i5;
       int depth;
       int i6;
       int[] ointArray1;
       String str;
       int i7;
       Context uContext1;
       Resources$Theme theme = p1;
       Resources resources = p2;
       AttributeSet uAttributeSe = p3;
       XmlPullParser xmlPullParse = p4;
       String name = p4.getName();
       if (!name.equals("animated-selector")) {
          throw new XmlPullParserException(p4.getPositionDescription()+": invalid animated-selector tag "+name);
       }
       ee uoee = new ee(null, null);
       TypedArray typedArray = ej4.h0(resources, theme, uAttributeSe, eo5.x);
       int i = 1;
       uoee.setVisible(typedArray.getBoolean(i, i), i);
       ee g = uoee.G;
       g.d = g.d | hk0.b(typedArray);
       int i1 = 2;
       g.i = typedArray.getBoolean(i1, g.i);
       int i2 = 3;
       g.l = typedArray.getBoolean(i2, g.l);
       g.y = typedArray.getInt(4, g.y);
       g.z = typedArray.getInt(5, g.z);
       int i3 = 0;
       uoee.setDither(typedArray.getBoolean(i3, g.w));
       ge1 a = uoee.a;
       if (resources != null) {
          a.b = resources;
          if ((densityDpi = p2.getDisplayMetrics().densityDpi) == null) {
             densityDpi = 160;
          }
          fe1 c = a.c;
          a.c = densityDpi;
          if (c != densityDpi) {
             a.m = i3;
             a.j = i3;
          }
       }else {
          a.getClass();
       }
       typedArray.recycle();
       int i4 = p4.getDepth() + i;
       Context uContext = p0;
       Resources$Theme theme1 = theme;
       while (true) {
          if ((i5 = p4.next()) != i && ((depth = p4.getDepth()) >= i4 && i5 == i2)) {
             if (i5 != i1 || depth > i4) {
             }else {
                depth = -1;
                if (p4.getName().equals("item")) {
                   TypedArray typedArray1 = ej4.h0(resources, theme1, uAttributeSe, eo5.y);
                   int resourceId = typedArray1.getResourceId(i3, i3);
                   Drawable uDrawable = ((depth = typedArray1.getResourceId(i, depth)) > 0)? mw5.d().g(uContext, depth): null;
                   typedArray1.recycle();
                   i5 = p3.getAttributeCount();
                   int[] ointArray = new int[i5];
                   i = 0;
                   i2 = 0;
                   while (i2 < i5) {
                      if ((i1 = uAttributeSe.getAttributeNameResource(i2)) && (i1 != 0x10100d0 && i1 != 0x1010199)) {
                         i6 = i + 1;
                         if (!uAttributeSe.getAttributeBooleanValue(i2, i3)) {
                            i1 = - i1;
                         }
                         ointArray[i] = i1;
                         i = i6;
                      }
                      i2 = i2 + 1;
                      i6 = 4;
                   }
                   ointArray1 = StateSet.trimStateSet(ointArray, i);
                   str = ": <item> tag requires a \'drawable\' attribute or child tag defining a drawable";
                   if (uDrawable == null) {
                      do {
                      } while ((i7 = p4.next()) == 4);
                      if (i7 == 2) {
                         if (p4.getName().equals("vector")) {
                            uDrawable = new og7();
                            uDrawable.inflate(resources, xmlPullParse, uAttributeSe, theme1);
                         }else {
                            uDrawable = hk0.a(resources, xmlPullParse, uAttributeSe, theme1);
                         }
                      }else {
                         throw new XmlPullParserException(p4.getPositionDescription()+str);
                      }
                   }
                   if (uDrawable != null) {
                      ee g1 = uoee.G;
                      i7 = g1.a(uDrawable);
                      g1.H[i7] = ointArray1;
                      g1.J.f(i7, Integer.valueOf(resourceId));
                      i = p0;
                   }else {
                   }
                }else if(p4.getName().equals("transition")){
                   TypedArray typedArray2 = ej4.h0(resources, theme1, uAttributeSe, eo5.z);
                   i1 = typedArray2.getResourceId(2, depth);
                   i2 = typedArray2.getResourceId(1, depth);
                   Drawable uDrawable1 = ((i6 = typedArray2.getResourceId(i3, depth)) > 0)? mw5.d().g(uContext, i6): null;
                   i5 = typedArray2.getBoolean(3, i3);
                   typedArray2.recycle();
                   String str1 = ": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable";
                   if (uDrawable1 == null) {
                      while ((i6 = p4.next()) == 4) {
                         ointArray1 = 1;
                      }
                      if (i6 == 2) {
                         if (p4.getName().equals("animated-vector")) {
                            uContext1 = p0;
                            uDrawable1 = new ie(uContext1);
                            uDrawable1.inflate(resources, xmlPullParse, uAttributeSe, theme);
                         }else {
                            uContext1 = p0;
                            uDrawable1 = hk0.a(resources, xmlPullParse, uAttributeSe, theme1);
                         }
                      }else {
                         throw new XmlPullParserException(p4.getPositionDescription()+str1);
                      }
                   }else {
                      uContext1 = p0;
                   }
                   if (uDrawable1 != null) {
                      if (i1 != depth && i2 != depth) {
                         ee g2 = uoee.G;
                         int i8 = g2.a(uDrawable1);
                         long l = (long)i1;
                         long l1 = 32;
                         long l2 = l << l1;
                         long l3 = (long)i2;
                         long l4 = l3 | l2;
                         l2 = (i5)? 0x200000000: 0;
                         long l5 = (long)i8;
                         long l6 = l5 | l2;
                         g2.I.a(l4, Long.valueOf(l6));
                         if (i5) {
                            l4 = l3 << l1;
                            l4 = l4 | l;
                            l5 = l5 | 0x100000000;
                            l5 = l5 | l2;
                            g2.I.a(l4, Long.valueOf(l5));
                         }
                      }else {
                         throw new XmlPullParserException(p4.getPositionDescription()+": <transition> tag requires \'fromId\' & \'toId\' attributes");
                      }
                   }else {
                      throw new XmlPullParserException(p4.getPositionDescription()+str1);
                   }
                }else {
                   uContext1 = p0;
                }
                theme1 = p1;
                uContext = uContext1;
                theme = p1;
                resources = p2;
                uAttributeSe = p3;
                xmlPullParse = p4;
                i = 1;
                i3 = 0;
                i1 = 2;
                i2 = 3;
                i6 = 4;
             }
          }else {
             uoee.onStateChange(uoee.getState());
             return uoee;
          }
       }
       throw new XmlPullParserException(p4.getPositionDescription()+str);
    }
    public final void d(be p0){
       ge1 tx;
       this.a = p0;
       if ((tx = this.x) >= null) {
          Drawable uDrawable = p0.d(tx);
          this.c = uDrawable;
          if (uDrawable != null) {
             this.b(uDrawable);
          }
       }
       this.t = null;
       if (p0 instanceof rr6) {
          this.E = p0;
       }
       if (p0 instanceof be) {
          this.G = p0;
       }
       return;
    }
    public final boolean isStateful(){
       return true;
    }
    public final void jumpToCurrentState(){
       ee tH;
       super.jumpToCurrentState();
       if ((tH = this.H) != null) {
          tH.g0();
          this.H = null;
          this.c(this.I);
          this.I = -1;
          this.J = -1;
       }
       return;
    }
    public final Drawable mutate(){
       if (this.K == null) {
          super.mutate();
          this.G.e();
          this.K = true;
       }
       return this;
    }
    public final boolean onStateChange(int[] p0){
       ee h2;
       int i4;
       ce uoce;
       ee uoee = this;
       int[] ointArray = p0;
       ee g = uoee.G;
       rr6 h = g.H;
       fe1 h1 = g.h;
       int i = 0;
       int i1 = 0;
       while (true) {
          int i2 = -1;
          if (i1 < h1) {
             if (StateSet.stateSetMatches(h[i1], ointArray)) {
             label_001c :
                if (i1 < 0) {
                   int[] wILD_CARD = StateSet.WILD_CARD;
                   rr6 h3 = g.H;
                   fe1 h4 = g.h;
                   i1 = 0;
                   while (true) {
                      if (i1 < h4) {
                         if (!StateSet.stateSetMatches(h3[i1], wILD_CARD)) {
                            i1 = i1 + 1;
                         }
                      }else {
                         i1 = -1;
                      }
                   }
                }
                ge1 x = uoee.x;
                if (i1 != x) {
                   if ((h2 = uoee.H) != null) {
                      if (i1 != uoee.I) {
                         if (i1 == uoee.J && h2.g()) {
                            h2.Y();
                            uoee.I = uoee.J;
                            uoee.J = i1;
                         }else {
                            x = uoee.I;
                            h2.g0();
                         label_005e :
                            uoee.H = null;
                            uoee.J = i2;
                            uoee.I = i2;
                            h2 = uoee.G;
                            if (x < null) {
                               h2.getClass();
                               i2 = 0;
                            }else {
                               i2 = h2.J.e(x, Integer.valueOf(i)).intValue();
                            }
                            int i3 = (i1 < 0)? 0: h2.J.e(i1, Integer.valueOf(i)).intValue();
                            if (i3 && i2) {
                               long l = (long)i3 | ((long)i2 << 32);
                               long l1 = -1;
                               if ((i4 = (int)h2.I.f(l, Long.valueOf(l1)).longValue()) >= 0) {
                                  boolean b = ((h2.I.f(l, Long.valueOf(l1)).longValue() & 0x200000000))? true: false;
                                  uoee.c(i4);
                                  ge1 c = uoee.c;
                                  if (c instanceof AnimationDrawable) {
                                     boolean b1 = ((h2.I.f(l, Long.valueOf(l1)).longValue() & 0x100000000))? true: false;
                                     uoce = new ce(c, b1, b);
                                  }else if(c instanceof ie){
                                     uoce = new ae(c, 1);
                                  }else if(c instanceof Animatable){
                                     uoce = new ae(c, i);
                                  }
                                  uoce.f0();
                                  uoee.H = uoce;
                                  uoee.J = x;
                                  uoee.I = i1;
                               }
                            }
                            x = 0;
                         label_0127 :
                            if (x || uoee.c(i1)) {
                               i = 1;
                            }
                         }
                      }
                   }else {
                      goto label_005e ;
                   }
                   x = 1;
                   goto label_0127 ;
                }
                if ((x = uoee.c) != null) {
                   i = i | x.setState(ointArray);
                   break ;
                }
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             i1 = -1;
             goto label_001c ;
          }
       }
       return i;
    }
    public final boolean setVisible(boolean p0,boolean p1){
       ee tH;
       boolean b = super.setVisible(p0, p1);
       if ((tH = this.H) != null && (b && !p1)) {
          if (p0) {
             tH.f0();
          }else {
             this.jumpToCurrentState();
          }
       }
       return b;
    }
}
