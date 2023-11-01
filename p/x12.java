package p.x12;
import android.content.Context;
import java.lang.Object;
import p.ji5;
import java.lang.String;
import android.content.SharedPreferences;
import p.tm5;
import p.co5;
import p.vc;

public final class x12	// class@002be9 from classes.dex
{
    public boolean a;

    public void x12(Context p0){
       super();
       this.a = true;
       this.a = ji5.g(p0).a.getBoolean("bnc_tracking_state", false);
    }
    public void x12(tm5 p0){
       co5.o(p0, "propertiesProvider");
       super();
       this.a = p0.get().a();
    }
    public void x12(boolean p0){
       super();
       this.a = p0;
    }
}
