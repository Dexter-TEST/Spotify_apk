package p.th5;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.IllegalStateException;

public class th5	// class@002771 from classes.dex
{
    public final int a;
    public final Object[] b;
    public int c;

    public void th5(int p0,int p1){
       Object[] objArray;
       this.a = p1;
       if (p1 != 1) {
          super();
          if (p0 <= 0) {
             throw new IllegalArgumentException("The max pool size must be > 0");
          }
          objArray = new Object[p0];
          this.b = objArray;
          return;
       }else {
          super();
          if (p0 <= 0) {
             throw new IllegalArgumentException("The max pool size must be > 0");
          }
          objArray = new Object[p0];
          this.b = objArray;
          return;
       }
    }
    public Object a(){
       th5 tc;
       int i;
       object oobject1;
       th5 tb = this.b;
       object oobject = null;
       switch (this.a){
           case 0:
             if ((tc = this.c) > null) {
                i = tc - 1;
                oobject1 = tb[i];
                tb[i] = oobject;
                this.c = i;
                oobject = oobject1;
             }
             break;
           default:
             if ((tc = this.c) > null) {
                i = tc - 1;
                oobject1 = tb[i];
                tb[i] = oobject;
                this.c = i;
                oobject = oobject1;
             }
             return oobject;
       }
       return oobject;
    }
    public boolean b(Object p0){
       th5 tc;
       boolean b = false;
       th5 tb = this.b;
       switch (this.a){
           case 0:
             if ((tc = this.c) < tb.length) {
                tb[tc] = p0;
                this.c = tc + 1;
                b = true;
             }
             break;
           default:
             int i = 0;
             while (true) {
                th5 tc1 = this.c;
                if (i < tc1) {
                   if (tb[i] == p0) {
                      i = 1;
                   label_0025 :
                      if (i) {
                         throw new IllegalStateException("Already in the pool!");
                      }
                      if (tc1 < tb.length) {
                         tb[tc1] = p0;
                         this.c = tc1 + 1;
                         b = true;
                         break ;
                      }
                      break ;
                   }else {
                      i = i + 1;
                   }
                }else {
                   i = 0;
                   goto label_0025 ;
                }
             }
             return b;
       }
       return b;
    }
}
