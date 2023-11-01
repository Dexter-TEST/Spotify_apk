package p.uu3;
import p.u74;
import com.google.protobuf.b;
import com.spotify.login5.v3.proto.LoginRequest;
import com.google.protobuf.c;
import p.s74;
import com.spotify.login5.v3.proto.ChallengeSolutions;
import p.r74;
import java.lang.Object;
import p.v1;
import com.spotify.login5.v3.proto.ClientInfo;
import com.spotify.login5.v3.credentials.proto.FacebookAccessToken;
import p.i80;
import com.spotify.login5.v3.credentials.proto.OneTimeToken;
import com.spotify.login5.v3.credentials.proto.Password;
import com.spotify.login5.v3.identifiers.proto.PhoneNumber;
import com.google.protobuf.a;
import com.spotify.login5.v3.credentials.proto.StoredCredential;
import java.io.InputStream;
import p.yx1;
import p.sh0;

public final class uu3 extends b implements u74	// class@002921 from classes.dex
{

    public void uu3(){
       super(LoginRequest.e());
    }
    public final s74 build(){
       return super.build();
    }
    public final s74 buildPartial(){
       return super.buildPartial();
    }
    public final void c(ChallengeSolutions p0){
       this.copyOnWrite();
       LoginRequest.m(this.instance, p0);
    }
    public final r74 clear(){
       return super.clear();
    }
    public final Object clone(){
       return super.clone();
    }
    public final r74 clone(){
       return super.clone();
    }
    public final v1 clone(){
       return super.clone();
    }
    public final void d(ClientInfo p0){
       this.copyOnWrite();
       LoginRequest.j(this.instance, p0);
    }
    public final void e(FacebookAccessToken p0){
       this.copyOnWrite();
       LoginRequest.h(this.instance, p0);
    }
    public final void f(i80 p0){
       this.copyOnWrite();
       LoginRequest.l(this.instance, p0);
    }
    public final void g(OneTimeToken p0){
       this.copyOnWrite();
       LoginRequest.k(this.instance, p0);
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final void h(Password p0){
       this.copyOnWrite();
       LoginRequest.g(this.instance, p0);
    }
    public final void i(PhoneNumber p0){
       this.copyOnWrite();
       LoginRequest.i(this.instance, p0);
    }
    public final v1 internalMergeFrom(a p0){
       return super.internalMergeFrom(p0);
    }
    public final void j(StoredCredential p0){
       this.copyOnWrite();
       LoginRequest.f(this.instance, p0);
    }
    public final r74 mergeFrom(InputStream p0){
       return super.mergeFrom(p0);
    }
    public final r74 mergeFrom(InputStream p0,yx1 p1){
       return super.mergeFrom(p0, p1);
    }
    public final r74 mergeFrom(i80 p0){
       return super.mergeFrom(p0);
    }
    public final r74 mergeFrom(i80 p0,yx1 p1){
       return super.mergeFrom(p0, p1);
    }
    public final r74 mergeFrom(s74 p0){
       return super.mergeFrom(p0);
    }
    public final r74 mergeFrom(sh0 p0){
       return super.mergeFrom(p0);
    }
    public final r74 mergeFrom(sh0 p0,yx1 p1){
       return super.mergeFrom(p0, p1);
    }
    public final r74 mergeFrom(byte[] p0){
       return super.mergeFrom(p0);
    }
    public final r74 mergeFrom(byte[] p0,int p1,int p2){
       return super.mergeFrom(p0, p1, p2);
    }
    public final r74 mergeFrom(byte[] p0,int p1,int p2,yx1 p3){
       return super.mergeFrom(p0, p1, p2, p3);
    }
    public final r74 mergeFrom(byte[] p0,yx1 p1){
       return super.mergeFrom(p0, p1);
    }
    public final v1 mergeFrom(sh0 p0,yx1 p1){
       return super.mergeFrom(p0, p1);
    }
    public final v1 mergeFrom(byte[] p0,int p1,int p2){
       return super.mergeFrom(p0, p1, p2);
    }
    public final v1 mergeFrom(byte[] p0,int p1,int p2,yx1 p3){
       return super.mergeFrom(p0, p1, p2, p3);
    }
}
