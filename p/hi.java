package p.hi;
import android.view.View$OnClickListener;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.reflect.Method;
import android.content.ContextWrapper;
import java.lang.StringBuilder;
import android.content.res.Resources;
import java.lang.IllegalStateException;
import p.en6;
import java.lang.Throwable;

public final class hi implements View$OnClickListener	// class@00185e from classes.dex
{
    public final View a;
    public final String b;
    public Method c;
    public Context t;

    public void hi(View p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onClick(View p0){
       Method method;
       int id;
       String str;
       int i = 0;
       int i1 = 1;
       if (this.c == null) {
          hi ta = this.a;
          Context context = ta.getContext();
          while (true) {
             hi tb = this.b;
             if (context != null) {
                try{
                   if (!context.isRestricted()) {
                      Class[] uClassArray = new Class[i1];
                      uClassArray[i] = View.class;
                      if ((method = context.getClass().getMethod(tb, uClassArray)) != null) {
                         this.c = method;
                         this.t = context;
                         break ;
                      }
                   }
                }catch(java.lang.NoSuchMethodException e0){
                }
                if (context instanceof ContextWrapper) {
                   context = context.getBaseContext();
                }else {
                   context = null;
                }
             }else if((id = ta.getId()) == -1){
                str = "";
             }else {
                str = " with id \'"+ta.getContext().getResources().getResourceEntryName(id)+"\'";
             }
             throw new IllegalStateException(en6.t("Could not find method ", tb, "\(View\) in a parent or ancestor Context for android:onClick attribute defined on view ")+ta.getClass()+str);
          }
       }
       try{
          Object[] objArray = new Object[i1];
          objArray[i] = p0;
          this.c.invoke(this.t, objArray);
          return;
       }catch(java.lang.IllegalAccessException e9){
          throw new IllegalStateException("Could not execute non-public method for android:onClick", e9);
       }catch(java.lang.reflect.InvocationTargetException e9){
          throw new IllegalStateException("Could not execute method for android:onClick", e9);
       }
    }
}
