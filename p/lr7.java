package p.lr7;
import p.wd;
import java.lang.Object;
import android.graphics.Matrix;
import p.qy;
import p.sd;
import p.yd;
import p.qd;
import p.rd;
import p.z52;
import p.xy5;
import p.m91;
import p.kr7;
import p.sy;
import p.my;
import java.lang.String;
import p.uy;
import p.uw6;
import p.sw6;
import java.util.ArrayList;
import p.zy5;
import android.database.Cursor;
import p.vv7;
import p.ej4;
import p.rq7;
import p.lv1;
import p.h51;
import java.util.LinkedHashSet;
import p.zq0;
import java.util.Set;
import p.jr7;
import android.graphics.PointF;
import java.lang.Math;
import p.f36;
import java.lang.Float;
import java.lang.Integer;
import p.ir7;

public final class lr7	// class@001dae from classes.dex
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;

    public void lr7(wd p0){
       wd a;
       super();
       this.a = new Matrix();
       qy oqy = ((a = p0.a) == null)? null: a.a();
       this.f = oqy;
       oqy = ((a = p0.b) == null)? null: a.a();
       this.g = oqy;
       oqy = ((a = p0.c) == null)? null: a.a();
       this.h = oqy;
       oqy = ((a = p0.d) == null)? null: a.a();
       this.i = oqy;
       z52 oz52 = ((a = p0.f) == null)? null: a.a();
       this.k = oz52;
       if (oz52 != null) {
          this.b = new Matrix();
          this.c = new Matrix();
          this.d = new Matrix();
          float[] uofloatArray = new float[9];
          this.e = uofloatArray;
       }else {
          this.b = null;
          this.c = null;
          this.d = null;
          this.e = null;
       }
       oz52 = ((a = p0.g) == null)? null: a.a();
       this.l = oz52;
       if ((a = p0.e) != null) {
          this.j = a.a();
       }
       this.m = ((a = p0.h) != null)? a.a(): null;
       this.n = ((p0 = p0.i) != null)? p0.a(): null;
       return;
    }
    public void lr7(xy5 p0){
       super();
       this.a = p0;
       this.b = new m91(this, p0, 5);
       this.c = new kr7(p0);
       this.d = new kr7(p0, 5);
       this.e = new kr7(p0, 6);
       this.f = new kr7(p0, 7);
       this.g = new kr7(p0, 8);
       this.h = new kr7(p0, 9);
       this.i = new kr7(p0, 10);
       this.j = new kr7(p0, 11);
       this.k = new kr7(p0, 0);
       this.l = new kr7(p0, 1);
       this.m = new kr7(p0, 2);
       this.n = new kr7(p0, 3);
    }
    public final void a(sy p0){
       p0.f(this.j);
       p0.f(this.m);
       p0.f(this.n);
       p0.f(this.f);
       p0.f(this.g);
       p0.f(this.h);
       p0.f(this.i);
       p0.f(this.k);
       p0.f(this.l);
    }
    public final void b(my p0){
       lr7 tj = this.j;
       if (tj != null) {
          tj.a(p0);
       }
       tj = this.m;
       if (tj != null) {
          tj.a(p0);
       }
       tj = this.n;
       if (tj != null) {
          tj.a(p0);
       }
       tj = this.f;
       if (tj != null) {
          tj.a(p0);
       }
       tj = this.g;
       if (tj != null) {
          tj.a(p0);
       }
       tj = this.h;
       if (tj != null) {
          tj.a(p0);
       }
       tj = this.i;
       if (tj != null) {
          tj.a(p0);
       }
       tj = this.k;
       if (tj != null) {
          tj.a(p0);
       }
       tj = this.l;
       if (tj != null) {
          tj.a(p0);
       }
       return;
    }
    public final void c(String p0){
       lr7 ta = this.a;
       ta.b();
       lr7 td = this.d;
       uw6 ouw6 = td.c();
       if (p0 == null) {
          ouw6.z(1);
       }else {
          ouw6.s(1, p0);
       }
       ta.c();
       ouw6.u();
       ta.r();
       ta.m();
       td.f(ouw6);
       return;
    }
    public final ArrayList d(){
       boolean b;
       boolean b1;
       boolean b2;
       boolean b3;
       boolean b4;
       zy5 ozy5 = zy5.x(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
       ozy5.P(1, (long)200);
       lr7 a = this.a;
       a.b();
       Cursor uCursor = vv7.J(a, ozy5, false);
       int i = ej4.z(uCursor, "id");
       int i1 = ej4.z(uCursor, "state");
       int i2 = ej4.z(uCursor, "worker_class_name");
       int i3 = ej4.z(uCursor, "input_merger_class_name");
       int i4 = ej4.z(uCursor, "input");
       int i5 = ej4.z(uCursor, "output");
       int i6 = ej4.z(uCursor, "initial_delay");
       int i7 = ej4.z(uCursor, "interval_duration");
       int i8 = ej4.z(uCursor, "flex_duration");
       int i9 = ej4.z(uCursor, "run_attempt_count");
       int i10 = ej4.z(uCursor, "backoff_policy");
       int i11 = ej4.z(uCursor, "backoff_delay_duration");
       int i12 = ej4.z(uCursor, "last_enqueue_time");
       zy5 ozy51 = ozy5;
       int i13 = ej4.z(uCursor, "schedule_requested_at");
       int i14 = ej4.z(uCursor, "run_in_foreground");
       int i15 = ej4.z(uCursor, "out_of_quota_policy");
       int i16 = ej4.z(uCursor, "period_count");
       int i17 = ej4.z(uCursor, "generation");
       int i18 = ej4.z(uCursor, "required_network_type");
       int i19 = ej4.z(uCursor, "requires_charging");
       int i20 = ej4.z(uCursor, "requires_device_idle");
       int i21 = ej4.z(uCursor, "requires_battery_not_low");
       int i22 = ej4.z(uCursor, "requires_storage_not_low");
       int i23 = ej4.z(uCursor, "trigger_content_update_delay");
       int jr7 i24 = ej4.z(uCursor, "trigger_max_content_delay");
       int i25 = ej4.z(uCursor, "content_uri_triggers");
       int i26 = ej4.z(uCursor, "minimum_retention_duration");
       ArrayList uArrayList = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          byte[] uobyteArray = null;
          String str = (uCursor.isNull(i))? uobyteArray: uCursor.getString(i);
          rq7 orq7 = lv1.w(uCursor.getInt(i1));
          String str1 = (uCursor.isNull(i2))? uobyteArray: uCursor.getString(i2);
          String str2 = (uCursor.isNull(i3))? uobyteArray: uCursor.getString(i3);
          int byte[] uobyteArray1 = (uCursor.isNull(i4))? uobyteArray: uCursor.getBlob(i4);
          h51 oh51 = h51.a(uobyteArray1);
          uobyteArray1 = (uCursor.isNull(i5))? uobyteArray: uCursor.getBlob(i5);
          h51 oh511 = h51.a(uobyteArray1);
          long longx = uCursor.getLong(i6);
          long longx1 = uCursor.getLong(i7);
          long longx2 = uCursor.getLong(i8);
          int intx = uCursor.getInt(i9);
          int i27 = lv1.t(uCursor.getInt(i10));
          long longx3 = uCursor.getLong(i11);
          long longx4 = uCursor.getLong(i12);
          uobyteArray1 = i26;
          long longx5 = uCursor.getLong(uobyteArray1);
          i26 = i;
          i = i13;
          long longx6 = uCursor.getLong(i);
          i13 = i14;
          if (uCursor.getInt(i13)) {
             i14 = i13;
             i = i15;
             b = true;
          }else {
             i14 = i13;
             i = i15;
             b = false;
          }
          int i28 = lv1.v(uCursor.getInt(i));
          i15 = i;
          i13 = i16;
          int intx1 = uCursor.getInt(i13);
          i16 = i17;
          int intx2 = uCursor.getInt(i16);
          i17 = i18;
          int i29 = lv1.u(uCursor.getInt(i17));
          i18 = i19;
          if (uCursor.getInt(i18)) {
             i19 = i18;
             i = i20;
             b1 = true;
          }else {
             i19 = i18;
             i = i20;
             b1 = false;
          }
          if (uCursor.getInt(i)) {
             i20 = i;
             i13 = i21;
             b2 = true;
          }else {
             i20 = i;
             i13 = i21;
             b2 = false;
          }
          if (uCursor.getInt(i13)) {
             i21 = i13;
             i16 = i22;
             b3 = true;
          }else {
             i21 = i13;
             i16 = i22;
             b3 = false;
          }
          if (uCursor.getInt(i16)) {
             i22 = i16;
             i17 = i23;
             b4 = true;
          }else {
             i22 = i16;
             i17 = i23;
             b4 = false;
          }
          long longx7 = uCursor.getLong(i17);
          i23 = i17;
          i18 = i24;
          long longx8 = uCursor.getLong(i18);
          i24 = i25;
          if (!uCursor.isNull(i24)) {
             uobyteArray = uCursor.getBlob(i24);
          }
          zq0 v45 = new zq0(i29, b1, b2, b3, b4, longx7, longx8, lv1.e(uobyteArray));
          i25 = i24;
          i24 = new jr7(str, orq7, str1, str2, oh51, oh511, longx, longx1, longx2, v45, intx, i27, longx3, longx4, longx5, longx6, b, i28, intx1, intx2);
          uArrayList.add(i24);
          i = i26;
          i26 = uobyteArray1;
       }
       uCursor.close();
       ozy51.y();
       return uArrayList;
    }
    public final ArrayList e(int p0){
       boolean b;
       boolean b1;
       boolean b2;
       boolean b3;
       boolean b4;
       zy5 ozy5 = zy5.x(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT \(SELECT MAX\(?-COUNT\(*\), 0\) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN \(2, 3, 5\)\)");
       ozy5.P(1, (long)p0);
       lr7 a = this.a;
       a.b();
       Cursor uCursor = vv7.J(a, ozy5, false);
       int i = ej4.z(uCursor, "id");
       int i1 = ej4.z(uCursor, "state");
       int i2 = ej4.z(uCursor, "worker_class_name");
       int i3 = ej4.z(uCursor, "input_merger_class_name");
       int i4 = ej4.z(uCursor, "input");
       int i5 = ej4.z(uCursor, "output");
       int i6 = ej4.z(uCursor, "initial_delay");
       int i7 = ej4.z(uCursor, "interval_duration");
       int i8 = ej4.z(uCursor, "flex_duration");
       int i9 = ej4.z(uCursor, "run_attempt_count");
       int i10 = ej4.z(uCursor, "backoff_policy");
       int i11 = ej4.z(uCursor, "backoff_delay_duration");
       int i12 = ej4.z(uCursor, "last_enqueue_time");
       zy5 ozy51 = ozy5;
       int i13 = ej4.z(uCursor, "schedule_requested_at");
       int i14 = ej4.z(uCursor, "run_in_foreground");
       int i15 = ej4.z(uCursor, "out_of_quota_policy");
       int i16 = ej4.z(uCursor, "period_count");
       int i17 = ej4.z(uCursor, "generation");
       int i18 = ej4.z(uCursor, "required_network_type");
       int i19 = ej4.z(uCursor, "requires_charging");
       int i20 = ej4.z(uCursor, "requires_device_idle");
       int i21 = ej4.z(uCursor, "requires_battery_not_low");
       int i22 = ej4.z(uCursor, "requires_storage_not_low");
       int i23 = ej4.z(uCursor, "trigger_content_update_delay");
       int jr7 i24 = ej4.z(uCursor, "trigger_max_content_delay");
       int i25 = ej4.z(uCursor, "content_uri_triggers");
       int i26 = ej4.z(uCursor, "minimum_retention_duration");
       ArrayList uArrayList = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          byte[] uobyteArray = null;
          String str = (uCursor.isNull(i))? uobyteArray: uCursor.getString(i);
          rq7 orq7 = lv1.w(uCursor.getInt(i1));
          String str1 = (uCursor.isNull(i2))? uobyteArray: uCursor.getString(i2);
          String str2 = (uCursor.isNull(i3))? uobyteArray: uCursor.getString(i3);
          int byte[] uobyteArray1 = (uCursor.isNull(i4))? uobyteArray: uCursor.getBlob(i4);
          h51 oh51 = h51.a(uobyteArray1);
          uobyteArray1 = (uCursor.isNull(i5))? uobyteArray: uCursor.getBlob(i5);
          h51 oh511 = h51.a(uobyteArray1);
          long longx = uCursor.getLong(i6);
          long longx1 = uCursor.getLong(i7);
          long longx2 = uCursor.getLong(i8);
          int intx = uCursor.getInt(i9);
          int i27 = lv1.t(uCursor.getInt(i10));
          long longx3 = uCursor.getLong(i11);
          long longx4 = uCursor.getLong(i12);
          uobyteArray1 = i26;
          long longx5 = uCursor.getLong(uobyteArray1);
          i26 = i;
          i = i13;
          long longx6 = uCursor.getLong(i);
          i13 = i14;
          if (uCursor.getInt(i13)) {
             i14 = i13;
             i = i15;
             b = true;
          }else {
             i14 = i13;
             i = i15;
             b = false;
          }
          int i28 = lv1.v(uCursor.getInt(i));
          i15 = i;
          i13 = i16;
          int intx1 = uCursor.getInt(i13);
          i16 = i17;
          int intx2 = uCursor.getInt(i16);
          i17 = i18;
          int i29 = lv1.u(uCursor.getInt(i17));
          i18 = i19;
          if (uCursor.getInt(i18)) {
             i19 = i18;
             i = i20;
             b1 = true;
          }else {
             i19 = i18;
             i = i20;
             b1 = false;
          }
          if (uCursor.getInt(i)) {
             i20 = i;
             i13 = i21;
             b2 = true;
          }else {
             i20 = i;
             i13 = i21;
             b2 = false;
          }
          if (uCursor.getInt(i13)) {
             i21 = i13;
             i16 = i22;
             b3 = true;
          }else {
             i21 = i13;
             i16 = i22;
             b3 = false;
          }
          if (uCursor.getInt(i16)) {
             i22 = i16;
             i17 = i23;
             b4 = true;
          }else {
             i22 = i16;
             i17 = i23;
             b4 = false;
          }
          long longx7 = uCursor.getLong(i17);
          i23 = i17;
          i18 = i24;
          long longx8 = uCursor.getLong(i18);
          i24 = i25;
          if (!uCursor.isNull(i24)) {
             uobyteArray = uCursor.getBlob(i24);
          }
          zq0 v45 = new zq0(i29, b1, b2, b3, b4, longx7, longx8, lv1.e(uobyteArray));
          i25 = i24;
          i24 = new jr7(str, orq7, str1, str2, oh51, oh511, longx, longx1, longx2, v45, intx, i27, longx3, longx4, longx5, longx6, b, i28, intx1, intx2);
          uArrayList.add(i24);
          i = i26;
          i26 = uobyteArray1;
       }
       uCursor.close();
       ozy51.y();
       return uArrayList;
    }
    public final Matrix f(){
       PointF pointF;
       float f;
       lr7 e;
       lr7 olr7 = this;
       lr7 a = olr7.a;
       a.reset();
       lr7 g = olr7.g;
       int i = 0;
       if (g != null && (pointF = g.e()) != null) {
          PointF x = pointF.x;
          if ((i - x) || (i - pointF.y)) {
             a.preTranslate(x, pointF.y);
          }
       }
       if ((g = olr7.i) != null) {
          f = g.i();
          if (i - f) {
             a.preRotate(f);
          }
       }
       g = olr7.k;
       int i1 = 0x3f800000;
       if (g != null) {
          lr7 l = olr7.l;
          float f1 = 90.00f;
          int i2 = (l == null)? 0: (float)Math.cos(Math.toRadians((double)((- l.i()) + f1)));
          int i3 = (l == null)? 0x3f800000: (float)Math.sin(Math.toRadians((double)((- l.i()) + f1)));
          f = (float)Math.tan(Math.toRadians((double)g.i()));
          int i4 = 0;
          int i5 = 0;
          while (true) {
             e = olr7.e;
             if (i5 < 9) {
                e[i5] = i;
                i5 = i5 + 1;
             }else {
                break ;
             }
          }
          lr7 olr71 = e;
          olr71[i4] = i2;
          olr71[1] = i3;
          float f2 = - i3;
          olr71[3] = f2;
          olr71[4] = i2;
          olr71[8] = i1;
          lr7 b = olr7.b;
          b.setValues(olr71);
          for (int i6 = 0; i6 < 9; i6 = i6 + 1) {
             e[i6] = i;
          }
          olr71[i4] = i1;
          olr71[3] = f;
          olr71[4] = i1;
          olr71[8] = i1;
          g = olr7.c;
          g.setValues(olr71);
          for (i6 = 0; i6 < 9; i6 = i6 + 1) {
             e[i6] = i;
          }
          olr71[i4] = i2;
          olr71[1] = f2;
          olr71[3] = i3;
          olr71[4] = i2;
          olr71[8] = i1;
          l = olr7.d;
          l.setValues(olr71);
          g.preConcat(b);
          l.preConcat(g);
          a.preConcat(l);
       }
       if ((g = olr7.h) != null) {
          f36 uof36 = g.e();
          f36 a1 = uof36.a;
          if ((i1 - a1) || (i1 - uof36.b)) {
             a.preScale(a1, uof36.b);
          }
       }
       if ((g = olr7.f) != null && ((pointF = g.e()) != null && ((i - pointF.x) || (i - pointF.y)))) {
          a.preTranslate((- pointF.x), (- pointF.y));
       }
       return a;
    }
    public final Matrix g(float p0){
       lr7 tg = this.g;
       PointF pointF = null;
       PointF pointF1 = (tg == null)? pointF: tg.e();
       lr7 th = this.h;
       f36 uof36 = (th == null)? pointF: th.e();
       lr7 ta = this.a;
       ta.reset();
       if (pointF1 != null) {
          ta.preTranslate((pointF1.x * p0), (pointF1.y * p0));
       }
       if (uof36 != null) {
          double d = (double)p0;
          ta.preScale((float)Math.pow((double)uof36.a, d), (float)Math.pow((double)uof36.b, d));
       }
       tg = this.i;
       if (tg != null) {
          float f = tg.e().floatValue();
          th = this.f;
          if (th != null) {
             pointF = th.e();
          }
          th = ta;
          f = f * p0;
          p0 = 0;
          float f1 = (pointF == null)? 0: pointF.x;
          if (pointF != null) {
             PointF y = pointF.y;
          }
          th.preRotate(f, f1, p0);
       }
       return ta;
    }
    public final ArrayList h(){
       boolean b;
       boolean b1;
       boolean b2;
       boolean b3;
       boolean b4;
       zy5 ozy5 = zy5.x(0, "SELECT * FROM workspec WHERE state=1");
       lr7 a = this.a;
       a.b();
       Cursor uCursor = vv7.J(a, ozy5, 0);
       int i = ej4.z(uCursor, "id");
       int i1 = ej4.z(uCursor, "state");
       int i2 = ej4.z(uCursor, "worker_class_name");
       int i3 = ej4.z(uCursor, "input_merger_class_name");
       int i4 = ej4.z(uCursor, "input");
       int i5 = ej4.z(uCursor, "output");
       int i6 = ej4.z(uCursor, "initial_delay");
       int i7 = ej4.z(uCursor, "interval_duration");
       int i8 = ej4.z(uCursor, "flex_duration");
       int i9 = ej4.z(uCursor, "run_attempt_count");
       int i10 = ej4.z(uCursor, "backoff_policy");
       int i11 = ej4.z(uCursor, "backoff_delay_duration");
       int i12 = ej4.z(uCursor, "last_enqueue_time");
       zy5 ozy51 = ozy5;
       int i13 = ej4.z(uCursor, "schedule_requested_at");
       int i14 = ej4.z(uCursor, "run_in_foreground");
       int i15 = ej4.z(uCursor, "out_of_quota_policy");
       int i16 = ej4.z(uCursor, "period_count");
       int i17 = ej4.z(uCursor, "generation");
       int i18 = ej4.z(uCursor, "required_network_type");
       int i19 = ej4.z(uCursor, "requires_charging");
       int i20 = ej4.z(uCursor, "requires_device_idle");
       int i21 = ej4.z(uCursor, "requires_battery_not_low");
       int i22 = ej4.z(uCursor, "requires_storage_not_low");
       int i23 = ej4.z(uCursor, "trigger_content_update_delay");
       int jr7 i24 = ej4.z(uCursor, "trigger_max_content_delay");
       int i25 = ej4.z(uCursor, "content_uri_triggers");
       int i26 = ej4.z(uCursor, "minimum_retention_duration");
       ArrayList uArrayList = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          byte[] uobyteArray = null;
          String str = (uCursor.isNull(i))? uobyteArray: uCursor.getString(i);
          rq7 orq7 = lv1.w(uCursor.getInt(i1));
          String str1 = (uCursor.isNull(i2))? uobyteArray: uCursor.getString(i2);
          String str2 = (uCursor.isNull(i3))? uobyteArray: uCursor.getString(i3);
          int byte[] uobyteArray1 = (uCursor.isNull(i4))? uobyteArray: uCursor.getBlob(i4);
          h51 oh51 = h51.a(uobyteArray1);
          uobyteArray1 = (uCursor.isNull(i5))? uobyteArray: uCursor.getBlob(i5);
          h51 oh511 = h51.a(uobyteArray1);
          long longx = uCursor.getLong(i6);
          long longx1 = uCursor.getLong(i7);
          long longx2 = uCursor.getLong(i8);
          int intx = uCursor.getInt(i9);
          int i27 = lv1.t(uCursor.getInt(i10));
          long longx3 = uCursor.getLong(i11);
          long longx4 = uCursor.getLong(i12);
          uobyteArray1 = i26;
          long longx5 = uCursor.getLong(uobyteArray1);
          i26 = i;
          i = i13;
          long longx6 = uCursor.getLong(i);
          i13 = i14;
          if (uCursor.getInt(i13)) {
             i14 = i13;
             i = i15;
             b = true;
          }else {
             i14 = i13;
             i = i15;
             b = false;
          }
          int i28 = lv1.v(uCursor.getInt(i));
          i15 = i;
          i13 = i16;
          int intx1 = uCursor.getInt(i13);
          i16 = i17;
          int intx2 = uCursor.getInt(i16);
          i17 = i18;
          int i29 = lv1.u(uCursor.getInt(i17));
          i18 = i19;
          if (uCursor.getInt(i18)) {
             i19 = i18;
             i = i20;
             b1 = true;
          }else {
             i19 = i18;
             i = i20;
             b1 = false;
          }
          if (uCursor.getInt(i)) {
             i20 = i;
             i13 = i21;
             b2 = true;
          }else {
             i20 = i;
             i13 = i21;
             b2 = false;
          }
          if (uCursor.getInt(i13)) {
             i21 = i13;
             i16 = i22;
             b3 = true;
          }else {
             i21 = i13;
             i16 = i22;
             b3 = false;
          }
          if (uCursor.getInt(i16)) {
             i22 = i16;
             i17 = i23;
             b4 = true;
          }else {
             i22 = i16;
             i17 = i23;
             b4 = false;
          }
          long longx7 = uCursor.getLong(i17);
          i23 = i17;
          i18 = i24;
          long longx8 = uCursor.getLong(i18);
          i24 = i25;
          if (!uCursor.isNull(i24)) {
             uobyteArray = uCursor.getBlob(i24);
          }
          zq0 v45 = new zq0(i29, b1, b2, b3, b4, longx7, longx8, lv1.e(uobyteArray));
          i25 = i24;
          i24 = new jr7(str, orq7, str1, str2, oh51, oh511, longx, longx1, longx2, v45, intx, i27, longx3, longx4, longx5, longx6, b, i28, intx1, intx2);
          uArrayList.add(i24);
          i = i26;
          i26 = uobyteArray1;
       }
       uCursor.close();
       ozy51.y();
       return uArrayList;
    }
    public final ArrayList i(){
       boolean b;
       boolean b1;
       boolean b2;
       boolean b3;
       boolean b4;
       zy5 ozy5 = zy5.x(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
       lr7 a = this.a;
       a.b();
       Cursor uCursor = vv7.J(a, ozy5, 0);
       int i = ej4.z(uCursor, "id");
       int i1 = ej4.z(uCursor, "state");
       int i2 = ej4.z(uCursor, "worker_class_name");
       int i3 = ej4.z(uCursor, "input_merger_class_name");
       int i4 = ej4.z(uCursor, "input");
       int i5 = ej4.z(uCursor, "output");
       int i6 = ej4.z(uCursor, "initial_delay");
       int i7 = ej4.z(uCursor, "interval_duration");
       int i8 = ej4.z(uCursor, "flex_duration");
       int i9 = ej4.z(uCursor, "run_attempt_count");
       int i10 = ej4.z(uCursor, "backoff_policy");
       int i11 = ej4.z(uCursor, "backoff_delay_duration");
       int i12 = ej4.z(uCursor, "last_enqueue_time");
       zy5 ozy51 = ozy5;
       int i13 = ej4.z(uCursor, "schedule_requested_at");
       int i14 = ej4.z(uCursor, "run_in_foreground");
       int i15 = ej4.z(uCursor, "out_of_quota_policy");
       int i16 = ej4.z(uCursor, "period_count");
       int i17 = ej4.z(uCursor, "generation");
       int i18 = ej4.z(uCursor, "required_network_type");
       int i19 = ej4.z(uCursor, "requires_charging");
       int i20 = ej4.z(uCursor, "requires_device_idle");
       int i21 = ej4.z(uCursor, "requires_battery_not_low");
       int i22 = ej4.z(uCursor, "requires_storage_not_low");
       int i23 = ej4.z(uCursor, "trigger_content_update_delay");
       int jr7 i24 = ej4.z(uCursor, "trigger_max_content_delay");
       int i25 = ej4.z(uCursor, "content_uri_triggers");
       int i26 = ej4.z(uCursor, "minimum_retention_duration");
       ArrayList uArrayList = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          byte[] uobyteArray = null;
          String str = (uCursor.isNull(i))? uobyteArray: uCursor.getString(i);
          rq7 orq7 = lv1.w(uCursor.getInt(i1));
          String str1 = (uCursor.isNull(i2))? uobyteArray: uCursor.getString(i2);
          String str2 = (uCursor.isNull(i3))? uobyteArray: uCursor.getString(i3);
          int byte[] uobyteArray1 = (uCursor.isNull(i4))? uobyteArray: uCursor.getBlob(i4);
          h51 oh51 = h51.a(uobyteArray1);
          uobyteArray1 = (uCursor.isNull(i5))? uobyteArray: uCursor.getBlob(i5);
          h51 oh511 = h51.a(uobyteArray1);
          long longx = uCursor.getLong(i6);
          long longx1 = uCursor.getLong(i7);
          long longx2 = uCursor.getLong(i8);
          int intx = uCursor.getInt(i9);
          int i27 = lv1.t(uCursor.getInt(i10));
          long longx3 = uCursor.getLong(i11);
          long longx4 = uCursor.getLong(i12);
          uobyteArray1 = i26;
          long longx5 = uCursor.getLong(uobyteArray1);
          i26 = i;
          i = i13;
          long longx6 = uCursor.getLong(i);
          i13 = i14;
          if (uCursor.getInt(i13)) {
             i14 = i13;
             i = i15;
             b = true;
          }else {
             i14 = i13;
             i = i15;
             b = false;
          }
          int i28 = lv1.v(uCursor.getInt(i));
          i15 = i;
          i13 = i16;
          int intx1 = uCursor.getInt(i13);
          i16 = i17;
          int intx2 = uCursor.getInt(i16);
          i17 = i18;
          int i29 = lv1.u(uCursor.getInt(i17));
          i18 = i19;
          if (uCursor.getInt(i18)) {
             i19 = i18;
             i = i20;
             b1 = true;
          }else {
             i19 = i18;
             i = i20;
             b1 = false;
          }
          if (uCursor.getInt(i)) {
             i20 = i;
             i13 = i21;
             b2 = true;
          }else {
             i20 = i;
             i13 = i21;
             b2 = false;
          }
          if (uCursor.getInt(i13)) {
             i21 = i13;
             i16 = i22;
             b3 = true;
          }else {
             i21 = i13;
             i16 = i22;
             b3 = false;
          }
          if (uCursor.getInt(i16)) {
             i22 = i16;
             i17 = i23;
             b4 = true;
          }else {
             i22 = i16;
             i17 = i23;
             b4 = false;
          }
          long longx7 = uCursor.getLong(i17);
          i23 = i17;
          i18 = i24;
          long longx8 = uCursor.getLong(i18);
          i24 = i25;
          if (!uCursor.isNull(i24)) {
             uobyteArray = uCursor.getBlob(i24);
          }
          zq0 v45 = new zq0(i29, b1, b2, b3, b4, longx7, longx8, lv1.e(uobyteArray));
          i25 = i24;
          i24 = new jr7(str, orq7, str1, str2, oh51, oh511, longx, longx1, longx2, v45, intx, i27, longx3, longx4, longx5, longx6, b, i28, intx1, intx2);
          uArrayList.add(i24);
          i = i26;
          i26 = uobyteArray1;
       }
       uCursor.close();
       ozy51.y();
       return uArrayList;
    }
    public final rq7 j(String p0){
       boolean i = 1;
       zy5 ozy5 = zy5.x(i, "SELECT state FROM workspec WHERE id=?");
       if (p0 == null) {
          ozy5.z(i);
       }else {
          ozy5.s(i, p0);
       }
       lr7 ta = this.a;
       ta.b();
       i = false;
       Cursor uCursor = vv7.J(ta, ozy5, i);
       rq7 orq7 = null;
       if (uCursor.moveToFirst()) {
          Integer integer = (uCursor.isNull(i))? orq7: Integer.valueOf(uCursor.getInt(i));
          if (integer != null) {
             orq7 = lv1.w(integer.intValue());
          }
       }
       uCursor.close();
       ozy5.y();
       return orq7;
    }
    public final ArrayList k(String p0){
       int i = 1;
       zy5 ozy5 = zy5.x(i, "SELECT id FROM workspec WHERE state NOT IN \(2, 3, 5\) AND id IN \(SELECT work_spec_id FROM workname WHERE name=?\)");
       if (p0 == null) {
          ozy5.z(i);
       }else {
          ozy5.s(i, p0);
       }
       lr7 ta = this.a;
       ta.b();
       Cursor uCursor = vv7.J(ta, ozy5, false);
       ArrayList uArrayList = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          String str = (uCursor.isNull(false))? null: uCursor.getString(false);
          uArrayList.add(str);
       }
       uCursor.close();
       ozy5.y();
       return uArrayList;
    }
    public final jr7 l(String p0){
       boolean b;
       boolean b1;
       boolean b2;
       boolean b3;
       boolean b4;
       String str = p0;
       int i = 1;
       zy5 ozy5 = zy5.x(i, "SELECT * FROM workspec WHERE id=?");
       if (!str) {
          ozy5.z(i);
       }else {
          ozy5.s(i, str);
       }
       lr7 a = this.a;
       a.b();
       Cursor uCursor = vv7.J(a, ozy5, false);
       int i1 = ej4.z(uCursor, "id");
       int i2 = ej4.z(uCursor, "state");
       int i3 = ej4.z(uCursor, "worker_class_name");
       int i4 = ej4.z(uCursor, "input_merger_class_name");
       int i5 = ej4.z(uCursor, "input");
       int i6 = ej4.z(uCursor, "output");
       int i7 = ej4.z(uCursor, "initial_delay");
       int i8 = ej4.z(uCursor, "interval_duration");
       int i9 = ej4.z(uCursor, "flex_duration");
       int i10 = ej4.z(uCursor, "run_attempt_count");
       int i11 = ej4.z(uCursor, "backoff_policy");
       i = ej4.z(uCursor, "backoff_delay_duration");
       int i12 = ej4.z(uCursor, "last_enqueue_time");
       int i13 = ej4.z(uCursor, "minimum_retention_duration");
       zy5 ozy51 = ozy5;
       int i14 = ej4.z(uCursor, "schedule_requested_at");
       int i15 = ej4.z(uCursor, "run_in_foreground");
       int i16 = ej4.z(uCursor, "out_of_quota_policy");
       int i17 = ej4.z(uCursor, "period_count");
       int i18 = ej4.z(uCursor, "generation");
       int i19 = ej4.z(uCursor, "required_network_type");
       int i20 = ej4.z(uCursor, "requires_charging");
       int i21 = ej4.z(uCursor, "requires_device_idle");
       int i22 = ej4.z(uCursor, "requires_battery_not_low");
       int i23 = ej4.z(uCursor, "requires_storage_not_low");
       int i24 = ej4.z(uCursor, "trigger_content_update_delay");
       int i25 = ej4.z(uCursor, "trigger_max_content_delay");
       int i26 = ej4.z(uCursor, "content_uri_triggers");
       byte[] uobyteArray = null;
       if (uCursor.moveToFirst()) {
          String str1 = (uCursor.isNull(i1))? uobyteArray: uCursor.getString(i1);
          rq7 orq7 = lv1.w(uCursor.getInt(i2));
          String str2 = (uCursor.isNull(i3))? uobyteArray: uCursor.getString(i3);
          String str3 = (uCursor.isNull(i4))? uobyteArray: uCursor.getString(i4);
          byte[] uobyteArray1 = (uCursor.isNull(i5))? uobyteArray: uCursor.getBlob(i5);
          h51 oh51 = h51.a(uobyteArray1);
          uobyteArray1 = (uCursor.isNull(i6))? uobyteArray: uCursor.getBlob(i6);
          h51 oh511 = h51.a(uobyteArray1);
          long longx = uCursor.getLong(i7);
          long longx1 = uCursor.getLong(i8);
          long longx2 = uCursor.getLong(i9);
          int intx = uCursor.getInt(i10);
          int i27 = lv1.t(uCursor.getInt(i11));
          long longx3 = uCursor.getLong(i);
          long longx4 = uCursor.getLong(i12);
          long longx5 = uCursor.getLong(i13);
          long longx6 = uCursor.getLong(i14);
          if (uCursor.getInt(i15)) {
             i1 = i16;
             b = true;
          }else {
             i1 = i16;
             b = false;
          }
          int i28 = lv1.v(uCursor.getInt(i1));
          int intx1 = uCursor.getInt(i17);
          int intx2 = uCursor.getInt(i18);
          int i29 = lv1.u(uCursor.getInt(i19));
          if (uCursor.getInt(i20)) {
             i1 = i21;
             b1 = true;
          }else {
             i1 = i21;
             b1 = false;
          }
          if (uCursor.getInt(i1)) {
             i1 = i22;
             b2 = true;
          }else {
             i1 = i22;
             b2 = false;
          }
          if (uCursor.getInt(i1)) {
             i1 = i23;
             b3 = true;
          }else {
             i1 = i23;
             b3 = false;
          }
          if (uCursor.getInt(i1)) {
             i1 = i24;
             b4 = true;
          }else {
             i1 = i24;
             b4 = false;
          }
          long longx7 = uCursor.getLong(i1);
          long longx8 = uCursor.getLong(i25);
          if (!uCursor.isNull(i26)) {
             uobyteArray = uCursor.getBlob(i26);
          }
          zq0 v44 = new zq0(i29, b1, b2, b3, b4, longx7, longx8, lv1.e(uobyteArray));
          jr7 uobyteArray2 = new jr7(str1, orq7, str2, str3, oh51, oh511, longx, longx1, longx2, v44, intx, i27, longx3, longx4, longx5, longx6, b, i28, intx1, intx2);
       }
       uCursor.close();
       ozy51.y();
       return uobyteArray;
    }
    public final ArrayList m(String p0){
       zy5 ozy5 = zy5.x(1, "SELECT id, state FROM workspec WHERE id IN \(SELECT work_spec_id FROM workname WHERE name=?\)");
       if (p0 == null) {
          ozy5.z(1);
       }else {
          ozy5.s(1, p0);
       }
       lr7 ta = this.a;
       ta.b();
       Cursor uCursor = vv7.J(ta, ozy5, false);
       ArrayList uArrayList = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          String str = (uCursor.isNull(false))? null: uCursor.getString(false);
          uArrayList.add(new ir7(lv1.w(uCursor.getInt(1)), str));
       }
       uCursor.close();
       ozy5.y();
       return uArrayList;
    }
    public final boolean n(){
       int i = 0;
       zy5 ozy5 = zy5.x(i, "SELECT COUNT\(*\) > 0 FROM workspec WHERE state NOT IN \(2, 3, 5\) LIMIT 1");
       lr7 ta = this.a;
       ta.b();
       Cursor uCursor = vv7.J(ta, ozy5, i);
       if (uCursor.moveToFirst() && uCursor.getInt(i)) {
          i = true;
       }
       uCursor.close();
       ozy5.y();
       return i;
    }
    public final void o(String p0){
       lr7 ta = this.a;
       ta.b();
       lr7 tf = this.f;
       uw6 ouw6 = tf.c();
       if (p0 == null) {
          ouw6.z(1);
       }else {
          ouw6.s(1, p0);
       }
       ta.c();
       ouw6.u();
       ta.r();
       ta.m();
       tf.f(ouw6);
       return;
    }
    public final void p(String p0){
       lr7 ta = this.a;
       lr7 olr7 = ta;
       olr7.b();
       lr7 ti = this.i;
       uw6 ouw6 = ti.c();
       if (p0 == null) {
          ouw6.z(1);
       }else {
          ouw6.s(1, p0);
       }
       olr7.c();
       ouw6.u();
       ta.r();
       olr7.m();
       ti.f(ouw6);
       return;
    }
    public final void q(String p0,long p1){
       lr7 ta = this.a;
       lr7 olr7 = ta;
       olr7.b();
       lr7 tk = this.k;
       uw6 ouw6 = tk.c();
       ouw6.P(1, p1);
       if (p0 == null) {
          ouw6.z(2);
       }else {
          ouw6.s(2, p0);
       }
       olr7.c();
       ouw6.u();
       ta.r();
       olr7.m();
       tk.f(ouw6);
       return;
    }
    public final void r(String p0){
       lr7 ta = this.a;
       lr7 olr7 = ta;
       olr7.b();
       lr7 tj = this.j;
       uw6 ouw6 = tj.c();
       if (p0 == null) {
          ouw6.z(1);
       }else {
          ouw6.s(1, p0);
       }
       olr7.c();
       ouw6.u();
       ta.r();
       olr7.m();
       tj.f(ouw6);
       return;
    }
    public final void s(String p0,long p1){
       lr7 ta = this.a;
       ta.b();
       lr7 th = this.h;
       uw6 ouw6 = th.c();
       ouw6.P(1, p1);
       if (p0 == null) {
          ouw6.z(2);
       }else {
          ouw6.s(2, p0);
       }
       ta.c();
       ouw6.u();
       ta.r();
       ta.m();
       th.f(ouw6);
       return;
    }
    public final void t(String p0,h51 p1){
       byte[] uobyteArray;
       lr7 ta = this.a;
       ta.b();
       lr7 tg = this.g;
       uw6 ouw6 = tg.c();
       if ((uobyteArray = h51.b(p1)) == null) {
          ouw6.z(1);
       }else {
          ouw6.d0(uobyteArray, 1);
       }
       if (p0 == null) {
          ouw6.z(2);
       }else {
          ouw6.s(2, p0);
       }
       ta.c();
       ouw6.u();
       ta.r();
       ta.m();
       tg.f(ouw6);
       return;
    }
    public final void u(rq7 p0,String p1){
       lr7 ta = this.a;
       lr7 olr7 = ta;
       olr7.b();
       lr7 te = this.e;
       uw6 ouw6 = te.c();
       ouw6.P(1, (long)lv1.H(p0));
       if (p1 == null) {
          ouw6.z(2);
       }else {
          ouw6.s(2, p1);
       }
       olr7.c();
       ouw6.u();
       ta.r();
       olr7.m();
       te.f(ouw6);
       return;
    }
}
