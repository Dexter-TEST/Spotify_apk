package p.is2;
import p.js2;
import p.lv5;
import p.r90;
import p.su0;
import p.v90;
import p.e15;
import java.lang.Object;
import p.s90;
import p.au0;
import p.wb0;
import p.ye7;
import p.uh3;
import p.zf2;
import p.uf;
import p.ca0;
import java.lang.Exception;
import p.co5;

public final class is2 extends js2	// class@000249 from classes2.dex
{
    public final v90 d;

    public void is2(lv5 p0,r90 p1,su0 p2,v90 p3){
       super(p0, p1, p2);
       this.d = p3;
    }
    public final Object a(e15 p0,Object[] p1){
       s90 os90 = this.d.m(p0);
       int i = 1;
       object oobject = p1[(p1.length - i)];
       try{
          wb0 owb0 = new wb0(i, ye7.E(oobject));
          owb0.r(new uh3(os90, 0));
          os90.x(new uf(0, owb0));
          return owb0.o();
       }catch(java.lang.Exception e4){
          return co5.L(e4, oobject);
       }
    }
}
