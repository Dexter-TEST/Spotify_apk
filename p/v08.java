package p.v08;
import p.bw7;
import java.lang.Object;
import p.l08;
import java.util.List;
import p.pw7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.lang.String;
import android.os.Bundle;
import android.os.BaseBundle;
import p.ow7;
import p.c28;
import p.jw7;
import p.r18;
import android.os.Parcel;
import p.tu7;
import p.y08;
import android.os.IBinder;
import java.lang.Exception;
import p.jd;
import p.m18;
import p.j18;
import p.i18;
import p.b18;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.util.Map;
import p.lw7;

public final class v08 extends bw7	// class@00295b from classes.dex
{
    public final int b;
    public final l08 c;
    public final Object t;
    public final Object v;

    public void v08(Object p0,l08 p1,Object p2,l08 p3,int p4){
       this.b = p4;
       this.v = p0;
       this.t = p2;
       this.c = p3;
       super(p1);
    }
    public final void a(){
       ow7 n;
       Parcel parcel;
       Object[] objArray;
       int i = 1;
       int i1 = 0;
       v08 tt = this.t;
       v08 tv = this.v;
       v08 tc = this.c;
       switch (this.b){
           case 0:
             break;
           case 1:
             ArrayList uArrayList = new ArrayList(tt.size());
             Iterator iterator = tt.iterator();
             while (iterator.hasNext()) {
                Bundle uBundle = new Bundle();
                uBundle.putString("module_name", iterator.next());
                uArrayList.add(uBundle);
             }
             try{
                ow7 n1 = tv.d.n;
                parcel = n1.n();
                parcel.writeString(tv.a);
                parcel.writeTypedList(uArrayList);
                parcel.writeInt(i);
                pw7.h().writeToParcel(parcel, i1);
                parcel.writeStrongBinder(new jw7(tv, tc, i1));
                n1.y(parcel, 14);
             }catch(android.os.RemoteException e0){
                objArray = new Object[i];
                objArray[i1] = tt;
                pw7.g.d(e0, "cancelDownloads\(%s\)", objArray);
             }
             return;
             break;
           default:
             try{
                n = tv.d.n;
                parcel = n.n();
                parcel.writeString(tv.a);
                parcel.writeInt(i);
                pw7.k(tt).writeToParcel(parcel, i1);
                parcel.writeStrongBinder(new lw7(tv, tc, i1));
                n.y(parcel, 5);
             }catch(android.os.RemoteException e0){
                Object[] objArray1 = new Object[i1];
                pw7.g.d(e0, "syncPacks", objArray1);
                tc.a(new RuntimeException(e0));
             }
             return;
       }
       try{
          n = tv.a.n;
          v08 ov08 = tv;
          parcel = n.n();
          parcel.writeString(ov08.b);
          parcel.writeInt(i);
          m18.a(ov08, tt).writeToParcel(parcel, i1);
          parcel.writeStrongBinder(new i18(tv, tc, tt));
          n.y(parcel, 2);
       }catch(android.os.RemoteException e0){
          objArray = new Object[i];
          objArray[i1] = tt;
          m18.e.d(e0, "requestUpdateInfo\(%s\)", objArray);
          tc.a(new RuntimeException(e0));
       }
       return;
    }
}
