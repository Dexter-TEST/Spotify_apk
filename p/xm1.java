package p.xm1;
import p.yf2;
import android.content.Context;
import p.aq6;
import p.ym1;
import p.k23;
import p.a23;
import java.lang.Object;
import java.lang.Boolean;
import p.zm1;
import p.hu2;
import p.ju2;
import p.j13;
import java.lang.String;
import p.tu2;
import p.au2;
import p.r45;
import p.uw5;
import p.sp6;
import p.ft0;
import p.vs0;
import p.wn1;
import p.fr0;
import p.ry7;
import p.yn1;
import p.yp6;
import p.lp6;
import p.zn1;
import p.h25;
import android.content.res.ColorStateList;
import p.n6;
import p.xn1;

public final class xm1 implements yf2	// class@002ca4 from classes.dex
{
    public final Context a;
    public final aq6 b;
    public final ym1 c;
    public final k23 t;
    public final a23 v;
    public final boolean w;

    public void xm1(Context p0,aq6 p1,ym1 p2,k23 p3,a23 p4,boolean p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
    }
    public final Object apply(Object p0){
       j13 oj13;
       String str1;
       String str2;
       String str3;
       String str4;
       String str5;
       aq6 b4;
       xm1 oxm1 = this;
       boolean b = p0.booleanValue();
       xm1 t = oxm1.t;
       String str = null;
       if (t != null) {
          if ((oj13 = t.u().e()) != null) {
             str1 = oj13.a();
             str = oj13.c();
          }else {
             str1 = str;
          }
          str2 = t.y().d();
          str3 = t.y().m();
          str4 = t.y().e();
          str5 = t.y().j();
       }else {
          str5 = str;
          str1 = str5;
          str2 = str1;
          str3 = str2;
          str4 = str3;
       }
       xm1 v = oxm1.v;
       String str6 = v.q("title");
       String str7 = v.q("subtitle");
       String str8 = v.q("metadata");
       String str9 = v.q("description");
       String str10 = v.q("image_uri");
       p0 = v.q("album_uri");
       String str11 = v.q("show_uri");
       String str12 = v.q("delete_uri");
       String str13 = v.q("artist_uri");
       String str14 = v.q("edit_uri");
       String str15 = v.q("rename_uri");
       String str16 = v.q("share_uri");
       String str17 = v.q("queue_uri");
       String str18 = v.q("track_uri");
       String str19 = v.q("episode_uri");
       boolean b1 = b;
       boolean b2 = v.y("can_remove", false);
       sp6 o0 = sp6.o0;
       sp6 osp6 = o0;
       ft0 uoft0 = new ft0(0);
       uoft0.c = 1;
       ft0 a = uoft0.a;
       a.f = uw5.s(v.q("placeholder")).e(uw5.s(str).e(o0));
       boolean b3 = b2;
       ry7.J(str6, str2, new wn1(a, 0));
       int i = 1;
       ry7.J(str7, str3, new wn1(a, i));
       int i1 = 2;
       ry7.J(str9, str4, new wn1(a, i1));
       ry7.J(str8, str5, new yn1(uoft0, 0));
       ry7.J(str10, str1, new yn1(uoft0, i));
       xm1 a1 = oxm1.a;
       t = oxm1.b;
       xm1 c = oxm1.c;
       if (str12 != null && b1) {
          if (t.b == yp6.w) {
             uoft0.b(R.id.action_delete_track, a1.getString(R.string.entity_menu_delete_track), ry7.I(a1, sp6.q0), new zn1(c, t, 1));
          }else {
             uoft0.b(R.id.action_delete_playlist, a1.getString(R.string.entity_menu_delete_playlist), ry7.I(a1, sp6.q0), new zn1(c, t, i1));
          }
       }else if(oxm1.w != null){
          sp6 q = (b1)? sp6.Q: sp6.P;
          lp6 olp6 = ry7.I(a1, q);
          if (b1) {
             olp6.c(n6.c(a1, R.color.action_green));
          }
          int i2 = (b1)? 0x7f0a005f: 0x7f0a004d;
          uoft0.b(i2, a1.getString(R.string.entity_menu_like), olp6, new zn1(c, t, 0));
       }
       i = 3;
       if (b3 && ((b4 = t.b) == yp6.w && b4 != yp6.m0)) {
          uoft0.b(R.id.action_remove_from_playlist, a1.getString(R.string.entity_menu_remove_from_playlist), ry7.I(a1, sp6.B), new zn1(c, t, i));
       }
       if ((b4 = t.b) == yp6.w || b4 == yp6.m0) {
          uoft0.b(R.id.action_add_to_playlist, a1.getString(R.string.entity_menu_add_to_playlist), ry7.I(a1, sp6.v), new zn1(c, t, 4));
       }
       if (str17 != null) {
          uoft0.b(R.id.action_queue, a1.getString(R.string.entity_menu_queue), ry7.I(a1, sp6.w), new xn1(c, str17, 0));
       }
       if (str13 != null) {
          uoft0.b(R.id.action_view_artist, a1.getString(R.string.entity_menu_view_artist), ry7.I(a1, sp6.z), new xn1(c, str13, 1));
       }
       if (p0 != null) {
          uoft0.b(R.id.action_view_album, a1.getString(R.string.entity_menu_view_album), ry7.I(a1, sp6.x), new xn1(c, p0, i1));
       }
       if (str11 != null) {
          uoft0.b(R.id.action_view_show, a1.getString(R.string.entity_menu_view_show), ry7.I(a1, sp6.b0), new xn1(c, str11, i));
       }
       if (str18 != null) {
          uoft0.b(R.id.action_view_track, a1.getString(R.string.entity_menu_view_track), ry7.I(a1, osp6), new xn1(c, str18, 4));
       }
       if (str19 != null) {
          uoft0.b(R.id.action_view_episode, a1.getString(R.string.entity_menu_view_episode), ry7.I(a1, sp6.b0), new xn1(c, str19, 5));
       }
       if (str14 != null) {
          uoft0.b(R.id.action_edit_playlist, a1.getString(R.string.entity_menu_edit), ry7.I(a1, sp6.T), new xn1(c, str14, 6));
       }
       if (str15 != null) {
          uoft0.b(R.id.action_rename_playlist, a1.getString(R.string.entity_menu_rename), ry7.I(a1, sp6.M), new xn1(c, str15, 7));
       }
       if (str16 != null) {
          uoft0.b(R.id.action_share, a1.getString(R.string.entity_menu_share), ry7.I(a1, sp6.h0), new xn1(c, str16, 8));
       }
       return uoft0;
    }
}
