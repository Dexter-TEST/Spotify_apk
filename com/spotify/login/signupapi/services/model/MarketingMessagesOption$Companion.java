package com.spotify.login.signupapi.services.model.MarketingMessagesOption$Companion;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.String;
import com.spotify.login.signupapi.services.model.MarketingMessagesOption;
import p.co5;
import p.xe7;
import java.util.LinkedHashMap;
import java.util.Map;

public final class MarketingMessagesOption$Companion	// class@0009b7 from classes.dex
{

    private void MarketingMessagesOption$Companion(){
       super();
    }
    public void MarketingMessagesOption$Companion(DefaultConstructorMarker p0){
       super();
    }
    public final MarketingMessagesOption fromString(String p0){
       int i;
       MarketingMessagesOption marketingMes1;
       co5.o(p0, "code");
       MarketingMessagesOption[] marketingMes = MarketingMessagesOption.values();
       if ((i = xe7.F(marketingMes.length)) < 16) {
          i = 16;
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap(i);
       i = marketingMes.length;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          object oobject = marketingMes[i1];
          linkedHashMa.put(oobject.getValue(), oobject);
       }
       if ((marketingMes1 = linkedHashMa.get(p0)) == null) {
          marketingMes1 = MarketingMessagesOption.OPT_IN;
       }
       return marketingMes1;
    }
}
