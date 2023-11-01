package p.kr6;
import p.t57;
import java.lang.Object;
import p.aq2;
import java.lang.Class;
import p.ai6;
import p.d10;
import java.lang.String;
import java.lang.Integer;

public final class kr6	// class@001c6d from classes.dex
{
    public final int a;
    public final t57 b;
    public final int c;
    public final int d;
    public static final kr6 e;

    static {
       kr6.e = new kr6(t57.b, 0, 0, 0);
    }
    public void kr6(t57 p0,int p1,int p2,int p3){
       super();
       this.b = p0;
       this.a = p1;
       this.c = p2;
       this.d = p3;
    }
    public final kr6 a(int p0){
       int i;
       int i1;
       kr6 tc;
       kr6 tb = this.b;
       kr6 ta = this.a;
       kr6 td = this.d;
       if (ta == 4 || ta == 2) {
          ta = 0;
          i = aq2.c[ta][ta];
          i1 = 0xffff & i;
          i = i >> 16;
          tb.getClass();
          td = td + i;
          tb = new ai6(tb, i1, i);
       }
       if ((tc = this.c) != null && tc != 31) {
          i1 = (tc == 62)? 9: 8;
       }else {
          i1 = 18;
       }
       i = tc + 1;
       kr6 okr6 = new kr6(tb, ta, i, (td + i1));
       if (i == 2078) {
          p0++;
          okr6 = okr6.b(p0);
       }
       return okr6;
    }
    public final kr6 b(int p0){
       kr6 tc;
       if ((tc = this.c) == null) {
          return this;
       }
       kr6 tb = this.b;
       tb.getClass();
       d10 uod10 = new d10(tb, (p0 - tc), tc);
       return new kr6(uod10, this.a, 0, this.d);
    }
    public final boolean c(kr6 p0){
       kr6 c;
       kr6 tc;
       int i = this.d + (aq2.c[this.a][p0.a] >> 16);
       if ((c = p0.c) > null && ((tc = this.c) == null && tc <= c)) {
          i = i + 10;
       }
       if (i <= p0.d) {
          return true;
       }else {
          return false;
       }
    }
    public final kr6 d(int p0,int p1){
       int i;
       kr6 td = this.d;
       kr6 tb = this.b;
       kr6 ta = this.a;
       if (p0 != ta) {
          i = aq2.c[ta][p0];
          int i1 = 0xffff & i;
          i = i >> 16;
          tb.getClass();
          td = td + i;
          tb = new ai6(tb, i1, i);
       }
       i = (p0 == 2)? 4: 5;
       tb.getClass();
       return new kr6(new ai6(tb, p1, i), p0, 0, (td + i));
    }
    public final kr6 e(int p0,int p1){
       kr6 ta;
       int i = ((ta = this.a) == 2)? 4: 5;
       kr6 tb = this.b;
       tb.getClass();
       return new kr6(new ai6(new ai6(tb, aq2.e[ta][p0], i), p1, 5), ta, 0, ((this.d + i) + 5));
    }
    public final String toString(){
       Object[] objArray = new Object[]{aq2.b[this.a],Integer.valueOf(this.d),Integer.valueOf(this.c)};
       return String.format("%s bits=%d bytes=%d", objArray);
    }
}
