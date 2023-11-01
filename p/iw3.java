package p.iw3;
import android.content.Context;
import p.lf7;
import java.lang.String;
import java.lang.Object;
import android.app.ActivityManager;
import android.content.pm.ApplicationInfo;
import p.zy2;

public final class iw3	// class@001a18 from classes.dex
{
    public final zy2 a;

    public void iw3(Context p0){
       ActivityManager systemServic = p0.getSystemService("activity");
       int i = ((p0.getApplicationInfo().flags & 0x100000))? 1: 0;
       i = (i)? systemServic.getLargeMemoryClass(): systemServic.getMemoryClass();
       super();
       this.a = new zy2(this, (int)(((long)i * 0x100000) / 7));
       return;
    }
}
