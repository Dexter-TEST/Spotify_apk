package com.spotify.messaging.criticalmessaging.criticalmessagingview.models.ViewType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ViewType extends Enum	// class@000a23 from classes.dex
{
    private static final ViewType[] $VALUES;
    public static final ViewType AUDIOBOOK_BOTTOM_SHEET;
    public static final ViewType BANNER;
    public static final ViewType BOTTOM_SHEET;
    public static final ViewType HINT;
    public static final ViewType INLINE_CARD;
    public static final ViewType WEB_VIEW;

    private static final ViewType[] $values(){
       ViewType[] viewTypeArra = new ViewType[]{ViewType.AUDIOBOOK_BOTTOM_SHEET,ViewType.BOTTOM_SHEET,ViewType.HINT,ViewType.INLINE_CARD,ViewType.BANNER,ViewType.WEB_VIEW};
       return viewTypeArra;
    }
    static {
       ViewType.AUDIOBOOK_BOTTOM_SHEET = new ViewType("AUDIOBOOK_BOTTOM_SHEET", 0);
       ViewType.BOTTOM_SHEET = new ViewType("BOTTOM_SHEET", 1);
       ViewType.HINT = new ViewType("HINT", 2);
       ViewType.INLINE_CARD = new ViewType("INLINE_CARD", 3);
       ViewType.BANNER = new ViewType("BANNER", 4);
       ViewType.WEB_VIEW = new ViewType("WEB_VIEW", 5);
       ViewType.$VALUES = ViewType.$values();
    }
    private void ViewType(String p0,int p1){
       super(p0, p1);
    }
    public static ViewType valueOf(String p0){
       return Enum.valueOf(ViewType.class, p0);
    }
    public static ViewType[] values(){
       return ViewType.$VALUES.clone();
    }
}
