package com.spotify.login.signupapi.services.model.MarketingMessagesOption;
import java.lang.Enum;
import java.lang.String;
import com.spotify.login.signupapi.services.model.MarketingMessagesOption$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Class;
import java.lang.Object;

public final class MarketingMessagesOption extends Enum	// class@0009b8 from classes.dex
{
    private final String value;
    private static final MarketingMessagesOption[] $VALUES;
    public static final MarketingMessagesOption$Companion Companion;
    public static final MarketingMessagesOption NONE;
    public static final MarketingMessagesOption OPT_IN;
    public static final MarketingMessagesOption OPT_OUT;

    private static final MarketingMessagesOption[] $values(){
       MarketingMessagesOption[] marketingMes = new MarketingMessagesOption[]{MarketingMessagesOption.OPT_IN,MarketingMessagesOption.OPT_OUT,MarketingMessagesOption.NONE};
       return marketingMes;
    }
    static {
       MarketingMessagesOption.OPT_IN = new MarketingMessagesOption("OPT_IN", 0, "opt_in");
       MarketingMessagesOption.OPT_OUT = new MarketingMessagesOption("OPT_OUT", 1, "opt_out");
       MarketingMessagesOption.NONE = new MarketingMessagesOption("NONE", 2, "none");
       MarketingMessagesOption.$VALUES = MarketingMessagesOption.$values();
       MarketingMessagesOption.Companion = new MarketingMessagesOption$Companion(null);
    }
    private void MarketingMessagesOption(String p0,int p1,String p2){
       this.value = p2;
    }
    public static MarketingMessagesOption valueOf(String p0){
       return Enum.valueOf(MarketingMessagesOption.class, p0);
    }
    public static MarketingMessagesOption[] values(){
       return MarketingMessagesOption.$VALUES.clone();
    }
    public final String getValue(){
       return this.value;
    }
}
