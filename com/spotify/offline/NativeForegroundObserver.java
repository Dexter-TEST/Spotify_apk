package com.spotify.offline.NativeForegroundObserver;
import java.lang.Object;

public final class NativeForegroundObserver	// class@000ab2 from classes.dex
{
    private final long nThis;

    public void NativeForegroundObserver(){
       super();
    }
    public native final void destroy();
    public native final void onForeground(boolean p0);
}
