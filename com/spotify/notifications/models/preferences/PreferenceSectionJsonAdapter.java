package com.spotify.notifications.models.preferences.PreferenceSectionJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import com.spotify.notifications.models.preferences.Preference;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import com.squareup.moshi.b;
import com.spotify.notifications.models.preferences.PreferenceSection;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class PreferenceSectionJsonAdapter extends JsonAdapter	// class@000aab from classes.dex
{
    private final JsonAdapter listOfPreferenceAdapter;
    private final b$b options;
    private final JsonAdapter stringAdapter;

    public void PreferenceSectionJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"name","prefs"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"name\", \"prefs\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "name");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…emptySet\(\),\n      \"name\"\)");
       this.stringAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{Preference.class};
       JsonAdapter jsonAdapter1 = p0.f(ya7.j(List.class, typeArray), a, "preferences");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP…mptySet\(\), \"preferences\"\)");
       this.listOfPreferenceAdapter = jsonAdapter1;
    }
    public PreferenceSection fromJson(b p0){
       int i;
       hf3 ohf3;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       List list = str;
       do {
          String str1 = "name";
          if (p0.T()) {
             if ((i = p0.v0(this.options)) != -1) {
                if (i) {
                }else if((str = this.stringAdapter.fromJson(p0)) != null){
                   continue ;
                }else {
                   ohf3 = ve7.w(str1, str1, p0);
                   co5.l(ohf3, "unexpectedNull\(\"name\", \"name\",\n            reader\)");
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
                   return new PreferenceSection(str, list);
                }
                ohf3 = ve7.o("preferences", "prefs", p0);
                co5.l(ohf3, "missingProperty\(\"preferences\", \"prefs\", reader\)");
                throw ohf3;
             }else {
                ohf3 = ve7.o(str1, str1, p0);
                co5.l(ohf3, "missingProperty\(\"name\", \"name\", reader\)");
                throw ohf3;
             }
          }
       } while (i != 1 || (list = this.listOfPreferenceAdapter.fromJson(p0)) != null);
       ohf3 = ve7.w("preferences", "prefs", p0);
       co5.l(ohf3, "unexpectedNull\(\"preferences\", \"prefs\", reader\)");
       throw ohf3;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,PreferenceSection p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("name");
       this.stringAdapter.toJson(p0, p1.a);
       p0.l0("prefs");
       this.listOfPreferenceAdapter.toJson(p0, p1.b);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(39, "GeneratedJsonAdapter\(PreferenceSection\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
