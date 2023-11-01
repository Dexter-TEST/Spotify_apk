package p.yc2;
import p.b57;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.concurrent.TimeUnit;

public final class yc2 extends b57	// class@0003d7 from classes2.dex
{
    public b57 e;

    public void yc2(b57 p0){
       co5.o(p0, "delegate");
       super();
       this.e = p0;
    }
    public final b57 a(){
       return this.e.a();
    }
    public final b57 b(){
       return this.e.b();
    }
    public final long c(){
       return this.e.c();
    }
    public final b57 d(long p0){
       return this.e.d(p0);
    }
    public final boolean e(){
       return this.e.e();
    }
    public final void f(){
       this.e.f();
    }
    public final b57 g(long p0,TimeUnit p1){
       co5.o(p1, "unit");
       return this.e.g(p0, p1);
    }
}
