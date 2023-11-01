package com.spotify.connectivity.esperanto.proto.ConnectivityPolicyClient;
import com.spotify.connectivity.esperanto.proto.PutRulesRequest;
import io.reactivex.rxjava3.core.Single;

public interface abstract ConnectivityPolicyClient	// class@0006f4 from classes.dex
{

    Single setRules(PutRulesRequest p0);
}
