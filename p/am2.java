package p.am2;
import p.cg7;
import p.so6;
import p.nq6;
import java.lang.Object;
import android.content.Context;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import p.uw5;
import p.lj0;
import p.ce3;
import java.lang.Class;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import p.k07;
import java.lang.CharSequence;
import p.qo6;
import android.content.res.ColorStateList;
import java.lang.StackTraceElement;
import java.lang.System;
import java.util.HashMap;
import p.kg3;
import java.util.ArrayList;
import java.lang.Float;
import android.graphics.Color;
import p.yl2;
import java.util.Arrays;
import p.wa4;
import p.b17;

public final class am2 implements cg7, so6, nq6	// class@000fad from classes.dex
{
    public final int a;
    public int b;
    public static final int[] c;
    public static final int[] t;
    public static final int[] v;
    public static final int[] w;

    static {
       int[] ointArray = new int[0];
       am2.c = ointArray;
       int[] ointArray1 = new int[]{-16842910};
       am2.t = ointArray1;
       ointArray1 = new int[]{0x101009c};
       am2.v = ointArray1;
       ointArray = new int[]{0x10100a7};
       am2.w = ointArray;
    }
    public void am2(){
       this.a = 5;
       super();
    }
    public void am2(int p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public void am2(Context p0){
       super();
       TypedValue typedValue = new TypedValue();
       boolean b = true;
       float f = 0x3f800000;
       float fraction = (p0.getTheme().resolveAttribute(R.attr.pastePressedDimFraction, typedValue, b))? typedValue.getFraction(f, f): 0.30f;
       TypedValue typedValue1 = new TypedValue();
       float fraction1 = (p0.getTheme().resolveAttribute(R.attr.pasteDisabledDimFraction, typedValue1, b))? typedValue1.getFraction(f, f): 0x3f19999a;
       int i = uw5.k(p0, R.attr.pasteDimOverlayColor);
       this.a = lj0.h(i, (int)(fraction * 0x437f0000));
       this.b = lj0.h(i, (int)(fraction1 * 0x437f0000));
       return;
    }
    public static am2 d(ce3[] p0){
       int i = 0;
       if (p0.length <= 31) {
          int len = p0.length;
          int i1 = 0;
          while (i < len) {
             object oobject = p0[i];
             if (oobject.a()) {
                i1 = i1 | oobject.b();
             }
             i = i + 1;
          }
          return new am2(i1, 1);
       }else {
          Object[] objArray = new Object[]{p0[i].getClass().getName(),Integer.valueOf(p0.length)};
          throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries \(%d > 31\)", objArray));
       }
    }
    public qo6 a(k07 p0,CharSequence p1){
       return new qo6(this, p0, p1, 1);
    }
    public ColorStateList b(int p0){
       int[][] ointArray = new int[][4];
       int[] ointArray1 = new int[4];
       ointArray[0] = am2.t;
       ointArray1[0] = lj0.f(this.b, p0);
       ointArray[1] = am2.w;
       am2 ta = this.a;
       ointArray1[1] = lj0.f(ta, p0);
       ointArray[2] = am2.v;
       ointArray1[2] = lj0.f(ta, p0);
       ointArray[3] = am2.c;
       ointArray1[3] = p0;
       return new ColorStateList(ointArray, ointArray1);
    }
    public StackTraceElement[] c(StackTraceElement[] p0){
       Integer integer;
       int i8;
       am2 uoam2 = this;
       StackTraceElement[] stackTraceEl = p0;
       int i = 0;
       switch (uoam2.a){
           case 3:
             am2 b = uoam2.b;
             if (stackTraceEl.length > b) {
                int i1 = b / 2;
                int i2 = b - i1;
                StackTraceElement[] stackTraceEl1 = new StackTraceElement[b];
                System.arraycopy(stackTraceEl, i, stackTraceEl1, i, i2);
                System.arraycopy(stackTraceEl, (stackTraceEl.length - i1), stackTraceEl1, i2, i1);
                stackTraceEl = stackTraceEl1;
             }
             break;
           default:
             am2 b1 = uoam2.b;
             HashMap hashMap = new HashMap();
             StackTraceElement[] stackTraceEl2 = new StackTraceElement[stackTraceEl.length];
             int i3 = 0;
             int i4 = 0;
             int i5 = 1;
             while (i3 < stackTraceEl.length) {
                object oobject = stackTraceEl[i3];
                if ((integer = hashMap.get(oobject)) != null) {
                   int i6 = integer.intValue();
                   int i7 = i3 - i6;
                   if ((i8 = i3 + i7) <= stackTraceEl.length) {
                      i8 = 0;
                      while (true) {
                         if (i8 < i7) {
                            int i9 = i6 + i8;
                            int i10 = i3 + i8;
                            if (stackTraceEl[i9].equals(stackTraceEl[i10])) {
                               i8 = i8 + 1;
                               i = 0;
                            }
                         }else {
                            i = 1;
                         label_0060 :
                            if (i) {
                               i = i3 - integer.intValue();
                               if (i5 < b1) {
                                  System.arraycopy(stackTraceEl, i3, stackTraceEl2, i4, i);
                                  i4 = i4 + i;
                                  i5 = i5 + 1;
                               }
                               i = i - 1;
                               i = i + i3;
                            label_007d :
                               hashMap.put(oobject, Integer.valueOf(i3));
                               i3 = i + 1;
                               i = 0;
                            }
                         }
                      }
                   }
                   i = 0;
                   goto label_0060 ;
                }
                stackTraceEl2[i4] = stackTraceEl[i3];
                i4 = i4 + 1;
                i = i3;
                i5 = 1;
                goto label_007d ;
             }
             StackTraceElement[] stackTraceEl3 = new StackTraceElement[i4];
             System.arraycopy(stackTraceEl2, 0, stackTraceEl3, 0, i4);
             if (i4 < stackTraceEl.length) {
                stackTraceEl = stackTraceEl3;
             }
             return stackTraceEl;
       }
       return stackTraceEl;
    }
    public Object n(kg3 p0,float p1){
       int i9;
       int i10;
       int i11;
       am2 uoam21;
       int i12;
       int i13;
       float f2;
       float f3;
       float f4;
       am2 uoam2 = this;
       ArrayList uArrayList = new ArrayList();
       int i = 1;
       int i1 = 0;
       int i2 = (p0.j0() == i)? 1: 0;
       if (i2) {
          p0.b();
       }
       while (p0.J()) {
          uArrayList.add(Float.valueOf((float)p0.g0()));
       }
       int i3 = 4;
       int i4 = 2;
       int i5 = 3;
       if (uArrayList.size() == i3) {
          float f = 0x3f800000;
          if (!(f - uArrayList.get(i1).floatValue())) {
             uArrayList.set(i1, Float.valueOf(0));
             uArrayList.add(Float.valueOf(f));
             uArrayList.add(uArrayList.get(i));
             uArrayList.add(uArrayList.get(i4));
             uArrayList.add(uArrayList.get(i5));
             uoam2.b = i4;
          }
       }
       if (i2) {
          p0.x();
       }
       if (uoam2.b == -1) {
          uoam2.b = uArrayList.size() / i3;
       }
       am2 b = uoam2.b;
       float[] uofloatArray = new float[b];
       int[] ointArray = new int[b];
       int i6 = 0;
       int i7 = 0;
       int i8 = 0;
       while (true) {
          i9 = uoam2.b * 4;
          if (i6 < i9) {
             i9 = i6 / 4;
             double d = (double)uArrayList.get(i6).floatValue();
             if (i3 = i6 % 4) {
                if (i3 != i) {
                   if (i3 != i4) {
                      if (i3 == i5) {
                         d = d * 0x406fe00000000000;
                         i3 = (int)d;
                         ointArray[i9] = Color.argb(255, i7, i8, i3);
                      }
                   }else {
                      d = d * 0x406fe00000000000;
                      i8 = (int)d;
                   }
                }else {
                   d = d * 0x406fe00000000000;
                   i7 = (int)d;
                }
             }else if(i9 > 0){
                i3 = i9 - 1;
                float f1 = (float)d;
                if ((f1 - uofloatArray[i3]) >= 0) {
                   f1 = f1 + 0.01f;
                   uofloatArray[i9] = f1;
                }
             }
             uofloatArray[i9] = (float)d;
             i6 = i6 + 1;
             i = 1;
             i3 = 4;
          }else {
             break ;
          }
       }
       yl2 oyl2 = new yl2(uofloatArray, ointArray);
       if (uArrayList.size() > i9) {
          i3 = (uArrayList.size() - i9) / i4;
          float[] uofloatArray1 = new float[i3];
          float[] uofloatArray2 = new float[i3];
          i6 = 0;
          while (i9 < uArrayList.size()) {
             if (!(i7 = i9 % 2)) {
                uofloatArray1[i6] = uArrayList.get(i9).floatValue();
             }else {
                uofloatArray2[i6] = uArrayList.get(i9).floatValue();
                i6 = i6 + 1;
             }
             i9 = i9 + 1;
          }
          yl2 a = oyl2.a;
          if (!a.length) {
             a = uofloatArray1;
          }else if(!i3){
             i6 = a.length + i3;
             float[] uofloatArray3 = new float[i6];
             i8 = 0;
             i9 = 0;
             i10 = 0;
             i13 = 0;
             while (i8 < i6) {
                f2 = Float.NaN;
                i1 = (i10 < a.length)? a[i10]: Float.NaN;
                if (i13 < i3) {
                   i12 = uofloatArray1[i13];
                }
                if (!Float.isNaN(i12) && (i1 - i12) >= 0) {
                   if (!Float.isNaN(i1) && (i12 - i1) >= 0) {
                      uofloatArray3[i8] = i1;
                      i10 = i10 + 1;
                      i13 = i13 + 1;
                      i9 = i9 + 1;
                   }else {
                      uofloatArray3[i8] = i12;
                      i13 = i13 + 1;
                   }
                }else {
                   uofloatArray3[i8] = i1;
                   i10 = i10 + 1;
                }
                i8 = i8 + 1;
                i1 = 0;
             }
             a = (!i9)? uofloatArray3: Arrays.copyOf(uofloatArray3, (i6 - i9));
          }
          i1 = a.length;
          int[] ointArray1 = new int[i1];
          i7 = 0;
          while (true) {
             if (i7 < i1) {
                i8 = a[i7];
                i9 = Arrays.binarySearch(uofloatArray, i8);
                i10 = Arrays.binarySearch(uofloatArray1, i8);
                String str = "Unreachable code.";
                yl2 b1 = oyl2.b;
                if (i9 >= 0 && i10 <= 0) {
                   i4 = b1[i9];
                   if (i3 >= 2 && (i8 - uofloatArray1[0]) > 0) {
                      i9 = 1;
                      while (true) {
                         if (i9 >= i3) {
                            throw new IllegalArgumentException(str);
                         }
                         i10 = uofloatArray1[i9];
                         if ((v18 = i10 - i8) < 0) {
                            i11 = i3 - 1;
                            if (i9 != i11) {
                               i9 = i9 + 1;
                               i11 = this;
                            }
                         }
                         if (v18 <= 0) {
                            f4 = uofloatArray2[i9] * 0x437f0000;
                            i11 = (int)f4;
                         }else {
                            i11 = i9 - 1;
                            i13 = uofloatArray1[i11];
                            float f5 = i10 - i13;
                            f3 = i8 - i13;
                            f3 = f3 / f5;
                            i11 = uofloatArray2[i11];
                            float f6 = uofloatArray2[i9] - i11;
                            f6 = f6 * f3;
                            f6 = f6 + i11;
                            f6 = f6 * 0x437f0000;
                            i11 = (int)f6;
                         }
                         i11 = Color.argb(i11, Color.red(i4), Color.green(i4), Color.blue(i4));
                      }
                   }else {
                      f3 = uofloatArray2[0] * 0x437f0000;
                      i11 = (int)f3;
                      i11 = Color.argb(i11, Color.red(i4), Color.green(i4), Color.blue(i4));
                   }
                   ointArray1[i7] = i11;
                   uoam21 = b;
                   f4 = 0;
                }else if(i10 < 0){
                   i10 = i10 + 1;
                   i10 = - i10;
                }
                i11 = uofloatArray2[i10];
                if (b1.length >= 2 && (uofloatArray[0] - i8)) {
                   i9 = 1;
                   while (true) {
                      if (i9 >= b) {
                         throw new IllegalArgumentException(str);
                      }
                      i12 = uofloatArray[i9];
                      if ((i12 - i8) < 0) {
                         i10 = b - 1;
                         if (i9 != i10) {
                            i9 = i9 + 1;
                            i10 = 2;
                         }
                      }
                      i10 = i9 - 1;
                      i13 = uofloatArray[i10];
                      f2 = i12 - i13;
                      f3 = i8 - i13;
                      f3 = f3 / f2;
                      i9 = b1[i9];
                      i4 = b1[i10];
                      f4 = i11 * 0x437f0000;
                      uoam21 = b;
                      i2 = Color.argb((int)f4, b17.l(Color.red(i4), f3, Color.red(i9)), b17.l(Color.green(i4), f3, Color.green(i9)), b17.l(Color.blue(i4), f3, Color.blue(i9)));
                      f4 = 0;
                   }
                }else {
                   uoam21 = b;
                   i2 = b1[0];
                }
                ointArray1[i7] = i2;
                i7 = i7 + 1;
                b = uoam21;
                b1 = 2;
             }else {
                oyl2 = new yl2(a, ointArray1);
                break ;
             }
          }
       }
       return oyl2;
    }
}
