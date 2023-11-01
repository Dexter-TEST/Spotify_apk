package com.spotify.connectivity.platformconnectiontype.FakePlatformConnectionTypeProperties;
import com.spotify.connectivity.platformconnectiontype.PlatformConnectionTypeProperties;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;

public final class FakePlatformConnectionTypeProperties implements PlatformConnectionTypeProperties	// class@00078f from classes.dex
{
    private boolean netCapabilitiesValidatedDisregardedEnabled;
    private boolean netCapabilitiesValidatedDisregardedEnabledCalled;
    private boolean shouldUseSingleThread;
    private boolean shouldUseSingleThreadCalled;

    public void FakePlatformConnectionTypeProperties(){
       super(false, false, 3, null);
    }
    public void FakePlatformConnectionTypeProperties(boolean p0,boolean p1){
       super();
       this.netCapabilitiesValidatedDisregardedEnabled = p0;
       this.shouldUseSingleThread = p1;
    }
    public void FakePlatformConnectionTypeProperties(boolean p0,boolean p1,int p2,DefaultConstructorMarker p3){
       if ((p2 & 0x01)) {
          p0 = false;
       }
       if ((p2 & 0x02)) {
          p1 = false;
       }
       super(p0, p1);
       return;
    }
    public final boolean getNetCapabilitiesValidatedDisregardedEnabled(){
       return this.netCapabilitiesValidatedDisregardedEnabled;
    }
    public final boolean getNetCapabilitiesValidatedDisregardedEnabledCalled(){
       return this.netCapabilitiesValidatedDisregardedEnabledCalled;
    }
    public final boolean getShouldUseSingleThread(){
       return this.shouldUseSingleThread;
    }
    public final boolean getShouldUseSingleThreadCalled(){
       return this.shouldUseSingleThreadCalled;
    }
    public boolean netCapabilitiesValidatedDisregardedEnabled(){
       this.netCapabilitiesValidatedDisregardedEnabledCalled = true;
       return this.netCapabilitiesValidatedDisregardedEnabled;
    }
    public final void setNetCapabilitiesValidatedDisregardedEnabled(boolean p0){
       this.netCapabilitiesValidatedDisregardedEnabled = p0;
    }
    public final void setShouldUseSingleThread(boolean p0){
       this.shouldUseSingleThread = p0;
    }
    public boolean shouldUseSingleThread(){
       this.shouldUseSingleThreadCalled = true;
       return this.shouldUseSingleThread;
    }
}
