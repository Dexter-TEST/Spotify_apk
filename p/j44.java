package p.j44;
import p.w43;
import android.os.Binder;
import p.k44;
import android.os.IInterface;
import java.lang.String;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.os.IBinder;
import java.lang.ref.Reference;
import java.lang.Integer;
import android.os.Bundle;
import android.os.Parcel;
import java.lang.Boolean;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.os.Parcelable$Creator;
import android.text.TextUtils;
import java.lang.CharSequence;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import java.util.ArrayList;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

public abstract class j44 extends Binder implements w43	// class@001a64 from classes.dex
{
    public final WeakReference a;
    public static final int b;

    public void j44(k44 p0){
       super();
       this.attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
       this.a = new WeakReference(p0);
    }
    public final IBinder asBinder(){
       return this;
    }
    public final void f(int p0){
       k44 ok44;
       if ((ok44 = this.a.get()) != null) {
          ok44.a(9, Integer.valueOf(p0), null);
       }
       return;
    }
    public final boolean g(int p0,Parcel p1,Parcel p2,int p3){
       k44 ok44;
       k44 ok441;
       if (p0 != 0x5f4e5446) {
          j44 ta = this.a;
          Bundle uBundle = null;
          switch (p0){
              case 1:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                String str = p1.readString();
                if (p1.readInt()) {
                   uBundle = Bundle.CREATOR.createFromParcel(p1);
                }
                if ((ok44 = ta.get()) != null) {
                   ok44.a(1, str, uBundle);
                }
                return 1;
                break;
              case 2:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                this.d();
                return 1;
              case 3:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (p1.readInt()) {
                   uBundle = PlaybackStateCompat.CREATOR.createFromParcel(p1);
                }
                this.w(uBundle);
                return 1;
                break;
              case 4:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (p1.readInt()) {
                   uBundle = MediaMetadataCompat.CREATOR.createFromParcel(p1);
                }
                this.e(uBundle);
                return 1;
                break;
              case 5:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                this.o(p1.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR));
                return 1;
              case 6:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (p1.readInt()) {
                   uBundle = TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p1);
                }
                this.b(uBundle);
                return 1;
                break;
              case 7:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (p1.readInt()) {
                   uBundle = Bundle.CREATOR.createFromParcel(p1);
                }
                this.m(uBundle);
                return 1;
                break;
              case 8:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (p1.readInt()) {
                   uBundle = ParcelableVolumeInfo.CREATOR.createFromParcel(p1);
                }
                this.x(uBundle);
                return 1;
                break;
              case 9:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                this.f(p1.readInt());
                return 1;
              case 10:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                p1.readInt();
                return 1;
              case 11:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                boolean b = (p1.readInt())? true: false;
                if ((ok44 = ta.get()) != null) {
                   ok44.a(11, Boolean.valueOf(b), uBundle);
                }
                return 1;
                break;
              case 12:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                this.l(p1.readInt());
                return 1;
              case 13:
                p1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                if ((ok441 = ta.get()) != null) {
                   ok441.a(13, uBundle, uBundle);
                }
                return 1;
                break;
              default:
                return super.onTransact(p0, p1, p2, p3);
          }
       }else {
          p2.writeString("android.support.v4.media.session.IMediaControllerCallback");
          return 1;
       }
    }
    public final void l(int p0){
       k44 ok44;
       if ((ok44 = this.a.get()) != null) {
          ok44.a(12, Integer.valueOf(p0), null);
       }
       return;
    }
    public final boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       return this.g(p0, p1, p2, p3);
    }
    public final void w(PlaybackStateCompat p0){
       k44 ok44;
       if ((ok44 = this.a.get()) != null) {
          ok44.a(2, p0, null);
       }
       return;
    }
}
