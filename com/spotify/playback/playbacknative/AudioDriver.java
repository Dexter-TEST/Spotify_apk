package com.spotify.playback.playbacknative.AudioDriver;
import android.media.AudioTrack$OnPlaybackPositionUpdateListener;
import java.util.concurrent.CopyOnWriteArrayList;
import com.spotify.playback.playbacknative.AudioDriver$NoopAudioRouteListenerHandler;
import com.spotify.playback.playbacknative.AudioDriver$1;
import android.util.SparseArray;
import java.lang.Object;
import android.media.AudioTrack;
import com.spotify.playback.playbacknative.AudioDriver$DefaultNativeWrapper;
import android.content.Context;
import com.spotify.playback.playbacknative.FloatPcmSupportDeviceSet;
import com.spotify.playback.playbacknative.AudioDriver$NativeWrapper;
import android.os.Looper;
import com.spotify.playback.playbacknative.AudioDriver$AudioDriverCallbacks;
import com.spotify.playback.playbacknative.AudioTrackAdapterImpl;
import com.spotify.playback.playbacknative.AudioDriver$AudioDriverListener;
import java.util.List;
import android.os.Handler;
import android.media.AudioAttributes;
import android.media.AudioAttributes$Builder;
import p.u3;
import com.spotify.playback.playbacknative.AudioFeatures$AudioType;
import com.spotify.playback.playbacknative.AudioFeatures;
import com.spotify.playback.playbacknative.AudioFeatures$AudioUsage;
import java.lang.Integer;
import android.os.Build$VERSION;
import android.media.AudioFormat$Builder;
import android.media.AudioFormat;
import com.spotify.playback.playbacknative.AudioTrackAdapter;
import com.spotify.playback.playbacknative.AudioDriver$AudioRouteListenerHandler;
import java.lang.String;
import p.sn0;
import java.util.Iterator;
import java.lang.Float;
import android.os.Message;
import com.spotify.playback.playbacknative.Logger;
import p.et0;
import android.os.HandlerThread;
import java.lang.Thread;
import java.lang.Throwable;
import java.lang.IllegalStateException;
import java.lang.Math;
import com.spotify.playback.playbacknative.AudioDriver$VolumeHandler;
import p.v3;
import java.lang.IllegalArgumentException;
import android.os.Process;
import android.os.Build;
import java.nio.ByteBuffer;

public class AudioDriver implements AudioTrack$OnPlaybackPositionUpdateListener	// class@000ad3 from classes.dex
{
    private int mAndroidSdkUnderrunCount;
    private AudioFeatures mAudioFeatures;
    private Integer mAudioSessionId;
    private AudioTrackAdapterImpl mAudioTrack;
    private int mBufferSizeInBytes;
    private int mBytesPerFrame;
    private int mChannelConfig;
    private boolean mCreateFailed;
    private float mCurrentVolumeGain;
    private float mCurrentVolumeTarget;
    private FloatPcmSupportDeviceSet mFloatPcmSupportDeviceSet;
    private int mFramesBufferedBeforePlay;
    private AudioDriver$VolumeHandler mHandler;
    private HandlerThread mHandlerThread;
    private Looper mLooper;
    private int mMarkerFallbackPosition;
    private final Object mMutex;
    private final AudioDriver$NativeWrapper mNativeWrapper;
    private boolean mOpen;
    private boolean mPaused;
    private boolean mPlaying;
    private int mSampleFormat;
    private int mSampleRate;
    private long nThis;
    public static final int CORE_SAMPLE_FORMAT_16_BITS_PER_SAMPLE = 16;
    public static final int CORE_SAMPLE_FORMAT_IEEE_FLOAT = 17;
    static final float DUCKING_LOWEST_VOLUME = 0.000000;
    private static final int DUCKING_RAMPDOWN_TIME_MS = 200;
    private static final int DUCKING_RAMPUP_TIME_MS = 1000;
    private static final int DUCKING_RAMP_TIME_DELTA_MS = 50;
    private static final boolean LOGGING_ENABLED = false;
    static final int MESSAGE_SET_VOLUME;
    private static final int MINIMUM_WRITTEN_BEFORE_PLAY;
    public static final int SPOTIFY_MAX_VOLUME;
    private static AudioDriver$AudioDriverCallbacks sAudioDriverCallbacks;
    private static final List sAudioDriverListeners;
    private static AudioDriver$AudioRouteListenerHandler sAudioRouteListenerHandler;
    private static Integer sCurrentAudioSession;
    private static final SparseArray sSessionToAudioDriverMap;

