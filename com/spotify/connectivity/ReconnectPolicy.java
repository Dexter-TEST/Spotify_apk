package com.spotify.connectivity.ReconnectPolicy;
import com.spotify.connectivity.ReconnectPolicy$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;

public final class ReconnectPolicy	// class@0005c1 from classes.dex
{
    public static final int AUTOMATIC_ON_CHANGE;
    public static final int AUTOMATIC_ON_IMPROVEMENT;
    public static final ReconnectPolicy$Companion Companion;
    public static final int NOT_AUTOMATIC;

    static {
       ReconnectPolicy.Companion = new ReconnectPolicy$Companion(null);
       ReconnectPolicy.AUTOMATIC_ON_CHANGE = 1;
       ReconnectPolicy.AUTOMATIC_ON_IMPROVEMENT = 2;
    }
    public void ReconnectPolicy(){
       super();
    }
}
