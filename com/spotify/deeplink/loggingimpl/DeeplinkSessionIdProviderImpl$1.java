package com.spotify.deeplink.loggingimpl.DeeplinkSessionIdProviderImpl$1;
import p.r71;
import p.n61;
import java.lang.Object;
import p.ek3;
import java.lang.String;
import p.co5;
import p.o26;
import java.util.concurrent.locks.ReentrantLock;

public final class DeeplinkSessionIdProviderImpl$1 implements r71	// class@000890 from classes.dex
{
    public final n61 a;

    public void DeeplinkSessionIdProviderImpl$1(n61 p0){
       this.a = p0;
       super();
    }
    public final void onCreate(ek3 p0){
       co5.o(p0, "owner");
    }
    public final void onDestroy(ek3 p0){
    }
    public final void onPause(ek3 p0){
    }
    public final void onResume(ek3 p0){
       co5.o(p0, "owner");
    }
    public final void onStart(ek3 p0){
       co5.o(p0, "owner");
    }
    public final void onStop(ek3 p0){
       DeeplinkSessionIdProviderImpl$1 ta = this.a;
       n61 b = ta.b;
       b.lock();
       new o26(10, ta).invoke();
       b.unlock();
    }
}
