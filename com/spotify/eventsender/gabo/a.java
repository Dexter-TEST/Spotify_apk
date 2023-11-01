package com.spotify.eventsender.gabo.a;
import p.u74;
import com.google.protobuf.b;
import com.spotify.eventsender.gabo.EventEnvelope;
import com.google.protobuf.c;
import p.s74;
import p.ab2;
import p.r74;
import java.lang.Object;
import p.v1;
import java.lang.String;
import p.i80;
import com.google.protobuf.a;
import java.io.InputStream;
import p.yx1;
import p.sh0;

public final class a extends b implements u74	// class@0008b6 from classes.dex
{

    public void a(){
       super(EventEnvelope.h());
    }
    public final s74 build(){
       return super.build();
    }
    public final s74 buildPartial(){
       return super.buildPartial();
    }
    public final void c(ab2 p0){
       this.copyOnWrite();
       EventEnvelope.e(this.instance, p0);
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
       EventEnvelope.i(this.instance, p0);
    }
    public final void e(i80 p0){
       this.copyOnWrite();
       EventEnvelope.f(this.instance, p0);
    }
    public final void f(long p0){
       this.copyOnWrite();
       EventEnvelope.g(this.instance, p0);
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
