package p.ns0;
import android.content.Context;
import java.io.File;
import java.lang.String;

public abstract class ns0	// class@002039 from classes.dex
{

    public static File[] a(Context p0){
       return p0.getExternalCacheDirs();
    }
    public static File[] b(Context p0,String p1){
       return p0.getExternalFilesDirs(p1);
    }
    public static File[] c(Context p0){
       return p0.getObbDirs();
    }
}
