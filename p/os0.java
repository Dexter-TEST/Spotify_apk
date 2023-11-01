package p.os0;
import android.content.Context;
import java.io.File;
import android.graphics.drawable.Drawable;

public abstract class os0	// class@00217b from classes.dex
{

    public static File a(Context p0){
       return p0.getCodeCacheDir();
    }
    public static Drawable b(Context p0,int p1){
       return p0.getDrawable(p1);
    }
    public static File c(Context p0){
       return p0.getNoBackupFilesDir();
    }
}
