package p.ra7;
import p.vf;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.lang.Integer;
import java.util.List;
import java.lang.Boolean;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.reflect.Array;
import android.graphics.Typeface;
import java.lang.Throwable;
import android.util.Log;
import android.content.Context;
import p.xb2;
import android.content.res.Resources;
import p.yb2;
import java.io.File;
import p.ry7;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel$MapMode;
import java.nio.MappedByteBuffer;
import p.dc2;
import p.wh6;
import android.net.Uri;

public final class ra7 extends vf	// class@0024ae from classes.dex
{
    public static final Class c;
    public static final Constructor t;
    public static final Method v;
    public static final Method w;

    static {
       Class uClass;
       Constructor constructor;
       Method method;
       Method method1;
       try{
          uClass = Class.forName("android.graphics.FontFamily");
          Class[] uClassArray = new Class[0];
          constructor = uClass.getConstructor(uClassArray);
          Class[] uClassArray1 = new Class[5];
          uClassArray1[0] = ByteBuffer.class;
          Class tYPE = Integer.TYPE;
          uClassArray1[1] = tYPE;
          uClassArray1[2] = List.class;
          uClassArray1[3] = tYPE;
          uClassArray1[4] = Boolean.TYPE;
          method = uClass.getMethod("addFontWeightStyle", uClassArray1);
          Class[] uClassArray2 = new Class[]{Array.newInstance(uClass, 1).getClass()};
          method1 = Typeface.class.getMethod("createFromFamiliesWithDefault", uClassArray2);
       label_0055 :
          ra7.t = constructor;
          ra7.c = uClass;
          ra7.v = method;
          ra7.w = method1;
       }catch(java.lang.ClassNotFoundException e0){
       }catch(java.lang.NoSuchMethodException e0){
       }
       Log.e("TypefaceCompatApi24Impl", e0.getClass().getName(), e0);
       uClass = null;
       method1 = uClass;
       constructor = method1;
       method = constructor;
       goto label_0055 ;
    }
    public void ra7(){
       super(4);
    }
    public static boolean O(Object p0,ByteBuffer p1,int p2,int p3,boolean p4){
       int i = 0;
       try{
          Object[] objArray = new Object[]{p1,Integer.valueOf(p2),null,Integer.valueOf(p3),Boolean.valueOf(p4)};
          return ra7.v.invoke(p0, objArray).booleanValue();
       }catch(java.lang.IllegalAccessException e0){
          return e0;
       }catch(java.lang.reflect.InvocationTargetException e0){
       }
    }
    public final Typeface f(Context p0,xb2 p1,Resources p2,int p3){
       Object obj;
       Typeface typeface1;
       Typeface typeface = null;
       int i = 0;
       try{
          Object[] objArray = new Object[i];
          obj = ra7.t.newInstance(objArray);
       }catch(java.lang.IllegalAccessException e0){
          obj = typeface;
       }catch(java.lang.InstantiationException e0){
       }catch(java.lang.reflect.InvocationTargetException e0){
       }
       if (obj == null) {
          return typeface;
       }
       xb2 a = p1.a;
       int len = a.length;
       int i1 = 0;
       while (true) {
          if (i1 < len) {
             object oobject = a[i1];
             yb2 f = oobject.f;
             File uFile = ry7.G(p0);
             Resources resources = p2;
             if (uFile != null) {
                if (!ry7.i(uFile, resources, f)) {
                   uFile.delete();
                }else {
                   try{
                      FileInputStream uFileInputSt = new FileInputStream(uFile);
                      FileChannel channel = uFileInputSt.getChannel();
                      typeface1 = channel.map(FileChannel$MapMode.READ_ONLY, 0, channel.size());
                      uFileInputSt.close();
                   }catch(java.io.IOException e0){
                      typeface1 = typeface;
                   }
                   uFile.delete();
                label_0059 :
                   if (typeface1 == null) {
                      break ;
                   }else if(!ra7.O(obj, typeface1, oobject.e, oobject.b, oobject.c)){
                      return typeface;
                   }else {
                      i1 = i1 + 1;
                   }
                }
             }
             typeface1 = typeface;
             goto label_0059 ;
          }else {
             Object obj1 = Array.newInstance(ra7.c, 1);
             Array.set(obj1, i, obj);
             Object[] objArray1 = new Object[]{obj1};
             return ra7.w.invoke(typeface, objArray1);
          }
       }
       return typeface;
    }
    public final Typeface h(Context p0,dc2[] p1,int p2){
       Object obj;
       ByteBuffer orDefault;
       Typeface typeface;
       int i = 0;
       try{
          Object[] objArray = new Object[i];
          obj = ra7.t.newInstance(objArray);
       }catch(java.lang.IllegalAccessException e0){
          obj = e0;
       }catch(java.lang.InstantiationException e0){
       }catch(java.lang.reflect.InvocationTargetException e0){
       }
       if (obj == null) {
          return e0;
       }
       wh6 owh6 = new wh6();
       int len = p1.length;
       int i1 = 0;
       while (true) {
          if (i1 < len) {
             object oobject = p1[i1];
             dc2 a = oobject.a;
             if ((orDefault = owh6.getOrDefault(a, e0)) == null) {
                orDefault = ry7.P(p0, a);
                owh6.put(a, orDefault);
             }
             if (orDefault == null) {
                break ;
             }else if(!ra7.O(obj, orDefault, oobject.b, oobject.c, oobject.d)){
                return e0;
             }else {
                i1 = i1 + 1;
             }
          }else {
             try{
                p0 = Array.newInstance(ra7.c, 1);
                Array.set(p0, i, obj);
                Object[] objArray1 = new Object[]{p0};
                typeface = ra7.w.invoke(e0, objArray1);
             }catch(java.lang.IllegalAccessException e0){
                typeface = e0;
             }catch(java.lang.reflect.InvocationTargetException e0){
             }
             if (typeface == null) {
                return e0;
             }
             return Typeface.create(typeface, p2);
          }
       }
       return e0;
    }
}
