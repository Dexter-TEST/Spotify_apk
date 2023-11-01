package p.h44;
import android.media.session.MediaController$Callback;
import p.k44;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.media.session.MediaController$PlaybackInfo;
import java.lang.ref.Reference;
import android.media.AudioAttributes;
import android.os.Build$VERSION;
import androidx.media.AudioAttributesCompat;
import android.os.Bundle;
import p.or7;
import android.media.MediaMetadata;
import android.support.v4.media.MediaMetadataCompat;
import p.a16;
import io.reactivex.rxjava3.core.ObservableEmitter;
import android.media.session.PlaybackState;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import android.media.session.MediaSession$QueueItem;
import android.media.MediaDescription;
import p.j54;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import java.lang.CharSequence;
import java.lang.String;

public final class h44 extends MediaController$Callback	// class@0017dc from classes.dex
{
    public final WeakReference a;

    public void h44(k44 p0){
       super();
       this.a = new WeakReference(p0);
    }
    public final void onAudioInfoChanged(MediaController$PlaybackInfo p0){
       if (this.a.get() != null) {
          p0.getPlaybackType();
          p0.getAudioAttributes();
          if (Build$VERSION.SDK_INT >= 26) {
          }else {
          }
          p0.getVolumeControl();
          p0.getMaxVolume();
          p0.getCurrentVolume();
       }
       return;
    }
    public final void onExtrasChanged(Bundle p0){
       or7.f(p0);
       this.a.get();
    }
    public final void onMetadataChanged(MediaMetadata p0){
       k44 ok44;
       if ((ok44 = this.a.get()) != null) {
          a16 uoa16 = MediaMetadataCompat.a(p0);
          switch (ok44.d){
              case 1:
                if (uoa16 != null) {
                   ok44.e.onNext(uoa16);
                }
                break;
              default:
          }
       }
       return;
    }
    public final void onPlaybackStateChanged(PlaybackState p0){
       k44 ok44;
       if ((ok44 = this.a.get()) != null && ok44.c == null) {
          a16 uoa16 = PlaybackStateCompat.a(p0);
          switch (ok44.d){
              case 0:
                if (uoa16 == null) {
                }
                break;
              default:
          }
          ok44.e.onNext(uoa16);
       }else {
       }
    }
    public final void onQueueChanged(List p0){
       if (this.a.get() != null && p0 != null) {
          ArrayList uArrayList = new ArrayList(p0.size());
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             MediaSessionCompat$QueueItem obj = ((obj = iterator.next()) != null)? new MediaSessionCompat$QueueItem(MediaDescriptionCompat.a(j54.b(obj)), j54.c(obj)): null;
             uArrayList.add(obj);
          }
       }
       return;
    }
    public final void onQueueTitleChanged(CharSequence p0){
       this.a.get();
    }
    public final void onSessionDestroyed(){
       this.a.get();
    }
    public final void onSessionEvent(String p0,Bundle p1){
       or7.f(p1);
       this.a.get();
    }
}
