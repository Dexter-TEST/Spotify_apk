package p.eb4;
import java.lang.String;
import p.hb7;
import java.lang.Object;
import p.co5;
import p.kb7;
import java.util.ArrayList;
import p.lb7;
import java.lang.Integer;
import java.util.Collection;
import java.util.List;

public final class eb4	// class@001455 from classes.dex
{
    public final hb7 a;
    public final kb7 b;

    public void eb4(String p0,hb7 p1){
       kb7 (uArrayList.isEmpty() ^ 0x01);
       co5.o(p1, "parentAbsoluteLocation");
       super();
       this.a = p1;
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       lb7 v3 = new lb7("mobile-allboarding-contentpicker", null, null, null, p0);
       uArrayList1.add(v3);
       if ((uArrayList.isEmpty() ^ 0x01)) {
          uArrayList1.addAll(uArrayList);
       }
       (uArrayList.isEmpty() ^ 0x01) = new kb7("11.0.0", "14.20.0", "music", uArrayList1, false, "", "");
       this.b = uArrayList.isEmpty() ^ 0x01;
       return;
    }
}
