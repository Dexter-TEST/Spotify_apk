package p.z11;
import p.tm5;
import p.ra;
import java.lang.Object;
import p.r61;
import p.co5;
import p.am1;
import android.content.Context;
import p.ds3;

public final class z11 implements tm5	// class@002e68 from classes.dex
{
    public final int a;
    public final qa b;

    public void z11(ra p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object get(){
       z11 tb = this.b;
       switch (this.a){
           case 0:
             Context uContext = tb.p.get();
             co5.m(uContext);
             return uContext;
           case 1:
             am1 uoam1 = tb.n.get();
             co5.m(uoam1);
             return uoam1;
           case 2:
             r61 or61 = tb.f.get();
             co5.m(or61);
             return or61;
           default:
             ds3 uods3 = tb.j.get();
             co5.m(uods3);
             return uods3;
       }
    }
}
