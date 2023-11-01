package p.cr0;
import p.lo4;
import p.ub3;
import p.yb3;
import java.lang.Object;
import java.lang.Integer;
import p.vu3;
import p.q84;
import java.util.TreeMap;
import java.util.ArrayDeque;

public final class cr0 implements lo4, ub3, yb3	// class@00125f from classes.dex
{
    public final int a;

    public void cr0(int p0){
       this.a = p0;
       super();
    }
    public void cr0(int p0,int p1){
       this.a = p0;
       p1 = 1;
       if (p0 != p1) {
          p1 = 5;
          if (p0 != p1) {
             p1 = 6;
             if (p0 != p1) {
                p1 = 7;
                if (p0 != p1) {
                   if (p0 != 8) {
                      switch (p0){
                          case 11:
                            super(11);
                            return;
                          case 12:
                            super(12);
                            return;
                          case 13:
                            super(13);
                            return;
                          default:
                            switch (p0){
                                case 17:
                                  super(17);
                                  return;
                                case 18:
                                  super(18);
                                  return;
                                case 19:
                                  super(19);
                                  return;
                                default:
                                  super(0);
                                  return;
                            }
                      }
                   }else {
                      super(8);
                      return;
                   }
                }else {
                   super(p1);
                   return;
                }
             }else {
                super(p1);
                return;
             }
          }else {
             super(p1);
             return;
          }
       }else {
          super(p1);
          return;
       }
    }
    public Object a(Object p0){
       int i;
       switch (this.a){
           case 3:
             if (i = p0.intValue()) {
                i = (i != 1)? null: vu3.c;
             }else {
                i = vu3.b;
             }
             if (i == null) {
                i = vu3.t;
             }
             break;
           default:
             if ((p0 = q84.a(p0.intValue())) == null) {
                p0 = q84.b;
             }
             return p0;
       }
       return i;
    }
    public Object k(){
       switch (this.a){
           case 0:
           default:
             return new ArrayDeque();
       }
       return new TreeMap();
    }
}
