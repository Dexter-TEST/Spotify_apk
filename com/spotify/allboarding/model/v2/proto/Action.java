package com.spotify.allboarding.model.v2.proto.Action;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.cl1;
import p.tk1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.allboarding.model.v1.proto.NullableString;
import p.x4;
import p.r74;
import com.google.protobuf.b;

public final class Action extends c implements u74	// class@000526 from classes.dex
{
    private NullableString link_;
    private int type_;
    private static final Action DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int TYPE_FIELD_NUMBER;

    static {
       Action uAction = new Action();
       Action.DEFAULT_INSTANCE = uAction;
       c.registerDefaultInstance(Action.class, uAction);
    }
    private void Action(){
       super();
    }
    public static Action e(){
       return Action.DEFAULT_INSTANCE;
    }
    public static Action f(){
       return Action.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Action.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"type_","link_"};
             return c.newMessageInfo(Action.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\x02\t", objArray);
           case 3:
             return new Action();
           case 4:
             return new cl1(p2);
           case 5:
             return Action.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Action.PARSER) == null) {
                _monitor_enter(Action.class);
                if ((pARSER = Action.PARSER) == null) {
                   pARSER = new ii2(Action.DEFAULT_INSTANCE);
                   Action.PARSER = pARSER;
                }
                _monitor_exit(Action.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final NullableString g(){
       Action tlink_;
       if ((tlink_ = this.link_) == null) {
          tlink_ = NullableString.f();
       }
       return tlink_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final x4 h(){
       Action ttype_;
       x4 ox4;
       if ((ttype_ = this.type_) != null) {
          if (ttype_ != 1) {
             if (ttype_ != 2) {
                ox4 = (ttype_ != 3)? null: x4.v;
             }else {
                ox4 = x4.t;
             }
          }else {
             ox4 = x4.c;
          }
       }else {
          ox4 = x4.b;
       }
       if (ox4 == null) {
          ox4 = x4.w;
       }
       return ox4;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
