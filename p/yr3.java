package p.yr3;
import p.w47;
import java.lang.Object;
import p.a47;
import java.lang.String;
import p.co5;
import p.n26;
import java.lang.CharSequence;
import java.util.ArrayList;
import p.zf2;

public final class yr3 implements w47	// class@002e11 from classes.dex
{

    public void yr3(){
       super();
    }
    public final void a(a47 p0){
       int i3;
       co5.o(p0, "measurement");
       String str = p0.toString();
       n26 o = n26.O;
       co5.o(str, "<this>");
       int i = str.length();
       int i1 = i / 4000;
       int i2 = (!((i % 4000)))? 0: 1;
       ArrayList uArrayList = new ArrayList((i1 + i2));
       i1 = 0;
       while (true) {
          if (i1 >= 0 && i1 < i) {
             i3 = 1;
          label_002d :
             if (i3) {
                int i4 = ((i3 = i1 + 4000) >= 0 && i3 <= i)? i3: i;
                uArrayList.add(o.invoke(str.subSequence(i1, i4)));
                i1 = i3;
             }else {
                break ;
             }
          }else {
             i3 = 0;
             goto label_002d ;
          }
       }
       return;
    }
}
