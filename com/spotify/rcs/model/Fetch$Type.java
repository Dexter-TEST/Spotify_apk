package com.spotify.rcs.model.Fetch$Type;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import com.spotify.rcs.model.Fetch$Type$1;
import p.ub3;
import p.vb3;
import com.spotify.rcs.model.Fetch$Type$TypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class Fetch$Type extends Enum implements tb3	// class@000bb5 from classes.dex
{
    private final int value;
    private static final Fetch$Type[] $VALUES;
    public static final Fetch$Type BACKGROUND_SYNC;
    public static final int BACKGROUND_SYNC_VALUE;
    public static final Fetch$Type BLOCKING;
    public static final int BLOCKING_VALUE;
    public static final Fetch$Type DELAYED;
    public static final int DELAYED_VALUE;
    public static final Fetch$Type UNKNOWN;
    public static final int UNKNOWN_VALUE;
    public static final Fetch$Type UNRECOGNIZED;
    private static final ub3 internalValueMap;

    static {
       Fetch$Type type = new Fetch$Type("UNKNOWN", 0, 0);
       Fetch$Type.UNKNOWN = type;
       Fetch$Type type1 = new Fetch$Type("BACKGROUND_SYNC", 1, 1);
       Fetch$Type.BACKGROUND_SYNC = type1;
       Fetch$Type type2 = new Fetch$Type("BLOCKING", 2, 2);
       Fetch$Type.BLOCKING = type2;
       Fetch$Type type3 = new Fetch$Type("DELAYED", 3, 3);
       Fetch$Type.DELAYED = type3;
       Fetch$Type type4 = new Fetch$Type("UNRECOGNIZED", 4, -1);
       Fetch$Type.UNRECOGNIZED = type4;
       Fetch$Type[] typeArray = new Fetch$Type[]{type,type1,type2,type3,type4};
       Fetch$Type.$VALUES = typeArray;
       Fetch$Type.internalValueMap = new Fetch$Type$1();
    }
    private void Fetch$Type(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static Fetch$Type forNumber(int p0){
       if (!p0) {
          return Fetch$Type.UNKNOWN;
       }
       if (p0 == 1) {
          return Fetch$Type.BACKGROUND_SYNC;
       }
       if (p0 == 2) {
          return Fetch$Type.BLOCKING;
       }
       if (p0 != 3) {
          return null;
       }
       return Fetch$Type.DELAYED;
    }
    public static ub3 internalGetValueMap(){
       return Fetch$Type.internalValueMap;
    }
    public static vb3 internalGetVerifier(){
       return Fetch$Type$TypeVerifier.INSTANCE;
    }
    public static Fetch$Type valueOf(int p0){
       return Fetch$Type.forNumber(p0);
    }
    public static Fetch$Type valueOf(String p0){
       return Enum.valueOf(Fetch$Type.class, p0);
    }
    public static Fetch$Type[] values(){
       return Fetch$Type.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != Fetch$Type.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
