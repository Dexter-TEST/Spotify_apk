package com.spotify.clientfoundations.appstorage.userdirectoryimpl.NativeUserDirectoryManagerImpl;
import com.spotify.clientfoundations.appstorage.userdirectory.NativeUserDirectoryManager;
import com.spotify.clientfoundations.appstorage.userdirectory.UserDirectoryManager;
import com.spotify.clientfoundations.appstorage.userdirectoryimpl.NativeUserDirectoryManagerImpl$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import java.lang.String;

public final class NativeUserDirectoryManagerImpl implements NativeUserDirectoryManager, UserDirectoryManager	// class@00054b from classes.dex
{
    private final String cachePath;
    private long nThis;
    private final String settingsPath;
    public static final NativeUserDirectoryManagerImpl$Companion Companion;

    static {
       NativeUserDirectoryManagerImpl.Companion = new NativeUserDirectoryManagerImpl$Companion(null);
    }
    private void NativeUserDirectoryManagerImpl(){
       super();
    }
    public static native final NativeUserDirectoryManagerImpl create(String p0,String p1,String p2);
    public native void destroy();
    public native String getCachePath();
    public long getNThis(){
       return this.nThis;
    }
    public native String getSettingsPath();
    public native String makeCachePath(String p0);
    public native String makeSettingsPath(String p0);
}
