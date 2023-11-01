package com.spotify.notifications.models.preferences.PreferenceSection;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.kg4;

public final class PreferenceSection	// class@000aaa from classes.dex
{
    public final String a;
    public final List b;

    public void PreferenceSection(String p0,List p1){
       co5.o(p0, "name");
       co5.o(p1, "preferences");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final PreferenceSection copy(String p0,List p1){
       co5.o(p0, "name");
       co5.o(p1, "preferences");
       return new PreferenceSection(p0, p1);
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof PreferenceSection) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.b.hashCode() + (this.a.hashCode() * 31));
    }
    public final String toString(){
       return kg4.o("PreferenceSection\(name="+this.a+", preferences=", this.b, ')');
    }
}
