package com.spotify.playback.localfiles.localfilesimpl.NativeLocalFilesDelegate;
import com.spotify.playback.localfiles.localfiles.LocalFilesDelegate;
import com.spotify.playback.localfiles.localfilesimpl.NativeLocalFilesDelegate$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;

public final class NativeLocalFilesDelegate implements LocalFilesDelegate	// class@000ac8 from classes.dex
{
    private long nThis;
    public static final NativeLocalFilesDelegate$Companion Companion;

    static {
       NativeLocalFilesDelegate.Companion = new NativeLocalFilesDelegate$Companion(null);
    }
    private void NativeLocalFilesDelegate(){
       super();
    }
    public static native final NativeLocalFilesDelegate create(Object p0,Object p1,Object p2);
    public static native final NativeLocalFilesDelegate noop();
    public native final void destroy();
}
