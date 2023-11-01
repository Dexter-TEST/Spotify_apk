package p.k08;
import p.ly7;
import java.lang.Object;
import p.b28;
import android.content.Context;
import p.cy7;
import p.yz7;
import p.tu6;
import android.content.pm.PackageManager;
import java.lang.String;
import android.content.pm.ApplicationInfo;
import android.os.BaseBundle;

public final class k08 implements ly7	// class@001b82 from classes.dex
{
    public final int a;
    public final ly7 b;

    public void k08(ly7 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object c(){
       ApplicationInfo metaData;
       k08 tb = this.b;
       switch (this.a){
           case 0:
             yz7 oyz7 = tb.c();
             tu6.E(oyz7);
             return oyz7;
           case 1:
             return new cy7(tb.a());
           default:
             Context uContext = tb.a();
             try{
                tb = 0;
                if ((metaData = uContext.getPackageManager().getApplicationInfo(uContext.getPackageName(), 128).metaData) != null) {
                   String str = metaData.getString("local_testing_dir");
                }
                return tb;
             }catch(android.content.pm.PackageManager$NameNotFoundException e0){
             }
       }
    }
}
