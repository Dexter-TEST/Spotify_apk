package p.na4;
import p.ka4;
import p.nf2;
import java.lang.String;
import p.kg4;

public final class na4 extends ka4	// class@001f9c from classes.dex
{
    public static final na4 c;

    static {
       na4.c = new na4();
    }
    public void na4(){
       super(15, 16);
    }
    public final void a(nf2 p0){
       kg4.w(p0, "DELETE FROM SystemIdInfo WHERE work_spec_id IN \(SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL\)", "ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0", "CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` \(\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY\(`work_spec_id`, `generation`\), \n            FOREIGN KEY\(`work_spec_id`\) REFERENCES `WorkSpec`\(`id`\) \n                ON UPDATE CASCADE ON DELETE CASCADE \)", "INSERT INTO `_new_SystemIdInfo` \(`work_spec_id`,`system_id`\) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
       p0.r("DROP TABLE `SystemIdInfo`");
       p0.r("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
    }
}
