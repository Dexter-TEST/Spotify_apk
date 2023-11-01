package p.pj4;
import java.lang.String;
import android.app.PendingIntent;
import android.content.res.Resources;
import androidx.core.graphics.drawable.IconCompat;
import android.os.Bundle;
import java.lang.Object;
import android.os.Build$VERSION;
import p.q53;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Throwable;
import android.util.Log;
import java.lang.CharSequence;
import p.sj4;

public final class pj4	// class@002273 from classes.dex
{
    public final Bundle a;
    public IconCompat b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final CharSequence f;
    public final PendingIntent g;

    public void pj4(int p0,String p1,PendingIntent p2){
       IconCompat a;
       int sDK_INT;
       IconCompat iconCompat = null;
       if (!p0) {
       }else {
          iconCompat = IconCompat.b(iconCompat, "", p0);
       }
       Bundle uBundle = new Bundle();
       super();
       this.d = true;
       this.b = iconCompat;
       if (iconCompat != null) {
          if ((a = iconCompat.a) == -1 && (sDK_INT = Build$VERSION.SDK_INT) >= 23) {
             a = iconCompat.b;
             if (sDK_INT >= 28) {
                a = q53.c(a);
             }else {
                try{
                   Class[] uClassArray = new Class[0];
                   Object[] objArray = new Object[0];
                   a = a.getClass().getMethod("getType", uClassArray).invoke(a, objArray).intValue();
                }catch(java.lang.IllegalAccessException e4){
                   Log.e("IconCompat", "Unable to get icon type "+a, e4);
                }catch(java.lang.reflect.InvocationTargetException e4){
                   Log.e("IconCompat", "Unable to get icon type "+a, e4);
                }catch(java.lang.NoSuchMethodException e4){
                   Log.e("IconCompat", "Unable to get icon type "+a, e4);
                }
             }
          }
          if (a == 2) {
             this.e = iconCompat.c();
          }
       }
       this.f = sj4.c(p1);
       this.g = p2;
       this.a = uBundle;
       this.c = true;
       this.d = true;
       return;
    }
}
