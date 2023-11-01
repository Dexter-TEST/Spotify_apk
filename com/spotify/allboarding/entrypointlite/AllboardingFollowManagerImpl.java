package com.spotify.allboarding.entrypointlite.AllboardingFollowManagerImpl;
import p.dk3;
import p.vi0;
import p.ek3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.vj3;
import p.fn0;

public final class AllboardingFollowManagerImpl implements dk3	// class@000513 from classes.dex
{
    public final vi0 a;
    public final fn0 b;

    public void AllboardingFollowManagerImpl(vi0 p0,ek3 p1){
       co5.o(p0, "collectionWrapper");
       co5.o(p1, "lifecycleObserver");
       super();
       this.a = p0;
       p1.getLifecycle().a(this);
       this.b = new fn0();
    }
    public final void tearDown(){
       this.b.e();
    }
}
