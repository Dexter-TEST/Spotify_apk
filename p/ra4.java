package p.ra4;
import p.ka4;
import p.nf2;
import java.lang.String;

public final class ra4 extends ka4	// class@0024ab from classes.dex
{
    public static final ra4 c;

    static {
       ra4.c = new ra4();
    }
    public void ra4(){
       super(6, 7);
    }
    public final void a(nf2 p0){
       p0.r("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` \(`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY\(`work_spec_id`\), FOREIGN KEY\(`work_spec_id`\)\n    REFERENCES `WorkSpec`\(`id`\) ON UPDATE CASCADE ON DELETE CASCADE \)\n    ");
    }
}
