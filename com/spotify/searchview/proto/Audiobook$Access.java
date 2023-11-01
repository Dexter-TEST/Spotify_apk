package com.spotify.searchview.proto.Audiobook$Access;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.searchview.proto.c;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Audiobook$Access extends c implements u74	// class@000c06 from classes.dex
{
    private boolean bookIsUnlockedByUser_;
    private String signifierText_;
    public static final int BOOK_IS_UNLOCKED_BY_USER_FIELD_NUMBER = 2;
    private static final Audiobook$Access DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int SIGNIFIER_TEXT_FIELD_NUMBER;

    static {
       Audiobook$Access uAccess = new Audiobook$Access();
       Audiobook$Access.DEFAULT_INSTANCE = uAccess;
       c.registerDefaultInstance(Audiobook$Access.class, uAccess);
    }
    private void Audiobook$Access(){
       super();
       this.signifierText_ = "";
    }
    public static Audiobook$Access e(){
       return Audiobook$Access.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Audiobook$Access.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[]{"signifierText_","bookIsUnlockedByUser_"};
             return c.newMessageInfo(Audiobook$Access.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x07", objArray);
           case 3:
             return new Audiobook$Access();
           case 4:
             return new c();
           case 5:
             return Audiobook$Access.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Audiobook$Access.PARSER) == null) {
                _monitor_enter(Audiobook$Access.class);
                if ((pARSER = Audiobook$Access.PARSER) == null) {
                   pARSER = new ii2(Audiobook$Access.DEFAULT_INSTANCE);
                   Audiobook$Access.PARSER = pARSER;
                }
                _monitor_exit(Audiobook$Access.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
