package p.g32;
import p.f32;
import p.ws6;
import android.content.Context;
import p.vg0;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.m42;
import p.fv1;
import p.a32;
import p.o32;
import java.io.File;
import p.p32;
import p.q32;
import java.io.FileInputStream;
import p.x32;
import p.y32;
import java.io.FileReader;
import java.lang.StringBuilder;
import p.en6;
import p.u32;
import p.v32;
import java.io.FileOutputStream;
import p.o42;
import p.p42;
import java.io.FileWriter;
import p.t32;

public final class g32 implements f32	// class@00168f from classes.dex
{
    public final ws6 a;
    public final boolean b;
    public final m42 c;
    public final fv1 d;

    public void g32(ws6 p0,boolean p1,Context p2,vg0 p3){
       co5.o(p2, "context");
       co5.o(p3, "clientInfo");
       super();
       this.a = p0;
       this.b = p1;
       this.c = new m42(p2, p3);
       this.d = new fv1(this);
    }
    public final a32 a(String p0){
       co5.o(p0, "pathname");
       o32 v0 = new o32(this, new File(p0), this.a, this.b, this.c);
       return v0;
    }
    public final p32 b(a32 p0){
       q32 v6 = new q32(new FileInputStream(p0.b), this.a, p0.getAbsolutePath(), this.b, this.c);
       return v6;
    }
    public final x32 c(String p0){
       String absolutePath = new File(p0).getAbsolutePath();
       co5.l(absolutePath, "File\(fileName\).absolutePath");
       y32 v6 = new y32(new FileReader(p0), absolutePath, this.a, this.b, this.c);
       return v6;
    }
    public final a32 d(a32 p0,String p1){
       co5.o(p0, "parent");
       o32 v0 = new o32(this, new File(en6.p(p0.getPath(), File.separator, p1)), this.a, this.b, this.c);
       return v0;
    }
    public final u32 e(a32 p0,boolean p1){
       co5.o(p0, "file");
       v32 v0 = new v32(new FileOutputStream(p0.b, p1), this.a, p0.getAbsolutePath(), this.b, this.c);
       return v0;
    }
    public final a32 f(String p0,String p1){
       co5.o(p1, "child");
       o32 v0 = new o32(this, new File(p0, p1), this.a, this.b, this.c);
       return v0;
    }
    public final a32 g(File p0,String p1){
       co5.o(p1, "child");
       o32 v0 = new o32(this, new File(p0, p1), this.a, this.b, this.c);
       return v0;
    }
    public final o42 h(a32 p0){
       p42 v6 = new p42(new FileWriter(p0.b, false), p0.getAbsolutePath(), this.a, this.b, this.c);
       return v6;
    }
    public final t32 i(){
       return this.d;
    }
}
