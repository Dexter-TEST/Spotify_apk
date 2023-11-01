package p.lf6;
import p.zt7;
import p.bl2;
import android.content.Context;
import android.os.Looper;
import p.yg0;
import android.os.Bundle;
import p.jl2;
import p.kl2;
import p.dp0;
import p.t15;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.String;
import p.bu7;
import java.lang.Object;
import android.os.BaseBundle;

public final class lf6 extends bl2 implements zt7	// class@001d44 from classes.dex
{
    public final boolean A;
    public final yg0 B;
    public final Bundle C;
    public final Integer D;

    public void lf6(Context p0,Looper p1,yg0 p2,Bundle p3,jl2 p4,kl2 p5){
       super(p0, p1, 44, p2, p4, p5);
       this.A = true;
       this.B = p2;
       this.C = p3;
       this.D = p2.h;
    }
    public final int a(){
       return 0xbdfcb8;
    }
    public final boolean b(){
       return this.A;
    }
    public final IInterface c(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
       if (iInterface instanceof bu7) {
          return iInterface;
       }
       return new bu7(p0);
    }
    public final Bundle g(){
       lf6 tB = this.B;
       lf6 tC = this.C;
       if (!this.c.getPackageName().equals(tB.e)) {
          tC.putString("com.google.android.gms.signin.internal.realClientPackageName", tB.e);
       }
       return tC;
    }
    public final String j(){
       return "com.google.android.gms.signin.internal.ISignInService";
    }
    public final String k(){
       return "com.google.android.gms.signin.service.START";
    }
}
