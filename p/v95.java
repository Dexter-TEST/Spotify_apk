package p.v95;
import java.lang.Object;
import p.vv7;
import android.graphics.Path;
import java.lang.Math;

public final class v95	// class@0029ab from classes.dex
{
    public char a;
    public final float[] b;

    public void v95(char p0,float[] p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void v95(v95 p0){
       super();
       this.a = p0.a;
       p0 = p0.b;
       this.b = vv7.h(p0, p0.length);
    }
    public static void a(Path p0,float p1,float p2,float p3,float p4,float p5,float p6,float p7,boolean p8,boolean p9){
       float f3;
       double d19;
       float f = p1;
       float f1 = p3;
       float f2 = p5;
       int i = p9;
       double d = Math.toRadians((double)p7);
       double d1 = Math.cos(d);
       double d2 = Math.sin(d);
       double d3 = (double)f;
       double d4 = (double)p2;
       double d5 = d3;
       d3 = (double)f2;
       double d6 = ((d4 * d2) + (d3 * d1)) / d3;
       double d7 = d;
       d = (double)p6;
       double d8 = ((d4 * d1) + ((double)(- f) * d2)) / d;
       double d9 = d4;
       double d10 = (double)p4;
       double d11 = ((d10 * d2) + ((double)f1 * d1)) / d3;
       d10 = ((d10 * d1) + ((double)(- f1) * d2)) / d;
       double d12 = d6 - d11;
       double d13 = d8 - d10;
       double d14 = (d6 + d11) / 2.00f;
       double d15 = (d8 + d10) / 2.00f;
       double d16 = (d13 * d13) + (d12 * d12);
       int i1 = 0;
       if (!(i1 - d16)) {
          return;
       }
       double d17 = (0x3ff0000000000000 / d16) - 0x3fd0000000000000;
       if ((d17 - i1) < 0) {
          f = (float)(Math.sqrt(d16) / 0x3ffffff583a53b8e);
          f3 = f2 * f;
          float f4 = p6 * f;
          v95.a(p0, p1, p2, p3, p4, f3, f4, p7, p8, p9);
          return;
       }else {
          d16 = Math.sqrt(d17);
          d12 = d12 * d16;
          d16 = d16 * d13;
          if (p8 == i) {
             d14 = d14 - d16;
             d15 = d15 + d12;
          }else {
             d14 = d14 + d16;
             d15 = d15 - d12;
          }
          d8 = d2;
          d12 = Math.atan2((d8 - d15), (d6 - d14));
          double d18 = Math.atan2((d10 - d15), (d11 - d14)) - d12;
          int i2 = 0;
          int i3 = ((v3 = i1 - d18) >= 0)? 1: 0;
          if (i != i3) {
             d19 = 0x401921fb54442d18;
             d18 = (f1 > 0)? d18 - d19: d18 + d19;
          }
          d14 = d14 * d3;
          d15 = d15 * d;
          d19 = (d14 * d1) - (d15 * d8);
          d15 = (d15 * d1) + (d14 * d8);
          int i4 = (int)Math.ceil(Math.abs(((d18 * 4.00f) / 0x400921fb54442d18)));
          d2 = Math.cos(d7);
          d6 = Math.sin(d7);
          d7 = Math.cos(d12);
          d8 = Math.sin(d12);
          d1 = - d3;
          d11 = d1 * d2;
          d14 = d * d6;
          d13 = (d11 * d8) - (d14 * d7);
          d1 = d1 * d6;
          d = d * d2;
          d7 = (d7 * d) + (d8 * d1);
          d18 = d18 / (double)i4;
          d12 = d12;
          while (i2 < i4) {
             d8 = d12 + d18;
             double d20 = Math.sin(d8);
             d16 = Math.cos(d8);
             d17 = d3 * d2;
             d17 = d17 * d16;
             d17 = d17 + d19;
             double d21 = d14 * d20;
             d18 = d17 - d21;
             d17 = d3 * d6;
             d17 = d17 * d16;
             d17 = d17 + d15;
             d21 = d * d20;
             d19 = d21 + d17;
             d17 = d11 * d20;
             d21 = d14 * d16;
             d17 = d17 - d21;
             d20 = d20 * d1;
             d16 = d16 * d;
             d20 = d16 + d20;
             d12 = d8 - d12;
             d16 = d12 / 2.00f;
             d16 = Math.tan(d16);
             double d22 = d16 * 3.00f;
             d22 = d22 * d16;
             d22 = d22 + 4.00f;
             d22 = Math.sqrt(d22) - 0x3ff0000000000000;
             d22 = d22 * Math.sin(d12);
             d22 = d22 / 3.00f;
             d13 = d13 * d22;
             d12 = d13 + d5;
             d7 = d7 * d22;
             d5 = d7 + d9;
             d7 = d22 * d17;
             d1 = d18 - d7;
             d22 = d22 * d20;
             d7 = d19 - d22;
             p0.rLineTo(0, 0);
             f3 = (float)d12;
             float f5 = (float)d1;
             p0.cubicTo(f3, (float)d5, f5, (float)d7, (float)d18, (float)d19);
             i2 = i2 + 1;
             i4 = i4;
             d19 = d19;
          }
          return;
       }
    }
    public static void b(v95[] p0,Path p1){
       int i11;
       int i14;
       int i15;
       v95 ov95;
       object oobject1;
       int i16;
       float f1;
       float f2;
       float f3;
       float f4;
       float f5;
       float f6;
       int i17;
       v95 ov951;
       float f7;
       float f8;
       float f9;
       int i19;
       int i21;
       boolean i22;
       int i = p0;
       Path path = p1;
       float[] uofloatArray = new float[6];
       int i1 = 109;
       int i2 = 0;
       int i3 = 109;
       boolean i4 = 0;
       while (i4 < i.length) {
          object oobject = i[i4];
          v95 a = oobject.a;
          int i5 = uofloatArray[i2];
          int i6 = uofloatArray[1];
          int i7 = uofloatArray[2];
          int i8 = uofloatArray[3];
          int i9 = uofloatArray[4];
          int i10 = uofloatArray[5];
          switch (a){
              case 'A':
              case 'a':
                i11 = 7;
                break;
              case 'C':
              case 'c':
                i11 = 6;
                break;
              case 'H':
              case 'V':
              case 'h':
              case 'v':
                i11 = 1;
                break;
              case 'Q':
              case 'q':
              case 's':
              case 'S':
                i11 = 4;
                break;
              case 'Z':
              case 'z':
                p1.close();
                path.moveTo(i9, i10);
                i5 = i9;
                i7 = i5;
                i6 = i10;
                i8 = i6;
             label_0045 :
                i11 = 2;
                break;
              default:
                goto label_0045 ;
          }
          int i12 = i9;
          int i13 = i10;
          i10 = i5;
          i9 = i6;
          i6 = 0;
          while (true) {
             v95 b = oobject.b;
             if (i6 < b.length) {
                if (a != 65) {
                   if (a != 67) {
                      if (a != 72) {
                         if (a != 81) {
                            if (a != 86) {
                               if (a != 97) {
                                  if (a != 99) {
                                     if (a != 104) {
                                        if (a != 113) {
                                           if (a != 118) {
                                              if (a != 76) {
                                                 if (a != 77) {
                                                    float f = 2.00f;
                                                    if (a != 83) {
                                                       i14 = 116;
                                                       if (a != 84) {
                                                          if (a != 108) {
                                                             if (a != i1) {
                                                                if (a != 115) {
                                                                   if (a == i14) {
                                                                      if (i3 != 113 && (i3 != i14 && (i3 != 81 && i3 != 84))) {
                                                                         f2 = 0;
                                                                         f1 = 0;
                                                                      }else {
                                                                         f1 = i10 - i7;
                                                                         f2 = i9 - i8;
                                                                      }
                                                                      i7 = i6 + 0;
                                                                      i14 = i6 + 1;
                                                                      path.rQuadTo(f1, f2, b[i7], b[i14]);
                                                                      f1 = f1 + i10;
                                                                      f2 = f2 + i9;
                                                                      f3 = i10 + b[i7];
                                                                      f4 = i9 + b[i14];
                                                                      i8 = f2;
                                                                      i7 = f1;
                                                                   }
                                                                   i15 = i6;
                                                                }else if(i3 != 99 && (i3 != 115 && (i3 != 67 && i3 != 83))){
                                                                   f5 = 0;
                                                                   f6 = 0;
                                                                }else {
                                                                   f2 = i10 - i7;
                                                                   f5 = i9 - i8;
                                                                   f6 = f2;
                                                                }
                                                                i14 = i6 + 0;
                                                                i1 = i6 + 1;
                                                                i17 = i6 + 2;
                                                                int i18 = i6 + 3;
                                                                ov951 = b;
                                                                i15 = i6;
                                                                i8 = i9;
                                                                i = i10;
                                                                p1.rCubicTo(f6, f5, b[i14], b[i1], b[i17], b[i18]);
                                                                f2 = ov951[i14] + i;
                                                                f7 = ov951[i1] + i8;
                                                                f3 = i + ov951[i17];
                                                                i = ov951[i18];
                                                             label_0283 :
                                                                f8 = i8 + i;
                                                                f5 = f2;
                                                                i8 = f7;
                                                                f7 = f3;
                                                             label_0288 :
                                                                f3 = f7;
                                                                f4 = f8;
                                                             }else {
                                                                ov951 = b;
                                                                i15 = i6;
                                                                i6 = i15 + 0;
                                                                i3 = ov951[i6];
                                                                f3 = i10 + i3;
                                                                i6 = i15 + 1;
                                                                i = ov951[i6];
                                                                f4 = i9 + i;
                                                                if (i15 > 0) {
                                                                   path.rLineTo(i3, i);
                                                                }else {
                                                                   path.rMoveTo(i3, i);
                                                                   i13 = f4;
                                                                   i12 = f3;
                                                                }
                                                             }
                                                          }else {
                                                             ov951 = b;
                                                             i15 = i6;
                                                             i2 = i9;
                                                             i6 = i15 + 0;
                                                             i5 = i15 + 1;
                                                             path.rLineTo(ov951[i6], ov951[i5]);
                                                             f3 = i10 + ov951[i6];
                                                             i = ov951[i5];
                                                          }
                                                       }else {
                                                          ov951 = b;
                                                          i15 = i6;
                                                          i2 = i9;
                                                          i = i10;
                                                          if (i3 != 113 && (i3 != i14 && (i3 != 81 && i3 != 84))) {
                                                             i10 = i;
                                                             i9 = i2;
                                                          }else {
                                                             f3 = i * f;
                                                             f3 = f3 - i7;
                                                             f4 = i2 * f;
                                                             f4 = f4 - i8;
                                                          }
                                                          i6 = i15 + 0;
                                                          i3 = i15 + 1;
                                                          path.quadTo(f3, f4, ov951[i6], ov951[i3]);
                                                          i8 = f4;
                                                          i7 = f3;
                                                          ov95 = a;
                                                          oobject1 = oobject;
                                                          i16 = i4;
                                                          f3 = ov951[i6];
                                                          f4 = ov951[i3];
                                                       }
                                                    }else {
                                                       ov951 = b;
                                                       i15 = i6;
                                                       i2 = i9;
                                                       i = i10;
                                                       if (i3 != 99 && (i3 != 115 && (i3 != 67 && i3 != 83))) {
                                                          i5 = i;
                                                          i6 = i2;
                                                       }else {
                                                          f3 = i * f;
                                                          f3 = f3 - i7;
                                                          f4 = i2 * f;
                                                          f4 = f4 - i8;
                                                          f8 = f4;
                                                          f7 = f3;
                                                       }
                                                       i = i15 + 0;
                                                       i14 = i15 + 1;
                                                       i1 = i15 + 2;
                                                       i2 = i15 + 3;
                                                       p1.cubicTo(f7, f8, ov951[i], ov951[i14], ov951[i1], ov951[i2]);
                                                       i5 = ov951[i1];
                                                       f8 = ov951[i2];
                                                       i7 = ov951[i];
                                                       i8 = ov951[i14];
                                                       goto label_0288 ;
                                                    }
                                                 }else {
                                                    ov951 = b;
                                                    i15 = i6;
                                                    i6 = i15 + 0;
                                                    i = ov951[i6];
                                                    i6 = i15 + 1;
                                                    i3 = ov951[i6];
                                                    if (i15 > 0) {
                                                       path.lineTo(i, i3);
                                                    }else {
                                                       path.moveTo(i, i3);
                                                       i12 = i;
                                                       i13 = i3;
                                                    }
                                                 }
                                                 f3 = i12;
                                                 f4 = i13;
                                              }else {
                                                 ov951 = b;
                                                 i15 = i6;
                                                 i6 = i15 + 0;
                                                 i3 = i15 + 1;
                                                 path.lineTo(ov951[i6], ov951[i3]);
                                                 i = ov951[i6];
                                                 i3 = ov951[i3];
                                              }
                                              f3 = i;
                                              f4 = i3;
                                           }else {
                                              ov951 = b;
                                              i15 = i6;
                                              i2 = i9;
                                              i6 = i15 + 0;
                                              path.rLineTo(0, ov951[i6]);
                                              i10 = ov951[i6];
                                           }
                                           f4 = i2 + i;
                                        }else {
                                           ov951 = b;
                                           i15 = i6;
                                           i2 = i9;
                                           i = i10;
                                           i6 = i15 + 0;
                                           i5 = i15 + 1;
                                           i8 = i15 + 2;
                                           i10 = i15 + 3;
                                           path.rQuadTo(ov951[i6], ov951[i5], ov951[i8], ov951[i10]);
                                           f2 = ov951[i6] + i;
                                           f7 = ov951[i5] + i2;
                                           f9 = i + ov951[i8];
                                           f3 = f9;
                                           i = ov951[i10];
                                           goto label_0283 ;
                                        }
                                     }else {
                                        ov951 = b;
                                        i15 = i6;
                                        i6 = i15 + 0;
                                        path.rLineTo(ov951[i6], 0);
                                        f9 = i10 + ov951[i6];
                                     }
                                  }else {
                                     ov951 = b;
                                     i15 = i6;
                                     i2 = i9;
                                     i = i10;
                                     i6 = i15 + 0;
                                     i6 = i15 + 1;
                                     i14 = i15 + 2;
                                     i1 = i15 + 3;
                                     i19 = i15 + 4;
                                     i17 = i15 + 5;
                                     p1.rCubicTo(ov951[i6], ov951[i6], ov951[i14], ov951[i1], ov951[i19], ov951[i17]);
                                     f5 = ov951[i14] + i;
                                     f7 = ov951[i1] + i2;
                                     f3 = i + ov951[i19];
                                     i = ov951[i17];
                                     goto label_0283 ;
                                  }
                                  ov95 = a;
                                  oobject1 = oobject;
                                  i16 = i4;
                               }else {
                                  ov951 = b;
                                  i15 = i6;
                                  i2 = i9;
                                  i = i10;
                                  i14 = i15 + 5;
                                  f5 = ov951[i14] + i;
                                  i1 = i15 + 6;
                                  float f10 = ov951[i1] + i2;
                                  i6 = i15 + 0;
                                  i9 = ov951[i6];
                                  i6 = i15 + 1;
                                  i10 = ov951[i6];
                                  i6 = i15 + 2;
                                  i17 = ov951[i6];
                                  i6 = i15 + 3;
                                  f7 = 0;
                                  i19 = (f7 - ov951[i6])? 1: 0;
                                  i6 = i15 + 4;
                                  int i20 = (f7 - ov951[i6])? 1: 0;
                                  ov95 = a;
                                  oobject1 = oobject;
                                  i16 = i4;
                                  v95.a(p1, i, i2, f5, f10, i9, i10, i17, i19, i20);
                                  f3 = i + ov951[i14];
                                  f4 = i2 + ov951[i1];
                               label_03b5 :
                                  f10 = f4;
                                  f5 = f3;
                               }
                            }else {
                               ov951 = b;
                               i15 = i6;
                               ov95 = a;
                               oobject1 = oobject;
                               i16 = i4;
                               i6 = i15 + 0;
                               path.lineTo(i10, ov951[i6]);
                               f4 = ov951[i6];
                            }
                         }else {
                            ov951 = b;
                            i15 = i6;
                            ov95 = a;
                            oobject1 = oobject;
                            i16 = i4;
                            i6 = i15 + 0;
                            i3 = i15 + 1;
                            i7 = i15 + 2;
                            i9 = i15 + 3;
                            path.quadTo(ov951[i6], ov951[i3], ov951[i7], ov951[i9]);
                            i = ov951[i6];
                            i3 = ov951[i3];
                            f3 = ov951[i7];
                            f4 = ov951[i9];
                         }
                      }else {
                         ov951 = b;
                         i15 = i6;
                         ov95 = a;
                         oobject1 = oobject;
                         i16 = i4;
                         i6 = i15 + 0;
                         path.lineTo(ov951[i6], i9);
                         f3 = ov951[i6];
                      }
                   }else {
                      ov951 = b;
                      i15 = i6;
                      ov95 = a;
                      oobject1 = oobject;
                      i16 = i4;
                      i6 = i15 + 0;
                      i6 = i15 + 1;
                      i = i15 + 2;
                      i21 = i15 + 3;
                      i22 = i15 + 4;
                      i4 = i15 + 5;
                      p1.cubicTo(ov951[i6], ov951[i6], ov951[i], ov951[i21], ov951[i22], ov951[i4]);
                      i = ov951[i];
                      f3 = ov951[i22];
                      f4 = ov951[i4];
                      i3 = ov951[i21];
                   }
                   i7 = i;
                   i8 = i3;
                }else {
                   ov951 = b;
                   i15 = i6;
                   i2 = i9;
                   i = i10;
                   ov95 = a;
                   oobject1 = oobject;
                   i16 = i4;
                   i14 = i15 + 5;
                   i7 = ov951[i14];
                   i1 = i15 + 6;
                   i8 = ov951[i1];
                   i6 = i15 + 0;
                   i9 = ov951[i6];
                   i6 = i15 + 1;
                   i10 = ov951[i6];
                   i6 = i15 + 2;
                   i21 = ov951[i6];
                   i6 = i15 + 3;
                   f7 = 0;
                   i22 = (f7 - ov951[i6])? true: false;
                   i6 = i15 + 4;
                   i4 = (f7 - ov951[i6])? true: false;
                   v95.a(p1, i, i2, i7, i8, i9, i10, i21, i22, i4);
                   f3 = ov951[i14];
                   f4 = ov951[i1];
                   goto label_03b5 ;
                }
                i6 = i15 + i11;
                oobject = oobject1;
                i3 = ov95;
                a = i3;
                i4 = i16;
                i1 = 109;
                i = p0;
             }else {
                break ;
             }
          }
          i16 = i4;
          uofloatArray[0] = i10;
          uofloatArray[1] = i9;
          uofloatArray[2] = i7;
          uofloatArray[3] = i8;
          uofloatArray[4] = i12;
          uofloatArray[5] = i13;
          i4 = i16 + 1;
          i3 = p0[i16].a;
          i1 = 109;
          i9 = 0;
          i = p0;
       }
       return;
    }
}
