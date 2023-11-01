package com.spotify.localfiles.localfiles.LocalTracksResponseJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.reflect.Type;
import com.spotify.localfiles.localfiles.LocalTrack;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import p.pl1;
import java.util.Set;
import java.lang.Integer;
import com.squareup.moshi.b;
import com.spotify.localfiles.localfiles.LocalTracksResponse;
import p.hf3;
import p.ve7;
import java.lang.Class;
import java.lang.reflect.Constructor;
import com.squareup.moshi.i;
import p.tp2;
import java.lang.NullPointerException;
import p.et0;

public final class LocalTracksResponseJsonAdapter extends JsonAdapter	// class@000982 from classes.dex
{
    private Constructor constructorRef;
    private final JsonAdapter intAdapter;
    private final JsonAdapter listOfLocalTrackAdapter;
    private final b$b options;

    public void LocalTracksResponseJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"rows","unfilteredLength","lengthInSeconds"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"rows\", \"unfilteredLe…
          \"lengthInSeconds\"\)");
       this.options = uob;
       Type[] typeArray = new Type[]{LocalTrack.class};
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(ya7.j(List.class, typeArray), a, "items");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…     emptySet\(\), \"items\"\)");
       this.listOfLocalTrackAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(Integer.TYPE, a, "unfilteredLength");
       co5.l(jsonAdapter1, "moshi.adapter\(Int::class…      \"unfilteredLength\"\)");
       this.intAdapter = jsonAdapter1;
    }
    public LocalTracksResponse fromJson(b p0){
       int i3;
       hf3 ohf3;
       co5.o(p0, "reader");
       int i = 0;
       Integer integer = Integer.valueOf(i);
       p0.f();
       object oobject = null;
       int i1 = -1;
       List list = oobject;
       Integer integer1 = list;
       int i2 = -1;
       while (true) {
          if (p0.T()) {
             if ((i3 = p0.v0(this.options)) != i1) {
                if (i3) {
                   if (i3 != 1) {
                      if (i3 != 2) {
                         continue ;
                      }else if((integer = this.intAdapter.fromJson(p0)) != null){
                         i2 = i2 & 0xfb;
                      }else {
                         break ;
                      }
                   }else if((integer1 = this.intAdapter.fromJson(p0)) != null){
                      continue ;
                   }else {
                      ohf3 = ve7.w("unfilteredLength", "unfilteredLength", p0);
                      co5.l(ohf3, "unexpectedNull\(\"unfilter…nfilteredLength\", reader\)");
                      throw ohf3;
                   }
                }else if((list = this.listOfLocalTrackAdapter.fromJson(p0)) != null){
                   i2 = i2 & 0xfe;
                }else {
                   ohf3 = ve7.w("items", "rows", p0);
                   co5.l(ohf3, "unexpectedNull\(\"items\",\n…          \"rows\", reader\)");
                   throw ohf3;
                }
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             if (i2 == -6) {
                co5.j(list, "null cannot be cast to non-null type kotlin.collections.List<com.spotify.localfiles.localfiles.LocalTrack>");
                if (integer1 != null) {
                   return new LocalTracksResponse(list, integer1.intValue(), integer.intValue());
                }else {
                   ohf3 = ve7.o("unfilteredLength", "unfilteredLength", p0);
                   co5.l(ohf3, "missingProperty\(\"unfilte…nfilteredLength\", reader\)");
                   throw ohf3;
                }
             }else {
                LocalTracksResponseJsonAdapter tconstructor = this.constructorRef;
                int i4 = 5;
                if (tconstructor == null) {
                   Class[] uClassArray = new Class[i4];
                   uClassArray[i] = List.class;
                   Class tYPE = Integer.TYPE;
                   uClassArray[1] = tYPE;
                   uClassArray[2] = tYPE;
                   uClassArray[3] = tYPE;
                   uClassArray[4] = ve7.c;
                   tconstructor = LocalTracksResponse.class.getDeclaredConstructor(uClassArray);
                   this.constructorRef = tconstructor;
                   co5.l(tconstructor, "LocalTracksResponse::cla…his.constructorRef = it }");
                }
                Object[] objArray = new Object[i4];
                objArray[i] = list;
                if (integer1 != null) {
                   objArray[1] = Integer.valueOf(integer1.intValue());
                   objArray[2] = integer;
                   objArray[3] = Integer.valueOf(i2);
                   objArray[4] = oobject;
                   p0 = tconstructor.newInstance(objArray);
                   co5.l(p0, "localConstructor.newInst…torMarker */ null\n      \)");
                   return p0;
                }else {
                   ohf3 = ve7.o("unfilteredLength", "unfilteredLength", p0);
                   co5.l(ohf3, "missingProperty\(\"unfilte…h\",\n              reader\)");
                   throw ohf3;
                }
             }
          }
       }
       ohf3 = ve7.w("lengthInSeconds", "lengthInSeconds", p0);
       co5.l(ohf3, "unexpectedNull\(\"lengthIn…lengthInSeconds\", reader\)");
       throw ohf3;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,LocalTracksResponse p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("rows");
       this.listOfLocalTrackAdapter.toJson(p0, p1.a);
       p0.l0("unfilteredLength");
       tp2.q(p1.b, this.intAdapter, p0, "lengthInSeconds");
       this.intAdapter.toJson(p0, Integer.valueOf(p1.c));
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(41, "GeneratedJsonAdapter\(LocalTracksResponse\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
