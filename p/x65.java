package p.x65;
import android.graphics.Bitmap;
import java.lang.Object;
import java.util.ArrayList;
import p.z65;
import p.f07;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Math;
import p.hj0;
import p.v65;
import java.util.List;
import p.y65;
import android.util.SparseBooleanArray;
import p.wh6;
import java.lang.AssertionError;

public final class x65	// class@002c1a from classes.dex
{
    public final Bitmap a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final int e;
    public final ArrayList f;

    public void x65(Bitmap p0){
       super();
       ArrayList uArrayList = new ArrayList();
       this.b = uArrayList;
       this.c = 16;
       this.d = 0x3100;
       this.e = -1;
       ArrayList uArrayList1 = new ArrayList();
       this.f = uArrayList1;
       if (p0 == null || p0.isRecycled()) {
          throw new IllegalArgumentException("Bitmap is not valid");
       }
       uArrayList1.add(z65.e);
       this.a = p0;
       uArrayList.add(f07.d);
       uArrayList.add(f07.e);
       uArrayList.add(f07.f);
       uArrayList.add(f07.g);
       uArrayList.add(f07.h);
       uArrayList.add(f07.i);
       return;
    }
    public final z65 a(){
       x65 a;
       x65 d;
       int i;
       double d1;
       v65[] ov65Array;
       z65 c;
       float f2;
       int i6;
       z65 d2;
       y65 e;
       int i9;
       int i10;
       float f5;
       float f6;
       Bitmap uBitmap;
       int i11;
       x65 ox65 = this;
       if ((a = ox65.a) == null) {
          throw new AssertionError();
       }
       if ((d = ox65.d) > null) {
          if ((i = a.getHeight() * a.getWidth()) > d) {
             d1 = Math.sqrt(((double)d / (double)i));
          }else {
          label_0035 :
             d1 = 0xbff0000000000000;
          }
       }else if((d = ox65.e) > null && (i11 = Math.max(a.getWidth(), a.getHeight())) > d){
          d1 = (double)d / (double)i11;
       }else {
          goto label_0035 ;
       }
       int i1 = 0;
       d = ((d1) <= 0)? a: Bitmap.createScaledBitmap(a, (int)Math.ceil(((double)a.getWidth() * d1)), (int)Math.ceil(((double)a.getHeight() * d1)), i1);
       int width = d.getWidth();
       int height = d.getHeight();
       int[] ointArray = new int[(width * height)];
       d.getPixels(ointArray, 0, width, 0, 0, width, height);
       x65 f = ox65.f;
       if (f.isEmpty()) {
          ov65Array = null;
       }else {
          v65[] ov65Array1 = new v65[f.size()];
          ov65Array = f.toArray(ov65Array1);
       }
       hj0 ohj0 = new hj0(ointArray, ox65.c, ov65Array);
       if (d != a) {
          d.recycle();
       }
       x65 b = ox65.b;
       z65 oz65 = new z65(ohj0.c, b);
       int i2 = b.size();
       i = 0;
       while (true) {
          c = oz65.c;
          if (i < i2) {
             f07 uof07 = b.get(i);
             f07 c1 = uof07.c;
             int len = c1.length;
             int i3 = 0;
             int i4 = 0;
             float f1 = 0;
             while (i4 < len) {
                height = c1[i4];
                if ((i3 - height) > 0) {
                   f1 = f1 + height;
                }
                i4 = i4 + 1;
             }
             if (i3 - f1) {
                len = c1.length;
                i4 = 0;
                while (i4 < len) {
                   height = c1[i4];
                   if ((i3 - height) > 0) {
                      f2 = height / f1;
                      c1[i4] = f2;
                   }
                   i4 = i4 + 1;
                }
             }
             z65 a1 = oz65.a;
             len = a1.size();
             i4 = 0;
             y65 oy65 = null;
             f2 = 0;
             while (true) {
                int i5 = 1;
                if (i4 < len) {
                   Object obj = a1.get(i4);
                   float[] uofloatArray = obj.b();
                   i6 = uofloatArray[i5];
                   f07 a2 = uof07.a;
                   f07 b1 = uof07.b;
                   if ((a2[i1] - i6) >= 0 && (i6 - a2[2]) <= 0) {
                      int i7 = uofloatArray[2];
                      if ((b1[i1] - i7) >= 0 && ((i7 - b1[2]) <= 0 && !c.get(obj.d))) {
                         i1 = 1;
                      label_0116 :
                         if (i1) {
                            float[] uofloatArray1 = obj.b();
                            if ((d2 = oz65.d) != null) {
                               e = d2.e;
                               i6 = i2;
                            }else {
                               i6 = i2;
                               e = 1;
                            }
                            f07 c2 = uof07.c;
                            int i8 = c2[0];
                            float f3 = 0x3f800000;
                            i9 = 0;
                            if ((i9 - i8) > 0) {
                               i10 = 1;
                               float f4 = uofloatArray1[i10] - a2[i10];
                               f5 = f3 - Math.abs(f4);
                               f5 = f5 * i8;
                            }else {
                               i10 = 1;
                               f5 = 0;
                            }
                            i8 = c2[i10];
                            if ((i9 - i8) > 0) {
                               f6 = uofloatArray1[2] - b1[i10];
                               f3 = f3 - Math.abs(f6);
                               f3 = f3 * i8;
                            }else {
                               f3 = 0;
                            }
                            i2 = c2[2];
                            if ((i9 - i2) > 0) {
                               f6 = (float)obj.e / (float)e;
                               f6 = f6 * i2;
                            }else {
                               f6 = 0;
                            }
                            f5 = f5 + f3;
                            f5 = f5 + f6;
                            if (oy65 == null || (f2 - f5) > 0) {
                               oy65 = obj;
                               f2 = f5;
                            }
                         }else {
                            i6 = i2;
                            i9 = 0;
                         }
                         i4 = i4 + 1;
                         i2 = i6;
                         i1 = 0;
                         b1 = 0;
                      }
                   }
                   f6 = 0;
                   goto label_0116 ;
                }else {
                   break ;
                }
             }
             i6 = i2;
             if (oy65 != null) {
                c.append(oy65.d, true);
             }
             oz65.b.put(uof07, oy65);
             i = i + 1;
             i2 = i6;
             i1 = 0;
          }else {
             break ;
          }
       }
       c.clear();
       return oz65;
    }
}
