package com.spotify.messaging.criticalmessaging.criticalmessagingsdk.mobius.models.StoreError;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class StoreError extends Enum	// class@000a16 from classes.dex
{
    private static final StoreError[] $VALUES;
    public static final StoreError DATA_CORRUPTED;
    public static final StoreError DATA_NOT_FOUND;

    private static final StoreError[] $values(){
       StoreError[] storeErrorAr = new StoreError[]{StoreError.DATA_CORRUPTED,StoreError.DATA_NOT_FOUND};
       return storeErrorAr;
    }
    static {
       StoreError.DATA_CORRUPTED = new StoreError("DATA_CORRUPTED", 0);
       StoreError.DATA_NOT_FOUND = new StoreError("DATA_NOT_FOUND", 1);
       StoreError.$VALUES = StoreError.$values();
    }
    private void StoreError(String p0,int p1){
       super(p0, p1);
    }
    public static StoreError valueOf(String p0){
       return Enum.valueOf(StoreError.class, p0);
    }
    public static StoreError[] values(){
       return StoreError.$VALUES.clone();
    }
}
