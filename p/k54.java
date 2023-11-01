package p.k54;
import android.media.session.MediaSessionManager$RemoteUserInfo;
import java.lang.Object;
import java.lang.String;
import p.q3;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.l54;
import java.lang.IllegalArgumentException;
import java.lang.NullPointerException;
import android.os.Build$VERSION;
import p.m54;

public final class k54	// class@001bab from classes.dex
{
    public final m54 a;

    public void k54(MediaSessionManager$RemoteUserInfo p0){
       String str;
       super();
       if ((str = q3.n(p0)) == null) {
          throw new NullPointerException("package shouldn\'t be null");
       }
       if (TextUtils.isEmpty(str)) {
          throw new IllegalArgumentException("packageName should be nonempty");
       }
       this.a = new l54(p0);
       return;
    }
    public void k54(String p0,int p1,int p2){
       super();
       if (p0 == null) {
          throw new NullPointerException("package shouldn\'t be null");
       }
       if (TextUtils.isEmpty(p0)) {
          throw new IllegalArgumentException("packageName should be nonempty");
       }
       this.a = (Build$VERSION.SDK_INT >= 28)? new l54(p0, p1, p2): new m54(p0, p1, p2);
       return;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof k54) {
          return false;
       }
       return this.a.equals(p0.a);
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
}
