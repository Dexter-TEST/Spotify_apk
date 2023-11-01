package p.x43;
import p.y43;
import android.os.IBinder;
import java.lang.Object;
import android.support.v4.media.session.PlaybackStateCompat;
import android.os.Parcel;
import java.lang.String;
import android.support.v4.media.session.a;
import android.os.Parcelable$Creator;
import p.w43;
import android.os.IInterface;

public final class x43 implements y43	// class@002c06 from classes.dex
{
    public final IBinder a;

    public void x43(IBinder p0){
       super();
       this.a = p0;
    }
    public final PlaybackStateCompat a(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(28, parcel, parcel1, 0)) {
          int a = a.a;
       }
       parcel1.readException();
       PlaybackStateCompat playbackStat = (parcel1.readInt())? PlaybackStateCompat.CREATOR.createFromParcel(parcel1): null;
       parcel1.recycle();
       parcel.recycle();
       return playbackStat;
    }
    public final IBinder asBinder(){
       return this.a;
    }
    public final int h(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(47, parcel, parcel1, 0)) {
          int a = a.a;
       }
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return parcel1.readInt();
    }
    public final void i(w43 p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       IBinder iBinder = (p0 != null)? p0.asBinder(): null;
       parcel.writeStrongBinder(iBinder);
       if (!this.a.transact(4, parcel, parcel1, 0)) {
          int a = a.a;
       }
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return;
    }
    public final int s(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       if (!this.a.transact(37, parcel, parcel1, 0)) {
          int a = a.a;
       }
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return parcel1.readInt();
    }
    public final void v(w43 p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
       IBinder iBinder = (p0 != null)? p0.asBinder(): null;
       parcel.writeStrongBinder(iBinder);
       if (!this.a.transact(3, parcel, parcel1, 0)) {
          int a = a.a;
       }
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return;
    }
}
