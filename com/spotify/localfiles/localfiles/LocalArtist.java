package com.spotify.localfiles.localfiles.LocalArtist;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;

public final class LocalArtist	// class@000977 from classes.dex
{
    public final String a;
    public final String b;

    public void LocalArtist(String p0,String p1){
       co5.o(p0, "uri");
       co5.o(p1, "name");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final LocalArtist copy(String p0,String p1){
       co5.o(p0, "uri");
       co5.o(p1, "name");
       return new LocalArtist(p0, p1);
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof LocalArtist) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.b.hashCode() + (this.a.hashCode() * 31));
    }
    public final String toString(){
       return hr7.a("LocalArtist\(uri="+this.a+", name=", this.b, ')');
    }
}
