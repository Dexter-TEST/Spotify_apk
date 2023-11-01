package p.mo3;
import p.b33;
import p.j8;
import java.lang.Object;
import p.p33;
import p.ju2;
import java.lang.Class;
import java.lang.String;
import p.zs2;
import p.tk7;
import p.vk7;
import p.an5;
import p.vu2;

public final class mo3 implements b33	// class@001ed4 from classes.dex
{
    public final j8 a;

    public void mo3(j8 p0){
       this.a = p0;
    }
    public final void b(p33 p0,ju2 p1){
       String str;
       mo3 ta = this.a;
       ta.getClass();
       if ((str = p0.a()) != null) {
          ta.c.b(new tk7(str), 19);
          ta.v.onNext(new vu2(str, p1));
       }
       return;
    }
}
