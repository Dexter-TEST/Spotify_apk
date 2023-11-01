package p.tp2;
import java.lang.String;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.NullPointerException;
import p.en6;
import java.lang.Boolean;
import io.reactivex.rxjava3.core.Observable;
import p.pp;
import p.bi5;
import java.lang.Class;
import java.lang.StringBuilder;
import java.util.Iterator;
import p.uz3;
import p.nc;
import java.util.List;
import java.util.Arrays;
import java.util.ServiceConfigurationError;
import java.lang.Throwable;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import java.lang.Integer;
import android.os.Parcelable;
import java.lang.ClassCastException;
import java.lang.Enum;
import p.we3;
import com.mp4parser.iso14496.part15.HevcConfigurationBox;
import p.oy6;
import p.zz1;
import p.rv5;

public abstract class tp2	// class@0027b5 from classes.dex
{

    public static String A(int p0){
       if (p0 == 1) {
          return "BEGIN_ARRAY";
       }
       if (p0 == 2) {
          return "END_ARRAY";
       }
       if (p0 == 3) {
          return "BEGIN_OBJECT";
       }
       if (p0 == 4) {
          return "END_OBJECT";
       }
       if (p0 == 5) {
          return "NAME";
       }
       if (p0 == 6) {
          return "STRING";
       }
       if (p0 == 7) {
          return "NUMBER";
       }
       if (p0 == 8) {
          return "BOOLEAN";
       }
       if (p0 == 9) {
          return "NULL";
       }
       if (p0 == 10) {
          return "END_DOCUMENT";
       }
       return "null";
    }
    public static String B(int p0){
       if (p0 == 1) {
          return "BEGIN_ARRAY";
       }
       if (p0 == 2) {
          return "END_ARRAY";
       }
       if (p0 == 3) {
          return "BEGIN_OBJECT";
       }
       if (p0 == 4) {
          return "END_OBJECT";
       }
       if (p0 == 5) {
          return "NAME";
       }
       if (p0 == 6) {
          return "STRING";
       }
       if (p0 == 7) {
          return "NUMBER";
       }
       if (p0 == 8) {
          return "BOOLEAN";
       }
       if (p0 == 9) {
          return "NULL";
       }
       if (p0 == 10) {
          return "END_DOCUMENT";
       }
       return "null";
    }
    public static String C(int p0){
       if (p0 == 1) {
          return "PRE_COMP";
       }
       if (p0 == 2) {
          return "SOLID";
       }
       if (p0 == 3) {
          return "IMAGE";
       }
       if (p0 == 4) {
          return "NULL";
       }
       if (p0 == 5) {
          return "SHAPE";
       }
       if (p0 == 6) {
          return "TEXT";
       }
       if (p0 == 7) {
          return "UNKNOWN";
       }
       return "null";
    }
    public static String D(int p0){
       if (p0 == 1) {
          return "NOT_SYNCED";
       }
       if (p0 == 2) {
          return "LINE_SYNCED";
       }
       if (p0 == 3) {
          return "SYLLABLE_SYNCED";
       }
       return "null";
    }
    public static String E(int p0){
       if (p0 == 1) {
          return "MERGE";
       }
       if (p0 == 2) {
          return "ADD";
       }
       if (p0 == 3) {
          return "SUBTRACT";
       }
       if (p0 == 4) {
          return "INTERSECT";
       }
       if (p0 == 5) {
          return "EXCLUDE_INTERSECTIONS";
       }
       return "null";
    }
    public static int F(String p0){
       if (p0 == null) {
          throw new NullPointerException("Name is null");
       }
       if (p0.equals("NOT_SYNCED")) {
          return 1;
       }
       if (p0.equals("LINE_SYNCED")) {
          return 2;
       }
       if (p0.equals("SYLLABLE_SYNCED")) {
          return 3;
       }
       throw new IllegalArgumentException("No enum constant com.spotify.lyrics.data.model.Lyrics.SyncStatus.".concat(p0));
    }
    public static int[] _values(){
       return en6.H(9);
    }
    public static int a(int p0){
       if (p0 == 1) {
          return 3;
       }
       if (p0 == 2) {
          return 1;
       }
       if (p0 == 3) {
          return 2;
       }
       throw 0;
    }
    public static int b(int p0){
       if (p0 == 1) {
          return 96;
       }
       if (p0 == 2) {
          return 384;
       }
       if (p0 == 3) {
          return -1;
       }
       throw 0;
    }
    public static String c(int p0){
       if (p0 == 1) {
          return "fullscreen";
       }
       if (p0 == 2) {
          return "card";
       }
       throw null;
    }
    public static int d(int p0){
       if (p0 == 1) {
          return 144;
       }
       if (p0 == 2) {
          return 200;
       }
       if (p0 == 3) {
          return 256;
       }
       throw 0;
    }
    public static float e(int p0){
       if (p0 == 1) {
          return 0.30f;
       }
       if (p0 == 2) {
          return 0.40f;
       }
       if (p0 == 3) {
          return 0x3f000000;
       }
       throw 0;
    }
    public static int f(int p0){
       if (p0 == 1) {
          return 96;
       }
       if (p0 == 2) {
          return 512;
       }
       if (p0 == 3) {
          return -1;
       }
       throw 0;
    }
    public static int g(String p0,int p1,int p2){
       return ((p0.hashCode() + p1) * p2);
    }
    public static int h(boolean p0,int p1){
       return (Boolean.valueOf(p0).hashCode() + p1);
    }
    public static Observable i(int p0,Observable p1){
       return p1.filter(new pp(p0));
    }
    public static String j(Class p0,StringBuilder p1,String p2){
       return p1+p0.getName()+p2;
    }
    public static String k(String p0,int p1){
       return p0+p1;
    }
    public static String l(String p0,int p1,String p2){
       return p0+p1+p2;
    }
    public static String m(String p0,String p1,String p2){
       return p0+p1+p2;
    }
    public static String n(StringBuilder p0,int p1,char p2){
       return p0+p1+p2;
    }
    public static String o(StringBuilder p0,long p1,char p2){
       return p0+p1+p2;
    }
    public static Iterator p(){
       uz3[] ouz3Array = new uz3[]{new nc()};
       return Arrays.asList(ouz3Array).iterator();
    }
    public static void q(int p0,JsonAdapter p1,i p2,String p3){
       p1.toJson(p2, Integer.valueOf(p0));
       p2.l0(p3);
    }
    public static void r(Parcelable p0){
       if (p0 == null) {
          return;
       }
       throw new ClassCastException();
    }
    public static void s(Enum p0){
       if (p0 == null) {
          return;
       }
       throw new ClassCastException();
    }
    public static void t(Object p0){
       throw new ClassCastException();
    }
    public static void u(we3 p0,HevcConfigurationBox p1,HevcConfigurationBox p2){
       rv5.a();
       rv5.b(zz1.b(p0, p1, p2));
    }
    public static void v(Object p0){
       if (p0 == null) {
          return;
       }
       throw new ClassCastException();
    }
    public static String w(int p0){
       if (p0 == 1) {
          return "GET";
       }
       if (p0 == 2) {
          return "POST";
       }
       if (p0 == 3) {
          return "PUT";
       }
       if (p0 == 4) {
          return "DELETE";
       }
       throw null;
    }
    public static String x(int p0){
       if (p0 == 1) {
          return "NOT_SYNCED";
       }
       if (p0 == 2) {
          return "LINE_SYNCED";
       }
       if (p0 == 3) {
          return "SYLLABLE_SYNCED";
       }
       throw null;
    }
    public static String y(int p0){
       if (p0 == 1) {
          return "EVERYTHING_IN_SYNC";
       }
       if (p0 == 2) {
          return "SOMETHING_SYNCED";
       }
       if (p0 == 3) {
          return "AN_ERROR_WHILE_SYNCING";
       }
       throw null;
    }
    public static String z(int p0){
       if (p0 == 1) {
          return "X_SMALL";
       }
       if (p0 == 2) {
          return "SMALL";
       }
       if (p0 == 3) {
          return "MEDIUM";
       }
       if (p0 == 4) {
          return "LARGE";
       }
       return "null";
    }
}
