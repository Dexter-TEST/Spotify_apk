package p.bk4;
import p.fk4;
import java.lang.String;
import android.app.Notification;
import java.lang.Object;
import p.f53;
import p.d53;
import java.lang.Class;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.IBinder;
import java.lang.StringBuilder;
import p.en6;

public final class bk4 implements fk4	// class@0010e0 from classes.dex
{
    public final String a;
    public final int b;
    public final String c;
    public final Notification d;

    public void bk4(String p0,int p1,Notification p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = null;
       this.d = p2;
    }
    public final void a(f53 p0){
       bk4 td;
       p0.getClass();
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
       parcel.writeString(this.a);
       parcel.writeInt(this.b);
       parcel.writeString(this.c);
       if ((td = this.d) != null) {
          parcel.writeInt(1);
          td.writeToParcel(parcel, 0);
       }else {
          parcel.writeInt(0);
       }
       p0.a.transact(1, parcel, null, 1);
       parcel.recycle();
       return;
    }
    public final String toString(){
       return en6.p("NotifyTask[packageName:"+this.a+", id:"+this.b+", tag:", this.c, "]");
    }
}
