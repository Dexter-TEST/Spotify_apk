package p.gg5;
import p.u74;
import com.google.protobuf.b;
import com.spotify.playlist4.proto.Playlist4ApiProto$Delta;
import com.google.protobuf.c;
import p.s74;
import com.spotify.playlist4.proto.Playlist4ApiProto$Op;
import p.r74;
import java.lang.Object;
import p.v1;
import com.spotify.playlist4.proto.Playlist4ApiProto$ChangeInfo;
import com.google.protobuf.a;
import java.io.InputStream;
import p.yx1;
import p.i80;
import p.sh0;

public final class gg5 extends b implements u74	// class@001703 from classes.dex
{

    public void gg5(){
       super(Playlist4ApiProto$Delta.e());
    }
    public final s74 build(){
       return super.build();
    }
    public final s74 buildPartial(){
       return super.buildPartial();
    }
    public final void c(Playlist4ApiProto$Op p0){
       this.copyOnWrite();
       Playlist4ApiProto$Delta.f(this.instance, p0);
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
    public final void d(Playlist4ApiProto$ChangeInfo p0){
       this.copyOnWrite();
       Playlist4ApiProto$Delta.g(this.instance, p0);
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final v1 internalMergeFrom(a p0){
       return super.internalMergeFrom(p0);
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
