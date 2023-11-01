package p.jj0;
import java.lang.ThreadLocal;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.content.res.Resources$Theme;
import android.content.res.ColorStateList;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;
import java.lang.String;
import java.lang.Object;
import p.ty0;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.os.Build$VERSION;
import android.util.StateSet;
import android.graphics.Color;
import p.b17;
import p.kb0;
import p.kl7;
import java.lang.Math;
import p.ye7;
import java.lang.System;
import java.lang.Class;
import java.lang.reflect.Array;
import java.lang.StringBuilder;

public abstract class jj0	// class@001ae6 from classes.dex
{
    public static final ThreadLocal a;

    static {
       jj0.a = new ThreadLocal();
    }
    public static ColorStateList a(Resources p0,XmlResourceParser p1,Resources$Theme p2){
       int i;
       AttributeSet uAttributeSe = Xml.asAttributeSet(p1);
       do {
       } while ((i = p1.next()) != 2 && i != 1);
       if (i == 2) {
          return jj0.b(p0, p1, uAttributeSe, p2);
       }
       throw new XmlPullParserException("No start tag found");
    }
    public static ColorStateList b(Resources p0,XmlResourceParser p1,AttributeSet p2,Resources$Theme p3){
       int i4;
       TypedValue typedValue;
       TypedValue typedValue1;
       float floatx;
       int[] ointArray3;
       int i9;
       int i10;
       int i11;
       float f5;
       float f8;
       int i15;
       float f13;
       kb0 okb03;
       kb0 okb04;
       float f14;
       float f15;
       float f16;
       Resources resources = p0;
       AttributeSet uAttributeSe = p2;
       Resources$Theme theme = p3;
       String name = p1.getName();
       if (!name.equals("selector")) {
          throw new XmlPullParserException(p1.getPositionDescription()+": invalid color state list tag "+name);
       }
       int i = 1;
       int i1 = p1.getDepth() + i;
       int[][] ointArray = new int[][20];
       int[] ointArray1 = new int[20];
       int i2 = 0;
       int i3 = 0;
       while ((i4 = p1.next()) != i) {
          int depth = p1.getDepth();
          int i5 = 3;
          if (depth < i1 && i4 == i5) {
             break ;
          }else if(i4 == 2 && (depth <= i1 && p1.getName().equals("item"))){
             int[] f = ty0.f;
             TypedArray typedArray = (!theme)? resources.obtainAttributes(uAttributeSe, f): theme.obtainStyledAttributes(uAttributeSe, f, i2, i2);
             depth = -1;
             int resourceId = typedArray.getResourceId(i2, depth);
             int i6 = 31;
             int i7 = -65281;
             if (resourceId != depth) {
                ThreadLocal a = jj0.a;
                if ((typedValue = a.get()) == null) {
                   typedValue1 = new TypedValue();
                   a.set(typedValue1);
                }else {
                   typedValue1 = typedValue;
                }
                resources.getValue(resourceId, typedValue1, i);
                TypedValue type = ((type = typedValue1.type) >= 28 && type <= i6)? 1: 0;
                if (!type) {
                   try{
                      depth = jj0.a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                   }catch(java.lang.Exception e0){
                      depth = typedArray.getColor(i2, i7);
                   }
                }else {
                label_0092 :
                   depth = typedArray.getColor(i2, i7);
                }
             }else {
                goto label_0092 ;
             }
             float f1 = 0x3f800000;
             if (typedArray.hasValue(i)) {
                floatx = typedArray.getFloat(i, f1);
             }else if(typedArray.hasValue(i5)){
                floatx = typedArray.getFloat(i5, f1);
             }else {
                floatx = 0x3f800000;
             }
             i7 = 4;
             float f2 = 0xbf800000;
             if (Build$VERSION.SDK_INT >= i6) {
                int i8 = 2;
                if (typedArray.hasValue(i8)) {
                   f2 = typedArray.getFloat(i8, f2);
                label_00c7 :
                   typedArray.recycle();
                   i4 = p2.getAttributeCount();
                   int[] ointArray2 = new int[i4];
                   i6 = 0;
                   i7 = 0;
                   while (i6 < i4) {
                      if ((resourceId = uAttributeSe.getAttributeNameResource(i6)) != 0x10101a5 && (resourceId != 0x101031f && (resourceId != 0x7f030035 && resourceId != 0x7f030330))) {
                         i2 = i7 + 1;
                         if (!uAttributeSe.getAttributeBooleanValue(i6, false)) {
                            resourceId = - resourceId;
                         }
                         ointArray2[i7] = resourceId;
                         i7 = i2;
                      }
                      i6 = i6 + 1;
                      f1 = 0x3f800000;
                   }
                   ointArray3 = StateSet.trimStateSet(ointArray2, i7);
                   i2 = 0x42c80000;
                   typedArray = 0;
                   ointArray2 = ((typedArray - f2) >= 0 && (f2 - i2) <= 0)? 1: 0;
                   if (!(0x3f800000 - floatx) && !ointArray2) {
                      i9 = i1;
                      typedValue = 1;
                   }else {
                      f1 = (float)Color.alpha(depth) * floatx;
                      f1 = f1 + 0x3f000000;
                      i5 = (int)f1;
                      i5 = b17.f(i5, 0, 255);
                      if (ointArray2) {
                         kb0 okb0 = kb0.a(depth);
                         kl7 k = kl7.k;
                         kb0 b = okb0.b;
                         if (((double)b - 0x3ff0000000000000) >= 0 && (((double)Math.round(f2)) > 0 && (0x4059000000000000 - (double)Math.round(f2)) < 0)) {
                            okb0 = okb0.a;
                            float f3 = ((okb0 - typedArray) < 0)? 0: Math.min(360.00f, okb0);
                            kb0 okb01 = b;
                            kb0 okb02 = null;
                            int i12 = 1;
                            float f4 = 0;
                            while (true) {
                               if (((f5 = f4 - b)) >= 0) {
                                  f5 = 0x447a0000;
                                  int i13 = 0x447a0000;
                                  float f6 = 0;
                                  float f7 = 100.00f;
                                  int i14 = 0;
                                  while (true) {
                                     if (((f8 = f6 - f7)) > 0) {
                                        f8 = f7 - f6;
                                        f8 = f8 / 2.00f;
                                        float f9 = f8 + f6;
                                        i10 = kb0.b(f9, okb01, f3).c(kl7.k);
                                        i15 = 1;
                                        object oobject = ye7.i[i15];
                                        float f10 = ye7.I(Color.red(i10)) * oobject[0];
                                        float f11 = ye7.I(Color.green(i10)) * oobject[i15];
                                        f11 = f11 + f10;
                                        float f12 = ye7.I(Color.blue(i10)) * oobject[2];
                                        f12 = f12 + f11;
                                        f10 = f12 / 100.00f;
                                        if ((f10 - 0x3c111aa7) <= 0) {
                                           f10 = f10 * 0x4461d2f7;
                                           i9 = i1;
                                        }else {
                                           i9 = i1;
                                           f13 = (float)Math.cbrt((double)f10) * 116.00f;
                                           f10 = f13 - 16.00f;
                                        }
                                        f13 = f2 - f10;
                                        f13 = Math.abs(f13);
                                        if ((f13 - 0x3e4ccccd) < 0) {
                                           okb03 = kb0.a(i10);
                                           f12 = f13;
                                           okb04 = kb0.b(okb03.c, okb03.b, f3);
                                           f14 = f9;
                                           f9 = okb03.d - okb04.d;
                                           f15 = f3;
                                           f16 = okb03.e - okb04.e;
                                           f3 = okb03.f - okb04.f;
                                           f9 = f9 * f9;
                                           f16 = f16 * f16;
                                           f16 = f16 + f9;
                                           f3 = f3 * f3;
                                           f3 = f3 + f16;
                                           double d = Math.pow(Math.sqrt((double)f3), 0x3fe428f5c28f5c29) * 0x3ff68f5c28f5c28f;
                                           f13 = (float)d;
                                           if ((f13 - 0x3f800000) <= 0) {
                                              i14 = okb03;
                                              i13 = f13;
                                              f5 = f12;
                                           }
                                        }else {
                                           f14 = f9;
                                           f15 = f3;
                                           f16 = 0x3f800000;
                                        }
                                        okb03 = 0;
                                        if (!(okb03 - f5) && !(okb03 - i13)) {
                                        label_0285 :
                                           okb04 = i14;
                                           if (i12) {
                                              if (okb04 != null) {
                                                 depth = okb04.c(k);
                                              }else {
                                                 f13 = b - f4;
                                                 f13 = f13 / 2.00f;
                                                 okb01 = f13 + f4;
                                                 i1 = i9;
                                                 f3 = f15;
                                                 i12 = 0;
                                              }
                                           }else if(okb04 == null){
                                              b = okb01;
                                           }else {
                                              okb02 = okb04;
                                              f4 = okb01;
                                           }
                                           f13 = b - f4;
                                           f13 = f13 / 2.00f;
                                           okb01 = f13 + f4;
                                           i1 = i9;
                                           f3 = f15;
                                           f9 = 0;
                                           continue ;
                                        }else if((f10 - f2) < 0){
                                           f6 = f14;
                                        }else {
                                           f7 = f14;
                                        }
                                        i1 = i9;
                                        f3 = f15;
                                        f9 = 0;
                                     }else {
                                        i9 = i1;
                                        f15 = f3;
                                        int i16 = 0x42c80000;
                                        goto label_0285 ;
                                     }
                                  }
                               }else {
                                  i9 = i1;
                                  if (okb02 == null) {
                                     depth = ye7.D(f2);
                                  }else {
                                     depth = okb02.c(k);
                                  }
                               }
                            }
                         }else {
                            i9 = i1;
                            depth = ye7.D(f2);
                         }
                      }else {
                         i9 = i1;
                         i15 = 1;
                      }
                      i10 = 0xffffff & depth;
                      i11 = i5 << 24;
                      depth = i10 | i11;
                   }
                   i10 = i3 + 1;
                   i1 = 8;
                   if (i10 > ointArray1.length) {
                      i11 = (i3 <= 4)? 8: i3 * 2;
                      int[] ointArray4 = new int[i11];
                      System.arraycopy(ointArray1, 0, ointArray4, 0, i3);
                      ointArray1 = ointArray4;
                   }
                   ointArray1[i3] = depth;
                   if (i10 > ointArray.length) {
                      Class componentTyp = ointArray.getClass().getComponentType();
                      if (i3 > 4) {
                         i1 = i3 * 2;
                      }
                      Object[] objArray = Array.newInstance(componentTyp, i1);
                      System.arraycopy(ointArray, 0, objArray, 0, i3);
                      ointArray = objArray;
                   }
                   ointArray[i3] = ointArray3;
                   resources = p0;
                   theme = p3;
                   i3 = i10;
                   i1 = i9;
                   i = 1;
                   i2 = 0;
                   uAttributeSe = p2;
                }
             }
             f2 = typedArray.getFloat(i7, f2);
             goto label_00c7 ;
          }else {
             resources = p0;
             uAttributeSe = p2;
             theme = p3;
             i1 = i1;
             i = 1;
             i2 = 0;
          }
       }
       ointArray3 = new int[i3];
       int[][] ointArray5 = new int[][i3];
       System.arraycopy(ointArray1, 0, ointArray3, 0, i3);
       System.arraycopy(ointArray, 0, ointArray5, 0, i3);
       return new ColorStateList(ointArray5, ointArray3);
    }
}
