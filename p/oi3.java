package p.oi3;
import java.lang.String;
import p.xq7;
import p.tg3;
import p.sv3;
import p.ni3;
import java.util.ArrayList;
import java.lang.Float;
import p.kg3;
import p.rd;
import p.ej4;
import p.mf7;
import java.lang.Object;
import p.y20;
import p.uv1;
import p.we1;
import java.lang.Class;
import p.qd;
import p.o11;
import java.lang.StringBuilder;
import p.vd;
import p.j8;
import p.jd1;
import p.cg7;
import p.sh3;
import java.util.List;
import p.zr0;
import p.as0;
import p.js3;
import p.hd6;
import p.w14;
import p.en6;
import p.wd;
import p.xd;
import android.graphics.Color;
import p.ph3;
import android.view.animation.Interpolator;

public abstract class oi3	// class@002127 from classes.dex
{
    public static final xq7 a;
    public static final xq7 b;
    public static final xq7 c;

    static {
       String[] stringArray = new String[]{"nm","ind","refId","ty","parent","sw","sh","sc","ks","tt","masksProperties","shapes","t","ef","sr","st","w","h","ip","op","tm","cl","hd"};
       oi3.a = xq7.f(stringArray);
       stringArray = new String[]{"d","a"};
       oi3.b = xq7.f(stringArray);
       stringArray = new String[]{"ty","nm"};
       oi3.c = xq7.f(stringArray);
    }
    public static ni3 a(tg3 p0,sv3 p1){
       int i23;
       float f2;
       qd oqd1;
       String str2;
       zr0 ozr0;
       boolean b1;
       we1 a;
       we1 b2;
       we1 c;
       we1 d;
       ArrayList uArrayList4;
       String str3;
       ph3 v9;
       tg3 otg3 = p0;
       sv3 osv3 = p1;
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       p0.f();
       Float uFloat = Float.valueOf(0);
       Float uFloat1 = Float.valueOf(0x3f800000);
       int b = false;
       int i = 0;
       int i1 = -1;
       int i2 = 0;
       float f = 0;
       int i3 = 0;
       int i4 = 0;
       int i5 = 0;
       int i6 = 0;
       int i7 = 0;
       int i8 = 0;
       int i9 = 0x3f800000;
       int i10 = 0;
       int i11 = 0;
       int i12 = 0;
       int i13 = 0;
       int i14 = 0;
       int i15 = 1;
       int i16 = 0;
       int i17 = 0;
       int i18 = 0;
       int o11 i19 = 0;
       ni3 float f1 = 0;
       String str = "UNSET";
       while (p0.J()) {
          int i20 = 6;
          int i21 = 2;
          int i22 = 3;
          switch (otg3.l0(oi3.a)){
              case 0:
                str = p0.i0();
                break;
              case 1:
                i = (long)p0.h0();
                break;
              case 2:
                i4 = p0.i0();
                break;
              case 3:
                i23 = p0.h0();
                i3 = 7;
                if (i23 < i20) {
                   i3 = en6.H(i3)[i23];
                }else {
                }
                break;
              case 4:
                i1 = (long)p0.h0();
                break;
              case 5:
                f2 = mf7.c() * (float)p0.h0();
                i6 = (int)f2;
                break;
              case 6:
                f2 = mf7.c() * (float)p0.h0();
                i7 = (int)f2;
                break;
              case 7:
                i8 = Color.parseColor(p0.i0());
                break;
              case 8:
                i5 = xd.a(p0, p1);
                break;
              case 9:
                if ((i23 = p0.h0()) >= en6.H(i20).length) {
                   osv3.a("Unsupported matte type: ".append(i23).toString());
                label_049f :
                   b = 1;
                }else {
                   i15 = en6.H(i20)[i23];
                   if ((i23 = en6.A(i15)) != 3) {
                      if (i23 == 4) {
                         osv3.a("Unsupported matte type: Luma Inverted");
                      }
                   }else {
                      osv3.a("Unsupported matte type: Luma");
                   }
                   i23 = osv3.n + 1;
                   osv3.n = i23;
                }
                break;
              case 10:
                p0.b();
                while (p0.J()) {
                   p0.f();
                   qd oqd = null;
                   oqd1 = null;
                   int i24 = 0;
                   i20 = false;
                   while (p0.J()) {
                      String str1 = p0.t0();
                      str1.getClass();
                      if ((i22 = str1.hashCode()) != 111) {
                         if (i22 != 3588) {
                            if (i22 != 0x197f1) {
                               if (i22 != 0x3339a3 || !str1.equals("mode")) {
                               label_03b8 :
                                  i22 = -1;
                               }else {
                                  i22 = 3;
                               }
                            }else if(!str1.equals("inv")){
                               goto label_03b8 ;
                            }else {
                               i22 = 2;
                            }
                         }else if(!str1.equals("pt")){
                            goto label_03b8 ;
                         }else {
                            i22 = 1;
                         }
                      }else if(!str1.equals("o")){
                         goto label_03b8 ;
                      }else {
                         i22 = 0;
                      }
                      if (i22) {
                         if (i22 != 1) {
                            if (i22 != 2) {
                               if (i22 != 3) {
                                  p0.n0();
                               }else {
                                  str2 = p0.i0();
                                  str2.getClass();
                                  if ((i22 = str2.hashCode()) != 97) {
                                     if (i22 != 105) {
                                        if (i22 != 110) {
                                           if (i22 != 115 || !str2.equals("s")) {
                                           label_0410 :
                                              str2 = -1;
                                           }else {
                                              str2 = 3;
                                           }
                                        }else if(!str2.equals("n")){
                                           goto label_0410 ;
                                        }else {
                                           str2 = 2;
                                        }
                                     }else if(!str2.equals("i")){
                                        goto label_0410 ;
                                     }else {
                                        str2 = 1;
                                     }
                                  }else if(!str2.equals("a")){
                                     goto label_0410 ;
                                  }else {
                                     str2 = 0;
                                  }
                                  if (str2) {
                                     if (str2 != 1) {
                                        if (str2 != 2) {
                                           if (str2 != 3) {
                                              js3.a("Unknown mask mode ".append(str1).append(". Defaulting to Add.").toString());
                                           }else {
                                              i24 = 2;
                                           }
                                        }else {
                                           i24 = 4;
                                        }
                                     }else {
                                        osv3.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                        i24 = 3;
                                     }
                                  }else {
                                     i22 = 2;
                                  }
                                  i24 = 1;
                               }
                            }else {
                               i20 = p0.T();
                            }
                         }else {
                            oqd = new qd(5, sh3.a(otg3, osv3, mf7.c(), hd6.a, false));
                         }
                      }else {
                         oqd1 = ej4.z0(p0, p1);
                      }
                      i21 = 2;
                   }
                   p0.y();
                   uArrayList.add(new w14(i24, oqd, oqd1, i20));
                   i21 = 2;
                }
                b = osv3.n + uArrayList.size();
                osv3.n = b;
                p0.x();
                goto label_049f ;
                break;
              case 11:
                p0.b();
                while (p0.J()) {
                   if ((ozr0 = as0.a(p0, p1)) != null) {
                      uArrayList1.add(ozr0);
                   }
                }
                p0.x();
                i22 = 0;
                break;
              case 12:
                p0.f();
                while (p0.J()) {
                   if (i23 = otg3.l0(oi3.b)) {
                      if (i23 != 1) {
                         p0.m0();
                         p0.n0();
                      }else {
                         p0.b();
                         if (p0.J()) {
                            p0.f();
                            ozr0 = 0;
                            while (p0.J()) {
                               if (otg3.l0(vd.a)) {
                                  p0.m0();
                                  p0.n0();
                               }else {
                                  p0.f();
                                  qd oqd2 = null;
                                  qd oqd3 = null;
                                  rd ord = null;
                                  rd ord1 = null;
                                  while (p0.J()) {
                                     if (i23 = otg3.l0(vd.b)) {
                                        b = true;
                                        if (i23 != b) {
                                           if (i23 != i21) {
                                              if (i23 != 3) {
                                                 p0.m0();
                                                 p0.n0();
                                              }else {
                                                 ord1 = ej4.y0(otg3, osv3, b);
                                                 continue ;
                                              }
                                           }else {
                                              ord = ej4.y0(otg3, osv3, b);
                                              continue ;
                                           }
                                        }else {
                                           oqd3 = ej4.x0(p0, p1);
                                           continue ;
                                        }
                                     }else {
                                        oqd2 = ej4.x0(p0, p1);
                                        continue ;
                                     }
                                  }
                                  p0.y();
                                  j8 ozr01 = new j8(oqd2, oqd3, ord, ord1, 3);
                                  continue ;
                               }
                            }
                            p0.y();
                            if (ozr0 == null) {
                               j8 ozr02 = new j8(null, null, null, null, 3);
                            }
                            i14 = ozr0;
                            while (p0.J()) {
                               p0.n0();
                            }
                            p0.x();
                         }else {
                            continue ;
                         }
                      }
                   }else {
                      i13 = new qd(i20, sh3.a(otg3, osv3, mf7.c(), jd1.a, false));
                   }
                }
                p0.y();
                break;
              case 13:
                p0.b();
                ArrayList uArrayList2 = new ArrayList();
                while (p0.J()) {
                   p0.f();
                   while (p0.J()) {
                      if (b = otg3.l0(oi3.c)) {
                         if (b != 1) {
                            p0.m0();
                            p0.n0();
                         }else {
                            uArrayList2.add(p0.i0());
                         }
                      }else if((b = p0.h0()) == 29){
                         i18 = 0;
                         while (p0.J()) {
                            if (otg3.l0(y20.a)) {
                               p0.m0();
                               p0.n0();
                            }else {
                               p0.b();
                               while (p0.J()) {
                                  p0.f();
                                  oqd1 = 0;
                                  while (true) {
                                     str2 = 0;
                                     while (true) {
                                        if (p0.J()) {
                                           if (i20 = otg3.l0(y20.b)) {
                                              b1 = true;
                                              if (i20 != b1) {
                                                 p0.m0();
                                                 p0.n0();
                                              }else if(str2){
                                                 uv1 ouv1 = new uv1(11, ej4.y0(otg3, osv3, b1));
                                                 continue ;
                                              }else {
                                                 p0.n0();
                                                 continue ;
                                              }
                                           }else {
                                              if (!p0.h0()) {
                                                 str2 = 1;
                                                 continue ;
                                              }else {
                                                 continue ;
                                              }
                                           }
                                        }else {
                                           p0.y();
                                           if (oqd1 != null) {
                                              i18 = oqd1;
                                           }else {
                                              continue ;
                                           }
                                        }
                                     }
                                  }
                               label_052b :
                                  b = false;
                               }
                               p0.x();
                            }
                         }
                      }else if(b == 25){
                         we1 owe1 = new we1();
                         while (p0.J()) {
                            if (otg3.l0(we1.f)) {
                               p0.m0();
                               p0.n0();
                            }else {
                               p0.b();
                               while (p0.J()) {
                                  p0.f();
                                  str2 = "";
                                  while (p0.J()) {
                                     if (i20 = otg3.l0(we1.g)) {
                                        if (i20 != 1) {
                                           p0.m0();
                                           p0.n0();
                                        }else {
                                           str2.getClass();
                                           switch (str2.hashCode()){
                                               case 0x150bf015:
                                                 if (str2.equals("Distance")) {
                                                    i20 = 0;
                                                 }
                                                 break;
                                               case 0x17b08feb:
                                                 if (str2.equals("Opacity")) {
                                                    i20 = 1;
                                                 }
                                                 break;
                                               case 0x3e12275f:
                                                 if (str2.equals("Direction")) {
                                                    i20 = 2;
                                                 }
                                                 break;
                                               case 0x5237c863:
                                                 if (str2.equals("Shadow Color")) {
                                                    i20 = 3;
                                                 }
                                                 break;
                                               case 0x5279bda1:
                                                 if (str2.equals("Softness")) {
                                                    i20 = 4;
                                                 }
                                                 break;
                                               default:
                                                 i20 = -1;
                                           }
                                           if (i20) {
                                              b1 = true;
                                              if (i20 != b1) {
                                                 if (i20 != i21) {
                                                    if (i20 != i22) {
                                                       if (i20 != 4) {
                                                          p0.n0();
                                                       }else {
                                                          owe1.e = ej4.y0(otg3, osv3, b1);
                                                       }
                                                    }else {
                                                       owe1.a = ej4.x0(p0, p1);
                                                    }
                                                 }else {
                                                    owe1.c = ej4.y0(otg3, osv3, false);
                                                 }
                                              }else {
                                                 owe1.b = ej4.y0(otg3, osv3, false);
                                              }
                                           }else {
                                              owe1.d = ej4.y0(otg3, osv3, true);
                                           }
                                        }
                                     }else {
                                        str2 = p0.i0();
                                     }
                                     i22 = 3;
                                  }
                                  p0.y();
                                  i22 = 3;
                               }
                               p0.x();
                               i22 = 3;
                            }
                         }
                         i19 = ((a = owe1.a) != null && ((b2 = owe1.b) != null && ((c = owe1.c) != null && ((d = owe1.d) != null && (owe1 = owe1.e) != null))))? new o11(a, b2, c, d, owe1, 2): 0;
                      }
                      i22 = 3;
                   }
                   p0.y();
                   d = 3;
                }
                p0.x();
                osv3.a("Lottie doesn\'t support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".append(uArrayList2).toString());
                goto label_052b ;
                break;
              case 14:
                i9 = (float)p0.g0();
                goto label_052b ;
                break;
              case 15:
                i10 = (float)p0.g0();
                goto label_052b ;
                break;
              case 16:
                double d1 = p0.g0() * (double)mf7.c();
                i11 = (float)d1;
                goto label_052b ;
                break;
              case 17:
                double d2 = p0.g0() * (double)mf7.c();
                i12 = (float)d2;
                goto label_052b ;
                break;
              case 18:
                f = (float)p0.g0();
                break;
              case 19:
                f1 = (float)p0.g0();
                break;
              case 20:
                i16 = ej4.y0(otg3, osv3, b);
                break;
              case 21:
                i2 = p0.i0();
                break;
              case 22:
                i17 = p0.T();
                break;
              default:
                p0.m0();
                p0.n0();
                goto label_052b ;
          }
          i22 = 0;
       }
       p0.y();
       ArrayList uArrayList3 = new ArrayList();
       if ((0 - f) > 0) {
          uArrayList4 = uArrayList;
          str3 = i2;
          v9 = new ph3(p1, uFloat, uFloat, null, 0, Float.valueOf(f));
          uArrayList3.add(v9);
       }else {
          uArrayList4 = uArrayList;
          str3 = i2;
       }
       if ((0 - f1) <= 0) {
          f1 = osv3.k;
       }
       Interpolator interpolator = null;
       sv3 osv31 = p1;
       v9 = new ph3(osv31, uFloat1, uFloat1, interpolator, f, Float.valueOf(f1));
       uArrayList3.add(v9);
       v9 = new ph3(osv31, uFloat, uFloat, interpolator, f1, Float.valueOf(Float.MAX_VALUE));
       uArrayList3.add(v9);
       if (str.endsWith(".ai") || "ai".equals(str3)) {
          osv3.a("Convert your Illustrator layers to shape layers.");
       }
       f1 = new ni3(uArrayList1, p1, str, i, i3, i1, i4, uArrayList4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, uArrayList3, i15, i16, i17, i18, i19);
       return f1;
    }
}
