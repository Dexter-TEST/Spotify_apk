package p.mz7;
import p.jd;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;

public final class mz7	// class@001f39 from classes.dex
{
    public final Context a;
    public int b;
    public static final jd c;

    static {
       mz7.c = new jd("PackageStateCache");
    }
    public void mz7(Context p0){
       super();
       this.b = -1;
       this.a = p0;
    }
    public synchronized final int a(){
       if (this.b == -1) {
          int i = 0;
          try{
             this.b = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), i).versionCode;
          }catch(android.content.pm.PackageManager$NameNotFoundException e0){
             Object[] objArray = new Object[e0];
             mz7.c.c("The current version of the app could not be retrieved", objArray);
          }
       }
       return this.b;
    }
}
