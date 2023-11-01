package p.kg4;
import java.lang.String;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.NullPointerException;
import p.en6;
import p.lq5;
import p.jq5;
import p.xy5;
import p.uy;
import p.uw6;
import p.rn1;
import p.nq5;
import p.mq5;
import android.view.View;
import p.n06;
import android.view.View$OnClickListener;
import p.n65;
import java.util.List;
import java.lang.StringBuilder;
import p.tz6;
import java.util.Arrays;
import p.co5;
import java.util.HashMap;
import p.pz6;
import java.util.HashSet;
import java.lang.Class;
import java.lang.RuntimeException;
import java.lang.Throwable;
import io.reactivex.rxjava3.core.Observer;
import p.jl1;
import io.reactivex.rxjava3.disposables.Disposable;
import p.vw0;
import java.lang.ClassCastException;
import p.nf2;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import java.lang.Boolean;

public abstract class kg4	// class@001c0a from classes.dex
{

    public static String A(int p0){
       if (p0 == 1) {
          return "INITIALIZED";
       }
       if (p0 == 2) {
          return "STARTED";
       }
       if (p0 == 3) {
          return "DATA_LOADED";
       }
       if (p0 == 4) {
          return "LAYOUT_STARTED";
       }
       if (p0 == 5) {
          return "LAYOUT_COMPLETED";
       }
       if (p0 == 6) {
          return "CANCELLED";
       }
       if (p0 == 7) {
          return "FAILED";
       }
       throw null;
    }
    public static String B(int p0){
       if (p0 == 1) {
          return "NOT_REQUIRED";
       }
       if (p0 == 2) {
          return "CONNECTED";
       }
       if (p0 == 3) {
          return "UNMETERED";
       }
       if (p0 == 4) {
          return "NOT_ROAMING";
       }
       if (p0 == 5) {
          return "METERED";
       }
       if (p0 == 6) {
          return "TEMPORARILY_UNMETERED";
       }
       return "null";
    }
    public static String C(int p0){
       if (p0 == 1) {
          return "DEFAULT";
       }
       if (p0 == 2) {
          return "ARTIST";
       }
       if (p0 == 3) {
          return "SHOW";
       }
       return "null";
    }
    public static String D(int p0){
       if (p0 == 1) {
          return "ARTIST";
       }
       if (p0 == 2) {
          return "SHOW";
       }
       return "null";
    }
    public static String E(int p0){
       if (p0 == 1) {
          return "FailedToWriteData";
       }
       if (p0 == 2) {
          return "FailedToReadData";
       }
       if (p0 == 3) {
          return "FailedToDeleteData";
       }
       if (p0 == 4) {
          return "Other";
       }
       return "null";
    }
    public static String F(int p0){
       if (p0 == 1) {
          return "Read";
       }
       if (p0 == 2) {
          return "Write";
       }
       if (p0 == 3) {
          return "Delete";
       }
       return "null";
    }
    public static String G(int p0){
       if (p0 == 1) {
          return "DUPLICATED_POINTS";
       }
       if (p0 == 2) {
          return "BUILD_TWICE";
       }
       if (p0 == 3) {
          return "POINTS_NOT_COMPLETED";
       }
       if (p0 == 4) {
          return "INVALID_POINT_IDENTIFIERS";
       }
       if (p0 == 5) {
          return "INVALID_DIMENSIONS";
       }
       return "null";
    }
    public static String H(int p0){
       if (p0 == 1) {
          return "Player";
       }
       if (p0 == 2) {
          return "ScrubEvent";
       }
       if (p0 == 3) {
          return "Unknown";
       }
       return "null";
    }
    public static int I(String p0){
       if (p0 == null) {
          throw new NullPointerException("Name is null");
       }
       if (p0.equals("ARTIST")) {
          return 1;
       }
       if (p0.equals("SHOW")) {
          return 2;
       }
       throw new IllegalArgumentException("No enum constant com.spotify.allboarding.allboardingdomain.model.SkeletonViewType.".concat(p0));
    }
    public static int J(String p0){
       if (p0 == null) {
          throw new NullPointerException("Name is null");
       }
       if (p0.equals("INITIALIZED")) {
          return 1;
       }
       if (p0.equals("STARTED")) {
          return 2;
       }
       if (p0.equals("DATA_LOADED")) {
          return 3;
       }
       if (p0.equals("LAYOUT_STARTED")) {
          return 4;
       }
       if (p0.equals("LAYOUT_COMPLETED")) {
          return 5;
       }
       if (p0.equals("CANCELLED")) {
          return 6;
       }
       if (p0.equals("FAILED")) {
          return 7;
       }
       throw new IllegalArgumentException("No enum constant com.spotify.performance.viewloadtracking.ViewLoadingTracker.State.".concat(p0));
    }
    public static int[] _values(){
       return en6.H(21);
    }
    public static void a(lq5 p0,jq5 p1){
       p0.b.b();
       uw6 ouw6 = p0.v.c();
       p0.b.c();
       ouw6.u();
       p0.b.r();
       p0.b.m();
       p0.v.f(ouw6);
       p0.b.b();
       p0.b.c();
       p0.c.h(p1);
       p0.b.r();
       p0.b.m();
    }
    public static void b(nq5 p0,mq5 p1){
       p0.d(p1.c);
       p0.a.b();
       p0.a.c();
       p0.b.h(p1);
       p0.a.r();
       p0.a.m();
    }
    public static void c(int p0,View p1,n06 p2,Object p3){
       if (p2 == null) {
          p1.setOnClickListener(null);
       }else {
          p1.setOnClickListener(new n65(p2, p0, p3));
       }
       return;
    }
    public static String d(int p0){
       if (p0 == 1) {
          return "Animals & Pet Supplies";
       }
       if (p0 == 2) {
          return "Apparel & Accessories";
       }
       if (p0 == 3) {
          return "Arts & Entertainment";
       }
       if (p0 == 4) {
          return "Baby & Toddler";
       }
       if (p0 == 5) {
          return "Business & Industrial";
       }
       if (p0 == 6) {
          return "Cameras & Optics";
       }
       if (p0 == 7) {
          return "Electronics";
       }
       if (p0 == 8) {
          return "Food, Beverages & Tobacco";
       }
       if (p0 == 9) {
          return "Furniture";
       }
       if (p0 == 10) {
          return "Hardware";
       }
       if (p0 == 11) {
          return "Health & Beauty";
       }
       if (p0 == 12) {
          return "Home & Garden";
       }
       if (p0 == 13) {
          return "Luggage & Bags";
       }
       if (p0 == 14) {
          return "Mature";
       }
       if (p0 == 15) {
          return "Media";
       }
       if (p0 == 16) {
          return "Office Supplies";
       }
       if (p0 == 17) {
          return "Religious & Ceremonial";
       }
       if (p0 == 18) {
          return "Software";
       }
       if (p0 == 19) {
          return "Sporting Goods";
       }
       if (p0 == 20) {
          return "Toys & Games";
       }
       if (p0 == 21) {
          return "Vehicles & Parts";
       }
       throw null;
    }
    public static String e(int p0){
       if (p0 == 1) {
          return "failedToWriteData";
       }
       if (p0 == 2) {
          return "failedToReadData";
       }
       if (p0 == 3) {
          return "failedToDeleteData";
       }
       if (p0 == 4) {
          return "unknownError";
       }
       throw null;
    }
    public static String f(int p0){
       if (p0 == 1) {
          return "read";
       }
       if (p0 == 2) {
          return "write";
       }
       if (p0 == 3) {
          return "delete";
       }
       throw null;
    }
    public static String g(int p0){
       if (p0 == 1) {
          return "started";
       }
       if (p0 == 2) {
          return "restored";
       }
       if (p0 == 3) {
          return "data_loaded";
       }
       if (p0 == 4) {
          return "cancelled";
       }
       if (p0 == 5) {
          return "finished";
       }
       if (p0 == 6) {
          return "failed";
       }
       if (p0 == 7) {
          return "image_loading_started";
       }
       if (p0 == 8) {
          return "image_loading_finished";
       }
       throw null;
    }
    public static int h(int p0){
       int i = 1;
       if (p0 == i) {
          return i;
       }
       if (p0 == 2) {
          return 2;
       }
       throw 0;
    }
    public static int i(int p0){
       int i = 1;
       if (p0 == i) {
          return i;
       }
       i = 2;
       if (p0 == i) {
          return i;
       }
       i = 3;
       if (p0 == i) {
          return i;
       }
       i = 4;
       if (p0 == i) {
          return i;
       }
       if (p0 == 5) {
          return 6;
       }
       throw 0;
    }
    public static int j(List p0,int p1,int p2){
       return ((p0.hashCode() + p1) * p2);
    }
    public static String k(String p0,long p1){
       return p0+p1;
    }
    public static String l(String p0,String p1){
       return p0+p1;
    }
    public static String m(String p0,String p1,char p2,String p3,char p4){
       return p0+p1+p2+p3+p4;
    }
    public static String n(String p0,tz6 p1,String p2,tz6 p3){
       return p0+p1+p2+p3;
    }
    public static String o(StringBuilder p0,List p1,char p2){
       return p0+p1+p2;
    }
    public static String p(StringBuilder p0,boolean p1,char p2){
       return p0+p1+p2;
    }
    public static String q(Object[] p0,int p1,String p2,String p3){
       String str = String.format(p2, Arrays.copyOf(p0, p1));
       co5.l(str, p3);
       return str;
    }
    public static StringBuilder r(String p0,int p1,String p2){
       return p0+p1+p2;
    }
    public static HashSet s(HashMap p0,String p1,pz6 p2,int p3){
       p0.put(p1, p2);
       return new HashSet(p3);
    }
    public static void t(int p0,String p1){
       if (p0) {
          return;
       }
       NullPointerException nullPointerE = new NullPointerException(co5.v(p1));
       co5.G(co5.class.getName(), nullPointerE);
       throw nullPointerE;
    }
    public static void u(Throwable p0,Observer p1,jl1 p2,Throwable p3){
       co5.M(p0);
       p1.onSubscribe(p2);
       p1.onError(p3);
    }
    public static void v(vw0 p0){
       if (p0 == null) {
          return;
       }
       throw new ClassCastException();
    }
    public static void w(nf2 p0,String p1,String p2,String p3,String p4){
       p0.r(p1);
       p0.r(p2);
       p0.r(p3);
       p0.r(p4);
    }
    public static void x(boolean p0,JsonAdapter p1,i p2,String p3){
       p1.toJson(p2, Boolean.valueOf(p0));
       p2.l0(p3);
    }
    public static String y(int p0){
       if (p0 == 1) {
          return "NOT_REQUIRED";
       }
       if (p0 == 2) {
          return "CONNECTED";
       }
       if (p0 == 3) {
          return "UNMETERED";
       }
       if (p0 == 4) {
          return "NOT_ROAMING";
       }
       if (p0 == 5) {
          return "METERED";
       }
       if (p0 == 6) {
          return "TEMPORARILY_UNMETERED";
       }
       throw null;
    }
    public static String z(int p0){
       if (p0 == 1) {
          return "ARTIST";
       }
       if (p0 == 2) {
          return "SHOW";
       }
       throw null;
    }
}
