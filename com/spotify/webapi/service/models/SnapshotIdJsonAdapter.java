package com.spotify.webapi.service.models.SnapshotIdJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.SnapshotId;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class SnapshotIdJsonAdapter extends JsonAdapter	// class@000cbe from classes.dex
{
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void SnapshotIdJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"snapshot_id"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"snapshot_id\"\)");
       this.options = uob;
       JsonAdapter jsonAdapter = p0.f(String.class, pl1.a, "snapshot_id");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…mptySet\(\), \"snapshot_id\"\)");
       this.nullableStringAdapter = jsonAdapter;
    }
    public SnapshotId fromJson(b p0){
       int i1;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       int i = 0;
       while (p0.T()) {
          if ((i1 = p0.v0(this.options)) != -1) {
             if (i1) {
                continue ;
             }
          }else {
             p0.z0();
             p0.A0();
          }
          str = this.nullableStringAdapter.fromJson(p0);
          i = 1;
       }
       p0.y();
       SnapshotId snapshotId = new SnapshotId();
       if (i) {
          snapshotId.snapshot_id = str;
       }
       return snapshotId;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,SnapshotId p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("snapshot_id");
       this.nullableStringAdapter.toJson(p0, p1.snapshot_id);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(32, "GeneratedJsonAdapter\(SnapshotId\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
