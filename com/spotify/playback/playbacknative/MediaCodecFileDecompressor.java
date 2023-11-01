package com.spotify.playback.playbacknative.MediaCodecFileDecompressor;
import android.content.Context;
import java.lang.Object;
import com.spotify.playback.playbacknative.MediaCodecFileDecompressor$DefaultNativeWrapper;
import com.spotify.playback.playbacknative.MediaCodecFileDecompressor$1;
import com.spotify.playback.playbacknative.MediaCodecFileDecompressor$DefaultMediaCodecFactory;
import com.spotify.playback.playbacknative.MediaCodecFileDecompressor$DefaultMediaExtractorFactory;
import com.spotify.playback.playbacknative.MediaCodecFileDecompressor$NativeWrapper;
import com.spotify.playback.playbacknative.MediaCodecFileDecompressor$MediaCodecFactory;
import com.spotify.playback.playbacknative.MediaCodecFileDecompressor$MediaExtractorFactory;
import java.nio.ByteBuffer;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaCodec$BufferInfo;
import java.lang.String;
import com.spotify.playback.playbacknative.Logger;
import android.media.MediaFormat;
import android.net.Uri;
import java.util.Map;
import android.view.Surface;
import android.media.MediaCrypto;

public class MediaCodecFileDecompressor	// class@000aeb from classes.dex
{
    private MediaCodec mCodec;
    private boolean mEndOfInputStream;
    private final Context mInjectedContext;
    private ByteBuffer[] mInputBuffers;
    private MediaFormat mInputFormat;
    private final MediaCodecFileDecompressor$MediaCodecFactory mMediaCodecFactory;
    private MediaExtractor mMediaExtractor;
    private final MediaCodecFileDecompressor$MediaExtractorFactory mMediaExtractorFactory;
    private final MediaCodecFileDecompressor$NativeWrapper mNativeWrapper;
    private ByteBuffer[] mOutputBuffers;
    private MediaFormat mOutputFormat;
    private long nThis;

