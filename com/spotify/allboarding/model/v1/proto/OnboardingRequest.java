package com.spotify.allboarding.model.v1.proto.OnboardingRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import java.util.ArrayList;
import p.f2;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.a;
import p.q25;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.allboarding.model.v1.proto.SelectedItem;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;

public final class OnboardingRequest extends c implements u74	// class@00051a from classes.dex
{
    private bc3 selectedItems_;
    private static final OnboardingRequest DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int SELECTED_ITEMS_FIELD_NUMBER;

    static {
       OnboardingRequest onboardingRe = new OnboardingRequest();
       OnboardingRequest.DEFAULT_INSTANCE = onboardingRe;
       c.registerDefaultInstance(OnboardingRequest.class, onboardingRe);
    }
    private void OnboardingRequest(){
       super();
       this.selectedItems_ = c.emptyProtobufList();
    }
    public static OnboardingRequest e(){
       return OnboardingRequest.DEFAULT_INSTANCE;
    }
    public static void f(OnboardingRequest p0,ArrayList p1){
       OnboardingRequest selectedItem = p0.selectedItems_;
       if (selectedItem.a == null) {
          p0.selectedItems_ = c.mutableCopy(selectedItem);
       }
       a.addAll(p1, p0.selectedItems_);
       return;
    }
    public static q25 g(){
       return OnboardingRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return OnboardingRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"selectedItems_",SelectedItem.class};
             return c.newMessageInfo(OnboardingRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b", objArray);
           case 3:
             return new OnboardingRequest();
           case 4:
             return new q25();
           case 5:
             return OnboardingRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = OnboardingRequest.PARSER) == null) {
                _monitor_enter(OnboardingRequest.class);
                if ((pARSER = OnboardingRequest.PARSER) == null) {
                   pARSER = new ii2(OnboardingRequest.DEFAULT_INSTANCE);
                   OnboardingRequest.PARSER = pARSER;
                }
                _monitor_exit(OnboardingRequest.class);
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
