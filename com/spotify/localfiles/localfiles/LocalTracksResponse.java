package com.spotify.localfiles.localfiles.LocalTracksResponse;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.ll1;
import java.lang.StringBuilder;
import p.tp2;

public final class LocalTracksResponse	// class@000981 from classes.dex
{
    public final List a;
    public final int b;
    public final int c;

    public void LocalTracksResponse(List p0,int p1,int p2){
       co5.o(p0, "items");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void LocalTracksResponse(List p0,int p1,int p2,int p3,DefaultConstructorMarker p4){
       ll1 a;
       if ((p3 & 0x01)) {
          a = ll1.a;
       }
       if ((p3 & 0x04)) {
          p2 = 0;
       }
       super(a, p1, p2);
       return;
    }
    public final LocalTracksResponse copy(List p0,int p1,int p2){
       co5.o(p0, "items");
       return new LocalTracksResponse(p0, p1, p2);
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof LocalTracksResponse) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return ((((this.a.hashCode() * 31) + this.b) * 31) + this.c);
    }
    public final String toString(){
       return tp2.n("LocalTracksResponse\(items="+this.a+", unfilteredLength="+this.b+", lengthInSeconds=", this.c, ')');
    }
}
