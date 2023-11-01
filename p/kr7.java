package p.kr7;
import p.uy;
import p.xy5;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class kr7 extends uy	// class@001c6e from classes.dex
{
    public final int d;

    public void kr7(xy5 p0){
       this.d = 4;
       co5.o(p0, "database");
       super(p0);
    }
    public void kr7(xy5 p0,int p1){
       this.d = p1;
       super(p0);
    }
    public final String d(){
       switch (this.d){
           case 0:
             return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
           case 1:
             return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN \(2, 3, 5\)";
           case 2:
             return "DELETE FROM workspec WHERE state IN \(2, 3, 5\) AND \(SELECT COUNT\(*\)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         \(SELECT id FROM workspec WHERE state IN \(2, 3, 5\)\)\)";
           case 3:
             return "UPDATE workspec SET generation=generation+1 WHERE id=?";
           case 4:
             return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
           case 5:
             return "DELETE FROM workspec WHERE id=?";
           case 6:
             return "UPDATE workspec SET state=? WHERE id=?";
           case 7:
             return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
           case 8:
             return "UPDATE workspec SET output=? WHERE id=?";
           case 9:
             return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
           case 10:
             return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
           default:
             return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
       }
    }
}
