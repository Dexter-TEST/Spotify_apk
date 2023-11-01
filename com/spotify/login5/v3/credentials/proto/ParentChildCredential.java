package com.spotify.login5.v3.credentials.proto.ParentChildCredential;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.h40;
import p.x30;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class ParentChildCredential extends c implements u74	// class@0009d6 from classes.dex
{
    private String childId_;
    private StoredCredential parentStoredCredential_;
    public static final int CHILD_ID_FIELD_NUMBER = 1;
    private static final ParentChildCredential DEFAULT_INSTANCE;
    public static final int PARENT_STORED_CREDENTIAL_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       ParentChildCredential parentChildC = new ParentChildCredential();
       ParentChildCredential.DEFAULT_INSTANCE = parentChildC;
       c.registerDefaultInstance(ParentChildCredential.class, parentChildC);
    }
    private void ParentChildCredential(){
       super();
       this.childId_ = "";
    }
    public static ParentChildCredential e(){
       return ParentChildCredential.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return ParentChildCredential.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       p2 = null;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return p2;
           case 2:
             Object[] objArray = new Object[]{"childId_","parentStoredCredential_"};
             return c.newMessageInfo(ParentChildCredential.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\t", objArray);
           case 3:
             return new ParentChildCredential();
           case 4:
             return new h40(p2);
           case 5:
             return ParentChildCredential.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = ParentChildCredential.PARSER) == null) {
                _monitor_enter(ParentChildCredential.class);
                if ((pARSER = ParentChildCredential.PARSER) == null) {
                   pARSER = new ii2(ParentChildCredential.DEFAULT_INSTANCE);
                   ParentChildCredential.PARSER = pARSER;
                }
                _monitor_exit(ParentChildCredential.class);
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
