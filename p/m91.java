package p.m91;
import p.rn1;
import java.lang.Object;
import p.xy5;
import java.lang.String;
import p.uw6;
import p.je7;
import p.sw6;
import p.lv;
import p.mq5;
import java.lang.Long;
import p.jq5;
import p.zu;
import p.zh4;
import java.lang.Class;
import p.mt;
import java.lang.Integer;
import p.kr;
import p.po5;
import p.fu1;
import java.lang.Boolean;
import p.kv1;
import p.mr7;
import p.jr7;
import p.rq7;
import p.lv1;
import p.h51;
import p.kg4;
import p.en6;
import p.cd2;
import p.zq0;
import android.os.Build$VERSION;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import p.co5;
import java.util.Set;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import p.yq0;
import android.net.Uri;
import java.io.Closeable;
import java.lang.Throwable;
import p.eb3;
import p.tp2;
import p.wq7;
import p.my6;
import p.ki5;
import p.j91;
import p.kw;

public final class m91 extends rn1	// class@001e4b from classes.dex
{
    public final int d;
    public final Object e;

    public void m91(Object p0,xy5 p1,int p2){
       this.d = p2;
       this.e = p0;
       super(p1);
    }
    public final String d(){
       switch (this.d){
           case 0:
             return "INSERT OR IGNORE INTO `Dependency` \(`work_spec_id`,`prerequisite_id`\) VALUES \(?,?\)";
           case 1:
             return "INSERT OR REPLACE INTO `Preference` \(`key`,`long_value`\) VALUES \(?,?\)";
           case 2:
             return "INSERT OR REPLACE INTO `SystemIdInfo` \(`work_spec_id`,`generation`,`system_id`\) VALUES \(?,?,?\)";
           case 3:
             return "INSERT OR IGNORE INTO `WorkName` \(`name`,`work_spec_id`\) VALUES \(?,?\)";
           case 4:
             return "INSERT OR REPLACE INTO `WorkProgress` \(`work_spec_id`,`progress`\) VALUES \(?,?\)";
           case 5:
             return "INSERT OR IGNORE INTO `WorkSpec` \(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`\) VALUES \(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?\)";
           case 6:
             return "INSERT OR IGNORE INTO `WorkTag` \(`tag`,`work_spec_id`\) VALUES \(?,?\)";
           case 7:
             return "INSERT OR REPLACE INTO `EventSequenceNumbers` \(`eventName`,`sequenceId`,`sequenceNumberNext`\) VALUES \(?,?,?\)";
           case 8:
             return "INSERT OR ABORT INTO `Events` \(`id`,`authenticated`,`eventName`,`sequenceId`,`sequenceNumber`,`fragments`,`owner`,`deviceId`\) VALUES \(nullif\(?, 0\),?,?,?,?,?,?,?\)";
           case 9:
             return "INSERT OR REPLACE INTO `RateLimitedEvents` \(`eventName`,`count`,`timestamp`\) VALUES \(?,?,?\)";
           case 10:
             return "INSERT OR REPLACE INTO `artists` \(`tag`,`uri`,`name`,`created`\) VALUES \(?,?,?,?\)";
           case 11:
             return "INSERT OR REPLACE INTO `images` \(`parent_uri`,`url`,`width`,`height`\) VALUES \(?,?,?,?\)";
           case 12:
             return "INSERT OR ABORT INTO `network_bucket` \(`id`,`rx`,`tx`,`timestamp`,`connection_type`\) VALUES \(nullif\(?, 0\),?,?,?,?\)";
           case 13:
             return "INSERT OR REPLACE INTO `playlists` \(`tag`,`uri`,`name`,`user_uri`,`created`\) VALUES \(?,?,?,?,?\)";
           case 14:
             return "INSERT OR ABORT INTO `recent_play` \(`id`,`timestamp`,`uri`,`image_uri`,`title`,`context_uri`,`label`\) VALUES \(?,?,?,?,?,?,?\)";
           case 15:
             return "INSERT OR ABORT INTO `recent_search` \(`id`,`timestamp`,`uri`,`image_uri`,`title`,`subtitle`,`label`\) VALUES \(?,?,?,?,?,?,?\)";
           case 16:
             return "INSERT OR REPLACE INTO `shows` \(`tag`,`uri`,`name`,`description`,`publisher`,`created`,`explicit`\) VALUES \(?,?,?,?,?,?,?\)";
           case 17:
             return "INSERT OR REPLACE INTO `user` \(`id`,`birth_date`,`country`,`display_name`,`email`,`href`,`uri`,`product`\) VALUES \(?,?,?,?,?,?,?,?\)";
           default:
             return "INSERT OR REPLACE INTO `users` \(`tag`,`uri`,`username`,`display_name`,`created`\) VALUES \(?,?,?,?,?\)";
       }
    }
    public final void g(uw6 p0,Object p1){
       j91 a;
       ki5 a1;
       my6 a2;
       wq7 a3;
       jr7 a4;
       byte[] uobyteArray;
       byte[] uobyteArray1;
       mr7 a6;
       kv1 a7;
       fu1 b;
       fu1 c;
       po5 a8;
       kr a9;
       mt a10;
       zu obj;
       zu a11;
       jq5 a12;
       mq5 a13;
       lv a14;
       je7 a15;
       kw a16;
       sw6 osw6 = p0;
       int i = 8;
       int i1 = 0;
       int i2 = 7;
       int i3 = 5;
       int i4 = 4;
       int i5 = 1;
       switch (this.d){
           case 0:
             j91 oj91 = p1;
             if ((a = oj91.a) == null) {
                osw6.z(i5);
             }else {
                osw6.s(i5, a);
             }
             if ((oj91 = oj91.b) == null) {
                osw6.z(2);
             }else {
                osw6.s(2, oj91);
             }
             return;
             break;
           case 1:
             ki5 oki5 = p1;
             if ((a1 = oki5.a) == null) {
                osw6.z(i5);
             }else {
                osw6.s(i5, a1);
             }
             if ((oki5 = oki5.b) == null) {
                osw6.z(2);
             }else {
                osw6.P(2, oki5.longValue());
             }
             return;
             break;
           case 2:
             my6 omy6 = p1;
             if ((a2 = omy6.a) == null) {
                osw6.z(i5);
             }else {
                osw6.s(i5, a2);
             }
             osw6.P(2, (long)omy6.b);
             osw6.P(3, (long)omy6.c);
             return;
             break;
           case 3:
             wq7 owq7 = p1;
             if ((a3 = owq7.a) == null) {
                osw6.z(i5);
             }else {
                osw6.s(i5, a3);
             }
             if ((owq7 = owq7.b) == null) {
                osw6.z(2);
             }else {
                osw6.s(2, owq7);
             }
             return;
             break;
           case 4:
             tp2.v(p1);
             throw null;
           case 5:
             jr7 ojr7 = p1;
             if ((a4 = ojr7.a) == null) {
                osw6.z(i5);
             }else {
                osw6.s(i5, a4);
             }
             osw6.P(2, (long)lv1.H(ojr7.b));
             if ((a4 = ojr7.c) == null) {
                osw6.z(3);
             }else {
                osw6.s(3, a4);
             }
             if ((a4 = ojr7.d) == null) {
                osw6.z(i4);
             }else {
                osw6.s(i4, a4);
             }
             if ((uobyteArray = h51.b(ojr7.e)) == null) {
                osw6.z(i3);
             }else {
                osw6.d0(uobyteArray, i3);
             }
             if ((uobyteArray = h51.b(ojr7.f)) == null) {
                osw6.z(6);
             }else {
                osw6.d0(uobyteArray, 6);
             }
             osw6.P(i2, ojr7.g);
             osw6.P(i, ojr7.h);
             osw6.P(9, ojr7.i);
             i = 10;
             osw6.P(i, (long)ojr7.k);
             jr7 l = ojr7.l;
             kg4.t(l, "backoffPolicy");
             if (i2 = en6.A(l)) {
                if (i2 == i5) {
                   i2 = 1;
                }else {
                   throw new cd2(i);
                }
             }else {
                i2 = 0;
             }
             osw6.P(11, (long)i2);
             osw6.P(12, ojr7.m);
             osw6.P(13, ojr7.n);
             osw6.P(14, ojr7.o);
             osw6.P(15, ojr7.p);
             osw6.P(16, (long)ojr7.q);
             l = ojr7.r;
             kg4.t(l, "policy");
             if (i2 = en6.A(l)) {
                if (i2 == i5) {
                   i = 1;
                }else {
                   throw new cd2(i);
                }
             }else {
                i = 0;
             }
             osw6.P(17, (long)i);
             osw6.P(18, (long)ojr7.s);
             osw6.P(19, (long)ojr7.t);
             ojr7 = ojr7.j;
             i = 21;
             int i6 = 20;
             if (ojr7 != null) {
                zq0 a5 = ojr7.a;
                kg4.t(a5, "networkType");
                if (i2 = en6.A(a5)) {
                   if (i2 != i5) {
                      if (i2 != 2) {
                         if (i2 != 3) {
                            if (i2 != i4) {
                               if (Build$VERSION.SDK_INT >= 30 && a5 == 6) {
                                  i4 = 5;
                               }else {
                                  throw new IllegalArgumentException("Could not convert "+kg4.B(a5)+" to int");
                               }
                            }
                         }else {
                            i4 = 3;
                         }
                      }else {
                         i4 = 2;
                      }
                   }else {
                      i4 = 1;
                   }
                }else {
                   i4 = 0;
                }
                osw6.P(i6, (long)i4);
                osw6.P(i, (long)ojr7.b);
                osw6.P(22, (long)ojr7.c);
                osw6.P(23, (long)ojr7.d);
                osw6.P(24, (long)ojr7.e);
                osw6.P(25, ojr7.f);
                osw6.P(26, ojr7.g);
                zq0 h = ojr7.h;
                co5.o(h, "triggers");
                if (h.isEmpty()) {
                   uobyteArray1 = new byte[0];
                }else {
                   ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
                   ObjectOutputStream objectOutput = new ObjectOutputStream(uByteArrayOu);
                   objectOutput.writeInt(h.size());
                   Iterator iterator = h.iterator();
                   while (iterator.hasNext()) {
                      yq0 oyq0 = iterator.next();
                      objectOutput.writeUTF(oyq0.a.toString());
                      objectOutput.writeBoolean(oyq0.b);
                   }
                   eb3.d(objectOutput, null);
                   eb3.d(uByteArrayOu, null);
                   uobyteArray1 = uByteArrayOu.toByteArray();
                   co5.l(uobyteArray1, "outputStream.toByteArray\(\)");
                }
                int i7 = 27;
                osw6.d0(uobyteArray1, i7);
             }else {
                osw6.z(i6);
                osw6.z(i);
                osw6.z(22);
                osw6.z(23);
                osw6.z(24);
                osw6.z(25);
                osw6.z(26);
                osw6.z(27);
             }
             return;
             break;
           case 6:
             mr7 omr7 = p1;
             if ((a6 = omr7.a) == null) {
                osw6.z(i5);
             }else {
                osw6.s(i5, a6);
             }
             if ((omr7 = omr7.b) == null) {
                osw6.z(2);
             }else {
                osw6.s(2, omr7);
             }
             return;
             break;
           case 7:
             kv1 okv1 = p1;
             if ((a7 = okv1.a) == null) {
                osw6.z(i5);
             }else {
                osw6.s(i5, a7);
             }
             if ((a7 = okv1.b) == null) {
                osw6.z(2);
             }else {
                osw6.d0(a7, 2);
             }
             osw6.P(3, okv1.c);
             return;
             break;
           case 8:
             fu1 uofu1 = p1;
             osw6.P(i5, uofu1.a);
             Integer integer = ((b = uofu1.b) == null)? null: Integer.valueOf(b.booleanValue());
             if (integer == null) {
                osw6.z(2);
             }else {
                osw6.P(2, (long)integer.intValue());
             }
             if ((c = uofu1.c) == null) {
                osw6.z(3);
             }else {
                osw6.s(3, c);
             }
             if ((c = uofu1.d) == null) {
                osw6.z(i4);
             }else {
                osw6.d0(c, i4);
             }
             osw6.P(i3, uofu1.e);
             if ((c = uofu1.f) == null) {
                osw6.z(6);
             }else {
                osw6.d0(c, 6);
             }
             if ((c = uofu1.g) == null) {
                osw6.z(i2);
             }else {
                osw6.s(i2, c);
             }
             if ((c = uofu1.h) == null) {
                osw6.z(i);
             }else {
                osw6.s(i, c);
             }
             return;
             break;
           case 9:
             po5 opo5 = p1;
             if ((a8 = opo5.a) == null) {
                osw6.z(i5);
             }else {
                osw6.s(i5, a8);
             }
             osw6.P(2, (long)opo5.b);
             osw6.P(3, opo5.c);
             return;
             break;
           case 10:
             kr okr = p1;
             if ((a9 = okr.a) == null) {
                osw6.z(i5);
             }else {
                osw6.s(i5, a9);
             }
             if ((a9 = okr.b) == null) {
                osw6.z(2);
             }else {
                osw6.s(2, a9);
             }
             if ((a9 = okr.c) == null) {
                osw6.z(3);
             }else {
                osw6.s(3, a9);
             }
             osw6.P(i4, okr.d);
             return;
             break;
           case 11:
             mt omt = p1;
             if ((a10 = omt.a) == null) {
                osw6.z(i5);
             }else {
                osw6.s(i5, a10);
             }
             if ((a10 = omt.b) == null) {
                osw6.z(2);
             }else {
                osw6.s(2, a10);
             }
             if ((a10 = omt.c) == null) {
                osw6.z(3);
             }else {
                osw6.P(3, (long)a10.intValue());
             }
             if ((omt = omt.d) == null) {
                osw6.z(i4);
             }else {
                osw6.P(i4, (long)omt.intValue());
             }
             return;
             break;
           case 12:
             obj = p1;
             obj.getClass();
             osw6.P(i5, (long)i1);
             osw6.P(2, obj.a);
             osw6.P(3, obj.b);
             osw6.P(i4, obj.c);
             osw6.P(i3, (long)obj.d);
             return;
           case 13:
             obj = p1;
             if ((a11 = obj.a) == null) {
                osw6.z(i5);
             }else {
                osw6.s(i5, a11);
             }
             if ((a11 = obj.b) == null) {
                osw6.z(2);
             }else {
                osw6.s(2, a11);
             }
             if ((a11 = obj.c) == null) {
                osw6.z(3);
             }else {
                osw6.s(3, a11);
             }
             if ((a11 = obj.d) == null) {
                osw6.z(i4);
             }else {
                osw6.s(i4, a11);
             }
             osw6.P(i3, obj.e);
             return;
             break;
           case 14:
             jq5 ojq5 = p1;
             if ((a12 = ojq5.a) == null) {
                osw6.z(i5);
             }else {
                osw6.P(i5, a12.longValue());
             }
             if ((a12 = ojq5.b) == null) {
                osw6.z(2);
             }else {
                osw6.P(2, a12.longValue());
             }
             if ((a12 = ojq5.c) == null) {
                osw6.z(3);
             }else {
                osw6.s(3, a12);
             }
             if ((a12 = ojq5.d) == null) {
                osw6.z(i4);
             }else {
                osw6.s(i4, a12);
             }
             if ((a12 = ojq5.e) == null) {
                osw6.z(i3);
             }else {
                osw6.s(i3, a12);
             }
             if ((a12 = ojq5.f) == null) {
                osw6.z(6);
             }else {
                osw6.s(6, a12);
             }
             if ((ojq5 = ojq5.g) == null) {
                osw6.z(i2);
             }else {
                osw6.s(i2, ojq5);
             }
             return;
             break;
           case 15:
             mq5 omq5 = p1;
             if ((a13 = omq5.a) == null) {
                osw6.z(i5);
             }else {
                osw6.P(i5, a13.longValue());
             }
             if ((a13 = omq5.b) == null) {
                osw6.z(2);
             }else {
                osw6.P(2, a13.longValue());
             }
             if ((a13 = omq5.c) == null) {
                osw6.z(3);
             }else {
                osw6.s(3, a13);
             }
             if ((a13 = omq5.d) == null) {
                osw6.z(i4);
             }else {
                osw6.s(i4, a13);
             }
             if ((a13 = omq5.e) == null) {
                osw6.z(i3);
             }else {
                osw6.s(i3, a13);
             }
             if ((a13 = omq5.f) == null) {
                osw6.z(6);
             }else {
                osw6.s(6, a13);
             }
             if ((omq5 = omq5.g) == null) {
                osw6.z(i2);
             }else {
                osw6.s(i2, omq5);
             }
             return;
             break;
           case 16:
             lv olv = p1;
             if ((a14 = olv.a) == null) {
                osw6.z(i5);
             }else {
                osw6.s(i5, a14);
             }
             if ((a14 = olv.b) == null) {
                osw6.z(2);
             }else {
                osw6.s(2, a14);
             }
             if ((a14 = olv.c) == null) {
                osw6.z(3);
             }else {
                osw6.s(3, a14);
             }
             if ((a14 = olv.d) == null) {
                osw6.z(i4);
             }else {
                osw6.s(i4, a14);
             }
             if ((a14 = olv.e) == null) {
                osw6.z(i3);
             }else {
                osw6.s(i3, a14);
             }
             osw6.P(6, olv.f);
             osw6.P(i2, (long)olv.g);
             return;
             break;
           case 17:
             je7 oje7 = p1;
             if ((a15 = oje7.a) == null) {
                osw6.z(i5);
             }else {
                osw6.s(i5, a15);
             }
             if ((a15 = oje7.b) == null) {
                osw6.z(2);
             }else {
                osw6.s(2, a15);
             }
             if ((a15 = oje7.c) == null) {
                osw6.z(3);
             }else {
                osw6.s(3, a15);
             }
             if ((a15 = oje7.d) == null) {
                osw6.z(i4);
             }else {
                osw6.s(i4, a15);
             }
             if ((a15 = oje7.e) == null) {
                osw6.z(i3);
             }else {
                osw6.s(i3, a15);
             }
             if ((a15 = oje7.f) == null) {
                osw6.z(6);
             }else {
                osw6.s(6, a15);
             }
             if ((a15 = oje7.g) == null) {
                osw6.z(i2);
             }else {
                osw6.s(i2, a15);
             }
             if ((oje7 = oje7.h) == null) {
                osw6.z(i);
             }else {
                osw6.s(i, oje7);
             }
             return;
             break;
           default:
             kw okw = p1;
             if ((a16 = okw.a) == null) {
                osw6.z(i5);
             }else {
                osw6.s(i5, a16);
             }
             if ((a16 = okw.b) == null) {
                osw6.z(2);
             }else {
                osw6.s(2, a16);
             }
             if ((a16 = okw.c) == null) {
                osw6.z(3);
             }else {
                osw6.s(3, a16);
             }
             if ((a16 = okw.d) == null) {
                osw6.z(i4);
             }else {
                osw6.s(i4, a16);
             }
             osw6.P(5, okw.e);
             return;
       }
    }
}
