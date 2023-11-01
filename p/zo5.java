package p.zo5;
import p.p74;
import p.s74;
import java.lang.String;
import java.lang.Object;

public final class zo5 implements p74	// class@002f39 from classes.dex
{
    public final s74 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public void zo5(s74 p0,String p1,Object[] p2){
       char c;
       char c1;
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       if ((c = p1.charAt(0)) < 0xd800) {
          this.d = c;
       }else {
          int i = c & 0x1fff;
          int i1 = 13;
          int i2 = 1;
          while (true) {
             int i3 = i2 + 1;
             if ((c1 = p1.charAt(i2)) >= 0xd800) {
                i2 = c1 & 0x1fff;
                i2 = i2 << i1;
                i = i | i2;
                i1 = i1 + 13;
                i2 = i3;
             }else {
                break ;
             }
          }
          this.d = i | (c1 << i1);
       }
       return;
    }
    public final s74 a(){
       return this.a;
    }
    public final Object[] b(){
       return this.c;
    }
    public final String c(){
       return this.b;
    }
    public final int d(){
       int i = 1;
       if (((this.d & i)) == i) {
       }else {
          i = 2;
       }
       return i;
    }
}
