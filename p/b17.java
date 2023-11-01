package p.b17;
import p.w54;
import p.c65;
import p.ps3;
import p.yy6;
import java.lang.String;
import p.qz3;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.TypedArray;
import p.mt0;
import android.content.res.Resources$Theme;
import java.io.File;
import java.io.FileOutputStream;
import p.oe0;
import java.nio.charset.Charset;
import java.lang.Object;
import p.co5;
import java.lang.Math;
import p.en6;
import p.cd2;
import p.pr;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import p.wo1;
import p.r45;
import java.lang.Boolean;
import p.h80;
import com.google.protobuf.c;
import com.google.protobuf.b;
import java.lang.Class;
import p.vy5;
import java.lang.CharSequence;
import p.av6;
import java.lang.IllegalArgumentException;
import p.et0;
import p.b3;
import java.lang.System;
import p.sz1;
import p.gq5;
import p.fl6;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import p.jb1;
import p.ib1;
import p.oi;
import p.fm3;
import p.ao2;
import p.sc;
import java.lang.StringBuilder;
import java.lang.NullPointerException;
import p.xe7;
import java.lang.IllegalStateException;
import android.view.View$MeasureSpec;
import p.ay;
import java.util.Locale;
import p.i80;
import org.json.JSONObject;
import java.io.FileInputStream;
import java.io.InputStream;
import p.ej4;
import p.ul0;
import java.lang.Throwable;
import p.tx5;
import p.eb3;
import p.y96;
import org.json.JSONArray;
import p.om2;
import java.util.Iterator;
import p.tm2;
import java.util.Arrays;
import p.a3;
import p.az5;
import p.um2;

public abstract class b17 implements w54	// class@001036 from classes.dex
{
    public static final c65 a;
    public static final int[] b;
    public static final char[] c;
    public static final int[] t;
    public static final int[] v;
    public static final int[] w;
    public static final ps3 x;
    public static final yy6 y;

