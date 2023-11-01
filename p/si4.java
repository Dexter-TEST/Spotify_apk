package p.si4;
import p.wy7;
import p.jy0;
import java.lang.Object;
import p.c0;
import java.util.WeakHashMap;
import java.util.Map;
import java.util.Collections;
import com.spotify.lite.database.room.NetworkRoomDatabase;
import p.m91;
import p.xy5;
import p.eb4;
import p.jb7;
import p.kb7;
import p.lb7;
import java.lang.String;
import java.lang.Integer;
import java.util.ArrayList;
import p.fb4;
import p.hs3;
import p.co5;
import p.ll1;
import p.y9;
import p.zg0;
import android.content.Context;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.lang.Throwable;
import android.util.Log;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import p.ov;
import p.pr;
import p.r45;
import java.lang.IllegalStateException;
import p.xy7;
import android.os.Bundle;
import java.lang.Class;
import android.os.BaseBundle;
import java.lang.Boolean;
import java.util.HashMap;
import p.uy7;
import p.ty7;
import p.io2;
import p.ox7;
import p.jd;
import p.jy7;
import p.i28;
import java.util.List;
import java.util.Arrays;
import p.ky7;
import p.iy7;
import java.util.Iterator;
import p.vy7;
import android.content.Intent;
import android.net.Uri;
import p.ny7;
import p.tb2;
import p.u44;
import android.os.Handler;
import p.ka0;
import java.lang.Runnable;
import p.yx5;
import io.reactivex.rxjava3.core.Single;
import p.ic;
import java.lang.System;
import p.ir2;
import p.yf2;
import com.google.android.gms.common.api.Status;
import java.util.Set;
import java.util.Map$Entry;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p.m07;
import p.ve;
import java.lang.Exception;
import p.wh0;
import p.oe7;
import p.bc6;
import p.k80;

public final class si4 implements wy7, jy0	// class@002635 from classes.dex
{
    public Object a;
    public Object b;

