package p.iy;
import p.ey;
import p.bl2;
import android.os.IBinder;
import android.os.Bundle;
import p.fp0;
import p.x3;
import p.t15;
import java.lang.System;
import java.lang.Object;
import p.w51;
import java.lang.String;
import java.lang.StringBuilder;
import android.util.Log;
import android.os.IInterface;
import p.dp0;

public final class iy extends ey	// class@001a2f from classes.dex
{
    public final IBinder g;
    public final bl2 h;

    public void iy(bl2 p0,int p1,IBinder p2,Bundle p3){
       this.h = p0;
       super(p0, p1, p3);
       this.g = p2;
    }
    public final void b(fp0 p0){
       bl2 o;
       if ((o = this.h.o) != null) {
          o.a.n(p0);
       }
       System.currentTimeMillis();
       return;
    }
    public final boolean c(){
       IInterface iInterface;
       bl2 n;
       iy tg = this.g;
       boolean b = false;
       try{
          w51.k(tg);
          String interfaceDes = tg.getInterfaceDescriptor();
          iy th = this.h;
          if (!th.j().equals(interfaceDes)) {
             String str = th.j();
             StringBuilder str1 = new StringBuilder((String.valueOf(interfaceDes).length() + (String.valueOf(str).length() + 34)))+"service descriptor mismatch: "+str;
             Log.e("GmsClient", str1+" vs. "+interfaceDes);
             return b;
          }else if((iInterface = th.c(tg)) != null && (bl2.q(th, 2, 4, iInterface) && !bl2.q(th, 3, 4, iInterface))){
             th.s = null;
             if ((n = th.n) != null) {
                n.a.k();
             }
             return true;
          }else {
             return b;
          }
       }catch(android.os.RemoteException e0){
       }
    }
}
