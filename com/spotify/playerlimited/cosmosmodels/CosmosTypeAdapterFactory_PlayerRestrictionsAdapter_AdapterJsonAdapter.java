package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory_PlayerRestrictionsAdapter_AdapterJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.reflect.Type;
import java.util.Set;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import p.pl1;
import com.squareup.moshi.b;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerRestrictionsAdapter$Adapter;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class CosmosTypeAdapterFactory_PlayerRestrictionsAdapter_AdapterJsonAdapter extends JsonAdapter	// class@000b5e from classes.dex
{
    private final JsonAdapter nullableSetOfStringAdapter;
    private final b$b options;

    public void CosmosTypeAdapterFactory_PlayerRestrictionsAdapter_AdapterJsonAdapter(Moshi p0){
       int i = this;
       JsonAdapter obj = p0;
       co5.o(obj, "moshi");
       super();
       String[] stringArray = new String[]{"disallow_add_to_queue_reasons","disallow_inserting_into_context_tracks_reasons","disallow_inserting_into_next_tracks_reasons","disallow_pausing_reasons","disallow_peeking_next_reasons","disallow_peeking_prev_reasons","disallow_remote_control_reasons","disallow_removing_from_context_tracks_reasons","disallow_removing_from_next_tracks_reasons","disallow_reordering_in_context_tracks_reasons","disallow_reordering_in_next_tracks_reasons","disallow_resuming_reasons","disallow_seeking_reasons","disallow_set_queue_reasons","disallow_skipping_next_reasons","disallow_skipping_prev_reasons","disallow_toggling_repeat_context_reasons","disallow_toggling_repeat_track_reasons","disallow_toggling_shuffle_reasons","disallow_transferring_playback_reasons","disallow_updating_context_reasons"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"disallow_add_to_queu…pdating_context_reasons\"\)");
       i.options = uob;
       Type[] typeArray = new Type[]{String.class};
       obj = obj.f(ya7.j(Set.class, typeArray), pl1.a, "disallowAddToQueueReasons");
       co5.l(obj, "moshi.adapter\(Types.newP…sallowAddToQueueReasons\"\)");
       i.nullableSetOfStringAdapter = obj;
    }
    public CosmosTypeAdapterFactory$PlayerRestrictionsAdapter$Adapter fromJson(b p0){
       Set set13;
       CosmosTypeAdapterFactory_PlayerRestrictionsAdapter_AdapterJsonAdapter uCosmosTypeA = this;
       CosmosTypeAdapterFactory$PlayerRestrictionsAdapter$Adapter obj = p0;
       co5.o(obj, "reader");
       p0.f();
       Set set = null;
       Set set1 = set;
       Set set2 = set1;
       Set set3 = set2;
       Set set4 = set3;
       Set set5 = set4;
       Set set6 = set5;
       Set set7 = set6;
       Set set8 = set7;
       Set set9 = set8;
       Set set10 = set9;
       Set set11 = set10;
       Set set12 = set11;
       int i = set12;
       int i1 = i;
       int i2 = i1;
       int i3 = i2;
       int i4 = i3;
       int i5 = i4;
       int i6 = i5;
       int i7 = i6;
       int i8 = 0;
       int i9 = 0;
       int i10 = 0;
       int i11 = 0;
       int i12 = 0;
       int i13 = 0;
       int i14 = 0;
       int i15 = 0;
       int i16 = 0;
       int i17 = 0;
       int i18 = 0;
       int i19 = 0;
       int i20 = 0;
       int i21 = 0;
       int i22 = 0;
       int i23 = 0;
       int i24 = 0;
       int i25 = 0;
       int i26 = 0;
       int i27 = 0;
       int i28 = 0;
       while (p0.T()) {
          set13 = i;
          switch (obj.v0(uCosmosTypeA.options)){
              case 0xffffffff:
                p0.z0();
                p0.A0();
             label_0199 :
                i = set13;
                break;
              case 0:
                set = uCosmosTypeA.nullableSetOfStringAdapter.fromJson(obj);
                i = set13;
                i8 = 1;
                break;
              case 1:
                set1 = uCosmosTypeA.nullableSetOfStringAdapter.fromJson(obj);
                i = set13;
                i9 = 1;
                break;
              case 2:
                set2 = uCosmosTypeA.nullableSetOfStringAdapter.fromJson(obj);
                i = set13;
                i10 = 1;
                break;
              case 3:
                set3 = uCosmosTypeA.nullableSetOfStringAdapter.fromJson(obj);
                i = set13;
                i11 = 1;
                break;
              case 4:
                set4 = uCosmosTypeA.nullableSetOfStringAdapter.fromJson(obj);
                i = set13;
                i12 = 1;
                break;
              case 5:
                set5 = uCosmosTypeA.nullableSetOfStringAdapter.fromJson(obj);
                i = set13;
                i13 = 1;
                break;
              case 6:
                set6 = uCosmosTypeA.nullableSetOfStringAdapter.fromJson(obj);
                i = set13;
                i14 = 1;
                break;
              case 7:
                set7 = uCosmosTypeA.nullableSetOfStringAdapter.fromJson(obj);
                i = set13;
                i15 = 1;
                break;
              case 8:
                set8 = uCosmosTypeA.nullableSetOfStringAdapter.fromJson(obj);
                i = set13;
                i16 = 1;
                break;
              case 9:
                set9 = uCosmosTypeA.nullableSetOfStringAdapter.fromJson(obj);
                i = set13;
                i17 = 1;
                break;
              case 10:
                set10 = uCosmosTypeA.nullableSetOfStringAdapter.fromJson(obj);
                i = set13;
                i18 = 1;
                break;
              case 11:
                set11 = uCosmosTypeA.nullableSetOfStringAdapter.fromJson(obj);
                i = set13;
                i19 = 1;
                break;
              case 12:
                set12 = uCosmosTypeA.nullableSetOfStringAdapter.fromJson(obj);
                i = set13;
                i20 = 1;
                break;
              case 13:
                i = uCosmosTypeA.nullableSetOfStringAdapter.fromJson(obj);
                i21 = 1;
                break;
              case 14:
                i1 = uCosmosTypeA.nullableSetOfStringAdapter.fromJson(obj);
                i = set13;
                i22 = 1;
                break;
              case 15:
                i2 = uCosmosTypeA.nullableSetOfStringAdapter.fromJson(obj);
                i = set13;
                i23 = 1;
                break;
              case 16:
                i3 = uCosmosTypeA.nullableSetOfStringAdapter.fromJson(obj);
                i = set13;
                i24 = 1;
                break;
              case 17:
                i4 = uCosmosTypeA.nullableSetOfStringAdapter.fromJson(obj);
                i = set13;
                i25 = 1;
                break;
              case 18:
                i5 = uCosmosTypeA.nullableSetOfStringAdapter.fromJson(obj);
                i = set13;
                i26 = 1;
                break;
              case 19:
                i6 = uCosmosTypeA.nullableSetOfStringAdapter.fromJson(obj);
                i = set13;
                i27 = 1;
                break;
              case 20:
                i7 = uCosmosTypeA.nullableSetOfStringAdapter.fromJson(obj);
                i = set13;
                i28 = 1;
                break;
              default:
                goto label_0199 ;
          }
       }
       set13 = i;
       p0.y();
       obj = new CosmosTypeAdapterFactory$PlayerRestrictionsAdapter$Adapter();
       if (i8) {
          obj.u = set;
       }
       if (i9) {
          obj.n = set1;
       }
       if (i10) {
          obj.m = set2;
       }
       if (i11) {
          obj.e = set3;
       }
       if (i12) {
          obj.b = set4;
       }
       if (i13) {
          obj.a = set5;
       }
       if (i14) {
          obj.l = set6;
       }
       if (i15) {
          obj.r = set7;
       }
       if (i16) {
          obj.q = set8;
       }
       if (i17) {
          obj.p = set9;
       }
       if (i18) {
          obj.o = set10;
       }
       if (i19) {
          obj.f = set11;
       }
       if (i20) {
          obj.j = set12;
       }
       if (i21) {
          obj.t = set13;
       }
       if (i22) {
          obj.d = i1;
       }
       if (i23) {
          obj.c = i2;
       }
       if (i24) {
          obj.g = i3;
       }
       if (i25) {
          obj.h = i4;
       }
       if (i26) {
          obj.i = i5;
       }
       if (i27) {
          obj.k = i6;
       }
       if (i28) {
          obj.s = i7;
       }
       return obj;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,CosmosTypeAdapterFactory$PlayerRestrictionsAdapter$Adapter p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("disallow_add_to_queue_reasons");
       this.nullableSetOfStringAdapter.toJson(p0, p1.u);
       p0.l0("disallow_inserting_into_context_tracks_reasons");
       this.nullableSetOfStringAdapter.toJson(p0, p1.n);
       p0.l0("disallow_inserting_into_next_tracks_reasons");
       this.nullableSetOfStringAdapter.toJson(p0, p1.m);
       p0.l0("disallow_pausing_reasons");
       this.nullableSetOfStringAdapter.toJson(p0, p1.e);
       p0.l0("disallow_peeking_next_reasons");
       this.nullableSetOfStringAdapter.toJson(p0, p1.b);
       p0.l0("disallow_peeking_prev_reasons");
       this.nullableSetOfStringAdapter.toJson(p0, p1.a);
       p0.l0("disallow_remote_control_reasons");
       this.nullableSetOfStringAdapter.toJson(p0, p1.l);
       p0.l0("disallow_removing_from_context_tracks_reasons");
       this.nullableSetOfStringAdapter.toJson(p0, p1.r);
       p0.l0("disallow_removing_from_next_tracks_reasons");
       this.nullableSetOfStringAdapter.toJson(p0, p1.q);
       p0.l0("disallow_reordering_in_context_tracks_reasons");
       this.nullableSetOfStringAdapter.toJson(p0, p1.p);
       p0.l0("disallow_reordering_in_next_tracks_reasons");
       this.nullableSetOfStringAdapter.toJson(p0, p1.o);
       p0.l0("disallow_resuming_reasons");
       this.nullableSetOfStringAdapter.toJson(p0, p1.f);
       p0.l0("disallow_seeking_reasons");
       this.nullableSetOfStringAdapter.toJson(p0, p1.j);
       p0.l0("disallow_set_queue_reasons");
       this.nullableSetOfStringAdapter.toJson(p0, p1.t);
       p0.l0("disallow_skipping_next_reasons");
       this.nullableSetOfStringAdapter.toJson(p0, p1.d);
       p0.l0("disallow_skipping_prev_reasons");
       this.nullableSetOfStringAdapter.toJson(p0, p1.c);
       p0.l0("disallow_toggling_repeat_context_reasons");
       this.nullableSetOfStringAdapter.toJson(p0, p1.g);
       p0.l0("disallow_toggling_repeat_track_reasons");
       this.nullableSetOfStringAdapter.toJson(p0, p1.h);
       p0.l0("disallow_toggling_shuffle_reasons");
       this.nullableSetOfStringAdapter.toJson(p0, p1.i);
       p0.l0("disallow_transferring_playback_reasons");
       this.nullableSetOfStringAdapter.toJson(p0, p1.k);
       p0.l0("disallow_updating_context_reasons");
       this.nullableSetOfStringAdapter.toJson(p0, p1.s);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(80, "GeneratedJsonAdapter\(CosmosTypeAdapterFactory.PlayerRestrictionsAdapter.Adapter\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
