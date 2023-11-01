package com.spotify.clientfoundations.esperanto.esperantoimpl.NativeCancellable;
import p.tb0;
import java.lang.Object;

public final class NativeCancellable implements tb0	// class@000581 from classes.dex
{
    private final long nThis;

    public void NativeCancellable(){
       super();
    }
    private native final void internalCancel();
    public void cancel(){
       this.internalCancel();
       this.destroy();
    }
    public native final void destroy();
}
