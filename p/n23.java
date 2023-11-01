package p.n23;
import p.su2;
import p.o23;
import java.lang.String;
import java.lang.Object;
import p.io2;
import p.m23;
import java.util.Arrays;

public final class n23 implements su2	// class@001f52 from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final o23 e;

    public void n23(o23 p0,String p1,String p2,String p3,String p4){
       this.e = p0;
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
    }
    public final su2 a(String p0){
       su2 osu2;
       if (io2.j(this.b, p0)) {
          osu2 = this;
       }else {
          osu2 = new m23(this);
          osu2.b = p0;
       }
       return osu2;
    }
    public final su2 b(String p0){
       su2 osu2;
       if (io2.j(this.d, p0)) {
          osu2 = this;
       }else {
          osu2 = new m23(this);
          osu2.d = p0;
       }
       return osu2;
    }
    public final o23 build(){
       return this.e;
    }
    public final su2 c(String p0){
       su2 osu2;
       if (io2.j(this.c, p0)) {
          osu2 = this;
       }else {
          osu2 = new m23(this);
          osu2.c = p0;
       }
       return osu2;
    }
    public final su2 d(String p0){
       su2 osu2;
       if (io2.j(this.a, p0)) {
          osu2 = this;
       }else {
          osu2 = new m23(this);
          osu2.a = p0;
       }
       return osu2;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof n23) {
          return false;
       }
       if (!io2.j(this.a, p0.a) || (!io2.j(this.b, p0.b) || (!io2.j(this.c, p0.c) || !io2.j(this.d, p0.d)))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.a,this.b,this.c,this.d};
       return Arrays.hashCode(objArray);
    }
}
