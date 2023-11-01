package p.dv7;
import p.bl2;
import android.content.Context;
import android.os.Looper;
import p.yg0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p.jl2;
import p.kl2;
import p.dp0;
import p.t15;
import p.tl2;
import p.vu7;
import java.util.Random;
import java.lang.String;
import android.util.Base64;
import java.util.Set;
import java.util.Iterator;
import java.lang.Object;
import com.google.android.gms.common.api.Scope;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import android.os.IBinder;
import android.os.IInterface;
import p.ov7;

public final class dv7 extends bl2	// class@0013c7 from classes.dex
{
    public final GoogleSignInOptions A;

    public void dv7(Context p0,Looper p1,yg0 p2,GoogleSignInOptions p3,jl2 p4,kl2 p5){
       super(p0, p1, 91, p2, p4, p5);
       tl2 otl2 = (p3 != null)? new tl2(p3): new tl2();
       byte[] uobyteArray = new byte[16];
       vu7.a.nextBytes(uobyteArray);
       otl2.i = Base64.encodeToString(uobyteArray, 11);
       yg0 c = p2.c;
       if (!c.isEmpty()) {
          Iterator iterator = c.iterator();
          while (iterator.hasNext()) {
             Scope[] scopeArray = new Scope[0];
             tl2 a = otl2.a;
             a.add(iterator.next());
             a.addAll(Arrays.asList(scopeArray));
          }
       }
       this.A = otl2.a();
       return;
    }
    public final int a(){
       return 0xbdfcb8;
    }
    public final IInterface c(IBinder p0){
       IInterface iInterface;
       if (p0 == null) {
          iInterface = null;
       }else {
          IInterface iInterface1 = p0.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
          iInterface = (iInterface1 instanceof ov7)? iInterface1: new ov7(p0);
       }
       return iInterface;
    }
    public final String j(){
       return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }
    public final String k(){
       return "com.google.android.gms.auth.api.signin.service.START";
    }
}
