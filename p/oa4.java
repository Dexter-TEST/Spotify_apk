package p.oa4;
import p.ka4;
import p.nf2;
import java.lang.String;
import p.kg4;

public final class oa4 extends ka4	// class@0020e0 from classes.dex
{
    public static final oa4 c;

    static {
       oa4.c = new oa4();
    }
    public void oa4(){
       super(1, 2);
    }
    public final void a(nf2 p0){
       kg4.w(p0, "\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` \(`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY\(`work_spec_id`\), FOREIGN KEY\(`work_spec_id`\)\n    REFERENCES `WorkSpec`\(`id`\) ON UPDATE CASCADE ON DELETE CASCADE \)\n    ", "\n    INSERT INTO SystemIdInfo\(work_spec_id, system_id\)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ", "DROP TABLE IF EXISTS alarmInfo", "\n                INSERT OR IGNORE INTO worktag\(tag, work_spec_id\)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
