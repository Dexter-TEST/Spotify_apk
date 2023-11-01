package com.spotify.hubs.moshi.HubsJsonCommandModel;
import java.lang.Object;
import p.tt2;
import com.spotify.hubs.moshi.HubsJsonCommandModel$JacksonCompatibilityHubsCommandModel;
import p.au2;
import p.a23;
import java.lang.String;

final class HubsJsonCommandModel	// class@0008c1 from classes.dex
{
    private String a;
    private au2 b;
    private static final String c = "name";
    private static final String d = "data";

    private void HubsJsonCommandModel(){
       super();
    }
    public tt2 a(){
       HubsJsonCommandModel ta;
       if ((ta = this.a) != null) {
       }else {
          ta = "";
       }
       return new HubsJsonCommandModel$JacksonCompatibilityHubsCommandModel(ta, a23.W(this.b));
    }
}
