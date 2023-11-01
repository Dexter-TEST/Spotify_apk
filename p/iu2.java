package p.iu2;
import java.lang.Object;
import p.ju2;
import java.lang.String;
import java.io.Serializable;
import p.au2;
import p.st2;
import p.co5;
import p.n13;
import p.tt2;
import p.k23;
import java.util.List;
import p.fu2;
import java.util.HashMap;
import p.gu2;
import p.g23;
import p.hu2;
import p.su2;
import p.o23;
import p.tu2;

public abstract class iu2	// class@001a05 from classes.dex
{

    public void iu2(){
       super();
    }
    public abstract iu2 a(ju2[] p0);
    public abstract iu2 b(String p0,Serializable p1);
    public abstract iu2 c(au2 p0);
    public final iu2 d(String p0,st2 p1){
       co5.o(p1, "commandBuilder");
       return this.e(p0, p1.b());
    }
    public abstract iu2 e(String p0,tt2 p1);
    public abstract iu2 f(String p0,Serializable p1);
    public abstract k23 g();
    public abstract iu2 h(List p0);
    public abstract iu2 i(ju2[] p0);
    public abstract iu2 j(String p0,String p1);
    public abstract iu2 k(fu2 p0);
    public abstract iu2 l(au2 p0);
    public abstract iu2 m(HashMap p0);
    public abstract iu2 n(String p0);
    public abstract iu2 o(String p0);
    public final iu2 p(gu2 p0){
       co5.o(p0, "imagesBuilder");
       return this.q(p0.a());
    }
    public abstract iu2 q(hu2 p0);
    public abstract iu2 r();
    public final iu2 s(su2 p0){
       co5.o(p0, "textBuilder");
       return this.t(p0.build());
    }
    public abstract iu2 t(tu2 p0);
}
