package p.a63;
import java.lang.Object;
import android.graphics.drawable.Drawable$Callback;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.View;
import android.content.Context;
import java.lang.String;
import android.graphics.Bitmap;
import p.cw3;

public final class a63	// class@000f1f from classes.dex
{
    public final Context a;
    public final String b;
    public final Map c;
    public static final Object d;

    static {
       a63.d = new Object();
    }
    public void a63(Drawable$Callback p0,Map p1){
       super();
       if (!TextUtils.isEmpty(null)) {
          throw null;
       }
       this.b = null;
       this.c = p1;
       if (!p0 instanceof View) {
          this.a = null;
          return;
       }else {
          this.a = p0.getContext().getApplicationContext();
          return;
       }
    }
    public final void a(String p0,Bitmap p1){
       Object d = a63.d;
       _monitor_enter(d);
       p0.d = p1;
       _monitor_exit(d);
    }
}
