package com.spotify.connectivity.httpwebgate.WebgateHelper;
import com.spotify.connectivity.httpwebgate.WebgateHelper$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.bv5;
import java.util.Map;
import java.lang.Class;
import com.spotify.connectivity.httpwebgate.NoAuthTag;
import p.ps2;
import p.av6;

public final class WebgateHelper	// class@00074a from classes.dex
{
    private String customHost;
    public static final WebgateHelper$Companion Companion;
    public static final String DEFAULT_WEBGATE_HOST;
    public static final String DEFAULT_WEBGATE_PROTOCOL;
    public static final String EXPERIMENTAL_WEBGATE_HOST;
    public static final String IMAGE_UPLOAD_HOST;
    public static final String INTERNAL_WEBGATE_HOST;
    public static final String WEB_API_HOST;

    static {
       WebgateHelper.Companion = new WebgateHelper$Companion(null);
    }
    public void WebgateHelper(){
       super();
    }
    private final boolean isWebgateHost(String p0){
       boolean b = (!co5.c("spclient.wg.spotify.com", p0) && (!co5.c("exp.wg.spotify.com", p0) && (!co5.c("wgint.spotify.net", p0) && (!co5.c("image-upload.spotify.com", p0) && !co5.c("api.spotify.com", p0)))))? false: true;
       return b;
    }
    public final boolean hasNoAuthTag(bv5 p0){
       co5.o(p0, "request");
       return Object.class.cast(p0.e.get(Object.class)) instanceof NoAuthTag;
    }
    public final boolean isWebgateRequest(bv5 p0){
       WebgateHelper tcustomHost;
       co5.o(p0, "request");
       p0 = p0.a;
       boolean b = false;
       if (p0.j == null) {
       }else if(this.isWebgateHost(p0.d)){
          b = true;
       }else if((tcustomHost = this.customHost) != null){
          b = av6.i0(tcustomHost, p0.d, true);
       }
       return b;
    }
    public final void setWebgateHost(String p0){
       co5.o(p0, "customHost");
       this.customHost = p0;
    }
}
