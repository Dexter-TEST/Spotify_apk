package p.zs2;
import p.ac;
import p.v55;
import p.vk7;
import java.lang.Object;
import p.w53;
import java.lang.String;
import p.wk7;
import p.tk7;
import p.ab3;

public final class zs2	// class@002f57 from classes.dex
{
    public final ac a;
    public final v55 b;
    public final vk7 c;

    public void zs2(ac p0,v55 p1,vk7 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void zs2(ac p0,w53 p1){
       super();
       this.a = p0;
       this.b = p1.h();
       this.c = p1.b();
    }
    public final void a(String p0){
       zs2 tb = this.b;
       zs2 tc = this.c;
       wk7 owk7 = (p0 == null)? wk7.S: new tk7(p0);
       this.a.a(tb, tc, owk7, 1, null);
       return;
    }
    public final void b(vk7 p0,int p1){
       this.a.a(this.b, this.c, p0, p1, null);
    }
}
