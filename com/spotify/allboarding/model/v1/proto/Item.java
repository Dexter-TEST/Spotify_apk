package com.spotify.allboarding.model.v1.proto.Item;
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
import p.dk1;
import com.spotify.allboarding.model.v1.proto.SquircleArtist;
import com.spotify.allboarding.model.v1.proto.SquircleArtistMore;
import com.spotify.allboarding.model.v1.proto.Banner;
import com.spotify.allboarding.model.v1.proto.Pill;
import com.spotify.allboarding.model.v1.proto.SquircleShow;
import com.spotify.allboarding.model.v1.proto.SquircleShowMore;
import com.spotify.allboarding.model.v1.proto.TitleBox;
import com.spotify.allboarding.model.v1.proto.PillMore;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Item extends c implements u74	// class@000516 from classes.dex
{
    private int itemCase_;
    private Object item_;
    public static final int BANNER_FIELD_NUMBER = 3;
    private static final Item DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int PILLMORE_FIELD_NUMBER;
    public static final int PILL_FIELD_NUMBER;
    public static final int SQUIRCLEARTISTMORE_FIELD_NUMBER;
    public static final int SQUIRCLEARTIST_FIELD_NUMBER;
    public static final int SQUIRCLESHOWMORE_FIELD_NUMBER;
    public static final int SQUIRCLESHOW_FIELD_NUMBER;
    public static final int TITLEBOX_FIELD_NUMBER;

    static {
       Item item = new Item();
       Item.DEFAULT_INSTANCE = item;
       c.registerDefaultInstance(Item.class, item);
    }
    private void Item(){
       super();
       this.itemCase_ = 0;
    }
    public static Item e(){
       return Item.DEFAULT_INSTANCE;
    }
    public static Item g(){
       return Item.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Item.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[10];
             objArray[0] = "item_";
             objArray[b] = "itemCase_";
             objArray[2] = SquircleArtist.class;
             objArray[3] = SquircleArtistMore.class;
             objArray[4] = Banner.class;
             objArray[5] = Pill.class;
             objArray[6] = SquircleShow.class;
             objArray[7] = SquircleShowMore.class;
             objArray[8] = TitleBox.class;
             objArray[9] = PillMore.class;
             return c.newMessageInfo(Item.DEFAULT_INSTANCE, "\xff\x02\xff\x02\b\x01\xff\x02\xff\x02\x01\b\b\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01<\xff\x02\xff\x02\x02<\xff\x02\xff\x02\x03<\xff\x02\xff\x02\x04<\xff\x02\xff\x02\x05<\xff\x02\xff\x02\x06<\xff\x02\xff\x02\x07<\xff\x02\xff\x02\b<\xff\x02\xff\x02", objArray);
           case 3:
             return new Item();
           case 4:
             return new cl1(p2);
           case 5:
             return Item.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Item.PARSER) == null) {
                _monitor_enter(Item.class);
                if ((pARSER = Item.PARSER) == null) {
                   pARSER = new ii2(Item.DEFAULT_INSTANCE);
                   Item.PARSER = pARSER;
                }
                _monitor_exit(Item.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final Banner f(){
       if (this.itemCase_ == 3) {
          return this.item_;
       }
       return Banner.f();
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final int h(){
       int i;
       switch (this.itemCase_){
           case 0:
             i = 9;
             break;
           case 1:
             i = 1;
             break;
           case 2:
             i = 2;
             break;
           case 3:
             i = 3;
             break;
           case 4:
             i = 4;
             break;
           case 5:
             i = 5;
             break;
           case 6:
             i = 6;
             break;
           case 7:
             i = 7;
             break;
           case 8:
             i = 8;
             break;
           default:
             i = 0;
       }
       return i;
    }
    public final Pill i(){
       if (this.itemCase_ == 4) {
          return this.item_;
       }
       return Pill.g();
    }
    public final SquircleArtist j(){
       if (this.itemCase_ == 1) {
          return this.item_;
       }
       return SquircleArtist.f();
    }
    public final SquircleArtistMore k(){
       if (this.itemCase_ == 2) {
          return this.item_;
       }
       return SquircleArtistMore.g();
    }
    public final SquircleShow l(){
       if (this.itemCase_ == 5) {
          return this.item_;
       }
       return SquircleShow.f();
    }
    public final SquircleShowMore m(){
       if (this.itemCase_ == 6) {
          return this.item_;
       }
       return SquircleShowMore.g();
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
