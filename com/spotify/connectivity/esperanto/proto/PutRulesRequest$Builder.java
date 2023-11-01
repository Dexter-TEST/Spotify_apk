package com.spotify.connectivity.esperanto.proto.PutRulesRequest$Builder;
import com.spotify.connectivity.esperanto.proto.PutRulesRequestOrBuilder;
import com.google.protobuf.b;
import com.spotify.connectivity.esperanto.proto.PutRulesRequest;
import com.google.protobuf.c;

public final class PutRulesRequest$Builder extends b implements PutRulesRequestOrBuilder	// class@0006fc from classes.dex
{

    private void PutRulesRequest$Builder(){
       super(PutRulesRequest.g());
    }
    public void PutRulesRequest$Builder(int p0){
       super();
    }
    public PutRulesRequest$Builder clearAllowSyncOverCellular(){
       this.copyOnWrite();
       PutRulesRequest.e(this.instance);
       return this;
    }
    public boolean getAllowSyncOverCellular(){
       return this.instance.getAllowSyncOverCellular();
    }
    public boolean hasAllowSyncOverCellular(){
       return this.instance.hasAllowSyncOverCellular();
    }
    public PutRulesRequest$Builder setAllowSyncOverCellular(boolean p0){
       this.copyOnWrite();
       PutRulesRequest.f(this.instance, p0);
       return this;
    }
}
