package p.vv3;
import java.lang.String;
import p.xq7;
import p.tg3;
import p.sv3;
import p.mf7;
import p.qv3;
import java.util.ArrayList;
import java.util.HashMap;
import p.jo6;
import p.t14;
import java.lang.Object;
import p.kb2;
import p.zr0;
import p.as0;
import p.kd6;
import p.jb2;
import p.lb2;
import p.ib2;
import p.ni3;
import p.oi3;
import p.cw3;
import java.lang.StringBuilder;
import p.js3;
import java.lang.Integer;
import android.graphics.Rect;

public abstract class vv3	// class@002a71 from classes.dex
{
    public static final xq7 a;
    public static final xq7 b;
    public static final xq7 c;
    public static final xq7 d;

    static {
       String[] stringArray = new String[]{"w","h","ip","op","fr","v","layers","assets","fonts","chars","markers"};
       vv3.a = xq7.f(stringArray);
       stringArray = new String[]{"id","layers","w","h","p","u"};
       vv3.b = xq7.f(stringArray);
       stringArray = new String[]{"list"};
       vv3.c = xq7.f(stringArray);
       stringArray = new String[]{"cm","tm","dr"};
       vv3.d = xq7.f(stringArray);
    }
    public static sv3 a(tg3 p0){
       float f2;
       HashMap hashMap3;
       ArrayList uArrayList2;
       jo6 ojo61;
       float f3;
       float f4;
       qv3 oqv31;
       int i5;
       int i7;
       int i8;
       qv3 oqv32;
       float f6;
       tg3 otg3 = p0;
       float f = mf7.c();
       qv3 oqv3 = new qv3();
       ArrayList uArrayList = new ArrayList();
       HashMap hashMap = new HashMap();
       HashMap hashMap1 = new HashMap();
       HashMap hashMap2 = new HashMap();
       ArrayList uArrayList1 = new ArrayList();
       jo6 ojo6 = new jo6();
       sv3 osv3 = new sv3();
       p0.f();
       int i = 0;
       jb2 int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       while (p0.J()) {
          float f1 = i1;
          switch (otg3.l0(vv3.a)){
              case 0:
                f2 = f;
                hashMap3 = hashMap2;
                uArrayList2 = uArrayList1;
                ojo61 = ojo6;
                f3 = i2;
                f4 = i3;
                oqv31 = oqv3;
                i4 = p0.h0();
             label_03ec :
                oqv3 = oqv31;
                i1 = f1;
                f = f2;
                i2 = f3;
                uArrayList1 = uArrayList2;
                i3 = f4;
                hashMap2 = hashMap3;
                ojo6 = ojo61;
                break;
              case 1:
                f2 = f;
                hashMap3 = hashMap2;
                uArrayList2 = uArrayList1;
                ojo61 = ojo6;
                f3 = i2;
                f4 = i3;
                oqv31 = oqv3;
                i = p0.h0();
                goto label_03ec ;
                break;
              case 2:
                f2 = f;
                hashMap3 = hashMap2;
                uArrayList2 = uArrayList1;
                ojo61 = ojo6;
                i5 = i;
                oqv31 = oqv3;
                i2 = (float)p0.g0();
             label_03c4 :
                i1 = f1;
             label_0403 :
                oqv3 = oqv31;
                f = f2;
                uArrayList1 = uArrayList2;
                hashMap2 = hashMap3;
                ojo6 = ojo61;
                i = i5;
                break;
              case 3:
                f2 = f;
                hashMap3 = hashMap2;
                uArrayList2 = uArrayList1;
                ojo61 = ojo6;
                i5 = i;
                oqv31 = oqv3;
                i3 = (float)p0.g0() - 0.01f;
                goto label_03c4 ;
                break;
              case 4:
                f2 = f;
                hashMap3 = hashMap2;
                uArrayList2 = uArrayList1;
                ojo61 = ojo6;
                i5 = i;
                oqv31 = oqv3;
                i1 = (float)p0.g0();
                goto label_0403 ;
                break;
              case 5:
                f2 = f;
                hashMap3 = hashMap2;
                uArrayList2 = uArrayList1;
                ojo61 = ojo6;
                i5 = i;
                f3 = i2;
                f4 = i3;
                oqv31 = oqv3;
                String[] stringArray = p0.i0().split("\\.");
                int i6 = Integer.parseInt(stringArray[0]);
                i7 = Integer.parseInt(stringArray[1]);
                i8 = Integer.parseInt(stringArray[2]);
                i = 4;
                i1 = (i6 < i || (i6 <= i || (i7 >= i || (i7 <= i || i8 >= 0))))? 0: 1;
                if (!i1) {
                   osv3.a("Lottie only supports bodymovin >= 4.4.0");
                label_03fd :
                   i1 = f1;
                   i2 = f3;
                   i3 = f4;
                   goto label_0403 ;
                }else {
                   goto label_03fd ;
                }
                break;
              case 6:
                f2 = f;
                oqv32 = oqv3;
                hashMap3 = hashMap2;
                uArrayList2 = uArrayList1;
                ojo61 = ojo6;
                i5 = i;
                f3 = i2;
                f4 = i3;
                p0.b();
                i8 = 0;
                while (p0.J()) {
                   ni3 oni3 = oi3.a(otg3, osv3);
                   if (oni3.e == 3) {
                      i8 = i8 + 1;
                   }
                   uArrayList.add(oni3);
                   oqv31 = oqv32;
                   oqv31.h(oni3.d, oni3);
                   if (i8 > 4) {
                      js3.a("You have ".append(i8).append(" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.").toString());
                   }
                   oqv32 = oqv31;
                }
                oqv31 = oqv32;
                p0.x();
                goto label_03fd ;
                break;
              case 7:
                uArrayList2 = uArrayList1;
                f3 = i2;
                f4 = i3;
                p0.b();
                while (p0.J()) {
                   uArrayList1 = new ArrayList();
                   qv3 oqv33 = new qv3();
                   p0.f();
                   hashMap3 = hashMap2;
                   String str = null;
                   String str1 = str;
                   i1 = 0;
                   i2 = 0;
                   while (p0.J()) {
                      ojo61 = ojo6;
                      if (i7 = otg3.l0(vv3.b)) {
                         i5 = i;
                         if (i7 != 1) {
                            if (i7 != 2) {
                               if (i7 != 3) {
                                  if (i7 != 4) {
                                     if (i7 != 5) {
                                        p0.m0();
                                        p0.n0();
                                        f2 = f;
                                        oqv32 = oqv3;
                                     }else {
                                        p0.i0();
                                     }
                                  }else {
                                     str1 = p0.i0();
                                  }
                               }else {
                                  i2 = p0.h0();
                               }
                            }else {
                               i1 = p0.h0();
                            }
                         }else {
                            p0.b();
                            while (p0.J()) {
                               ni3 oni31 = oi3.a(otg3, osv3);
                               oqv33.h(oni31.d, oni31);
                               uArrayList1.add(oni31);
                               f = f;
                               oqv32 = oqv3;
                            }
                            f2 = f;
                            oqv32 = oqv3;
                            p0.x();
                         }
                         f = f2;
                         ojo6 = ojo61;
                         i = i5;
                         oqv3 = oqv32;
                      }else {
                         i5 = i;
                         str = p0.i0();
                      }
                      ojo6 = ojo61;
                      i = i5;
                   }
                   f2 = f;
                   oqv32 = oqv3;
                   ojo61 = ojo6;
                   i5 = i;
                   p0.y();
                   if (str1 != null) {
                      hashMap1.put(str, new cw3(i1, i2, str, str1));
                   }else {
                      hashMap.put(str, uArrayList1);
                   }
                   f = f2;
                   hashMap2 = hashMap3;
                   ojo6 = ojo61;
                   i = i5;
                   oqv3 = oqv32;
                }
                f2 = f;
                hashMap3 = hashMap2;
                ojo61 = ojo6;
                i5 = i;
                p0.x();
                oqv31 = oqv3;
                goto label_03fd ;
                break;
              case 8:
                f3 = i2;
                f4 = i3;
                p0.f();
                while (p0.J()) {
                   if (otg3.l0(vv3.c)) {
                      p0.m0();
                      p0.n0();
                   }else {
                      p0.b();
                      while (p0.J()) {
                         p0.f();
                         String str2 = null;
                         String str3 = str2;
                         String str4 = str3;
                         while (p0.J()) {
                            if (i3 = otg3.l0(lb2.a)) {
                               uArrayList2 = uArrayList1;
                               if (i3 != 1) {
                                  if (i3 != 2) {
                                     if (i3 != 3) {
                                        p0.m0();
                                        p0.n0();
                                     }else {
                                        p0.g0();
                                     }
                                  }else {
                                     str4 = p0.i0();
                                  }
                               }else {
                                  str3 = p0.i0();
                               }
                               uArrayList1 = uArrayList2;
                            }else {
                               str2 = p0.i0();
                               continue ;
                            }
                         }
                         p0.y();
                         hashMap2.put(str3, new ib2(str2, str3, str4));
                         uArrayList1 = uArrayList1;
                      }
                      p0.x();
                      continue ;
                   }
                }
                uArrayList2 = uArrayList1;
                p0.y();
                f2 = f;
                hashMap3 = hashMap2;
             label_0206 :
                ojo61 = ojo6;
                i5 = i;
                oqv31 = oqv3;
                goto label_03fd ;
                break;
              case 9:
                f3 = i2;
                f4 = i3;
                p0.b();
                while (p0.J()) {
                   ArrayList uArrayList3 = new ArrayList();
                   p0.f();
                   double d = 0;
                   String str5 = null;
                   String str6 = str5;
                   char c = 0;
                   while (p0.J()) {
                      if (i1 = otg3.l0(kb2.a)) {
                         if (i1 != 1) {
                            if (i1 != 2) {
                               if (i1 != 3) {
                                  if (i1 != 4) {
                                     if (i1 != 5) {
                                        p0.m0();
                                        p0.n0();
                                     }else {
                                        p0.f();
                                        while (p0.J()) {
                                           if (otg3.l0(kb2.b)) {
                                              p0.m0();
                                              p0.n0();
                                           }else {
                                              p0.b();
                                              while (p0.J()) {
                                                 uArrayList3.add(as0.a(otg3, osv3));
                                              }
                                              p0.x();
                                              continue ;
                                           }
                                        }
                                        p0.y();
                                        continue ;
                                     }
                                  }else {
                                     str6 = p0.i0();
                                     continue ;
                                  }
                               }else {
                                  str5 = p0.i0();
                                  continue ;
                               }
                            }else {
                               d = p0.g0();
                               continue ;
                            }
                         }else {
                            p0.g0();
                            continue ;
                         }
                      }else {
                         c = p0.i0().charAt(0);
                         continue ;
                      }
                   }
                   p0.y();
                   i1 = new jb2(uArrayList3, c, d, str5, str6);
                   ojo6.f(i1.hashCode(), i1);
                }
                p0.x();
             label_0178 :
                f2 = f;
                hashMap3 = hashMap2;
                uArrayList2 = uArrayList1;
                goto label_0206 ;
                break;
              case 10:
                p0.b();
                while (p0.J()) {
                   p0.f();
                   int i9 = 0;
                   float f5 = 0;
                   f3 = 0;
                   while (p0.J()) {
                      if (i1 = otg3.l0(vv3.d)) {
                         f4 = i3;
                         if (i1 != 1) {
                            if (i1 != 2) {
                               p0.m0();
                               p0.n0();
                            }else {
                               f6 = i2;
                               f3 = (float)p0.g0();
                            }
                         }else {
                            f6 = i2;
                            f5 = (float)p0.g0();
                         }
                         i2 = f6;
                      }else {
                         f4 = i3;
                         i9 = p0.i0();
                      }
                      i3 = f4;
                   }
                   p0.y();
                   uArrayList1.add(new t14(i9, f5, f3));
                   i2 = i2;
                   i9 = i3;
                }
                f3 = i2;
                f4 = i3;
                p0.x();
                goto label_0178 ;
                break;
              default:
                f2 = f;
                hashMap3 = hashMap2;
                uArrayList2 = uArrayList1;
                ojo61 = ojo6;
                i5 = i;
                f3 = i2;
                f4 = i3;
                oqv31 = oqv3;
                p0.m0();
                p0.n0();
                goto label_03fd ;
          }
       }
       f2 = f;
       osv3.i = new Rect(0, 0, (int)((float)i4 * f2), (int)((float)i * f2));
       osv3.j = i2;
       osv3.k = i3;
       osv3.l = i1;
       osv3.h = uArrayList;
       osv3.g = oqv3;
       osv3.c = hashMap;
       osv3.d = hashMap1;
       osv3.f = ojo6;
       osv3.e = hashMap2;
       return osv3;
    }
}
