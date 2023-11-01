package p.qa7;
import p.vf;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.reflect.Method;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.reflect.Array;
import android.graphics.Typeface;
import android.util.Log;
import android.content.Context;
import p.xb2;
import android.content.res.Resources;
import java.io.File;
import p.ry7;
import p.yb2;
import p.dc2;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.lang.StringBuilder;
import android.system.Os;
import android.system.StructStat;
import android.system.OsConstants;
import java.io.FileInputStream;
import java.io.FileDescriptor;
import java.io.InputStream;

public class qa7 extends vf	// class@002366 from classes.dex
{
    public static Class c;
    public static Constructor t;
    public static Method v;
    public static Method w;
    public static boolean x;

    public void qa7(){
       super(4);
    }
    public static boolean O(int p0,Object p1,String p2,boolean p3){
       try{
          qa7.P();
          Object[] objArray = new Object[]{p2,Integer.valueOf(p0),Boolean.valueOf(p3)};
          return qa7.v.invoke(p1, objArray).booleanValue();
       }catch(java.lang.IllegalAccessException e3){
       }catch(java.lang.reflect.InvocationTargetException e3){
       }
       throw new RuntimeException(e3);
    }
    public static void P(){
       Class uClass;
       Constructor constructor;
       Method method;
       Method method1;
       if (qa7.x) {
          return;
       }
       boolean b = true;
       qa7.x = b;
       try{
          uClass = Class.forName("android.graphics.FontFamily");
          Class[] uClassArray = new Class[0];
          constructor = uClass.getConstructor(uClassArray);
          Class[] uClassArray1 = new Class[]{String.class,Integer.TYPE,Boolean.TYPE};
          method = uClass.getMethod("addFontWeightStyle", uClassArray1);
          Class[] uClassArray2 = new Class[b];
          uClassArray2[0] = Array.newInstance(uClass, b).getClass();
          method1 = Typeface.class.getMethod("createFromFamiliesWithDefault", uClassArray2);
       label_0054 :
          qa7.t = constructor;
          qa7.c = uClass;
          qa7.v = method;
          qa7.w = method1;
          return;
       }catch(java.lang.ClassNotFoundException e0){
       }catch(java.lang.NoSuchMethodException e0){
       }
       Log.e("TypefaceCompatApi21Impl", e0.getClass().getName(), e0);
       uClass = null;
       method1 = uClass;
       constructor = method1;
       method = constructor;
       goto label_0054 ;
    }
    public Typeface f(Context p0,xb2 p1,Resources p2,int p3){
       File uFile;
       try{
          qa7.P();
          Object[] objArray = new Object[0];
          Object obj = qa7.t.newInstance(objArray);
          p1 = p1.a;
          int len = p1.length;
          int i = 0;
          while (true) {
             if (i < len) {
                object oobject = p1[i];
                if ((uFile = ry7.G(p0)) == null) {
                   break ;
                }else if(!ry7.i(uFile, p2, oobject.f)){
                   uFile.delete();
                   return null;
                }else if(!qa7.O(oobject.b, obj, uFile.getPath(), oobject.c)){
                   uFile.delete();
                   return null;
                }else {
                   uFile.delete();
                   i = i + 1;
                }
             }else {
                qa7.P();
                p0 = Array.newInstance(qa7.c, 1);
                Array.set(p0, 0, obj);
                Object[] objArray1 = new Object[]{p0};
                return qa7.w.invoke(null, objArray1);
             }
          }
          return null;
       }catch(java.lang.IllegalAccessException e9){
       }catch(java.lang.InstantiationException e9){
       }catch(java.lang.reflect.InvocationTargetException e9){
       }
       throw new RuntimeException(e9);
    }
    public Typeface h(Context p0,dc2[] p1,int p2){
       ParcelFileDescriptor parcelFileDe;
       Typeface typeface;
       if (p1.length < 1) {
          return null;
       }
       dc2 uodc2 = this.q(p2, p1);
       ContentResolver contentResol = p0.getContentResolver();
       try{
          if ((parcelFileDe = contentResol.openFileDescriptor(uodc2.a, "r", null)) == null) {
             if (parcelFileDe != null) {
                parcelFileDe.close();
             }
             return null;
          }else {
             String str = "/proc/self/fd/";
             try{
                str = Os.readlink(str+parcelFileDe.getFd());
                if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                   typeface = new File(str);
                   try{
                   label_0048 :
                      if (typeface != null && typeface.canRead()) {
                         Typeface typeface1 = Typeface.createFromFile(typeface);
                         parcelFileDe.close();
                         return typeface1;
                      }else {
                         FileInputStream uFileInputSt = new FileInputStream(parcelFileDe.getFileDescriptor());
                         uFileInputSt.close();
                         parcelFileDe.close();
                         return this.k(p0, uFileInputSt);
                      }
                   }catch(java.io.IOException e0){
                      return null;
                   }
                }
             }catch(android.system.ErrnoException e0){
             }
             typeface = null;
             goto label_0048 ;
          }
       }catch(java.io.IOException e0){
       }
    }
}
