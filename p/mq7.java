package p.mq7;
import p.kd3;
import p.xy5;
import p.nf2;
import p.e67;
import java.util.HashMap;
import p.pz6;
import java.lang.String;
import java.lang.Object;
import java.util.HashSet;
import p.kg4;
import p.qz6;
import java.util.List;
import java.util.Arrays;
import p.sz6;
import p.tz6;
import java.util.Map;
import java.util.AbstractSet;

public final class mq7 extends kd3	// class@001ee9 from classes.dex
{
    public final int d;
    public final xy5 e;

    public void mq7(xy5 p0,int p1,int p2){
       this.d = p2;
       this.e = p0;
       super(p1);
    }
    private static e67 l(nf2 p0){
       nf2 onf2 = p0;
       HashMap hashMap = new HashMap(5);
       pz6 v2 = new pz6("tag", "TEXT", false, 0, null, 1);
       String str = "tag";
       hashMap.put(str, v2);
       String str1 = null;
       int i = 1;
       pz6 v21 = new pz6("uri", "TEXT", true, 1, str1, i);
       String str2 = "uri";
       hashMap.put(str2, v2);
       pz6 v22 = new pz6("name", "TEXT", true, 0, null, 1);
       String str3 = "name";
       hashMap.put(str3, v2);
       pz6 v23 = new pz6("user_uri", "TEXT", false, 0, str1, i);
       hashMap.put("user_uri", v2);
       pz6 v24 = new pz6("created", "INTEGER", true, 0, null, 1);
       String str4 = "created";
       HashSet hashSet = kg4.s(hashMap, str4, v2, 1);
       String[] stringArray = new String[]{"user_uri"};
       stringArray = new String[]{str2};
       qz6 v15 = new qz6("users", "NO ACTION", "NO ACTION", Arrays.asList(stringArray), Arrays.asList(stringArray));
       hashSet.add(v15);
       HashSet hashSet1 = new HashSet(1);
       String[] stringArray1 = new String[]{"user_uri"};
       String[] stringArray2 = new String[]{"ASC"};
       boolean b = false;
       hashSet1.add(new sz6("index_playlists_user_uri", b, Arrays.asList(stringArray1), Arrays.asList(stringArray2)));
       tz6 otz6 = new tz6("playlists", hashMap, hashSet, hashSet1);
       tz6 otz61 = tz6.a(onf2, "playlists");
       if (!otz6.equals(otz61)) {
          return new e67(kg4.n("playlists\(com.spotify.lite.database.entities.PlaylistEntity\).\n Expected:\n", otz6, "\n Found:\n", otz61), b);
       }
       hashMap = new HashMap(4);
       pz6 hashSet2 = new pz6("tag", "TEXT", false, 0, null, 1);
       hashMap.put(str, hashSet);
       pz6 hashSet3 = new pz6("uri", "TEXT", true, 1, null, 1);
       hashMap.put(str2, hashSet);
       pz6 hashSet4 = new pz6("name", "TEXT", true, 0, null, 1);
       hashMap.put(str3, hashSet);
       hashSet2 = new pz6("created", "INTEGER", true, 0, 0, 1);
       qz6 String str5 = "albums";
       tz6 otz62 = new tz6(str5, hashMap, kg4.s(hashMap, str4, hashSet, b), new HashSet(b));
       otz61 = tz6.a(onf2, str5);
       if (!otz62.equals(otz61)) {
          return new e67(kg4.n("albums\(com.spotify.lite.database.entities.AlbumEntity\).\n Expected:\n", otz62, "\n Found:\n", otz61), b);
       }
       hashMap = new HashMap(2);
       hashSet2 = new pz6("album_uri", "TEXT", true, 1, null, 1);
       hashMap.put("album_uri", otz6);
       pz6 otz63 = new pz6("artist_uri", "TEXT", 1, 2, null, 1);
       String str6 = "artist_uri";
       HashSet hashSet5 = new HashSet(2);
       String[] stringArray3 = new String[]{"album_uri"};
       stringArray2 = new String[]{"ASC"};
       String str7 = "album_uri";
       hashSet5.add(new sz6("index_album_artists_album_uri", b, Arrays.asList(stringArray3), Arrays.asList(stringArray2)));
       stringArray2 = new String[]{str6};
       stringArray3 = new String[]{"ASC"};
       hashSet5.add(new sz6("index_album_artists_artist_uri", b, Arrays.asList(stringArray2), Arrays.asList(stringArray3)));
       str5 = "album_artists";
       tz6 pz6 otz64 = new tz6(str5, hashMap, kg4.s(hashMap, str6, otz6, b), hashSet5);
       otz61 = tz6.a(onf2, str5);
       if (!otz64.equals(otz61)) {
          return new e67(kg4.n("album_artists\(com.spotify.lite.database.entities.AlbumArtistEntity\).\n Expected:\n", otz64, "\n Found:\n", otz61), b);
       }
       hashMap = new HashMap(4);
       otz63 = new pz6("tag", "TEXT", false, 0, null, 1);
       hashMap.put(str, otz64);
       otz64 = new pz6("uri", "TEXT", true, 1, null, 1);
       hashMap.put(str2, otz64);
       otz64 = new pz6("name", "TEXT", true, 0, null, 1);
       hashMap.put(str3, otz64);
       otz63 = new pz6("created", "INTEGER", true, 0, 0, 1);
       String str8 = "artists";
       tz6 otz65 = new tz6(str8, hashMap, kg4.s(hashMap, str4, otz64, b), new HashSet(b));
       otz61 = tz6.a(onf2, str8);
       if (!otz65.equals(otz61)) {
          return new e67(kg4.n("artists\(com.spotify.lite.database.entities.ArtistEntity\).\n Expected:\n", otz65, "\n Found:\n", otz61), b);
       }
       hashMap = new HashMap(5);
       otz63 = new pz6("tag", "TEXT", false, 0, 0, 1);
       hashMap.put(str, otz64);
       otz64 = new pz6("uri", "TEXT", true, 1, null, 1);
       hashMap.put(str2, otz64);
       boolean b1 = true;
       int i1 = 0;
       String str9 = null;
       int i2 = 1;
       otz64 = new pz6("username", "TEXT", b1, i1, str9, i2);
       hashMap.put("username", otz64);
       otz64 = new pz6("display_name", "TEXT", b1, i1, str9, i2);
       hashMap.put("display_name", otz64);
       otz64 = new pz6("created", "INTEGER", true, 0, null, 1);
       str8 = "users";
       otz65 = new tz6(str8, hashMap, kg4.s(hashMap, str4, otz64, b), new HashSet(b));
       otz61 = tz6.a(onf2, str8);
       if (!otz65.equals(otz61)) {
          return new e67(kg4.n("users\(com.spotify.lite.database.entities.UserEntity\).\n Expected:\n", otz65, "\n Found:\n", otz61), b);
       }
       hashMap = new HashMap(4);
       otz63 = new pz6("parent_uri", "TEXT", true, 1, null, 1);
       str5 = "parent_uri";
       hashMap.put(str5, otz64);
       v23 = new pz6("url", "TEXT", 1, 2, null, 1);
       hashMap.put("url", otz64);
       otz63 = new pz6("width", "INTEGER", false, 0, null, 1);
       hashMap.put("width", otz64);
       pz6 otz641 = new pz6("height", "INTEGER", false, 0, null, 1);
       String str10 = "images";
       tz6 otz66 = new tz6(str10, hashMap, kg4.s(hashMap, "height", otz64, b), new HashSet(b));
       otz61 = tz6.a(onf2, str10);
       if (!otz66.equals(otz61)) {
          return new e67(kg4.n("images\(com.spotify.lite.database.entities.ImageEntity\).\n Expected:\n", otz66, "\n Found:\n", otz61), b);
       }
       hashMap = new HashMap(1);
       otz63 = new pz6("uri", "TEXT", true, 1, null, 1);
       str10 = "favorite_tracks";
       otz66 = new tz6(str10, hashMap, kg4.s(hashMap, str2, otz64, b), new HashSet(b));
       otz61 = tz6.a(onf2, str10);
       if (!otz66.equals(otz61)) {
          return new e67(kg4.n("favorite_tracks\(com.spotify.lite.database.entities.FavoriteTrack\).\n Expected:\n", otz66, "\n Found:\n", otz61), b);
       }
       hashMap = new HashMap(1);
       otz63 = new pz6("uri", "TEXT", true, 1, null, 1);
       str10 = "favorite_playlists";
       otz66 = new tz6(str10, hashMap, kg4.s(hashMap, str2, otz64, b), new HashSet(b));
       otz61 = tz6.a(onf2, str10);
       if (!otz66.equals(otz61)) {
          return new e67(kg4.n("favorite_playlists\(com.spotify.lite.database.entities.FavoritePlaylist\).\n Expected:\n", otz66, "\n Found:\n", otz61), b);
       }
       hashMap = new HashMap(1);
       otz63 = new pz6("uri", "TEXT", true, 1, null, 1);
       str10 = "favorite_albums";
       otz66 = new tz6(str10, hashMap, kg4.s(hashMap, str2, otz64, b), new HashSet(b));
       otz61 = tz6.a(onf2, str10);
       if (!otz66.equals(otz61)) {
          return new e67(kg4.n("favorite_albums\(com.spotify.lite.database.entities.FavoriteAlbum\).\n Expected:\n", otz66, "\n Found:\n", otz61), b);
       }
       hashMap = new HashMap(1);
       otz63 = new pz6("uri", "TEXT", true, 1, null, 1);
       str10 = "favorite_artists";
       otz66 = new tz6(str10, hashMap, kg4.s(hashMap, str2, otz64, b), new HashSet(b));
       otz61 = tz6.a(onf2, str10);
       if (!otz66.equals(otz61)) {
          return new e67(kg4.n("favorite_artists\(com.spotify.lite.database.entities.FavoriteArtist\).\n Expected:\n", otz66, "\n Found:\n", otz61), b);
       }
       hashMap = new HashMap(7);
       otz63 = new pz6("tag", "TEXT", false, 0, null, 1);
       hashMap.put(str, otz64);
       otz64 = new pz6("uri", "TEXT", 1, 1, 0, 1);
       hashMap.put(str2, otz64);
       otz64 = new pz6("name", "TEXT", true, 0, null, 1);
       hashMap.put(str3, otz64);
       boolean b2 = true;
       int i3 = 0;
       String str11 = null;
       i1 = 1;
       pz6 otz642 = new pz6("description", "TEXT", b2, i3, str11, i1);
       str8 = "description";
       hashMap.put(str8, otz64);
       otz642 = new pz6("publisher", "TEXT", b2, i3, str11, i1);
       hashMap.put("publisher", otz64);
       pz6 otz643 = new pz6("created", "INTEGER", true, 0, null, 1);
       hashMap.put(str4, otz64);
       otz63 = new pz6("explicit", "INTEGER", true, 0, 0, 1);
       String str12 = "explicit";
       String str13 = "shows";
       tz6 otz67 = new tz6(str13, hashMap, kg4.s(hashMap, str12, otz64, 0), new HashSet(0));
       otz61 = tz6.a(onf2, str13);
       if (!otz67.equals(otz61)) {
          return new e67(kg4.n("shows\(com.spotify.lite.database.entities.ShowEntity\).\n Expected:\n", otz67, "\n Found:\n", otz61), false);
       }
       hashMap = new HashMap(13);
       i1 = 0;
       str9 = null;
       i2 = 1;
       otz63 = new pz6("tag", "TEXT", false, i1, str9, i2);
       hashMap.put(str, otz64);
       boolean b3 = true;
       pz6 otz644 = new pz6("uri", "TEXT", b3, 1, null, 1);
       hashMap.put(str2, otz64);
       pz6 otz645 = new pz6("podcast_uri", "TEXT", 1, 0, null, 1);
       hashMap.put("podcast_uri", otz64);
       otz644 = new pz6("name", "TEXT", 1, 0, 0, 1);
       hashMap.put(str3, otz64);
       pz6 otz646 = new pz6("description", "TEXT", true, 0, null, 1);
       hashMap.put(str8, otz64);
       boolean b4 = true;
       int i4 = 0;
       String str14 = null;
       int i5 = 1;
       otz644 = new pz6("podcast_name", "TEXT", b4, i4, str14, i5);
       hashMap.put("podcast_name", otz64);
       otz644 = new pz6("release_date", "TEXT", b4, i4, str14, i5);
       hashMap.put("release_date", otz64);
       otz644 = new pz6("duration", "INTEGER", b4, i4, str14, i5);
       hashMap.put("duration", otz64);
       otz644 = new pz6("playable", "INTEGER", b4, i4, str14, i5);
       str8 = "playable";
       hashMap.put(str8, otz64);
       i4 = 0;
       str14 = null;
       i5 = 1;
       otz63 = new pz6("explicit", "INTEGER", b3, i4, str14, i5);
       hashMap.put(str12, otz64);
       otz64 = new pz6("created", "INTEGER", true, i1, str9, i2);
       hashMap.put(str4, otz64);
       otz644 = new pz6("preview_id", "TEXT", false, i4, str14, i5);
       str10 = "preview_id";
       hashMap.put(str10, otz64);
       otz643 = new pz6("image", "TEXT", false, 0, null, 1);
       String str15 = str5;
       str5 = "episodes";
       tz6 otz68 = new tz6(str5, hashMap, kg4.s(hashMap, "image", otz64, 0), new HashSet(0));
       otz61 = tz6.a(onf2, str5);
       if (!otz68.equals(otz61)) {
          return new e67(kg4.n("episodes\(com.spotify.lite.database.entities.EpisodeEntity\).\n Expected:\n", otz68, "\n Found:\n", otz61), false);
       }
       hashMap = new HashMap(3);
       b1 = true;
       str9 = null;
       i2 = 1;
       hashSet4 = new pz6("episode_uri", "TEXT", b1, 1, str9, i2);
       hashMap.put("episode_uri", otz64);
       otz64 = new pz6("position", "INTEGER", b1, 0, str9, i2);
       hashMap.put("position", otz64);
       otz643 = new pz6("fully_played", "INTEGER", 1, 0, null, 1);
       String str16 = "position";
       hashSet = kg4.s(hashMap, "fully_played", otz64, 1);
       stringArray3 = new String[]{"episode_uri"};
       stringArray3 = new String[]{str2};
       str5 = new qz6("episodes", "NO ACTION", "NO ACTION", Arrays.asList(stringArray3), Arrays.asList(stringArray3));
       hashSet.add(str5);
       str13 = "episode_progress";
       tz6 otz69 = new tz6(str13, hashMap, hashSet, new HashSet(0));
       otz61 = tz6.a(onf2, str13);
       if (!otz69.equals(otz61)) {
          return new e67(kg4.n("episode_progress\(com.spotify.lite.database.entities.EpisodeProgressEntity\).\n Expected:\n", otz69, "\n Found:\n", otz61), false);
       }
       hashMap = new HashMap(1);
       pz6 hashSet6 = new pz6("uri", "TEXT", true, 1, null, 1);
       str13 = "favorite_shows";
       otz65 = new tz6(str13, hashMap, kg4.s(hashMap, str2, hashSet, 0), new HashSet(0));
       otz61 = tz6.a(onf2, str13);
       if (!otz65.equals(otz61)) {
          return new e67(kg4.n("favorite_shows\(com.spotify.lite.database.entities.FavoriteShow\).\n Expected:\n", otz65, "\n Found:\n", otz61), false);
       }
       hashMap = new HashMap(1);
       hashSet6 = new pz6("uri", "TEXT", true, 1, null, 1);
       str13 = "favorite_episodes";
       otz65 = new tz6(str13, hashMap, kg4.s(hashMap, str2, hashSet, 0), new HashSet(0));
       otz61 = tz6.a(onf2, str13);
       if (!otz65.equals(otz61)) {
          return new e67(kg4.n("favorite_episodes\(com.spotify.lite.database.entities.FavoriteEpisode\).\n Expected:\n", otz65, "\n Found:\n", otz61), false);
       }
       hashMap = new HashMap(12);
       boolean b5 = false;
       hashSet6 = new pz6("tag", "TEXT", b5, 0, 0, 1);
       hashMap.put(str, hashSet);
       pz6 hashSet7 = new pz6("uri", "TEXT", true, 1, null, 1);
       hashMap.put(str2, hashSet);
       otz645 = new pz6("album_uri", "TEXT", 1, 0, 0, 1);
       str13 = str7;
       hashMap.put(str13, hashSet);
       hashSet7 = new pz6("name", "TEXT", 1, 0, 0, 1);
       hashMap.put(str3, hashSet);
       hashSet7 = new pz6("explicit", "INTEGER", 1, 0, 0, 1);
       hashMap.put(str12, hashSet);
       hashSet7 = new pz6("playable", "INTEGER", 1, 0, 0, 1);
       hashMap.put(str8, hashSet);
       otz644 = new pz6("created", "INTEGER", true, 0, null, 1);
       hashMap.put(str4, hashSet);
       hashSet6 = new pz6("preview_id", "TEXT", b5, 0, null, 1);
       hashMap.put(str10, hashSet);
       boolean b6 = false;
       i4 = 0;
       String str17 = null;
       hashSet7 = new pz6("album_name", "TEXT", b6, i4, str17, 1);
       hashMap.put("album_name", hashSet);
       hashSet7 = new pz6("album_image", "TEXT", b6, i4, str17, 1);
       hashMap.put("album_image", hashSet);
       hashSet7 = new pz6("artist_names", "TEXT", b6, i4, str17, 1);
       hashMap.put("artist_names", hashSet);
       pz6 hashSet8 = new pz6("artist_uri", "TEXT", 0, 0, null, 1);
       HashSet hashSet9 = new HashSet(1);
       stringArray1 = new String[]{str13};
       String[] stringArray4 = new String[]{"ASC"};
       hashSet9.add(new sz6("index_tracks_album_uri", 0, Arrays.asList(stringArray1), Arrays.asList(stringArray4)));
       str3 = "tracks";
       tz6 otz610 = new tz6(str3, hashMap, kg4.s(hashMap, str6, hashSet, 0), hashSet9);
       otz61 = tz6.a(onf2, str3);
       if (!otz610.equals(otz61)) {
          return new e67(kg4.n("tracks\(com.spotify.lite.database.entities.TrackEntity\).\n Expected:\n", otz610, "\n Found:\n", otz61), false);
       }
       hashMap = new HashMap(2);
       hashSet6 = new pz6("track_uri", "TEXT", true, 1, null, 1);
       str2 = "track_uri";
       hashMap.put(str2, hashSet);
       otz641 = new pz6("artist_uri", "TEXT", 1, 2, null, 1);
       HashSet hashSet10 = new HashSet(2);
       stringArray4 = new String[]{str2};
       stringArray2 = new String[]{"ASC"};
       hashSet10.add(new sz6("index_track_artists_track_uri", 0, Arrays.asList(stringArray4), Arrays.asList(stringArray2)));
       stringArray4 = new String[]{str6};
       stringArray = new String[]{"ASC"};
       hashSet10.add(new sz6("index_track_artists_artist_uri", 0, Arrays.asList(stringArray4), Arrays.asList(stringArray)));
       otz610 = new tz6("track_artists", hashMap, kg4.s(hashMap, str6, hashSet, 0), hashSet10);
       otz61 = tz6.a(onf2, "track_artists");
       if (!otz610.equals(otz61)) {
          return new e67(kg4.n("track_artists\(com.spotify.lite.database.entities.TrackArtistEntity\).\n Expected:\n", otz610, "\n Found:\n", otz61), false);
       }
       hashMap = new HashMap(4);
       hashSet6 = new pz6("track_uri", "TEXT", true, 2, null, 1);
       hashMap.put(str2, hashSet);
       pz6 hashSet11 = new pz6("uid", "TEXT", true, 0, null, 1);
       hashMap.put("uid", hashSet);
       otz641 = new pz6("position", "INTEGER", 1, 0, null, 1);
       str17 = str16;
       hashMap.put(str17, hashSet);
       hashSet6 = new pz6("parent_uri", "TEXT", 1, 1, 0, 1);
       str12 = str15;
       hashSet = kg4.s(hashMap, str12, hashSet, 0);
       HashSet hashSet12 = new HashSet(3);
       stringArray2 = new String[]{str12};
       String[] stringArray5 = new String[]{"ASC"};
       hashSet12.add(new sz6("index_track_rows_parent_uri", 0, Arrays.asList(stringArray2), Arrays.asList(stringArray5)));
       String[] stringArray6 = new String[]{str2};
       stringArray2 = new String[]{"ASC"};
       hashSet12.add(new sz6("index_track_rows_track_uri", 0, Arrays.asList(stringArray6), Arrays.asList(stringArray2)));
       String[] stringArray7 = new String[]{str12,str17};
       stringArray1 = new String[]{"ASC","ASC"};
       hashSet12.add(new sz6("index_track_rows_parent_uri_position", 0, Arrays.asList(stringArray7), Arrays.asList(stringArray1)));
       otz610 = new tz6("track_rows", hashMap, hashSet, hashSet12);
       tz6 otz611 = tz6.a(onf2, "track_rows");
       if (!otz610.equals(otz611)) {
          return new e67(kg4.n("track_rows\(com.spotify.lite.database.entities.TrackRowEntity\).\n Expected:\n", otz610, "\n Found:\n", otz611), false);
       }
       return new e67(null, true);
    }
    public final void b(nf2 p0){
       switch (this.d){
           case 0:
             kg4.w(p0, "CREATE TABLE IF NOT EXISTS `Dependency` \(`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY\(`work_spec_id`, `prerequisite_id`\), FOREIGN KEY\(`work_spec_id`\) REFERENCES `WorkSpec`\(`id`\) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY\(`prerequisite_id`\) REFERENCES `WorkSpec`\(`id`\) ON UPDATE CASCADE ON DELETE CASCADE \)", "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` \(`work_spec_id`\)", "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` \(`prerequisite_id`\)", "CREATE TABLE IF NOT EXISTS `WorkSpec` \(`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY\(`id`\)\)");
             kg4.w(p0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` \(`schedule_requested_at`\)", "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` \(`last_enqueue_time`\)", "CREATE TABLE IF NOT EXISTS `WorkTag` \(`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY\(`tag`, `work_spec_id`\), FOREIGN KEY\(`work_spec_id`\) REFERENCES `WorkSpec`\(`id`\) ON UPDATE CASCADE ON DELETE CASCADE \)", "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` \(`work_spec_id`\)");
             kg4.w(p0, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` \(`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY\(`work_spec_id`, `generation`\), FOREIGN KEY\(`work_spec_id`\) REFERENCES `WorkSpec`\(`id`\) ON UPDATE CASCADE ON DELETE CASCADE \)", "CREATE TABLE IF NOT EXISTS `WorkName` \(`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY\(`name`, `work_spec_id`\), FOREIGN KEY\(`work_spec_id`\) REFERENCES `WorkSpec`\(`id`\) ON UPDATE CASCADE ON DELETE CASCADE \)", "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` \(`work_spec_id`\)", "CREATE TABLE IF NOT EXISTS `WorkProgress` \(`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY\(`work_spec_id`\), FOREIGN KEY\(`work_spec_id`\) REFERENCES `WorkSpec`\(`id`\) ON UPDATE CASCADE ON DELETE CASCADE \)");
             p0.r("CREATE TABLE IF NOT EXISTS `Preference` \(`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY\(`key`\)\)");
             p0.r("CREATE TABLE IF NOT EXISTS room_master_table \(id INTEGER PRIMARY KEY,identity_hash TEXT\)");
             p0.r("INSERT OR REPLACE INTO room_master_table \(id,identity_hash\) VALUES\(42, \'5181942b9ebc31ce68dacb56c16fd79f\'\)");
             return;
           case 1:
             kg4.w(p0, "CREATE TABLE IF NOT EXISTS `Events` \(`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `authenticated` INTEGER, `eventName` TEXT, `sequenceId` BLOB, `sequenceNumber` INTEGER NOT NULL, `fragments` BLOB, `owner` TEXT, `deviceId` TEXT\)", "CREATE INDEX IF NOT EXISTS `index_Events_eventName` ON `Events` \(`eventName`\)", "CREATE TABLE IF NOT EXISTS `EventSequenceNumbers` \(`eventName` TEXT NOT NULL, `sequenceId` BLOB NOT NULL, `sequenceNumberNext` INTEGER NOT NULL, PRIMARY KEY\(`eventName`, `sequenceId`\)\)", "CREATE TABLE IF NOT EXISTS `RateLimitedEvents` \(`eventName` TEXT NOT NULL, `count` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY\(`eventName`\)\)");
             p0.r("CREATE TABLE IF NOT EXISTS room_master_table \(id INTEGER PRIMARY KEY,identity_hash TEXT\)");
             p0.r("INSERT OR REPLACE INTO room_master_table \(id,identity_hash\) VALUES\(42, \'c6ffea087c1eb57023f5bbcc2c41e2ce\'\)");
             return;
           case 2:
             kg4.w(p0, "CREATE TABLE IF NOT EXISTS `playlists` \(`tag` TEXT, `uri` TEXT NOT NULL, `name` TEXT NOT NULL, `user_uri` TEXT, `created` INTEGER NOT NULL, PRIMARY KEY\(`uri`\), FOREIGN KEY\(`user_uri`\) REFERENCES `users`\(`uri`\) ON UPDATE NO ACTION ON DELETE NO ACTION \)", "CREATE INDEX IF NOT EXISTS `index_playlists_user_uri` ON `playlists` \(`user_uri`\)", "CREATE TABLE IF NOT EXISTS `albums` \(`tag` TEXT, `uri` TEXT NOT NULL, `name` TEXT NOT NULL, `created` INTEGER NOT NULL, PRIMARY KEY\(`uri`\)\)", "CREATE TABLE IF NOT EXISTS `album_artists` \(`album_uri` TEXT NOT NULL, `artist_uri` TEXT NOT NULL, PRIMARY KEY\(`album_uri`, `artist_uri`\)\)");
             kg4.w(p0, "CREATE INDEX IF NOT EXISTS `index_album_artists_album_uri` ON `album_artists` \(`album_uri`\)", "CREATE INDEX IF NOT EXISTS `index_album_artists_artist_uri` ON `album_artists` \(`artist_uri`\)", "CREATE TABLE IF NOT EXISTS `artists` \(`tag` TEXT, `uri` TEXT NOT NULL, `name` TEXT NOT NULL, `created` INTEGER NOT NULL, PRIMARY KEY\(`uri`\)\)", "CREATE TABLE IF NOT EXISTS `users` \(`tag` TEXT, `uri` TEXT NOT NULL, `username` TEXT NOT NULL, `display_name` TEXT NOT NULL, `created` INTEGER NOT NULL, PRIMARY KEY\(`uri`\)\)");
             kg4.w(p0, "CREATE TABLE IF NOT EXISTS `images` \(`parent_uri` TEXT NOT NULL, `url` TEXT NOT NULL, `width` INTEGER, `height` INTEGER, PRIMARY KEY\(`parent_uri`, `url`\)\)", "CREATE TABLE IF NOT EXISTS `favorite_tracks` \(`uri` TEXT NOT NULL, PRIMARY KEY\(`uri`\)\)", "CREATE TABLE IF NOT EXISTS `favorite_playlists` \(`uri` TEXT NOT NULL, PRIMARY KEY\(`uri`\)\)", "CREATE TABLE IF NOT EXISTS `favorite_albums` \(`uri` TEXT NOT NULL, PRIMARY KEY\(`uri`\)\)");
             kg4.w(p0, "CREATE TABLE IF NOT EXISTS `favorite_artists` \(`uri` TEXT NOT NULL, PRIMARY KEY\(`uri`\)\)", "CREATE TABLE IF NOT EXISTS `shows` \(`tag` TEXT, `uri` TEXT NOT NULL, `name` TEXT NOT NULL, `description` TEXT NOT NULL, `publisher` TEXT NOT NULL, `created` INTEGER NOT NULL, `explicit` INTEGER NOT NULL, PRIMARY KEY\(`uri`\)\)", "CREATE TABLE IF NOT EXISTS `episodes` \(`tag` TEXT, `uri` TEXT NOT NULL, `podcast_uri` TEXT NOT NULL, `name` TEXT NOT NULL, `description` TEXT NOT NULL, `podcast_name` TEXT NOT NULL, `release_date` TEXT NOT NULL, `duration` INTEGER NOT NULL, `playable` INTEGER NOT NULL, `explicit` INTEGER NOT NULL, `created` INTEGER NOT NULL, `preview_id` TEXT, `image` TEXT, PRIMARY KEY\(`uri`\)\)", "CREATE TABLE IF NOT EXISTS `episode_progress` \(`episode_uri` TEXT NOT NULL, `position` INTEGER NOT NULL, `fully_played` INTEGER NOT NULL, PRIMARY KEY\(`episode_uri`\), FOREIGN KEY\(`episode_uri`\) REFERENCES `episodes`\(`uri`\) ON UPDATE NO ACTION ON DELETE NO ACTION \)");
             kg4.w(p0, "CREATE TABLE IF NOT EXISTS `favorite_shows` \(`uri` TEXT NOT NULL, PRIMARY KEY\(`uri`\)\)", "CREATE TABLE IF NOT EXISTS `favorite_episodes` \(`uri` TEXT NOT NULL, PRIMARY KEY\(`uri`\)\)", "CREATE TABLE IF NOT EXISTS `tracks` \(`tag` TEXT, `uri` TEXT NOT NULL, `album_uri` TEXT NOT NULL, `name` TEXT NOT NULL, `explicit` INTEGER NOT NULL, `playable` INTEGER NOT NULL, `created` INTEGER NOT NULL, `preview_id` TEXT, `album_name` TEXT, `album_image` TEXT, `artist_names` TEXT, `artist_uri` TEXT, PRIMARY KEY\(`uri`\)\)", "CREATE INDEX IF NOT EXISTS `index_tracks_album_uri` ON `tracks` \(`album_uri`\)");
             kg4.w(p0, "CREATE TABLE IF NOT EXISTS `track_artists` \(`track_uri` TEXT NOT NULL, `artist_uri` TEXT NOT NULL, PRIMARY KEY\(`track_uri`, `artist_uri`\)\)", "CREATE INDEX IF NOT EXISTS `index_track_artists_track_uri` ON `track_artists` \(`track_uri`\)", "CREATE INDEX IF NOT EXISTS `index_track_artists_artist_uri` ON `track_artists` \(`artist_uri`\)", "CREATE TABLE IF NOT EXISTS `track_rows` \(`track_uri` TEXT NOT NULL, `uid` TEXT NOT NULL, `position` INTEGER NOT NULL, `parent_uri` TEXT NOT NULL, PRIMARY KEY\(`parent_uri`, `track_uri`\)\)");
             kg4.w(p0, "CREATE INDEX IF NOT EXISTS `index_track_rows_parent_uri` ON `track_rows` \(`parent_uri`\)", "CREATE INDEX IF NOT EXISTS `index_track_rows_track_uri` ON `track_rows` \(`track_uri`\)", "CREATE INDEX IF NOT EXISTS `index_track_rows_parent_uri_position` ON `track_rows` \(`parent_uri`, `position`\)", "CREATE TABLE IF NOT EXISTS room_master_table \(id INTEGER PRIMARY KEY,identity_hash TEXT\)");
             p0.r("INSERT OR REPLACE INTO room_master_table \(id,identity_hash\) VALUES\(42, \'25bd3ff512a3ce6aa478f8d30613bf75\'\)");
             return;
           case 3:
             p0.r("CREATE TABLE IF NOT EXISTS `network_bucket` \(`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `rx` INTEGER NOT NULL, `tx` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `connection_type` INTEGER NOT NULL\)");
             p0.r("CREATE TABLE IF NOT EXISTS room_master_table \(id INTEGER PRIMARY KEY,identity_hash TEXT\)");
             p0.r("INSERT OR REPLACE INTO room_master_table \(id,identity_hash\) VALUES\(42, \'229cf2ab17c40d72e33d025f165d0e50\'\)");
             return;
           case 4:
             p0.r("CREATE TABLE IF NOT EXISTS `recent_play` \(`id` INTEGER PRIMARY KEY AUTOINCREMENT, `timestamp` INTEGER, `uri` TEXT, `image_uri` TEXT, `title` TEXT, `context_uri` TEXT, `label` TEXT\)");
             p0.r("CREATE TABLE IF NOT EXISTS room_master_table \(id INTEGER PRIMARY KEY,identity_hash TEXT\)");
             p0.r("INSERT OR REPLACE INTO room_master_table \(id,identity_hash\) VALUES\(42, \'636f5a0f313a9b2aa4de3e253e54aa16\'\)");
             return;
           case 5:
             p0.r("CREATE TABLE IF NOT EXISTS `recent_search` \(`id` INTEGER PRIMARY KEY AUTOINCREMENT, `timestamp` INTEGER, `uri` TEXT, `image_uri` TEXT, `title` TEXT, `subtitle` TEXT, `label` TEXT\)");
             p0.r("CREATE TABLE IF NOT EXISTS room_master_table \(id INTEGER PRIMARY KEY,identity_hash TEXT\)");
             p0.r("INSERT OR REPLACE INTO room_master_table \(id,identity_hash\) VALUES\(42, \'ad576ca4b3c95472d59ca52dd6f60567\'\)");
             return;
           case 6:
             p0.r("CREATE TABLE IF NOT EXISTS `taste` \(`uri` TEXT NOT NULL, PRIMARY KEY\(`uri`\)\)");
             p0.r("CREATE TABLE IF NOT EXISTS room_master_table \(id INTEGER PRIMARY KEY,identity_hash TEXT\)");
             p0.r("INSERT OR REPLACE INTO room_master_table \(id,identity_hash\) VALUES\(42, \'dc68c03b4b5061612782f1ff3cbeb4d8\'\)");
             return;
           default:
             p0.r("CREATE TABLE IF NOT EXISTS `user` \(`id` TEXT NOT NULL, `birth_date` TEXT, `country` TEXT, `display_name` TEXT, `email` TEXT, `href` TEXT, `uri` TEXT, `product` TEXT, PRIMARY KEY\(`id`\)\)");
             p0.r("CREATE TABLE IF NOT EXISTS room_master_table \(id INTEGER PRIMARY KEY,identity_hash TEXT\)");
             p0.r("INSERT OR REPLACE INTO room_master_table \(id,identity_hash\) VALUES\(42, \'70d07dac4794b51b28506bcae05d9054\'\)");
             return;
       }
    }
    public final e67 k(nf2 p0){
       int i3;
       HashMap hashMap;
       String str8;
       HashSet hashSet;
       String[] stringArray;
       tz6 otz6;
       tz6 otz61;
       e67 uoe67;
       pz6 hashSet2;
       pz6 hashSet3;
       pz6 i3;
       pz6 i31;
       HashSet hashSet6;
       pz6 hashSet6;
       int i6;
       String[] stringArray6;
       tz6 otz64;
       pz6 hashSet62;
       pz6 hashSet63;
       tz6 otz65;
       pz6 str15;
       pz6 str16;
       e67 uoe671;
       pz6 i7;
       pz6 i8;
       nf2 onf2 = p0;
       String str = "label";
       String pz6 str1 = "title";
       String str2 = "image_uri";
       int i = 7;
       int qz6 i1 = 8;
       String str3 = "ASC";
       String str4 = "uri";
       String str5 = "timestamp";
       String str6 = "id";
       String str7 = null;
       int i2 = 1;
       boolean b = false;
       switch (this.d){
           case 0:
             i3 = 2;
             hashMap = new HashMap(i3);
             str1 = new pz6("work_spec_id", "TEXT", true, 1, null, 1);
             str8 = "work_spec_id";
             hashMap.put(str8, str1);
             str1 = new pz6("prerequisite_id", "TEXT", 1, 2, null, 1);
             hashSet = kg4.s(hashMap, "prerequisite_id", str1, i3);
             stringArray = new String[]{str8};
             stringArray = new String[]{str6};
             i1 = new qz6("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(stringArray), Arrays.asList(stringArray));
             hashSet.add(i1);
             stringArray = new String[]{"prerequisite_id"};
             stringArray = new String[]{str6};
             i1 = new qz6("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(stringArray), Arrays.asList(stringArray));
             hashSet.add(i1);
             HashSet hashSet1 = new HashSet(i3);
             String[] stringArray1 = new String[]{str8};
             String[] stringArray2 = new String[]{str3};
             hashSet1.add(new sz6("index_Dependency_work_spec_id", b, Arrays.asList(stringArray1), Arrays.asList(stringArray2)));
             String[] stringArray3 = new String[]{"prerequisite_id"};
             stringArray1 = new String[]{str3};
             hashSet1.add(new sz6("index_Dependency_prerequisite_id", b, Arrays.asList(stringArray3), Arrays.asList(stringArray1)));
             str4 = "Dependency";
             otz6 = new tz6(str4, hashMap, hashSet, hashSet1);
             otz61 = tz6.a(onf2, str4);
             if (!otz6.equals(otz61)) {
                uoe67 = new e67(kg4.n("Dependency\(androidx.work.impl.model.Dependency\).\n Expected:\n", otz6, "\n Found:\n", otz61), b);
             }else {
                hashMap = new HashMap(27);
                str1 = new pz6("id", "TEXT", true, 1, null, 1);
                hashMap.put(str6, hashSet);
                hashSet2 = new pz6("state", "INTEGER", 1, 0, null, 1);
                hashMap.put("state", hashSet);
                hashSet3 = new pz6("worker_class_name", "TEXT", 1, 0, null, 1);
                hashMap.put("worker_class_name", hashSet);
                str1 = new pz6("input_merger_class_name", "TEXT", false, 0, 0, 1);
                hashMap.put("input_merger_class_name", hashSet);
                boolean b1 = true;
                int i4 = 0;
                String str9 = null;
                int i5 = 1;
                pz6 hashSet4 = new pz6("input", "BLOB", b1, i4, str9, i5);
                hashMap.put("input", hashSet);
                hashSet4 = new pz6("output", "BLOB", b1, i4, str9, i5);
                hashMap.put("output", i3);
                hashSet4 = new pz6("initial_delay", "INTEGER", b1, i4, str9, i5);
                hashMap.put("initial_delay", i3);
                hashSet4 = new pz6("interval_duration", "INTEGER", b1, i4, str9, i5);
                hashMap.put("interval_duration", i3);
                hashSet4 = new pz6("flex_duration", "INTEGER", b1, i4, str9, i5);
                hashMap.put("flex_duration", i3);
                hashSet4 = new pz6("run_attempt_count", "INTEGER", b1, i4, str9, i5);
                hashMap.put("run_attempt_count", i3);
                hashSet4 = new pz6("backoff_policy", "INTEGER", b1, i4, str9, i5);
                hashMap.put("backoff_policy", i3);
                hashSet4 = new pz6("backoff_delay_duration", "INTEGER", b1, i4, str9, i5);
                hashMap.put("backoff_delay_duration", i3);
                hashSet4 = new pz6("last_enqueue_time", "INTEGER", b1, i4, str9, i5);
                hashMap.put("last_enqueue_time", i3);
                hashSet4 = new pz6("minimum_retention_duration", "INTEGER", b1, i4, str9, i5);
                hashMap.put("minimum_retention_duration", i3);
                hashSet4 = new pz6("schedule_requested_at", "INTEGER", b1, i4, str9, i5);
                hashMap.put("schedule_requested_at", i3);
                hashSet2 = new pz6("run_in_foreground", "INTEGER", true, 0, null, 1);
                hashMap.put("run_in_foreground", i3);
                i3 = new pz6("out_of_quota_policy", "INTEGER", true, 0, null, 1);
                hashMap.put("out_of_quota_policy", i3);
                i5 = 1;
                hashSet4 = new pz6("period_count", "INTEGER", b1, i4, "0", i5);
                hashMap.put("period_count", i3);
                hashSet4 = new pz6("generation", "INTEGER", b1, i4, "0", i5);
                String str10 = "generation";
                hashMap.put(str10, i3);
                str9 = null;
                hashSet4 = new pz6("required_network_type", "INTEGER", b1, i4, str9, i5);
                hashMap.put("required_network_type", i3);
                hashSet4 = new pz6("requires_charging", "INTEGER", b1, i4, str9, i5);
                hashMap.put("requires_charging", i3);
                hashSet4 = new pz6("requires_device_idle", "INTEGER", b1, i4, str9, i5);
                hashMap.put("requires_device_idle", i3);
                hashSet4 = new pz6("requires_battery_not_low", "INTEGER", b1, i4, str9, i5);
                hashMap.put("requires_battery_not_low", i3);
                hashSet4 = new pz6("requires_storage_not_low", "INTEGER", b1, i4, str9, i5);
                hashMap.put("requires_storage_not_low", i3);
                hashSet4 = new pz6("trigger_content_update_delay", "INTEGER", b1, i4, str9, i5);
                hashMap.put("trigger_content_update_delay", i3);
                str1 = new pz6("trigger_max_content_delay", "INTEGER", 1, 0, null, 1);
                hashMap.put("trigger_max_content_delay", i3);
                i31 = new pz6("content_uri_triggers", "BLOB", true, 0, null, 1);
                i2 = 0;
                HashSet hashSet5 = new HashSet(2);
                stringArray1 = new String[]{"schedule_requested_at"};
                stringArray2 = new String[]{str3};
                hashSet5.add(new sz6("index_WorkSpec_schedule_requested_at", i2, Arrays.asList(stringArray1), Arrays.asList(stringArray2)));
                String[] stringArray4 = new String[]{"last_enqueue_time"};
                stringArray1 = new String[]{str3};
                hashSet5.add(new sz6("index_WorkSpec_last_enqueue_time", i2, Arrays.asList(stringArray4), Arrays.asList(stringArray1)));
                str4 = "WorkSpec";
                tz6 otz62 = new tz6(str4, hashMap, kg4.s(hashMap, "content_uri_triggers", i3, i2), hashSet5);
                otz61 = tz6.a(onf2, str4);
                if (!otz62.equals(otz61)) {
                   uoe67 = new e67(kg4.n("WorkSpec\(androidx.work.impl.model.WorkSpec\).\n Expected:\n", otz62, "\n Found:\n", otz61), i2);
                }else {
                   hashMap = new HashMap(2);
                   str1 = new pz6("tag", "TEXT", true, 1, null, 1);
                   hashMap.put("tag", i3);
                   hashSet3 = new pz6("work_spec_id", "TEXT", 1, 2, null, 1);
                   hashSet6 = kg4.s(hashMap, str8, i3, 1);
                   stringArray3 = new String[]{str8};
                   stringArray3 = new String[]{str6};
                   i1 = new qz6("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(stringArray3), Arrays.asList(stringArray3));
                   hashSet6.add(otz62);
                   hashSet = new HashSet(1);
                   String[] stringArray5 = new String[]{str8};
                   stringArray = new String[]{str3};
                   hashSet.add(new sz6("index_WorkTag_work_spec_id", false, Arrays.asList(stringArray5), Arrays.asList(stringArray)));
                   String str11 = "WorkTag";
                   otz6 = new tz6(str11, hashMap, hashSet6, hashSet);
                   otz61 = tz6.a(onf2, str11);
                   if (!otz6.equals(otz61)) {
                      uoe67 = new e67(kg4.n("WorkTag\(androidx.work.impl.model.WorkTag\).\n Expected:\n", otz6, "\n Found:\n", otz61), false);
                   }else {
                      hashMap = new HashMap(3);
                      str1 = new pz6("work_spec_id", "TEXT", true, 1, null, 1);
                      hashMap.put(str8, hashSet6);
                      hashSet6 = new pz6("generation", "INTEGER", true, 2, "0", 1);
                      hashMap.put(str10, hashSet6);
                      hashSet3 = new pz6("system_id", "INTEGER", 1, 0, null, 1);
                      hashSet6 = kg4.s(hashMap, "system_id", hashSet6, 1);
                      stringArray3 = new String[]{str8};
                      stringArray3 = new String[]{str6};
                      qz6 hashSet7 = new qz6("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(stringArray3), Arrays.asList(stringArray3));
                      hashSet6.add(hashSet);
                      i6 = 0;
                      str4 = "SystemIdInfo";
                      tz6 otz63 = new tz6(str4, hashMap, hashSet6, new HashSet(i6));
                      otz61 = tz6.a(onf2, str4);
                      if (!otz63.equals(otz61)) {
                         uoe67 = new e67(kg4.n("SystemIdInfo\(androidx.work.impl.model.SystemIdInfo\).\n Expected:\n", otz63, "\n Found:\n", otz61), i6);
                      }else {
                         hashMap = new HashMap(2);
                         hashSet6 = new pz6("name", "TEXT", true, 1, null, 1);
                         hashMap.put("name", hashSet6);
                         hashSet6 = new pz6("work_spec_id", "TEXT", 1, 2, null, 1);
                         hashSet6 = kg4.s(hashMap, str8, hashSet6, 1);
                         stringArray3 = new String[]{str8};
                         stringArray3 = new String[]{str6};
                         hashSet7 = new qz6("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(stringArray3), Arrays.asList(stringArray3));
                         hashSet6.add(hashSet);
                         hashSet = new HashSet(1);
                         stringArray5 = new String[]{str8};
                         stringArray6 = new String[]{str3};
                         boolean b2 = false;
                         hashSet.add(new sz6("index_WorkName_work_spec_id", b2, Arrays.asList(stringArray5), Arrays.asList(stringArray6)));
                         str11 = "WorkName";
                         otz6 = new tz6(str11, hashMap, hashSet6, hashSet);
                         otz61 = tz6.a(onf2, str11);
                         if (!otz6.equals(otz61)) {
                            uoe67 = new e67(kg4.n("WorkName\(androidx.work.impl.model.WorkName\).\n Expected:\n", otz6, "\n Found:\n", otz61), b2);
                         }else {
                            hashMap = new HashMap(2);
                            hashSet6 = new pz6("work_spec_id", "TEXT", true, 1, null, 1);
                            hashMap.put(str8, hashSet6);
                            pz6 hashSet61 = new pz6("progress", "BLOB", true, 0, null, 1);
                            hashSet6 = kg4.s(hashMap, "progress", hashSet6, 1);
                            stringArray3 = new String[]{str8};
                            stringArray3 = new String[]{str6};
                            hashSet7 = new qz6("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(stringArray3), Arrays.asList(stringArray3));
                            hashSet6.add(hashSet);
                            i6 = 0;
                            str11 = "WorkProgress";
                            otz64 = new tz6(str11, hashMap, hashSet6, new HashSet(i6));
                            otz61 = tz6.a(onf2, str11);
                            if (!otz64.equals(otz61)) {
                               uoe67 = new e67(kg4.n("WorkProgress\(androidx.work.impl.model.WorkProgress\).\n Expected:\n", otz64, "\n Found:\n", otz61), i6);
                            }else {
                               hashMap = new HashMap(2);
                               hashSet62 = new pz6("key", "TEXT", true, 1, null, 1);
                               hashMap.put("key", hashSet6);
                               hashSet63 = new pz6("long_value", "INTEGER", false, 0, null, 1);
                               otz64 = new tz6("Preference", hashMap, kg4.s(hashMap, "long_value", hashSet6, 0), new HashSet(0));
                               otz65 = tz6.a(onf2, "Preference");
                               uoe67 = (!otz64.equals(otz65))? new e67(kg4.n("Preference\(androidx.work.impl.model.Preference\).\n Expected:\n", otz64, "\n Found:\n", otz65), 0): new e67(null, true);
                            }
                         }
                      }
                   }
                }
             }
             return uoe67;
             break;
           case 1:
             hashMap = new HashMap(i1);
             str1 = new pz6("id", "INTEGER", true, 1, 0, 1);
             hashMap.put(str6, str);
             boolean b3 = false;
             i6 = 0;
             pz6 str12 = new pz6("authenticated", "INTEGER", false, 0, null, 1);
             hashMap.put("authenticated", str);
             str1 = new pz6("eventName", "TEXT", b3, i6, null, 1);
             hashMap.put("eventName", str);
             i = 0;
             String str13 = null;
             i6 = 1;
             str12 = new pz6("sequenceId", "BLOB", 0, i, str13, i6);
             str8 = "sequenceId";
             hashMap.put(str8, str);
             str12 = new pz6("sequenceNumber", "INTEGER", true, i, str13, i6);
             hashMap.put("sequenceNumber", str);
             str12 = new pz6("fragments", "BLOB", false, i, str13, i6);
             hashMap.put("fragments", str);
             i3 = new pz6("owner", "TEXT", false, 0, null, 1);
             hashMap.put("owner", str);
             str1 = new pz6("deviceId", "TEXT", b3, i6, 0, 1);
             hashSet = new HashSet(i2);
             stringArray = new String[]{"eventName"};
             stringArray6 = new String[]{str3};
             hashSet.add(new sz6("index_Events_eventName", b, Arrays.asList(stringArray), Arrays.asList(stringArray6)));
             otz6 = new tz6("Events", hashMap, kg4.s(hashMap, "deviceId", str, b), hashSet);
             otz61 = tz6.a(onf2, "Events");
             if (!otz6.equals(otz61)) {
                uoe67 = new e67(kg4.n("Events\(com.spotify.eventsender.eventsender.dao.EventEntity\).\n Expected:\n", otz6, "\n Found:\n", otz61), b);
             }else {
                hashMap = new HashMap(3);
                str1 = new pz6("eventName", "TEXT", true, 1, null, 1);
                hashMap.put("eventName", str);
                pz6 str14 = new pz6("sequenceId", "BLOB", true, 2, null, 1);
                hashMap.put(str8, str);
                str15 = new pz6("sequenceNumberNext", "INTEGER", true, 0, null, 1);
                str8 = "EventSequenceNumbers";
                otz6 = new tz6(str8, hashMap, kg4.s(hashMap, "sequenceNumberNext", str, b), new HashSet(b));
                otz61 = tz6.a(onf2, str8);
                if (!otz6.equals(otz61)) {
                   uoe67 = new e67(kg4.n("EventSequenceNumbers\(com.spotify.eventsender.eventsender.dao.EventSequenceNumberEntity\).\n Expected:\n", otz6, "\n Found:\n", otz61), b);
                }else {
                   hashMap = new HashMap(3);
                   str1 = new pz6("eventName", "TEXT", true, 1, null, 1);
                   hashMap.put("eventName", str);
                   hashSet6 = new pz6("count", "INTEGER", true, 0, null, 1);
                   hashMap.put("count", str);
                   hashSet3 = new pz6("timestamp", "INTEGER", 1, 0, null, 1);
                   otz6 = new tz6("RateLimitedEvents", hashMap, kg4.s(hashMap, str5, str, b), new HashSet(b));
                   otz65 = tz6.a(onf2, "RateLimitedEvents");
                   uoe67 = (!otz6.equals(otz65))? new e67(kg4.n("RateLimitedEvents\(com.spotify.eventsender.ratelimiter.persisting.dao.RateLimitedEventEntity\).\n Expected:\n", otz6, "\n Found:\n", otz65), b): new e67(str7, i2);
                }
             }
             return uoe67;
             break;
           case 2:
           case 3:
             hashMap = new HashMap(5);
             str1 = new pz6("id", "INTEGER", true, 1, null, 1);
             hashMap.put(str6, str);
             str16 = new pz6("rx", "INTEGER", true, 0, null, 1);
             hashMap.put("rx", str);
             hashSet6 = new pz6("tx", "INTEGER", true, 0, null, 1);
             hashMap.put("tx", str);
             hashSet3 = new pz6("timestamp", "INTEGER", 1, 0, null, 1);
             hashMap.put(str5, str);
             hashSet3 = new pz6("connection_type", "INTEGER", 1, 0, 0, 1);
             otz6 = new tz6("network_bucket", hashMap, kg4.s(hashMap, "connection_type", str, b), new HashSet(b));
             otz65 = tz6.a(onf2, "network_bucket");
             uoe671 = (!otz6.equals(otz65))? new e67(kg4.n("network_bucket\(com.spotify.lite.database.entities.NetworkBucket\).\n Expected:\n", otz6, "\n Found:\n", otz65), b): new e67(str7, i2);
             return uoe671;
             break;
           case 4:
             hashMap = new HashMap(i);
             str1 = new pz6("id", "INTEGER", false, 1, null, 1);
             hashMap.put(str6, i);
             str16 = new pz6("timestamp", "INTEGER", false, 0, null, 1);
             hashMap.put(str5, i);
             i7 = new pz6("uri", "TEXT", false, 0, null, 1);
             hashMap.put(str4, i);
             i8 = new pz6("image_uri", "TEXT", false, 0, null, 1);
             hashMap.put(str2, i);
             str1 = new pz6("title", "TEXT", false, 0, null, 1);
             hashMap.put(str1, str2);
             hashSet62 = new pz6("context_uri", "TEXT", false, 0, null, 1);
             hashMap.put("context_uri", str1);
             hashSet3 = new pz6("label", "TEXT", 0, 0, null, 1);
             hashSet6 = kg4.s(hashMap, str, str1, b);
             otz6 = new tz6("recent_play", hashMap, hashSet6, new HashSet(b));
             otz65 = tz6.a(onf2, "recent_play");
             uoe671 = (!otz6.equals(otz65))? new e67(kg4.n("recent_play\(com.spotify.lite.database.entities.RecentPlay\).\n Expected:\n", otz6, "\n Found:\n", otz65), b): new e67(str7, i2);
             return uoe671;
             break;
           case 5:
             hashMap = new HashMap(i);
             str1 = new pz6("id", "INTEGER", false, 1, null, 1);
             hashMap.put(str6, i);
             str16 = new pz6("timestamp", "INTEGER", false, 0, null, 1);
             hashMap.put(str5, i);
             i7 = new pz6("uri", "TEXT", false, 0, null, 1);
             hashMap.put(str4, i);
             i8 = new pz6("image_uri", "TEXT", false, 0, null, 1);
             hashMap.put(str2, i);
             str1 = new pz6("title", "TEXT", false, 0, null, 1);
             hashMap.put(str1, str2);
             hashSet62 = new pz6("subtitle", "TEXT", false, 0, null, 1);
             hashMap.put("subtitle", str1);
             hashSet3 = new pz6("label", "TEXT", 0, 0, null, 1);
             hashSet6 = kg4.s(hashMap, str, str1, b);
             otz6 = new tz6("recent_search", hashMap, hashSet6, new HashSet(b));
             otz65 = tz6.a(onf2, "recent_search");
             uoe671 = (!otz6.equals(otz65))? new e67(kg4.n("recent_search\(com.spotify.lite.database.entities.RecentSearch\).\n Expected:\n", otz6, "\n Found:\n", otz65), b): new e67(str7, i2);
             return uoe671;
             break;
           case 6:
             hashMap = new HashMap(i2);
             str1 = new pz6("uri", "TEXT", true, 1, null, 1);
             otz6 = new tz6("taste", hashMap, kg4.s(hashMap, str4, str, b), new HashSet(b));
             otz65 = tz6.a(onf2, "taste");
             uoe671 = (!otz6.equals(otz65))? new e67(kg4.n("taste\(com.spotify.lite.database.entities.Taste\).\n Expected:\n", otz6, "\n Found:\n", otz65), b): new e67(str7, i2);
             return uoe671;
             break;
           default:
             hashMap = new HashMap(i1);
             hashSet63 = new pz6("id", "TEXT", true, 1, null, 1);
             hashMap.put(str6, str);
             hashSet2 = new pz6("birth_date", "TEXT", 0, 0, 0, 1);
             hashMap.put("birth_date", str);
             boolean b4 = false;
             i1 = 0;
             String str17 = null;
             i1 = 1;
             hashSet63 = new pz6("country", "TEXT", b4, i1, str17, i1);
             hashMap.put("country", str);
             hashSet63 = new pz6("display_name", "TEXT", b4, i1, str17, i1);
             hashMap.put("display_name", str);
             hashSet63 = new pz6("email", "TEXT", b4, i1, str17, i1);
             hashMap.put("email", str);
             hashSet63 = new pz6("href", "TEXT", b4, i1, str17, i1);
             hashMap.put("href", str);
             i31 = new pz6("uri", "TEXT", false, 0, null, 1);
             hashMap.put(str4, str);
             str15 = new pz6("product", "TEXT", false, 0, null, 1);
             otz64 = new tz6("user", hashMap, kg4.s(hashMap, "product", str, 0), new HashSet(0));
             otz65 = tz6.a(onf2, "user");
             uoe671 = (!otz64.equals(otz65))? new e67(kg4.n("user\(com.spotify.lite.database.entities.UserPrivate\).\n Expected:\n", otz64, "\n Found:\n", otz65), 0): new e67(null, true);
             return uoe671;
       }
       return mq7.l(p0);
    }
}
