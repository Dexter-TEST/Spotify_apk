package com.spotify.rcs.model.Platform$PlatformVerifier;
import p.vb3;
import java.lang.Object;
import com.spotify.rcs.model.a;

final class Platform$PlatformVerifier implements vb3	// class@000bc8 from classes.dex
{
    static final vb3 INSTANCE;

    static {
       Platform$PlatformVerifier.INSTANCE = new Platform$PlatformVerifier();
    }
    private void Platform$PlatformVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (a.a(p0) != null)? true: false;
       return b;
    }
}
