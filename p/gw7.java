package p.gw7;
import p.bl2;
import android.content.Context;
import android.os.Looper;
import p.yg0;
import p.jl2;
import p.kl2;
import p.dp0;
import p.t15;
import android.os.Bundle;
import android.accounts.Account;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.gp;
import java.lang.Object;
import java.util.Map;
import p.tp2;
import java.util.Set;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.String;
import p.mw7;

public final class gw7 extends bl2	// class@001794 from classes.dex
{
    public final Bundle A;

    public void gw7(Context p0,Looper p1,yg0 p2,jl2 p3,kl2 p4){
       super(p0, p1, 16, p2, p3, p4);
       this.A = new Bundle();
    }
    public final int a(){
       return 0xbdfcb8;
    }
    public final boolean b(){
       yg0 a;
       bl2 tw = this.w;
       Account name = ((a = tw.a) != null)? a.name: null;
       if (!TextUtils.isEmpty(name)) {
          tp2.v(tw.d.get(gp.a));
          if (!tw.b.isEmpty()) {
             return true;
          }
       }
       return false;
    }
    public final IInterface c(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
       if (iInterface instanceof mw7) {
          return iInterface;
       }
       return new mw7(p0);
    }
    public final Bundle g(){
       return this.A;
    }
    public final String j(){
       return "com.google.android.gms.auth.api.internal.IAuthService";
    }
    public final String k(){
       return "com.google.android.gms.auth.service.START";
    }
}
