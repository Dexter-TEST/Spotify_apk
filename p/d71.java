package p.d71;
import p.c71;
import android.content.pm.PackageManager;
import java.lang.String;
import android.content.pm.Signature;
import android.content.pm.PackageInfo;

public final class d71 extends c71	// class@0012ef from classes.dex
{

    public void d71(){
       super();
    }
    public final Signature[] G(PackageManager p0,String p1){
       return p0.getPackageInfo(p1, 64).signatures;
    }
}
