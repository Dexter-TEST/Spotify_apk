package com.spotify.playback.playbacknative.AudioDriver$DefaultNativeWrapper;
import com.spotify.playback.playbacknative.AudioDriver$NativeWrapper;
import com.spotify.playback.playbacknative.AudioDriver;
import java.lang.Object;
import com.spotify.playback.playbacknative.AudioDriver$1;

class AudioDriver$DefaultNativeWrapper implements AudioDriver$NativeWrapper	// class@000acf from classes.dex
{
    final AudioDriver this$0;

    private void AudioDriver$DefaultNativeWrapper(AudioDriver p0){
       this.this$0 = p0;
       super();
    }
    public void AudioDriver$DefaultNativeWrapper(AudioDriver p0,AudioDriver$1 p1){
       super(p0);
    }
    public void onBufferUnderrun(int p0){
       AudioDriver.access$000(this.this$0, p0);
    }
    public void onDestroy(){
       AudioDriver.access$100(this.this$0);
    }
    public void onFlush(){
       AudioDriver.access$200(this.this$0);
    }
}
