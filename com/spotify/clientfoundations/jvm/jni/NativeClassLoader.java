package com.spotify.clientfoundations.jvm.jni.NativeClassLoader;
import com.spotify.clientfoundations.jvm.jni.NativeClassLoader$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import java.lang.ClassLoader;

public final class NativeClassLoader	// class@000587 from classes.dex
{
    public static final NativeClassLoader$Companion Companion;

    static {
       NativeClassLoader.Companion = new NativeClassLoader$Companion(null);
    }
    public void NativeClassLoader(){
       super();
    }
    public static final void access$setClassLoader(ClassLoader p0){
       NativeClassLoader.setClassLoader(p0);
    }
    public static final void load(){
       NativeClassLoader.Companion.load();
    }
    private static native final void setClassLoader(ClassLoader p0);
}
