package p.ma4;
import p.ka4;
import p.nf2;
import java.lang.String;

public final class ma4 extends ka4	// class@001e58 from classes.dex
{
    public static final ma4 c;

    static {
       ma4.c = new ma4();
    }
    public void ma4(){
       super(12, 13);
    }
    public final void a(nf2 p0){
       p0.r("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
       p0.r("UPDATE workspec SET content_uri_triggers = x\'\' WHERE content_uri_triggers is NULL");
    }
}
