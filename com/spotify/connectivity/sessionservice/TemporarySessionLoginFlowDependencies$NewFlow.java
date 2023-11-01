package com.spotify.connectivity.sessionservice.TemporarySessionLoginFlowDependencies$NewFlow;
import com.spotify.connectivity.sessionservice.TemporarySessionLoginFlowDependencies;
import java.util.Map;
import com.spotify.connectivity.auth.AuthUserInfo;
import java.lang.Object;
import java.lang.String;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;

public final class TemporarySessionLoginFlowDependencies$NewFlow extends TemporarySessionLoginFlowDependencies	// class@000822 from classes.dex
{
    private final AuthUserInfo authUserInfo;
    private final Map productState;

    public void TemporarySessionLoginFlowDependencies$NewFlow(Map p0,AuthUserInfo p1){
       co5.o(p0, "productState");
       co5.o(p1, "authUserInfo");
       super(null);
       this.productState = p0;
       this.authUserInfo = p1;
    }
    public static TemporarySessionLoginFlowDependencies$NewFlow copy$default(TemporarySessionLoginFlowDependencies$NewFlow p0,Map p1,AuthUserInfo p2,int p3,Object p4){
       TemporarySessionLoginFlowDependencies$NewFlow productState;
       TemporarySessionLoginFlowDependencies$NewFlow authUserInfo;
       if ((p3 & 0x01)) {
          productState = p0.productState;
       }
       if ((p3 & 0x02)) {
          authUserInfo = p0.authUserInfo;
       }
       return p0.copy(productState, authUserInfo);
    }
    public final Map component1(){
       return this.productState;
    }
    public final AuthUserInfo component2(){
       return this.authUserInfo;
    }
    public final TemporarySessionLoginFlowDependencies$NewFlow copy(Map p0,AuthUserInfo p1){
       co5.o(p0, "productState");
       co5.o(p1, "authUserInfo");
       return new TemporarySessionLoginFlowDependencies$NewFlow(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof TemporarySessionLoginFlowDependencies$NewFlow) {
          return false;
       }
       if (!co5.c(this.productState, p0.productState)) {
          return false;
       }
       if (!co5.c(this.authUserInfo, p0.authUserInfo)) {
          return false;
       }
       return true;
    }
    public final AuthUserInfo getAuthUserInfo(){
       return this.authUserInfo;
    }
    public final Map getProductState(){
       return this.productState;
    }
    public int hashCode(){
       return (this.authUserInfo.hashCode() + (this.productState.hashCode() * 31));
    }
    public String toString(){
       return "NewFlow\(productState="+this.productState+", authUserInfo="+this.authUserInfo+')';
    }
}
