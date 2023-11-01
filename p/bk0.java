package p.bk0;
import p.r1;
import p.dk0;
import java.lang.Object;
import p.io2;
import java.util.Map;

public final class bk0 extends r1	// class@0010dc from classes.dex
{
    public final Object a;
    public int b;
    public final dk0 c;

    public void bk0(dk0 p0,int p1){
       this.c = p0;
       super();
       this.a = p0.d(p1);
       this.b = p1;
    }
    public final void a(){
       bk0 tb = this.b;
       bk0 ta = this.a;
       bk0 tc = this.c;
       if (tb == -1 || (tb >= tc.size() || !io2.j(ta, tc.d(this.b)))) {
          this.b = tc.b(ta);
       }
       return;
    }
    public final Object getKey(){
       return this.a;
    }
    public final Object getValue(){
       Map map;
       bk0 tb;
       bk0 tc = this.c;
       if ((map = tc.a()) != null) {
          return map.get(this.a);
       }
       this.a();
       Object obj = ((tb = this.b) == -1)? null: tc.l(tb);
       return obj;
    }
    public final Object setValue(Object p0){
       bk0 tb;
       bk0 tc = this.c;
       Map map = tc.a();
       bk0 ta = this.a;
       if (map != null) {
          return map.put(ta, p0);
       }
       this.a();
       if ((tb = this.b) == -1) {
          tc.put(ta, p0);
          return null;
       }else {
          tc.j()[this.b] = p0;
          return tc.l(tb);
       }
    }
}
