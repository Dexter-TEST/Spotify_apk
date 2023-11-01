package com.spotify.connectivity.product_state.esperanto.proto.GetValuesResponseOrBuilder;
import p.u74;
import java.lang.String;
import p.s74;
import java.util.Map;

public interface abstract GetValuesResponseOrBuilder implements u74	// class@0007b4 from classes.dex
{

    boolean containsPairs(String p0);
    s74 getDefaultInstanceForType();
    Map getPairs();
    int getPairsCount();
    Map getPairsMap();
    String getPairsOrDefault(String p0,String p1);
    String getPairsOrThrow(String p0);
    boolean isInitialized();
}
