package p.hj0;
import p.dv0;
import p.v65;
import java.lang.Object;
import android.graphics.Color;
import p.lj0;
import java.util.ArrayList;
import p.y65;
import java.util.PriorityQueue;
import java.util.Comparator;
import p.gj0;
import java.util.Arrays;
import java.lang.Math;
import java.lang.IllegalStateException;
import java.lang.String;
import java.util.Iterator;
import java.lang.Class;

public final class hj0	// class@00185f from classes.dex
{
    public final int[] a;
    public final int[] b;
    public final ArrayList c;
    public final v65[] d;
    public final float[] e;
    public static final dv0 f;

    static {
       hj0.f = new dv0(1);
    }
    public void hj0(int[] p0,int p1,v65[] p2){
       int i5;
       int i6;
       int i7;
       int i8;
       int i9;
       int i10;
       hj0 e;
       gj0 ogj0;
       int i11;
       int i12;
       int i13;
       int i14;
       hj0 ohj0 = this;
       int i = p0;
       int i1 = p1;
       super();
       float[] uofloatArray = new float[3];
       ohj0.e = uofloatArray;
       ohj0.d = p2;
       int i2 = 0x8000;
       int[] ointArray = new int[i2];
       ohj0.b = ointArray;
       int i3 = 0;
       int i4 = 0;
       while (true) {
          i5 = 8;
          i6 = 5;
          i7 = 1;
          if (i4 < i.length) {
             i8 = i[i4];
             i5 = hj0.b(Color.red(i8), i5, i6) << 10;
             i6 = hj0.b(Color.green(i8), i5, i6) << 5;
             i5 = i5 | i6;
             i8 = hj0.b(Color.blue(i8), i5, i6) | i5;
             i[i4] = i8;
             i5 = ointArray[i8] + i7;
             ointArray[i8] = i5;
             i4 = i4 + 1;
          }else {
             break ;
          }
       }
       i = 0;
       i4 = 0;
       while (i < i2) {
          if (ointArray[i] > 0) {
             i8 = i >> 10;
             i8 = i8 & 0x1f;
             i9 = i >> 5;
             i9 = i9 & 0x1f;
             i10 = i & 0x1f;
             i8 = Color.rgb(hj0.b(i8, i6, i5), hj0.b(i9, i6, i5), hj0.b(i10, i6, i5));
             i9 = Color.red(i8);
             i10 = Color.green(i8);
             e = ohj0.e;
             lj0.a(i9, i10, Color.blue(i8), e);
             if (ohj0.c(e)) {
                ointArray[i] = i3;
             }
          }
          if (ointArray[i] > 0) {
             i4 = i4 + 1;
          }
          i = i + 1;
       }
       int[] ointArray1 = new int[i4];
       ohj0.a = ointArray1;
       i8 = 0;
       i9 = 0;
       while (i8 < i2) {
          if (ointArray[i8] > 0) {
             i10 = i9 + 1;
             ointArray1[i9] = i8;
             i9 = i10;
          }
          i8 = i8 + 1;
       }
       if (i4 <= i1) {
          ohj0.c = new ArrayList();
          for (; i3 < i4; i3 = i3 + 1) {
             i1 = ointArray1[i3];
             i7 = i1 >> 10;
             i7 = i7 & 0x1f;
             i9 = i1 >> 5;
             i9 = i9 & 0x1f;
             i10 = i1 & 0x1f;
             ohj0.c.add(new y65(Color.rgb(hj0.b(i7, i6, i5), hj0.b(i9, i6, i5), hj0.b(i10, i6, i5)), ointArray[i1]));
          }
       }else {
          PriorityQueue priorityQueu = new PriorityQueue(i1, hj0.f);
          priorityQueu.offer(new gj0(ohj0, i3, (ohj0.a.length - 1)));
          while (true) {
             if (priorityQueu.size() < i1 && (ogj0 = priorityQueu.poll()) != null) {
                gj0 b = ogj0.b;
                i8 = b + 1;
                gj0 a = ogj0.a;
                i8 = ((i8 = i8 - a) > i7)? 1: 0;
                if (i8) {
                   i8 = b + 1;
                   i8 = ((i8 = i8 - a) > i7)? 1: 0;
                   if (i8) {
                      i8 = ogj0.e - ogj0.d;
                      i10 = ogj0.g - ogj0.f;
                      i11 = ogj0.i - ogj0.h;
                      if (i8 >= i10 && i8 >= i11) {
                         i8 = -3;
                      }else if(i10 >= i8 && i10 >= i11){
                         i8 = -2;
                      }else {
                         i8 = -1;
                      }
                      gj0 j = ogj0.j;
                      e = j.a;
                      hj0.a(i8, a, b, e);
                      i12 = ogj0.b + i7;
                      Arrays.sort(e, a, i12);
                      hj0.a(i8, a, ogj0.b, e);
                      i12 = ogj0.c / 2;
                      gj0 ogj01 = a;
                      i13 = 0;
                      while (true) {
                         gj0 b1 = ogj0.b;
                         if (ogj01 <= b1) {
                            if ((i13 = i13 + j.b[e[ogj01]]) >= i12) {
                               i14 = b1 - 1;
                               a = Math.min(i14, ogj01);
                               break ;
                            }else {
                               ogj01 = ogj01 + 1;
                               i3 = 0;
                            }
                         }else {
                            break ;
                         }
                      }
                      i3 = a + 1;
                      ogj0.b = a;
                      ogj0.a();
                      priorityQueu.offer(new gj0(j, i3, ogj0.b));
                      priorityQueu.offer(ogj0);
                      i3 = 0;
                   }else {
                      throw new IllegalStateException("Can not split a box with only 1 color");
                   }
                }else {
                label_0181 :
                   ArrayList uArrayList = new ArrayList(priorityQueu.size());
                   Iterator iterator = priorityQueu.iterator();
                   while (iterator.hasNext()) {
                      ogj0 = iterator.next();
                      b = ogj0.j;
                      hj0 a1 = b.a;
                      i8 = 0;
                      i7 = 0;
                      i9 = 0;
                      i10 = 0;
                      for (gj0 a2 = ogj0.a; a2 <= ogj0.b; a2 = a2 + 1) {
                         i11 = a1[a2];
                         i13 = b.b[i11];
                         i7 = i7 + i13;
                         i14 = i11 >> 10;
                         i14 = i14 & 0x1f;
                         i14 = i14 * i13;
                         i8 = i8 + i14;
                         i14 = i11 >> 5;
                         i14 = i14 & 0x1f;
                         i14 = i14 * i13;
                         i9 = i9 + i14;
                         i11 = i11 & 0x1f;
                         i13 = i13 * i11;
                         i10 = i10 + i13;
                      }
                      float f = (float)i7;
                      float f1 = (float)i8 / f;
                      float f2 = (float)i9 / f;
                      float f3 = (float)i10 / f;
                      i12 = Math.round(f3);
                      y65 oy65 = new y65(Color.rgb(hj0.b(Math.round(f1), i6, i5), hj0.b(Math.round(f2), i6, i5), hj0.b(i12, i6, i5)), i7);
                      if (!ohj0.c(oy65.b())) {
                         uArrayList.add(oy65);
                      }else {
                         continue ;
                      }
                   }
                   ohj0.c = uArrayList;
                }
             }else {
                goto label_0181 ;
             }
          }
       }
       return;
    }
    public static void a(int p0,int p1,int p2,int[] p3){
       int i;
       int i1;
       if (p0 != -2) {
          if (p0 == -1) {
             for (; p1 <= p2; p3[p1] = p0) {
                p0 = p3[p1];
                i = p0 & 0x1f;
                i = i << 10;
                i1 = p0 >> 5;
                i1 = i1 & 0x1f;
                i1 = i1 << 5;
                i = i | i1;
                p0 = p0 >> 10;
                p0 = p0 & 0x1f;
                p0 = p0 | i;
             }
          }
       }else {
          for (p1++; p1 <= p2; p1++) {
             p0 = p3[p1];
             i = p0 >> 5;
             i = i & 0x1f;
             i = i << 10;
             i1 = p0 >> 10;
             i1 = i1 & 0x1f;
             i1 = i1 << 5;
             i = i | i1;
             p0 = p0 & 0x1f;
             p0 = p0 | i;
             p3[p1] = p0;
          }
       }
       return;
    }
    public static int b(int p0,int p1,int p2){
       p0 = (p2 > p1)? p0 << (p2 - p1): p0 >> (p1 - p2);
       return (p0 & ((1 << p2) - 1));
    }
    public final boolean c(float[] p0){
       hj0 td;
       if ((td = this.d) != null && td.length > 0) {
          int len = td.length;
          int i = 0;
          while (i < len) {
             td[i].getClass();
             int i1 = p0[2];
             int i2 = ((0x3f733333 - i1) >= 0)? 1: 0;
             if (!i2) {
                i1 = ((i1 - 0x3d4ccccd) <= 0)? 1: 0;
                if (!i1) {
                   i1 = p0[0];
                   i1 = ((0x41200000 - i1) >= 0 && ((i1 - 0x42140000) <= 0 && (p0[1] - 0x3f51eb85) <= 0))? 1: 0;
                   if (!i1) {
                      i1 = 1;
                   label_004c :
                      if (!i1) {
                         return 1;
                      }
                   }
                }
             }
             i1 = 0;
             goto label_004c ;
             i = i + 1;
          }
       }
       return 0;
    }
}
