package com.spotify.rcs.model.Fetch$Type$TypeVerifier;
import p.vb3;
import java.lang.Object;
import com.spotify.rcs.model.Fetch$Type;

final class Fetch$Type$TypeVerifier implements vb3	// class@000bb4 from classes.dex
{
    static final vb3 INSTANCE;

    static {
       Fetch$Type$TypeVerifier.INSTANCE = new Fetch$Type$TypeVerifier();
    }
    private void Fetch$Type$TypeVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (Fetch$Type.forNumber(p0) != null)? true: false;
       return b;
    }
}
