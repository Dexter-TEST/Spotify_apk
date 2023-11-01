package com.spotify.localfiles.localfiles.LocalContentSummary;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class LocalContentSummary	// class@000979 from classes.dex
{
    public final int a;
    public final long b;

    public void LocalContentSummary(int p0,long p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final LocalContentSummary copy(int p0,long p1){
       return new LocalContentSummary(p0, p1);
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof LocalContentSummary) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.b - p0.b) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       LocalContentSummary tb = this.b;
       return ((this.a * 31) + (int)(tb ^ (tb >> 32)));
    }
    public final String toString(){
       return tp2.o("LocalContentSummary\(numberOfTracks="+this.a+", totalDurationSeconds=", this.b, ')');
    }
}
