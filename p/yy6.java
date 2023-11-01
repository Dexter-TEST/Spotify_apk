package p.yy6;
import p.ly7;
import p.gf4;
import p.zb;
import p.n60;
import p.s32;
import p.es7;
import p.ul1;
import java.lang.Object;
import p.kg4;
import p.xy6;
import java.lang.Byte;
import java.lang.Class;
import java.lang.reflect.Array;
import p.wl1;
import java.lang.StringBuilder;
import java.lang.String;
import p.v10;
import com.google.android.material.tabs.TabLayout;
import android.view.View;
import android.graphics.RectF;
import p.ez6;
import android.content.Context;
import p.xe7;
import java.io.File;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import p.xj0;
import java.lang.Throwable;
import android.util.Log;
import java.io.Closeable;
import p.lx;
import java.util.Map;
import p.sl1;
import java.lang.Boolean;
import p.en6;
import java.lang.Integer;
import java.nio.charset.Charset;
import p.tp2;
import p.h55;
import p.ne0;
import java.util.HashMap;
import p.fs7;
import java.nio.charset.CharsetEncoder;
import java.lang.CharSequence;
import java.lang.Math;
import p.is7;
import p.zh2;
import p.r8;
import p.ye7;
import java.lang.IllegalArgumentException;
import p.oo1;
import p.ac4;
import p.b17;
import p.u10;
import java.lang.Enum;
import java.io.UnsupportedEncodingException;
import p.qg7;
import p.vh4;
import java.util.ArrayList;
import p.li5;
import p.oi2;
import p.j20;
import java.util.Iterator;
import p.vy;
import p.co5;
import java.lang.IllegalStateException;
import android.graphics.drawable.Drawable;
import p.je;
import android.graphics.Rect;
import p.e18;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p.tu6;
import p.a18;
import p.iy7;
import p.lx7;
import p.xv7;
import p.dx6;
import p.f27;
import p.cx6;
import p.no1;
import p.kb3;
import java.nio.charset.StandardCharsets;
import p.aq2;
import p.kr6;
import java.util.List;
import java.util.Collections;
import java.util.LinkedList;
import java.lang.Iterable;
import p.lk5;
import java.util.Collection;
import java.util.Comparator;
import p.t57;
import java.util.Deque;
import p.ag1;
import p.u44;
import p.n53;
import p.lh0;
import p.jh0;
import p.vf;
import android.os.Bundle;
import p.ox7;

public class yy6 implements ly7, gf4, zb, n60, s32, es7, ul1	// class@002e52 from classes.dex
{
    public final int a;
    public static yy6 b;

