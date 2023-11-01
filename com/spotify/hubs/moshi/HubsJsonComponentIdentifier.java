package com.spotify.hubs.moshi.HubsJsonComponentIdentifier;
import java.lang.Object;
import p.fu2;
import com.spotify.hubs.moshi.HubsJsonComponentIdentifier$HubsJsonComponentIdentifierCompatibility;
import java.lang.String;

final class HubsJsonComponentIdentifier	// class@0008c5 from classes.dex
{
    private String a;
    private String b;
    private static final String c = "id";
    private static final String d = "category";

    public void HubsJsonComponentIdentifier(){
       super();
    }
    public fu2 a(){
       HubsJsonComponentIdentifier tb;
       HubsJsonComponentIdentifier ta = this.a;
       String str = "";
       if (ta != null) {
       }else {
          ta = str;
       }
       if ((tb = this.b) != null) {
          str = tb;
       }
       return new HubsJsonComponentIdentifier$HubsJsonComponentIdentifierCompatibility(ta, str);
    }
}