    static {
       AudioDriver.sAudioDriverListeners = new CopyOnWriteArrayList();
       AudioDriver.sAudioRouteListenerHandler = new AudioDriver$NoopAudioRouteListenerHandler(null);
       AudioDriver.sSessionToAudioDriverMap = new SparseArray();
       AudioDriver.sCurrentAudioSession = null;
    }
    public void AudioDriver(){
       super();
       this.mSampleFormat = 2;
       this.mMutex = new Object();
       this.mCurrentVolumeGain = AudioTrack.getMaxVolume();
       this.mCurrentVolumeTarget = 0x3f800000;
       this.mPaused = true;
       this.mNativeWrapper = new AudioDriver$DefaultNativeWrapper(this, null);
    }
    public void AudioDriver(Context p0){
       super();
       this.mSampleFormat = 2;
       this.mMutex = new Object();
       this.mCurrentVolumeGain = AudioTrack.getMaxVolume();
       this.mCurrentVolumeTarget = 0x3f800000;
       this.mPaused = true;
       this.mNativeWrapper = new AudioDriver$DefaultNativeWrapper(this, null);
       if (p0 != null) {
          this.mFloatPcmSupportDeviceSet = new FloatPcmSupportDeviceSet(p0);
       }
       return;
    }
    public void AudioDriver(AudioDriver$NativeWrapper p0,Looper p1,Context p2){
       super();
       this.mSampleFormat = 2;
       this.mMutex = new Object();
       this.mCurrentVolumeGain = AudioTrack.getMaxVolume();
       this.mCurrentVolumeTarget = 0x3f800000;
       this.mNativeWrapper = p0;
       this.mLooper = p1;
       this.mPaused = true;
       this.mFloatPcmSupportDeviceSet = new FloatPcmSupportDeviceSet(p2);
    }
    private static void abandonAudioFocus(){
       if (AudioDriver.internalAudioFocusHandlingEnabled()) {
          AudioDriver.sAudioDriverCallbacks.abandonAudioFocus();
       }
       return;
    }
    public static void access$000(AudioDriver p0,int p1){
       p0.onBufferUnderrun(p1);
    }
    public static void access$100(AudioDriver p0){
       p0.onDestroy();
    }
    public static void access$200(AudioDriver p0){
       p0.onFlush();
    }
    public static Object access$600(AudioDriver p0){
       return p0.mMutex;
    }
    public static AudioTrackAdapterImpl access$700(AudioDriver p0){
       return p0.mAudioTrack;
    }
    public static void access$800(float p0,AudioTrack p1){
       AudioDriver.setAudioTrackVolume(p0, p1);
    }
    public static float access$902(AudioDriver p0,float p1){
       p0.mCurrentVolumeGain = p1;
       return p1;
    }
    public static void addListener(AudioDriver$AudioDriverListener p0){
       AudioDriver.sAudioDriverListeners.add(p0);
    }
    private void cancelDucking(int p0){
       this.mHandler.removeMessages(1);
       this.sendVolumeUpdateDelayed(AudioTrack.getMaxVolume(), p0);
    }
    public static void cancelDuckingAudioSession(int p0){
       AudioDriver.cancelDuckingAudioSession(p0, 0);
    }
    public static void cancelDuckingAudioSession(int p0,int p1){
       AudioDriver uAudioDriver;
       if ((uAudioDriver = AudioDriver.sSessionToAudioDriverMap.get(p0)) != null) {
          uAudioDriver.cancelDucking(p1);
       }
       return;
    }
    public static void clearListeners(){
       AudioDriver.sAudioDriverListeners.clear();
    }
    private AudioAttributes constructAudioAttributes(){
       return u3.f(new AudioAttributes$Builder()).setContentType(this.mAudioFeatures.getAudioType().getAttr()).setUsage(this.mAudioFeatures.getAudioUsage().getAttr()).build();
    }
    private AudioAttributes constructAudioAttributesLollipop(){
       return new AudioAttributes$Builder().setContentType(this.mAudioFeatures.getAudioType().getAttr()).setUsage(this.mAudioFeatures.getAudioUsage().getAttr()).build();
    }
    private AudioTrack constructAudioTrack(Integer p0){
       AudioAttributes uAudioAttrib = (Build$VERSION.SDK_INT >= 29)? this.constructAudioAttributes(): this.constructAudioAttributesLollipop();
       AudioAttributes uAudioAttrib1 = uAudioAttrib;
       AudioFormat uAudioFormat = new AudioFormat$Builder().setSampleRate(this.mSampleRate).setChannelMask(this.mChannelConfig).setEncoding(this.mSampleFormat).build();
       AudioDriver tmBufferSize = this.mBufferSizeInBytes;
       int i = (p0 != null)? p0.intValue(): 0;
       AudioTrack uAudioAttrib2 = new AudioTrack(uAudioAttrib1, uAudioFormat, tmBufferSize, 1, i);
       return uAudioAttrib;
    }
    private void createAudioTrack(){
       AudioTrack uAudioTrack = this.constructAudioTrack(this.mAudioSessionId);
       if (!uAudioTrack.getState()) {
          this.mCreateFailed = true;
          return;
       }else {
          this.mCreateFailed = false;
          AudioTrackAdapterImpl uAudioTrackA = new AudioTrackAdapterImpl(uAudioTrack);
          this.mAudioTrack = uAudioTrackA;
          uAudioTrack = uAudioTrackA.getAudioTrack();
          uAudioTrack.setPlaybackPositionUpdateListener(this, this.mHandler);
          AudioDriver tmMutex = this.mMutex;
          _monitor_enter(tmMutex);
          this.mMarkerFallbackPosition = 0;
          this.mAndroidSdkUnderrunCount = 0;
          AudioDriver.setAudioTrackVolume((AudioTrack.getMaxVolume() * this.mCurrentVolumeGain), this.mAudioTrack.getAudioTrack());
          _monitor_exit(tmMutex);
          this.mAudioSessionId = Integer.valueOf(this.mAudioTrack.getAudioTrack().getAudioSessionId());
          AudioDriver.sAudioRouteListenerHandler.attach(this.mAudioTrack);
          AudioDriver.sSessionToAudioDriverMap.put(this.mAudioTrack.getAudioTrack().getAudioSessionId(), this);
          AudioDriver.sCurrentAudioSession = Integer.valueOf(this.mAudioTrack.getAudioTrack().getAudioSessionId());
          AudioDriver.dispatchOnAudioTrackCreated(this.mAudioTrack.getAudioTrack().getAudioSessionId());
          return;
       }
    }
    private void destroyAudioTrack(){
       if (this.mAudioTrack == null) {
          return;
       }
       sn0.a("destruction");
       AudioDriver tmMutex = this.mMutex;
       _monitor_enter(tmMutex);
       AudioDriver.sAudioRouteListenerHandler.detach(this.mAudioTrack);
       AudioDriver.dispatchOnAudioTrackDestroyed(this.mAudioTrack.getAudioTrack().getAudioSessionId());
       AudioDriver.sCurrentAudioSession = null;
       AudioDriver.sSessionToAudioDriverMap.delete(this.mAudioTrack.getAudioTrack().getAudioSessionId());
       this.mPlaying = false;
       this.mAudioTrack.getAudioTrack().setPlaybackPositionUpdateListener(null, this.mHandler);
       this.mAudioTrack.getAudioTrack().flush();
       this.mAudioTrack.getAudioTrack().stop();
       this.mAudioTrack.getAudioTrack().release();
       this.mAudioTrack = null;
       _monitor_exit(tmMutex);
       return;
    }
    public static void dispatchOnAudioTrackCreated(int p0){
       Iterator iterator = AudioDriver.sAudioDriverListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onAudioTrackCreated(p0);
       }
       return;
    }
    public static void dispatchOnAudioTrackDestroyed(int p0){
       Iterator iterator = AudioDriver.sAudioDriverListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onAudioTrackDestroyed(p0);
       }
       return;
    }
    private boolean floatPcmAllowed(){
       AudioDriver tmFloatPcmSu;
       boolean b = ((tmFloatPcmSu = this.mFloatPcmSupportDeviceSet) != null)? tmFloatPcmSu.isFloatPcmSupported(): false;
       return b;
    }
    public static Integer getCurrentAudioSession(){
       return AudioDriver.sCurrentAudioSession;
    }
    private static boolean internalAudioFocusHandlingEnabled(){
       boolean b = (AudioDriver.sAudioDriverCallbacks != null)? true: false;
       return b;
    }
    private static void maybeAbandonFocus(){
       if (AudioDriver.internalAudioFocusHandlingEnabled()) {
          AudioDriver.sAudioDriverCallbacks.maybeAbandonAudioFocus();
       }
       return;
    }
    private void maybeStartPlayback(){
       if (this.mPaused == null && this.mPlaying != null) {
          AudioDriver tmMutex = this.mMutex;
          _monitor_enter(tmMutex);
          if (this.mFramesBufferedBeforePlay >= 512 && this.requestAudioFocus()) {
             this.mAudioTrack.getAudioTrack().play();
             this.mFramesBufferedBeforePlay = 0;
          }
          _monitor_exit(tmMutex);
       }
       return;
    }
    private native void onBufferUnderrun(int p0);
    private native void onDestroy();
    private native void onFlush();
    public static void removeListener(AudioDriver$AudioDriverListener p0){
       AudioDriver.sAudioDriverListeners.remove(p0);
    }
    private boolean requestAudioFocus(){
       if (AudioDriver.internalAudioFocusHandlingEnabled()) {
          return AudioDriver.sAudioDriverCallbacks.requestAudioFocus(this.mAudioFeatures);
       }
       return true;
    }
    private void sendVolumeUpdateDelayed(float p0,int p1){
       AudioDriver tmHandler;
       if ((tmHandler = this.mHandler) == null) {
          return;
       }
       this.mHandler.sendMessageDelayed(tmHandler.obtainMessage(1, Float.valueOf(p0)), (long)p1);
       return;
    }
    public static void setAudioDriverCallbacks(AudioDriver$AudioDriverCallbacks p0){
       AudioDriver.sAudioDriverCallbacks = p0;
    }
    public static void setAudioRouteListenerHandler(AudioDriver$AudioRouteListenerHandler p0){
       AudioDriver.sAudioRouteListenerHandler = (p0 != null)? p0: new AudioDriver$NoopAudioRouteListenerHandler(null);
       return;
    }
    private static void setAudioTrackVolume(float p0,AudioTrack p1){
       Object[] objArray = new Object[]{Float.valueOf(p0)};
       Logger.d("Set volume to %f", objArray);
       p1.setVolume(p0);
    }
    private static int snapRampTimeToDelta(int p0){
       int i;
       if (i = p0 % 50) {
          p0 = (p0 + 50) - i;
       }
       return p0;
    }
    private void startDucking(int p0,float p1){
       this.mHandler.removeMessages(1);
       int i = 0;
       if ((p1) >= 0 && (0x3f800000 - p1) <= 0) {
          AudioDriver tmMutex = this.mMutex;
          _monitor_enter(tmMutex);
          _monitor_exit(tmMutex);
          float f = this.mCurrentVolumeGain - p1;
          if ((p0 = AudioDriver.snapRampTimeToDelta((int)((f / (AudioTrack.getMaxVolume() - p1)) * (float)p0))) < 0) {
             return;
          }
          this.mCurrentVolumeTarget = p1;
          if (!p0) {
             this.sendVolumeUpdateDelayed(p1, i);
          }else {
             for (; i <= p0; i = i + 50) {
                int i1 = p0 - i;
                float f1 = (float)i1 / (float)p0;
                f1 = f1 * f;
                f1 = f1 + p1;
                this.sendVolumeUpdateDelayed(f1, i);
             }
          }
          return;
       }else {
          Object[] objArray = new Object[i];
          Logger.e("Requested volume must be between 0.0 and 1.0", objArray);
          return;
       }
    }
    public static void startDuckingAudioSession(int p0){
       AudioDriver.startDuckingAudioSession(p0, 200, 0.25f);
    }
    public static void startDuckingAudioSession(int p0,int p1,float p2){
       AudioDriver uAudioDriver;
       if ((uAudioDriver = AudioDriver.sSessionToAudioDriverMap.get(p0)) != null) {
          uAudioDriver.startDucking(p1, p2);
       }
       return;
    }
    private void stopDucking(int p0){
       this.mHandler.removeMessages(1);
       float maxVolume = AudioTrack.getMaxVolume();
       AudioDriver tmMutex = this.mMutex;
       _monitor_enter(tmMutex);
       AudioDriver tmCurrentVol = this.mCurrentVolumeGain;
       _monitor_exit(tmMutex);
       tmMutex = this.mCurrentVolumeTarget;
       float f = tmCurrentVol - tmMutex;
       float f1 = 0x3f800000;
       if ((p0 = AudioDriver.snapRampTimeToDelta((int)((f1 - (f / (maxVolume - tmMutex))) * (float)p0))) < 0) {
          return;
       }
       this.mCurrentVolumeTarget = f1;
       int i = 0;
       if (!p0) {
          this.sendVolumeUpdateDelayed(AudioTrack.getMaxVolume(), i);
       }else {
          for (; i <= p0; i = i + 50) {
             f = (float)i / (float)p0;
             this.sendVolumeUpdateDelayed(et0.l(maxVolume, tmCurrentVol, f, tmCurrentVol), i);
          }
       }
       return;
    }
    public static void stopDuckingAudioSession(int p0){
       AudioDriver.stopDuckingAudioSession(p0, 1000);
    }
    public static void stopDuckingAudioSession(int p0,int p1){
       AudioDriver uAudioDriver;
       if ((uAudioDriver = AudioDriver.sSessionToAudioDriverMap.get(p0)) != null) {
          uAudioDriver.stopDucking(p1);
       }
       return;
    }
    public void destroy(){
       AudioDriver tmHandlerThr;
       boolean b = false;
       this.mPlaying = b;
       boolean b1 = true;
       this.mPaused = b1;
       this.mOpen = b;
       Iterator iterator = AudioDriver.sAudioDriverListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onPaused(b1, this.mAudioSessionId);
       }
       if (this.mAudioTrack == null) {
          return;
       }
       this.destroyAudioTrack();
       AudioDriver.abandonAudioFocus();
       this.mNativeWrapper.onDestroy();
       if ((tmHandlerThr = this.mHandlerThread) != null) {
          try{
             tmHandlerThr.quit();
             tmHandlerThr.join(1000);
          }catch(java.lang.InterruptedException e1){
             Object[] objArray = new Object[b];
             Logger.w(e1, "Interrupted while waiting for notification thread to join", objArray);
          }
       }
       this.mHandlerThread = null;
       this.mHandler = null;
       return;
    }
    public void flush(){
       AudioDriver tmAudioTrack;
       if (this.mOpen == null) {
          throw new IllegalStateException("cannot call flush\(\) on destroyed object");
       }
       Iterator iterator = AudioDriver.sAudioDriverListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onFlushStart(this.mAudioSessionId.intValue());
       }
       this.mPlaying = false;
       this.mFramesBufferedBeforePlay = 0;
       if (this.mCreateFailed != null) {
          this.createAudioTrack();
       }else if((tmAudioTrack = this.mAudioTrack) == null){
          return;
       }else {
          tmAudioTrack.getAudioTrack().pause();
          this.destroyAudioTrack();
          this.createAudioTrack();
       }
       this.mNativeWrapper.onFlush();
       iterator = AudioDriver.sAudioDriverListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onFlushComplete(this.mAudioSessionId.intValue());
       }
       return;
    }
    public AudioDriver$AudioDriverCallbacks getAudioDriverCallbacks(){
       return AudioDriver.sAudioDriverCallbacks;
    }
    public AudioTrack getAudioTrack(){
       AudioDriver tmAudioTrack;
       if ((tmAudioTrack = this.mAudioTrack) == null) {
          return null;
       }
       return tmAudioTrack.getAudioTrack();
    }
    public AudioTrackAdapter getAudioTrackAdapter(){
       return this.mAudioTrack;
    }
    public int getFreeSize(){
       if (this.mAudioTrack == null) {
          return 0;
       }
       return (this.mBufferSizeInBytes - (this.getQueuedSize() * this.mBytesPerFrame));
    }
    public int getPosition(){
       int i = 0;
       if (this.mAudioTrack == null) {
          return i;
       }
       AudioDriver tmMutex = this.mMutex;
       _monitor_enter(tmMutex);
       _monitor_exit(tmMutex);
       return Math.max(i, this.mAudioTrack.getAudioTrack().getPlaybackHeadPosition());
    }
    public int getQueuedSize(){
       int notification;
       int i = 0;
       if (this.mAudioTrack == null) {
          return i;
       }
       AudioDriver tmMutex = this.mMutex;
       _monitor_enter(tmMutex);
       if (this.mPlaying != null) {
          if (!(notification = this.mAudioTrack.getAudioTrack().getNotificationMarkerPosition())) {
             notification = this.mMarkerFallbackPosition;
          }
          _monitor_exit(tmMutex);
          return Math.max(i, (notification - this.mAudioTrack.getAudioTrack().getPlaybackHeadPosition()));
       }else {
          _monitor_exit(tmMutex);
          return this.mFramesBufferedBeforePlay;
       }
    }
    public int getVolume(){
       return 0xffff;
    }
    public AudioDriver$VolumeHandler getVolumeHandler(){
       return this.mHandler;
    }
    public boolean isPlaying(){
       boolean b = false;
       if (this.mAudioTrack == null) {
          return b;
       }
       if (this.mPlaying != null && this.getQueuedSize() > 0) {
          b = true;
       }
       return b;
    }
    public void onMarkerReached(AudioTrack p0){
       AudioDriver tmAudioTrack;
       int notification;
       if (this.mOpen == null) {
          return;
       }
       AudioDriver tmMutex = this.mMutex;
       _monitor_enter(tmMutex);
       if (this.mOpen == null) {
          _monitor_exit(tmMutex);
          return;
       }else if((tmAudioTrack = this.mAudioTrack) != null && p0 == tmAudioTrack.getAudioTrack()){
          if (Build$VERSION.SDK_INT >= 24) {
             int i = 1.a(p0);
             tmAudioTrack = this.mAndroidSdkUnderrunCount;
             if (i > tmAudioTrack) {
                this.mNativeWrapper.onBufferUnderrun((i - tmAudioTrack));
                this.mAndroidSdkUnderrunCount = i;
             }
          }else if(!(notification = p0.getNotificationMarkerPosition())){
             notification = this.mMarkerFallbackPosition;
          }
          if (p0.getPlaybackHeadPosition() >= notification) {
             this.mNativeWrapper.onBufferUnderrun(1);
          }
          _monitor_exit(tmMutex);
          Iterator iterator = AudioDriver.sAudioDriverListeners.iterator();
          while (iterator.hasNext()) {
             iterator.next().onPaused(1, this.mAudioSessionId);
          }
          return;
       }else {
          _monitor_exit(tmMutex);
          return;
       }
    }
    public void onPeriodicNotification(AudioTrack p0){
    }
    public int open(int p0,int p1,int p2,int p3,int p4){
       if (p2 != 16 && p2 != 17) {
          throw new IllegalArgumentException("Unsupported sample format!");
       }
       if (p2 == 17 && this.floatPcmAllowed()) {
          this.mSampleFormat = 4;
          this.open(p0, p1, p3, p4);
          return 17;
       }else {
          this.open(p0, p1, p3, p4);
          return 16;
       }
    }
    public void open(int p0,int p1){
       this.open(p0, p1, 0);
    }
    public void open(int p0,int p1,int p2){
       this.open(p0, p1, p2, 0);
    }
    public void open(int p0,int p1,int p2,int p3){
       Process.setThreadPriority(-16);
       this.mSampleRate = p0;
       int i = (p1 == 1)? 4: 12;
       this.mChannelConfig = i;
       this.mAudioFeatures = AudioFeatures.fromCoreAudioFeatures(p2, p3);
       AudioDriver tmSampleForm = this.mSampleFormat;
       p1 = p1 * tmSampleForm;
       this.mBytesPerFrame = p1;
       p1 = (p1 * p0) * 1;
       this.mBufferSizeInBytes = p1;
       this.mBufferSizeInBytes = Math.max(p1, AudioTrack.getMinBufferSize(p0, this.mChannelConfig, tmSampleForm));
       if (this.mLooper == null) {
          HandlerThread handlerThrea = new HandlerThread("AudioDriverHandlerThread");
          handlerThrea.start();
          this.mLooper = handlerThrea.getLooper();
          this.mHandlerThread = handlerThrea;
       }
       this.mHandler = new AudioDriver$VolumeHandler(this.mLooper, this, null);
       this.mOpen = true;
       this.createAudioTrack();
       if (this.mAudioTrack != null) {
          AudioDriver tmMutex = this.mMutex;
          _monitor_enter(tmMutex);
          this.mAudioTrack.getAudioTrack().setNotificationMarkerPosition(0);
          this.mMarkerFallbackPosition = 0;
          this.mAndroidSdkUnderrunCount = 0;
          _monitor_exit(tmMutex);
       }
       return;
    }
    public void pauseAtShutdown(){
       AudioDriver tmAudioTrack;
       if (!Build.MANUFACTURER.equals("Google")) {
          return;
       }
       try{
          if ((tmAudioTrack = this.mAudioTrack) != null) {
             tmAudioTrack.getAudioTrack().pause();
          }
          return;
       }catch(java.lang.IllegalStateException e0){
       }
    }
    public void setPaused(boolean p0){
       this.mPaused = p0;
       Iterator iterator = AudioDriver.sAudioDriverListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onPaused(p0, this.mAudioSessionId);
       }
       if (this.mAudioTrack == null) {
          return;
       }
       if (this.mPaused != null) {
          AudioDriver.maybeAbandonFocus();
          this.mAudioTrack.getAudioTrack().pause();
       }else {
          this.maybeStartPlayback();
       }
       return;
    }
    public void setVolume(int p0){
    }
    public void startPlayback(){
       this.mPlaying = true;
       this.maybeStartPlayback();
       Iterator iterator = AudioDriver.sAudioDriverListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onPaused(this.mPaused, this.mAudioSessionId);
       }
       return;
    }
    public void stopPlayback(){
       AudioDriver tmAudioTrack;
       if ((tmAudioTrack = this.mAudioTrack) == null) {
          return;
       }
       tmAudioTrack.getAudioTrack().pause();
       return;
    }
    public int write(byte[] p0,int p1){
       int i1;
       AudioDriver tmAudioTrack = this.mAudioTrack;
       int i = 0;
       if (tmAudioTrack == null) {
          return i;
       }
       if ((i1 = tmAudioTrack.getAudioTrack().write(ByteBuffer.wrap(p0), p1, i)) <= 0) {
          return i;
       }
       AudioDriver tmMutex = this.mMutex;
       _monitor_enter(tmMutex);
       this.mAudioTrack.getAudioTrack().setNotificationMarkerPosition((this.mAudioTrack.getAudioTrack().getNotificationMarkerPosition() + (i1 / this.mBytesPerFrame)));
       this.mMarkerFallbackPosition = this.mMarkerFallbackPosition + (i1 / this.mBytesPerFrame);
       if (this.mAudioTrack.getAudioTrack().getPlayState() != 3) {
          this.mFramesBufferedBeforePlay = this.mFramesBufferedBeforePlay + (i1 / this.mBytesPerFrame);
       }
       _monitor_exit(tmMutex);
       this.maybeStartPlayback();
       return i1;
    }
}
