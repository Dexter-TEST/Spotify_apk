package p.op2;
import p.g70;
import java.lang.Object;
import p.mp2;
import p.sm2;
import java.lang.String;

public final class op2	// class@0002e8 from classes2.dex
{
    public final g70 a;
    public long b;

    public void op2(g70 p0){
       super();
       this.a = p0;
       this.b = 0x40000;
    }
    public final mp2 a(){
       sm2 osm2 = new sm2();
       while (true) {
          String str = this.a.O(this.b);
          long l = this.b - (long)str.length();
          this.b = l;
          if (!str.length()) {
             l = 1;
          label_0020 :
             if (l) {
                break ;
             }else {
                osm2.c(str);
             }
          }else {
             l = 0;
             goto label_0020 ;
          }
       }
       return osm2.e();
    }
}
