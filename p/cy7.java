package p.cy7;
import android.content.ServiceConnection;
import android.content.Context;
import java.lang.Object;
import p.jd;
import java.lang.String;
import java.util.ArrayList;
import android.app.Service;
import p.j28;
import java.util.Collection;
import android.os.Bundle;
import android.os.Parcel;
import p.tu7;
import p.y08;
import android.content.ComponentName;
import android.os.IBinder;
import p.by7;
import android.app.Notification;

public final class cy7 implements ServiceConnection	// class@0012a3 from classes.dex
{
    public final jd a;
    public final ArrayList b;
    public final Context c;
    public ExtractionForegroundService d;
    public Notification e;

    public void cy7(Context p0){
       super();
       this.a = new jd("ExtractionForegroundServiceConnection");
       this.b = new ArrayList();
       this.c = p0;
    }
    public final void a(){
       cy7 td;
       Object[] objArray = new Object[0];
       this.a.a("Stopping foreground installation service.", objArray);
       this.c.unbindService(this);
       if ((td = this.d) != null) {
          _monitor_enter(td);
          td.stopForeground(true);
          td.stopSelf();
          _monitor_exit(td);
       }
       this.c();
       return;
    }
    public final void b(j28 p0){
       cy7 tb = this.b;
       _monitor_enter(tb);
       this.b.add(p0);
       _monitor_exit(tb);
    }
    public final void c(){
       cy7 tb = this.b;
       _monitor_enter(tb);
       ArrayList uArrayList = new ArrayList(this.b);
       this.b.clear();
       _monitor_exit(tb);
       int i = uArrayList.size();
       int i1 = 0;
       while (i1 < i) {
          j28 oj28 = uArrayList.get(i1);
          try{
             Parcel parcel = oj28.n();
             parcel.writeInt(1);
             new Bundle().writeToParcel(parcel, 0);
             parcel.writeInt(1);
             new Bundle().writeToParcel(parcel, 0);
             oj28.y(parcel, 2);
          }catch(android.os.RemoteException e0){
             Object[] objArray = new Object[0];
             this.a.c("Could not resolve Play Store service state update callback.", objArray);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public final void onServiceConnected(ComponentName p0,IBinder p1){
       Object[] objArray = new Object[0];
       this.a.a("Starting foreground installation service.", objArray);
       by7 a = p1.a;
       this.d = a;
       a.startForeground(-1883842196, this.e);
       this.c();
    }
    public final void onServiceDisconnected(ComponentName p0){
    }
}
