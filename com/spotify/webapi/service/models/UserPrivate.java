package com.spotify.webapi.service.models.UserPrivate;
import com.spotify.webapi.service.models.UserPublic;
import java.lang.Object;
import p.io2;
import java.lang.Integer;
import java.util.Arrays;

public final class UserPrivate extends UserPublic	// class@000ccf from classes.dex
{
    public String birthdate;
    public String country;
    public String email;
    public String product;

    public void UserPrivate(){
       super();
    }
    public static void getBirthdate$annotations(){
    }
    public static void getCountry$annotations(){
    }
    public static void getEmail$annotations(){
    }
    public static void getProduct$annotations(){
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof UserPrivate) {
          return false;
       }
       if (!super.equals(p0)) {
          return false;
       }
       if (!io2.j(this.birthdate, p0.birthdate) || (!io2.j(this.country, p0.country) || (!io2.j(this.email, p0.email) || !io2.j(this.product, p0.product)))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{Integer.valueOf(super.hashCode()),this.birthdate,this.country,this.email,this.product};
       return Arrays.hashCode(objArray);
    }
}
