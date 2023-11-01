package com.spotify.eventsender.FragmentsContainer;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import com.spotify.eventsender.Fragment;
import java.lang.Object;
import p.f2;
import java.util.List;
import p.ab2;
import java.lang.Iterable;
import com.google.protobuf.a;
import p.kf2;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;

public final class FragmentsContainer extends c implements u74	// class@0008a0 from classes.dex
{
    private bc3 fragment_;
    private static final FragmentsContainer DEFAULT_INSTANCE;
    public static final int FRAGMENT_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       FragmentsContainer uFragmentsCo = new FragmentsContainer();
       FragmentsContainer.DEFAULT_INSTANCE = uFragmentsCo;
       c.registerDefaultInstance(FragmentsContainer.class, uFragmentsCo);
    }
    private void FragmentsContainer(){
       super();
       this.fragment_ = c.emptyProtobufList();
    }
    public static FragmentsContainer e(){
       return FragmentsContainer.DEFAULT_INSTANCE;
    }
    public static void f(FragmentsContainer p0,Fragment p1){
       p0.getClass();
       p1.getClass();
       FragmentsContainer fragment_ = p0.fragment_;
       if (fragment_.a == null) {
          p0.fragment_ = c.mutableCopy(fragment_);
       }
       p0.fragment_.add(p1);
       return;
    }
    public static void g(FragmentsContainer p0,ab2 p1){
       FragmentsContainer fragment_ = p0.fragment_;
       if (fragment_.a == null) {
          p0.fragment_ = c.mutableCopy(fragment_);
       }
       a.addAll(p1, p0.fragment_);
       return;
    }
    public static FragmentsContainer h(){
       return FragmentsContainer.DEFAULT_INSTANCE;
    }
    public static kf2 j(){
       return FragmentsContainer.DEFAULT_INSTANCE.createBuilder();
    }
    public static FragmentsContainer k(byte[] p0){
       return c.parseFrom(FragmentsContainer.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return FragmentsContainer.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"fragment_",Fragment.class};
             return c.newMessageInfo(FragmentsContainer.DEFAULT_INSTANCE, "\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b", objArray);
           case 3:
             return new FragmentsContainer();
           case 4:
             return new kf2();
           case 5:
             return FragmentsContainer.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = FragmentsContainer.PARSER) == null) {
                _monitor_enter(FragmentsContainer.class);
                if ((pARSER = FragmentsContainer.PARSER) == null) {
                   pARSER = new ii2(FragmentsContainer.DEFAULT_INSTANCE);
                   FragmentsContainer.PARSER = pARSER;
                }
                _monitor_exit(FragmentsContainer.class);
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
    public final bc3 i(){
       return this.fragment_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
