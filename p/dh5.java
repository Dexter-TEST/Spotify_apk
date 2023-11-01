package p.dh5;
import p.ez;
import android.content.Context;
import p.mp;
import p.vt;
import java.lang.Object;
import p.r45;
import p.au2;
import p.xu;
import java.lang.String;
import p.aq6;
import p.zt2;
import p.ty0;
import p.iw;
import p.vp;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.google.common.collect.c;
import p.ys5;
import java.util.List;
import p.a23;
import p.a43;
import java.util.Iterator;
import p.aw;
import java.lang.Iterable;
import p.ab2;
import p.pp;
import java.lang.Boolean;
import p.as;
import p.jj5;
import p.zu;
import p.sp6;
import p.ju2;
import p.jl6;
import p.r70;
import p.xm0;
import p.d73;
import java.lang.StringBuilder;
import p.a73;
import java.lang.Math;
import p.zv;
import p.zs;
import java.util.ArrayList;
import p.iu2;
import p.c03;
import p.fu2;
import java.io.Serializable;
import p.su2;
import p.st2;
import p.ox7;
import p.n13;
import p.tt2;
import p.l03;
import p.h13;
import p.k23;
import p.x03;

public final class dh5 extends ez	// class@00134a from classes.dex
{
    public final Context a;
    public final mp b;

