package p.lp7;
import android.view.View;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.reflect.AccessibleObject;
import java.lang.Throwable;

public abstract class lp7	// class@001d9d from classes.dex
{
    public static final Field a;
    public static final Field b;
    public static final Field c;
    public static final boolean d;

    static {
       try{
          Field declaredFiel = View.class.getDeclaredField("mAttachInfo");
          lp7.a = declaredFiel;
          declaredFiel.setAccessible(true);
          Class uClass = Class.forName("android.view.View$AttachInfo");
          Field declaredFiel1 = uClass.getDeclaredField("mStableInsets");
          lp7.b = declaredFiel1;
          declaredFiel1.setAccessible(true);
          declaredFiel = uClass.getDeclaredField("mContentInsets");
          lp7.c = declaredFiel;
          declaredFiel.setAccessible(true);
          lp7.d = true;
       }catch(java.lang.ReflectiveOperationException e0){
          e0.getMessage();
       }
    }
}
