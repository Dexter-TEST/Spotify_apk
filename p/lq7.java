package p.lq7;
import p.ka4;
import java.lang.Object;
import p.nf2;
import java.lang.String;
import p.kg4;

public final class lq7 extends ka4	// class@001da6 from classes.dex
{
    public final int c;

    public void lq7(int p0){
       this.c = p0;
       if (p0 != 3) {
          if (p0 != 4) {
             if (p0 != 5) {
                int i = 12;
                if (p0 != 7) {
                   if (p0 != 8) {
                      if (p0 != 10) {
                         super(6, 7);
                         return;
                      }else {
                         super(14, 15);
                         return;
                      }
                   }else {
                      super(i, 13);
                      return;
                   }
                }else {
                   super(11, i);
                   return;
                }
             }else {
                super(9, 10);
                return;
             }
          }else {
             super(8, 9);
             return;
          }
       }else {
          super(7, 8);
          return;
       }
    }
    public void lq7(int p0,int p1){
       this.c = p0;
       super(13, 14);
    }
    public void lq7(int p0,Object p1){
       this.c = p0;
       super(10, 11);
    }
    public final void a(nf2 p0){
       switch (this.c){
           case 0:
             kg4.w(p0, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` \(`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY\(`id`\)\)", "INSERT INTO `_new_WorkSpec` \(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`\) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`
    ,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`", "DROP TABLE `WorkSpec`", "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
             p0.r("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` \(`schedule_requested_at`\)");
             p0.r("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` \(`period_start_time`\)");
             return;
           case 1:
             p0.r("CREATE TABLE IF NOT EXISTS RateLimitedEvents \(eventName TEXT NOT NULL PRIMARY KEY,count INTEGER NOT NULL,timestamp INTEGER NOT NULL\)");
             return;
           case 2:
             p0.r("ALTER TABLE Events ADD COLUMN authenticated INTEGER");
             return;
           case 3:
             p0.r("ALTER TABLE Events ADD COLUMN owner TEXT");
             return;
           case 4:
             p0.r("DROP TABLE EventSequenceNumbers");
             p0.r("CREATE TABLE EventSequenceNumbers \(eventName TEXT NOT NULL,sequenceId BLOB NOT NULL,sequenceNumberNext INTEGER NOT NULL,PRIMARY KEY\(eventName, sequenceId\)\)");
             return;
           case 5:
             p0.r("ALTER TABLE Events ADD COLUMN deviceId TEXT");
             return;
           case 6:
             p0.r("ALTER TABLE `episodes` ADD COLUMN `preview_id` text");
             return;
           case 7:
             p0.r("CREATE INDEX IF NOT EXISTS `index_track_rows_parent_uri_position` ON `track_rows` \(`parent_uri`, `position`\)");
             return;
           case 8:
             kg4.w(p0, "ALTER TABLE `episodes` ADD COLUMN `image` text", "ALTER TABLE `tracks` ADD COLUMN `album_name` text", "ALTER TABLE `tracks` ADD COLUMN `album_image` text", "ALTER TABLE `tracks` ADD COLUMN `artist_names` text");
             kg4.w(p0, "ALTER TABLE `tracks` ADD COLUMN `artist_uri` text", "UPDATE tracks SET album_name = \(SELECT name FROM albums WHERE albums.uri = tracks.album_uri\)", "UPDATE tracks SET album_image = \(SELECT url FROM images WHERE images.parent_uri = tracks.album_uri\)", "UPDATE tracks SET artist_names = \(SELECT group_concat\(artists.name, \", \"\) FROM track_artists\nINNER JOIN artists ON track_artists.artist_uri = artists.uri\nWHERE track_artists.track_uri = tracks.uri\)");
             p0.r("UPDATE tracks SET artist_uri = \(SELECT artists.uri FROM track_artists\nINNER JOIN artists ON track_artists.artist_uri = artists.uri\nWHERE track_artists.track_uri = tracks.uri\)");
             return;
           case 9:
             kg4.w(p0, "ALTER TABLE `albums` ADD COLUMN `tag` TEXT", "ALTER TABLE `artists` ADD COLUMN `tag` TEXT", "ALTER TABLE `episodes` ADD COLUMN `tag` TEXT", "ALTER TABLE `playlists` ADD COLUMN `tag` TEXT");
             p0.r("ALTER TABLE `shows` ADD COLUMN `tag` TEXT");
             p0.r("ALTER TABLE `tracks` ADD COLUMN `tag` TEXT");
             p0.r("ALTER TABLE `users` ADD COLUMN `tag` TEXT");
             return;
           default:
             p0.r("DELETE from tracks");
             return;
       }
    }
}
