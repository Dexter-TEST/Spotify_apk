package com.spotify.messaging.criticalmessaging.criticalmessagingsdk.display.models.CreativeType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class CreativeType extends Enum	// class@000a13 from classes.dex
{
    private static final CreativeType[] $VALUES;
    public static final CreativeType AUDIOBOOK_BOTTOM_SHEET;
    public static final CreativeType BANNER;
    public static final CreativeType BOTTOM_SHEET;
    public static final CreativeType HINT;
    public static final CreativeType INLINE_CARD;
    public static final CreativeType WEB_VIEW;

    private static final CreativeType[] $values(){
       CreativeType[] uCreativeTyp = new CreativeType[]{CreativeType.AUDIOBOOK_BOTTOM_SHEET,CreativeType.BOTTOM_SHEET,CreativeType.HINT,CreativeType.INLINE_CARD,CreativeType.BANNER,CreativeType.WEB_VIEW};
       return uCreativeTyp;
    }
    static {
       CreativeType.AUDIOBOOK_BOTTOM_SHEET = new CreativeType("AUDIOBOOK_BOTTOM_SHEET", 0);
       CreativeType.BOTTOM_SHEET = new CreativeType("BOTTOM_SHEET", 1);
       CreativeType.HINT = new CreativeType("HINT", 2);
       CreativeType.INLINE_CARD = new CreativeType("INLINE_CARD", 3);
       CreativeType.BANNER = new CreativeType("BANNER", 4);
       CreativeType.WEB_VIEW = new CreativeType("WEB_VIEW", 5);
       CreativeType.$VALUES = CreativeType.$values();
    }
    private void CreativeType(String p0,int p1){
       super(p0, p1);
    }
    public static CreativeType valueOf(String p0){
       return Enum.valueOf(CreativeType.class, p0);
    }
    public static CreativeType[] values(){
       return CreativeType.$VALUES.clone();
    }
}
