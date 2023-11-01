package p.y44;
import android.media.session.MediaSession$Callback;
import p.z44;
import p.b54;
import android.os.Build$VERSION;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.k54;
import p.a54;
import java.lang.Object;
import java.lang.ref.Reference;
import android.os.Bundle;
import android.os.ResultReceiver;
import p.or7;
import p.y43;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.os.IBinder;
import android.os.IInterface;
import p.n70;
import androidx.versionedparcelable.ParcelImpl;
import p.tg7;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import java.lang.Class;
import android.os.BaseBundle;
import android.util.Log;
import android.net.Uri;
import android.support.v4.media.RatingCompat;
import android.content.Intent;
import android.media.Rating;

public final class y44 extends MediaSession$Callback	// class@002d48 from classes.dex
{
    public final z44 a;

    public void y44(z44 p0){
       this.a = p0;
       super();
    }
    public static void b(b54 p0){
       if (Build$VERSION.SDK_INT >= 28) {
          return;
       }
       String str = p0.n();
       if (TextUtils.isEmpty(str)) {
          str = "android.media.session.MediaController";
       }
       p0.b(new k54(str, -1, -1));
       return;
    }
    public final b54 a(){
       z44 a = this.a.a;
       _monitor_enter(a);
       b54 uob54 = this.a.d.get();
       _monitor_exit(a);
       if (uob54 == null || this.a != uob54.h()) {
          uob54 = null;
       }
       return uob54;
    }
    public final void onCommand(String p0,Bundle p1,ResultReceiver p2){
       b54 uob54;
       int i;
       if ((uob54 = this.a()) == null) {
          return;
       }
       or7.f(p1);
       y44.b(uob54);
       try{
          i = 0;
          if (p0.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
             Bundle uBundle = new Bundle();
             b54 b = uob54.b;
             y43 oy43 = b.a();
             String str = "android.support.v4.media.session.EXTRA_BINDER";
             IBinder iBinder = (oy43 == null)? i: oy43.asBinder();
             n70.b(uBundle, str, iBinder);
             MediaSessionCompat$Token a = b.a;
             _monitor_enter(a);
             MediaSessionCompat$Token t = b.t;
             _monitor_exit(a);
             if (t != null) {
                Bundle uBundle1 = new Bundle();
                uBundle1.putParcelable("a", new ParcelImpl(t));
                uBundle.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", uBundle1);
             }
             p2.send(0, uBundle);
          }else if(p0.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")){
             p1.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
             this.a.getClass();
          }else if(p0.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")){
             MediaDescriptionCompat parcelable = p1.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
             p1.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
             this.a.getClass();
          }else if(p0.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")){
             p1.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
             this.a.getClass();
          }else if(p0.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")){
             this.a.getClass();
          }
       }catch(android.os.BadParcelableException e0){
          Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
       }
       e0.b(i);
       return;
    }
    public final void onCustomAction(String p0,Bundle p1){
       b54 uob54;
       Uri parcelable;
       if ((uob54 = this.a()) == null) {
          return;
       }
       or7.f(p1);
       try{
          y44.b(uob54);
          y44 ta = this.a;
          if (p0.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
             parcelable = p1.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
             or7.f(p1.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
             ta.getClass();
          }else if(p0.equals("android.support.v4.media.session.action.PREPARE")){
             ta.getClass();
          }else if(p0.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")){
             p1.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
             or7.f(p1.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
             ta.getClass();
          }else if(p0.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")){
             p1.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
             or7.f(p1.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
             ta.getClass();
          }else if(p0.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")){
             parcelable = p1.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
             or7.f(p1.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
             ta.getClass();
          }else if(p0.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")){
             p1.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
             ta.getClass();
          }else if(p0.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")){
             p1.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
             ta.getClass();
          }else if(p0.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")){
             p1.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
             ta.getClass();
          }else if(p0.equals("android.support.v4.media.session.action.SET_RATING")){
             RatingCompat parcelable1 = p1.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
             or7.f(p1.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
             ta.getClass();
          }else if(p0.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")){
             p1.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 0x3f800000);
             ta.getClass();
          }else {
             ta.b(p0);
          }
       }catch(android.os.BadParcelableException e0){
          Log.e("MediaSessionCompat", "Could not unparcel the data.");
       }
       e0.b(null);
       return;
    }
    public final void onFastForward(){
       b54 uob54;
       if ((uob54 = this.a()) == null) {
          return;
       }
       y44.b(uob54);
       this.a.getClass();
       uob54.b(null);
       return;
    }
    public final boolean onMediaButtonEvent(Intent p0){
       b54 uob54 = this.a();
       boolean b = false;
       if (uob54 == null) {
          return b;
       }
       y44.b(uob54);
       uob54.b(null);
       if (this.a.c(p0) || super.onMediaButtonEvent(p0)) {
          b = true;
       }
       return b;
    }
    public final void onPause(){
       b54 uob54;
       if ((uob54 = this.a()) == null) {
          return;
       }
       y44.b(uob54);
       this.a.d();
       uob54.b(null);
       return;
    }
    public final void onPlay(){
       b54 uob54;
       if ((uob54 = this.a()) == null) {
          return;
       }
       y44.b(uob54);
       this.a.e();
       uob54.b(null);
       return;
    }
    public final void onPlayFromMediaId(String p0,Bundle p1){
       b54 uob54;
       if ((uob54 = this.a()) == null) {
          return;
       }
       or7.f(p1);
       y44.b(uob54);
       this.a.getClass();
       uob54.b(null);
       return;
    }
    public final void onPlayFromSearch(String p0,Bundle p1){
       b54 uob54;
       if ((uob54 = this.a()) == null) {
          return;
       }
       or7.f(p1);
       y44.b(uob54);
       this.a.getClass();
       uob54.b(null);
       return;
    }
    public final void onPlayFromUri(Uri p0,Bundle p1){
       b54 uob54;
       if ((uob54 = this.a()) == null) {
          return;
       }
       or7.f(p1);
       y44.b(uob54);
       this.a.getClass();
       uob54.b(null);
       return;
    }
    public final void onPrepare(){
       b54 uob54;
       if ((uob54 = this.a()) == null) {
          return;
       }
       y44.b(uob54);
       this.a.getClass();
       uob54.b(null);
       return;
    }
    public final void onPrepareFromMediaId(String p0,Bundle p1){
       b54 uob54;
       if ((uob54 = this.a()) == null) {
          return;
       }
       or7.f(p1);
       y44.b(uob54);
       this.a.getClass();
       uob54.b(null);
       return;
    }
    public final void onPrepareFromSearch(String p0,Bundle p1){
       b54 uob54;
       if ((uob54 = this.a()) == null) {
          return;
       }
       or7.f(p1);
       y44.b(uob54);
       this.a.getClass();
       uob54.b(null);
       return;
    }
    public final void onPrepareFromUri(Uri p0,Bundle p1){
       b54 uob54;
       if ((uob54 = this.a()) == null) {
          return;
       }
       or7.f(p1);
       y44.b(uob54);
       this.a.getClass();
       uob54.b(null);
       return;
    }
    public final void onRewind(){
       b54 uob54;
       if ((uob54 = this.a()) == null) {
          return;
       }
       y44.b(uob54);
       this.a.getClass();
       uob54.b(null);
       return;
    }
    public final void onSeekTo(long p0){
       b54 uob54;
       if ((uob54 = this.a()) == null) {
          return;
       }
       y44.b(uob54);
       this.a.f(p0);
       uob54.b(null);
       return;
    }
    public final void onSetPlaybackSpeed(float p0){
       b54 uob54;
       if ((uob54 = this.a()) == null) {
          return;
       }
       y44.b(uob54);
       this.a.getClass();
       uob54.b(null);
       return;
    }
    public final void onSetRating(Rating p0){
       b54 uob54;
       if ((uob54 = this.a()) == null) {
          return;
       }
       y44.b(uob54);
       this.a.g(RatingCompat.a(p0));
       uob54.b(null);
       return;
    }
    public final void onSkipToNext(){
       b54 uob54;
       if ((uob54 = this.a()) == null) {
          return;
       }
       y44.b(uob54);
       this.a.h();
       uob54.b(null);
       return;
    }
    public final void onSkipToPrevious(){
       b54 uob54;
       if ((uob54 = this.a()) == null) {
          return;
       }
       y44.b(uob54);
       this.a.i();
       uob54.b(null);
       return;
    }
    public final void onSkipToQueueItem(long p0){
       b54 uob54;
       if ((uob54 = this.a()) == null) {
          return;
       }
       y44.b(uob54);
       this.a.getClass();
       uob54.b(null);
       return;
    }
    public final void onStop(){
       b54 uob54;
       if ((uob54 = this.a()) == null) {
          return;
       }
       y44.b(uob54);
       this.a.j();
       uob54.b(null);
       return;
    }
}
