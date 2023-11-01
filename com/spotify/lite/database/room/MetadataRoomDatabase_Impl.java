package com.spotify.lite.database.room.MetadataRoomDatabase_Impl;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.kf6;
import p.xy5;
import p.i77;
import p.oe7;
import p.rw6;
import p.nw6;
import java.lang.String;
import android.database.Cursor;
import p.vc3;
import java.util.HashMap;
import p.o51;
import p.yy5;
import p.mq7;
import android.content.Context;
import p.ow6;
import p.pw6;
import p.qw6;
import java.util.LinkedHashMap;
import java.util.List;
import p.ka4;
import java.lang.Object;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.Collections;
import p.j8;
import p.zk;
import p.ko1;
import p.t63;
import p.fh5;
import p.g12;
import p.g56;
import p.j56;

public final class MetadataRoomDatabase_Impl extends MetadataRoomDatabase	// class@000911 from classes.dex
{
    public j8 l;
    public zk m;
    public ko1 n;
    public t63 o;
    public fh5 p;
    public kf6 q;
    public i77 r;
    public oe7 s;
    public g12 t;
    public j56 u;

    public void MetadataRoomDatabase_Impl(){
       super();
    }
    public final kf6 A(){
       if (this.q != null) {
          return this.q;
       }
       _monitor_enter(this);
       if (this.q == null) {
          this.q = new kf6(this, 0);
       }
       _monitor_exit(this);
       return this.q;
    }
    public final i77 B(){
       if (this.r != null) {
          return this.r;
       }
       _monitor_enter(this);
       if (this.r == null) {
          this.r = new i77(this);
       }
       _monitor_exit(this);
       return this.r;
    }
    public final oe7 C(){
       if (this.s != null) {
          return this.s;
       }
       _monitor_enter(this);
       if (this.s == null) {
          this.s = new oe7(this);
       }
       _monitor_exit(this);
       return this.s;
    }
    public final void d(){
       this.a();
       nw6 onw6 = this.i().Y();
       this.c();
       onw6.r("PRAGMA defer_foreign_keys = TRUE");
       onw6.r("DELETE FROM `playlists`");
       onw6.r("DELETE FROM `albums`");
       onw6.r("DELETE FROM `album_artists`");
       onw6.r("DELETE FROM `artists`");
       onw6.r("DELETE FROM `users`");
       onw6.r("DELETE FROM `images`");
       onw6.r("DELETE FROM `favorite_tracks`");
       onw6.r("DELETE FROM `favorite_playlists`");
       onw6.r("DELETE FROM `favorite_albums`");
       onw6.r("DELETE FROM `favorite_artists`");
       onw6.r("DELETE FROM `shows`");
       onw6.r("DELETE FROM `episode_progress`");
       onw6.r("DELETE FROM `episodes`");
       onw6.r("DELETE FROM `favorite_shows`");
       onw6.r("DELETE FROM `favorite_episodes`");
       onw6.r("DELETE FROM `tracks`");
       onw6.r("DELETE FROM `track_artists`");
       onw6.r("DELETE FROM `track_rows`");
       this.r();
       this.m();
       onw6.a0("PRAGMA wal_checkpoint\(FULL\)").close();
       if (!onw6.G()) {
          onw6.r("VACUUM");
       }
       return;
    }
    public final vc3 f(){
       String[] stringArray = new String[]{"playlists","albums","album_artists","artists","users","images","favorite_tracks","favorite_playlists","favorite_albums","favorite_artists","shows","episodes","episode_progress","favorite_shows","favorite_episodes","tracks","track_artists","track_rows"};
       return new vc3(this, new HashMap(0), new HashMap(0), stringArray);
    }
    public final rw6 g(o51 p0){
       ow6 oow6 = pw6.a(p0.a);
       oow6.b = p0.b;
       oow6.c = new yy5(p0, new mq7(this, 15, 2), "25bd3ff512a3ce6aa478f8d30613bf75", "8283384f44f9d843e00449175eeeaf4c");
       return p0.c.f(oow6.a());
    }
    public final List h(LinkedHashMap p0){
       ka4[] oka4Array = new ka4[0];
       return Arrays.asList(oka4Array);
    }
    public final Set j(){
       return new HashSet();
    }
    public final Map k(){
       HashMap hashMap = new HashMap();
       hashMap.put(j8.class, Collections.emptyList());
       hashMap.put(zk.class, Collections.emptyList());
       hashMap.put(ko1.class, Collections.emptyList());
       hashMap.put(t63.class, Collections.emptyList());
       hashMap.put(fh5.class, Collections.emptyList());
       hashMap.put(kf6.class, Collections.emptyList());
       hashMap.put(i77.class, Collections.emptyList());
       hashMap.put(oe7.class, Collections.emptyList());
       hashMap.put(g12.class, Collections.emptyList());
       hashMap.put(g56.class, Collections.emptyList());
       return hashMap;
    }
    public final j8 t(){
       if (this.l != null) {
          return this.l;
       }
       _monitor_enter(this);
       if (this.l == null) {
          this.l = new j8(this);
       }
       _monitor_exit(this);
       return this.l;
    }
    public final zk u(){
       if (this.m != null) {
          return this.m;
       }
       _monitor_enter(this);
       if (this.m == null) {
          this.m = new zk(this);
       }
       _monitor_exit(this);
       return this.m;
    }
    public final ko1 v(){
       if (this.n != null) {
          return this.n;
       }
       _monitor_enter(this);
       if (this.n == null) {
          this.n = new ko1(this);
       }
       _monitor_exit(this);
       return this.n;
    }
    public final g12 w(){
       if (this.t != null) {
          return this.t;
       }
       _monitor_enter(this);
       if (this.t == null) {
          this.t = new g12(this);
       }
       _monitor_exit(this);
       return this.t;
    }
    public final t63 x(){
       if (this.o != null) {
          return this.o;
       }
       _monitor_enter(this);
       if (this.o == null) {
          this.o = new t63(this);
       }
       _monitor_exit(this);
       return this.o;
    }
    public final fh5 y(){
       if (this.p != null) {
          return this.p;
       }
       _monitor_enter(this);
       if (this.p == null) {
          this.p = new fh5(this);
       }
       _monitor_exit(this);
       return this.p;
    }
    public final g56 z(){
       if (this.u != null) {
          return this.u;
       }
       _monitor_enter(this);
       if (this.u == null) {
          this.u = new j56(this);
       }
       _monitor_exit(this);
       return this.u;
    }
}
