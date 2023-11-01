package p.jw6;
import android.view.MenuItem$OnMenuItemClickListener;
import java.lang.Class;
import android.view.MenuItem;
import java.lang.Object;
import java.lang.String;
import java.lang.reflect.Method;
import android.view.InflateException;
import java.lang.StringBuilder;
import p.en6;
import java.lang.Throwable;
import java.lang.Boolean;
import java.lang.RuntimeException;

public final class jw6 implements MenuItem$OnMenuItemClickListener	// class@001b5c from classes.dex
{
    public final Object a;
    public final Method b;
    public static final Class[] c;

    static {
       Class[] uClassArray = new Class[]{MenuItem.class};
       jw6.c = uClassArray;
    }
    public void jw6(Object p0,String p1){
       super();
       this.a = p0;
       p0 = p0.getClass();
       try{
          this.b = p0.getMethod(p1, jw6.c);
          return;
       }catch(java.lang.Exception e0){
          InflateException inflateExcep = new InflateException(en6.t("Couldn\'t resolve menu item onClick handler ", p1, " in class ")+p0.getName());
          inflateExcep.initCause(e0);
          throw inflateExcep;
       }
    }
    public final boolean onMenuItemClick(MenuItem p0){
       Object[] objArray;
       jw6 tb = this.b;
       try{
          jw6 ta = this.a;
          if (tb.getReturnType() == Boolean.TYPE) {
             objArray = new Object[]{p0};
             return tb.invoke(ta, objArray).booleanValue();
          }else {
             objArray = new Object[]{p0};
             tb.invoke(ta, objArray);
             return 1;
          }
       }catch(java.lang.Exception e7){
          throw new RuntimeException(e7);
       }
    }
}
