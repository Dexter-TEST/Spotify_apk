package p.m23;
import p.su2;
import p.n23;
import java.lang.Object;
import java.lang.String;
import p.o23;
import java.lang.Class;

public final class m23 implements su2	// class@001e0f from classes.dex
{
    public String a;
    public String b;
    public String c;
    public String d;

    public void m23(n23 p0){
       super();
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.d = p0.d;
    }
    public final su2 a(String p0){
       this.b = p0;
       return this;
    }
    public final su2 b(String p0){
       this.d = p0;
       return this;
    }
    public final o23 build(){
       o23.c.getClass();
       return new o23(this.a, this.b, this.c, this.d);
    }
    public final su2 c(String p0){
       this.c = p0;
       return this;
    }
    public final su2 d(String p0){
       this.a = p0;
       return this;
    }
}
