package p.fv0;
import p.ir0;
import p.gv0;
import java.lang.Object;
import p.wu;
import p.or7;
import p.r44;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.f;
import p.r45;
import p.nt0;
import p.m73;
import java.lang.Double;
import p.ic;
import java.lang.Class;
import android.os.SystemClock;
import java.lang.System;
import java.lang.Long;
import p.ur;
import java.lang.String;
import p.aq6;
import p.td7;
import p.yp6;
import p.dv;
import java.util.AbstractCollection;
import android.os.Bundle;
import android.os.Build$VERSION;
import p.do5;
import android.support.v4.media.MediaMetadataCompat;
import p.ox7;
import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat$CustomAction;
import java.lang.CharSequence;
import java.util.ArrayList;
import p.a54;
import p.uu;
import p.io2;
import p.mo;
import p.mi;
import java.util.Set;
import android.os.BaseBundle;
import java.util.Iterator;
import android.os.Parcelable;
import android.graphics.Bitmap;
import p.u44;
import p.u65;
import p.an5;
import java.lang.Boolean;

public final class fv0 implements ir0	// class@001642 from classes.dex
{
    public final int a;
    public final gv0 b;

    public void fv0(gv0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       gv0 i;
       MediaMetadataCompat mediaMetadat;
       gv0 i3;
       wu b1;
       boolean b2;
       nt0 ont01;
       MediaMetadataCompat mediaMetadat2;
       u44 ou441;
       boolean i4;
       int i5;
       wu obj;
       PlaybackStateCompat playbackStat;
       f uof;
       long l2;
       Bundle uBundle2;
       Bundle uBundle3;
       PlaybackStateCompat uBundle2;
       int i7;
       fv0 uofv0 = this;
       String str = "android.media.metadata.ALBUM_ART";
       fv0 b = uofv0.b;
       switch (uofv0.a){
           case 0:
             Bitmap uBitmap = p0;
             if ((i = b.i) != null) {
                u44 ou44 = ((mediaMetadat = i.b.b()) != null)? new u44(mediaMetadat): new u44(0);
                ou44.E(str, uBitmap);
                i.o(new MediaMetadataCompat(ou44.b));
             }
             break;
           case 1:
             wu owu = p0;
             gv0 i1 = b.i;
             int i2 = 2;
             gv0 a = b.a;
             if (i1 != null) {
                if ((playbackStat = i1.b.c()) == null) {
                   uof = new f();
                }else {
                   f uof1 = new f();
                   uof1.j = playbackStat.B;
                   uof1.i = playbackStat.A;
                   uof1.f = playbackStat.w;
                   uof1.g = playbackStat.x;
                   uof = uof1;
                }
                ont01 = owu.g.f();
                wu v = owu.v;
                int i6 = (!v.containsKey("loading.failed") && (!v.containsKey("loading.status") || owu.g.f() != null))? 0: 1;
                double d = 0;
                wu j1 = owu.j;
                if (our) {
                   i6 = 7;
                }else if(owu.m == null){
                   i6 = 0;
                }else if(owu.n != null){
                   i6 = 2;
                }else if(!(d - j1.e(Double.valueOf(d)).doubleValue())){
                   i6 = 6;
                }else {
                   i6 = 3;
                }
                long l1 = 0;
                obj = owu.a;
                if (!(obj - l1)) {
                   l2 = l1;
                }else {
                   b.h.getClass();
                   l2 = SystemClock.elapsedRealtime() - (System.currentTimeMillis() - obj);
                }
                uof.b = i6;
                uof.c = owu.k.e(Long.valueOf(-1)).longValue();
                uof.h = l2;
                uof.d = j1.e(Double.valueOf(d)).floatValue();
                or7 b3 = (i6 != 8 && i6 != 11)? 0: 1;
                aq6 uoaq6 = (ont01 == null)? null: td7.d(ont01.a);
                long l3 = 128;
                if (uoaq6 != null && uoaq6.b == yp6.w) {
                   l1 = l3;
                }
                if (!j1 && (j1 = owu.r) != null) {
                   uoaq6 = (i6 == i2)? 1: 0;
                   b2 = (i6 == 3)? 1: 0;
                   ont01 = (i6 == 6)? 1: 0;
                   d = (i6 == 10)? 1: 0;
                   i6 = (i6 == 9)? 1: 0;
                   long l4 = 512;
                   if (ont01 || (b2 || (d || i6))) {
                      l1 = (l1 | 2) | l4;
                   }
                   if (uoaq6) {
                      l1 = (l1 | 4) | l4;
                   }
                   if (j1.d.isEmpty()) {
                      l1 = l1 | 256;
                   }
                   if (!i6 && j1.g.isEmpty()) {
                      l1 = l1 | 16;
                   }
                   if (!d && j1.h.isEmpty()) {
                      l1 = l1 | 32;
                   }
                   uBundle2 = new Bundle();
                   long l5 = 0x40000;
                   if (j1.i.isEmpty()) {
                      uBundle2.putBoolean("spotify.media.session.REPEAT_ALL_ALLOWED", true);
                      l1 = l1 | l5;
                   }else {
                      boolean b4 = true;
                   }
                   if (j1.j.isEmpty()) {
                      uBundle2.putBoolean("spotify.media.session.REPEAT_ONE_ALLOWED", true);
                      l1 = l1 | l5;
                   }
                   if (j1.k.isEmpty()) {
                      l1 = l1 | 0x200000;
                   }
                   uof.j = uBundle2;
                }
                uof.e = l1 | 1;
                f a1 = uof.a;
                if (Build$VERSION.SDK_INT >= 33) {
                   b3 = b.i.b;
                   if (!do5.I(b3.c(), l3)) {
                      uBundle3 = null;
                   }else if(ox7.v(b3.b())){
                      i5 = 0x7f12019c;
                      i7 = 0x7f0705a1;
                   }else {
                      i5 = 0x7f12019b;
                      i7 = 0x7f07059f;
                   }
                   uBundle3 = null;
                   a1.add(new PlaybackStateCompat$CustomAction("favourite", a.getString(i5), i7, uBundle3));
                   a1.add(new PlaybackStateCompat$CustomAction("dismiss", a.getString(R.string.close_button_content_description), R.drawable.icn_notification_dismiss, uBundle3));
                }
                uBundle2 = new PlaybackStateCompat(uof.b, uof.c, 0, uof.d, uof.e, uof.f, uof.g, uof.h, a1, uof.i, uof.j);
                b.i.a.f(uBundle2);
             }
             if ((i3 = b.i) != null) {
                i3.a.l(owu.q.a);
                i3 = b.i;
                b1 = owu.q;
                if (b1.b == null) {
                   i2 = (b1.c != null)? 1: 0;
                }
                i3.a.g(i2);
             }
             b1 = owu.b;
             wu g = owu.g;
             if (owu.m == null || (owu.n != null || (b.k == null || ((i3 = b.l) == null || (!io2.j(i3.b, b1) || g.f() != null))))) {
                i3 = b.k;
                gv0 l = b.l;
                nt0 ont0 = g.f();
                b.k = ont0;
                b.l = owu;
                String str1 = "image_large_url";
                String str2 = (ont0 == null)? null: ont0.c.get(str1);
                String str3 = (i3 == null)? null: i3.c.get(str1);
                b2 = io2.j(str2, str3);
                if (b.i != null) {
                   ont01 = (g.f() != null)? g.f(): null;
                   ur our = (ont01 == null)? null: ont01.a;
                   if (l != null && (i3 != null && io2.j(our, i3.a))) {
                      gv0 j = b.j;
                      nt0 ont02 = (g.f() != null)? g.f(): null;
                      nt0 ont03 = (g.f() != null)? l.g.f(): null;
                      if (io2.j(ont02, ont03)) {
                         ont02 = 0;
                      }else {
                         Bundle uBundle = new Bundle(mi.h(a, owu, null, j).a);
                         Bundle uBundle1 = new Bundle(mi.h(a, l, null, j).a);
                         if (uBundle.keySet().equals(uBundle1.keySet())) {
                            Iterator iterator = uBundle.keySet().iterator();
                            while (true) {
                               if (iterator.hasNext()) {
                                  String str4 = iterator.next();
                                  obj = uBundle.get(str4);
                                  if (io2.j(obj, uBundle1.get(str4))) {
                                     continue ;
                                  }
                               }else {
                                  i4 = 1;
                                  i5 = 1;
                                  break ;
                               }
                            }
                            i5 = i5 ^ i4;
                         }
                         i4 = 1;
                         i5 = 0;
                      }
                      if (ont02) {
                         j = b.i;
                         j.o(mi.h(a, owu, j.b.b(), b.j));
                      }
                   }else {
                      MediaMetadataCompat mediaMetadat1 = mi.h(a, owu, null, b.j);
                      if (b2) {
                         MediaMetadataCompat mediaMetadat3 = ((mediaMetadat2 = b.i.b.b()) == null)? null: mediaMetadat2.a.getParcelable(str);
                      }
                      b.i.o(mediaMetadat1);
                      if (ont01 != null) {
                         b.g.onNext(new u65(ont01, b1));
                      }
                   }
                }
                b.f.onNext(r45.a(str2));
             }
             return;
             break;
           default:
             i4 = p0.booleanValue();
             if ((i3 = b.i) != null) {
                i3.o(ox7.J(i3.b.b(), i4));
             }
             return;
       }
       return;
    }
}
