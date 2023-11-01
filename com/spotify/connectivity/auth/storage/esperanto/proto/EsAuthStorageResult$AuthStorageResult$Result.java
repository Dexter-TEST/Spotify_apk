package com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult$AuthStorageResult$Result;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult$AuthStorageResult$Result$1;
import p.ub3;
import p.vb3;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult$AuthStorageResult$Result$ResultVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class EsAuthStorageResult$AuthStorageResult$Result extends Enum implements tb3	// class@000653 from classes.dex
{
    private final int value;
    private static final EsAuthStorageResult$AuthStorageResult$Result[] $VALUES;
    public static final EsAuthStorageResult$AuthStorageResult$Result UNRECOGNIZED;
    private static final ub3 internalValueMap;
    public static final EsAuthStorageResult$AuthStorageResult$Result success;
    public static final int success_VALUE;
    public static final EsAuthStorageResult$AuthStorageResult$Result userAlreadyExists;
    public static final int userAlreadyExists_VALUE;
    public static final EsAuthStorageResult$AuthStorageResult$Result userNotFound;
    public static final int userNotFound_VALUE;

    static {
       EsAuthStorageResult$AuthStorageResult$Result uAuthStorage = new EsAuthStorageResult$AuthStorageResult$Result("success", 0, 0);
       EsAuthStorageResult$AuthStorageResult$Result.success = uAuthStorage;
       EsAuthStorageResult$AuthStorageResult$Result uAuthStorage1 = new EsAuthStorageResult$AuthStorageResult$Result("userNotFound", 1, 1);
       EsAuthStorageResult$AuthStorageResult$Result.userNotFound = uAuthStorage1;
       EsAuthStorageResult$AuthStorageResult$Result uAuthStorage2 = new EsAuthStorageResult$AuthStorageResult$Result("userAlreadyExists", 2, 2);
       EsAuthStorageResult$AuthStorageResult$Result.userAlreadyExists = uAuthStorage2;
       EsAuthStorageResult$AuthStorageResult$Result uAuthStorage3 = new EsAuthStorageResult$AuthStorageResult$Result("UNRECOGNIZED", 3, -1);
       EsAuthStorageResult$AuthStorageResult$Result.UNRECOGNIZED = uAuthStorage3;
       EsAuthStorageResult$AuthStorageResult$Result[] uAuthStorage4 = new EsAuthStorageResult$AuthStorageResult$Result[]{uAuthStorage,uAuthStorage1,uAuthStorage2,uAuthStorage3};
       EsAuthStorageResult$AuthStorageResult$Result.$VALUES = uAuthStorage4;
       EsAuthStorageResult$AuthStorageResult$Result.internalValueMap = new EsAuthStorageResult$AuthStorageResult$Result$1();
    }
    private void EsAuthStorageResult$AuthStorageResult$Result(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static EsAuthStorageResult$AuthStorageResult$Result forNumber(int p0){
       if (!p0) {
          return EsAuthStorageResult$AuthStorageResult$Result.success;
       }
       if (p0 == 1) {
          return EsAuthStorageResult$AuthStorageResult$Result.userNotFound;
       }
       if (p0 != 2) {
          return null;
       }
       return EsAuthStorageResult$AuthStorageResult$Result.userAlreadyExists;
    }
    public static ub3 internalGetValueMap(){
       return EsAuthStorageResult$AuthStorageResult$Result.internalValueMap;
    }
    public static vb3 internalGetVerifier(){
       return EsAuthStorageResult$AuthStorageResult$Result$ResultVerifier.INSTANCE;
    }
    public static EsAuthStorageResult$AuthStorageResult$Result valueOf(int p0){
       return EsAuthStorageResult$AuthStorageResult$Result.forNumber(p0);
    }
    public static EsAuthStorageResult$AuthStorageResult$Result valueOf(String p0){
       return Enum.valueOf(EsAuthStorageResult$AuthStorageResult$Result.class, p0);
    }
    public static EsAuthStorageResult$AuthStorageResult$Result[] values(){
       return EsAuthStorageResult$AuthStorageResult$Result.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != EsAuthStorageResult$AuthStorageResult$Result.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
