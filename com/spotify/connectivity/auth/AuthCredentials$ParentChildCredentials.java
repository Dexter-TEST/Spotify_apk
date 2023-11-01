package com.spotify.connectivity.auth.AuthCredentials$ParentChildCredentials;
import com.spotify.connectivity.auth.AuthCredentials;
import java.lang.String;
import com.spotify.connectivity.auth.AuthBlob$StoredCredentials;
import java.lang.Object;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;

public final class AuthCredentials$ParentChildCredentials extends AuthCredentials	// class@0005d7 from classes.dex
{
    private final String childId;
    private final AuthBlob$StoredCredentials parentCredentials;

    public void AuthCredentials$ParentChildCredentials(String p0,AuthBlob$StoredCredentials p1){
       co5.o(p0, "childId");
       co5.o(p1, "parentCredentials");
       super(null);
       this.childId = p0;
       this.parentCredentials = p1;
    }
    public static AuthCredentials$ParentChildCredentials copy$default(AuthCredentials$ParentChildCredentials p0,String p1,AuthBlob$StoredCredentials p2,int p3,Object p4){
       AuthCredentials$ParentChildCredentials childId;
       AuthCredentials$ParentChildCredentials parentCreden;
       if ((p3 & 0x01)) {
          childId = p0.childId;
       }
       if ((p3 & 0x02)) {
          parentCreden = p0.parentCredentials;
       }
       return p0.copy(childId, parentCreden);
    }
    public final String component1(){
       return this.childId;
    }
    public final AuthBlob$StoredCredentials component2(){
       return this.parentCredentials;
    }
    public final AuthCredentials$ParentChildCredentials copy(String p0,AuthBlob$StoredCredentials p1){
       co5.o(p0, "childId");
       co5.o(p1, "parentCredentials");
       return new AuthCredentials$ParentChildCredentials(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AuthCredentials$ParentChildCredentials) {
          return false;
       }
       if (!co5.c(this.childId, p0.childId)) {
          return false;
       }
       if (!co5.c(this.parentCredentials, p0.parentCredentials)) {
          return false;
       }
       return true;
    }
    public final String getChildId(){
       return this.childId;
    }
    public final AuthBlob$StoredCredentials getParentCredentials(){
       return this.parentCredentials;
    }
    public int hashCode(){
       return (this.parentCredentials.hashCode() + (this.childId.hashCode() * 31));
    }
    public String toString(){
       return "ParentChildCredentials\(childId="+this.childId+", parentCredentials="+this.parentCredentials+')';
    }
}
