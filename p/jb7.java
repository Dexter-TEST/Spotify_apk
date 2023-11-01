package p.jb7;
import java.lang.Object;
import java.util.ArrayList;
import p.kb7;
import p.lb7;
import java.lang.String;
import p.ye7;
import java.lang.Integer;
import java.util.Collection;
import java.util.List;

public final class jb7	// class@001aa6 from classes.dex
{
    public String a;
    public String b;
    public Integer c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public final ArrayList i;
    public boolean j;
    public String k;
    public String l;

    public void jb7(){
       super();
       this.f = "";
       this.g = "";
       this.i = new ArrayList();
       this.k = "";
       this.l = "";
    }
    public final kb7 a(){
       ArrayList uArrayList = new ArrayList();
       jb7 ta = this.a;
       ye7.R(ta, "name");
       lb7 v0 = new lb7(ta, this.b, this.d, this.c, this.e);
       uArrayList.add(v0);
       jb7 ti = this.i;
       if ((ti.isEmpty() ^ 0x01)) {
          uArrayList.addAll(ti);
       }
       jb7 th = this.h;
       ye7.R(th, "app");
       kb7 v8 = new kb7(this.f, this.g, th, uArrayList, this.j, this.k, this.l);
       return v8;
    }
}
