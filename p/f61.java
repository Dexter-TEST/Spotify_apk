package p.f61;
import p.ir0;
import com.spotify.litenavigation.deeplink.DeepLinkActivity;
import java.lang.Object;
import p.r45;
import java.lang.Class;
import android.content.Intent;
import java.lang.Throwable;
import java.lang.String;
import com.spotify.base.java.logging.Logger;

public final class f61 implements ir0	// class@001567 from classes.dex
{
    public final int a;
    public final DeepLinkActivity b;

    public void f61(DeepLinkActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       f61 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.getClass();
             Object[] objArray = new Object[0];
             Logger.b(p0.getMessage(), objArray);
             tb.C(null);
             return;
       }
       tb.getClass();
       tb.C(p0.f());
       return;
    }
}
