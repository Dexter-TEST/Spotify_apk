package com.spotify.localfiles.localfiles.LocalAlbum;
import java.lang.String;
import com.spotify.localfiles.localfiles.LocalCovers;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;

public final class LocalAlbum	// class@000975 from classes.dex
{
    public final String a;
    public final String b;
    public final LocalCovers c;

    public void LocalAlbum(String p0,String p1,LocalCovers p2){
       co5.o(p0, "uri");
       co5.o(p1, "name");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final LocalAlbum copy(String p0,String p1,LocalCovers p2){
       co5.o(p0, "uri");
       co5.o(p1, "name");
       return new LocalAlbum(p0, p1, p2);
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof LocalAlbum) {
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
       return true;
    }
    public final int hashCode(){
       LocalAlbum tc;
       int i = tp2.g(this.b, (this.a.hashCode() * 31), 31);
       int i1 = ((tc = this.c) == null)? 0: tc.hashCode();
       return (i + i1);
    }
    public final String toString(){
       return "LocalAlbum\(uri="+this.a+", name="+this.b+", covers="+this.c+')';
    }
}
