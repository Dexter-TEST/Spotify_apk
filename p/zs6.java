package p.zs6;
import p.ir0;
import com.spotify.litesettings.settings.StorageLocationMissingActivity;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import android.content.ContextWrapper;
import com.jakewharton.processphoenix.ProcessPhoenix;
import p.jc7;
import android.content.Context;
import java.lang.String;
import android.content.Intent;
import p.xj0;

public final class zs6 implements ir0	// class@002f5b from classes.dex
{
    public final int a;
    public final StorageLocationMissingActivity b;

    public void zs6(StorageLocationMissingActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       zs6 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.getClass();
             tb.startActivity(xj0.z0(tb, "spotify.intent.action.STORAGE_LOCATION_SETTINGS").putExtra("EXTRA_REQUIRED", true));
             return;
       }
       tb.getClass();
       ProcessPhoenix.b(tb);
       return;
    }
}
