package p.c71;
import p.gg1;
import android.content.pm.ResolveInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.PackageManager;
import android.content.Intent;
import java.util.List;

public class c71 extends gg1	// class@0011ac from classes.dex
{

    public void c71(){
       super(8);
    }
    public final ProviderInfo F(ResolveInfo p0){
       return p0.providerInfo;
    }
    public final List T(PackageManager p0,Intent p1){
       return p0.queryIntentContentProviders(p1, 0);
    }
}
