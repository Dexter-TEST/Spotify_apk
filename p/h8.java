package p.h8;
import p.rn1;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.xy5;
import java.lang.String;
import p.uw6;
import java.lang.Object;
import p.ir;
import p.sw6;
import p.d8;

public final class h8 extends rn1	// class@001803 from classes.dex
{
    public final int d;

    public void h8(MetadataRoomDatabase p0,int p1){
       this.d = p1;
       super(p0);
    }
    public final String d(){
       switch (this.d){
           case 0:
           default:
             return "INSERT OR REPLACE INTO `album_artists` \(`album_uri`,`artist_uri`\) VALUES \(?,?\)";
       }
       return "INSERT OR REPLACE INTO `albums` \(`tag`,`uri`,`name`,`created`\) VALUES \(?,?,?,?\)";
    }
    public final void g(uw6 p0,Object p1){
       ir a;
       ir c;
       d8 a1;
       int i = 2;
       switch (this.d){
           case 0:
             if ((a = p1.a) == null) {
                p0.z(1);
             }else {
                p0.s(1, a);
             }
             if ((a = p1.b) == null) {
                p0.z(i);
             }else {
                p0.s(i, a);
             }
             int i1 = 3;
             if ((c = p1.c) == null) {
                p0.z(i1);
             }else {
                p0.s(i1, c);
             }
             break;
           default:
             if ((a1 = p1.a) == null) {
                p0.z(1);
             }else {
                p0.s(1, a1);
             }
             if ((p1 = p1.b) == null) {
                p0.z(i);
             }else {
                p0.s(i, p1);
             }
             return;
       }
       p0.P(4, p1.d);
       return;
    }
}