    public void si4(int p0){
       if (p0 != 4) {
          if (p0 != 12) {
             super();
             return;
          }else {
             super();
             this.a = c0.a;
             return;
          }
       }else {
          super();
          this.a = Collections.synchronizedMap(new WeakHashMap());
          this.b = Collections.synchronizedMap(new WeakHashMap());
          return;
       }
    }
    public void si4(NetworkRoomDatabase p0){
       super();
       this.a = p0;
       this.b = new m91(this, p0, 12);
    }
    public void si4(Object p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void si4(Object p0,Object p1,int p2){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void si4(eb4 p0){
       this.b = p0;
       super();
       jb7 ojb7 = p0.b.b();
       lb7 v6 = new lb7("secondary_action_button", null, null, null, null);
       ojb7.i.add(v6);
       ojb7.j = true;
       this.a = ojb7.a();
    }
    public void si4(fb4 p0){
       this.b = p0;
       super();
       jb7 ojb7 = p0.b.b();
       lb7 v6 = new lb7("search_bar", null, null, null, null);
       ojb7.i.add(v6);
       ojb7.j = false;
       this.a = ojb7.a();
    }
    public void si4(hs3 p0){
       co5.o(p0, "logger");
       super();
       this.a = p0;
       this.b = ll1.a;
    }
    public void si4(y9 p0,zg0 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static si4 a(Context p0){
       Throwable throwable;
       AbstractInterruptibleChannel uAbstractInt;
       si4 osi41;
       String str = "generatefid.lock";
       si4 osi4 = null;
       try{
          FileChannel channel = new RandomAccessFile(new File(p0.getFilesDir(), str), "rw").getChannel();
          try{
             FileLock uFileLock = channel.lock();
             try{
                return new si4(channel, uFileLock);
             }catch(java.io.IOException e2){
             }catch(java.lang.Error e2){
             }
          label_0031 :
             Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", throwable);
             if (osi41 != null) {
                try{
                   osi41.release();
                }catch(java.io.IOException e0){
                }
             }
             try{
                if (uAbstractInt) {
                   uAbstractInt.close();
                }
                return osi4;
             }catch(java.io.IOException e0){
             }
          }catch(java.io.IOException e0){
          }catch(java.lang.Error e0){
          }
          throwable = e0;
          osi41 = osi4;
          goto label_0031 ;
       }catch(java.io.IOException e5){
       }catch(java.lang.Error e5){
       }
       throwable = e5;
       uAbstractInt = osi4;
       osi41 = uAbstractInt;
       goto label_0031 ;
    }
    public final ov b(){
       String str = (this.b == null)? " commandOptions": "";
       if (str.isEmpty()) {
          return new ov(this.a, this.b);
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final Object c(){
       int intx;
       Boolean fALSE;
       ArrayList parcelableAr;
       int intx3;
       si4 osi4 = this;
       si4 a = osi4.a;
       si4 b = osi4.b;
       a.getClass();
       if (!(intx = b.getInt("session_id"))) {
          fALSE = Boolean.FALSE;
       }else {
          xy7 d = a.d;
          Integer integer = Integer.valueOf(intx);
          String str = "status";
          if (d.containsKey(integer)) {
             uy7 c = a.b(intx).c;
             int intx1 = b.getInt(io2.C(str, c.a));
             ty7 d1 = c.d;
             ty7 a1 = c.a;
             if (ox7.U(d1, intx1)) {
                Object[] objArray = new Object[]{integer,Integer.valueOf(d1)};
                xy7.f.a("Found stale update for session %s with status %d.", objArray);
                ty7 d2 = c.d;
                xy7 b1 = a.b;
                if (d2 == 4) {
                   b1.c().d(intx, a1);
                }else if(d2 == 5){
                   b1.c().a(intx);
                }else if(d2 == 6){
                   String[] stringArray = new String[]{a1};
                   b1.c().f(Arrays.asList(stringArray));
                }
             }else {
                c.d = intx1;
                int i = (intx1 != 5 && (intx1 != 6 && intx1 != 4))? 0: 1;
                if (integer) {
                   a.c(new ky7(a, intx));
                   a.c.a(a1);
                }else {
                   Iterator iterator = c.f.iterator();
                   while (iterator.hasNext()) {
                      vy7 ovy7 = iterator.next();
                      if ((parcelableAr = b.getParcelableArrayList(io2.D("chunk_intents", a1, ovy7.a))) != null) {
                         i = 0;
                         while (i < parcelableAr.size()) {
                            if (parcelableAr.get(i) != null && parcelableAr.get(i).getData() != null) {
                               ovy7.d.get(i).a = true;
                            }
                            i = i + 1;
                         }
                      }
                   }
                }
             }
          }else {
             String str1 = xy7.d(b);
             long longx = b.getLong(io2.C("pack_version", str1));
             String str2 = b.getString(io2.C("pack_version_tag", str1), "");
             int intx2 = b.getInt(io2.C(str, str1));
             long longx1 = b.getLong(io2.C("total_bytes_to_download", str1));
             ArrayList stringArrayL = b.getStringArrayList(io2.C("slice_ids", str1));
             ArrayList uArrayList = new ArrayList();
             if (stringArrayL == null) {
                stringArrayL = Collections.emptyList();
             }
             Iterator ty7 iterator1 = stringArrayL.iterator();
             while (iterator1.hasNext()) {
                str = iterator1.next();
                ArrayList parcelableAr1 = b.getParcelableArrayList(io2.D("chunk_intents", str1, str));
                ArrayList uArrayList1 = new ArrayList();
                if (parcelableAr1 == null) {
                   parcelableAr1 = Collections.emptyList();
                }
                Iterator vy7 iterator2 = parcelableAr1.iterator();
                while (iterator2.hasNext()) {
                   boolean b2 = (iterator2.next() != null)? true: false;
                   uArrayList1.add(new ny7(b2));
                }
                String str3 = b.getString(io2.D("uncompressed_hash_sha256", str1, str));
                long longx2 = b.getLong(io2.D("uncompressed_size", str1, str));
                iterator2 = (intx3 = b.getInt(io2.D("patch_format", str1, str), 0))? new vy7(str, str3, longx2, uArrayList1, 0, intx3): new vy7(str, str3, longx2, uArrayList1, b.getInt(io2.D("compression_format", str1, str), 0), 0);
                uArrayList.add(iterator2);
             }
             iterator1 = new ty7(str1, longx, intx2, longx1, uArrayList, str2);
             d.put(Integer.valueOf(intx), new uy7(intx, b.getInt("app_version_code"), iterator1));
          }
          fALSE = Boolean.TRUE;
       }
       return fALSE;
    }
    public final void d(tb2 p0){
       tb2 b = p0.b;
       int i = 0;
       int i1 = (b == null)? 1: 0;
       if (i1) {
          this.b.post(new ka0(this, this.a, p0.a, i));
       }else {
          yx5 v6 = new yx5(this, this.a, b, 5, 0);
          this.b.post(v6);
       }
       return;
    }
    public final void e(){
       try{
          this.b.release();
          this.a.close();
       }catch(java.io.IOException e0){
          Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e0);
       }
       return;
    }
    public final Single f(int p0,String p1,String p2){
       co5.o(p1, "url");
       co5.o(p2, "query");
       this.b.getClass();
       Single single = this.a.a("allboarding".concat(p1), p2, String.valueOf(System.currentTimeMillis()), Integer.valueOf(p0)).map(ir2.C).onErrorReturn(ir2.D);
       co5.l(single, "apiEndpoint.getAllBoardi….failure\(Exception\(\"\"\)\) }");
       return single;
    }
    public final void g(boolean p0,Status p1){
       si4 ta = this.a;
       _monitor_enter(ta);
       _monitor_exit(ta);
       si4 osi4 = this.b;
       _monitor_enter(osi4);
       HashMap hashMap = new HashMap(this.b);
       _monitor_exit(osi4);
       Iterator iterator = new HashMap(this.a).entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (!p0 && !uEntry.getValue().booleanValue()) {
             continue ;
          }else {
             uEntry.getKey().E(p1);
          }
       }
       Iterator iterator1 = hashMap.entrySet().iterator();
       while (iterator1.hasNext()) {
          Map$Entry uEntry1 = iterator1.next();
          if (!p0 && !uEntry1.getValue().booleanValue()) {
             continue ;
          }else {
             uEntry1.getKey().a(new ve(p1));
          }
       }
       return;
    }
    public final void h(wh0 p0){
       oe7 a;
       if ((a = this.a.a) == null) {
          a = "";
       }
       k80 ok80 = k80.a(a);
       p0.o(6, 2);
       p0.n((wh0.a(1, ok80) + 0));
       p0.i(1, ok80);
       return;
    }
}
