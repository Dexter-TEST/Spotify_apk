package p.h28;
import p.xu7;
import java.lang.String;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import p.y08;
import android.os.IBinder;
import android.os.IInterface;
import p.j28;
import p.yw7;
import java.lang.Object;
import p.jd;
import android.content.Context;
import p.ay7;
import java.io.File;
import p.dx7;
import p.tu7;

public abstract class h28 extends xu7	// class@0017cd from classes.dex
{

    public void h28(){
       super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService", 1);
    }
    public final boolean k(int p0,Parcel p1){
       Bundle uBundle;
       IBinder iBinder;
       IBinder iBinder1;
       j28 oj28 = null;
       String str = "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback";
       if (p0 != 2) {
          if (p0 != 3) {
             return false;
          }else {
             uBundle = y08.a(p1, Bundle.CREATOR);
             if ((iBinder = p1.readStrongBinder()) != null) {
                IInterface iInterface = iBinder.queryLocalInterface(str);
                oj28 = (iInterface instanceof j28)? iInterface: new j28(iBinder);
             }
             yw7 oyw7 = this;
             Object[] objArray = new Object[false];
             oyw7.b.a("clearAssetPackStorage AIDL call", objArray);
             yw7 c = oyw7.c;
             if (ay7.b(c) && ay7.a(c)) {
                dx7.g(oyw7.d.d());
                c = oj28.n();
                c.writeInt(true);
                new Bundle().writeToParcel(c, false);
                oj28.y(c, 4);
             }else {
                oj28.u(new Bundle());
             }
          }
       }else {
          uBundle = y08.a(p1, Bundle.CREATOR);
          if ((iBinder1 = p1.readStrongBinder()) != null) {
             IInterface iInterface1 = iBinder1.queryLocalInterface(str);
             oj28 = (iInterface1 instanceof j28)? iInterface1: new j28(iBinder1);
          }
          this.n(uBundle, oj28);
       }
       return true;
    }
}
