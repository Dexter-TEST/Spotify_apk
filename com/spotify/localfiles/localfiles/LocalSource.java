package com.spotify.localfiles.localfiles.LocalSource;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import p.kg4;

public final class LocalSource	// class@00097d from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public void LocalSource(String p0,String p1,String p2,boolean p3,boolean p4){
       co5.o(p0, "id");
       co5.o(p1, "path");
       co5.o(p2, "name");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final LocalSource copy(String p0,String p1,String p2,boolean p3,boolean p4){
       co5.o(p0, "id");
       co5.o(p1, "path");
       co5.o(p2, "name");
       LocalSource v0 = new LocalSource(p0, p1, p2, p3, p4);
       return v0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof LocalSource) {
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
       if (this.d != p0.d) {
          return false;
       }
       if (this.e != p0.e) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       LocalSource td;
       int i = tp2.g(this.c, tp2.g(this.b, (this.a.hashCode() * 31), 31), 31);
       int i1 = 1;
       if ((td = this.d) != null) {
          td = 1;
       }
       i = (i + td) * 31;
       if ((td = this.e) == null) {
          i1 = td;
       }
       return (i + i1);
    }
    public final String toString(){
       return kg4.p("LocalSource\(id="+this.a+", path="+this.b+", name="+this.c+", enabled="+this.d+", found=", this.e, ')');
    }
}
