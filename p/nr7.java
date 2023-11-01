package p.nr7;
import p.uy;
import java.lang.Object;
import p.xy5;
import java.lang.String;

public final class nr7 extends uy	// class@002037 from classes.dex
{
    public final int d;
    public final Object e;

    public void nr7(Object p0,xy5 p1,int p2){
       this.d = p2;
       this.e = p0;
       super(p1);
    }
    public final String d(){
       switch (this.d){
           case 0:
             return "DELETE FROM worktag WHERE work_spec_id=?";
           case 1:
             return "\n            UPDATE RateLimitedEvents\n            SET count = ?,\n            timestamp = ?\n            WHERE eventName = ?\n        ";
           case 2:
             return "DELETE FROM album_artists WHERE album_uri = ?";
           case 3:
             return "DELETE FROM images WHERE parent_uri = ?";
           case 4:
             return "DELETE FROM recent_search WHERE uri = ?";
           default:
             return "DELETE FROM user WHERE id = ?";
       }
    }
}
