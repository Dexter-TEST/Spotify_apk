package p.cb3;
import p.hs3;
import java.lang.Object;
import p.cd;
import java.lang.String;
import java.lang.Class;
import p.co5;
import java.lang.Throwable;
import p.jl;

public final class cb3 implements hs3	// class@0011d3 from classes.dex
{
    public final cd a;

    public void cb3(){
       super();
       this.a = new cd();
    }
    public final void a(String p0){
       this.a.getClass();
       co5.o(p0, "message");
    }
    public final void b(String p0,Object[] p1){
       this.a(String.format(p0, p1));
    }
    public final void c(String p0,Throwable p1){
       this.a.c(p0, p1);
       jl.q("Error in EventSender", p1);
    }
    public final void d(String p0){
       this.a.getClass();
    }
}
