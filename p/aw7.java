package p.aw7;
import p.bw7;
import p.pw7;
import p.l08;
import java.lang.String;
import p.ow7;
import p.c28;
import android.os.Bundle;
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
import java.lang.Integer;
import java.lang.RuntimeException;
import java.lang.Throwable;

public final class aw7 extends bw7	// class@001009 from classes.dex
{
    public final int b;
    public final int c;
    public final String t;
    public final String v;
    public final int w;
    public final l08 x;
    public final pw7 y;

    public void aw7(pw7 p0,l08 p1,int p2,String p3,String p4,int p5,l08 p6,int p7){
       this.b = p7;
       this.y = p0;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       this.x = p6;
       super(p1);
    }
    public final void a(){
       ow7 n;
       Parcel parcel;
       aw7 uoaw7 = this;
       String str = "chunk_number";
       String str1 = "slice_id";
       String str2 = "module_name";
       String str3 = "session_id";
       aw7 x = uoaw7.x;
       aw7 w = uoaw7.w;
       aw7 v = uoaw7.v;
       aw7 t = uoaw7.t;
       aw7 c = uoaw7.c;
       aw7 y = uoaw7.y;
       switch (uoaw7.b){
           case 0:
             break;
           default:
             try{
                n = y.d.n;
                Bundle uBundle1 = new Bundle();
                uBundle1.putInt(str3, c);
                uBundle1.putString(str2, t);
                uBundle1.putString(str1, v);
                uBundle1.putInt(str, w);
                parcel = n.n();
                parcel.writeString(y.a);
                parcel.writeInt(1);
                uBundle1.writeToParcel(parcel, 0);
                parcel.writeInt(1);
                pw7.h().writeToParcel(parcel, 0);
                parcel.writeStrongBinder(new jw7(y, x, 1));
                n.y(parcel, 11);
             }catch(android.os.RemoteException e0){
                Object[] objArray1 = new Object[]{t,v,Integer.valueOf(w),Integer.valueOf(c)};
                pw7.g.c("getChunkFileDescriptor\(%s, %s, %d, session=%d\)", objArray1);
                x.a(new RuntimeException(e0));
             }
             return;
       }
       try{
          n = y.d.n;
          Bundle uBundle = new Bundle();
          uBundle.putInt(str3, c);
          uBundle.putString(str2, t);
          uBundle.putString(str1, v);
          uBundle.putInt(str, w);
          parcel = n.n();
          parcel.writeString(y.a);
          parcel.writeInt(1);
          uBundle.writeToParcel(parcel, 0);
          parcel.writeInt(1);
          pw7.h().writeToParcel(parcel, 0);
          parcel.writeStrongBinder(new jw7(y, x, 2));
          n.y(parcel, 6);
       }catch(android.os.RemoteException e0){
          Object[] objArray = new Object[0];
          pw7.g.d(e0, "notifyChunkTransferred", objArray);
       }
       return;
    }
}
