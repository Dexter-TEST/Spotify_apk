package p.cw7;
import p.bw7;
import p.pw7;
import p.l08;
import java.lang.String;
import p.ow7;
import p.c28;
import android.os.Bundle;
import android.os.BaseBundle;
import p.nw7;
import p.r18;
import android.os.Parcel;
import p.tu7;
import p.y08;
import android.os.IBinder;
import java.lang.Object;
import java.lang.Exception;
import p.jd;

public final class cw7 extends bw7	// class@001291 from classes.dex
{
    public final int b;
    public final String c;
    public final l08 t;
    public final int v;
    public final pw7 w;

    public void cw7(pw7 p0,l08 p1,int p2,String p3,l08 p4,int p5){
       this.w = p0;
       this.b = p2;
       this.c = p3;
       this.t = p4;
       this.v = p5;
       super(p1);
    }
    public final void a(){
       int i = 0;
       try{
          cw7 tw = this.w;
          ow7 n = tw.d.n;
          Bundle uBundle = new Bundle();
          uBundle.putInt("session_id", this.b);
          uBundle.putString("module_name", this.c);
          nw7 v4 = new nw7(this.w, this.t, this.b, this.c, this.v);
          Parcel parcel = n.n();
          parcel.writeString(tw.a);
          parcel.writeInt(1);
          uBundle.writeToParcel(parcel, i);
          parcel.writeInt(1);
          pw7.h().writeToParcel(parcel, i);
          parcel.writeStrongBinder(v4);
          n.y(parcel, 7);
          return;
       }catch(android.os.RemoteException e1){
          Object[] objArray = new Object[i];
          pw7.g.d(e1, "notifyModuleCompleted", objArray);
          return;
       }
    }
}
