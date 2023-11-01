package p.aj5;
import p.f32;
import p.g32;
import java.lang.Object;
import java.lang.String;
import p.a32;
import p.co5;
import p.p32;
import p.x32;
import p.u32;
import java.io.File;
import p.o42;
import p.t32;

public abstract class aj5 implements f32	// class@000f95 from classes.dex
{
    public final f32 a;

    public void aj5(g32 p0){
       this.a = p0;
    }
    public final a32 a(String p0){
       co5.o(p0, "pathname");
       return this.a.a(p0);
    }
    public final p32 b(a32 p0){
       return this.a.b(p0);
    }
    public final x32 c(String p0){
       return this.a.c(p0);
    }
    public final a32 d(a32 p0,String p1){
       co5.o(p0, "parent");
       return this.a.d(p0, p1);
    }
    public final u32 e(a32 p0,boolean p1){
       co5.o(p0, "file");
       return this.a.e(p0, p1);
    }
    public final a32 f(String p0,String p1){
       co5.o(p1, "child");
       return this.a.f(p0, p1);
    }
    public final a32 g(File p0,String p1){
       co5.o(p1, "child");
       return this.a.g(p0, p1);
    }
    public final o42 h(a32 p0){
       return this.a.h(p0);
    }
    public final t32 i(){
       return this.a.i();
    }
}
