package p.sa7;
import p.qa7;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.Throwable;
import android.util.Log;
import android.content.res.AssetManager;
import java.lang.Integer;
import java.lang.Boolean;
import android.graphics.fonts.FontVariationAxis;
import java.nio.ByteBuffer;
import android.content.Context;
import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.AccessibleObject;
import p.xb2;
import android.content.res.Resources;
import p.yb2;
import p.z27;
import p.dc2;
import p.vf;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.graphics.Typeface$Builder;
import java.io.FileDescriptor;
import java.util.HashMap;
import java.nio.MappedByteBuffer;
import p.ry7;
import java.util.Map;
import java.util.Collections;

public class sa7 extends qa7	// class@0025f1 from classes.dex
{
    public final Method A;
    public final Method B;
    public final Method C;
    public final Method D;
    public final Method E;
    public final Class y;
    public final Constructor z;

    public void sa7(){
       Class uClass;
       Constructor constructor;
       Method method;
       Method method1;
       Method method2;
       Method method3;
       Method method4;
       try{
          super();
          uClass = Class.forName("android.graphics.FontFamily");
          Class[] uClassArray = new Class[0];
          constructor = uClass.getConstructor(uClassArray);
          method = sa7.T(uClass);
          method1 = sa7.U(uClass);
          Class[] uClassArray1 = new Class[0];
          method2 = uClass.getMethod("freeze", uClassArray1);
          Class[] uClassArray2 = new Class[0];
          method3 = uClass.getMethod("abortCreation", uClassArray2);
          method4 = this.V(uClass);
       label_004a :
          this.y = uClass;
          this.z = constructor;
          this.A = method;
          this.B = method1;
          this.C = method2;
          this.D = method3;
          this.E = method4;
          return;
       }catch(java.lang.ClassNotFoundException e0){
       }catch(java.lang.NoSuchMethodException e0){
       }
       Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e0.getClass().getName()), e0);
       uClass = null;
       method3 = uClass;
       constructor = method3;
       method = constructor;
       method1 = method;
       method2 = method1;
       method4 = method2;
       goto label_004a ;
    }
    public static Method T(Class p0){
       Class[] uClassArray = new Class[8];
       uClassArray[0] = AssetManager.class;
       uClassArray[1] = String.class;
       Class tYPE = Integer.TYPE;
       uClassArray[2] = tYPE;
       uClassArray[3] = Boolean.TYPE;
       uClassArray[4] = tYPE;
       uClassArray[5] = tYPE;
       uClassArray[6] = tYPE;
       uClassArray[7] = FontVariationAxis[].class;
       return p0.getMethod("addFontFromAssetManager", uClassArray);
    }
    public static Method U(Class p0){
       Class[] uClassArray = new Class[5];
       uClassArray[0] = ByteBuffer.class;
       Class tYPE = Integer.TYPE;
       uClassArray[1] = tYPE;
       uClassArray[2] = FontVariationAxis[].class;
       uClassArray[3] = tYPE;
       uClassArray[4] = tYPE;
       return p0.getMethod("addFontFromBuffer", uClassArray);
    }
    public final boolean Q(Context p0,Object p1,String p2,int p3,int p4,int p5,FontVariationAxis[] p6){
       int i = 0;
       try{
          Object[] objArray = new Object[]{p0.getAssets(),p2,Integer.valueOf(i),Boolean.FALSE,Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),p6};
          return this.A.invoke(p1, objArray).booleanValue();
       }catch(java.lang.IllegalAccessException e0){
          return e0;
       }catch(java.lang.reflect.InvocationTargetException e0){
       }
    }
    public Typeface R(Object p0){
       Object obj = null;
       try{
          Object obj1 = Array.newInstance(this.y, 1);
          Array.set(obj1, 0, p0);
          Object[] objArray = new Object[]{obj1,Integer.valueOf(-1),Integer.valueOf(-1)};
          return this.E.invoke(obj, objArray);
       }catch(java.lang.IllegalAccessException e0){
          return e0;
       }catch(java.lang.reflect.InvocationTargetException e0){
       }
    }
    public final boolean S(Object p0){
       int i = 0;
       try{
          Object[] objArray = new Object[i];
          return this.C.invoke(p0, objArray).booleanValue();
       }catch(java.lang.IllegalAccessException e0){
          return e0;
       }catch(java.lang.reflect.InvocationTargetException e0){
       }
    }
    public Method V(Class p0){
       Class[] uClassArray = new Class[3];
       uClassArray[0] = Array.newInstance(p0, 1).getClass();
       p0 = Integer.TYPE;
       uClassArray[1] = p0;
       uClassArray[2] = p0;
       Method declaredMeth = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", uClassArray);
       declaredMeth.setAccessible(1);
       return declaredMeth;
    }
    public final Typeface f(Context p0,xb2 p1,Resources p2,int p3){
       Object obj;
       object oobject;
       int i = (this.A != null)? 1: 0;
       if (!i) {
          return super.f(p0, p1, p2, p3);
       }else {
          Typeface typeface = null;
          try{
             Object[] objArray = new Object[0];
             obj = this.z.newInstance(objArray);
          }catch(java.lang.IllegalAccessException e0){
             obj = typeface;
          }catch(java.lang.InstantiationException e0){
          }catch(java.lang.reflect.InvocationTargetException e0){
          }
          if (obj == null) {
             return typeface;
          }else {
             p1 = p1.a;
             i = p1.length;
             int i1 = 0;
             while (true) {
                if (i1 < i) {
                   if (!(oobject = p1[i1])) {
                      try{
                         Object[] objArray1 = new Object[0];
                         this.D.invoke(obj, objArray1);
                         break ;
                      }catch(java.lang.IllegalAccessException e0){
                      }catch(java.lang.reflect.InvocationTargetException e0){
                      }
                   }else {
                      i1 = i1 + 1;
                   }
                }else if(!this.S(obj)){
                   return typeface;
                }else {
                   return this.R(obj);
                }
             }
             return typeface;
          }
       }
    }
    public final Typeface h(Context p0,dc2[] p1,int p2){
       ParcelFileDescriptor parcelFileDe;
       int i4;
       Object obj;
       ByteBuffer uByteBuffer;
       boolean b1;
       Object[] objArray2;
       Typeface typeface1;
       sa7 osa7 = this;
       dc2[] uodc2Array = p1;
       int i = p2;
       Typeface typeface = null;
       int i1 = 1;
       if (uodc2Array.length < i1) {
          return typeface;
       }
       int i2 = (osa7.A != null)? 1: 0;
       if (!i2) {
          dc2 uodc2 = osa7.q(i, uodc2Array);
          ContentResolver contentResol = p0.getContentResolver();
          try{
             if ((parcelFileDe = contentResol.openFileDescriptor(uodc2.a, "r", typeface)) == null) {
                if (parcelFileDe != null) {
                   parcelFileDe.close();
                }
                return typeface;
             }else {
                parcelFileDe.close();
                return new Typeface$Builder(parcelFileDe.getFileDescriptor()).setWeight(uodc2.c).setItalic(uodc2.d).build();
             }
          }catch(java.io.IOException e0){
             return typeface;
          }
       }else {
          HashMap hashMap = new HashMap();
          int len = uodc2Array.length;
          int i3 = 0;
          while (i3 < len) {
             object oobject = uodc2Array[i3];
             if (oobject.e == null) {
                dc2 a = oobject.a;
                if (!hashMap.containsKey(a)) {
                   hashMap.put(a, ry7.P(p0, a));
                label_007c :
                   i3 = i3 + 1;
                }
             }
             i4 = p0;
             goto label_007c ;
          }
          Map map = Collections.unmodifiableMap(hashMap);
          try{
             Object[] objArray = new Object[0];
             obj = osa7.z.newInstance(objArray);
          }catch(java.lang.IllegalAccessException e0){
             obj = typeface;
          }catch(java.lang.InstantiationException e0){
          }catch(java.lang.reflect.InvocationTargetException e0){
          }
          if (obj == null) {
             return typeface;
          }else {
             i3 = e0.length;
             int i5 = 0;
             i4 = 0;
             while (true) {
                sa7 d = osa7.D;
                if (i5 < i3) {
                   object oobject1 = e0[i5];
                   if ((uByteBuffer = map.get(oobject1.a)) != null) {
                      dc2 b = oobject1.b;
                      dc2 c = oobject1.c;
                      dc2 d1 = oobject1.d;
                      try{
                         Object[] objArray1 = new Object[5];
                         objArray1[0] = uByteBuffer;
                         objArray1[i1] = Integer.valueOf(b);
                         objArray1[2] = null;
                         objArray1[3] = Integer.valueOf(c);
                         objArray1[4] = Integer.valueOf(d1);
                         b1 = osa7.B.invoke(obj, objArray1).booleanValue();
                      }catch(java.lang.IllegalAccessException e0){
                         b1 = false;
                      }catch(java.lang.reflect.InvocationTargetException e0){
                      }
                      if (!b1) {
                         try{
                            objArray2 = new Object[0];
                            d.invoke(obj, objArray2);
                            break ;
                         }catch(java.lang.IllegalAccessException e0){
                         }catch(java.lang.reflect.InvocationTargetException e0){
                         }
                      }else {
                         b = 1;
                      }
                   }
                   i5 = i5 + 1;
                   typeface = 0;
                }else if(!i4){
                   objArray2 = new Object[0];
                   d.invoke(obj, objArray2);
                   return null;
                }else if(!osa7.S(obj)){
                   return null;
                }else if((typeface1 = osa7.R(obj)) == null){
                   return null;
                }else {
                   return Typeface.create(typeface1, i);
                }
             }
             return null;
          }
       }
    }
    public final Typeface m(Context p0,Resources p1,int p2,String p3,int p4){
       Object obj;
       int i = (this.A != null)? 1: 0;
       if (!i) {
          return super.m(p0, p1, p2, p3, p4);
       }else {
          Typeface typeface = null;
          try{
             Object[] objArray = new Object[0];
             obj = this.z.newInstance(objArray);
          }catch(java.lang.IllegalAccessException e0){
             obj = typeface;
          }catch(java.lang.InstantiationException e0){
          }catch(java.lang.reflect.InvocationTargetException e0){
          }
          if (obj == null) {
             return typeface;
          }else if(!this.Q(p0, obj, p3, 0, -1, -1, null)){
             try{
                Object[] objArray1 = new Object[0];
                this.D.invoke(obj, objArray1);
                return typeface;
             }catch(java.lang.IllegalAccessException e0){
             }catch(java.lang.reflect.InvocationTargetException e0){
             }
          }else if(!this.S(obj)){
             return typeface;
          }else {
             return this.R(obj);
          }
       }
    }
}
