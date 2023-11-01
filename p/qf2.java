package p.qf2;
import java.lang.Object;
import p.mp2;
import p.sm2;
import java.lang.String;
import p.av6;
import android.graphics.Path;
import p.b7;
import android.database.sqlite.SQLiteDatabase;
import p.nf2;
import p.co5;
import android.view.View;
import java.lang.Class;
import java.lang.Integer;
import java.lang.reflect.Method;
import java.lang.reflect.AccessibleObject;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;

public class qf2	// class@00238d from classes.dex
{
    public static Method a;
    public static boolean b;
    public static Field c;
    public static boolean d;

    public void qf2(){
       super();
    }
    public void qf2(Object p0){
       super();
    }
    public static mp2 a(mp2 p0,mp2 p1){
       String str;
       String str1;
       String str2;
       boolean b;
       String str3;
       sm2 osm2 = new sm2();
       int i = p0.a.length / 2;
       int i1 = 0;
       while (true) {
          str = "Content-Type";
          str1 = "Content-Encoding";
          str2 = "Content-Length";
          b = true;
          if (i1 < i) {
             str3 = p0.c(i1);
             String str4 = p0.g(i1);
             if (!av6.i0("Warning", str3, b) || !av6.D0(str4, "1", false)) {
                if (!av6.i0(str2, str3, b) && (!av6.i0(str1, str3, b) && !av6.i0(str, str3, b))) {
                   b = false;
                }
                if (b || (!qf2.d(str3) || p1.a(str3) == null)) {
                   osm2.b(str3, str4);
                }
             }
             i1 = i1 + 1;
          }else {
             break ;
          }
       }
       int i2 = p1.a.length / 2;
       i = 0;
       while (i < i2) {
          String str5 = p1.c(i);
          str3 = (!av6.i0(str2, str5, b) && (!av6.i0(str1, str5, b) && !av6.i0(str, str5, b)))? 0: 1;
          if (!str3 && qf2.d(str5)) {
             osm2.b(str5, p1.g(i));
          }
          i = i + 1;
       }
       return osm2.e();
    }
    public static Path b(float p0,float p1,float p2,float p3){
       Path path = new Path();
       path.moveTo(p0, p1);
       path.lineTo(p2, p3);
       return path;
    }
    public static nf2 c(b7 p0,SQLiteDatabase p1){
       b7 b;
       co5.o(p0, "refHolder");
       co5.o(p1, "sqLiteDatabase");
       if ((b = p0.b) == null || !co5.c(b.a, p1)) {
          b = new nf2(p1);
          p0.b = b;
       }
       return b;
    }
    public static boolean d(String p0){
       boolean b = true;
       if (av6.i0("Connection", p0, b) || (av6.i0("Keep-Alive", p0, b) || (av6.i0("Proxy-Authenticate", p0, b) || (av6.i0("Proxy-Authorization", p0, b) || (av6.i0("TE", p0, b) || (av6.i0("Trailers", p0, b) || (av6.i0("Transfer-Encoding", p0, b) || av6.i0("Upgrade", p0, b)))))))) {
          b = false;
       }
       return b;
    }
    public void e(View p0,int p1,int p2,int p3,int p4){
       Method declaredMeth;
       int i = 4;
       if (!qf2.b) {
          try{
             Class[] uClassArray = new Class[i];
             Class tYPE = Integer.TYPE;
             uClassArray[0] = tYPE;
             uClassArray[1] = tYPE;
             uClassArray[2] = tYPE;
             uClassArray[3] = tYPE;
             declaredMeth = View.class.getDeclaredMethod("setFrame", uClassArray);
             qf2.a = declaredMeth;
             declaredMeth.setAccessible(1);
             qf2.b = true;
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
       if ((declaredMeth = qf2.a) != null) {
          try{
             Object[] objArray = new Object[i];
             objArray[0] = Integer.valueOf(p1);
             objArray[1] = Integer.valueOf(p2);
             objArray[2] = Integer.valueOf(p3);
             objArray[3] = Integer.valueOf(p4);
             declaredMeth.invoke(p0, objArray);
          }catch(java.lang.IllegalAccessException e0){
          }catch(java.lang.reflect.InvocationTargetException e10){
             throw new RuntimeException(e10.getCause());
          }
       }
       return;
    }
    public void f(View p0,int p1){
       Field c;
       if (!qf2.d) {
          boolean b = true;
          try{
             Field declaredFiel = View.class.getDeclaredField("mViewFlags");
             qf2.c = declaredFiel;
             declaredFiel.setAccessible(b);
             qf2.d = e0;
          }catch(java.lang.NoSuchFieldException e0){
          }
       }
       try{
          if ((c = qf2.c) != null) {
             qf2.c.setInt(p0, (p1 | (c.getInt(p0) & 0xf3)));
          }
          return;
       }catch(java.lang.IllegalAccessException e0){
       }
    }
}
