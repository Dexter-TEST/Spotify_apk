package com.spotify.notifications.models.message.QuickActionsJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import com.spotify.notifications.models.message.QuickAction;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import com.squareup.moshi.b;
import com.spotify.notifications.models.message.QuickActions;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class QuickActionsJsonAdapter extends JsonAdapter	// class@000aa2 from classes.dex
{
    private final JsonAdapter listOfQuickActionAdapter;
    private final b$b options;
    private final JsonAdapter stringAdapter;

    public void QuickActionsJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"category","actions"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"category\", \"actions\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "category");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…ySet\(\),\n      \"category\"\)");
       this.stringAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{QuickAction.class};
       JsonAdapter jsonAdapter1 = p0.f(ya7.j(List.class, typeArray), a, "actions");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP…   emptySet\(\), \"actions\"\)");
       this.listOfQuickActionAdapter = jsonAdapter1;
    }
    public QuickActions fromJson(b p0){
       int i;
       hf3 ohf3;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       List list = str;
       do {
          String str1 = "category";
          if (p0.T()) {
             if ((i = p0.v0(this.options)) != -1) {
                if (i) {
                }else if((str = this.stringAdapter.fromJson(p0)) != null){
                   continue ;
                }else {
                   ohf3 = ve7.w(str1, str1, p0);
                   co5.l(ohf3, "unexpectedNull\(\"category…      \"category\", reader\)");
                   throw ohf3;
                }
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             if (str != null) {
                if (list != null) {
                   return new QuickActions(str, list);
                }
                ohf3 = ve7.o("actions", "actions", p0);
                co5.l(ohf3, "missingProperty\(\"actions\", \"actions\", reader\)");
                throw ohf3;
             }else {
                ohf3 = ve7.o(str1, str1, p0);
                co5.l(ohf3, "missingProperty\(\"category\", \"category\", reader\)");
                throw ohf3;
             }
          }
       } while (i != 1 || (list = this.listOfQuickActionAdapter.fromJson(p0)) != null);
       ohf3 = ve7.w("actions", "actions", p0);
       co5.l(ohf3, "unexpectedNull\(\"actions\", \"actions\", reader\)");
       throw ohf3;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,QuickActions p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("category");
       this.stringAdapter.toJson(p0, p1.a);
       p0.l0("actions");
       this.listOfQuickActionAdapter.toJson(p0, p1.b);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(34, "GeneratedJsonAdapter\(QuickActions\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
