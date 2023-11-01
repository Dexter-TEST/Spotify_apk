package com.spotify.connectivity.sessionservice.TemporarySessionLoginFlowDependencies$LegacyFlow;
import com.spotify.connectivity.sessionservice.TemporarySessionLoginFlowDependencies;
import com.spotify.connectivity.sessionapi.SharedNativeSession;
import java.lang.Object;
import java.lang.String;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;

public final class TemporarySessionLoginFlowDependencies$LegacyFlow extends TemporarySessionLoginFlowDependencies	// class@000821 from classes.dex
{
    private final SharedNativeSession sharedNativeSession;

    public void TemporarySessionLoginFlowDependencies$LegacyFlow(SharedNativeSession p0){
       co5.o(p0, "sharedNativeSession");
       super(null);
       this.sharedNativeSession = p0;
    }
    public static TemporarySessionLoginFlowDependencies$LegacyFlow copy$default(TemporarySessionLoginFlowDependencies$LegacyFlow p0,SharedNativeSession p1,int p2,Object p3){
       TemporarySessionLoginFlowDependencies$LegacyFlow sharedNative;
       if ((p2 & 0x01)) {
          sharedNative = p0.sharedNativeSession;
       }
       return p0.copy(sharedNative);
    }
    public final SharedNativeSession component1(){
       return this.sharedNativeSession;
    }
    public final TemporarySessionLoginFlowDependencies$LegacyFlow copy(SharedNativeSession p0){
       co5.o(p0, "sharedNativeSession");
       return new TemporarySessionLoginFlowDependencies$LegacyFlow(p0);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof TemporarySessionLoginFlowDependencies$LegacyFlow) {
          return false;
       }
       if (!co5.c(this.sharedNativeSession, p0.sharedNativeSession)) {
          return false;
       }
       return true;
    }
    public final SharedNativeSession getSharedNativeSession(){
       return this.sharedNativeSession;
    }
    public int hashCode(){
       return this.sharedNativeSession.hashCode();
    }
    public String toString(){
       return "LegacyFlow\(sharedNativeSession="+this.sharedNativeSession+')';
    }
}
