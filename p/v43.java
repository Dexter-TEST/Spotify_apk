package p.v43;
import p.w43;
import android.os.IBinder;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import p.j44;
import android.support.v4.media.MediaMetadataCompat;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;

public final class v43 implements w43	// class@00297c from classes.dex
{
    public final IBinder a;

    public void v43(IBinder p0){
       super();
       this.a = p0;
    }
    public final IBinder asBinder(){
       return this.a;
    }
    public final void d(){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
       if (!this.a.transact(2, parcel, null, 1)) {
          int b = j44.b;
       }
       parcel.recycle();
       return;
    }
    public final void e(MediaMetadataCompat p0){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
       if (p0 != null) {
          parcel.writeInt(1);
          parcel.writeBundle(p0.a);
       }else {
          parcel.writeInt(0);
       }
       if (!this.a.transact(4, parcel, null, 1)) {
          int b = j44.b;
       }
       parcel.recycle();
       return;
    }
    public final void f(int p0){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
       parcel.writeInt(p0);
       if (!this.a.transact(9, parcel, null, 1)) {
          p0 = j44.b;
       }
       parcel.recycle();
       return;
    }
    public final void l(int p0){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
       parcel.writeInt(p0);
       if (!this.a.transact(12, parcel, null, 1)) {
          p0 = j44.b;
       }
       parcel.recycle();
       return;
    }
    public final void w(PlaybackStateCompat p0){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
       int i = 0;
       if (p0 != null) {
          parcel.writeInt(1);
          p0.writeToParcel(parcel, i);
       }else {
          parcel.writeInt(i);
       }
       if (!this.a.transact(3, parcel, null, 1)) {
          int b = j44.b;
       }
       parcel.recycle();
       return;
    }
}
