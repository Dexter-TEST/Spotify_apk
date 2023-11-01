package com.spotify.playback.playbacknative.MediaCodecFileDecompressor$DefaultNativeWrapper;
import com.spotify.playback.playbacknative.MediaCodecFileDecompressor$NativeWrapper;
import com.spotify.playback.playbacknative.MediaCodecFileDecompressor;
import java.lang.Object;
import com.spotify.playback.playbacknative.MediaCodecFileDecompressor$1;
import java.nio.ByteBuffer;

class MediaCodecFileDecompressor$DefaultNativeWrapper implements MediaCodecFileDecompressor$NativeWrapper	// class@000ae7 from classes.dex
{
    final MediaCodecFileDecompressor this$0;

    private void MediaCodecFileDecompressor$DefaultNativeWrapper(MediaCodecFileDecompressor p0){
       this.this$0 = p0;
       super();
    }
    public void MediaCodecFileDecompressor$DefaultNativeWrapper(MediaCodecFileDecompressor p0,MediaCodecFileDecompressor$1 p1){
       super(p0);
    }
    public void onOutputBuffer(ByteBuffer p0,int p1,int p2,boolean p3){
       MediaCodecFileDecompressor.access$000(this.this$0, p0, p1, p2, p3);
    }
}
