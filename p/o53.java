package p.o53;
import java.lang.Object;
import android.net.Uri;
import android.os.Build$VERSION;
import p.q53;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.Throwable;
import android.util.Log;
import android.graphics.drawable.Icon;
import android.content.Context;
import android.graphics.drawable.Drawable;
import p.jx1;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.IllegalArgumentException;
import p.r53;
import java.io.InputStream;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import p.p53;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;

public abstract class o53	// class@0020b1 from classes.dex
{

    public static Uri a(Object p0){
       if (Build$VERSION.SDK_INT >= 28) {
          return q53.d(p0);
       }
       int i = 0;
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          return p0.getClass().getMethod("getUri", uClassArray).invoke(p0, objArray);
       }catch(java.lang.IllegalAccessException e7){
          Log.e(v1, v0, e7);
          return i;
       }catch(java.lang.reflect.InvocationTargetException e7){
          Log.e(v1, v0, e7);
          return i;
       }catch(java.lang.NoSuchMethodException e7){
          Log.e(v1, v0, e7);
          return i;
       }
    }
    public static Drawable b(Icon p0,Context p1){
       return jx1.f(p0, p1);
    }
    public static Icon c(IconCompat p0,Context p1){
       Icon icon;
       IconCompat g;
       int sDK_INT;
       InputStream inputStream;
       int i = 26;
       switch (p0.a){
           case 0xffffffff:
           case 1:
             icon = jx1.h(p0.b);
          label_00b4 :
             if ((g = p0.g) != null) {
                jx1.o(icon, g);
             }
             if ((p0 = p0.h) != IconCompat.k) {
                jx1.p(icon, p0);
             }
             return icon;
             break;
           case 2:
             icon = jx1.g(p0.e, p0.d());
             goto label_00b4 ;
             break;
           case 3:
             icon = jx1.j(p0.b, p0.e, p0.f);
             goto label_00b4 ;
             break;
           case 4:
             icon = jx1.i(p0.b);
             goto label_00b4 ;
             break;
           case 5:
             if (Build$VERSION.SDK_INT >= i) {
                icon = p53.b(p0.b);
                goto label_00b4 ;
             }else {
                icon = jx1.h(IconCompat.a(p0.b));
                goto label_00b4 ;
             }
             break;
           case 6:
             if ((sDK_INT = Build$VERSION.SDK_INT) >= 30) {
                icon = r53.a(p0.e());
                goto label_00b4 ;
             }else if(p1 != null){
                if ((inputStream = p0.f(p1)) == null) {
                   throw new IllegalStateException("Cannot load adaptive icon from uri: "+p0.e());
                }
                if (sDK_INT >= i) {
                   icon = p53.b(BitmapFactory.decodeStream(inputStream));
                   goto label_00b4 ;
                }else {
                   icon = jx1.h(IconCompat.a(BitmapFactory.decodeStream(inputStream)));
                   goto label_00b4 ;
                }
             }else {
                throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: "+p0.e());
             }
             break;
           default:
             throw new IllegalArgumentException("Unknown type");
       }
       return p0.b;
    }
}
