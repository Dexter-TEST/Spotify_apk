package p.n55;
import java.lang.String;
import p.es3;
import android.content.Context;
import java.lang.Class;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import java.lang.Object;

public abstract class n55	// class@001f6f from classes.dex
{

    static {
       es3.d("PackageManagerHelper");
    }
    public static void a(Context p0,Class p1,boolean p2){
       try{
          PackageManager packageManag = p0.getPackageManager();
          ComponentName uComponentNa = new ComponentName(p0, p1.getName());
          int i = 1;
          int i1 = (p2)? 1: 2;
          packageManag.setComponentEnabledSetting(uComponentNa, i1, i);
          es3.c().getClass();
       }catch(java.lang.Exception e0){
          es3.c().getClass();
       }
       return;
    }
}
