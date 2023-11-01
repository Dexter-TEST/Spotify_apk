package p.be4;
import p.c53;
import android.os.Binder;
import androidx.room.MultiInstanceInvalidationService;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import android.os.Parcel;
import p.a53;
import p.z43;
import java.lang.Object;
import p.co5;
import android.os.RemoteCallbackList;
import java.lang.Integer;
import java.util.Map;
import java.util.LinkedHashMap;

public final class be4 extends Binder implements c53	// class@0010aa from classes.dex
{
    public final MultiInstanceInvalidationService a;
    public static final int b;

    public void be4(MultiInstanceInvalidationService p0){
       this.a = p0;
       super();
       this.attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }
    public final IBinder asBinder(){
       return this;
    }
    public final boolean g(int p0,Parcel p1,Parcel p2,int p3){
       IBinder iBinder;
       IInterface iInterface1;
       String str = "androidx.room.IMultiInstanceInvalidationService";
       if (p0 >= 1 && p0 <= 0xffffff) {
          p1.enforceInterface(str);
       }
       if (p0 != 0x5f4e5446) {
          IInterface iInterface = null;
          if (p0 != 1) {
             if (p0 != 2) {
                if (p0 != 3) {
                   return super.onTransact(p0, p1, p2, p3);
                }else {
                   this.q(p1.createStringArray(), p1.readInt());
                }
             }else if((iBinder = p1.readStrongBinder()) == null){
                iInterface = ((iInterface1 = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback")) != null && iInterface1 instanceof a53)? iInterface1: new z43(iBinder);
             }
             co5.o(iInterface, "callback");
             be4 ta = this.a;
             MultiInstanceInvalidationService c = ta.c;
             _monitor_enter(c);
             ta.c.unregister(iInterface);
             ta.b.remove(Integer.valueOf(p1.readInt()));
             _monitor_exit(c);
             p2.writeNoException();
          }else if((iBinder = p1.readStrongBinder()) == null){
             iInterface = ((iInterface1 = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback")) != null && iInterface1 instanceof a53)? iInterface1: new z43(iBinder);
          }
          p2.writeNoException();
          p2.writeInt(this.p(iInterface, p1.readString()));
          return 1;
       }else {
          p2.writeString(str);
          return 1;
       }
    }
    public final boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       return this.g(p0, p1, p2, p3);
    }
    public final int p(a53 p0,String p1){
       co5.o(p0, "callback");
       int i = 0;
       if (p1 == null) {
          return i;
       }
       be4 ta = this.a;
       MultiInstanceInvalidationService c = ta.c;
       _monitor_enter(c);
       int i1 = ta.a + 1;
       ta.a = i1;
       if (ta.c.register(p0, Integer.valueOf(i1))) {
          ta.b.put(Integer.valueOf(i1), p1);
          i = i1;
       }else {
          ta.a = ta.a - 1;
       }
       _monitor_exit(c);
       return i;
    }
    public final void q(String[] p0,int p1){
       String str;
       co5.o(p0, "tables");
       be4 ta = this.a;
       MultiInstanceInvalidationService c = ta.c;
       _monitor_enter(c);
       if ((str = ta.b.get(Integer.valueOf(p1))) == null) {
          _monitor_exit(c);
          return;
       }else {
          int i = ta.c.beginBroadcast();
          int i1 = 0;
          while (i1 < i) {
             try{
                Object broadcastCoo = ta.c.getBroadcastCookie(i1);
                co5.j(broadcastCoo, "null cannot be cast to non-null type kotlin.Int");
                int i2 = broadcastCoo.intValue();
                String str1 = ta.b.get(Integer.valueOf(i2));
                if (p1 != i2 && co5.c(str, str1)) {
                   ta.c.getBroadcastItem(i1).j(p0);
                }
                i1 = i1 + 1;
             }catch(android.os.RemoteException e0){
             }
          }
          ta.c.finishBroadcast();
          _monitor_exit(c);
          return;
       }
    }
}
