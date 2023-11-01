package com.spotify.login5.v3.credentials.proto.Password;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.i80;
import java.lang.String;
import java.lang.Object;
import p.w75;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class Password extends c implements u74	// class@0009d7 from classes.dex
{
    private String id_;
    private i80 padding_;
    private String password_;
    private static final Password DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER;
    public static final int PADDING_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PASSWORD_FIELD_NUMBER;

    static {
       Password password = new Password();
       Password.DEFAULT_INSTANCE = password;
       c.registerDefaultInstance(Password.class, password);
    }
    private void Password(){
       super();
       this.id_ = "";
       this.password_ = "";
       this.padding_ = i80.b;
    }
    public static Password e(){
       return Password.DEFAULT_INSTANCE;
    }
    public static void f(Password p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.id_ = p1;
    }
    public static void g(Password p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.password_ = p1;
    }
    public static w75 h(){
       return Password.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Password.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"id_","password_","padding_"};
             return c.newMessageInfo(Password.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\n", objArray);
           case 3:
             return new Password();
           case 4:
             return new w75();
           case 5:
             return Password.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Password.PARSER) == null) {
                _monitor_enter(Password.class);
                if ((pARSER = Password.PARSER) == null) {
                   pARSER = new ii2(Password.DEFAULT_INSTANCE);
                   Password.PARSER = pARSER;
                }
                _monitor_exit(Password.class);
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
