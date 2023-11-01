package p.f12;
import p.rn1;
import p.xy5;
import java.lang.String;
import p.uw6;
import java.lang.Object;
import p.a12;
import p.sw6;
import p.u02;
import p.q02;
import p.y02;
import p.c12;
import p.x02;

public final class f12 extends rn1	// class@001539 from classes.dex
{
    public final int d;

    public void f12(xy5 p0,int p1){
       this.d = p1;
       super(p0);
    }
    public final String d(){
       switch (this.d){
           case 0:
             return "INSERT OR REPLACE INTO `favorite_tracks` \(`uri`\) VALUES \(?\)";
           case 1:
             return "INSERT OR REPLACE INTO `favorite_playlists` \(`uri`\) VALUES \(?\)";
           case 2:
             return "INSERT OR REPLACE INTO `favorite_albums` \(`uri`\) VALUES \(?\)";
           case 3:
             return "INSERT OR REPLACE INTO `favorite_artists` \(`uri`\) VALUES \(?\)";
           case 4:
             return "INSERT OR REPLACE INTO `favorite_shows` \(`uri`\) VALUES \(?\)";
           default:
             return "INSERT OR REPLACE INTO `favorite_episodes` \(`uri`\) VALUES \(?\)";
       }
    }
    public final void g(uw6 p0,Object p1){
       switch (this.d){
           case 0:
             if ((p1 = p1.a) == null) {
                p0.z(1);
             }else {
                p0.s(1, p1);
             }
             break;
           case 1:
             if ((p1 = p1.a) == null) {
                p0.z(1);
             }else {
                p0.s(1, p1);
             }
             return;
             break;
           case 2:
             if ((p1 = p1.a) == null) {
                p0.z(1);
             }else {
                p0.s(1, p1);
             }
             return;
             break;
           case 3:
             if ((p1 = p1.a) == null) {
                p0.z(1);
             }else {
                p0.s(1, p1);
             }
             return;
             break;
           case 4:
             if ((p1 = p1.a) == null) {
                p0.z(1);
             }else {
                p0.s(1, p1);
             }
             return;
             break;
           default:
             if ((p1 = p1.a) == null) {
                p0.z(1);
             }else {
                p0.s(1, p1);
             }
             return;
       }
       return;
    }
}
