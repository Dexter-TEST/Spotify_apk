package p.jw5;
import p.lw5;
import java.lang.Object;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;
import java.lang.String;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.reflect.Constructor;
import android.content.res.Resources;
import org.xmlpull.v1.XmlPullParser;
import p.hk0;
import java.lang.Throwable;
import android.util.Log;
import p.ie;
import p.ee;
import p.og7;

public final class jw5 implements lw5	// class@001b5b from classes.dex
{
    public final int a;

    public void jw5(int p0){
       this.a = p0;
       super();
    }
    public final Drawable a(Context p0,XmlResourceParser p1,AttributeSet p2,Resources$Theme p3){
       ee uoee;
       ie oie1;
       String classAttribu;
       og7 oog71;
       Drawable uDrawable = null;
       switch (this.a){
           case 0:
             try{
                uoee = ee.e(p0, p3, p0.getResources(), p2, p1);
             }catch(java.lang.Exception e5){
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e5);
             }
             return uoee;
             break;
           case 1:
             try{
                ie oie = new ie(p0);
                oie.inflate(p0.getResources(), p1, p2, p3);
                oie1 = oie;
             }catch(java.lang.Exception e5){
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e5);
             }
             return oie1;
             break;
           case 2:
             if ((classAttribu = p2.getClassAttribute()) != null) {
                try{
                   Class[] uClassArray = new Class[0];
                   Object[] objArray = new Object[0];
                   Drawable uDrawable1 = jw5.class.getClassLoader().loadClass(classAttribu).asSubclass(Drawable.class).getDeclaredConstructor(uClassArray).newInstance(objArray);
                   hk0.c(uDrawable1, p0.getResources(), p1, p2, p3);
                   uDrawable = uDrawable1;
                }catch(java.lang.Exception e5){
                   Log.e("DrawableDelegate", "Exception while inflating <drawable>", e5);
                }
             }
             break;
           default:
             try{
                og7 oog7 = new og7();
                oog7.inflate(p0.getResources(), p1, p2, p3);
                oog71 = oog7;
             }catch(java.lang.Exception e5){
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e5);
             }
             return oog71;
       }
       return uDrawable;
    }
}