    public void MediaCodecFileDecompressor(Context p0){
       super();
       this.mInjectedContext = p0;
       this.mNativeWrapper = new MediaCodecFileDecompressor$DefaultNativeWrapper(this, null);
       this.mMediaCodecFactory = new MediaCodecFileDecompressor$DefaultMediaCodecFactory(null);
       this.mMediaExtractorFactory = new MediaCodecFileDecompressor$DefaultMediaExtractorFactory(null);
    }
    public void MediaCodecFileDecompressor(Context p0,MediaCodecFileDecompressor$NativeWrapper p1,MediaCodecFileDecompressor$MediaCodecFactory p2,MediaCodecFileDecompressor$MediaExtractorFactory p3){
       super();
       this.mInjectedContext = p0;
       this.mNativeWrapper = p1;
       this.mMediaCodecFactory = p2;
       this.mMediaExtractorFactory = p3;
    }
    public static void access$000(MediaCodecFileDecompressor p0,ByteBuffer p1,int p2,int p3,boolean p4){
       p0.onOutputBuffer(p1, p2, p3, p4);
    }
    private void decodeInternal(boolean p0){
       int i1;
       int i2;
       int i3;
       long l = 0;
       int i = 0;
       if (this.mEndOfInputStream == null && (i1 = this.mCodec.dequeueInputBuffer(l)) >= 0) {
          if ((i2 = this.mMediaExtractor.readSampleData(this.mInputBuffers[i1], i)) < 0) {
             this.mCodec.queueInputBuffer(i1, 0, 0, 0, 4);
             this.mEndOfInputStream = true;
          }else {
             this.mCodec.queueInputBuffer(i1, 0, i2, this.mMediaExtractor.getSampleTime(), 0);
             this.mMediaExtractor.advance();
          }
       }
       MediaCodec$BufferInfo uBufferInfo = new MediaCodec$BufferInfo();
       if ((i3 = this.mCodec.dequeueOutputBuffer(uBufferInfo, l)) >= 0) {
          if (p0) {
             int i4 = 4;
             if (((uBufferInfo.flags & i4)) == i4) {
                i = true;
             }
             this.mNativeWrapper.onOutputBuffer(this.mOutputBuffers[i3], uBufferInfo.offset, uBufferInfo.size, i);
          }else {
             Object[] objArray = new Object[i];
             Logger.e("Got data before output format, that shouldn\'t happen!", objArray);
          }
          this.mCodec.releaseOutputBuffer(i3, true);
       }else if(i3 == -3){
          this.mOutputBuffers = this.mCodec.getOutputBuffers();
       }else if(i3 == -2){
          this.mOutputFormat = this.mCodec.getOutputFormat();
       }
       return;
    }
    private native void onOutputBuffer(ByteBuffer p0,int p1,int p2,boolean p3);
    public void decode(){
       this.decodeInternal(true);
    }
    public void destroy(){
       MediaCodecFileDecompressor tmCodec;
       if ((tmCodec = this.mCodec) != null) {
          tmCodec.stop();
          this.mCodec.release();
       }
       if ((tmCodec = this.mMediaExtractor) != null) {
          tmCodec.release();
       }
       return;
    }
    public int getChannelCount(){
       int integer = (this.mOutputFormat.containsKey("channel-count"))? this.mOutputFormat.getInteger("channel-count"): -1;
       return integer;
    }
    public long getDurationUs(){
       long longx = (this.mInputFormat.containsKey("durationUs"))? this.mInputFormat.getLong("durationUs"): -1;
       return longx;
    }
    public String getMimeType(){
       String str = (this.mInputFormat.containsKey("mime"))? this.mInputFormat.getString("mime"): "";
       return str;
    }
    public int getSampleRate(){
       int integer = (this.mOutputFormat.containsKey("sample-rate"))? this.mOutputFormat.getInteger("sample-rate"): -1;
       return integer;
    }
    public boolean open(String p0){
       Object[] objArray;
       int trackCount;
       MediaCodecFileDecompressor tmCodec;
       int i = 0;
       try{
          this.mMediaExtractor = this.mMediaExtractorFactory.createExtractor();
          Uri uri = Uri.parse(p0);
          if (this.mInjectedContext != null && "content".equals(uri.getScheme())) {
             this.mMediaExtractor.setDataSource(this.mInjectedContext, uri, null);
          }else {
             this.mMediaExtractor.setDataSource(p0);
          }
          if (!(trackCount = this.mMediaExtractor.getTrackCount())) {
             Object[] objArray1 = new Object[i];
             Logger.w("No tracks found in media file", objArray1);
          }
          int i1 = 0;
          while (i1 < trackCount) {
             MediaFormat trackFormat = this.mMediaExtractor.getTrackFormat(i1);
             this.mInputFormat = trackFormat;
             String str = trackFormat.getString("mime");
             if (str.startsWith("audio/")) {
                this.mMediaExtractor.selectTrack(i1);
                MediaCodec mediaCodec = this.mMediaCodecFactory.createDecoderByType(str);
                this.mCodec = mediaCodec;
                mediaCodec.configure(this.mInputFormat, null, null, i);
                break ;
             }
             i1 = i1 + 1;
          }
          if ((tmCodec = this.mCodec) == null) {
             objArray = new Object[i];
             Logger.e("MediaCodec not found in media file", objArray);
             return i;
          }else {
             tmCodec.start();
             this.mInputBuffers = this.mCodec.getInputBuffers();
             this.mOutputBuffers = this.mCodec.getOutputBuffers();
             trackCount = 0;
             while (true) {
                if (this.mOutputFormat != null) {
                   return 1;
                }
                this.decodeInternal(i);
                if ((trackCount = trackCount + 1) > 100) {
                   break ;
                }
             }
             objArray = new Object[i];
             Logger.e("MediaFormat not found in media file", objArray);
             return i;
          }
       }catch(java.io.IOException e0){
          objArray = new Object[e0];
          Logger.e("IOException when opening media file", objArray);
          return e0;
       }
    }
    public void seekToUs(long p0){
       this.mMediaExtractor.seekTo(p0, 1);
       this.mCodec.flush();
       this.mEndOfInputStream = false;
    }
}
