package p.do5;
import p.w54;
import p.ai7;
import java.lang.Object;
import p.ps3;
import p.c65;
import p.ir2;
import java.lang.reflect.Type;
import p.q12;
import android.os.Parcel;
import p.cd2;
import java.lang.String;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.WildcardType;
import java.lang.IllegalArgumentException;
import p.kg4;
import android.content.Context;
import p.bk;
import p.pl5;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import java.io.File;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.Throwable;
import p.yl5;
import android.os.Build$VERSION;
import p.ka1;
import java.io.Serializable;
import p.eo5;
import p.eb3;
import java.util.Arrays;
import p.ta1;
import java.lang.IllegalStateException;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.lang.Class;
import java.util.Objects;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Array;
import java.lang.reflect.TypeVariable;
import p.j13;
import p.ez2;
import p.au2;
import p.dz2;
import p.r45;
import p.fo1;
import java.util.Map;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.annotation.Annotation;
import java.lang.Math;
import java.lang.reflect.Method;
import java.lang.Exception;
import p.en6;
import p.zf2;
import p.ng4;
import p.og4;
import p.zn;
import p.a3;
import android.net.Uri;
import p.nm7;
import p.tm2;
import p.av6;
import p.fs2;
import android.os.ParcelFileDescriptor;
import p.qm2;
import android.os.Parcelable;
import android.os.Bundle;
import p.om2;
import p.ny1;
import java.io.DataOutputStream;
import android.widget.EdgeEffect;
import p.fg1;
import p.eg1;
import java.nio.ByteBuffer;
import java.lang.RuntimeException;
import android.os.Parcelable$Creator;
import p.gk2;
import p.uo2;
import android.view.View;
import p.oj2;
import android.view.ViewGroup;
import p.zk2;
import p.jk7;
import java.util.HashSet;
import java.util.ArrayList;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import p.hk2;
import p.t65;
import android.os.BaseBundle;
import java.lang.Boolean;
import java.lang.Byte;
import java.lang.Number;
import java.lang.Character;
import java.lang.Double;
import java.lang.Float;
import java.lang.Long;
import java.lang.Short;
import java.lang.CharSequence;
import p.co5;
import android.os.IBinder;
import p.l70;
import android.util.Size;
import p.m70;
import android.util.SizeF;
import p.ej4;
import java.lang.reflect.GenericDeclaration;
import java.util.NoSuchElementException;
import p.df7;
import p.ef7;
import p.hf7;
import p.sp6;
import p.zt2;
import p.ty0;
import p.a23;
import p.p15;
import p.l51;
import java.lang.AssertionError;
import java.lang.VirtualMachineError;
import java.lang.ThreadDeath;
import java.lang.LinkageError;
import android.widget.TextView;
import p.tz;
import android.text.TextPaint;
import android.graphics.Paint$FontMetrics;
import android.graphics.Paint;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.KeyEvent;
import p.xf;
import p.b6;

public abstract class do5 implements w54	// class@001387 from classes.dex
{
    public static final int[] A;
    public static final ps3 B;
    public static final Type[] C;
    public static final q12 D;
    public static final q12[] E;
    public static Boolean a;
    public static final ai7 b;
    public static final int[] c;
    public static final long[] t;
    public static final Object[] v;
    public static final ps3 w;
    public static final c65 x;
    public static final ir2 y;
    public static final ir2 z;

