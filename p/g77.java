package p.g77;
import p.rn1;
import p.xy5;
import java.lang.String;
import p.uw6;
import java.lang.Object;
import p.z67;
import p.sw6;
import p.zv;
import p.dw;

public final class g77 extends rn1	// class@0016b6 from classes.dex
{
    public final int d;

    public void g77(xy5 p0,int p1){
       this.d = p1;
       super(p0);
    }
    public final String d(){
       switch (this.d){
           case 0:
             return "INSERT OR REPLACE INTO `tracks` \(`tag`,`uri`,`album_uri`,`name`,`explicit`,`playable`,`created`,`preview_id`,`album_name`,`album_image`,`artist_names`,`artist_uri`\) VALUES \(?,?,?,?,?,?,?,?,?,?,?,?\)";
           case 1:
             return "INSERT OR REPLACE INTO `track_artists` \(`track_uri`,`artist_uri`\) VALUES \(?,?\)";
           default:
             return "INSERT OR REPLACE INTO `track_rows` \(`track_uri`,`uid`,`position`,`parent_uri`\) VALUES \(?,?,?,?\)";
       }
    }
    public final void g(uw6 p0,Object p1){
       zv a;
       zv h;
       z67 a1;
       dw a2;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       switch (this.d){
           case 0:
             if ((a = p1.a) == null) {
                p0.z(1);
             }else {
                p0.s(1, a);
             }
             if ((a = p1.b) == null) {
                p0.z(i2);
             }else {
                p0.s(i2, a);
             }
             if ((a = p1.c) == null) {
                p0.z(i1);
             }else {
                p0.s(i1, a);
             }
             if ((a = p1.d) == null) {
                p0.z(i);
             }else {
                p0.s(i, a);
             }
             p0.P(5, (long)p1.e);
             p0.P(6, (long)p1.f);
             p0.P(7, p1.g);
             int i3 = 8;
             if ((h = p1.h) == null) {
                p0.z(i3);
             }else {
                p0.s(i3, h);
             }
             i3 = 9;
             if ((h = p1.i) == null) {
                p0.z(i3);
             }else {
                p0.s(i3, h);
             }
             i3 = 10;
             if ((h = p1.j) == null) {
                p0.z(i3);
             }else {
                p0.s(i3, h);
             }
             i3 = 11;
             if ((h = p1.k) == null) {
                p0.z(i3);
             }else {
                p0.s(i3, h);
             }
             if ((p1 = p1.l) == null) {
                p0.z(12);
             }else {
                p0.s(12, p1);
             }
             break;
           case 1:
             if ((a1 = p1.a) == null) {
                p0.z(1);
             }else {
                p0.s(1, a1);
             }
             if ((p1 = p1.b) == null) {
                p0.z(i2);
             }else {
                p0.s(i2, p1);
             }
             return;
             break;
           default:
             if ((a2 = p1.a) == null) {
                p0.z(1);
             }else {
                p0.s(1, a2);
             }
             if ((a2 = p1.b) == null) {
                p0.z(i2);
             }else {
                p0.s(i2, a2);
             }
             p0.P(i1, (long)p1.c);
             if ((p1 = p1.d) == null) {
                p0.z(i);
             }else {
                p0.s(i, p1);
             }
             return;
       }
       return;
    }
}
