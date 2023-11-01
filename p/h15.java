package p.h15;
import p.r90;
import p.ay6;
import java.util.Set;
import java.lang.Object;
import p.bv5;
import p.t90;
import java.lang.String;
import p.co5;
import p.ui3;
import p.g15;
import java.lang.Class;
import p.f15;
import java.util.ArrayList;
import java.util.Collection;

public final class h15 implements r90	// class@0017c0 from classes.dex
{
    public final ui3 a;
    public final Set b;

    public void h15(ay6 p0,Set p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final t90 a(bv5 p0){
       co5.o(p0, "request");
       g15 value = this.a.getValue();
       value.getClass();
       f15 uof15 = new f15(value);
       f15 c = uof15.c;
       c.clear();
       c.addAll(this.b);
       uof15.h = false;
       return new g15(uof15).a(p0);
    }
}
