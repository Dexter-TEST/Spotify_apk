package p.io1;
import p.rn1;
import p.xy5;
import java.lang.String;
import p.uw6;
import java.lang.Object;
import p.zs;
import p.sw6;
import p.at;

public final class io1 extends rn1	// class@0019d0 from classes.dex
{
    public final int d;

    public void io1(xy5 p0,int p1){
       this.d = p1;
       super(p0);
    }
    public final String d(){
       switch (this.d){
           case 0:
           default:
             return "INSERT OR REPLACE INTO `episode_progress` \(`episode_uri`,`position`,`fully_played`\) VALUES \(?,?,?\)";
       }
       return "INSERT OR REPLACE INTO `episodes` \(`tag`,`uri`,`podcast_uri`,`name`,`description`,`podcast_name`,`release_date`,`duration`,`playable`,`explicit`,`created`,`preview_id`,`image`\) VALUES \(?,?,?,?,?,?,?,?,?,?,?,?,?\)";
    }
    public final void g(uw6 p0,Object p1){
       zs a;
       zs d;
       at a1;
       int i = 3;
       int i1 = 2;
       int i2 = 1;
       switch (this.d){
           case 0:
             if ((a = p1.a) == null) {
                p0.z(i2);
             }else {
                p0.s(i2, a);
             }
             if ((a = p1.b) == null) {
                p0.z(i1);
             }else {
                p0.s(i1, a);
             }
             if ((a = p1.c) == null) {
                p0.z(i);
             }else {
                p0.s(i, a);
             }
             int i3 = 4;
             if ((d = p1.d) == null) {
                p0.z(i3);
             }else {
                p0.s(i3, d);
             }
             i3 = 5;
             if ((d = p1.e) == null) {
                p0.z(i3);
             }else {
                p0.s(i3, d);
             }
             i3 = 6;
             if ((d = p1.f) == null) {
                p0.z(i3);
             }else {
                p0.s(i3, d);
             }
             i3 = 7;
             if ((d = p1.g) == null) {
                p0.z(i3);
             }else {
                p0.s(i3, d);
             }
             p0.P(8, (long)p1.h);
             p0.P(9, (long)p1.i);
             p0.P(10, (long)p1.j);
             p0.P(11, p1.k);
             i3 = 12;
             if ((d = p1.l) == null) {
                p0.z(i3);
             }else {
                p0.s(i3, d);
             }
             if ((p1 = p1.m) == null) {
                p0.z(13);
             }else {
                p0.s(13, p1);
             }
             break;
           default:
             if ((a1 = p1.a) == null) {
                p0.z(i2);
             }else {
                p0.s(i2, a1);
             }
             p0.P(i1, (long)p1.b);
             p0.P(i, (long)p1.c);
             return;
       }
       return;
    }
}
