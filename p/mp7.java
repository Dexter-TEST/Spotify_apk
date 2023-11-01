package p.mp7;
import p.pp7;
import android.view.WindowInsets;
import p.xp7;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Object;
import android.graphics.Rect;
import java.lang.reflect.Constructor;
import android.view.View;
import p.aa3;
import p.vp7;

public final class mp7 extends pp7	// class@001ee0 from classes.dex
{
    public WindowInsets a;
    public aa3 b;
    public static Field c;
    public static boolean d;
    public static Constructor e;
    public static boolean f;

    public void mp7(){
       super();
       this.a = mp7.e();
    }
    public void mp7(xp7 p0){
       super(p0);
       this.a = p0.f();
    }
    private static WindowInsets e(){
       Field c;
       WindowInsets windowInsets1;
       Constructor e;
       WindowInsets windowInsets = WindowInsets.class;
       boolean b = true;
       if (!mp7.d) {
          try{
             mp7.c = windowInsets.getDeclaredField("CONSUMED");
             mp7.d = b;
          }catch(java.lang.ReflectiveOperationException e0){
          }
       }
       try{
          if ((c = mp7.c) != null && (windowInsets1 = c.get(null)) != null) {
             return new WindowInsets(windowInsets1);
          }
       }catch(java.lang.ReflectiveOperationException e0){
       }
       if (!mp7.f) {
          try{
             Class[] uClassArray = new Class[b];
             uClassArray[0] = Rect.class;
             mp7.e = windowInsets.getConstructor(uClassArray);
             mp7.f = b;
          }catch(java.lang.ReflectiveOperationException e0){
          }
       }
       if ((e = mp7.e) != null) {
          try{
             Object[] objArray = new Object[b];
             objArray[0] = new Rect();
             return e.newInstance(objArray);
          }catch(java.lang.ReflectiveOperationException e0){
             return v3;
          }
       }else {
       }
    }
    public xp7 b(){
       this.a();
       xp7 oxp7 = xp7.g(this.a, null);
       xp7 a = oxp7.a;
       a.o(null);
       a.q(this.b);
       return oxp7;
    }
    public void c(aa3 p0){
       this.b = p0;
    }
    public void d(aa3 p0){
       mp7 ta;
       if ((ta = this.a) != null) {
          this.a = ta.replaceSystemWindowInsets(p0.a, p0.b, p0.c, p0.d);
       }
       return;
    }
}
