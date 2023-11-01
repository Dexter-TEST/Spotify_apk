package p.wl5;
import android.content.pm.PackageManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import java.lang.String;
import android.content.pm.PackageManager$PackageInfoFlags;

public abstract class wl5	// class@002b5e from classes.dex
{

    public static PackageInfo a(PackageManager p0,Context p1){
       return p0.getPackageInfo(p1.getPackageName(), PackageManager$PackageInfoFlags.of(0));
    }
}
