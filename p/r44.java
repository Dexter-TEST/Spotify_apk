package p.r44;
import android.content.Context;
import p.or7;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import p.a54;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.os.Build$VERSION;
import p.m44;
import android.support.v4.media.session.b;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.view.KeyEvent;
import android.media.session.MediaController;
import android.support.v4.media.MediaMetadataCompat;
import android.media.MediaMetadata;
import android.support.v4.media.session.PlaybackStateCompat;
import p.y43;
import java.lang.Throwable;
import android.util.Log;
import android.media.session.PlaybackState;
import android.support.v4.media.session.d;
import android.media.session.MediaController$TransportControls;
import p.q44;
import p.p44;
import p.o44;
import p.a16;
import java.lang.Boolean;
import android.os.Handler;
import p.k44;
import android.media.session.MediaController$Callback;
import p.l44;
import java.util.HashMap;
import p.w43;
import android.os.Bundle;
import java.util.ArrayList;

public final class r44	// class@002474 from classes.dex
{
    public final b a;
    public final MediaSessionCompat$Token b;
    public final ConcurrentHashMap c;

    public void r44(Context p0,or7 p1){
       super();
       this.c = new ConcurrentHashMap();
       if (p1 == null) {
          throw new IllegalArgumentException("session must not be null");
       }
       MediaSessionCompat$Token token = p1.a.c();
       this.b = token;
       this.a = (Build$VERSION.SDK_INT >= 29)? new m44(p0, token): new b(p0, token);
       return;
    }
    public final void a(KeyEvent p0){
       if (p0 == null) {
          throw new IllegalArgumentException("KeyEvent may not be null");
       }
       this.a.a.dispatchMediaButtonEvent(p0);
       return;
    }
    public final MediaMetadataCompat b(){
       MediaMetadata metadata;
       MediaMetadataCompat mediaMetadat = ((metadata = this.a.a.getMetadata()) != null)? MediaMetadataCompat.a(metadata): null;
       return mediaMetadat;
    }
    public final PlaybackStateCompat c(){
       PlaybackStateCompat playbackStat;
       PlaybackState playbackStat1;
       r44 ta = this.a;
       b e = ta.e;
       if (e.a() != null) {
          try{
             playbackStat = e.a().a();
          label_0029 :
             return playbackStat;
          }catch(android.os.RemoteException e1){
             Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e1);
          }
          if ((playbackStat1 = playbackStat.a.getPlaybackState()) != null) {
             playbackStat = PlaybackStateCompat.a(playbackStat1);
             goto label_0029 ;
          }else {
             playbackStat = null;
             goto label_0029 ;
          }
       }else {
       }
    }
    public final int d(){
       int i;
       b e = this.a.e;
       if (e.a() != null) {
          try{
             i = e.a().s();
          label_001c :
             return i;
          }catch(android.os.RemoteException e0){
             Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", e0);
          }
          i = -1;
          goto label_001c ;
       }else {
       }
    }
    public final int e(){
       int i;
       b e = this.a.e;
       if (e.a() != null) {
          try{
             i = e.a().h();
          label_001c :
             return i;
          }catch(android.os.RemoteException e0){
             Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", e0);
          }
          i = -1;
          goto label_001c ;
       }else {
       }
    }
    public final d f(){
       int sDK_INT;
       q44 oq44;
       MediaController$TransportControls transportCon = this.a.a.getTransportControls();
       if ((sDK_INT = Build$VERSION.SDK_INT) >= 29) {
          oq44 = new q44(transportCon);
       }else if(sDK_INT >= 24){
          oq44 = new p44(transportCon);
       }else if(sDK_INT >= 23){
          oq44 = new o44(transportCon);
       }else {
          oq44 = new d(transportCon);
       }
       return oq44;
    }
    public final void g(a16 p0){
       if (this.c.putIfAbsent(p0, Boolean.TRUE) != null) {
       }else {
          Handler handler = new Handler();
          p0.b(handler);
          r44 ta = this.a;
          ta.a.registerCallback(p0.a, handler);
          b b = ta.b;
          _monitor_enter(b);
          if (ta.e.a() != null) {
             l44 ol44 = new l44(p0);
             ta.d.put(p0, ol44);
             try{
                p0.c = ol44;
                ta.e.a().v(ol44);
                p0.a(13, null, null);
             }catch(android.os.RemoteException e6){
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e6);
             }
          }else {
             p0.c = null;
             ta.c.add(p0);
          }
          _monitor_exit(b);
       }
       return;
    }
    public final void h(k44 p0){
       if (p0 == null) {
          throw new IllegalArgumentException("callback must not be null");
       }
       if (this.c.remove(p0) == null) {
          return;
       }
       this.a.b(p0);
       p0.b(null);
       return;
    }
}