    static {
       do5.b = new ai7(4);
       int[] ointArray = new int[0];
       do5.c = ointArray;
       long[] olongArray = new long[0];
       do5.t = olongArray;
       Object[] objArray = new Object[0];
       do5.v = objArray;
       do5.w = new ps3(1);
       do5.x = new c65(6);
       do5.y = new ir2(10);
       do5.z = new ir2(11);
       int[] ointArray1 = new int[]{0x7f0302db};
       do5.A = ointArray1;
       do5.B = new ps3(5);
       Type[] typeArray = new Type[0];
       do5.C = typeArray;
       q12 oq12 = new q12();
       do5.D = oq12;
       q12[] oq12Array = new q12[]{oq12};
       do5.E = oq12Array;
    }
    public void do5(){
       super();
    }
    public static int A0(Parcel p0){
       int i = p0.readInt();
       int i1 = do5.f0(p0, i);
       int i2 = p0.dataPosition();
       if (((0xffff & i)) != 0x4f45) {
          String str = String.valueOf(Integer.toHexString(i));
          str = (str.length())? "Expected object header. Got 0x".concat(str): "Expected object header. Got 0x";
          throw new cd2(str, p0);
       }else if((i1 = i1 + i2) >= i2 && i1 <= p0.dataSize()){
          return i1;
       }else {
          throw new cd2(new StringBuilder(54)+"Size read is invalid start="+i2+" end="+i1, p0);
       }
    }
    public static Type B(int p0,ParameterizedType p1){
       Type[] actualTypeAr = p1.getActualTypeArguments();
       if (p0 < 0 || p0 >= actualTypeAr.length) {
          throw new IllegalArgumentException(kg4.r("Index ", p0, " not in range [0,")+actualTypeAr.length+"\) for "+p1);
       }
       object oobject = actualTypeAr[p0];
       if (oobject instanceof WildcardType) {
          oobject = oobject.getUpperBounds()[0];
       }
       return oobject;
    }
    public static void B0(Context p0,bk p1,pl5 p2,boolean p3){
       File uFile;
       ka1 c;
       int i3;
       ka1 g;
       byte[] uobyteArray;
       byte[] uobyteArray1;
       DataInputStream obj;
       String str2;
       FileInputStream uFileInputSt;
       ta1[] ota1Array;
       int sDK_INT1;
       FileInputStream uFileInputSt1;
       Context uContext = p0;
       pl5 opl5 = p2;
       Context applicationC = p0.getApplicationContext();
       String packageName = applicationC.getPackageName();
       ApplicationInfo applicationI = applicationC.getApplicationInfo();
       AssetManager assets = applicationC.getAssets();
       String name = new File(applicationI.sourceDir).getName();
       PackageManager packageManag = p0.getPackageManager();
       try{
          boolean i = 0;
          PackageInfo packageInfo = packageManag.getPackageInfo(packageName, i);
          File filesDir = p0.getFilesDir();
          boolean b = true;
          Serializable serializable = null;
          if (!p3) {
             try{
                uFile = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (!uFile.exists()) {
                }else {
                   obj = new DataInputStream(new FileInputStream(uFile));
                   obj.close();
                   str2 = (!(obj.readLong() - packageInfo.lastUpdateTime))? 1: 0;
                   if (str2) {
                      opl5.l(2, serializable);
                   }
                }
                if (uFile) {
                   p0.getPackageName();
                   yl5.c(uContext, false);
                label_027c :
                   return;
                }
             }catch(java.io.IOException e0){
             }
             uFile = 0;
          }
          p0.getPackageName();
          int sDK_INT = Build$VERSION.SDK_INT;
          File uFile1 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
          String str = "dexopt/baseline.prof";
          ka1 i1 = new ka1(assets, p1, p2, name, uFile1);
          int i2 = 4;
          if ((c = i.c) == null) {
             i.b(3, Integer.valueOf(sDK_INT));
          }else if(!uFile1.canWrite()){
             i.b(i2, serializable);
          }else {
             i.f = b;
             str2 = 1;
          label_00b9 :
             if (!sDK_INT) {
                i3 = 1;
             }else {
                String str1 = "This device doesn\'t support aot. Did you call deviceSupportsAotProfile\(\)?";
                if (i.f != null) {
                   byte[] v = eo5.v;
                   if (c != null) {
                      str2 = str;
                      try{
                         uFileInputSt = i.a(assets, str2);
                      label_00e3 :
                         if (uFileInputSt != null) {
                            try{
                               if (Arrays.equals(v, eb3.u(i2, uFileInputSt))) {
                                  ota1Array = eo5.I(uFileInputSt, eb3.u(i2, uFileInputSt), i.e);
                                  try{
                                     uFileInputSt.close();
                                  }catch(java.io.IOException e0){
                                     opl5.l(7, e0);
                                  }
                               }else {
                                  throw new IllegalStateException("Invalid magic");
                               }
                               i.g = ota1Array;
                            }catch(java.io.IOException e0){
                               opl5.l(7, e0);
                            }catch(java.lang.IllegalStateException e0){
                               opl5.l(8, e0);
                               uFileInputSt1 = 7;
                            }catch( e0){
                            }
                            if (sDK_INT1 > 33) {
                               if (sDK_INT1 != uFileInputSt && sDK_INT1 != 25) {
                                  switch (sDK_INT1){
                                      case 31:
                                      case '!':
                                      case 32:
                                        break;
                                      default:
                                  }
                               }
                               uFileInputSt1 = 1;
                            label_0151 :
                               if (sDK_INT1) {
                                  try{
                                     if ((uFileInputSt1 = i.a(assets, "dexopt/baseline.profm")) != null) {
                                        if (Arrays.equals(eo5.w, eb3.u(i2, uFileInputSt1))) {
                                           i.g = eo5.F(uFileInputSt1, eb3.u(i2, uFileInputSt1), c, g);
                                           uFileInputSt1.close();
                                           g = i;
                                        label_01a3 :
                                           if (g != null) {
                                              ka1 oka1 = g;
                                           }
                                        }else {
                                           throw new IllegalStateException("Invalid magic");
                                        }
                                     }else if(uFileInputSt1 != null){
                                        uFileInputSt1.close();
                                     }
                                  }catch(java.io.FileNotFoundException e0){
                                     opl5.l(9, e0);
                                  }catch(java.io.IOException e0){
                                     opl5.l(7, e0);
                                  }catch(java.lang.IllegalStateException e0){
                                     i.g = null;
                                     opl5.l(8, e0);
                                  }
                                  g = null;
                                  goto label_01a3 ;
                               }
                            }
                         }
                         if ((g = i.g) != null) {
                            sDK_INT1 = Build$VERSION.SDK_INT;
                            uFileInputSt = 24;
                            if (sDK_INT1 >= uFileInputSt && sDK_INT1 <= 33) {
                            }
                            sDK_INT1 = 0;
                            goto label_0151 ;
                         }
                      }catch(java.io.FileNotFoundException e0){
                         opl5.l(6, e0);
                      }catch(java.io.IOException e0){
                         opl5.l(7, e0);
                      }
                      uFileInputSt = serializable;
                      goto label_00e3 ;
                   }
                   i1 = i.b;
                   if ((g = i.g) != null && (c = i.c) != null) {
                      if (i.f != null) {
                         try{
                            ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
                            uByteArrayOu.write(v);
                            uByteArrayOu.write(c);
                            if (!eo5.U(uByteArrayOu, c, g)) {
                               obj = null;
                               i1.l(5, obj);
                               i.g = obj;
                               uByteArrayOu.close();
                            }else {
                               uobyteArray = uByteArrayOu.toByteArray();
                               try{
                                  i.h = uobyteArray;
                                  uByteArrayOu.close();
                               }catch(java.lang.IllegalStateException e0){
                                  i1.l(8, e0);
                               }
                            }
                            i.g = null;
                         }catch(java.io.IOException e0){
                            i1.l(7, e0);
                         }catch(java.lang.IllegalStateException e0){
                         }
                      }else {
                         throw new IllegalStateException(str1);
                      }
                   }
                   if ((g = i.h) == null) {
                      str1 = 1;
                   }else if(i.f != null){
                      try{
                         ByteArrayInputStream uByteArrayIn = new ByteArrayInputStream(g);
                         FileOutputStream uFileOutputS = new FileOutputStream(i.d);
                         uobyteArray = new byte[512];
                         while ((i3 = uByteArrayIn.read(uobyteArray)) > 0) {
                            uFileOutputS.write(uobyteArray, 0, i3);
                         }
                         i.b(1, null);
                         try{
                            uFileOutputS.close();
                            uByteArrayIn.close();
                            i.h = null;
                            i.g = null;
                            uobyteArray1 = 1;
                         label_026d :
                            if (i2) {
                               do5.P(packageInfo, filesDir);
                            }
                         }catch(java.io.FileNotFoundException e0){
                         }catch(java.io.IOException e0){
                         }
                         i.b(7, e0);
                         uobyteArray1 = null;
                         i.h = uobyteArray1;
                         i.g = uobyteArray1;
                      }catch(java.io.FileNotFoundException e0){
                         str1 = 1;
                      }catch(java.io.IOException e0){
                         str1 = 1;
                      }
                   }else {
                      throw new IllegalStateException(str1);
                   }
                   i2 = 0;
                   goto label_026d ;
                }else {
                   throw new IllegalStateException(str1);
                }
             }
             i = (0 && p3)? true: false;
             yl5.c(uContext, i);
             goto label_027c ;
          }
          sDK_INT = 0;
          goto label_00b9 ;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          opl5.l(7, e0);
          yl5.c(uContext, false);
          return;
       }
    }
    public static Class C(Type p0){
       Objects.requireNonNull(p0, "type == null");
       if (p0 instanceof Class) {
          return p0;
       }
       if (p0 instanceof ParameterizedType) {
          p0 = p0.getRawType();
          if (p0 instanceof Class) {
             return p0;
          }
          throw new IllegalArgumentException();
       }else {
          int i = 0;
          if (p0 instanceof GenericArrayType) {
             return Array.newInstance(do5.C(p0.getGenericComponentType()), i).getClass();
          }
          if (p0 instanceof TypeVariable) {
             return Object.class;
          }
          if (p0 instanceof WildcardType) {
             return do5.C(p0.getUpperBounds()[i]);
          }
          throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <"+p0+"> is of type "+p0.getClass().getName());
       }
    }
    public static void C0(Parcel p0,int p1,int p2){
       if ((p1 = do5.f0(p0, p1)) == p2) {
          return;
       }
       String str = Integer.toHexString(p1);
       throw new cd2(new StringBuilder((String.valueOf(str).length() + 46))+"Expected size "+p2+" got "+p1+" \(0x"+str+"\)", p0);
    }
    public static ez2 D(j13 p0){
       ez2 uoez2 = p0.b().u("style");
       if (uoez2 instanceof ez2) {
       }else if(uoez2 instanceof String){
          uoez2 = dz2.a.b(uoez2.toString()).e(ez2.b);
       }else {
          uoez2 = ez2.b;
       }
       return uoez2;
    }
    public static Type E(Type p0,Class p1){
       Map map = Map.class;
       if (map.isAssignableFrom(p1)) {
          return do5.m0(p0, p1, do5.x(p0, p1, map));
       }
       throw new IllegalArgumentException();
    }
    public static boolean G(Type p0){
       String str;
       boolean b = false;
       if (p0 instanceof Class) {
          return b;
       }
       boolean b1 = true;
       if (p0 instanceof ParameterizedType) {
          Type[] actualTypeAr = p0.getActualTypeArguments();
          int len = actualTypeAr.length;
          int i = 0;
          while (true) {
             if (i >= len) {
                return b;
             }
             if (do5.G(actualTypeAr[i])) {
                break ;
             }else {
                i = i + 1;
             }
          }
          return b1;
       }else if(p0 instanceof GenericArrayType){
          return do5.G(p0.getGenericComponentType());
       }else if(p0 instanceof TypeVariable){
          return b1;
       }else if(p0 instanceof WildcardType){
          return b1;
       }else if(p0 == null){
          str = "null";
       }else {
          str = p0.getClass().getName();
       }
       throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <"+p0+"> is of type "+str);
    }
    public static boolean I(PlaybackStateCompat p0,long p1){
       long l = (p0 == null)? 0: p0.v;
       boolean b = ((l & p1))? true: false;
       return b;
    }
    public static boolean J(Annotation[] p0,Class p1){
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (p1.isInstance(p0[i])) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public static boolean K(PlaybackStateCompat p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if ((p0 = p0.a) == 6 || p0 == 3) {
          b = true;
       }
       return b;
    }
    public static float L(int p0){
       float f = (float)p0 / 0x437f0000;
       f = ((f - 0x3d25aee6) <= 0)? f / 12.92f: (float)Math.pow((((double)f + 0x3fac28f5c28f5c29) / 0x3ff0e147ae147ae1), 2.40f);
       return f;
    }
    public static IllegalArgumentException M(Method p0,Exception p1,String p2,Object[] p3){
       return new IllegalArgumentException(en6.s(String.format(p2, p3), "\n    for method ")+p0.getDeclaringClass().getSimpleName()+"."+p0.getName(), p1);
    }
    public static final ng4 N(zf2 p0){
       og4 oog4 = new og4();
       p0.invoke(oog4);
       og4 a = oog4.a;
       a.getClass();
       a.getClass();
       a.getClass();
       a.getClass();
       a.getClass();
       a.getClass();
       ng4 oog41 = new ng4(oog4.b, false, oog4.c, false, oog4.d, a.a, a.b, a.c, a.d);
       return oog4;
    }
    public static final tm2 O(a3 p0,Uri p1,nm7 p2){
       Bundle uBundle;
       tm2 ParcelFileDescriptor.open(new File(path), 0x10000000);
       String path = p1.getPath();
       fs2 b = fs2.b;
       if (av6.i0("file", p1.getScheme(), true) && path != null) {
          uBundle = new Bundle(true);
          uBundle.putParcelable("file", new qm2(ParcelFileDescriptor.open(new File(path), 0x10000000)));
          ParcelFileDescriptor.open(new File(path), 0x10000000) = new tm2(p0, "me/staging_resources", uBundle, b, p2, 32);
          return ParcelFileDescriptor.open(new File(path), 0x10000000);
       }else if(av6.i0("content", p1.getScheme(), true)){
          uBundle = new Bundle(true);
          uBundle.putParcelable("file", new qm2(p1));
          ParcelFileDescriptor.open(new File(path), 0x10000000) = new tm2(p0, "me/staging_resources", uBundle, b, p2, 32);
          return p1;
       }else {
          throw new ny1("The image Uri must be either a file:// or content:// Uri");
       }
    }
    public static void P(PackageInfo p0,File p1){
       String str = "profileinstaller_profileWrittenFor_lastUpdateTime.dat";
       try{
          File uFile = new File(p1, str);
          DataOutputStream uDataOutputS = new DataOutputStream(new FileOutputStream(uFile));
          uDataOutputS.writeLong(p0.lastUpdateTime);
          uDataOutputS.close();
          return;
       }catch(java.io.IOException e0){
       }
    }
    public static float U(EdgeEffect p0,float p1,float p2){
       if (Build$VERSION.SDK_INT >= 31) {
          return fg1.c(p0, p1, p2);
       }
       eg1.a(p0, p1, p2);
       return p1;
    }
    public static IllegalArgumentException W(Method p0,int p1,String p2,Object[] p3){
       p1++;
       return do5.M(p0, null, en6.s(p2, " \(parameter #")+p1+"\)", p3);
    }
    public static IllegalArgumentException X(Method p0,Exception p1,int p2,String p3,Object[] p4){
       p2++;
       return do5.M(p0, p1, en6.s(p3, " \(parameter #")+p2+"\)", p4);
    }
    public static String Y(ByteBuffer p0){
       byte[] uobyteArray = new byte[4];
       try{
          p0.get(uobyteArray);
          return new String(uobyteArray, "ISO-8859-1");
       }catch(java.io.UnsupportedEncodingException e2){
          throw new RuntimeException(e2);
       }
    }
    public static boolean Z(Parcel p0,int p1){
       do5.C0(p0, p1, 4);
       if (p0.readInt()) {
          return true;
       }
       return false;
    }
    public static Object a(Parcel p0,Parcelable$Creator p1){
       p0 = (p0.readInt())? p1.createFromParcel(p0): null;
       return p0;
    }
    public static double a0(ByteBuffer p0){
       byte[] uobyteArray = new byte[4];
       p0.get(uobyteArray);
       return ((double)((((0 | ((uobyteArray[0] << 24) & 0xff000000)) | ((uobyteArray[1] << 16) & 0xff0000)) | ((uobyteArray[2] << 8) & 0xff00)) | (uobyteArray[3] & 0x00ff)) / 1073741824.00f);
    }
    public static double b0(ByteBuffer p0){
       byte[] uobyteArray = new byte[4];
       p0.get(uobyteArray);
       return ((double)((((0 | ((uobyteArray[0] << 24) & 0xff000000)) | ((uobyteArray[1] << 16) & 0xff0000)) | ((uobyteArray[2] << 8) & 0xff00)) | (uobyteArray[3] & 0x00ff)) / 0x40f0000000000000);
    }
    public static float c0(ByteBuffer p0){
       byte[] uobyteArray = new byte[2];
       p0.get(uobyteArray);
       return ((float)(short)((short)(0 | ((uobyteArray[0] << 8) & 0xff00)) | (uobyteArray[1] & 0x00ff)) / 256.00f);
    }
    public static int d(int p0,int p1,int[] p2){
       int i1;
       int i2;
       p0--;
       int i = 0;
       while (true) {
          if (i > p0) {
             return (~ i);
          }
          i1 = i + p0;
          i1 = i1 >> 1;
          if ((i2 = p2[i1]) < p1) {
             i1 = i1 + 1;
             i = i1;
          }else if(i2 > p1){
             i1 = i1 - 1;
             p0 = i1;
          }else {
             break ;
          }
       }
       return i1;
    }
    public static int d0(Parcel p0,int p1){
       do5.C0(p0, p1, 4);
       return p0.readInt();
    }
    public static int e(long[] p0,int p1,long p2){
       int i1;
       p1--;
       int i = 0;
       while (true) {
          if (i > p1) {
             return (~ i);
          }
          i1 = i + p1;
          i1 = i1 >> 1;
          if ((v4 = p0[i1] - p2) < 0) {
             i1 = i1 + 1;
             i = i1;
          }else if(v4 > 0){
             i1 = i1 - 1;
             p1 = i1;
          }else {
             break ;
          }
       }
       return i1;
    }
    public static String e0(ByteBuffer p0){
       int i = do5.i0(p0);
       StringBuilder str = "";
       for (int i1 = 0; i1 < 3; i1 = i1 + 1) {
          int i2 = i1 - 2;
          i2 = i2 * 5;
          i2 = i >> i2;
          i2 = i2 & 0x1f;
          i2 = i2 + 96;
          str = str.append((char)i2);
       }
       return str;
    }
    public static void f(gk2 p0,uo2 p1){
       p0.getClass();
       oj2 ooj2 = new oj2(p0.getContext(), p0);
       eo5.P(ooj2);
       View view = p1.getView();
       ooj2.a.add(view);
       ooj2.b.add(p1);
       ooj2.c.addView(view, -1, new LinearLayout$LayoutParams(-1, -2));
       p0.setContentViewBinder(ooj2);
    }
    public static int f0(Parcel p0,int p1){
       if (((p1 & 0xffff0000)) != 0xffff0000) {
          return ((p1 >> 16) & 0xffff);
       }
       return p0.readInt();
    }
    public static final Bundle g(t65[] p0){
       t65 a;
       t65 b;
       Class componentTyp;
       Bundle uBundle = new Bundle(p0.length);
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return uBundle;
          }
          object oobject = p0[i];
          a = oobject.a;
          if ((b = oobject.b) == null) {
             uBundle.putString(a, null);
          }else if(b instanceof Boolean){
             uBundle.putBoolean(a, b.booleanValue());
          }else if(b instanceof Byte){
             uBundle.putByte(a, b.byteValue());
          }else if(b instanceof Character){
             uBundle.putChar(a, b.charValue());
          }else if(b instanceof Double){
             uBundle.putDouble(a, b.doubleValue());
          }else if(b instanceof Float){
             uBundle.putFloat(a, b.floatValue());
          }else if(b instanceof Integer){
             uBundle.putInt(a, b.intValue());
          }else if(b instanceof Long){
             uBundle.putLong(a, b.longValue());
          }else if(b instanceof Short){
             uBundle.putShort(a, b.shortValue());
          }else if(b instanceof Bundle){
             uBundle.putBundle(a, b);
          }else if(b instanceof CharSequence){
             uBundle.putCharSequence(a, b);
          }else if(b instanceof Parcelable){
             uBundle.putParcelable(a, b);
          }else if(b instanceof boolean[]){
             uBundle.putBooleanArray(a, b);
          }else if(b instanceof byte[]){
             uBundle.putByteArray(a, b);
          }else if(b instanceof char[]){
             uBundle.putCharArray(a, b);
          }else if(b instanceof double[]){
             uBundle.putDoubleArray(a, b);
          }else if(b instanceof float[]){
             uBundle.putFloatArray(a, b);
          }else if(b instanceof int[]){
             uBundle.putIntArray(a, b);
          }else if(b instanceof long[]){
             uBundle.putLongArray(a, b);
          }else if(b instanceof short[]){
             uBundle.putShortArray(a, b);
          }else if(b instanceof Object[]){
             componentTyp = b.getClass().getComponentType();
             co5.i(componentTyp);
             if (Parcelable.class.isAssignableFrom(componentTyp)) {
                uBundle.putParcelableArray(a, b);
             }else if(String.class.isAssignableFrom(componentTyp)){
                uBundle.putStringArray(a, b);
             }else if(CharSequence.class.isAssignableFrom(componentTyp)){
                uBundle.putCharSequenceArray(a, b);
             }else if(Serializable.class.isAssignableFrom(componentTyp)){
                uBundle.putSerializable(a, b);
             }else {
                break ;
             }
          }else if(b instanceof Serializable){
             uBundle.putSerializable(a, b);
          }else if(b instanceof IBinder){
             l70.a(uBundle, a, b);
          }else if(b instanceof Size){
             m70.a(uBundle, a, b);
          }else if(b instanceof SizeF){
             m70.b(uBundle, a, b);
          }else {
             throw new IllegalArgumentException("Illegal value type "+b.getClass().getCanonicalName()+" for key \""+a+'"');
          }
          i = i + 1;
       }
       throw new IllegalArgumentException("Illegal value array type "+componentTyp.getCanonicalName()+" for key \""+a+'"');
    }
    public static String g0(ByteBuffer p0){
       byte b;
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       while (b = p0.get()) {
          uByteArrayOu.write(b);
       }
       return ej4.o(uByteArrayOu.toByteArray());
    }
    public static void h(Type p0){
       if (p0 instanceof Class && p0.isPrimitive()) {
          throw new IllegalArgumentException();
       }
       return;
    }
    public static String h0(ByteBuffer p0,int p1){
       byte[] uobyteArray = new byte[p1];
       p0.get(uobyteArray);
       return ej4.o(uobyteArray);
    }
    public static int i0(ByteBuffer p0){
       int b;
       byte b1;
       if ((b = p0.get()) < 0) {
          b = b + 256;
       }
       b = (b << 8) + 0;
       if ((b1 = p0.get()) < 0) {
          b1 = b1 + 256;
       }
       return (b + b1);
    }
    public static int j0(ByteBuffer p0){
       byte b;
       int i = (do5.i0(p0) << 8) + 0;
       if ((b = p0.get()) < 0) {
          b = b + 256;
       }
       return (i + b);
    }
    public static Bundle k(Parcel p0,int p1){
       p1 = do5.f0(p0, p1);
       int i = p0.dataPosition();
       if (!p1) {
          return null;
       }
       p0.setDataPosition((i + p1));
       return p0.readBundle();
    }
    public static long k0(ByteBuffer p0){
       long l = (long)p0.getInt();
       if ((l) < 0) {
          l = l + 0x100000000;
       }
       return l;
    }
    public static Parcelable l(Parcel p0,int p1,Parcelable$Creator p2){
       p1 = do5.f0(p0, p1);
       int i = p0.dataPosition();
       if (!p1) {
          return null;
       }
       p0.setDataPosition((i + p1));
       return p2.createFromParcel(p0);
    }
    public static long l0(ByteBuffer p0){
       long l = 0;
       long l1 = (do5.k0(p0) << 32) + l;
       if ((l1 - l) >= 0) {
          return (do5.k0(p0) + l1);
       }
       throw new RuntimeException("I don\'t know how to deal with UInt64! long is not sufficient and I don\'t want to use BigInt");
    }
    public static String m(Parcel p0,int p1){
       p1 = do5.f0(p0, p1);
       int i = p0.dataPosition();
       if (!p1) {
          return null;
       }
       p0.setDataPosition((i + p1));
       return p0.readString();
    }
    public static Type m0(Type p0,Class p1,Type p2){
       object oobject;
       object oobject1;
       Type genericCompo;
       Type type1;
       Type type2;
       Type[] typeArray;
       while (true) {
          int i = 0;
          if (p2 instanceof TypeVariable) {
             GenericDeclaration genericDecla = p2.getGenericDeclaration();
             if (genericDecla instanceof Class) {
             }else {
                genericDecla = null;
             }
             if (genericDecla != null) {
                Type type = do5.x(p0, p1, genericDecla);
                if (type instanceof ParameterizedType) {
                   TypeVariable[] typeParamete = genericDecla.getTypeParameters();
                   while (true) {
                      if (i >= typeParamete.length) {
                         throw new NoSuchElementException();
                      }
                      if (p2.equals(typeParamete[i])) {
                         oobject = type.getActualTypeArguments()[i];
                      label_0040 :
                         if (oobject == p2) {
                            return oobject;
                         }else {
                            oobject1 = oobject;
                         }
                      }else {
                         i = i + 1;
                      }
                   }
                }
             }
             oobject = p2;
             goto label_0040 ;
          }else if(p2 instanceof Class){
             oobject = p2;
             if (oobject.isArray()) {
                Class componentTyp = oobject.getComponentType();
                p0 = do5.m0(p0, p1, componentTyp);
                if (componentTyp != p0) {
                   df7 uodf7 = new df7(p0);
                   break ;
                }
                break ;
             }
          }
          if (p2 instanceof GenericArrayType) {
             genericCompo = p2.getGenericComponentType();
             p0 = do5.m0(p0, p1, genericCompo);
             if (genericCompo != p0) {
                oobject1 = new df7(p0);
             }
             return p2;
          }else if(p2 instanceof ParameterizedType){
             genericCompo = p2.getOwnerType();
             genericCompo = ((type1 = do5.m0(p0, p1, genericCompo)) != genericCompo)? 1: 0;
             Type[] actualTypeAr = p2.getActualTypeArguments();
             int len = actualTypeAr.length;
             while (i < len) {
                if ((type2 = do5.m0(p0, p1, actualTypeAr[i])) != actualTypeAr[i]) {
                   if (!genericCompo) {
                      actualTypeAr = actualTypeAr.clone();
                      genericCompo = 1;
                   }
                   actualTypeAr[i] = type2;
                }
                i = i + 1;
             }
             if (genericCompo) {
                oobject1 = new ef7(type1, p2.getRawType(), actualTypeAr);
             }
             return oobject1;
          }else if(p2 instanceof WildcardType){
             Type[] lowerBounds = p2.getLowerBounds();
             Type[] upperBounds = p2.getUpperBounds();
             if (lowerBounds.length == 1) {
                if ((p0 = do5.m0(p0, p1, lowerBounds[i])) != lowerBounds[i]) {
                   typeArray = new Type[]{Object.class};
                   lowerBounds = new Type[]{p0};
                   return new hf7(typeArray, lowerBounds);
                }
             }else if(upperBounds.length == 1 && (p0 = do5.m0(p0, p1, upperBounds[i])) != upperBounds[i]){
                typeArray = new Type[]{p0};
                return new hf7(typeArray, do5.C);
             }
          }
          return p2;
       }
       return oobject;
    }
    public static Object[] n(Parcel p0,int p1,Parcelable$Creator p2){
       p1 = do5.f0(p0, p1);
       int i = p0.dataPosition();
       if (!p1) {
          return null;
       }
       p0.setDataPosition((i + p1));
       return p0.createTypedArray(p2);
    }
    public static au2 n0(sp6 p0){
       return ty0.b().q("secondary_icon", p0).d();
    }
    public static ArrayList o(Parcel p0,int p1,Parcelable$Creator p2){
       p1 = do5.f0(p0, p1);
       int i = p0.dataPosition();
       if (!p1) {
          return null;
       }
       p0.setDataPosition((i + p1));
       return p0.createTypedArrayList(p2);
    }
    public static final void o0(View p0,p15 p1){
       co5.o(p0, "<this>");
       co5.o(p1, "onBackPressedDispatcherOwner");
       p0.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, p1);
    }
    public static void q(Parcel p0,int p1){
       if (p0.dataPosition() == p1) {
          return;
       }
       throw new cd2(new StringBuilder(37)+"Overread allowed size end="+p1, p0);
    }
    public static boolean r(Type p0,Type p1){
       boolean b = true;
       if (p0 == p1) {
          return b;
       }
       if (p0 instanceof Class) {
          return p0.equals(p1);
       }
       if (p0 instanceof ParameterizedType) {
          if (!p1 instanceof ParameterizedType) {
             return false;
          }else {
             Type ownerType = p0.getOwnerType();
             Type ownerType1 = p1.getOwnerType();
             if (ownerType != ownerType1 && (ownerType == null && (ownerType.equals(ownerType1) || (!p0.getRawType().equals(p1.getRawType()) && Arrays.equals(p0.getActualTypeArguments(), p1.getActualTypeArguments()))))) {
                b = false;
             }
             return b;
          }
       }else if(p0 instanceof GenericArrayType){
          if (!p1 instanceof GenericArrayType) {
             return false;
          }else {
             return do5.r(p0.getGenericComponentType(), p1.getGenericComponentType());
          }
       }else if(p0 instanceof WildcardType){
          if (!p1 instanceof WildcardType) {
             return false;
          }else if(Arrays.equals(p0.getUpperBounds(), p1.getUpperBounds()) && Arrays.equals(p0.getLowerBounds(), p1.getLowerBounds())){
             b = false;
          }
          return b;
       }else if(p0 instanceof TypeVariable){
          if (!p1 instanceof TypeVariable) {
             return false;
          }
          if (p0.getGenericDeclaration() != p1.getGenericDeclaration() || !p0.getName().equals(p1.getName())) {
             b = false;
          }
          return b;
       }else {
          return false;
       }
    }
    public static l51 s(Throwable p0){
       return new l51(false, p0, null);
    }
    public static void s0(Parcel p0,int p1){
       p0.setDataPosition((p0.dataPosition() + do5.f0(p0, p1)));
    }
    public static int t(int p0,int p1){
       if (p1 < 0) {
          throw new AssertionError("cannot store more than MAX_VALUE elements");
       }
       if ((p0 = (p0 + (p0 >> 1)) + 1) < p1) {
          p1--;
          p0 = Integer.highestOneBit(p1) << 1;
       }
       if (p0 < 0) {
          p0 = Integer.MAX_VALUE;
       }
       return p0;
    }
    public static l51 u0(Object p0){
       return new l51(false, null, p0);
    }
    public static void v0(Throwable p0){
       if (p0 instanceof VirtualMachineError) {
          throw p0;
       }
       if (p0 instanceof ThreadDeath) {
          throw p0;
       }
       if (!p0 instanceof LinkageError) {
          return;
       }
       throw p0;
    }
    public static float w(EdgeEffect p0){
       if (Build$VERSION.SDK_INT >= 31) {
          return fg1.b(p0);
       }
       return 0;
    }
    public static String w0(Type p0){
       String name = (p0 instanceof Class)? p0.getName(): p0.toString();
       return name;
    }
    public static Type x(Type p0,Class p1,Class p2){
       object oobject;
       Class superclass;
       if (p2 == p1) {
          return p0;
       }
       if (p2.isInterface()) {
          Class[] interfaces = p1.getInterfaces();
          int len = interfaces.length;
          int i = 0;
          while (true) {
             if (i < len) {
                if ((oobject = interfaces[i]) == p2) {
                   return p1.getGenericInterfaces()[i];
                }else if(p2.isAssignableFrom(oobject)){
                   return do5.x(p1.getGenericInterfaces()[i], interfaces[i], p2);
                }else {
                   i = i + 1;
                }
             }
          }
       }
       if (!p1.isInterface()) {
          while (p1 != Object.class) {
             if ((superclass = p1.getSuperclass()) == p2) {
                return p1.getGenericSuperclass();
             }else if(p2.isAssignableFrom(superclass)){
                return do5.x(p1.getGenericSuperclass(), superclass, p2);
             }
             p1 = superclass;
          }
       }
       return p2;
    }
    public static void x0(View p0){
       tz tag;
       if (p0.isInEditMode()) {
          return;
       }
       int i = 0;
       if (p0 instanceof ViewGroup) {
          for (; i < p0.getChildCount(); i = i + 1) {
             do5.x0(p0.getChildAt(i));
          }
       }else if(!p0 instanceof TextView || (tag = p0.getTag(R.id.baselines_margin_view)) == null){
          int i1 = (tag.a != null)? - (int)Math.ceil((double)Math.abs(p0.getPaint().getFontMetrics().ascent)): 0;
          ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
          int i2 = 0x7f0a009a;
          Integer tag1 = p0.getTag(i2);
          ViewGroup$MarginLayoutParams topMargin = p0.getLayoutParams().topMargin;
          if (tag1 == null) {
             p0.setTag(i2, Integer.valueOf(topMargin));
          }else {
             topMargin = tag1.intValue();
          }
          layoutParams.topMargin = topMargin + i1;
          if (tag.b != null) {
             i = - (int)Math.ceil((double)Math.abs(p0.getPaint().getFontMetrics().descent));
          }
          ViewGroup$MarginLayoutParams layoutParams1 = p0.getLayoutParams();
          Integer tag2 = p0.getTag(R.id.baselines_original_bottom_margin);
          ViewGroup$MarginLayoutParams bottomMargin = p0.getLayoutParams().bottomMargin;
          if (tag2 == null) {
             p0.setTag(R.id.baselines_original_bottom_margin, Integer.valueOf(bottomMargin));
          }else {
             bottomMargin = tag2.intValue();
          }
          layoutParams1.bottomMargin = bottomMargin + i;
       }
       return;
    }
    public static float y(int p0){
       return ((do5.L((p0 & 0x00ff)) * 0.07f) + ((do5.L(((p0 >> 8) & 0x00ff)) * 0x3f371759) + (do5.L(((p0 >> 16) & 0x00ff)) * 0.21f)));
    }
    public static void y0(TextView[] p0){
       tz tag;
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (!oobject.isInEditMode()) {
             int i1 = 0x7f0a0098;
             if ((tag = oobject.getTag(i1)) == null) {
                tag = new tz();
                oobject.setTag(i1, tag);
             }
             tag.b = true;
          }
          i = i + 1;
       }
       return;
    }
    public static void z0(TextView[] p0){
       tz tag;
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (!oobject.isInEditMode()) {
             int i1 = 0x7f0a0098;
             if ((tag = oobject.getTag(i1)) == null) {
                tag = new tz();
                oobject.setTag(i1, tag);
             }
             tag.a = true;
          }
          i = i + 1;
       }
       return;
    }
    public abstract int A();
    public abstract Context F();
    public boolean H(){
       return false;
    }
    public void Q(){
    }
    public void R(){
    }
    public abstract boolean S(int p0,KeyEvent p1);
    public boolean T(KeyEvent p0){
       return false;
    }
    public boolean V(){
       return false;
    }
    public abstract boolean b(int p0,int p1);
    public abstract boolean c(int p0,int p1);
    public boolean i(){
       return false;
    }
    public abstract boolean j();
    public abstract void p(boolean p0);
    public abstract void p0(boolean p0);
    public abstract void q0(boolean p0);
    public abstract void r0(CharSequence p0);
    public b6 t0(xf p0){
       return null;
    }
    public void u(int p0,int p1){
    }
    public abstract int v();
    public abstract int z();
}
