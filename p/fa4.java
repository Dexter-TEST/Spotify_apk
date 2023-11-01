package p.fa4;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.al5;
import p.zg0;
import java.lang.Object;
import java.util.Collection;
import java.util.AbstractCollection;
import p.ut;
import com.google.common.collect.d;
import p.t63;
import java.lang.String;
import com.spotify.metadata.proto.Metadata$ImageGroup;
import java.util.ArrayList;
import p.bc3;
import java.util.Iterator;
import java.util.List;
import com.spotify.metadata.proto.Metadata$Image;
import p.oy6;
import p.i80;
import p.p94;
import java.lang.Integer;
import p.mt;
import java.lang.NullPointerException;
import com.spotify.webapi.service.models.Image;
import p.aq6;
import p.j8;
import p.zk;
import com.spotify.metadata.proto.Metadata$Album;
import java.util.HashSet;
import p.hr;
import p.xe7;
import p.ic;
import java.lang.Class;
import java.lang.System;
import java.lang.Long;
import p.ir;
import com.spotify.metadata.proto.Metadata$Artist;
import p.yp6;
import p.d8;
import p.kr;
import com.spotify.webapi.service.models.EpisodeSimple;
import com.spotify.webapi.service.models.ShowSimple;
import p.te5;
import android.net.Uri;
import p.td7;
import p.ys;
import java.lang.Boolean;
import p.zs;
import p.ko1;
import com.spotify.webapi.service.models.ResumePoint;
import p.qo5;
import p.at;
import com.google.common.collect.g;
import java.lang.IllegalArgumentException;

public final class fa4	// class@00158d from classes.dex
{
    public final MetadataRoomDatabase a;
    public final al5 b;
    public final zg0 c;

