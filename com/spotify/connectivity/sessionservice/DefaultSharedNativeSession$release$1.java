package com.spotify.connectivity.sessionservice.DefaultSharedNativeSession$release$1;
import java.lang.Runnable;
import com.spotify.connectivity.sessionservice.DefaultSharedNativeSession;
import java.lang.Object;
import com.spotify.connectivity.auth.NativeSession;

final class DefaultSharedNativeSession$release$1 implements Runnable	// class@000818 from classes.dex
{
    final DefaultSharedNativeSession this$0;

    public void DefaultSharedNativeSession$release$1(DefaultSharedNativeSession p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       DefaultSharedNativeSession.access$getInternalNativeSession$p(this.this$0).destroy();
    }
}
