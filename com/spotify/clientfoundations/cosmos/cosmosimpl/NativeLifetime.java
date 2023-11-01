package com.spotify.clientfoundations.cosmos.cosmosimpl.NativeLifetime;
import com.spotify.clientfoundations.cosmos.cosmos.Lifetime;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;

public final class NativeLifetime implements Lifetime	// class@000572 from classes.dex
{
    private final AtomicBoolean destroyed;
    private long nThis;

    private void NativeLifetime(){
       super();
       this.destroyed = new AtomicBoolean();
    }
    public native final void destroy();
    public void release(){
       if (this.destroyed.compareAndSet(false, true)) {
          this.destroy();
       }
       return;
    }
}
