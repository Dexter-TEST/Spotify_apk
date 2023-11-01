package p.hl6;
import p.il6;
import p.nk2;
import java.lang.Enum;
import java.util.EnumSet;
import android.view.View;
import p.ju2;
import p.uu2;
import p.bt2;
import android.widget.TextView;
import p.tu2;
import java.lang.String;
import java.lang.CharSequence;

public final class hl6 extends il6	// class@001877 from classes.dex
{
    public final int c;

    public void hl6(int p0){
       this.c = p0;
       nk2 y = nk2.y;
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                super(EnumSet.of(y), 0x7f0d0056);
                return;
             }else {
                super(EnumSet.of(y), 0x7f0d0059);
                return;
             }
          }else {
             super(EnumSet.of(y), 0x7f0d0058);
             return;
          }
       }else {
          super(EnumSet.of(y), 0x7f0d0057);
          return;
       }
    }
    public final void b(View p0,ju2 p1,uu2 p2,bt2 p3){
       switch (this.c){
           case 1:
           default:
             return;
       }
       p0.findViewById(R.id.title).setText(p1.y().d());
       return;
    }
}