    public void yy6(){
       this.a = 17;
       super();
    }
    public void yy6(int p0){
       this.a = p0;
       super();
    }
    public void yy6(kg4 p0){
       this.a = 8;
       super(8);
    }
    public void yy6(xy6 p0){
       this.a = 12;
       super(12);
    }
    public static byte[][] A(byte[][] p0){
       int[] ointArray = new int[]{p0[0].length,p0.length};
       byte[][] uobyteArray = Array.newInstance(Byte.TYPE, ointArray);
       int i = 0;
       while (i < p0.length) {
          int i1 = p0.length - i;
          i1 = i1 - 1;
          for (int i2 = 0; i2 < p0[0].length; i2 = i2 + 1) {
             uobyteArray[i2][i1] = p0[i][i2];
          }
          i = i + 1;
       }
       return uobyteArray;
    }
    public static void C(wl1 p0,StringBuilder p1){
       int i = (((p1.charAt(1) * 40) + (p1.charAt(0) * 1600)) + p1.charAt(2)) + 1;
       char[] uocharArray = new char[]{(char)(i / 256),(char)(i % 256)};
       StringBuilder str = p0.c+new String(uocharArray);
       p1.delete(0, 3);
    }
    public static v10 r(byte[][] p0,int p1){
       int i = p1 * 2;
       int i1 = p0.length + i;
       v10 ov10 = new v10((p0[0].length + i), i1);
       v10 t = ov10.t;
       i = t.length;
       for (int i2 = 0; i2 < i; i2 = i2 + 1) {
          t[i2] = 0;
       }
       i1 = (i1 - p1) - 1;
       i = 0;
       while (i < p0.length) {
          object oobject = p0[i];
          int i3 = 0;
          while (i3 < p0[0].length) {
             if (oobject[i3] == 1) {
                int i4 = i3 + p1;
                ov10.c(i4, i1);
             }
             i3 = i3 + 1;
          }
          i = i + 1;
          i1 = i1 - 1;
       }
       return ov10;
    }
    public static RectF s(TabLayout p0,View p1){
       if (p1 == null) {
          return new RectF();
       }
       if (p0.S != null || !p1 instanceof ez6) {
          return new RectF((float)p1.getLeft(), (float)p1.getTop(), (float)p1.getRight(), (float)p1.getBottom());
       }
       int contentWidth = p1.getContentWidth();
       int contentHeigh = p1.getContentHeight();
       int i = (int)xe7.q(p1.getContext(), 24);
       if (contentWidth < i) {
          contentWidth = i;
       }
       int i1 = (p1.getRight() + p1.getLeft()) / 2;
       int i2 = (p1.getBottom() + p1.getTop()) / 2;
       contentWidth = contentWidth / 2;
       i = i1 - contentWidth;
       contentHeigh = i2 - (contentHeigh / 2);
       contentWidth = contentWidth + i1;
       i1 = (i1 / 2) + i2;
       return new RectF((float)i, (float)contentHeigh, (float)contentWidth, (float)i1);
    }
    public static String t(File p0){
       String str;
       int i;
       BufferedInputStream uBufferedInp = new BufferedInputStream(new FileInputStream(p0.getPath()));
       try{
          str = "SHA-1";
          MessageDigest instance = MessageDigest.getInstance(str);
          byte[] uobyteArray = new byte[1024];
          while ((i = uBufferedInp.read(uobyteArray)) != -1) {
             instance.update(uobyteArray, 0, i);
          }
          str = xj0.v0(instance.digest());
       }catch(java.lang.Exception e4){
          Log.e("FirebaseCrashlytics", "Could not calculate hash for app icon.", e4);
          str = "";
       }
       xj0.m(uBufferedInp);
       return str;
    }
    private static v10 u(String p0,lx p1,int p2,int p3,Map p4){
       boolean b;
       int i3;
       int i4;
       int i5;
       int i8;
       int i9;
       String str3;
       int i10;
       int i11;
       char c;
       int i12;
       int i13;
       int i14;
       int[] ointArray;
       int[][] b2;
       char c3;
       int[][] p;
       v10 ov10;
       ne0 one0;
       String str = p0;
       int i = p3;
       Map map = p4;
       if (p1 != lx.z) {
          throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(p1)));
       }
       Charset uCharset = null;
       int i1 = 0;
       int i2 = 1;
       if (map) {
          sl1 x = sl1.x;
          b = (map.containsKey(x))? Boolean.valueOf(map.get(x).toString()).booleanValue(): false;
          sl1 y = sl1.y;
          i3 = (map.containsKey(y))? en6.G(map.get(y).toString()): 1;
          sl1 z = sl1.z;
          if (!map.containsKey(z)) {
             z = sl1.w;
             i4 = (map.containsKey(z))? Integer.parseInt(map.get(z).toString()): 30;
             sl1 a = sl1.a;
             i5 = (map.containsKey(a))? Integer.parseInt(map.get(a).toString()): 2;
             sl1 b1 = sl1.b;
             if (map.containsKey(b1)) {
                uCharset = Charset.forName(map.get(b1).toString());
             }
          }else {
             tp2.v(map.get(z));
             throw uCharset;
          }
       }else {
          b = false;
          i3 = 1;
          p = 30;
          i5 = 2;
       }
       StringBuilder str1 = "Error correction level must be between 0 and 8!";
       if (i5 >= 0 && i5 <= 8) {
          int i6 = i2 << (i5 + 1);
          StringBuilder str2 = new StringBuilder(p0.length());
          Charset e = h55.e;
          int i7 = 900;
          if (uCharset == null) {
             uCharset = e;
          }else if(!e.equals(uCharset) && (one0 = ne0.t.get(uCharset.name())) != null){
             if ((i1 = one0.a[i1]) >= 0 && i1 < i7) {
                str2 = str2+927+(char)i1;
             }else {
                i14 = 0xc5f94;
                if (i1 < i14) {
                   str2 = str2+926+(char)((i1 / 900) - 1)+(char)(i1 % i7);
                }else if(i1 < 0xc6318){
                   str2 = str2+925+(char)(i14 - i1);
                }else {
                   throw new fs7("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i1)));
                }
             }
          }
          i1 = p0.length();
          i3 = en6.A(i3);
          e = 3;
          if (i3 != i2) {
             if (i3 != 2) {
                if (i3 != e) {
                   i2 = 0;
                   i3 = 0;
                   while (true) {
                      e = 0;
                      break ;
                   }
                   while (true) {
                      if (i3 < i1) {
                         i7 = p0.length();
                         i8 = 48;
                         if (i3 < i7) {
                            i9 = 0;
                            str3 = str1;
                            i10 = i3;
                            i11 = e;
                            c = str.charAt(i3);
                            while (true) {
                               if (c >= i8 && c <= '9') {
                                  i8 = 1;
                               label_014a :
                                  if (i8 && i10 < i7) {
                                     i9 = i9 + 1;
                                     if ((i10 = i10 + 1) < i7) {
                                        c = str.charAt(i10);
                                     }
                                     i8 = 48;
                                  }else {
                                     i10 = i9;
                                  }
                               }else {
                                  i8 = 0;
                                  goto label_014a ;
                               }
                            }
                         }else {
                            str3 = str1;
                            i11 = e;
                            i10 = 0;
                         }
                         c = 13;
                         if (i10 >= c) {
                            str2 = str2.append(902);
                            h55.b(i3, i10, str, str2);
                            i3 = i3 + i10;
                            i2 = 2;
                            str1 = str3;
                         }else {
                            i7 = p0.length();
                            i8 = i3;
                            while (true) {
                               if (i8 < i7) {
                                  i12 = 0;
                                  i13 = i4;
                                  char c1 = str.charAt(i8);
                                  while (true) {
                                     if (i12 < c) {
                                        c = (c1 >= '0' && c1 <= '9')? 1: 0;
                                        if (c && i8 < i7) {
                                           i12 = i12 + 1;
                                           if ((i8 = i8 + 1) < i7) {
                                              c1 = str.charAt(i8);
                                           }
                                           c = 13;
                                        }else {
                                        label_01a8 :
                                           c1 = 13;
                                           if (i12 >= c1) {
                                              i8 = i8 - i3;
                                              i8 = i8 - i12;
                                           label_01d9 :
                                              if (i8 < 5 && i10 != i1) {
                                                 CharsetEncoder uCharsetEnco = uCharset.newEncoder();
                                                 i10 = p0.length();
                                                 i4 = i3;
                                                 while (true) {
                                                    if (i4 < i10) {
                                                       c = str.charAt(i4);
                                                       i7 = 0;
                                                       while (i7 < 13) {
                                                          i14 = (c >= '0' && c <= '9')? 1: 0;
                                                          if (i14) {
                                                             i7 = i7 + 1;
                                                             if ((i14 = i4 + i7) < i10) {
                                                                c = str.charAt(i14);
                                                             }else if(i7 >= 13){
                                                             label_023f :
                                                                if (!(i4 = i4 - i3)) {
                                                                   i4 = 1;
                                                                }
                                                                i12 = i3 + i4;
                                                                byte[] bytes = str.substring(i3, i12).getBytes(uCharset);
                                                                i4 = 1;
                                                                if (bytes.length == i4 && !i2) {
                                                                   h55.a(bytes, i4, 0, str2);
                                                                   i14 = i11;
                                                                }else {
                                                                   h55.a(bytes, bytes.length, i2, str2);
                                                                   i9 = 1;
                                                                   i14 = 0;
                                                                }
                                                                str1 = str3;
                                                                i9 = i12;
                                                                i4 = i13;
                                                                i12 = p2;
                                                                continue ;
                                                             }else {
                                                                c = str.charAt(i4);
                                                                if (uCharsetEnco.canEncode(c)) {
                                                                   i4 = i4 + 1;
                                                                }else {
                                                                   throw new fs7("Non-encodable character detected: "+c+" \(Unicode: "+c+')');
                                                                }
                                                             }
                                                          }else {
                                                          }
                                                       }
                                                    }else {
                                                       goto label_023f ;
                                                    }
                                                 }
                                              }else if(i2){
                                                 str2 = str2.append(900);
                                                 i14 = 0;
                                                 i2 = 0;
                                              }else {
                                                 i14 = i11;
                                              }
                                              i14 = h55.c(str, i3, i8, str2, i14);
                                              i3 = i3 + i8;
                                              str1 = str3;
                                              i4 = i13;
                                           }else if(i12 <= 0){
                                              char c2 = ((c2 = str.charAt(i8)) != 9 && (c2 != 10 && (c2 != c1 && (c2 < ' ' && c2 <= '~'))))? 0: 1;
                                              if (c2) {
                                                 i8 = i8 + 1;
                                              }else {
                                              label_01d8 :
                                                 i8 = i8 - i3;
                                                 goto label_01d9 ;
                                              }
                                           }
                                           i14 = 13;
                                           i4 = i13;
                                        }
                                     }else {
                                        goto label_01a8 ;
                                     }
                                  }
                               }else {
                                  i13 = i4;
                                  goto label_01d8 ;
                               }
                            }
                         }
                      }else {
                         str3 = str1;
                         i13 = i4;
                      }
                   }
                }else {
                   str3 = str1;
                   i13 = i4;
                   str2 = str2+902;
                   h55.b(0, i1, str, str2);
                }
             }else {
                str3 = str1;
                i13 = i4;
                byte[] bytes1 = str.getBytes(uCharset);
                h55.a(bytes1, bytes1.length, 1, str2);
             }
          }else {
             str3 = str1;
             i13 = i4;
             h55.c(str, 0, i1, str2, 0);
          }
          String str4 = str2;
          i10 = str4.length();
          uCharset = 0;
          float f = 0;
          i2 = 30;
          i3 = 2;
          while (true) {
             if (i3 <= i2) {
                i2 = i10 + 1;
                i2 = i2 + i6;
                i4 = i2 / i3;
                i4 = i4 + 1;
                int i15 = i3 * i4;
                i2 = i2 + i3;
                if (i15 >= i2) {
                   i4 = i4 - 1;
                }
                if (i4 >= 2) {
                   if (i4 <= 30) {
                      i2 = i3 * 17;
                      i2 = i2 + 69;
                      float f1 = (float)i2 * 0.36f;
                      float f2 = (float)i4 * 2.00f;
                      f1 = f1 / f2;
                      if (uCharset != null) {
                         float f3 = f1 - 3.00f;
                         if (((f2 = f - 3.00f)) > 0) {
                         label_0300 :
                            i3 = i3 + 1;
                            f1 = 30;
                         }
                      }
                      ointArray = new int[]{i3,i4};
                      f = f1;
                      goto label_0300 ;
                   }else {
                      goto label_0300 ;
                   }
                }else if(uCharset == null){
                   i1 = (i10 + 1) + i6;
                   i2 = (i1 / 2) + 1;
                   i3 = 2;
                   if (((i2 * 2)) >= (i1 + i3)) {
                      i2 = i2 - 1;
                   }
                   if (i2 < i3) {
                      ointArray = new int[i3]{2,2};
                   }
                }
                if (ointArray != null) {
                   i1 = ointArray[0];
                   i2 = 1;
                   int i16 = ointArray[i2];
                   i3 = ((i3 = (i1 * i16) - i6) > (i10 + 1))? (i3 - i10) - 1: 0;
                   i15 = 929;
                   if ((((i6 + i10) + i2)) <= i15) {
                      i10 = (i10 + i3) + i2;
                      str = new StringBuilder(i10);
                      str = str+(char)i10+str4;
                      for (i12 = 0; i12 < i3; i12 = i12 + 1) {
                         str = str.append(900);
                      }
                      str = str;
                      if (i5 >= 0 && i5 <= 8) {
                         char[] uocharArray = new char[i6];
                         i10 = str.length();
                         for (i2 = 0; i2 < i10; i2 = i2 + 1) {
                            i4 = i6 - 1;
                            i3 = str.charAt(i2) + uocharArray[i4];
                            i3 = i3 % i15;
                            while (true) {
                               b2 = is7.B;
                               if (i4 > 0) {
                                  i14 = b2[i5][i4] * i3;
                                  i14 = i14 % i15;
                                  i14 = i14 - 929;
                                  i7 = i4 - 1;
                                  i8 = uocharArray[i7] + i14;
                                  i8 = i8 % i15;
                                  uocharArray[i4] = (char)i8;
                                  i4 = i7;
                               }else {
                                  break ;
                               }
                            }
                            i14 = 0;
                            i3 = i3 * b2[i5][i14];
                            i3 = i3 % i15;
                            i3 = i3 - 929;
                            i3 = i3 % i15;
                            uocharArray[i14] = (char)i3;
                         }
                         str1 = new StringBuilder(i6);
                         while ((i6 = i6 - 1) >= 0) {
                            if (c3 = uocharArray[i6]) {
                               i2 = c3 - 929;
                               uocharArray[i6] = (char)i2;
                            }
                            str1 = str1.append(uocharArray[i6]);
                         }
                         zh2 ozh2 = new zh2(i16, i1);
                         str = kg4.l(str, str1);
                         i12 = 0;
                         i2 = 0;
                         while (i2 < i16) {
                            i3 = i2 % 3;
                            i4 = ozh2.a + 1;
                            ozh2.a = i4;
                            ye7.w(0x1fea8, 17, ozh2.c());
                            if (!i3) {
                               i4 = i2 / 3;
                               i4 = i4 * 30;
                               i6 = i16 - 1;
                               i6 = i6 / 3;
                               i6 = i6 + i4;
                               i14 = i1 - 1;
                            }else if(i3 == 1){
                               i4 = i2 / 3;
                               i4 = i4 * 30;
                               i6 = i5 * 3;
                               i6 = i6 + i4;
                               i14 = i16 - 1;
                               i7 = i14 % 3;
                               i6 = i6 + i7;
                               i14 = i14 / 3;
                            }else {
                               i4 = i2 / 3;
                               i4 = i4 * 30;
                               i6 = i1 - 1;
                               i6 = i6 + i4;
                               i14 = i5 * 3;
                               i14 = i14 + i4;
                               i4 = i16 - 1;
                               i4 = i4 % 3;
                               i14 = i14 + i4;
                            label_0404 :
                               p = ye7.p;
                               ye7.w(p[i3][i6], 17, ozh2.c());
                               for (i6 = 0; i6 < i1; i6 = i6 + 1) {
                                  ye7.w(p[i3][str.charAt(i12)], 17, ozh2.c());
                                  i12 = i12 + 1;
                               }
                               i6 = 0x3fa29;
                               if (b) {
                                  ye7.w(i6, 1, ozh2.c());
                               }else {
                                  ye7.w(p[i3][i14], 17, ozh2.c());
                                  ye7.w(i6, 18, ozh2.c());
                               }
                               i2 = i2 + 1;
                            }
                            i14 = i14 + i4;
                            goto label_0404 ;
                         }
                         byte[][] uobyteArray = ozh2.e(1, 4);
                         i12 = 0;
                         i16 = p2;
                         f = (i > i16)? 1: 0;
                         c3 = (uobyteArray[i12].length < uobyteArray.length)? 1: 0;
                         if (f != c3) {
                            uobyteArray = yy6.A(uobyteArray);
                            f = 1;
                         }else {
                            f = 0;
                         }
                         i12 = i16 / uobyteArray[i12].length;
                         i = i / uobyteArray.length;
                         if (i12 >= i) {
                            i12 = i;
                         }
                         if (i12 > 1) {
                            uobyteArray = ozh2.e(i12, (i12 << 2));
                            if (f) {
                               uobyteArray = yy6.A(uobyteArray);
                            }
                            ov10 = yy6.r(uobyteArray, i13);
                         }else {
                            ov10 = yy6.r(uobyteArray, i13);
                         }
                         return ov10;
                      }else {
                         throw new IllegalArgumentException(str3);
                      }
                   }else {
                      throw new fs7("Encoded message contains too many code words, message too big \("+p0.length()+" bytes\)");
                   }
                }else {
                   throw new fs7("Unable to fit message in columns");
                }
             }else {
             }
          }
       }else {
          throw new IllegalArgumentException(str1);
       }
    }
    private static v10 v(String p0,lx p1,int p2,int p3,Map p4){
       byte[] bytes;
       int len;
       ac4 w;
       int i4;
       int i5;
       ne0 one0;
       int i6;
       byte[] bytes1;
       int len1;
       int i7;
       qg7 oqg7;
       qg7 a2;
       int i8;
       r8 b5;
       int i9;
       int i10;
       u10 ou102;
       qg7 a3;
       int i11;
       int i13;
       int i14;
       oo1 ooo1;
       int i17;
       qg7 oqg71;
       qg7 oqg72;
       int i19;
       int i20;
       int[] ointArray2;
       byte[] uobyteArray1;
       Iterator iterator;
       j20 a4;
       qg7 oqg73;
       object oobject2;
       object oobject3;
       object oobject4;
       vy ovy2;
       u10 ou103;
       vy d1;
       object oobject5;
       qg7 a5;
       char c8;
       char c9;
       String str = p0;
       int i = p2;
       int i1 = p3;
       Map map = p4;
       if (p0.isEmpty()) {
          throw new IllegalArgumentException("Found empty contents");
       }
       if (p1 != lx.A) {
          throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(p1)));
       }
       if (i < 0 || i1 < 0) {
          throw new IllegalArgumentException("Requested dimensions are too small: "+i+'x'+i1);
       }
       oo1 b = oo1.b;
       if (map) {
          sl1 a = sl1.a;
          if (map.containsKey(a)) {
             b = oo1.valueOf(map.get(a).toString());
          }
          a = sl1.w;
          if (map.containsKey(a)) {
             int i2 = Integer.parseInt(map.get(a).toString());
          label_0046 :
             sl1 b1 = sl1.b;
             int i3 = (map != null && map.containsKey(b1))? 1: 0;
             String str1 = (i3)? map.get(b1).toString(): "ISO-8859-1";
             String str2 = "Shift_JIS";
             ac4 v = ac4.v;
             int[] b2 = b17.b;
             if (str2.equals(str1)) {
                try{
                   bytes = str.getBytes(str2);
                   len = bytes.length;
                   if (!((len % 2))) {
                      i4 = 0;
                      while (true) {
                         if (i4 < len) {
                            if ((i5 = bytes[i4] & 0x00ff) >= 129 && (i5 <= 159 || (i5 >= 224 && i5 <= 235))) {
                               i4 = i4 + 2;
                            }
                         }else {
                            oobject3 = 1;
                         }
                      }
                      throw new fs7("Invalid byte sequence");
                   }
                   bytes = 0;
                }catch(java.io.UnsupportedEncodingException e0){
                }
                if (bytes) {
                   w = ac4.w;
                }else {
                label_0099 :
                   oobject3 = 0;
                   oobject5 = 0;
                   i4 = 0;
                   while (true) {
                      if (i4 < p0.length()) {
                         if ((c9 = e0.charAt(i4)) >= '0' && c9 <= '9') {
                            oobject5 = 1;
                         }else if(c9 < '`'){
                            i11 = b2[c9];
                         }else {
                            i11 = -1;
                         }
                         if (i11 != -1) {
                            oobject3 = 1;
                         }else {
                         label_00c9 :
                            w = v;
                         }
                         i4 = i4 + 1;
                      }else if(oobject3){
                         w = ac4.t;
                      }else if(oobject5){
                         w = ac4.c;
                      }else {
                         goto label_00c9 ;
                      }
                   }
                }
             }else {
                goto label_0099 ;
             }
             u10 ou10 = new u10();
             i4 = 7;
             i5 = 8;
             if (w == v && (i3 && (one0 = ne0.t.get(str1)) != null)) {
                ou10.c(i4, 4);
                ou10.c(one0.a[0], i5);
             }
             sl1 c = sl1.C;
             i4 = (map != null && map.containsKey(c))? 1: 0;
             if (i4 && Boolean.valueOf(map.get(c).toString()).booleanValue()) {
                i4 = 4;
                ou10.c(5, i4);
             }else {
                i4 = 4;
             }
             ou10.c(w.b, i4);
             u10 ou101 = new u10();
             i4 = w.ordinal();
             i5 = 2;
             if (i4 != 1) {
                i6 = 6;
                if (i4 != i5) {
                   if (i4 != 4) {
                      if (i4 == i6) {
                         try{
                            bytes1 = e0.getBytes(str2);
                            len1 = bytes1.length;
                            i7 = 0;
                            while (true) {
                               if (i7 < len1) {
                                  i4 = bytes1[i7] & 0x00ff;
                                  i5 = i7 + 1;
                                  i5 = bytes1[i5] & 0x00ff;
                                  i4 = i4 << 8;
                                  i4 = i4 | i5;
                                  i5 = 0x8140;
                                  if (i4 < i5 || i4 > 0x9ffc) {
                                     if (i4 >= 0xe040 && i4 <= 0xebbf) {
                                        i5 = 0xc140;
                                     }else {
                                        i4 = -1;
                                     label_015e :
                                        if (i4 != -1) {
                                           i5 = i4 >> 8;
                                           i5 = i5 * 192;
                                           i4 = i4 & 0x00ff;
                                           i5 = i5 + i4;
                                           ou101.c(i5, 13);
                                           i7 = i7 + 2;
                                        }else {
                                        }
                                     }
                                  }
                                  i4 = i4 - i5;
                                  goto label_015e ;
                               }
                            }
                         }catch(java.io.UnsupportedEncodingException e0){
                            throw new fs7(e0);
                         }
                      }else {
                         throw new fs7("Invalid mode: ".concat(String.valueOf(w)));
                      }
                   }else {
                      try{
                         bytes1 = e0.getBytes(str1);
                         len1 = bytes1.length;
                         for (i7 = 0; i7 < len1; i7 = i7 + 1) {
                            ou101.c(bytes1[i7], 8);
                         }
                      }catch(java.io.UnsupportedEncodingException e0){
                         throw new fs7(e0);
                      }
                   }
                }else {
                   i8 = p0.length();
                   len1 = 0;
                   while (true) {
                      if (len1 < i8) {
                         i4 = ((c8 = e0.charAt(len1)) < '`')? b2[c8]: -1;
                         if (i4 != -1) {
                            if ((i5 = len1 + 1) < i8) {
                               i5 = ((c9 = e0.charAt(i5)) < '`')? b2[c9]: -1;
                               if (i5 != -1) {
                                  i4 = i4 * 45;
                                  i4 = i4 + i5;
                                  ou101.c(i4, 11);
                                  len1 = len1 + 2;
                               }else {
                                  throw new fs7();
                               }
                            }else {
                               ou101.c(i4, 6);
                               len1 = i5;
                               continue ;
                            }
                         }else {
                         }
                      }
                   }
                   throw new fs7();
                }
             }else {
                i8 = p0.length();
                len1 = 0;
                while (len1 < i8) {
                   i7 = e0.charAt(len1) - 48;
                   if ((i4 = len1 + 2) < i8) {
                      i5 = len1 + 1;
                      i5 = e0.charAt(i5) - 48;
                      i4 = e0.charAt(i4) - 48;
                      i7 = i7 * 100;
                      i5 = i5 * 10;
                      i5 = i5 + i7;
                      i5 = i5 + i4;
                      ou101.c(i5, 10);
                      len1 = len1 + 3;
                   }else if((len1 = len1 + 1) < i8){
                      len1 = e0.charAt(len1) - 48;
                      i7 = i7 * 10;
                      i7 = i7 + len1;
                      ou101.c(i7, 7);
                      len1 = i4;
                      continue ;
                   }else {
                      ou101.c(i7, 4);
                      continue ;
                   }
                }
             }
             bytes1 = 26;
             len1 = 9;
             ac4 a1 = w.a;
             if (map != null) {
                sl1 b3 = sl1.B;
                if (map.containsKey(b3)) {
                   oqg7 = qg7.b(Integer.parseInt(map.get(b3).toString()));
                   u10 b4 = ou10.b;
                   if ((a2 = oqg7.a) <= len1) {
                      i8 = 0;
                   }else if(a2 <= bytes1){
                      i8 = 1;
                   }else {
                      i8 = 2;
                   }
                   i8 = (a1[i8] + b4) + ou101.b;
                   object oobject = oqg7.b[b.ordinal()];
                   b5 = oobject.b;
                   r8 c1 = oobject.c;
                   i5 = c1.length;
                   i6 = 0;
                   i9 = 0;
                   while (i6 < i5) {
                      i9 = i9 + c1[i6].a;
                      i6 = i6 + 1;
                      i10 = p0;
                   }
                   i10 = (((oqg7.c - (i9 * b5))) >= ((i8 + 7) / 8))? 1: 0;
                   if (i10) {
                   label_0359 :
                      ou102 = new u10();
                      u10 b6 = ou10.b;
                      ou102.d((ou102.b + b6));
                      for (len1 = 0; len1 < b6; len1 = len1 + 1) {
                         ou102.a(ou10.e(len1));
                      }
                      i8 = (w == v)? (ou101.b + 7) / 8: p0.length();
                      if ((a3 = oqg7.a) <= 9) {
                         len1 = 0;
                      }else if(a3 <= 26){
                         len1 = 1;
                      }else {
                         len1 = 2;
                      }
                      len1 = a1[len1];
                      i11 = 1 << len1;
                      if (i8 < i11) {
                         ou102.c(i8, len1);
                         b6 = ou101.b;
                         ou102.d((ou102.b + b6));
                         for (len1 = 0; len1 < b6; len1 = len1 + 1) {
                            ou102.a(ou101.e(len1));
                         }
                         object oobject1 = oqg7.b[b.ordinal()];
                         r8 b7 = oobject1.b;
                         c1 = oobject1.c;
                         i11 = c1.length;
                         i7 = 0;
                         for (int i12 = 0; i12 < i11; i12 = i12 + 1) {
                            i7 = i7 + c1[i12].a;
                         }
                         qg7 c2 = oqg7.c;
                         len1 = c2 - (i7 * b7);
                         i11 = len1 << 3;
                         if (ou102.b <= i11) {
                            for (i12 = 0; i12 < 4 && ou102.b < i11; i12 = i12 + 1) {
                               ou102.a(false);
                            }
                            i12 = false;
                            i7 = ou102.b & 0x07;
                            len = 8;
                            if (i7 > 0) {
                               while (i7 < len) {
                                  ou102.a(i12);
                                  i7 = i7 + 1;
                                  i12 = 0;
                               }
                            }
                            i12 = len1 - ((ou102.b + 7) / len);
                            for (i7 = 0; i7 < i12; i7 = i7 + 1) {
                               len = (!(len = i7 & 0x01))? 236: 17;
                               ou102.c(len, 8);
                            }
                            if (ou102.b == i11) {
                               r8 c3 = oobject1.c;
                               i11 = c3.length;
                               i7 = 0;
                               for (i12 = 0; i12 < i11; i12 = i12 + 1) {
                                  i7 = i7 + c3[i12].a;
                               }
                               if ((((ou102.b + 7) / 8)) == len1) {
                                  ArrayList uArrayList = new ArrayList(i7);
                                  i11 = 0;
                                  i12 = 0;
                                  len = 0;
                                  i4 = 0;
                                  while (true) {
                                     if (i11 < i7) {
                                        int[] ointArray = new int[1];
                                        int[] ointArray1 = new int[1];
                                        if (i11 < i7) {
                                           i9 = c2 % i7;
                                           i1 = i7 - i9;
                                           i13 = c2 / i7;
                                           i14 = i13 + 1;
                                           int i15 = len1 / i7;
                                           int i16 = i15 + 1;
                                           i = i13 - i15;
                                           i13 = i2;
                                           i2 = i14 - i16;
                                           if (i == i2) {
                                              ooo1 = b;
                                              i17 = i1 + i9;
                                              if (i7 == i17) {
                                                 i17 = i15 + i;
                                                 i17 = i17 * i1;
                                                 int i18 = i16 + i2;
                                                 i18 = i18 * i9;
                                                 i17 = i18 + i17;
                                                 if (c2 == i17) {
                                                    if (i11 < i1) {
                                                       i1 = 0;
                                                       ointArray[i1] = i15;
                                                       ointArray1[i1] = i;
                                                    }else {
                                                       i1 = 0;
                                                       ointArray[i1] = i16;
                                                       ointArray1[i1] = i2;
                                                    }
                                                    i = ointArray[i1];
                                                    byte[] uobyteArray = new byte[i];
                                                    i17 = i12 << 3;
                                                    i2 = 0;
                                                    while (i2 < i) {
                                                       oqg71 = oqg7;
                                                       oqg72 = c2;
                                                       i19 = i7;
                                                       i20 = 0;
                                                       for (i3 = 0; i3 < 8; i3 = i3 + 1) {
                                                          if (ou102.e(i17)) {
                                                             i7 = i3 - 7;
                                                             i7 = 1 << i7;
                                                             i20 = i20 | i7;
                                                          }
                                                          i17 = i17 + 1;
                                                       }
                                                       i3 = i2 + 0;
                                                       uobyteArray[i3] = (byte)i20;
                                                       i2 = i2 + 1;
                                                       i7 = i19;
                                                       oqg7 = oqg71;
                                                       c2 = oqg72;
                                                    }
                                                    oqg71 = oqg7;
                                                    oqg72 = c2;
                                                    i19 = i7;
                                                    i20 = ointArray1[0];
                                                    i17 = i + i20;
                                                    ointArray2 = new int[i17];
                                                    for (i2 = 0; i2 < i; i2 = i2 + 1) {
                                                       i3 = uobyteArray[i2] & 0x00ff;
                                                       ointArray2[i2] = i3;
                                                    }
                                                    new li5(oi2.k).b(ointArray2, i20);
                                                    uobyteArray1 = new byte[i20];
                                                    for (i3 = 0; i3 < i20; i3 = i3 + 1) {
                                                       i7 = i + i3;
                                                       uobyteArray1[i3] = (byte)ointArray2[i7];
                                                    }
                                                    uArrayList.add(new j20(uobyteArray, uobyteArray1));
                                                    len = Math.max(len, i);
                                                    i4 = Math.max(i4, i20);
                                                    i12 = i12 + ointArray[0];
                                                    i11 = i11 + 1;
                                                    i7 = i19;
                                                    oqg7 = oqg71;
                                                    i2 = i13;
                                                    b = ooo1;
                                                    c2 = oqg72;
                                                 }else {
                                                 }
                                              }else {
                                                 throw new fs7("RS blocks mismatch");
                                              }
                                           }else {
                                              throw new fs7("EC bytes mismatch");
                                           }
                                        }else {
                                           throw new fs7("Block ID too large");
                                        }
                                     }else {
                                        oqg71 = oqg7;
                                        ooo1 = b;
                                        i13 = i2;
                                        oqg72 = c2;
                                        if (len1 == i12) {
                                           ou102 = new u10();
                                           i = 0;
                                           while (i < len) {
                                              iterator = uArrayList.iterator();
                                              while (iterator.hasNext()) {
                                                 a4 = iterator.next().a;
                                                 if (i < a4.length) {
                                                    ou102.c(a4[i], 8);
                                                 }else {
                                                    continue ;
                                                 }
                                              }
                                              i = i + 1;
                                           }
                                           i = 0;
                                           while (i < i4) {
                                              iterator = uArrayList.iterator();
                                              while (iterator.hasNext()) {
                                                 a4 = iterator.next().b;
                                                 if (i < a4.length) {
                                                    ou102.c(a4[i], 8);
                                                 }else {
                                                    continue ;
                                                 }
                                              }
                                              i = i + 1;
                                           }
                                           if ((oqg73 = oqg72) == ((ou102.b + 7) / 8)) {
                                              oqg7 = oqg71;
                                              vy ovy = new vy(((oqg7.a * 4) + 17), ((oqg7.a * 4) + 17), 2);
                                              i = Integer.MAX_VALUE;
                                              ointArray2 = 8;
                                              i2 = -1;
                                              i8 = 0;
                                              while (i8 < ointArray2) {
                                                 b = ooo1;
                                                 ye7.i(ou102, b, oqg7, i8, ovy);
                                                 len1 = co5.b(ovy, false) + co5.b(ovy, true);
                                                 vy d = ovy.d;
                                                 vy b8 = ovy.b;
                                                 vy c4 = ovy.c;
                                                 i7 = 0;
                                                 len = 0;
                                                 while (true) {
                                                    i4 = c4 - 1;
                                                    if (i7 < i4) {
                                                       oobject2 = d[i7];
                                                       i5 = 0;
                                                       while (true) {
                                                          i6 = b8 - 1;
                                                          if (i5 < i6) {
                                                             i6 = oobject2[i5];
                                                             i9 = i5 + 1;
                                                             vy ovy1 = b8;
                                                             if (i6 == oobject2[i9]) {
                                                                i11 = i7 + 1;
                                                                oobject3 = d[i11];
                                                                if (i6 == oobject3[i5] && i6 == oobject3[i9]) {
                                                                   len = len + 1;
                                                                }
                                                             }
                                                             i5 = i9;
                                                             b8 = ovy1;
                                                          }else {
                                                             break ;
                                                          }
                                                       }
                                                       i7 = i7 + 1;
                                                    }else {
                                                       break ;
                                                    }
                                                 }
                                                 len = len * 3;
                                                 len = len + len1;
                                                 d = ovy.d;
                                                 vy b9 = ovy.b;
                                                 b8 = ovy.c;
                                                 i7 = 0;
                                                 for (i12 = 0; i12 < b8; i12 = i12 + 1) {
                                                    for (i4 = 0; i4 < b9; b9 = ovy2) {
                                                       oobject4 = d[i12];
                                                       if ((i6 = i4 + 6) < b9) {
                                                          ovy2 = b9;
                                                          ou103 = ou102;
                                                          ou102 = 1;
                                                          if (oobject4[i4] == ou102 && (!(len1 = i4 + 1) && ((len1 = i4 + 2) == ou102 && ((len1 = i4 + 3) == ou102 && ((len1 = i4 + 4) == ou102 && (!(len1 = i4 + 5) && oobject4[i6] == ou102)))))) {
                                                             len1 = i4 - 4;
                                                             len1 = Math.max(len1, 0);
                                                             i6 = Math.min(i4, oobject4.length);
                                                             while (true) {
                                                                if (len1 < i6) {
                                                                   int i21 = i6;
                                                                   if (oobject4[len1] == ou102) {
                                                                      ou102 = 0;
                                                                   label_0642 :
                                                                      if (!ou102) {
                                                                         i10 = i4 + 7;
                                                                         len1 = i4 + 11;
                                                                         i10 = Math.max(i10, 0);
                                                                         len1 = Math.min(len1, oobject4.length);
                                                                         while (true) {
                                                                            if (i10 < len1) {
                                                                               i21 = len1;
                                                                               if (oobject4[i10] == 1) {
                                                                                  ou102 = 0;
                                                                               label_0663 :
                                                                                  if (!ou102) {
                                                                                  label_066c :
                                                                                     if ((i10 = i12 + 6) < b8) {
                                                                                        oobject4 = 1;
                                                                                        if (d[i12][i4] == oobject4 && (!(len1 = i12 + 1) && ((len1 = i12 + 2) == oobject4 && ((len1 = i12 + 3) == oobject4 && ((len1 = i12 + 4) == oobject4 && (!(len1 = i12 + 5) && d[i10][i4] == oobject4)))))) {
                                                                                           i10 = i12 - 4;
                                                                                           i10 = Math.max(i10, 0);
                                                                                           len1 = Math.min(i12, d.length);
                                                                                           while (true) {
                                                                                              if (i10 < len1) {
                                                                                                 if (d[i10][i4] == oobject4) {
                                                                                                    ou102 = 0;
                                                                                                 label_06c0 :
                                                                                                    if (!ou102) {
                                                                                                       i10 = i12 + 7;
                                                                                                       len1 = i12 + 11;
                                                                                                       i10 = Math.max(i10, 0);
                                                                                                       len1 = Math.min(len1, d.length);
                                                                                                       while (true) {
                                                                                                          if (i10 < len1) {
                                                                                                             if (d[i10][i4] == 1) {
                                                                                                                ou102 = 0;
                                                                                                             label_06df :
                                                                                                                if (!ou102) {
                                                                                                                label_06e3 :
                                                                                                                   i4 = i4 + 1;
                                                                                                                   ou102 = ou103;
                                                                                                                }
                                                                                                             }else {
                                                                                                                i10 = i10 + 1;
                                                                                                             }
                                                                                                          }else {
                                                                                                             ou102 = 1;
                                                                                                             goto label_06df ;
                                                                                                          }
                                                                                                       }
                                                                                                    }
                                                                                                    i7 = i7 + 1;
                                                                                                    goto label_06e3 ;
                                                                                                 }else {
                                                                                                    i10 = i10 + 1;
                                                                                                    oobject4 = 1;
                                                                                                 }
                                                                                              }else {
                                                                                                 ou102 = 1;
                                                                                                 goto label_06c0 ;
                                                                                              }
                                                                                           }
                                                                                        }else {
                                                                                           goto label_06e3 ;
                                                                                        }
                                                                                     }else {
                                                                                        goto label_06e3 ;
                                                                                     }
                                                                                  }
                                                                               }else {
                                                                                  i10 = i10 + 1;
                                                                                  len1 = i21;
                                                                               }
                                                                            }else {
                                                                               ou102 = 1;
                                                                               goto label_0663 ;
                                                                            }
                                                                         }
                                                                      }
                                                                      i7 = i7 + 1;
                                                                      goto label_066c ;
                                                                   }else {
                                                                      len1 = len1 + 1;
                                                                      ou102 = 1;
                                                                      i6 = i21;
                                                                   }
                                                                }else {
                                                                   ou102 = 1;
                                                                   goto label_0642 ;
                                                                }
                                                             }
                                                          }else {
                                                             goto label_066c ;
                                                          }
                                                       }else {
                                                          ou103 = ou102;
                                                          ovy2 = b9;
                                                          goto label_066c ;
                                                       }
                                                    }
                                                 }
                                                 ou103 = ou102;
                                                 i7 = i7 * 40;
                                                 i7 = i7 + len;
                                                 d1 = ovy.d;
                                                 d = ovy.b;
                                                 b9 = ovy.c;
                                                 i11 = 0;
                                                 i12 = 0;
                                                 while (i11 < b9) {
                                                    oobject5 = d1[i11];
                                                    i4 = 0;
                                                    while (i4 < d) {
                                                       if (oobject5[i4] == 1) {
                                                          i12 = i12 + 1;
                                                       }
                                                       i4 = i4 + 1;
                                                    }
                                                    i11 = i11 + 1;
                                                 }
                                                 i10 = ovy.c * ovy.b;
                                                 i3 = i12 << 1;
                                                 i3 = i3 - i10;
                                                 i3 = Math.abs(i3) * 10;
                                                 i3 = i3 / i10;
                                                 i3 = i3 * 10;
                                                 if ((i3 = i3 + i7) < i) {
                                                    i2 = i8;
                                                    i = i3;
                                                 }
                                                 i8 = i8 + 1;
                                                 ou102 = ou103;
                                                 ooo1 = b;
                                                 ointArray2 = 8;
                                              }
                                              ye7.i(ou102, ooo1, oqg7, i2, ovy);
                                              d1 = ovy.b;
                                              vy c5 = ovy.c;
                                              i20 = i13 << 1;
                                              i17 = d1 + i20;
                                              i20 = i20 + c5;
                                              i2 = Math.max(p2, i17);
                                              i8 = Math.max(p3, i20);
                                              i20 = Math.min((i2 / i17), (i8 / i20));
                                              i17 = (i2 - (d1 * i20)) / 2;
                                              i3 = (i8 - (c5 * i20)) / 2;
                                              v10 ov10 = new v10(i2, i8);
                                              i2 = 0;
                                              while (i2 < c5) {
                                                 i8 = 0;
                                                 i11 = i17;
                                                 while (i8 < d1) {
                                                    if (ovy.a(i8, i2) == 1) {
                                                       ov10.d(i11, i3, i20, i20);
                                                    }
                                                    i8 = i8 + 1;
                                                    i11 = i11 + i20;
                                                 }
                                                 i2 = i2 + 1;
                                                 i3 = i3 + i20;
                                              }
                                              return ov10;
                                           }else {
                                              throw new fs7(kg4.r("Interleaving error: ", oqg73, " and ")+((ou102.b + 7) / 8)+" differ.");
                                           }
                                        }else {
                                           throw new fs7("Data bytes does not match offset");
                                        }
                                     }
                                  }
                                  throw new fs7("Total bytes mismatch");
                               }else {
                                  throw new fs7("Number of bits and data bytes does not match");
                               }
                            }else {
                               throw new fs7("Bits size does not equal capacity");
                            }
                         }else {
                            throw new fs7("data bits cannot fit in the QR Code"+ou102.b+" > "+i11);
                         }
                      }else {
                         throw new fs7(i8+" is bigger than "+(i11 - 1));
                      }
                   }else {
                      throw new fs7("Data too big for requested version");
                   }
                }
             }
             u10 b10 = ou10.b;
             if ((a5 = qg7.b(1).a) <= 9) {
                i10 = 0;
             }else if(a5 <= 26){
                i10 = 1;
             }else {
                i10 = 2;
             }
             i10 = (a1[i10] + b10) + ou101.b;
             i20 = 1;
             while (true) {
                str1 = "Data too big";
                if (i20 > 40) {
                   throw new fs7(str1);
                }
                a3 = qg7.b(i20);
                qg7 c6 = a3.c;
                oobject4 = a3.b[b.ordinal()];
                r8 b11 = oobject4.b;
                r8 c7 = oobject4.c;
                i9 = i20;
                i20 = c7.length;
                i14 = 0;
                String str3 = str1;
                for (i8 = 0; i8 < i20; i20 = i20) {
                   i14 = i14 + c7[i8].a;
                   i8 = i8 + 1;
                }
                i14 = i14 * b11;
                i4 = c6 - i14;
                i20 = i10 + 7;
                i20 = i20 / 8;
                b10 = (i4 >= i20)? 1: 0;
                if (b10) {
                   ou102 = ou10.b;
                   if ((oqg7 = a3.a) <= 9) {
                      i20 = 0;
                   }else if(oqg7 <= 26){
                      i20 = 1;
                   }else {
                      i20 = 2;
                   }
                   i20 = (a1[i20] + ou102) + ou101.b;
                   a5 = 40;
                   i8 = 1;
                   while (true) {
                      if (i8 > a5) {
                         throw new fs7(str3);
                      }
                      a5 = qg7.b(i8);
                      a3 = a5.c;
                      oobject2 = a5.b[b.ordinal()];
                      c7 = oobject2.b;
                      b5 = oobject2.c;
                      i6 = b5.length;
                      i13 = 0;
                      qg7 oqg74 = a5;
                      for (i10 = 0; i10 < i6; i6 = i6) {
                         i13 = i13 + b5[i10].a;
                         i10 = i10 + 1;
                      }
                      i13 = i13 * c7;
                      len1 = a3 - i13;
                      i10 = i20 + 7;
                      i10 = i10 / 8;
                      a5 = (len1 >= i10)? 1: 0;
                      if (a5) {
                         oqg7 = oqg74;
                         goto label_0359 ;
                      }else {
                         i8 = i8 + 1;
                         a5 = 40;
                         i2 = i2;
                      }
                   }
                }else {
                   i20 = i9 + 1;
                   i2 = i2;
                }
             }
          }
       }
       uobyteArray1 = 4;
       goto label_0046 ;
    }
    public static String x(StringBuilder p0){
       int i1;
       int i = 0;
       if (!(i1 = p0.length() - i)) {
          throw new IllegalStateException("StringBuilder must not be empty");
       }
       char c = p0.charAt(i);
       char c1 = (i1 >= 2)? p0.charAt(1): 0;
       char c2 = (i1 >= 3)? p0.charAt(2): 0;
       if (i1 >= 4) {
          i = p0.charAt(3);
       }
       int i2 = (((c << 18) + (c1 << 12)) + (c2 << 6)) + i;
       c = (char)((i2 >> 8) & 0x00ff);
       char c3 = (char)(i2 & 0x00ff);
       StringBuilder str = new StringBuilder(3)+(char)((i2 >> 16) & 0x00ff);
       if (i1 >= 2) {
          str = str+c;
       }
       if (i1 >= 3) {
          str = str+c3;
       }
       return str;
    }
    public void B(TabLayout p0,View p1,View p2,float p3,Drawable p4){
       RectF rectF = yy6.s(p0, p1);
       RectF rectF1 = yy6.s(p0, p2);
       int i = (int)rectF.left;
       int i1 = Math.round(((float)((int)rectF1.left - i) * p3)) + i;
       int i2 = (int)rectF.right;
       int i3 = Math.round((p3 * (float)((int)rectF1.right - i2))) + i2;
       p4.setBounds(i1, p4.getBounds().top, i3, p4.getBounds().bottom);
    }
    public final void a(){
    }
    public final File b(){
       return null;
    }
    public final Object c(){
       ExecutorService uExecutorSer;
       switch (this.a){
           case 1:
             return new lx7();
           case 2:
             return new iy7();
           case 3:
             uExecutorSer = Executors.newSingleThreadExecutor(a18.a);
             tu6.E(uExecutorSer);
             return uExecutorSer;
           case 4:
             uExecutorSer = Executors.newSingleThreadExecutor(e18.a);
             tu6.E(uExecutorSer);
             return uExecutorSer;
           default:
             return new xv7();
       }
    }
    public final File d(){
       return null;
    }
    public final v10 e(String p0,lx p1,int p2,int p3,Map p4){
       yy6 oyy6;
       int i12;
       int i13;
       aq2 a;
       Iterator iterator;
       kr6 okr6;
       LinkedList linkedList1;
       kr6 okr62;
       char c;
       int[][] d;
       int i14;
       int i15;
       int i16;
       String str1;
       v10 i16;
       int i17;
       int i18;
       v10 ov10;
       dx6 uodx6;
       wl1 e;
       wl1 owl11;
       kb3 a4;
       int i20;
       int i21;
       vy b7;
       v10 ov101;
       String str = p0;
       int i = p1;
       int i1 = p2;
       int i2 = p3;
       Map map = p4;
       int i3 = 23;
       int i4 = 7;
       int i5 = 6;
       int i6 = 5;
       int i7 = 3;
       int i8 = 4;
       int i9 = 2;
       int i10 = 0;
       int i11 = 1;
       switch (this.a){
           case 18:
             switch (p1.ordinal()){
                 case 0:
                   oyy6 = new yy6(19);
                   break;
                 case 1:
                   oyy6 = new jh0();
                   break;
                 case 2:
                   oyy6 = new lh0(1);
                   break;
                 case 3:
                   oyy6 = new lh0(2);
                   break;
                 case 4:
                   oyy6 = new lh0(0);
                   break;
                 case 5:
                   oyy6 = new yy6(20);
                   break;
                 case 6:
                   oyy6 = new ag1(1);
                   break;
                 case 7:
                   oyy6 = new ag1(0);
                   break;
                 case 8:
                   oyy6 = new n53();
                   break;
                 case 10:
                   oyy6 = new yy6(25);
                   break;
                 case 11:
                   oyy6 = new yy6(26);
                   break;
                 case 14:
                   oyy6 = new u44(i3);
                   break;
                 case 15:
                   oyy6 = new ag1(2);
                   break;
                 default:
                   throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(p1)));
             }
             return oyy6.e(p0, p1, p2, p3, p4);
             break;
           case 19:
             Charset iSO_8859_1 = StandardCharsets.ISO_8859_1;
             i12 = 33;
             if (map) {
                sl1 b = sl1.b;
                if (map.containsKey(b)) {
                   iSO_8859_1 = Charset.forName(map.get(b).toString());
                }
                b = sl1.a;
                if (map.containsKey(b)) {
                   i12 = Integer.parseInt(map.get(b).toString());
                }
                b = sl1.A;
                if (map.containsKey(b)) {
                   i13 = Integer.parseInt(map.get(b).toString());
                label_04fa :
                   if (i == lx.a) {
                      aq2 uoaq2 = new aq2(str.getBytes(iSO_8859_1));
                      List list = Collections.singletonList(kr6.e);
                      i = 0;
                      while (true) {
                         a = uoaq2.a;
                         i6 = 32;
                         i7 = 10;
                         if (i < a.length) {
                            i8 = ((i4 = i + 1) < a.length)? a[i4]: 0;
                            if ((i9 = a[i]) != 13) {
                               if (i9 != 44) {
                                  if (i9 != 46) {
                                     if (i9 != 58 || i8 != i6) {
                                     label_0543 :
                                        i6 = 0;
                                     }else {
                                        i6 = 5;
                                     }
                                  }else if(i8 == i6){
                                     i6 = 3;
                                  }else {
                                     goto label_0543 ;
                                  }
                               }else if(i8 == i6){
                                  i6 = 4;
                               }else {
                                  goto label_0543 ;
                               }
                            }else if(i8 == i7){
                               i6 = 2;
                            }else {
                               goto label_0543 ;
                            }
                            if (i6 > 0) {
                               LinkedList linkedList = new LinkedList();
                               iterator = list.iterator();
                               while (iterator.hasNext()) {
                                  okr6 = iterator.next();
                                  kr6 okr61 = okr6.b(i);
                                  i8 = 4;
                                  linkedList.add(okr61.d(i8, i6));
                                  if (okr6.a != i8) {
                                     linkedList.add(okr61.e(i8, i6));
                                  }
                                  if (i6 == 3 || i6 == i8) {
                                     i8 = i6 - 16;
                                     i9 = 2;
                                     okr61 = okr61.d(i9, i8);
                                     linkedList.add(okr61.d(i9, 1));
                                  }
                                  if (okr6.c > null) {
                                     linkedList.add(okr6.a(i).a(i4));
                                  }
                               }
                               list = aq2.a(linkedList);
                               i = i4;
                            }else {
                               linkedList1 = new LinkedList();
                               iterator = list.iterator();
                               while (iterator.hasNext()) {
                                  okr62 = iterator.next();
                                  i7 = a[i] & 0x00ff;
                                  c = (char)i7;
                                  d = aq2.d;
                                  i8 = (d[okr62.a][c] > 0)? 1: 0;
                                  i10 = 0;
                                  i14 = 0;
                                  while (true) {
                                     okr6 = okr62.a;
                                     Iterator iterator1 = iterator;
                                     if (i10 <= 4) {
                                        if ((i11 = d[i10][c]) > 0) {
                                           if (i14 == null) {
                                              i14 = okr62.b(i);
                                           }
                                           kr6 okr63 = i14;
                                           if (!i8 || (i10 == okr6 || i10 == 2)) {
                                              linkedList1.add(okr63.d(i10, i11));
                                           }
                                           if (!i8 && aq2.e[okr6][i10] >= 0) {
                                              linkedList1.add(okr63.e(i10, i11));
                                           }
                                           i14 = okr63;
                                        }
                                        i10 = i10 + 1;
                                        iterator = iterator1;
                                        i2 = p3;
                                     }else if(okr62.c <= null && d[okr6][c]){
                                        linkedList1.add(okr62.a(i));
                                     }
                                     iterator = iterator1;
                                     i2 = p3;
                                  }
                               }
                               list = aq2.a(linkedList1);
                            }
                            i = i + 1;
                            i2 = p3;
                         }else {
                            break ;
                         }
                      }
                      kr6 okr64 = Collections.min(list, new lk5(4, uoaq2));
                      okr64.getClass();
                      LinkedList linkedList2 = new LinkedList();
                      okr64 = okr64.b(a.length).b;
                      while (okr64 != null) {
                         linkedList2.addFirst(okr64);
                         t57 a1 = okr64.a;
                      }
                      u10 ou10 = new u10();
                      Iterator iterator2 = linkedList2.iterator();
                      while (iterator2.hasNext()) {
                         iterator2.next().a(ou10, a);
                      }
                      u10 b1 = ou10.b;
                      i = 11;
                      i12 = ((i12 * b1) / 100) + i;
                      i15 = b1 + i12;
                      int[] f = tu6.F;
                      if (i13) {
                         i15 = (i13 < 0)? 1: 0;
                         i4 = Math.abs(i13);
                         if (i15) {
                            okr62 = 4;
                         }
                         if (i4 <= okr62) {
                            i16 = (i15)? 88: 112;
                            i16 = (i16 + (i4 << 4)) * i4;
                            i2 = f[i4];
                            ou10 = tu6.C(i2, ou10);
                            u10 b2 = ou10.b;
                            str1 = "Data to large for user specified layer";
                            if (((i12 + b2)) <= (i16 - (i16 % i2))) {
                               if (i15 && b2 > (i2 << 6)) {
                                  throw new IllegalArgumentException(str1);
                               }
                            }else {
                               throw new IllegalArgumentException(str1);
                            }
                         }else {
                            Object[] objArray = new Object[]{Integer.valueOf(i13)};
                            throw new IllegalArgumentException(String.format("Illegal value %s for layers", objArray));
                         }
                      }else {
                         i13 = 0;
                         linkedList1 = 0;
                         str1 = null;
                         while (true) {
                            if (i13 > i6) {
                               throw new IllegalArgumentException("Data too large for an Aztec code");
                            }
                            d = (i13 <= 3)? 1: 0;
                            i10 = (d)? i13 + 1: i13;
                            int i19 = (d)? 88: 112;
                            i14 = i10 << 4;
                            i19 = i19 + i14;
                            i16 = i19 * i10;
                            if (i15 <= i16) {
                               if (str1 != null && linkedList1 == f[i10]) {
                                  i3 = linkedList1;
                               }else {
                                  i3 = f[i10];
                                  str1 = tu6.C(i3, ou10);
                               }
                               i4 = i16 % i3;
                               i4 = i16 - i4;
                               if (d) {
                                  i8 = i3 << 6;
                                  if (str1.b > i8) {
                                  label_070a :
                                     i4 = i3;
                                  }
                               }
                               if ((i6 = str1.b + i12) > i4) {
                                  goto label_070a ;
                               }else {
                                  i2 = i3;
                                  ou10 = str1;
                                  i15 = d;
                                  i4 = i10;
                               }
                            }else {
                               i10 = p3;
                            }
                            i13 = i13 + 1;
                            okr62 = 32;
                         }
                         return ov10;
                      }
                      u10 ou101 = tu6.q(ou10, i16, i2);
                      i11 = ou10.b / i2;
                      u10 ou102 = new u10();
                      if (i15) {
                         ou102.c((i4 - 1), 2);
                         ou102.c((i11 - 1), 6);
                         ou10 = tu6.q(ou102, 28, 4);
                      }else {
                         ou102.c((i4 - 1), 5);
                         ou102.c((i11 - 1), i);
                         ou10 = tu6.q(ou102, 40, 4);
                      }
                      if (!i15) {
                         i = 14;
                      }
                      i = i + (i4 << 2);
                      f = new int[i];
                      if (i15) {
                         for (i6 = 0; i6 < i; i6 = i6 + 1) {
                            f[i6] = i6;
                         }
                         i3 = i;
                      }else {
                         i12 = i / 2;
                         str1 = 2;
                         i3 = (((i12 - 1) / 15) * 2) + (i + 1);
                         i16 = i3 / 2;
                         for (i6 = 0; i6 < i12; i6 = i6 + 1) {
                            i5 = i6 / 15;
                            i5 = i5 + i6;
                            i8 = i12 - i6;
                            i9 = 1;
                            i8 = i8 - i9;
                            i10 = i16 - i5;
                            i10 = i10 - i9;
                            f[i8] = i10;
                            i8 = i12 + i6;
                            i5 = i5 + i16;
                            str1 = i5 + i9;
                            f[i8] = str1;
                         }
                      }
                      i16 = new v10(i3, i3);
                      i12 = 0;
                      i6 = 0;
                      while (i6 < i4) {
                         i5 = i4 - i6;
                         i5 = i5 << 2;
                         i8 = (i15)? 9: 12;
                         str1 = i5 + i8;
                         i8 = 0;
                         while (i8 < str1) {
                            i9 = i8 << 1;
                            c = 2;
                            i10 = 0;
                            while (i10 < c) {
                               i7 = i12 + i9;
                               if (i7 = i7 + i10) {
                                  i7 = i6 << 1;
                                  i17 = i7 + i10;
                                  i18 = i4;
                                  i7 = i7 + i8;
                                  i16.c(f[i17], f[i7]);
                               }else {
                                  i18 = i4;
                               }
                               i4 = str1 << 1;
                               i4 = i4 + i12;
                               i4 = i4 + i9;
                               if (i4 = i4 + i10) {
                                  i4 = i6 << 1;
                                  i7 = i4 + i8;
                                  i17 = i - 1;
                                  i17 = i17 - i4;
                                  i17 = i17 - i10;
                                  i16.c(f[i7], f[i17]);
                               }
                               i4 = str1 << 2;
                               i4 = i4 + i12;
                               i4 = i4 + i9;
                               if (i4 = i4 + i10) {
                                  i4 = i - 1;
                                  i7 = i6 << 1;
                                  i4 = i4 - i7;
                                  i7 = i4 - i10;
                                  i4 = i4 - i8;
                                  i16.c(f[i7], f[i4]);
                               }
                               i4 = str1 * 6;
                               i4 = i4 + i12;
                               i4 = i4 + i9;
                               if (i4 = i4 + i10) {
                                  i4 = i - 1;
                                  i7 = i6 << 1;
                                  i4 = i4 - i7;
                                  i4 = i4 - i8;
                                  i7 = i7 + i10;
                                  i16.c(f[i4], f[i7]);
                               }
                               i10 = i10 + 1;
                               i4 = i18;
                               c = 2;
                            }
                            i8 = i8 + 1;
                            c = 10;
                         }
                         i18 = str1 << 3;
                         i12 = i12 + i18;
                         i6 = i6 + 1;
                         i4 = i4;
                         c = 10;
                      }
                      i2 = i3 / 2;
                      if (i15) {
                         ou101 = 7;
                         i6 = 0;
                         while (i6 < ou101) {
                            i13 = i2 - 3;
                            i13 = i13 + i6;
                            if (ou10.e(i6)) {
                               i12 = i2 - 5;
                               i16.c(i13, i12);
                            }
                            if (i12 = i6 + 7) {
                               i12 = i2 + 5;
                               i16.c(i12, i13);
                            }
                            if (i12 = i6 - 20) {
                               i12 = i2 + 5;
                               i16.c(i13, i12);
                            }
                            if (i12 = i6 - 27) {
                               i12 = i2 - 5;
                               i16.c(i12, i13);
                            }
                            i6 = i6 + 1;
                            ou101 = 7;
                         }
                      }else {
                         i6 = 0;
                         c = 10;
                         while (i6 < c) {
                            i13 = i2 - 5;
                            i13 = i13 + i6;
                            i12 = i6 / 5;
                            i12 = i12 + i13;
                            if (ou10.e(i6)) {
                               i13 = i2 - 7;
                               i16.c(i12, i13);
                            }
                            if (i13 = i6 + 10) {
                               i13 = i2 + 7;
                               i16.c(i13, i12);
                            }
                            if (i13 = i6 - 29) {
                               i13 = i2 + 7;
                               i16.c(i12, i13);
                            }
                            if (i13 = i6 - 39) {
                               i13 = i2 - 7;
                               i16.c(i13, i12);
                            }
                            i6 = i6 + 1;
                         }
                      }
                      if (i15) {
                         tu6.o(i16, i2, 5);
                      }else {
                         tu6.o(i16, i2, 7);
                         i11 = 0;
                         i6 = 0;
                         while (true) {
                            i13 = i / 2;
                            i13 = i13 - 1;
                            if (i6 < i13) {
                               for (i15 = i2 & 0x01; i15 < i3; i15 = i15 + 2) {
                                  i13 = i2 - i11;
                                  i16.c(i13, i15);
                                  i12 = i2 + i11;
                                  i16.c(i12, i15);
                                  i16.c(i15, i13);
                                  i16.c(i15, i12);
                               }
                               i6 = i6 + 15;
                               i11 = i11 + 16;
                               i15 = 2;
                            }
                         }
                      }
                      v10 a2 = i16.a;
                      i15 = Math.max(i1, a2);
                      v10 b3 = i16.b;
                      i1 = Math.max(p3, b3);
                      i2 = Math.min((i15 / a2), (i1 / b3));
                      i13 = (i15 - (a2 * i2)) / 2;
                      i3 = (i1 - (b3 * i2)) / 2;
                      ov10 = new v10(i15, i1);
                      i6 = 0;
                      while (i6 < b3) {
                         i1 = i13;
                         i15 = 0;
                         while (i15 < a2) {
                            if (i16.a(i15, i6)) {
                               ov10.d(i1, i3, i2, i2);
                            }
                            i15 = i15 + 1;
                            i1 = i1 + i2;
                         }
                         i6 = i6 + 1;
                         i3 = i3 + i2;
                      }
                   }else {
                      throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(p1)));
                   }
                }
             }
             i13 = 0;
             goto label_04fa ;
             break;
           case 20:
             if (p0.isEmpty()) {
                throw new IllegalArgumentException("Found empty contents");
             }
             if (i != lx.v) {
                throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(p1)));
             }
             if (i1 < 0 || i2 < 0) {
                throw new IllegalArgumentException("Requested dimensions can\'t be negative: "+i1+'x'+i2);
             }
             dx6 a3 = dx6.a;
             if (map != null) {
                if ((uodx6 = map.get(sl1.c)) != null) {
                   a3 = uodx6;
                }
                tp2.v(map.get(sl1.t));
                tp2.v(map.get(sl1.v));
             }
             ul1[] oul1Array = new ul1[i5];
             oul1Array[i10] = new yy6(21);
             oul1Array[i11] = new yy6(i3);
             oul1Array[i9] = new f27(i10);
             oul1Array[i7] = new f27(i11);
             oul1Array[i8] = new yy6(24);
             oul1Array[i6] = new yy6(22);
             wl1 owl1 = new wl1(str);
             owl1.b = a3;
             str1 = "\x1e\x04";
             if ((str.startsWith("[\)>\x1e05\x1d") && str.endsWith(str1))) {
                owl1.e(236);
                owl1.g = i9;
                owl1.d = owl1.d + i4;
             }else if((str.startsWith("[\)>\x1e06\x1d") && str.endsWith(str1))){
                owl1.e(237);
                owl1.g = i9;
                owl1.d = owl1.d + i4;
             }
             i15 = 0;
             while (owl1.c()) {
                oul1Array[i15].q(owl1);
                if ((e = owl1.e) >= null) {
                   owl1.e = -1;
                   owl11 = e;
                }
             }
             owl1.d(owl1.a());
             cx6 b4 = owl1.f.b;
             char c1 = 254;
             if (owl1.a() < b4 && (i15 != null && (i15 != i6 && i15 != i8))) {
                owl1.e(c1);
             }
             owl11 = owl1.c;
             char c2 = 129;
             if (owl11.length() < b4) {
                str = owl11+c2;
             }
             while (str.length() < b4) {
                i13 = str.length() + i11;
                i13 = i13 * 149;
                i13 = i13 % 253;
                i13 = i13 + i11;
                if ((i13 = i13 + c2) > c1) {
                   i13 = i13 - 254;
                }
                str = str.append((char)i13);
             }
             str = str;
             cx6 uocx6 = cx6.e(str.length(), a3);
             cx6 b5 = uocx6.b;
             if (str.length() == b5) {
                b4 = uocx6.c;
                StringBuilder str2 = new StringBuilder((b5 + b4))+str;
                if ((i5 = uocx6.c()) == i11) {
                   str2 = str2+no1.a(b4, str);
                }else {
                   str2.setLength(str2.capacity());
                   int[] ointArray = new int[i5];
                   int[] ointArray1 = new int[i5];
                   int[] ointArray2 = new int[i5];
                   i8 = 0;
                   while (i8 < i5) {
                      i7 = i8 + 1;
                      ointArray[i8] = uocx6.a(i7);
                      ointArray1[i8] = uocx6.h;
                      ointArray2[i8] = i10;
                      if (i8 > 0) {
                         i9 = i8 - 1;
                         i9 = ointArray2[i9] + ointArray[i8];
                         ointArray2[i8] = i9;
                      }
                      i8 = i7;
                      d = 2;
                   }
                   i6 = 0;
                   while (i6 < i5) {
                      String str3 = new StringBuilder(ointArray[i6]);
                      for (i8 = i6; i8 < b5; i8 = i8 + i5) {
                         str3 = str3.append(str.charAt(i8));
                      }
                      str3 = no1.a(ointArray1[i6], str3.toString());
                      i8 = i6;
                      i9 = 0;
                      while (true) {
                         i11 = ointArray1[i6] * i5;
                         if (i8 < i11) {
                            i11 = b5 + i8;
                            i20 = i9 + 1;
                            str2.setCharAt(i11, str3.charAt(i9));
                            i8 = i8 + i5;
                            b7 = 1;
                         }else {
                            break ;
                         }
                      }
                      i6 = i6 + 1;
                      b7 = 1;
                   }
                }
                b5 = uocx6.d;
                cx6 e1 = uocx6.e;
                kb3 okb3 = new kb3(str2, (uocx6.b() * b5), (uocx6.d() * e1));
                i11 = 4;
                i13 = 0;
                i3 = 0;
                while (true) {
                   a4 = okb3.a;
                   if (i11 == a4 && !i13) {
                      i7 = i3 + 1;
                      i5 = a4 - 1;
                      okb3.h(i5, i10, i3, 1);
                      i5 = okb3.a - 1;
                      i9 = 2;
                      okb3.h(i5, 1, i3, i9);
                      i5 = okb3.a - 1;
                      okb3.h(i5, i9, i3, 3);
                      i5 = okb3.b - i9;
                      okb3.h(i10, i5, i3, 4);
                      i5 = okb3.b - 1;
                      okb3.h(i10, i5, i3, 5);
                      i5 = okb3.b - 1;
                      okb3.h(1, i5, i3, 6);
                      i5 = okb3.b - 1;
                      okb3.h(i9, i5, i3, 7);
                      i5 = okb3.b - 1;
                      okb3.h(3, i5, i3, 8);
                      i3 = i7;
                      break ;
                   }else {
                      break ;
                   }
                }
                a4 = okb3.a;
                i6 = a4 - 2;
                if (i11 == i6 && (!i13 && (i6 = okb3.b % 4))) {
                   i6 = i3 + 1;
                   i5 = a4 - 3;
                   okb3.h(i5, i10, i3, 1);
                   i5 = okb3.a - 2;
                   okb3.h(i5, i10, i3, 2);
                   i5 = okb3.a - 1;
                   okb3.h(i5, i10, i3, 3);
                   i9 = 4;
                   i5 = okb3.b - i9;
                   okb3.h(i10, i5, i3, i9);
                   i5 = okb3.b - 3;
                   okb3.h(i10, i5, i3, 5);
                   i5 = okb3.b - 2;
                   okb3.h(i10, i5, i3, 6);
                   i7 = 1;
                   i5 = okb3.b - i7;
                   okb3.h(i10, i5, i3, 7);
                   i5 = okb3.b - i7;
                   okb3.h(i7, i5, i3, 8);
                   i3 = i6;
                }
                a4 = okb3.a;
                i6 = a4 - 2;
                if (i11 == i6 && (!i13 && (i6 = okb3.b % 8) == 4)) {
                   i6 = i3 + 1;
                   i5 = a4 - 3;
                   okb3.h(i5, i10, i3, 1);
                   i5 = okb3.a - 2;
                   okb3.h(i5, i10, i3, 2);
                   i5 = okb3.a - 1;
                   okb3.h(i5, i10, i3, 3);
                   i5 = okb3.b - 2;
                   okb3.h(i10, i5, i3, 4);
                   i5 = okb3.b - 1;
                   okb3.h(i10, i5, i3, 5);
                   i5 = okb3.b - 1;
                   okb3.h(1, i5, i3, 6);
                   i5 = okb3.b - 1;
                   okb3.h(2, i5, i3, 7);
                   i5 = okb3.b - 1;
                   okb3.h(3, i5, i3, 8);
                   i3 = i6;
                }
                a4 = okb3.a;
                i6 = a4 + 4;
                if (i11 == i6 && (i13 == 2 && !(i6 = okb3.b % 8))) {
                   i6 = i3 + 1;
                   i5 = a4 - 1;
                   i8 = 1;
                   okb3.h(i5, i10, i3, i8);
                   i5 = okb3.a - i8;
                   i8 = okb3.b - i8;
                   okb3.h(i5, i8, i3, 2);
                   i5 = okb3.b - 3;
                   okb3.h(i10, i5, i3, 3);
                   i5 = okb3.b - 2;
                   okb3.h(i10, i5, i3, 4);
                   i5 = okb3.b - i8;
                   okb3.h(i10, i5, i3, 5);
                   i5 = okb3.b - 3;
                   okb3.h(i8, i5, i3, 6);
                   i5 = okb3.b - 2;
                   okb3.h(i8, i5, i3, 7);
                   i5 = okb3.b - i8;
                   okb3.h(i8, i5, i3, 8);
                   i3 = i6;
                }
                do {
                   if (i11 < okb3.a && (i13 >= 0 && !okb3.g(i13, i11))) {
                      i5 = i3 + 1;
                      okb3.k(i11, i13, i3);
                      i3 = i5;
                   }
                   i11 = i11 - 2;
                   i13 = i13 + 2;
                } while (i11 >= 0 && i13 < okb3.b);
                i11 = i11 + 1;
                i13 = i13 + 3;
                do {
                   if (i11 >= 0 && (i13 < okb3.b && !okb3.g(i13, i11))) {
                      i5 = i3 + 1;
                      okb3.k(i11, i13, i3);
                      i3 = i5;
                   }
                   i11 = i11 + 2;
                   i13 = i13 - 2;
                   a4 = okb3.a;
                } while (i11 < a4 && i13 >= 0);
                i11 = i11 + 3;
                i13 = i13 + 1;
                if (i11 >= a4) {
                   kb3 b6 = okb3.b;
                   if (i13 >= b6) {
                      i7 = 1;
                      if (!okb3.g((b6 - i7), (a4 - i7))) {
                         okb3.i((okb3.b - i7), i7, (okb3.a - i7));
                         i13 = 2;
                         okb3.i((okb3.b - i13), i7, (okb3.a - i13));
                      }
                      i11 = uocx6.b() * b5;
                      i13 = uocx6.d() * e1;
                      vy ovy = new vy(((uocx6.b() * b5) + (uocx6.b() << 1)), ((uocx6.d() * e1) + (uocx6.d() << 1)), 2);
                      i5 = 0;
                      i6 = 0;
                      while (i5 < i13) {
                         if (!(i7 = i5 % e1)) {
                            i8 = 0;
                            i9 = 0;
                            while (true) {
                               i20 = uocx6.b() * b5;
                               i17 = uocx6.b() << 1;
                               i10 = i20 + i17;
                               if (i8 < i10) {
                                  i10 = (!(i10 = i8 % 2))? true: false;
                                  ovy.d(i9, i10, i6);
                                  i9 = i9 + 1;
                                  i8 = i8 + 1;
                                  i10 = 0;
                               }else {
                                  break ;
                               }
                            }
                            i6 = i6 + 1;
                         }
                         i8 = 0;
                         i9 = 0;
                         while (i8 < i11) {
                            i10 = i8 % b5;
                            i18 = i11;
                            if (!i10) {
                               ovy.d(i9, true, i6);
                               i9 = i9 + 1;
                            }
                            i21 = i13;
                            i13 = okb3.b * i5;
                            i13 = i13 + i8;
                            i13 = 1;
                            i11 = (okb3.d[i13] == i13)? true: false;
                            ovy.d(i9, i11, i6);
                            i9 = i9 + i13;
                            i11 = b5 - 1;
                            if (i10 == i11) {
                               i11 = (!(i11 = i5 % 2))? true: false;
                               ovy.d(i9, i11, i6);
                               i9 = i9 + 1;
                            }
                            i8 = i8 + 1;
                            i11 = i18;
                            i13 = i21;
                         }
                         i18 = i11;
                         i21 = i13;
                         i6 = i6 + 1;
                         i11 = e1 - 1;
                         if (i7 == i11) {
                            i11 = 0;
                            i13 = 0;
                            while (true) {
                               i7 = uocx6.b() * b5;
                               i9 = 1;
                               i8 = uocx6.b() << i9;
                               i7 = i7 + i8;
                               if (i11 < i7) {
                                  ovy.d(i13, i9, i6);
                                  i13 = i13 + i9;
                                  i11 = i11 + 1;
                               }else {
                                  break ;
                               }
                            }
                            i6 = i6 + 1;
                         }
                         i5 = i5 + 1;
                         i11 = i18;
                         i13 = i21;
                         i10 = 0;
                      }
                      b7 = ovy.b;
                      vy c3 = ovy.c;
                      i = Math.max(i1, b7);
                      i13 = Math.max(i2, c3);
                      i12 = Math.min((i / b7), (i13 / c3));
                      i4 = 2;
                      i = (i - (b7 * i12)) / i4;
                      i5 = c3 * i12;
                      i13 = (i13 - i5) / i4;
                      if (i2 >= c3 && i1 >= b7) {
                         ov101 = new v10(i1, i2);
                      }else {
                         ov101 = new v10(b7, c3);
                         uocx6 = 0;
                         i13 = 0;
                      }
                      v10 t = ov101.t;
                      i2 = t.length;
                      for (i5 = 0; i5 < i2; i5 = i5 + 1) {
                         t[i5] = 0;
                      }
                      i1 = 0;
                      while (i1 < c3) {
                         i5 = uocx6;
                         i2 = 0;
                         while (i2 < b7) {
                            if (ovy.a(i2, i1) == 1) {
                               ov101.d(i5, i13, i12, i12);
                            }
                            i2 = i2 + 1;
                            i5 = i5 + i12;
                         }
                         i1 = i1 + 1;
                         i13 = i13 + i12;
                      }
                      return ov101;
                   }
                }
                i10 = 0;
             }else {
                throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
             }
             break;
           case 25:
           default:
             return yy6.v(p0, p1, p2, p3, p4);
       }
       return yy6.u(p0, p1, p2, p3, p4);
    }
    public final String f(){
       return null;
    }
    public final void g(vf p0){
       Log.isLoggable("FirebaseCrashlytics", 3);
    }
    public final byte[] h(){
       return null;
    }
    public final File i(){
       return null;
    }
    public final File j(){
       return null;
    }
    public final void k(){
    }
    public final File l(){
       return null;
    }
    public final void m(Bundle p0){
       Log.isLoggable("FirebaseCrashlytics", 3);
    }
    public final File n(){
       return null;
    }
    public final void o(String p0,long p1){
    }
    public final File p(){
       return null;
    }
    public void q(wl1 p0){
       int i4;
       int i5;
       int i6;
       char c2;
       int i7;
       StringBuilder str1;
       int i9;
       String str2;
       int i11;
       char c5;
       cx6 uocx6 = null;
       wl1 a = p0.a;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       char c = 0;
       int i3 = 1;
       switch (this.a){
           case 21:
             wl1 d = p0.d;
             i4 = a.length();
             if (d < i4) {
                char c1 = a.charAt(d);
                i5 = 0;
                while (true) {
                   if (c1 >= '0' && c1 <= '9') {
                      i6 = 1;
                   label_015c :
                      if (i6 && d < i4) {
                         i5 = i5 + 1;
                         if ((d = d + 1) < i4) {
                            c1 = a.charAt(d);
                         }
                      }
                   }else {
                      i6 = 0;
                      goto label_015c ;
                   }
                }
             }else {
                i5 = 0;
             }
             if (i5 >= i2) {
                c2 = a.charAt(p0.d);
                char c3 = a.charAt((p0.d + i3));
                i4 = (c2 >= '0' && c2 <= '9')? 1: 0;
                if (i4) {
                   if (c3 >= '0' && c3 <= '9') {
                      c = 1;
                   }
                   if (c) {
                      p0.e((char)(((c3 - 48) + ((c2 - 48) * 10)) + 130));
                      p0.d = p0.d + i2;
                   }
                }
                throw new IllegalArgumentException("not digits: "+c2+c3);
             }else {
                c2 = p0.b();
                if ((i7 = ox7.A(a, p0.d, this.y())) != this.y()) {
                   if (i7 != i3) {
                      if (i7 != i2) {
                         if (i7 != i1) {
                            if (i7 != i) {
                               int i8 = 5;
                               if (i7 == i8) {
                                  p0.e(231);
                                  p0.e = i8;
                               }else {
                                  throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(i7)));
                               }
                            }else {
                               p0.e(240);
                               p0.e = i;
                            }
                         }else {
                            p0.e(238);
                            p0.e = i1;
                         }
                      }else {
                         p0.e(239);
                         p0.e = i2;
                      }
                   }else {
                      p0.e(230);
                      p0.e = i3;
                   }
                }else if(ox7.u(c2)){
                   p0.e(235);
                   p0.e((char)((c2 - 128) + i3));
                   p0.d = p0.d + i3;
                }else {
                   p0.e((char)(c2 + i3));
                   p0.d = p0.d + i3;
                }
             }
             break;
           case 22:
             StringBuilder str = c;
             while (true) {
                if (p0.c()) {
                   str = str.append(p0.b());
                   i4 = p0.d + i3;
                   p0.d = i4;
                   if (ox7.A(a, i4, this.y()) != this.y()) {
                      p0.e = c;
                   }
                }
                i7 = str.length() - i3;
                i4 = (p0.a() + i7) + i3;
                p0.d(i4);
                i4 = (((p0.f.b - i4)) > 0)? 1: 0;
                if (p0.c() || i4) {
                   i4 = 249;
                   if (i7 <= i4) {
                      str.setCharAt(c, (char)i7);
                   }else if(i7 <= 1555){
                      str.setCharAt(c, (char)((i7 / 250) + i4));
                      str.insert(i3, (char)(i7 % 250));
                   }else {
                      throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(i7)));
                   }
                }
                i7 = str.length();
             label_0115 :
                if (c < i7) {
                   i = p0.a() + i3;
                   i = i * 149;
                   i = i % 255;
                   i = i + i3;
                   if ((i = i + str.charAt(c)) > 255) {
                      i = i - 256;
                   }
                   p0.e((char)i);
                   c = c + 1;
                   goto label_0115 ;
                }else {
                   break ;
                }
             }
             return;
             break;
           case 23:
             str1 = "";
             while (p0.c()) {
                i9 = p0.d + i3;
                p0.d = i9;
                i = this.w(p0.b(), str1);
                i9 = str1.length() / i1;
                i9 = i9 << i3;
                int i10 = p0.a() + i9;
                p0.d(i10);
                i9 = p0.f.b - i10;
                if (!p0.c()) {
                   str2 = "";
                   if ((i11 = str1.length() % i1) == i2 && (i9 < i2 && i9 <= i2)) {
                      i2 = str1.length();
                      str1.delete((i2 - i), i2);
                      p0.d = p0.d - 1;
                      i = this.w(p0.b(), str2);
                      p0.f = uocx6;
                   }
                   while ((i2 = str1.length() % i1) == i3 && (i <= i1 && (i9 != i3 || i > i1))) {
                      i2 = str1.length();
                      i = i2 - i;
                      str1.delete(i, i2);
                      i = p0.d - 1;
                      p0.d = i;
                      i = this.w(p0.b(), str2);
                      p0.f = uocx6;
                   }
                   this.z(p0, str1);
                   return;
                }
             }
             break;
           default:
             str1 = "";
             while (true) {
                wl1 c4 = p0.c;
                if (p0.c()) {
                   if ((c5 = p0.b()) >= ' ' && c5 <= '?') {
                      str1 = str1.append(c5);
                   }else if(c5 >= '@' && c5 <= '^'){
                      i9 = c5 - 64;
                      str1 = str1.append((char)i9);
                   }else {
                      ox7.t(c5);
                      throw uocx6;
                   }
                   i9 = p0.d + i3;
                   p0.d = i9;
                   if (str1.length() >= i) {
                      c4 = c4.append(yy6.x(str1));
                      str1.delete(c, i);
                      if (ox7.A(a, p0.d, this.y()) != this.y()) {
                         p0.e = c;
                      }
                   }
                }
                str1 = str1+31;
                if (!(i9 = str1.length())) {
                   p0.e = c;
                   break ;
                }else if(i9 == i3){
                   p0.d(p0.a());
                   int i12 = p0.f.b - p0.a();
                   if ((i7 = (a.length() - p0.g) - p0.d) > i12) {
                      p0.d((p0.a() + i3));
                      i12 = p0.f.b - p0.a();
                   }
                   if (i7 > i12 || i12 > i2) {
                   label_02ca :
                      if (i9 <= i) {
                         i9 = i9 - i3;
                         str2 = yy6.x(str1);
                         if (!((p0.c() ^ i3)) || i9 > i2) {
                            i3 = 0;
                         }
                         if (i9 <= i2) {
                            p0.d((p0.a() + i9));
                            if (((p0.f.b - p0.a())) >= i1) {
                               p0.d((p0.a() + str2.length()));
                               i3 = 0;
                            }
                         }
                         if (i3) {
                            p0.f = uocx6;
                            p0.d = p0.d - i9;
                         }else {
                            c4+str2;
                         }
                      }else {
                         throw new IllegalStateException("Count must not exceed 4");
                      }
                   }
                }else {
                   goto label_02ca ;
                }
                p0.e = c;
                break ;
             }
             return;
       }
       return;
    }
    public int w(char p0,StringBuilder p1){
       int i = 1;
       char c = ' ';
       if (p0 == c) {
          p1+3;
          return i;
       }else {
          char c1 = '0';
          if (p0 >= c1 && p0 <= '9') {
             p1+(char)((p0 - c1) + 4);
             return i;
          }else {
             c1 = 'A';
             if (p0 >= c1 && p0 <= 'Z') {
                p1+(char)((p0 - c1) + 14);
                return i;
             }else if(p0 < c){
                p1+0+p0;
                return 2;
             }else {
                c = '!';
                if (p0 >= c && p0 <= '/') {
                   p1+i+(char)(p0 - c);
                   return 2;
                }else {
                   c = ':';
                   if (p0 >= c && p0 <= '@') {
                      p1+i+(char)((p0 - c) + 15);
                      return 2;
                   }else {
                      c = '[';
                      if (p0 >= c && p0 <= '_') {
                         p1+i+(char)((p0 - c) + 22);
                         return 2;
                      }else {
                         char c2 = '`';
                         if (p0 < c2 || p0 > 127) {
                            return (this.w((char)(p0 - 128), p1+"\x01\x1e") + 2);
                         }
                         p1+2+(char)(p0 - c2);
                         return 2;
                      }
                   }
                }
             }
          }
       }
    }
    public int y(){
       switch (this.a){
           case 21:
             return 0;
           case 22:
             return 5;
           case 23:
             return 1;
           default:
             return 4;
       }
    }
    public void z(wl1 p0,StringBuilder p1){
       int i = 1;
       int i1 = p1.length() % 3;
       int i2 = p0.a() + ((p1.length() / 3) << i);
       p0.d(i2);
       int i3 = p0.f.b - i2;
       if (i1 == 2) {
          p1 = p1+0;
          while (p1.length() >= 3) {
             yy6.C(p0, p1);
          }
          if (p0.c()) {
             p0.e(254);
          }
       }else if(i3 == i && i1 == i){
          while (p1.length() >= 3) {
             yy6.C(p0, p1);
          }
          if (p0.c()) {
             p0.e(254);
          }
          p0.d = p0.d - i;
       }else if(!i1){
          while (p1.length() >= 3) {
             yy6.C(p0, p1);
          }
          if (i3 > 0 || p0.c()) {
             p0.e(254);
          }
       }else {
          throw new IllegalStateException("Unexpected case. Please report!");
       }
       p0.e = 0;
       return;
    }
}
