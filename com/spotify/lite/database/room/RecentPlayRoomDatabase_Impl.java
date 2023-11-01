package com.spotify.lite.database.room.RecentPlayRoomDatabase_Impl;
import com.spotify.lite.database.room.RecentPlayRoomDatabase;
import p.xy5;
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
import p.lq5;

public final class RecentPlayRoomDatabase_Impl extends RecentPlayRoomDatabase	// class@000915 from classes.dex
{
    public lq5 l;

    public void RecentPlayRoomDatabase_Impl(){
       super();
    }
    public final void d(){
       this.a();
       nw6 onw6 = this.i().Y();
       this.c();
       onw6.r("DELETE FROM `recent_play`");
       this.r();
       this.m();
       onw6.a0("PRAGMA wal_checkpoint\(FULL\)").close();
       if (!onw6.G()) {
          onw6.r("VACUUM");
       }
       return;
    }
    public final vc3 f(){
       String[] stringArray = new String[]{"recent_play"};
       return new vc3(this, new HashMap(0), new HashMap(0), stringArray);
    }
    public final rw6 g(o51 p0){
       ow6 oow6 = pw6.a(p0.a);
       oow6.b = p0.b;
       oow6.c = new yy5(p0, new mq7(this, 1, 4), "636f5a0f313a9b2aa4de3e253e54aa16", "90e542a8b19e036b3e82ef20d765c415");
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
       hashMap.put(lq5.class, Collections.emptyList());
       return hashMap;
    }
    public final lq5 t(){
       if (this.l != null) {
          return this.l;
       }
       _monitor_enter(this);
       if (this.l == null) {
          this.l = new lq5(this);
       }
       _monitor_exit(this);
       return this.l;
    }
}
