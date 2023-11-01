package com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.FormatType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class FormatType extends Enum	// class@000a29 from classes.dex
{
    private static final FormatType[] $VALUES;
    public static final FormatType BANNERS;
    public static final FormatType CARDS;
    public static final FormatType FULLSCREEN;
    public static final FormatType NOTES;

    private static final FormatType[] $values(){
       FormatType[] uFormatTypeA = new FormatType[]{FormatType.NOTES,FormatType.BANNERS,FormatType.CARDS,FormatType.FULLSCREEN};
       return uFormatTypeA;
    }
    static {
       FormatType.NOTES = new FormatType("NOTES", 0);
       FormatType.BANNERS = new FormatType("BANNERS", 1);
       FormatType.CARDS = new FormatType("CARDS", 2);
       FormatType.FULLSCREEN = new FormatType("FULLSCREEN", 3);
       FormatType.$VALUES = FormatType.$values();
    }
    private void FormatType(String p0,int p1){
       super(p0, p1);
    }
    public static FormatType valueOf(String p0){
       return Enum.valueOf(FormatType.class, p0);
    }
    public static FormatType[] values(){
       return FormatType.$VALUES.clone();
    }
}