    public void fa4(MetadataRoomDatabase p0,al5 p1,zg0 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static ut a(Collection p0,AbstractCollection p1){
       return new ut(d.o(p0), d.o(p1));
    }
    public static void d(t63 p0,String p1,Metadata$ImageGroup p2){
       String str;
       p0.k(p1);
       ArrayList uArrayList = new ArrayList(p2.h());
       Iterator iterator = p2.i().iterator();
       while (true) {
          if (iterator.hasNext()) {
             Metadata$Image image = iterator.next();
             if (image.i()) {
                oy6 ooy6 = new oy6(10);
                ooy6.b = p1;
                if ((str = p94.a(image.f())) != null) {
                   ooy6.c = str;
                   ooy6.t = Integer.valueOf(image.h());
                   ooy6.v = Integer.valueOf(image.g());
                   uArrayList.add(ooy6.k());
                }else {
                   throw new NullPointerException("Null url");
                }
             }
          }else if(!uArrayList.isEmpty()){
             p0.m(uArrayList);
             break ;
          }
          break ;
       }
       return;
    }
    public static void e(t63 p0,String p1,List p2){
       Image url;
       p0.k(p1);
       ArrayList uArrayList = new ArrayList(p2.size());
       Iterator iterator = p2.iterator();
       while (true) {
          if (iterator.hasNext()) {
             Image image = iterator.next();
             oy6 ooy6 = new oy6(10);
             ooy6.b = p1;
             if ((url = image.url) != null) {
                ooy6.c = url;
                ooy6.t = image.width;
                ooy6.v = image.height;
                uArrayList.add(ooy6.k());
             }else {
                throw new NullPointerException("Null url");
             }
          }else if(!uArrayList.isEmpty()){
             p0.m(uArrayList);
             break ;
          }
          break ;
       }
       return;
    }
    public final void b(aq6 p0,j8 p1,zk p2,t63 p3,Metadata$Album p4,HashSet p5,HashSet p6){
       aq6 uoaq6;
       Object obj = p0;
       j8 oj8 = p1;
       HashSet hashSet = p5;
       HashSet hashSet1 = p6;
       if (hashSet.contains(obj)) {
          return;
       }
       if (!p4.k()) {
          hashSet1.add(obj);
          return;
       }else {
          String str = p0.toString();
          hr ohr = new hr();
          if (str == null) {
             throw new NullPointerException("Null uri");
          }
          ohr.b = str;
          ohr.c = xe7.J(p4.getName());
          this.c.getClass();
          ohr.d = Long.valueOf(System.currentTimeMillis());
          oj8.l(ohr.a());
          Iterator iterator = p4.f().iterator();
          while (iterator.hasNext()) {
             Object obj1 = iterator.next();
             if ((uoaq6 = p94.b(yp6.b, obj1.g())) != null) {
                this.c(uoaq6, p2, p3, obj1, p5, p6);
                oj8.m(super(str, uoaq6.toString()));
             }
          }
          if (p4.j()) {
             fa4.d(p3, str, p4.g());
             hashSet.add(obj);
          }else {
             hashSet1.add(obj);
          }
          return;
       }
    }
    public final void c(aq6 p0,zk p1,t63 p2,Metadata$Artist p3,HashSet p4,HashSet p5){
       if (p4.contains(p0)) {
          return;
       }
       if (!p3.i()) {
          p5.add(p0);
          return;
       }else {
          String str = p0.toString();
          hr ohr = new hr();
          ohr.d(str);
          ohr.c(xe7.J(p3.getName()));
          this.c.getClass();
          ohr.d = Long.valueOf(System.currentTimeMillis());
          p1.e(ohr.b());
          if (p3.j()) {
             fa4.d(p2, str, p3.h());
             p4.add(p0);
          }else {
             p5.add(p0);
          }
          return;
       }
    }
    public final ut f(EpisodeSimple p0,ShowSimple p1,Collection p2){
       aq6 uoaq6;
       ResumePoint fullyPlayed;
       String str = null;
       String lastPathSegm = (!te5.a(p0.audioPreviewUrl))? Uri.parse(p0.audioPreviewUrl).getLastPathSegment(): str;
       String str1 = td7.b(p0.uri);
       if ((uoaq6 = td7.d(str1)) != null && !p2.contains(uoaq6)) {
          this.c.getClass();
          long l = System.currentTimeMillis();
          ys oys = new ys();
          oys.g(p0.uri);
          String str2 = (p1 == null)? str: p1.uri;
          oys.e(xe7.J(str2));
          oys.c(xe7.J(p0.name));
          oys.b(xe7.J(p0.description));
          if (p1 != null) {
             str = p1.name;
          }
          oys.d(xe7.J(str));
          oys.f(xe7.J(p0.releaseDate));
          oys.h = Integer.valueOf(p0.durationMs);
          EpisodeSimple is_playable = p0.is_playable;
          boolean b = true;
          int i = 0;
          boolean b1 = (is_playable != null && !is_playable.booleanValue())? false: true;
          oys.i = Boolean.valueOf(b1);
          if ((is_playable = p0.explicit) == null || !is_playable.booleanValue()) {
             b = false;
          }
          oys.j = Boolean.valueOf(b);
          oys.k = Long.valueOf(l);
          oys.l = lastPathSegm;
          fa4 ta = this.a;
          ta.v().o(oys.a());
          if ((is_playable = p0.resumePoint) != null) {
             ResumePoint resumePositi = is_playable.resumePositionMs;
             if ((fullyPlayed = is_playable.fullyPlayed) != null) {
                i = fullyPlayed.booleanValue();
             }
             b1 = i;
             i = resumePositi;
          }else {
             b1 = false;
          }
          qo5 oqo5 = at.a();
          oqo5.d(str1);
          oqo5.i(i);
          oqo5.f(b1);
          ta.v().p(oqo5.c());
          if ((is_playable = p0.images) != null && !is_playable.isEmpty()) {
             fa4.e(ta.x(), str1, p0.images);
          }
          HashSet hashSet = new HashSet(p2);
          hashSet.add(uoaq6);
          return fa4.a(hashSet, g.A);
       }else {
          throw new IllegalArgumentException(str1);
       }
    }
}
