package com.spotify.webapi.service.models.ShowSimple$MediaType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ShowSimple$MediaType extends Enum	// class@000cba from classes.dex
{
    private static final ShowSimple$MediaType[] $VALUES;
    public static final ShowSimple$MediaType AUDIO;
    public static final ShowSimple$MediaType MIXED;
    public static final ShowSimple$MediaType VIDEO;

    private static final ShowSimple$MediaType[] $values(){
       ShowSimple$MediaType[] mediaTypeArr = new ShowSimple$MediaType[]{ShowSimple$MediaType.AUDIO,ShowSimple$MediaType.VIDEO,ShowSimple$MediaType.MIXED};
       return mediaTypeArr;
    }
    static {
       ShowSimple$MediaType.AUDIO = new ShowSimple$MediaType("AUDIO", 0);
       ShowSimple$MediaType.VIDEO = new ShowSimple$MediaType("VIDEO", 1);
       ShowSimple$MediaType.MIXED = new ShowSimple$MediaType("MIXED", 2);
       ShowSimple$MediaType.$VALUES = ShowSimple$MediaType.$values();
    }
    private void ShowSimple$MediaType(String p0,int p1){
       super(p0, p1);
    }
    public static ShowSimple$MediaType valueOf(String p0){
       return Enum.valueOf(ShowSimple$MediaType.class, p0);
    }
    public static ShowSimple$MediaType[] values(){
       return ShowSimple$MediaType.$VALUES.clone();
    }
}
