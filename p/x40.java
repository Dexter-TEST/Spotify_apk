package p.x40;
import p.u74;
import com.google.protobuf.b;
import com.spotify.messages.BootstrapRequestNonAuth;
import com.google.protobuf.c;
import p.s74;
import java.util.TreeMap;
import p.g14;
import java.util.Map;
import p.r74;
import java.lang.Object;
import p.v1;
import java.lang.String;
import com.google.protobuf.a;
import java.io.InputStream;
import p.yx1;
import p.i80;
import p.sh0;

public final class x40 extends b implements u74	// class@002c03 from classes.dex
{

    public void x40(){
       super(BootstrapRequestNonAuth.e());
    }
    public final s74 build(){
       return super.build();
    }
    public final s74 buildPartial(){
       return super.buildPartial();
    }
    public final void c(TreeMap p0){
       this.copyOnWrite();
       BootstrapRequestNonAuth.j(this.instance).putAll(p0);
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
    public final void d(String p0){
       this.copyOnWrite();
       BootstrapRequestNonAuth.g(this.instance, p0);
    }
    public final void e(String p0){
       this.copyOnWrite();
       BootstrapRequestNonAuth.m(this.instance, p0);
    }
    public final void f(String p0){
       this.copyOnWrite();
       BootstrapRequestNonAuth.i(this.instance, p0);
    }
    public final void g(long p0){
       this.copyOnWrite();
       BootstrapRequestNonAuth.f(this.instance, p0);
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final void h(long p0){
       this.copyOnWrite();
       BootstrapRequestNonAuth.k(this.instance, p0);
    }
    public final void i(String p0){
       this.copyOnWrite();
       BootstrapRequestNonAuth.h(this.instance, p0);
    }
    public final v1 internalMergeFrom(a p0){
       return super.internalMergeFrom(p0);
    }
    public final void j(int p0){
       this.copyOnWrite();
       BootstrapRequestNonAuth.l(this.instance, p0);
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
