package p.cn3;
import android.content.Context;
import p.mt6;
import p.l32;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.Class;
import com.spotify.base.java.logging.Logger;
import java.lang.Throwable;

public final class cn3	// class@00123e from classes.dex
{
    public final Context a;
    public final mt6 b;
    public final l32 c;

    public void cn3(Context p0,mt6 p1,l32 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static File b(File p0,String p1){
       if (p0 == null) {
          throw new IllegalStateException("No root directory for creating ".concat(p1));
       }
       p0 = p0.getAbsoluteFile();
       if (p0.isDirectory() && (p0.canWrite() || (p0.mkdirs() || (p0.isDirectory() && p0.canWrite())))) {
          return new File(p0, p1);
       }
       throw new IllegalStateException("Could not create "+p0);
    }
    public final void a(File p0){
       if (p0.isDirectory()) {
          this.c.getClass();
          l32.b(p0);
          if (!p0.delete()) {
             Object[] objArray = new Object[]{p0};
             Logger.i("Could not delete %s", objArray);
          }
       }
       return;
    }
    public final void c(File p0,File p1){
       if (p0.isDirectory() && (!p0.renameTo(p1) && (p1.isDirectory() && !p1.mkdirs()))) {
          try{
             this.c.getClass();
             l32.a(p0, p1);
          }catch(java.io.IOException e0){
             Object[] objArray = new Object[]{p0,p1};
             Logger.c(e0, "Unable to copy from %s to %s", objArray);
          }
          this.a(p0);
       }
       return;
    }
}
