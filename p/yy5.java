package p.yy5;
import p.kd3;
import p.o51;
import p.mq7;
import java.lang.String;
import p.nf2;
import android.database.Cursor;
import java.io.Closeable;
import java.lang.Throwable;
import p.eb3;
import p.e67;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import com.spotify.lite.database.room.TasteOnboardingRoomDatabase_Impl;
import p.xy5;
import java.util.List;
import java.lang.Object;
import p.wy5;
import java.lang.Class;
import com.spotify.lite.database.room.RecentSearchRoomDatabase_Impl;
import com.spotify.lite.database.room.RecentPlayRoomDatabase_Impl;
import com.spotify.lite.database.room.NetworkRoomDatabase_Impl;
import com.spotify.lite.database.room.MetadataRoomDatabase_Impl;
import com.spotify.eventsender.eventsender.EventSenderDatabase_Impl;
import androidx.work.impl.WorkDatabase_Impl;
import com.spotify.lite.database.room.UserRoomDatabase_Impl;
import p.zh6;
import p.tw6;
import p.co5;
import p.nw6;
import p.ll1;
import java.util.ArrayList;
import p.ia4;
import java.lang.Integer;
import java.util.Map;
import java.util.TreeMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Iterator;
import p.vv7;
import java.lang.Iterable;
import p.ka4;
import p.kg4;

public final class yy5 extends kd3	// class@002e51 from classes.dex
{
    public o51 d;
    public final kd3 e;
    public final String f;
    public final String g;

