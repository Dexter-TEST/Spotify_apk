package p.g8;
import p.ez;
import android.content.Context;
import p.vt;
import java.lang.Object;
import p.r45;
import p.au2;
import p.xv;
import p.zv;
import p.ox7;
import p.gr;
import java.lang.String;
import p.aq6;
import p.zt2;
import p.ty0;
import java.util.List;
import p.jr;
import p.kr;
import p.a23;
import p.a43;
import com.google.common.collect.c;
import p.ys5;
import p.sp6;
import p.ju2;
import p.jl6;
import p.r70;
import p.xm0;
import java.util.ArrayList;
import p.ir;
import java.lang.Boolean;
import p.st2;
import p.n13;
import p.tt2;
import p.vv7;
import java.lang.StringBuilder;
import p.iu2;
import p.su2;
import p.k23;

public final class g8 extends ez	// class@0016c0 from classes.dex
{
    public final int a;
    public final Context b;

    public void g8(Context p0,int p1){
       this.a = p1;
       this.b = p0;
    }
    public final au2 a(vt p0,Object p1,r45 p2){
       String str1;
       String str = "share_uri";
       switch (this.a){
           case 0:
             p1 = p1.b;
             str1 = p0.a.toString();
             zt2 ozt2 = ty0.b().r("context_uri", str1).r(str, str1);
             if (p1.size() == 1) {
                ozt2 = ozt2.r("artist_uri", p1.get(0).a.b);
             }
             return ozt2.d();
             break;
           case 2:
           default:
             str1 = p0.a.toString();
             return ty0.b().r("context_uri", str1).r(str, str1).d();
       }
       return ox7.L(p0, p1.a, 0);
    }
    public final a43 b(vt p0,Object p1,r45 p2,a43 p3){
       List list;
       ir c;
       ArrayList uArrayList;
       ys5 b;
       sp6 z;
       ju2 oju2;
       List list1;
       ju2 oju21;
       object oobject = null;
       g8 tb = this.b;
       int i = 1;
       switch (this.a){
           case 0:
             list = p2.e(ys5.v);
             c = p1.a.c;
             String str = xm0.a(p1.b);
             sp6 x = sp6.x;
             ju2[] oju2Array = new ju2[i];
             if (p0.a()) {
                oobject = jl6.b(tb);
             }else if(list.isEmpty()){
                oobject = r70.b(tb, p0);
             }
             oju2Array[0] = oobject;
             p1 = p3.i(xm0.b(c, str, x, p1.c, oju2Array));
             if (!list.isEmpty()) {
                ju2[] oju2Array1 = new ju2[i];
                oju2Array1[0] = r70.a;
                p1 = p1.b(oju2Array1);
                uArrayList = (p0.b())? xm0.k(p0, list): xm0.f(tb, p0.a, list);
                p1 = p1.a(uArrayList);
             }else if(p0.a()){
                b = (p0.b())? jl6.b: jl6.a;
                p1 = p1.e(b);
             }
             break;
           case 1:
             jr a = p1.a;
             list = p2.e(ys5.v);
             int i1 = 10;
             if (list.size() > i1) {
                list = list.subList(0, i1);
             }
             kr c1 = a.c;
             z = sp6.z;
             ju2[] oju2Array2 = new ju2[i];
             if (p0.a()) {
                oju2 = jl6.b(tb);
             }else if(list.isEmpty()){
                oju2 = oobject;
             }else {
                oju2 = r70.b(tb, p0);
             }
             oju2Array2[0] = oju2;
             p1 = p3.i(xm0.b(c1, oobject, z, p1.b, oju2Array2));
             if (!list.isEmpty()) {
                uArrayList = (p0.b())? xm0.k(p0, list): xm0.f(tb, p0.a, list);
                p1 = p1.e(uArrayList);
             }else if(p0.a()){
                b = (p0.b())? jl6.b: jl6.a;
                p1 = p1.e(b);
             }
             return p1;
             break;
           default:
             xv a1 = p1.a;
             gr ogr = r45.a(p1.b).f();
             if (p0.b()) {
                int i2 = 0x7f12012a;
                oju21 = (p0.f.e(Boolean.FALSE).booleanValue() && a1.e != null)? r70.a(tb.getString(i2), ty0.j().d("disallowedExplicitContentClick").b()): r70.a(tb.getString(i2), vv7.R(p0));
             }else {
                oju21 = r70.d(R.string.entity_accessory_button_add_to_playlist, tb, "spotify:internal:add-to-playlist:"+p0.a);
             }
             zv d = a1.d;
             p1 = xm0.a(p1.c);
             z = sp6.o0;
             ys5 v = (ogr == null)? ys5.v: ogr.c;
             ju2[] oju2Array3 = new ju2[i];
             oju2Array3[0] = oju21;
             p1 = p3.i(xm0.b(d, p1, z, v, oju2Array3));
             if (p0.b()) {
                b = ys5.v;
             }else {
                ju2[] oju2Array4 = new ju2[i];
                ju2[] oju2Array5 = new ju2[i];
                oju2Array5[0] = ty0.k().n("positive_button").s(ty0.z().d(tb.getString(R.string.shuffle_education_dialog_positive_button))).g();
                oju2Array4[0] = ty0.k().s(ty0.z().d(tb.getString(R.string.shuffle_education_dialog_title)).b(tb.getString(R.string.shuffle_education_dialog_description))).i(oju2Array5).g();
                b = c.r(ty0.k().o("shuffle-education").j("lite:educationDialog", "row").s(ty0.z().d(tb.getString(R.string.shuffle_education_row_title))).i(oju2Array4).g());
             }
             return p1.e(b);
       }
       return p1;
    }
}
