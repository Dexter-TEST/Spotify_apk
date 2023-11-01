package p.qa4;
import p.ka4;
import p.nf2;
import java.lang.String;

public final class qa4 extends ka4	// class@002363 from classes.dex
{
    public static final qa4 c;

    static {
       qa4.c = new qa4();
    }
    public void qa4(){
       super(4, 5);
    }
    public final void a(nf2 p0){
       p0.r("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
       p0.r("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
