package com.spotify.connectivity.WebgateUserAgentPlatform;
import com.spotify.connectivity.WebgateUserAgentPlatform$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import java.lang.String;

public final class WebgateUserAgentPlatform	// class@0005c8 from classes.dex
{
    public static final WebgateUserAgentPlatform$Companion Companion;

    static {
       WebgateUserAgentPlatform.Companion = new WebgateUserAgentPlatform$Companion(null);
    }
    public void WebgateUserAgentPlatform(){
       super();
    }
    public static native final String android();
    public static native final String ios();
    public static native final String linux();
    public static native final String osxArm64();
    public static native final String osxX64();
    public static native final String windowsArm64();
    public static native final String windowsX86();
    public static native final String windowsX86_64();
}
