package p.bb7;
import p.ds3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.eb4;
import p.g54;
import p.tp2;
import p.hb7;
import p.kf6;
import p.nb7;
import p.si4;
import p.mb7;
import p.kb7;
import p.fb7;
import p.gb7;

public final class bb7	// class@001093 from classes.dex
{
    public final ds3 a;

    public void bb7(ds3 p0){
       co5.o(p0, "ubiLogger");
       super();
       this.a = p0;
    }
    public static eb4 a(String p0){
       return new eb4(p0, new g54(null).a);
    }
    public final void b(String p0,boolean p1){
       co5.o(p0, "step");
       eb4 uoeb4 = bb7.a(p0);
       bb7 ta = this.a;
       if (p1) {
          ta.a(new kf6(uoeb4).i());
       }else {
          si4 osi4 = new si4(uoeb4);
          mb7 omb7 = new mb7();
          omb7.c(osi4.a);
          omb7.b = osi4.b.a;
          ta.a(omb7.a());
       }
       return;
    }
}
