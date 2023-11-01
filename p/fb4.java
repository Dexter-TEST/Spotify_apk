package p.fb4;
import p.hb7;
import java.lang.Object;
import p.kb7;
import java.util.ArrayList;
import p.lb7;
import java.lang.String;
import java.lang.Integer;
import java.util.Collection;
import java.util.List;

public final class fb4	// class@001596 from classes.dex
{
    public final hb7 a;
    public final kb7 b;

    public void fb4(){
       super();
       this.a = hb7.a;
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       lb7 v12 = new lb7("mobile-allboarding-search", null, null, null, null);
       uArrayList1.add(v12);
       if ((uArrayList.isEmpty() ^ 0x01)) {
          uArrayList1.addAll(uArrayList);
       }
       kb7 v121 = new kb7("4.1.0", "14.20.0", "music", uArrayList1, false, "", "");
       this.b = v12;
       return;
    }
}
