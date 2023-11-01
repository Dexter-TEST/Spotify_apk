package p.h54;
import android.support.v4.media.session.a;
import p.a54;
import p.w43;
import p.b54;
import android.os.Binder;
import p.k54;
import java.lang.String;
import android.os.IInterface;
import java.lang.Object;
import android.os.RemoteCallbackList;
import java.lang.Class;
import android.support.v4.media.session.ParcelableVolumeInfo;
import p.i54;
import java.lang.AssertionError;
import android.os.Bundle;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.MediaMetadataCompat;
import p.or7;
import android.app.PendingIntent;

public final class h54 extends a	// class@0017e5 from classes.dex
{
    public final int b;
    public final a54 c;

    public void h54(a54 p0,int p1){
       this.b = p1;
       this.c = p0;
       super();
    }
    private void H(w43 p0){
       if (this.c.e != null) {
          return;
       }
       this.c.f.register(p0, new k54("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
       b54 c = this.c.c;
       _monitor_enter(c);
       this.c.getClass();
       _monitor_exit(c);
       return;
    }
    private void J(w43 p0){
       this.c.f.unregister(p0);
       Binder.getCallingPid();
       Binder.getCallingUid();
       b54 c = this.c.c;
       _monitor_enter(c);
       this.c.getClass();
       _monitor_exit(c);
    }
    public final ParcelableVolumeInfo A(){
       switch (this.b){
           case 0:
           default:
             throw new AssertionError();
       }
       this.c.getClass();
       throw null;
    }
    public final void B(){
       switch (this.b){
           case 0:
           default:
             throw new AssertionError();
       }
       this.D(12);
       return;
    }
    public final void C(){
       switch (this.b){
           case 0:
           default:
             throw new AssertionError();
       }
       this.D(7);
       return;
    }
    public final void D(int p0){
       this.c.m(p0, 0, 0, null, null);
    }
    public final void E(int p0,Object p1){
       this.c.m(p0, 0, 0, p1, null);
    }
    public final void F(int p0,Object p1,Bundle p2){
       this.c.m(p0, 0, 0, p1, p2);
    }
    public final void G(RatingCompat p0){
       switch (this.b){
           case 0:
           default:
             throw new AssertionError();
       }
       this.E(19, p0);
       return;
    }
    public final boolean I(KeyEvent p0){
       switch (this.b){
           case 0:
           default:
             throw new AssertionError();
       }
       this.E(21, p0);
       return true;
    }
    public final PlaybackStateCompat a(){
       switch (this.b){
           case 0:
           default:
             h54 tc = this.c;
             return or7.h(tc.g, tc.h);
       }
       this.c.getClass();
       throw null;
    }
    public final int h(){
       h54 tc = this.c;
       switch (this.b){
           case 0:
           default:
             return tc.j;
       }
       tc.getClass();
       return 0;
    }
    public final void i(w43 p0){
       switch (this.b){
           case 0:
           default:
             this.J(p0);
             return;
       }
       this.c.getClass();
       throw null;
    }
    public final void k(){
       switch (this.b){
           case 0:
           default:
             throw new AssertionError();
       }
       this.c.getClass();
       throw null;
    }
    public final PendingIntent n(){
       switch (this.b){
           case 0:
           default:
             throw new AssertionError();
       }
       this.c.getClass();
       throw null;
    }
    public final int s(){
       h54 tc = this.c;
       switch (this.b){
           case 0:
           default:
             return tc.i;
       }
       tc.getClass();
       return 0;
    }
    public final void v(w43 p0){
       switch (this.b){
           case 0:
           default:
             this.H(p0);
             return;
       }
       this.c.getClass();
       Binder.getCallingPid();
       Binder.getCallingUid();
       this.c.getClass();
       throw null;
    }
    public final MediaMetadataCompat y(){
       switch (this.b){
           case 0:
           default:
             throw new AssertionError();
       }
       this.c.getClass();
       return null;
    }
    public final void z(){
       switch (this.b){
           case 0:
           default:
             return;
       }
       this.c.getClass();
       throw null;
    }
}
