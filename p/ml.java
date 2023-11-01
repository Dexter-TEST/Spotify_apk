package p.ml;
import p.mv5;
import android.content.Context;
import java.lang.Object;
import p.cv5;
import java.lang.String;
import android.net.Uri;
import java.util.List;
import p.dm5;
import android.content.res.AssetManager;
import java.io.InputStream;
import p.on;
import p.xe7;
import p.ud5;
import p.nn6;

public final class ml extends mv5	// class@001ebe from classes.dex
{
    public final Context a;
    public final Object b;
    public AssetManager c;

    public void ml(Context p0){
       super();
       this.b = new Object();
       this.a = p0;
    }
    public final boolean b(cv5 p0){
       p0 = p0.c;
       int i = 0;
       if ("file".equals(p0.getScheme()) && (!p0.getPathSegments().isEmpty() && "android_asset".equals(p0.getPathSegments().get(i)))) {
          i = true;
       }
       return i;
    }
    public final dm5 e(cv5 p0,int p1){
       if (this.c == null) {
          ml tb = this.b;
          _monitor_enter(tb);
          if (this.c == null) {
             this.c = this.a.getAssets();
          }
          _monitor_exit(tb);
       }
       return new dm5(xe7.d0(this.c.open(p0.c.toString().substring(22))), ud5.c);
    }
}
