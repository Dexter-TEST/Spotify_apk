package com.spotify.localfiles.proto.LocalFile;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import com.spotify.localfiles.proto.LocalFile$Metadata;
import com.spotify.localfiles.proto.a;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class LocalFile extends c implements u74	// class@000985 from classes.dex
{
    private LocalFile$Metadata metadata_;
    private String path_;
    private static final LocalFile DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PATH_FIELD_NUMBER;

    static {
       LocalFile localFile = new LocalFile();
       LocalFile.DEFAULT_INSTANCE = localFile;
       c.registerDefaultInstance(LocalFile.class, localFile);
    }
    private void LocalFile(){
       super();
       this.path_ = "";
    }
    public static LocalFile e(){
       return LocalFile.DEFAULT_INSTANCE;
    }
    public static void f(LocalFile p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.path_ = p1;
    }
    public static void g(LocalFile p0,LocalFile$Metadata p1){
       p0.getClass();
       p1.getClass();
       p0.metadata_ = p1;
    }
    public static a h(){
       return LocalFile.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return LocalFile.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"path_","metadata_"};
             return c.newMessageInfo(LocalFile.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\t", objArray);
           case 3:
             return new LocalFile();
           case 4:
             return new a();
           case 5:
             return LocalFile.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = LocalFile.PARSER) == null) {
                _monitor_enter(LocalFile.class);
                if ((pARSER = LocalFile.PARSER) == null) {
                   pARSER = new ii2(LocalFile.DEFAULT_INSTANCE);
                   LocalFile.PARSER = pARSER;
                }
                _monitor_exit(LocalFile.class);
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