    public void dh5(Context p0,mp p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final au2 a(vt p0,Object p1,r45 p2){
       String str = p0.a.toString();
       zt2 ozt2 = ty0.b().r("context_uri", str).r("share_uri", str);
       p1 = p1.b.b;
       r45 or45 = this.b.a();
       boolean b = (p1 != null && or45.c())? TextUtils.equals(p1, or45.b()): false;
       if (b) {
          ozt2 = ozt2.r("rename_uri", str).r("delete_uri", str);
          if (!p2.e(ys5.v).isEmpty()) {
             ozt2 = ozt2.r("edit_uri", str);
          }
       }
       return ozt2.d();
    }
    public final a43 b(vt p0,Object p1,r45 p2,a43 p3){
       String str;
       ju2 oju2;
       d73 uod73;
       ArrayList uArrayList1;
       xu a = p1.a;
       List list = p2.e(ys5.v);
       xu b = p1.b;
       iw b1 = b.b;
       r45 or45 = this.b.a();
       int i = 0;
       boolean b2 = (b1 != null && or45.c())? TextUtils.equals(b1, or45.b()): false;
       int i1 = 1;
       if (!list.isEmpty()) {
          Iterator iterator2 = list.iterator();
          while (true) {
             if (iterator2.hasNext()) {
                aw uoaw2 = iterator2.next();
                if (!uoaw2.a.startsWith("spotify:track:") && !uoaw2.a.startsWith("spotify:local:")) {
                   continue ;
                }
             }else {
                iterator2 = 1;
             label_005e :
                if (!list.isEmpty()) {
                   pp opp = new pp(6);
                   Iterator iterator1 = ab2.b(list).c().iterator();
                   int i4 = 0;
                   while (true) {
                      int i5 = -1;
                      if (iterator1.hasNext()) {
                         if (opp.apply(iterator1.next())) {
                         label_008e :
                            if (i4 != i5) {
                               iterator1 = 1;
                            label_0093 :
                               if (or45 && (p0.e.c() && !p0.e.b().booleanValue())) {
                                  vt g = p0.g;
                                  if (g.c() && !g.b().booleanValue()) {
                                     as uoas = new as(p0);
                                     uoas.h = r45.d(Boolean.TRUE);
                                     p0 = uoas.b();
                                  }
                               }
                               zu c = a.c;
                               dh5 ta = this.a;
                               if (b2) {
                                  str = ta.getString(R.string.playlist_ownership_by_user);
                               }else {
                                  Object[] objArray = new Object[i1];
                                  objArray[i] = b.c;
                                  str = ta.getString(R.string.playlist_ownership_by_other, objArray);
                               }
                               sp6 z = sp6.Z;
                               ju2[] oju2Array = new ju2[i1];
                               if (p0.a()) {
                                  oju2 = jl6.b(ta);
                               }else if(i2){
                                  oju2 = r70.b(ta, p0);
                               }else {
                                  oju2 = null;
                               }
                               oju2Array[i] = oju2;
                               p1 = p3.i(xm0.b(c, str, z, p1.c, oju2Array));
                               uod73 = new d73();
                               vt a1 = p0.a;
                               String str1 = "spotify:internal:assisted-curation-view:";
                               if (!list.isEmpty()) {
                                  if (b2) {
                                     uod73.D0(r70.c(R.string.entity_accessory_button_add_songs, ta, str1+a1));
                                  }
                                  if (i2) {
                                     uod73.D0(r70.a);
                                  }
                                  if (!p0.b() && !or45) {
                                     int i3 = Math.min(list.size(), 30);
                                     d73 uod731 = new d73();
                                     while (i < i3) {
                                        aw uoaw1 = list.get(i);
                                        if (uoaw1.d().c()) {
                                           zv ozv1 = uoaw1.d().b();
                                           if (ozv1.f != null) {
                                              uod731.D0(ty0.b().r("trackName", ozv1.d).r("artistName", ozv1.k).d());
                                           }
                                        }else if(uoaw1.c().c()){
                                           zs ozs1 = uoaw1.c().b();
                                           if (ozs1.i != null) {
                                              uod731.D0(ty0.b().r("trackName", ozs1.d).r("artistName", ozs1.f).d());
                                           }
                                        }
                                        i = i + 1;
                                     }
                                     uArrayList1 = xm0.g(ta, a1, uod731.I0());
                                  }else {
                                     ArrayList uArrayList = new ArrayList(list.size());
                                     Iterator iterator = list.iterator();
                                     while (iterator.hasNext()) {
                                        aw uoaw = iterator.next();
                                        aw b3 = uoaw.b;
                                        if (uoaw.d().c()) {
                                           zv ozv = uoaw.d().b();
                                           if (ozv.f != null) {
                                              uArrayList.add(xm0.j(p0, ozv, b3, b2));
                                           }else {
                                              continue ;
                                           }
                                        }else if(uoaw.c().c()){
                                           zs ozs = uoaw.c().b();
                                           if (ozs.i != null) {
                                              ozs = ozs.j;
                                              iu2 oiu2 = ty0.k().o(b3).k(c03.b).f("uri", ozs.b).s(ty0.z().d(ozs.d).a(ozs.f)).e("rightAccessoryClick", ty0.j().d("contextmenu").c(ox7.d(a1, ozs, b2)).b()).e("click", xm0.d(p0, ozs, b3));
                                              String str2 = (ozs != null)? "explicit": null;
                                              uArrayList.add(oiu2.b("label", str2).c(l03.a(xm0.e(p0, ozs))).c(h13.c(b3)).g());
                                              continue ;
                                           }else {
                                              continue ;
                                           }
                                        }else {
                                           uArrayList.add(jl6.a(b3, "skeleton:trackRow"));
                                           continue ;
                                        }
                                     }
                                     uArrayList1 = uArrayList;
                                  }
                                  uod73.G0(uArrayList1);
                                  break ;
                               }else if(p0.a()){
                                  ys5 b4 = (p0.b())? jl6.b: jl6.a;
                                  uod73.G0(b4);
                                  break ;
                               }else if(b2 && p0.c.c()){
                                  uod73.D0(ty0.k().k(x03.b).o("lite-playlist-entity-view-add").s(ty0.z().d(ta.getString(R.string.playlist_find_songs_header))).g());
                                  uod73.D0(r70.d(R.string.entity_accessory_button_find_songs, ta, str1+a1));
                                  break ;
                               }
                               break ;
                            }
                         }else {
                            i4 = i4 + 1;
                         }
                      }else {
                         i4 = -1;
                         goto label_008e ;
                      }
                   }
                   return p1.e(uod73.I0());
                }
                int i2 = 0;
                goto label_0093 ;
             }
          }
       }
       or45 = 0;
       goto label_005e ;
    }
}
