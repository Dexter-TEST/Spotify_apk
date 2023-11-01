package p.pg5;
import p.u74;
import com.google.protobuf.b;
import com.spotify.playlist4.proto.Playlist4ApiProto$Op;
import com.google.protobuf.c;
import p.s74;
import com.spotify.playlist4.proto.Playlist4ApiProto$Add;
import p.r74;
import java.lang.Object;
import p.v1;
import p.rg5;
import com.spotify.playlist4.proto.Playlist4ApiProto$Rem;
import com.spotify.playlist4.proto.Playlist4ApiProto$UpdateListAttributes;
import com.google.protobuf.a;
import java.io.InputStream;
import p.yx1;
import p.i80;
import p.sh0;

public final class pg5 extends b implements u74	// class@002259 from classes.dex
{

    public void pg5(){
       super(Playlist4ApiProto$Op.e());
    }
    public final s74 build(){
       return super.build();
    }
    public final s74 buildPartial(){
       return super.buildPartial();
    }
    public final void c(Playlist4ApiProto$Add p0){
       this.copyOnWrite();
       Playlist4ApiProto$Op.g(this.instance, p0);
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
    public final void d(rg5 p0){
       this.copyOnWrite();
       Playlist4ApiProto$Op.f(this.instance, p0);
    }
    public final void e(Playlist4ApiProto$Rem p0){
       this.copyOnWrite();
       Playlist4ApiProto$Op.h(this.instance, p0);
    }
    public final void f(Playlist4ApiProto$UpdateListAttributes p0){
       this.copyOnWrite();
       Playlist4ApiProto$Op.i(this.instance, p0);
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
