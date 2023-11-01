package com.spotify.clientfoundations.jvm.jni.NativeHelpers;
import com.spotify.clientfoundations.jvm.jni.NativeHelpers$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import java.util.Map;

public final class NativeHelpers	// class@00058b from classes.dex
{
    public static final NativeHelpers$Companion Companion;

    static {
       NativeHelpers.Companion = new NativeHelpers$Companion(null);
    }
    private void NativeHelpers(){
       super();
    }
    public static final Map byteArrayToMap(byte[] p0){
       return NativeHelpers.Companion.byteArrayToMap(p0);
    }
    public static final byte[] mapToByteArray(Map p0){
       return NativeHelpers.Companion.mapToByteArray(p0);
    }
}
