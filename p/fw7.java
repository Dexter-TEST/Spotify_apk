package p.fw7;
import p.bw7;
import java.lang.Object;
import p.l08;
import p.zd4;
import android.os.IBinder;
import p.ow7;
import java.lang.String;
import p.jd;
import java.util.ArrayList;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.Context;
import java.util.Iterator;
import p.cd2;
import java.lang.Exception;
import p.pw7;
import p.c28;
import android.os.Bundle;
import p.lw7;
import p.r18;
import android.os.Parcel;
import p.tu7;
import p.y08;
import p.kw7;
import android.os.IInterface;
import android.os.IBinder$DeathRecipient;
import java.lang.Runnable;

public final class fw7 extends bw7	// class@001652 from classes.dex
{
    public final int b;
    public final Object c;
    public final Object t;

    public void fw7(Object p0,l08 p1,Object p2,int p3){
       this.b = p3;
       this.t = p0;
       this.c = p2;
       super(p1);
    }
    public void fw7(zd4 p0,IBinder p1){
       this.b = 2;
       this.t = p0;
       this.c = p1;
       super();
    }
    public final void a(){
       zd4 ozd4;
       Object[] objArray2;
       bw7 a;
       int i = 1;
       fw7 tc = this.c;
       int i1 = 0;
       fw7 tt = this.t;
       switch (this.b){
           case 0:
             try{
                ow7 n = tt.e.n;
                Parcel parcel = n.n();
                parcel.writeString(tt.a);
                parcel.writeInt(i);
                pw7.h().writeToParcel(parcel, i1);
                parcel.writeStrongBinder(new lw7(tt, tc, i));
                n.y(parcel, 10);
             }catch(android.os.RemoteException e0){
                Object[] objArray = new Object[i1];
                pw7.g.d(e0, "keepAlive", objArray);
             }
             return;
             break;
           case 1:
             ow7 d = tt.d;
             ow7 b = tt.b;
             if (tt.n == null && tt.g == null) {
                Object[] objArray1 = new Object[i1];
                b.e("Initiate binding to the service.", objArray1);
                d.add(tc);
                ozd4 = new zd4(tt);
                tt.m = ozd4;
                tt.g = i;
                if (!tt.a.bindService(tt.h, ozd4, i)) {
                   objArray2 = new Object[i1];
                   b.e("Failed to bind to the service.", objArray2);
                   tt.g = i1;
                   Iterator iterator = d.iterator();
                   while (iterator.hasNext()) {
                      cd2 uocd2 = new cd2();
                      if ((a = iterator.next().a) != null) {
                         a.a(uocd2);
                      }
                   }
                   d.clear();
                }
             }else if(tt.g != null){
                objArray2 = new Object[i1];
                b.e("Waiting to bind to the service.", objArray2);
                d.add(tc);
             }else {
                tc.run();
             }
             break;
           default:
             ozd4 = tt.b;
             ozd4.n = ozd4.i.h(tc);
             ozd4 = tt.b;
             zd4 ozd41 = ozd4;
             ow7 b1 = ozd41.b;
             Object[] objArray3 = new Object[i1];
             try{
                b1.e("linkToDeath", objArray3);
                ozd41.n.asBinder().linkToDeath(ozd41.k, i1);
             }catch(android.os.RemoteException e2){
                objArray3 = new Object[i1];
                ozd41.b.d(e2, "linkToDeath failed", objArray3);
             }
             ozd41 = ozd4;
             ozd41.g = i1;
             Iterator iterator1 = ozd41.d.iterator();
             while (iterator1.hasNext()) {
                iterator1.next().run();
             }
             ozd4.d.clear();
             return;
       }
       return;
    }
}
