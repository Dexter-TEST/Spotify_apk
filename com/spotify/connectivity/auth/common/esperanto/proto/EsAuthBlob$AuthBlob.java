package com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlobOrBuilder;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.connectivity.auth.common.esperanto.proto.EsEncryptedStoredCredentials$EncryptedStoredCredentials;
import com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials$UnencryptedStoredCredentials;
import java.lang.Object;
import com.spotify.connectivity.auth.common.esperanto.proto.EsEncryptedStoredCredentials$EncryptedStoredCredentials$Builder;
import com.google.protobuf.b;
import com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials$UnencryptedStoredCredentials$Builder;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob$Builder;
import java.io.InputStream;
import p.yx1;
import java.nio.ByteBuffer;
import p.i80;
import p.sh0;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob$BlobCase;

public final class EsAuthBlob$AuthBlob extends c implements EsAuthBlob$AuthBlobOrBuilder	// class@000619 from classes.dex
{
    private int blobCase_;
    private Object blob_;
    private EsUnencryptedStoredCredentials$UnencryptedStoredCredentials unencryptedStoredCredentials_;
    private static final EsAuthBlob$AuthBlob DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int STOREDCREDENTIALS_FIELD_NUMBER;
    public static final int UNENCRYPTEDSTOREDCREDENTIALS_FIELD_NUMBER;