    public void yy5(o51 p0,mq7 p1,String p2,String p3){
       super(p1.a);
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
    }
    public final void f(nf2 p0){
    }
    public final void g(nf2 p0){
       xy5 g;
       int i2;
       Cursor uCursor = p0.a0("SELECT count\(*\) FROM sqlite_master WHERE name != \'android_metadata\'");
       int i = 0;
       int i1 = (uCursor.moveToFirst() && !uCursor.getInt(i))? 1: 0;
       eb3.d(uCursor, null);
       yy5 te = this.e;
       te.b(p0);
       if (!i1) {
          e67 uoe67 = te.k(p0);
          if (uoe67.b == null) {
             throw new IllegalStateException("Pre-packaged database has an invalid schema: "+uoe67.c);
          }
       }
       this.l(p0);
       mq7 e = te.e;
       switch (te.d){
           case 0:
             if ((g = e.g) != null) {
                i2 = g.size();
                for (; i < i2; i = i + 1) {
                   e.g.get(i).getClass();
                }
             }
             break;
           case 1:
             if ((g = e.g) != null) {
                i2 = g.size();
                for (; i < i2; i = i + 1) {
                   e.g.get(i).getClass();
                }
             }
             break;
           case 2:
             if ((g = e.g) != null) {
                i2 = g.size();
                for (; i < i2; i = i + 1) {
                   e.g.get(i).getClass();
                }
             }
             break;
           case 3:
             if ((g = e.g) != null) {
                i2 = g.size();
                for (; i < i2; i = i + 1) {
                   e.g.get(i).getClass();
                }
             }
             break;
           case 4:
             if ((g = e.g) != null) {
                i2 = g.size();
                for (; i < i2; i = i + 1) {
                   e.g.get(i).getClass();
                }
             }
             break;
           case 5:
             if ((g = e.g) != null) {
                i2 = g.size();
                for (; i < i2; i = i + 1) {
                   e.g.get(i).getClass();
                }
             }
             break;
           case 6:
             if ((g = e.g) != null) {
                i2 = g.size();
                for (; i < i2; i = i + 1) {
                   e.g.get(i).getClass();
                }
             }
             break;
           default:
             if ((g = e.g) != null) {
                i2 = g.size();
                for (; i < i2; i = i + 1) {
                   e.g.get(i).getClass();
                }
             }
       }
       return;
    }
    public final void h(nf2 p0,int p1,int p2){
       this.j(p0, p1, p2);
    }
    public final void i(nf2 p0){
       yy5 tf;
       xy5 g;
       Cursor uCursor = p0.a0("SELECT 1 FROM sqlite_master WHERE type = \'table\' AND name=\'room_master_table\'");
       int i = 0;
       int i1 = (uCursor.moveToFirst() && uCursor.getInt(i))? 1: 0;
       Throwable throwable = null;
       eb3.d(uCursor, throwable);
       if (i1) {
          uCursor = p0.f0(new zh6("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
          String str = (uCursor.moveToFirst())? uCursor.getString(i): throwable;
          eb3.d(uCursor, throwable);
          tf = this.f;
          if (!co5.c(tf, str) && !co5.c(this.g, str)) {
             throw new IllegalStateException("Room cannot verify the data integrity. Looks like you\'ve changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "+tf+", found: "+str);
          }
       }else {
          e67 uoe67 = this.e.k(p0);
          if (uoe67.b != null) {
             this.l(p0);
          }else {
             throw new IllegalStateException("Pre-packaged database has an invalid schema: "+uoe67.c);
          }
       }
       tf = this.e;
       String str1 = "PRAGMA foreign_keys = ON";
       switch (tf.d){
           case 0:
             tf.e.a = p0;
             p0.r(str1);
             tf.e.n(p0);
             if ((g = tf.e.g) != null) {
                i1 = g.size();
                for (; i < i1; i = i + 1) {
                   tf.e.g.get(i).a(p0);
                }
             }
             break;
           case 1:
             tf.e.a = p0;
             tf.e.n(p0);
             if ((g = tf.e.g) != null) {
                i1 = g.size();
                for (; i < i1; i = i + 1) {
                   tf.e.g.get(i).a(p0);
                }
             }
             break;
           case 2:
             tf.e.a = p0;
             p0.r(str1);
             tf.e.n(p0);
             if ((g = tf.e.g) != null) {
                i1 = g.size();
                for (; i < i1; i = i + 1) {
                   tf.e.g.get(i).a(p0);
                }
             }
             break;
           case 3:
             tf.e.a = p0;
             tf.e.n(p0);
             if ((g = tf.e.g) != null) {
                i1 = g.size();
                for (; i < i1; i = i + 1) {
                   tf.e.g.get(i).a(p0);
                }
             }
             break;
           case 4:
             tf.e.a = p0;
             tf.e.n(p0);
             if ((g = tf.e.g) != null) {
                i1 = g.size();
                for (; i < i1; i = i + 1) {
                   tf.e.g.get(i).a(p0);
                }
             }
             break;
           case 5:
             tf.e.a = p0;
             tf.e.n(p0);
             if ((g = tf.e.g) != null) {
                i1 = g.size();
                for (; i < i1; i = i + 1) {
                   tf.e.g.get(i).a(p0);
                }
             }
             break;
           case 6:
             tf.e.a = p0;
             tf.e.n(p0);
             if ((g = tf.e.g) != null) {
                i1 = g.size();
                for (; i < i1; i = i + 1) {
                   tf.e.g.get(i).a(p0);
                }
             }
             break;
           default:
             tf.e.a = p0;
             tf.e.n(p0);
             if ((g = tf.e.g) != null) {
                i1 = g.size();
                for (; i < i1; i = i + 1) {
                   tf.e.g.get(i).a(p0);
                }
             }
       }
       this.d = throwable;
       return;
    }
    public final void j(nf2 p0,int p1,int p2){
       int i1;
       ll1 a;
       xy5 g;
       int i2;
       TreeMap treeMap;
       int i6;
       yy5 td = this.d;
       yy5 te = this.e;
       int i = 0;
       if (td != null) {
          o51 d = td.d;
          d.getClass();
          i1 = 1;
          if (p1 == p2) {
             a = ll1.a;
          }else if(p2 > p1){
             i2 = 1;
          }else {
             i2 = 0;
          }
          ArrayList uArrayList = new ArrayList();
          int i3 = p1;
          while (true) {
             if (i2) {
                if (i3 < p2) {
                label_0025 :
                   int i4 = 1;
                label_0028 :
                   if (i4) {
                      if ((treeMap = d.a.get(Integer.valueOf(i3))) != null) {
                         NavigableSet navigableSet = (i2)? treeMap.descendingKeySet(): treeMap.keySet();
                         Iterator iterator1 = navigableSet.iterator();
                         while (true) {
                            if (iterator1.hasNext()) {
                               Integer integer = iterator1.next();
                               String str = "targetVersion";
                               if (i2) {
                                  int i5 = i3 + 1;
                                  co5.l(integer, str);
                                  i6 = integer.intValue();
                                  if (i5 <= i6 && i6 <= p2) {
                                  label_0071 :
                                     i6 = 1;
                                  label_0074 :
                                     if (i6) {
                                        Object obj = treeMap.get(integer);
                                        co5.i(obj);
                                        uArrayList.add(obj);
                                        i3 = integer.intValue();
                                        treeMap = 1;
                                     }
                                  }
                               }else {
                                  co5.l(integer, str);
                                  i6 = integer.intValue();
                                  if (p2 <= i6 && i6 < i3) {
                                     goto label_0071 ;
                                  }
                               }
                               i6 = 0;
                               goto label_0074 ;
                            }else {
                               treeMap = 0;
                            }
                            if (treeMap) {
                               continue ;
                            }
                         }
                      }
                      a = null;
                   }else {
                      a = uArrayList;
                   }
                }
             }else if(i3 > p2){
                goto label_0025 ;
             }
             treeMap = 0;
             goto label_0028 ;
          }
          if (a != null) {
             switch (te.d){
                 case 0:
                   vv7.o(p0);
                   break;
                 case 1:
                   vv7.o(p0);
                   break;
                 case 2:
                   vv7.o(p0);
                   break;
                 case 3:
                   vv7.o(p0);
                   break;
                 case 4:
                   vv7.o(p0);
                   break;
                 case 5:
                   vv7.o(p0);
                   break;
                 case 6:
                   vv7.o(p0);
                   break;
                 default:
                   vv7.o(p0);
             }
             Iterator iterator = a.iterator();
             while (iterator.hasNext()) {
                iterator.next().a(p0);
             }
             e67 uoe67 = te.k(p0);
             if (uoe67.b != null) {
                this.l(p0);
             label_00ef :
                if (!i1) {
                   if ((td = this.d) != null && !td.a(p1, p2)) {
                      yy5 oyy5 = te;
                      mq7 e = oyy5.e;
                      switch (oyy5.d){
                          case 0:
                            kg4.w(p0, "DROP TABLE IF EXISTS `Dependency`", "DROP TABLE IF EXISTS `WorkSpec`", "DROP TABLE IF EXISTS `WorkTag`", "DROP TABLE IF EXISTS `SystemIdInfo`");
                            p0.r("DROP TABLE IF EXISTS `WorkName`");
                            p0.r("DROP TABLE IF EXISTS `WorkProgress`");
                            p0.r("DROP TABLE IF EXISTS `Preference`");
                            if ((g = e.g) != null) {
                               g = g.size();
                               for (; i < g; i = i + 1) {
                                  e.g.get(i).getClass();
                               }
                            label_024f :
                               te.b(p0);
                            }else {
                               goto label_024f ;
                            }
                            break;
                          case 1:
                            p0.r("DROP TABLE IF EXISTS `Events`");
                            p0.r("DROP TABLE IF EXISTS `EventSequenceNumbers`");
                            p0.r("DROP TABLE IF EXISTS `RateLimitedEvents`");
                            if ((g = e.g) != null) {
                               g = g.size();
                               for (; i < g; i = i + 1) {
                                  e.g.get(i).getClass();
                               }
                            }else {
                               goto label_024f ;
                            }
                            break;
                          case 2:
                            kg4.w(p0, "DROP TABLE IF EXISTS `playlists`", "DROP TABLE IF EXISTS `albums`", "DROP TABLE IF EXISTS `album_artists`", "DROP TABLE IF EXISTS `artists`");
                            kg4.w(p0, "DROP TABLE IF EXISTS `users`", "DROP TABLE IF EXISTS `images`", "DROP TABLE IF EXISTS `favorite_tracks`", "DROP TABLE IF EXISTS `favorite_playlists`");
                            kg4.w(p0, "DROP TABLE IF EXISTS `favorite_albums`", "DROP TABLE IF EXISTS `favorite_artists`", "DROP TABLE IF EXISTS `shows`", "DROP TABLE IF EXISTS `episodes`");
                            kg4.w(p0, "DROP TABLE IF EXISTS `episode_progress`", "DROP TABLE IF EXISTS `favorite_shows`", "DROP TABLE IF EXISTS `favorite_episodes`", "DROP TABLE IF EXISTS `tracks`");
                            p0.r("DROP TABLE IF EXISTS `track_artists`");
                            p0.r("DROP TABLE IF EXISTS `track_rows`");
                            if ((g = e.g) != null) {
                               g = g.size();
                               for (; i < g; i = i + 1) {
                                  e.g.get(i).getClass();
                               }
                            }else {
                               goto label_024f ;
                            }
                            break;
                          case 3:
                            p0.r("DROP TABLE IF EXISTS `network_bucket`");
                            if ((g = e.g) != null) {
                               g = g.size();
                               for (; i < g; i = i + 1) {
                                  e.g.get(i).getClass();
                               }
                            }else {
                               goto label_024f ;
                            }
                            break;
                          case 4:
                            p0.r("DROP TABLE IF EXISTS `recent_play`");
                            if ((g = e.g) != null) {
                               g = g.size();
                               for (; i < g; i = i + 1) {
                                  e.g.get(i).getClass();
                               }
                            }else {
                               goto label_024f ;
                            }
                            break;
                          case 5:
                            p0.r("DROP TABLE IF EXISTS `recent_search`");
                            if ((g = e.g) != null) {
                               g = g.size();
                               for (; i < g; i = i + 1) {
                                  e.g.get(i).getClass();
                               }
                            }else {
                               goto label_024f ;
                            }
                            break;
                          case 6:
                            p0.r("DROP TABLE IF EXISTS `taste`");
                            if ((g = e.g) != null) {
                               g = g.size();
                               for (; i < g; i = i + 1) {
                                  e.g.get(i).getClass();
                               }
                            }else {
                               goto label_024f ;
                            }
                            break;
                          default:
                            p0.r("DROP TABLE IF EXISTS `user`");
                            if ((g = e.g) != null) {
                               g = g.size();
                               for (; i < g; i = i + 1) {
                                  e.g.get(i).getClass();
                               }
                            }else {
                               goto label_024f ;
                            }
                      }
                   }else {
                      throw new IllegalStateException("A migration from "+p1+" to "+p2+" was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration\(Migration ...\) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
                   }
                }
                return;
             }else {
                throw new IllegalStateException("Migration didn\'t properly handle: "+uoe67.c);
             }
          }
       }
       i1 = 0;
       goto label_00ef ;
    }
    public final void l(nf2 p0){
       p0.r("CREATE TABLE IF NOT EXISTS room_master_table \(id INTEGER PRIMARY KEY,identity_hash TEXT\)");
       yy5 tf = this.f;
       co5.o(tf, "hash");
       StringBuilder str = "INSERT OR REPLACE INTO room_master_table \(id,identity_hash\) VALUES\(42, \'"+tf;
       p0.r(str+"\'\)");
    }
}
