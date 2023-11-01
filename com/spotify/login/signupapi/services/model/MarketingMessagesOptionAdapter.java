package com.spotify.login.signupapi.services.model.MarketingMessagesOptionAdapter;
import java.lang.Object;
import java.lang.String;
import com.spotify.login.signupapi.services.model.MarketingMessagesOption;
import p.co5;
import com.spotify.login.signupapi.services.model.MarketingMessagesOption$Companion;

public final class MarketingMessagesOptionAdapter	// class@0009b9 from classes.dex
{

    public void MarketingMessagesOptionAdapter(){
       super();
    }
    public final MarketingMessagesOption fromJson(String p0){
       co5.o(p0, "value");
       return MarketingMessagesOption.Companion.fromString(p0);
    }
    public final String toJson(MarketingMessagesOption p0){
       co5.o(p0, "type");
       return p0.getValue();
    }
}
