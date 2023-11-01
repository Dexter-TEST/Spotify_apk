package p.yu;
import java.lang.Object;
import p.zu;
import java.lang.String;
import p.kg4;
import java.lang.Long;
import java.lang.IllegalStateException;

public final class yu	// class@002e30 from classes.dex
{
    public String a;
    public String b;
    public String c;
    public String d;
    public Long e;

    public void yu(){
       super();
    }
    public final zu a(){
       String str = (this.b == null)? " uri": "";
       if (this.c == null) {
          str = str.concat(" name");
       }
       if (this.e == null) {
          str = kg4.l(str, " created");
       }
       if (str.isEmpty()) {
          zu str1 = new zu(this.a, this.b, this.c, this.d, this.e.longValue());
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
}
