package p.ew7;
import p.bw7;
import p.pw7;
import p.l08;
import p.ow7;
import p.c28;
import android.os.Bundle;
import java.lang.String;
import android.os.BaseBundle;
import p.jw7;
import p.r18;
import android.os.Parcel;
import p.tu7;
import p.y08;
import android.os.IBinder;
import java.lang.Object;
import java.lang.Exception;
import p.jd;

public final class ew7 extends bw7	// class@001512 from classes.dex
{
    public final int b;
    public final l08 c;
    public final pw7 t;

    public void ew7(pw7 p0,l08 p1,int p2,l08 p3){
       this.t = p0;
       this.b = p2;
       this.c = p3;
       super(p1);
    }
    public final void a(){
       ew7 tt = this.t;
       int i = 0;
       try{
          ow7 n = tt.d.n;
          Bundle uBundle = new Bundle();
          uBundle.putInt("session_id", this.b);
          Parcel parcel = n.n();
          parcel.writeString(tt.a);
          parcel.writeInt(1);
          uBundle.writeToParcel(parcel, i);
          parcel.writeInt(1);
          pw7.h().writeToParcel(parcel, i);
          parcel.writeStrongBinder(new jw7(tt, this.c, 3));
          n.y(parcel, 9);
          return;
       }catch(android.os.RemoteException e0){
          Object[] objArray = new Object[i];
          pw7.g.d(e0, "notifySessionFailed", objArray);
          return;
       }
    }
}
