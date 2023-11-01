package p.z94;
import java.util.concurrent.Callable;
import p.fa4;
import p.aq6;
import p.ks0;
import java.lang.Object;
import java.lang.Class;
import p.xy5;
import p.tt;
import java.util.LinkedHashSet;
import p.rr;
import p.r45;
import com.google.common.collect.c;
import p.e73;
import p.d1;
import p.gt0;
import p.tr;
import p.nt0;
import p.ur;
import java.util.AbstractCollection;
import p.i77;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import java.lang.String;
import p.zy5;
import android.database.Cursor;
import p.vv7;
import java.util.ArrayList;
import java.lang.Long;
import p.ew;
import p.ic;
import java.lang.System;
import java.lang.Iterable;
import p.ab2;
import p.ea4;
import p.ci5;
import p.rp;
import p.jg2;
import com.google.common.collect.d;
import p.mc6;
import java.util.Set;
import p.hi5;
import java.util.Iterator;
import p.io2;
import java.lang.NullPointerException;

public final class z94 implements Callable	// class@002eb1 from classes.dex
{
    public final int a;
    public final fa4 b;
    public final aq6 c;
    public final ks0 t;

    public void z94(fa4 p0,aq6 p1,ks0 p2,int p3){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       super();
    }
    public final Object call(){
       c uoc;
       c uoc1;
       d uod;
       tt ott;
       z94 tt = this.t;
       z94 tc = this.c;
       z94 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.getClass();
             LinkedHashSet linkedHashSe = new LinkedHashSet(50);
             if ((uoc = tt.d.f()) != null) {
                e73 uoe73 = uoc.q(0);
                while (uoe73.hasNext()) {
                   if ((uoc1 = uoe73.next().c.f()) != null) {
                      e73 uoe731 = uoc1.q(0);
                      while (uoe731.hasNext()) {
                         linkedHashSe.add(uoe731.next().a);
                      }
                   }
                }
             }
             i77 oi77 = tb.a.B();
             String str = tc.toString();
             oi77.getClass();
             zy5 ozy5 = zy5.x(1, "SELECT\n    track_rows.track_uri,\n    tracks.created as t_created,\n    episodes.created as e_created\nFROM track_rows\nLEFT JOIN tracks ON track_rows.track_uri = tracks.uri\nLEFT JOIN episodes ON track_rows.track_uri = episodes.uri\nWHERE track_rows.parent_uri = ?\nAND \(tracks.uri IS NOT NULL OR episodes.uri IS NOT NULL\)\nORDER BY track_rows.position ASC");
             if (str == null) {
                ozy5.z(1);
             }else {
                ozy5.s(1, str);
             }
             oi77.a.b();
             Cursor uCursor = vv7.J(oi77.a, ozy5, 0);
             ArrayList uArrayList = new ArrayList(uCursor.getCount());
             while (uCursor.moveToNext()) {
                Long longx = null;
                String str1 = (uCursor.isNull(0))? longx: uCursor.getString(0);
                Long longx1 = (uCursor.isNull(1))? longx: Long.valueOf(uCursor.getLong(1));
                int i = 2;
                if (!uCursor.isNull(i)) {
                   longx = Long.valueOf(uCursor.getLong(i));
                }
                uArrayList.add(ew.a(str1, longx1, longx));
             }
             uCursor.close();
             ozy5.y();
             tb.c.getClass();
             if ((uod = ab2.b(uArrayList).a(new ea4((System.currentTimeMillis() - 0xa4cb800))).m(new rp(17)).k()) != null) {
                uod = ab2.b(new mc6(linkedHashSe, uod)).m(new rp(18)).a(hi5.a).k();
                if (linkedHashSe.size() == uArrayList.size()) {
                   Iterator iterator = linkedHashSe.iterator();
                   Iterator iterator1 = uArrayList.iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         if (!io2.j(iterator.next(), iterator1.next().a)) {
                            ott = new tt(1, uod);
                            break ;
                         }else {
                            continue ;
                         }
                      }else {
                         ott = new tt(0, uod);
                         break ;
                      }
                   }
                }else {
                   ott = new tt(1, uod);
                }
                return ott;
             }else {
                throw new NullPointerException("set2");
             }
       }
       tb.getClass();
       return tb.a.p(new z94(tb, tc, tt, 1));
    }
}