    static {
       EsAuthBlob$AuthBlob uAuthBlob = new EsAuthBlob$AuthBlob();
       EsAuthBlob$AuthBlob.DEFAULT_INSTANCE = uAuthBlob;
       c.registerDefaultInstance(EsAuthBlob$AuthBlob.class, uAuthBlob);
    }
    private void EsAuthBlob$AuthBlob(){
       super();
       this.blobCase_ = 0;
    }
    private void clearBlob(){
       this.blobCase_ = 0;
       this.blob_ = null;
    }
    private void clearStoredCredentials(){
       if (this.blobCase_ == 1) {
          this.blobCase_ = 0;
          this.blob_ = null;
       }
       return;
    }
    private void clearUnencryptedStoredCredentials(){
       this.unencryptedStoredCredentials_ = null;
    }
    public static void e(EsAuthBlob$AuthBlob p0){
       p0.clearBlob();
    }
    public static void f(EsAuthBlob$AuthBlob p0){
       p0.clearStoredCredentials();
    }
    public static void g(EsAuthBlob$AuthBlob p0){
       p0.clearUnencryptedStoredCredentials();
    }
    public static EsAuthBlob$AuthBlob getDefaultInstance(){
       return EsAuthBlob$AuthBlob.DEFAULT_INSTANCE;
    }
    public static void h(EsAuthBlob$AuthBlob p0,EsEncryptedStoredCredentials$EncryptedStoredCredentials p1){
       p0.mergeStoredCredentials(p1);
    }
    public static void i(EsAuthBlob$AuthBlob p0,EsUnencryptedStoredCredentials$UnencryptedStoredCredentials p1){
       p0.mergeUnencryptedStoredCredentials(p1);
    }
    public static void j(EsAuthBlob$AuthBlob p0,EsEncryptedStoredCredentials$EncryptedStoredCredentials p1){
       p0.setStoredCredentials(p1);
    }
    public static void k(EsAuthBlob$AuthBlob p0,EsUnencryptedStoredCredentials$UnencryptedStoredCredentials p1){
       p0.setUnencryptedStoredCredentials(p1);
    }
    public static EsAuthBlob$AuthBlob l(){
       return EsAuthBlob$AuthBlob.DEFAULT_INSTANCE;
    }
    private void mergeStoredCredentials(EsEncryptedStoredCredentials$EncryptedStoredCredentials p0){
       p0.getClass();
       this.blob_ = (this.blobCase_ == 1 && this.blob_ != EsEncryptedStoredCredentials$EncryptedStoredCredentials.getDefaultInstance())? EsEncryptedStoredCredentials$EncryptedStoredCredentials.newBuilder(this.blob_).mergeFrom(p0).buildPartial(): p0;
       this.blobCase_ = 1;
       return;
    }
    private void mergeUnencryptedStoredCredentials(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials p0){
       EsAuthBlob$AuthBlob tunencrypted;
       p0.getClass();
       this.unencryptedStoredCredentials_ = ((tunencrypted = this.unencryptedStoredCredentials_) != null && tunencrypted != EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.getDefaultInstance())? EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.newBuilder(this.unencryptedStoredCredentials_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public static EsAuthBlob$AuthBlob$Builder newBuilder(){
       return EsAuthBlob$AuthBlob.DEFAULT_INSTANCE.createBuilder();
    }
    public static EsAuthBlob$AuthBlob$Builder newBuilder(EsAuthBlob$AuthBlob p0){
       return EsAuthBlob$AuthBlob.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EsAuthBlob$AuthBlob parseDelimitedFrom(InputStream p0){
       return c.parseDelimitedFrom(EsAuthBlob$AuthBlob.DEFAULT_INSTANCE, p0);
    }
    public static EsAuthBlob$AuthBlob parseDelimitedFrom(InputStream p0,yx1 p1){
       return c.parseDelimitedFrom(EsAuthBlob$AuthBlob.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsAuthBlob$AuthBlob parseFrom(InputStream p0){
       return c.parseFrom(EsAuthBlob$AuthBlob.DEFAULT_INSTANCE, p0);
    }
    public static EsAuthBlob$AuthBlob parseFrom(InputStream p0,yx1 p1){
       return c.parseFrom(EsAuthBlob$AuthBlob.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsAuthBlob$AuthBlob parseFrom(ByteBuffer p0){
       return c.parseFrom(EsAuthBlob$AuthBlob.DEFAULT_INSTANCE, p0);
    }
    public static EsAuthBlob$AuthBlob parseFrom(ByteBuffer p0,yx1 p1){
       return c.parseFrom(EsAuthBlob$AuthBlob.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsAuthBlob$AuthBlob parseFrom(i80 p0){
       return c.parseFrom(EsAuthBlob$AuthBlob.DEFAULT_INSTANCE, p0);
    }
    public static EsAuthBlob$AuthBlob parseFrom(i80 p0,yx1 p1){
       return c.parseFrom(EsAuthBlob$AuthBlob.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsAuthBlob$AuthBlob parseFrom(sh0 p0){
       return c.parseFrom(EsAuthBlob$AuthBlob.DEFAULT_INSTANCE, p0);
    }
    public static EsAuthBlob$AuthBlob parseFrom(sh0 p0,yx1 p1){
       return c.parseFrom(EsAuthBlob$AuthBlob.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsAuthBlob$AuthBlob parseFrom(byte[] p0){
       return c.parseFrom(EsAuthBlob$AuthBlob.DEFAULT_INSTANCE, p0);
    }
    public static EsAuthBlob$AuthBlob parseFrom(byte[] p0,yx1 p1){
       return c.parseFrom(EsAuthBlob$AuthBlob.DEFAULT_INSTANCE, p0, p1);
    }
    public static r75 parser(){
       return EsAuthBlob$AuthBlob.DEFAULT_INSTANCE.getParserForType();
    }
    private void setStoredCredentials(EsEncryptedStoredCredentials$EncryptedStoredCredentials p0){
       p0.getClass();
       this.blob_ = p0;
       this.blobCase_ = 1;
    }
    private void setUnencryptedStoredCredentials(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials p0){
       p0.getClass();
       this.unencryptedStoredCredentials_ = p0;
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       int i = 0;
       byte b = 1;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[]{"blob_","blobCase_",EsEncryptedStoredCredentials$EncryptedStoredCredentials.class,"unencryptedStoredCredentials_"};
             return c.newMessageInfo(EsAuthBlob$AuthBlob.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\x01\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01<\xff\x02\xff\x02\x02\t", objArray);
           case 3:
             return new EsAuthBlob$AuthBlob();
           case 4:
             return new EsAuthBlob$AuthBlob$Builder(i);
           case 5:
             return EsAuthBlob$AuthBlob.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsAuthBlob$AuthBlob.PARSER) == null) {
                _monitor_enter(EsAuthBlob$AuthBlob.class);
                if ((pARSER = EsAuthBlob$AuthBlob.PARSER) == null) {
                   pARSER = new ii2(EsAuthBlob$AuthBlob.DEFAULT_INSTANCE);
                   EsAuthBlob$AuthBlob.PARSER = pARSER;
                }
                _monitor_exit(EsAuthBlob$AuthBlob.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public EsAuthBlob$AuthBlob$BlobCase getBlobCase(){
       return EsAuthBlob$AuthBlob$BlobCase.forNumber(this.blobCase_);
    }
    public EsEncryptedStoredCredentials$EncryptedStoredCredentials getStoredCredentials(){
       if (this.blobCase_ == 1) {
          return this.blob_;
       }
       return EsEncryptedStoredCredentials$EncryptedStoredCredentials.getDefaultInstance();
    }
    public EsUnencryptedStoredCredentials$UnencryptedStoredCredentials getUnencryptedStoredCredentials(){
       EsAuthBlob$AuthBlob tunencrypted;
       if ((tunencrypted = this.unencryptedStoredCredentials_) == null) {
          tunencrypted = EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.getDefaultInstance();
       }
       return tunencrypted;
    }
    public boolean hasStoredCredentials(){
       boolean b = true;
       if (this.blobCase_ == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean hasUnencryptedStoredCredentials(){
       boolean b = (this.unencryptedStoredCredentials_ != null)? true: false;
       return b;
    }
}
