package p.sv5;
import p.ka4;
import p.qf2;
import android.content.Context;
import p.nf2;
import java.lang.String;
import android.content.SharedPreferences;
import java.lang.Object;
import java.lang.Long;
import android.content.SharedPreferences$Editor;
import java.lang.Integer;
import p.kg4;
import java.lang.Class;
import android.content.ContentValues;
import java.lang.System;

public final class sv5 extends ka4	// class@0026a9 from classes.dex
{
    public final int c;
    public final Object d;

    public void sv5(){
       this.c = 2;
       super(14, 15);
       this.d = new qf2();
    }
    public void sv5(Context p0){
       this.c = 1;
       super(9, 10);
       this.d = p0;
    }
    public void sv5(Context p0,int p1,int p2){
       this.c = 0;
       super(p1, p2);
       this.d = p0;
    }
    public final void a(nf2 p0){
       String str = "INSERT OR REPLACE INTO `Preference` \(`key`, `long_value`\) VALUES \(@key, @long_value\)";
       int i = 2;
       String str1 = "androidx.work.util.preferences";
       String str2 = "reschedule_needed";
       sv5 td = this.d;
       switch (this.c){
           case 0:
             if (this.b >= 10) {
                Object[] objArray = new Object[i];
                objArray[0] = str2;
                objArray[1] = Integer.valueOf(1);
                p0.R(str, objArray);
             }else {
                td.getSharedPreferences(str1, 0).edit().putBoolean(str2, 1).apply();
             }
             break;
           case 1:
             p0.r("CREATE TABLE IF NOT EXISTS `Preference` \(`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY\(`key`\)\)");
             SharedPreferences sharedPrefer = td.getSharedPreferences(str1, 0);
             String str3 = "last_cancel_all_time_ms";
             if (sharedPrefer.contains(str2) || sharedPrefer.contains(str3)) {
                long l = 0;
                long longx = sharedPrefer.getLong(str3, l);
                if (sharedPrefer.getBoolean(str2, 0)) {
                   l = 1;
                }
                p0.h();
                Object[] objArray1 = new Object[i];
                objArray1[0] = str3;
                objArray1[1] = Long.valueOf(longx);
                p0.R(str, objArray1);
                objArray1 = new Object[i];
                objArray1[0] = str2;
                objArray1[1] = Long.valueOf(l);
                p0.R(str, objArray1);
                sharedPrefer.edit().clear().apply();
                p0.Q();
                p0.g();
             }
             sharedPrefer = td.getSharedPreferences("androidx.work.util.id", 0);
             str1 = "next_job_scheduler_id";
             if (sharedPrefer.contains(str1) || sharedPrefer.contains(str1)) {
                p0.h();
                Object[] objArray2 = new Object[i];
                objArray2[0] = str1;
                objArray2[1] = Integer.valueOf(sharedPrefer.getInt(str1, 0));
                p0.R(str, objArray2);
                Object[] objArray3 = new Object[i];
                objArray3[0] = "next_alarm_manager_id";
                objArray3[1] = Integer.valueOf(sharedPrefer.getInt("next_alarm_manager_id", 0));
                p0.R(str, objArray3);
                sharedPrefer.edit().clear().apply();
                p0.Q();
                p0.g();
             }
             return;
             break;
           default:
             kg4.w(p0, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` \(`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY\(`id`\)\)", "INSERT INTO `_new_WorkSpec` \(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`\) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`
    ,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`", "DROP TABLE `WorkSpec`", "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
             p0.r("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` \(`schedule_requested_at`\)");
             p0.r("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` \(`last_enqueue_time`\)");
             td.getClass();
             p0.r("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
             ContentValues uContentValu = new ContentValues(1);
             uContentValu.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
             Object[] objArray4 = new Object[0];
             p0.b("WorkSpec", 3, uContentValu, "last_enqueue_time = 0 AND interval_duration <> 0 ", objArray4);
             return;
       }
       return;
    }
}