    static {
       b17.a = new c65(12);
       b17.b = new int[96]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'$',-1,-1,-1,'%','&',-1,-1,-1,-1,39,'(',-1,')','*','+',0,1,2,3,4,5,6,7,8,9,',',-1,-1,-1,-1,-1,-1,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,'!','"','#',-1,-1,-1,-1,-1};
       b17.c = new char[16]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
       b17.t = new int[2]{0x1010000,0x7f030647};
       int[] ointArray = new int[]{0x7f0303dc};
       b17.v = ointArray;
       ointArray = new int[]{0x7f0306b6};
       b17.w = ointArray;
       b17.x = new ps3(6);
       b17.y = new yy6(2);
    }
    public static String A(byte[] p0){
       if (p0 == null) {
          return "";
       }
       char[] uocharArray = new char[(p0.length * 2)];
       for (int i = 0; i < p0.length; i = i + 1) {
          int i1 = p0[i] & 0x00ff;
          int i2 = i * 2;
          char[] c = b17.c;
          int i3 = i1 >> 4;
          uocharArray[i2] = c[i3];
          i2 = i2 + 1;
          i1 = i1 & 0x0f;
          uocharArray[i2] = c[i1];
       }
       return new String(uocharArray);
    }
    public static final qz3 B(qz3 p0){
       qz3 a = p0.a;
       int i = a[0];
       int i1 = a[1];
       int[] ointArray = new int[]{i1,i};
       qz3 oqz3 = new qz3(ointArray);
       p0 = p0.c;
       qz3 c = oqz3.c;
       if (i > 0) {
          int i2 = 0;
          while (true) {
             int i3 = i2 + 1;
             if (i1 > 0) {
                int i4 = 0;
                while (true) {
                   int i5 = i4 + 1;
                   int i6 = i4 * i;
                   i6 = i6 + i2;
                   int i7 = i2 * i1;
                   i7 = i7 + i4;
                   c[i6] = p0[i7];
                   if (i5 >= i1) {
                      break ;
                   }else {
                      i4 = i5;
                   }
                }
                if (i3 < i) {
                   i2 = i3;
                }
             }else {
             }
          }
       }
       return oqz3;
    }
    public static final qz3 C(qz3 p0){
       qz3 a = p0.a;
       int i = a[0];
       int i1 = a[1];
       int i2 = 2;
       int i3 = a[i2];
       int[] ointArray = new int[]{i3,i1,i};
       qz3 oqz3 = new qz3(ointArray);
       p0 = p0.c;
       qz3 c = oqz3.c;
       if (i > 0) {
          i2 = 0;
          while (true) {
             int i4 = i2 + 1;
             if (i1 > 0) {
                int i5 = 0;
                while (true) {
                   int i6 = i5 + 1;
                   if (i3 > 0) {
                      int i7 = 0;
                      while (true) {
                         int i8 = i7 + 1;
                         int i9 = i7 * i;
                         i9 = i9 * i1;
                         int i10 = i5 * i;
                         i10 = i10 + i9;
                         i10 = i10 + i2;
                         i9 = i2 * i1;
                         i9 = i9 * i3;
                         int i11 = i5 * i3;
                         i11 = i11 + i9;
                         i11 = i11 + i7;
                         c[i10] = p0[i11];
                         if (i8 >= i3) {
                            break ;
                         }else {
                            i7 = i8;
                         }
                      }
                      if (i6 >= i1) {
                      }else {
                         i5 = i6;
                      }
                   }else {
                   }
                }
             }else if(i4 >= i){
                i2 = i4;
             }
          }
       }
       return oqz3;
    }
    public static Context D(Context p0,AttributeSet p1,int p2,int p3){
       TypedArray typedArray = p0.obtainStyledAttributes(p1, b17.v, p2, p3);
       p3 = 0;
       int resourceId = typedArray.getResourceId(p3, p3);
       typedArray.recycle();
       typedArray = (p0 instanceof mt0 && p0.a == resourceId)? 1: 0;
       if (resourceId && !typedArray) {
          mt0 omt0 = new mt0(p0, resourceId);
          TypedArray typedArray1 = p0.obtainStyledAttributes(p1, b17.t);
          int resourceId1 = typedArray1.getResourceId(p3, p3);
          p3 = typedArray1.getResourceId(1, p3);
          typedArray1.recycle();
          if (!resourceId1) {
             resourceId1 = p3;
          }
          if (resourceId1) {
             omt0.getTheme().applyStyle(resourceId1, 1);
          }
          return omt0;
       }else {
          return p0;
       }
    }
    public static final void E(String p0,String p1){
       File uFile;
       try{
          if ((uFile = b17.n()) != null && (p0 != null && p1 != null)) {
             File uFile1 = new File(uFile, p0);
             FileOutputStream uFileOutputS = new FileOutputStream(uFile1);
             byte[] bytes = p1.getBytes(oe0.a);
             co5.l(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
             uFileOutputS.write(bytes);
             uFileOutputS.close();
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static float a(float p0){
       p0 = ((p0 - 0x3d25aee6) <= 0)? p0 / 12.92f: (float)Math.pow((double)((p0 + 0.05f) / 0x3f870a3d), 2.40f);
       return p0;
    }
    public static float b(float p0){
       p0 = ((p0 - 0x3b4d2e1c) <= 0)? p0 * 12.92f: (float)((Math.pow((double)p0, 0x3fdaaaaaa0000000) * 0x3ff0e147a0000000) - 0x3fac28f5c0000000);
       return p0;
    }
    public static final String c(){
       int i1;
       String str;
       int i = 1;
       if (i1 = en6.A(i)) {
          if (i1 == i) {
             str = "no_data";
          }else {
             throw new cd2(10);
          }
       }else {
          str = "legacy";
       }
       return str;
    }
    public static final void d(qz3 p0,qz3 p1){
       co5.o(p1, "b");
       qz3 a = p0.a;
       int i = a[0];
       int i1 = a[1];
       int i2 = a[2];
       p0 = p0.c;
       p1 = p1.c;
       if (i > 0) {
          int i3 = 0;
          while (true) {
             int i4 = i3 + 1;
             if (i1 > 0) {
                int i5 = 0;
                while (true) {
                   int i6 = i5 + 1;
                   if (i2 > 0) {
                      int i7 = 0;
                      while (true) {
                         int i8 = i7 + 1;
                         int i9 = i3 * i1;
                         i9 = i9 * i2;
                         int i10 = i5 * i2;
                         i10 = i10 + i9;
                         i10 = i10 + i7;
                         float f = p0[i10] + p1[i7];
                         p0[i10] = f;
                         if (i8 >= i2) {
                            break ;
                         }else {
                            i7 = i8;
                         }
                      }
                      if (i6 >= i1) {
                      }else {
                         i5 = i6;
                      }
                   }else {
                   }
                }
             }else if(i4 >= i){
                i3 = i4;
             }
          }
       }
       return;
    }
    public static int f(int p0,int p1,int p2){
       if (p0 < p1) {
          return p1;
       }
       if (p0 > p2) {
          return p2;
       }
       return p0;
    }
    public static final EsCommandOptions$CommandOptions g(pr p0){
       Object obj;
       wo1 owo1 = EsCommandOptions$CommandOptions.j();
       pr a = p0.a;
       if (a.c()) {
          obj = a.b();
          co5.l(obj, "commandOptions.overrideRestrictions\(\).get\(\)");
          owo1.e(obj.booleanValue());
       }
       a = p0.b;
       if (a.c()) {
          obj = a.b();
          co5.l(obj, "commandOptions.onlyForLocalDevice\(\).get\(\)");
          owo1.c(obj.booleanValue());
       }
       a = p0.c;
       if (a.c()) {
          obj = a.b();
          co5.l(obj, "commandOptions.systemInitiated\(\).get\(\)");
          owo1.f(obj.booleanValue());
       }
       p0 = p0.d;
       if (p0.c()) {
          p0 = p0.b();
          co5.l(p0, "commandOptions.onlyForPlaybackId\(\).get\(\)");
          owo1.d(b17.u(p0));
       }
       c uoc = owo1.build();
       co5.l(uoc, "newBuilder\(\).apply {\n   …)\n        }\n    }.build\(\)");
       return uoc;
    }
    public static final qz3 h(qz3 p0,qz3 p1){
       qz3 oqz32;
       int i15;
       qz3 oqz3 = p0;
       qz3 obj = p1;
       co5.o(obj, "w");
       qz3 a = oqz3.a;
       int i = 0;
       int i1 = a[i];
       int i2 = a[1];
       int i3 = 2;
       int i4 = a[i3];
       qz3 a1 = obj.a;
       int i5 = a1[i];
       int i6 = (i2 - i5) + 1;
       int i7 = a1[i3];
       int[] ointArray = new int[]{i1,i6,i7};
       qz3 oqz31 = new qz3(ointArray);
       oqz3 = oqz3.c;
       qz3 c = oqz31.c;
       obj = obj.c;
       if (i1 > 0) {
          i3 = 0;
          while (true) {
             int i8 = i3 + 1;
             if (i7 > 0) {
                int i9 = 0;
                while (true) {
                   int i10 = i9 + 1;
                   if (i6 > 0) {
                      int i11 = 0;
                      while (true) {
                         i = i11 + 1;
                         float f = 0;
                         if (i5 > 0) {
                            int i12 = 0;
                            while (true) {
                               oqz32 = oqz31;
                               int i13 = i12 + 1;
                               if (i4 > 0) {
                                  int i14 = 0;
                                  while (true) {
                                     i15 = i1;
                                     i1 = i14 + 1;
                                     int i16 = i2 * i4;
                                     i16 = i16 * i3;
                                     int i17 = i12 + i11;
                                     i17 = i17 * i4;
                                     i17 = i17 + i16;
                                     i17 = i17 + i14;
                                     i17 = i12 * i4;
                                     i17 = i17 + i14;
                                     i17 = i17 * i7;
                                     i17 = i17 + i9;
                                     float f1 = oqz3[i17] * obj[i17];
                                     f = f1 + f;
                                     if (i1 >= i4) {
                                        break ;
                                     }else {
                                        i14 = i1;
                                        i1 = i15;
                                     }
                                  }
                                  if (i13 >= i5) {
                                  label_0086 :
                                     i1 = i6 * i7;
                                     i1 = i1 * i3;
                                     i11 = i11 * i7;
                                     i11 = i11 + i1;
                                     i11 = i11 + i9;
                                     c[i11] = f;
                                     if (i >= i6) {
                                     label_009e :
                                        if (i10 >= i7) {
                                           i = i15;
                                        label_00ad :
                                           if (i8 < i) {
                                              i1 = i;
                                              i3 = i8;
                                              oqz31 = oqz32;
                                              i = 0;
                                           }
                                        }else {
                                           i9 = i10;
                                           oqz31 = oqz32;
                                           i1 = i15;
                                           i = 0;
                                        }
                                     }else {
                                        i11 = i;
                                        oqz31 = oqz32;
                                        i1 = i15;
                                        i = 0;
                                     }
                                  }else {
                                     i12 = i13;
                                     oqz31 = oqz32;
                                     i1 = i15;
                                  }
                               }else {
                                  i15 = i1;
                               }
                            }
                         }else {
                            i15 = i1;
                            oqz32 = oqz31;
                            goto label_0086 ;
                         }
                      }
                   }else {
                      i15 = i1;
                      oqz32 = oqz31;
                      goto label_009e ;
                   }
                }
             }else {
                oqz32 = oqz31;
                i = i1;
                goto label_00ad ;
             }
          }
       }else {
          oqz32 = oqz31;
       }
       return oqz32;
    }
    public static final vy5 i(Context p0,Class p1,String p2){
       co5.o(p0, "context");
       int i = (av6.p0(p2))? 1: 0;
       if ((i ^ 1)) {
          return new vy5(p0, p1, p2);
       }else {
          throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
       }
    }
    public static final void j(String p0){
       File uFile;
       if ((uFile = b17.n()) != null && p0 != null) {
          new File(uFile, p0).delete();
       }
       return;
    }
    public static final qz3 k(qz3 p0,qz3 p1,qz3 p2){
       qz3 oqz3 = p0;
       qz3 obj = p1;
       Object obj1 = p2;
       co5.o(obj, "w");
       co5.o(obj1, "b");
       int i = 0;
       int i1 = oqz3.a[i];
       int i2 = obj1.a[i];
       qz3 a = obj.a;
       int i3 = a[i];
       int i4 = a[1];
       int[] ointArray = new int[]{i1,i4};
       qz3 oqz31 = new qz3(ointArray);
       oqz3 = oqz3.c;
       obj = obj.c;
       qz3 c = oqz31.c;
       if (i1 > 0) {
          int i5 = 0;
          while (true) {
             int i6 = i5 + 1;
             if (i4 > 0) {
                int i7 = 0;
                while (true) {
                   int i8 = i7 + 1;
                   int i9 = i5 * i4;
                   i9 = i9 + i7;
                   c[i9] = 0;
                   if (i3 > 0) {
                      int i10 = 0;
                      while (true) {
                         i = i10 + 1;
                         int i11 = i5 * i3;
                         i11 = i11 + i10;
                         i10 = i10 * i4;
                         i10 = i10 + i7;
                         float f = oqz3[i11] * obj[i10];
                         f = f + c[i9];
                         c[i9] = f;
                         if (i >= i3) {
                            break ;
                         }else {
                            i10 = i;
                            i = 0;
                         }
                      }
                      if (i8 >= i4) {
                      }else {
                         i7 = i8;
                         i = 0;
                      }
                   }else {
                   }
                }
             }else if(i6 >= i1){
                i5 = i6;
                i = 0;
             }
          }
       }
       oqz3 = obj1.c;
       obj = oqz31.c;
       if (i1 > 0) {
          int i12 = 0;
          while (true) {
             i = i12 + 1;
             if (i2 > 0) {
                i4 = 0;
                while (true) {
                   i3 = i4 + 1;
                   int i13 = i12 * i2;
                   i13 = i13 + i4;
                   float f1 = obj[i13] + oqz3[i4];
                   obj[i13] = f1;
                   if (i3 >= i2) {
                      break ;
                   }else {
                      i4 = i3;
                   }
                }
                if (i < i1) {
                   i12 = i;
                }
             }else {
             }
          }
       }
       return oqz31;
    }
    public static int l(int p0,float p1,int p2){
       if (p0 == p2) {
          return p0;
       }
       return (Math.round((b17.b(et0.l(b17.a(((float)(p2 & 0x00ff) / 0x437f0000)), b17.a(((float)(p0 & 0x00ff) / 0x437f0000)), p1, b17.a(((float)(p0 & 0x00ff) / 0x437f0000)))) * 0x437f0000)) | (((Math.round((b17.b(et0.l(b17.a(((float)((p2 >> 16) & 0x00ff) / 0x437f0000)), b17.a(((float)((p0 >> 16) & 0x00ff) / 0x437f0000)), p1, b17.a(((float)((p0 >> 16) & 0x00ff) / 0x437f0000)))) * 0x437f0000)) << 16) | (Math.round((et0.l(((float)((p2 >> 24) & 0x00ff) / 0x437f0000), ((float)((p0 >> 24) & 0x00ff) / 0x437f0000), p1, ((float)((p0 >> 24) & 0x00ff) / 0x437f0000)) * 0x437f0000)) << 24)) | (Math.round((b17.b(et0.l(b17.a(((float)((p2 >> 8) & 0x00ff) / 0x437f0000)), b17.a(((float)((p0 >> 8) & 0x00ff) / 0x437f0000)), p1, b17.a(((float)((p0 >> 8) & 0x00ff) / 0x437f0000)))) * 0x437f0000)) << 8)));
    }
    public static final void m(qz3 p0){
       int i;
       int i2;
       qz3 a = p0.a;
       if ((i = 1) >= a.length) {
          return;
       }
       int len = a.length;
       if (i < len) {
          int i1 = 1;
          i2 = 1;
          while (true) {
             int i3 = i1 + 1;
             i2 = i2 * p0.a[i1];
             if (i3 < len) {
                i1 = i3;
             }
          }
       }else {
          i2 = 1;
       }
       int[] ointArray = new int[]{p0.a[0],i2};
       p0.a = ointArray;
       len = b3.a(ointArray);
       float[] uofloatArray = new float[len];
       System.arraycopy(p0.c, 0, uofloatArray, 0, Math.min(p0.b, len));
       p0.c = uofloatArray;
       p0.b = len;
       return;
    }
    public static final File n(){
       File uFile = new File(sz1.a().getCacheDir(), "instrument");
       if (!uFile.exists() && !uFile.mkdirs()) {
          uFile = null;
       }
       return uFile;
    }
    public static fl6 o(gq5 p0){
       jb1 ojb1;
       int height;
       ViewGroup$LayoutParams layoutParams = p0.a.getLayoutParams();
       int i = -1;
       layoutParams = (layoutParams != null)? layoutParams.width: -1;
       gq5 a = p0.a;
       int width = a.getWidth();
       int i1 = 0;
       int i2 = ((p0 = p0.b) != null)? a.getPaddingRight() + a.getPaddingLeft(): 0;
       jb1 h = jb1.H;
       if (layoutParams == -2) {
          ojb1 = h;
       }else if((height = layoutParams - i2) > 0){
          ojb1 = new ib1(height);
       }else if((width = width - i2) > 0){
          ojb1 = new ib1(width);
       }else {
          ojb1 = null;
       }
       if (ojb1 == null) {
          return null;
       }else if((layoutParams = a.getLayoutParams()) != null){
          i = layoutParams.height;
       }
       height = a.getHeight();
       if (p0 != null) {
          i1 = a.getPaddingBottom() + a.getPaddingTop();
       }
       if (i != -2) {
          if ((i = i - i1) > 0) {
             h = new ib1(i);
          }else if((height = height - i1) > 0){
             h = new ib1(height);
          }else {
             h = null;
          }
       }
       if (h == null) {
          return null;
       }else {
          return new fl6(ojb1, h);
       }
    }
    public static void p(fm3 p0){
       co5.o(p0, "worker");
       fm3 a = p0.a;
       co5.l(a, "worker.applicationContext");
       if (!a instanceof ao2) {
          throw new IllegalStateException(a.getClass().getCanonicalName()+" does not implement "+ao2.class.getCanonicalName());
       }
       sc osc = a.d();
       String str = a.getClass()+".androidInjector\(\) returned null";
       Object[] objArray = new Object[0];
       if (osc == null) {
          throw new NullPointerException(xe7.E(str, objArray));
       }
       osc.a(p0);
       return;
    }
    public static boolean q(int p0){
       boolean b = (View$MeasureSpec.getMode(p0) == 0x40000000)? true: false;
       return b;
    }
    public static final boolean r(fl6 p0){
       return co5.c(p0, fl6.c);
    }
    public static int s(int p0){
       return View$MeasureSpec.makeMeasureSpec(p0, 0x40000000);
    }
    public static final qz3 t(qz3 p0,int p1){
       int i14;
       qz3 oqz3 = p0;
       int i = p1;
       qz3 a = oqz3.a;
       int i1 = 0;
       int i2 = a[i1];
       int i3 = a[1];
       int i4 = 2;
       int i5 = a[i4];
       int i6 = (i3 - i) + 1;
       int[] ointArray = new int[]{i2,i6,i5};
       qz3 oqz31 = new qz3(ointArray);
       oqz3 = oqz3.c;
       qz3 c = oqz31.c;
       if (i2 > 0) {
          i4 = 0;
          while (true) {
             int i7 = i4 + 1;
             if (i5 > 0) {
                int i8 = 0;
                while (true) {
                   int i9 = i8 + 1;
                   if (i6 > 0) {
                      int i10 = 0;
                      while (true) {
                         int i11 = i10 + 1;
                         int i12 = i4 * i6;
                         i12 = i12 * i5;
                         i10 = i10 * i5;
                         i12 = i12 + i10;
                         i12 = i12 + i8;
                         int i13 = i4 * i3;
                         i13 = i13 * i5;
                         i13 = i13 + i10;
                         i13 = i13 + i8;
                         c[i12] = 1;
                         if (i > 0) {
                            i10 = 0;
                            while (true) {
                               i1 = i10 + 1;
                               i14 = i3;
                               i10 = i10 * i5;
                               i10 = i10 + i13;
                               c[i12] = Math.max(c[i12], oqz3[i10]);
                               if (i1 >= i) {
                                  break ;
                               }else {
                                  i10 = i1;
                                  i3 = i14;
                                  i1 = 0;
                               }
                            }
                            if (i11 >= i6) {
                            label_006f :
                               if (i9 >= i5) {
                               label_0079 :
                                  if (i7 < i2) {
                                     i4 = i7;
                                     i3 = i14;
                                     i1 = 0;
                                  }
                               }else {
                                  i8 = i9;
                                  i3 = i14;
                                  i1 = 0;
                               }
                            }else {
                               i10 = i11;
                               i3 = i14;
                               i1 = 0;
                            }
                         }else {
                            i14 = i3;
                         }
                      }
                   }else {
                      i14 = i3;
                      goto label_006f ;
                   }
                }
             }else {
                i14 = i3;
                goto label_0079 ;
             }
          }
       }
       return oqz31;
    }
    public static final h80 u(String p0){
       Locale uS = Locale.US;
       co5.l(uS, "US");
       p0 = p0.toUpperCase(uS);
       co5.l(p0, "this as java.lang.String\).toUpperCase\(locale\)");
       byte[] uobyteArray = ay.e.a(p0);
       return i80.c(uobyteArray, 0, uobyteArray.length);
    }
    public static final JSONObject v(String p0){
       File uFile;
       if ((uFile = b17.n()) != null) {
          try{
             File uFile1 = new File(uFile, p0);
             return new JSONObject(ej4.J0(new FileInputStream(uFile1)));
          }catch(java.lang.Exception e0){
             b17.j(p0);
          }
          return null;
       }else {
       }
    }
    public static final Object w(Object p0){
       if (p0 instanceof ul0) {
          p0 = eb3.h(p0.a);
       }
       return p0;
    }
    public static final void x(qz3 p0){
       int i;
       p0 = p0.c;
       if ((i = p0.length - 1) >= 0) {
          int i1 = 0;
          while (true) {
             int i2 = i1 + 1;
             if ((p0[i1]) < 0) {
                p0[i1] = 0;
                break ;
             }else if(i2 > i){
                i1 = i2;
             }
          }
       }
       return;
    }
    public static final int y(y96 p0,int p1){
       int i2;
       int i3;
       co5.o(p0, "<this>");
       p1++;
       p0 = p0.w;
       co5.o(p0, "<this>");
       int i = p0.v.length - 1;
       int i1 = 0;
       while (true) {
          if (i1 <= i) {
             i2 = i1 + i;
             i2 = i2 >> 1;
             if ((i3 = p0[i2]) < p1) {
                i1 = i2 + 1;
             }else if(i3 > p1){
                i = i2 - 1;
             }else if(i2 >= 0){
                i2 = ~ i2;
                break ;
             }
             break ;
          }else {
             i2 = (- i1) - 1;
          }
       }
       return i2;
    }
    public static final void z(String p0,JSONArray p1,om2 p2){
       JSONObject jSONObject1;
       if (!p1.length()) {
          return;
       }
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put(p0, p1.toString());
          if ((jSONObject1 = ej4.A()) != null) {
             Iterator iterator = jSONObject1.keys();
             while (iterator.hasNext()) {
                String str = iterator.next();
                jSONObject.put(str, jSONObject1.get(str));
             }
          }
          Object[] objArray = new Object[]{sz1.b()};
          jSONObject1 = String.format("%s/instruments", Arrays.copyOf(objArray, 1));
          co5.l(jSONObject1, "java.lang.String.format\(format, *args\)");
          az5.N(null, jSONObject1, jSONObject, p2).d();
          return;
       }catch(org.json.JSONException e0){
       }
    }
    public abstract byte[] e(int p0);
}
