package p.m95;
import java.lang.Comparable;
import p.ir2;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.j80;
import java.util.ArrayList;
import p.at7;
import java.lang.Class;
import java.lang.Character;
import p.e70;
import java.nio.file.Path;
import p.aq3;

public final class m95 implements Comparable	// class@0002b2 from classes2.dex
{
    public final j80 a;
    public static final String b;

    static {
       ir2 oir2 = new ir2(27, 0);
       String separator = File.separator;
       co5.l(separator, "separator");
       m95.b = separator;
    }
    public void m95(j80 p0){
       co5.o(p0, "bytes");
       super();
       this.a = p0;
    }
    public final ArrayList a(){
       ArrayList uArrayList = new ArrayList();
       int i = at7.a(this);
       m95 ta = this.a;
       if (i == -1) {
          i = 0;
       }else if(i < ta.d() && ta.i(i) == (byte)92){
          i = i + 1;
       }
       int i1 = ta.d();
       int i2 = i;
       while (i < i1) {
          if (ta.i(i) == (byte)47 || ta.i(i) == (byte)92) {
             uArrayList.add(ta.n(i2, i));
             i2 = i + 1;
          }
          i = i + 1;
       }
       if (i2 < ta.d()) {
          uArrayList.add(ta.n(i2, ta.d()));
       }
       return uArrayList;
    }
    public final m95 b(){
       int i;
       m95 om95;
       j80 d = at7.d;
       m95 ta = this.a;
       if (!co5.c(ta, d)) {
          j80 a = at7.a;
          if (!co5.c(ta, a)) {
             j80 b = at7.b;
             if (!co5.c(ta, b)) {
                j80 e = at7.e;
                ta.getClass();
                co5.o(e, "suffix");
                j80 a1 = e.a;
                e = (ta.m((ta.d() - a1.length), e, a1.length) && (ta.d() == 2 || (ta.m((ta.d() - 3), a, 1) || ta.m((ta.d() - 3), b, 1))))? 1: 0;
                if (!e) {
                   if ((i = j80.k(ta, a)) == -1) {
                      i = j80.k(ta, b);
                   }
                   if (i == 2 && this.e() != null) {
                      if (ta.d() != 3) {
                         om95 = new m95(j80.o(ta, 0, 3, 1));
                      }
                   }else if(i == 1){
                      co5.o(b, "prefix");
                      if (!ta.m(0, b, b.d())) {
                      }
                   }else if(i == -1 && this.e() != null){
                      if (ta.d() != 2) {
                         om95 = new m95(j80.o(ta, 0, 2, 1));
                      }
                   }else if(i == -1){
                      ta = new m95(d);
                   label_00ce :
                      return ta;
                   }else if(!i){
                      om95 = new m95(j80.o(ta, 0, 1, 1));
                   }else {
                      om95 = new m95(j80.o(ta, 0, i, 1));
                   }
                   ta = om95;
                   goto label_00ce ;
                }
             }
          }
       }
       ta = null;
       goto label_00ce ;
    }
    public final m95 c(String p0){
       co5.o(p0, "child");
       e70 uoe70 = new e70();
       uoe70.B0(p0);
       return at7.b(this, at7.d(uoe70, false), false);
    }
    public final int compareTo(Object p0){
       co5.o(p0, "other");
       return this.a.b(p0.a);
    }
    public final Path d(){
       String[] stringArray = new String[0];
       Path path = aq3.u(this.toString(), stringArray);
       co5.l(path, "get\(toString\(\)\)");
       return path;
    }
    public final Character e(){
       Character uCharacter;
       m95 ta = this.a;
       if (j80.g(ta, at7.a) != -1) {
       }else if(ta.d() < 2){
          int i = 1;
          if (ta.i(i) == (byte)58) {
             char c = (char)ta.i(0);
             int i1 = (97 <= c && c < '{')? 1: 0;
             if (!i1) {
                if (65 > c || c >= '[') {
                   i = 0;
                }
                if (i) {
                label_0040 :
                   uCharacter = Character.valueOf(c);
                label_0044 :
                   return uCharacter;
                }
             }else {
                goto label_0040 ;
             }
          }
       }
       uCharacter = null;
       goto label_0044 ;
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof m95 && co5.c(p0.a, this.a))? true: false;
       return b;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final File toFile(){
       return new File(this.toString());
    }
    public final String toString(){
       return this.a.q();
    }
}
