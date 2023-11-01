package com.spotify.clientfoundations.jvm.jni.NativeClassLoader$Companion;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.ClassLoader;
import com.spotify.clientfoundations.jvm.jni.NativeClassLoader;
import java.lang.Class;
import java.lang.String;
import p.co5;

public final class NativeClassLoader$Companion	// class@000586 from classes.dex
{

    private void NativeClassLoader$Companion(){
       super();
    }
    public void NativeClassLoader$Companion(DefaultConstructorMarker p0){
       super();
    }
    private final void setClassLoader(ClassLoader p0){
       NativeClassLoader.access$setClassLoader(p0);
    }
    public final void load(){
       ClassLoader classLoader = NativeClassLoader.class.getClassLoader();
       co5.l(classLoader, "NativeClassLoader::class.java.getClassLoader\(\)");
       this.setClassLoader(classLoader);
    }
}
