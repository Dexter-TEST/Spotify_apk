package p.dr7;
import java.util.UUID;
import p.jr7;
import java.util.Set;
import java.lang.Object;
import java.lang.String;
import p.co5;

public abstract class dr7	// class@0013a3 from classes.dex
{
    public final UUID a;
    public final jr7 b;
    public final Set c;

    public void dr7(UUID p0,jr7 p1,Set p2){
       co5.o(p0, "id");
       co5.o(p1, "workSpec");
       co5.o(p2, "tags");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
}
