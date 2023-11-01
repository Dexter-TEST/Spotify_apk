package p.m7;
import p.fh2;
import java.io.Serializable;
import p.aa0;
import java.lang.Object;
import p.r42;
import p.co5;
import java.lang.String;
import p.tp2;
import p.ns5;
import java.lang.Class;
import p.ps5;

public abstract class m7 implements fh2, Serializable	// class@001e40 from classes.dex
{
    public final Object a;
    public final Class b;
    public final String c;
    public final String t;
    public final boolean v;
    public final int w;
    public final int x;

    public void m7(){
       super();
       this.a = aa0.a;
       this.b = r42.class;
       this.c = "walk";
       this.t = "walk\(Ljava/io/File;Lkotlin/io/FileWalkDirection;\)Lkotlin/io/FileTreeWalk;";
       this.v = true;
       this.w = 1;
       this.x = 0;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof m7) {
          return false;
       }
       if (this.v != p0.v || (this.w != p0.w || (this.x != p0.x || (!co5.c(this.a, p0.a) || (!co5.c(this.b, p0.b) || (!this.c.equals(p0.c) || !this.t.equals(p0.t))))))) {
          b = false;
       }
       return b;
    }
    public final int getArity(){
       return this.w;
    }
    public final int hashCode(){
       m7 ta;
       m7 tb;
       int i = 0;
       int i1 = ((ta = this.a) != null)? ta.hashCode(): 0;
       i1 = i1 * 31;
       if ((tb = this.b) != null) {
          i = tb.hashCode();
       }
       i = tp2.g(this.t, tp2.g(this.c, ((i1 + i) * 31), 31), 31);
       i1 = (this.v != null)? 1231: 1237;
       return (((((i + i1) * 31) + this.w) * 31) + this.x);
    }
    public final String toString(){
       ns5.a.getClass();
       return ps5.a(this);
    }
}
