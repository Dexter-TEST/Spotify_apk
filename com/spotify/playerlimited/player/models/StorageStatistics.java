package com.spotify.playerlimited.player.models.StorageStatistics;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class StorageStatistics	// class@000b8a from classes.dex
{
    public final int a;

    public void StorageStatistics(int p0){
       super();
       this.a = p0;
    }
    public final StorageStatistics copy(int p0){
       return new StorageStatistics(p0);
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof StorageStatistics) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.a;
    }
    public final String toString(){
       return tp2.n("StorageStatistics{currentLockedSize=", this.a, '}');
    }
}
