package com.spotify.searchview.proto.Genre;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.fq1;
import p.op1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Genre extends c implements u74	// class@000c0c from classes.dex
{
    private static final Genre DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       Genre genre = new Genre();
       Genre.DEFAULT_INSTANCE = genre;
       c.registerDefaultInstance(Genre.class, genre);
    }
    private void Genre(){
       super();
    }
    public static Genre e(){
       return Genre.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Genre.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       p1 = null;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(1);
           case 1:
             return p1;
           case 2:
             return c.newMessageInfo(Genre.DEFAULT_INSTANCE, "\xff\x02\xff\x02\xff\x02\xff\x02", p1);
           case 3:
             return new Genre();
           case 4:
             return new fq1(p1);
           case 5:
             return Genre.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Genre.PARSER) == null) {
                _monitor_enter(Genre.class);
                if ((pARSER = Genre.PARSER) == null) {
                   pARSER = new ii2(Genre.DEFAULT_INSTANCE);
                   Genre.PARSER = pARSER;
                }
                _monitor_exit(Genre.class);
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
