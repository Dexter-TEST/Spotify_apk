package p.db4;
import p.eb4;
import java.lang.Object;
import p.jb7;
import p.kb7;
import p.lb7;
import java.lang.String;
import java.lang.Integer;
import java.util.ArrayList;

public final class db4	// class@001316 from classes.dex
{
    public final kb7 a;
    public final eb4 b;

    public void db4(eb4 p0,int p1){
       jb7 ojb7;
       lb7 p1;
       int i = 1;
       if (p1 != i) {
          this.b = p0;
          super();
          ojb7 = p0.b.b();
          p1 = new lb7("back_button", null, null, null, null);
          ojb7.i.add(p1);
          ojb7.j = false;
          this.a = ojb7.a();
          return;
       }else {
          this.b = p0;
          super();
          ojb7 = p0.b.b();
          lb7 p11 = new lb7("skip_modal", null, null, null, null);
          ojb7.i.add(p1);
          ojb7.j = i;
          this.a = ojb7.a();
          return;
       }
    }
}
