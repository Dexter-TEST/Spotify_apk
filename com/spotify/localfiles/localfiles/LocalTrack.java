package com.spotify.localfiles.localfiles.LocalTrack;
import java.lang.String;
import com.spotify.localfiles.localfiles.LocalAlbum;
import java.util.List;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import p.kg4;

public final class LocalTrack	// class@00097f from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final LocalAlbum d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final boolean i;

    public void LocalTrack(String p0,String p1,String p2,LocalAlbum p3,List p4,boolean p5,boolean p6,String p7,boolean p8){
       co5.o(p0, "uri");
       co5.o(p1, "rowId");
       co5.o(p2, "name");
       co5.o(p7, "contentUri");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
    }
    public final LocalTrack copy(String p0,String p1,String p2,LocalAlbum p3,List p4,boolean p5,boolean p6,String p7,boolean p8){
       co5.o(p0, "uri");
       co5.o(p1, "rowId");
       co5.o(p2, "name");
       Object obj = p7;
       co5.o(obj, "contentUri");
       LocalTrack v0 = new LocalTrack(p0, p1, p2, p3, p4, p5, p6, obj, p8);
       return v0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof LocalTrack) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       if (!co5.c(this.d, p0.d)) {
          return false;
       }
       if (!co5.c(this.e, p0.e)) {
          return false;
       }
       if (this.f != p0.f) {
          return false;
       }
       if (this.g != p0.g) {
          return false;
       }
       if (!co5.c(this.h, p0.h)) {
          return false;
       }
       if (this.i != p0.i) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       LocalTrack td;
       int i = tp2.g(this.c, tp2.g(this.b, (this.a.hashCode() * 31), 31), 31);
       int i1 = 0;
       int i2 = ((td = this.d) == null)? 0: td.hashCode();
       i = (i + i2) * 31;
       if ((td = this.e) != null) {
          i1 = td.hashCode();
       }
       i = (i + i1) * 31;
       i1 = 1;
       if ((td = this.f) != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       if ((td = this.g) != null) {
          i2 = 1;
       }
       i = tp2.g(this.h, ((i + i2) * 31), 31);
       if ((td = this.i) == null) {
          LocalTrack localTrack = td;
       }
       return (i + i1);
    }
    public final String toString(){
       return kg4.p("LocalTrack\(uri="+this.a+", rowId="+this.b+", name="+this.c+", album="+this.d+", artists="+this.e+", inCollection="+this.f+", isExplicit="+this.g+", contentUri="+this.h+", is19PlusOnly=", this.i, ')');
    }
}
