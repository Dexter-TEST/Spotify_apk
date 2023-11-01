package com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob$BlobCase;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class EsAuthBlob$AuthBlob$BlobCase extends Enum	// class@000617 from classes.dex
{
    private final int value;
    private static final EsAuthBlob$AuthBlob$BlobCase[] $VALUES;
    public static final EsAuthBlob$AuthBlob$BlobCase BLOB_NOT_SET;
    public static final EsAuthBlob$AuthBlob$BlobCase STOREDCREDENTIALS;

    static {
       EsAuthBlob$AuthBlob$BlobCase uAuthBlob$Bl = new EsAuthBlob$AuthBlob$BlobCase("STOREDCREDENTIALS", 0, 1);
       EsAuthBlob$AuthBlob$BlobCase.STOREDCREDENTIALS = uAuthBlob$Bl;
       EsAuthBlob$AuthBlob$BlobCase uAuthBlob$Bl1 = new EsAuthBlob$AuthBlob$BlobCase("BLOB_NOT_SET", 1, 0);
       EsAuthBlob$AuthBlob$BlobCase.BLOB_NOT_SET = uAuthBlob$Bl1;
       EsAuthBlob$AuthBlob$BlobCase[] uAuthBlob$Bl2 = new EsAuthBlob$AuthBlob$BlobCase[]{uAuthBlob$Bl,uAuthBlob$Bl1};
       EsAuthBlob$AuthBlob$BlobCase.$VALUES = uAuthBlob$Bl2;
    }
    private void EsAuthBlob$AuthBlob$BlobCase(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static EsAuthBlob$AuthBlob$BlobCase forNumber(int p0){
       if (!p0) {
          return EsAuthBlob$AuthBlob$BlobCase.BLOB_NOT_SET;
       }
       if (p0 != 1) {
          return null;
       }
       return EsAuthBlob$AuthBlob$BlobCase.STOREDCREDENTIALS;
    }
    public static EsAuthBlob$AuthBlob$BlobCase valueOf(int p0){
       return EsAuthBlob$AuthBlob$BlobCase.forNumber(p0);
    }
    public static EsAuthBlob$AuthBlob$BlobCase valueOf(String p0){
       return Enum.valueOf(EsAuthBlob$AuthBlob$BlobCase.class, p0);
    }
    public static EsAuthBlob$AuthBlob$BlobCase[] values(){
       return EsAuthBlob$AuthBlob$BlobCase.$VALUES.clone();
    }
    public int getNumber(){
       return this.value;
    }
}
