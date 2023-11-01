package com.spotify.login.signupapi.services.model.FacebookSignupRequest;
import com.spotify.login.signupapi.services.model.SignupRequest;
import com.google.common.collect.ForwardingMap;
import java.lang.String;
import com.spotify.login.signupapi.services.model.UserData;
import com.spotify.login.signupapi.services.model.TermsData;
import com.spotify.login.signupapi.services.model.AppData;
import com.spotify.login.signupapi.services.model.ReferralData;
import java.lang.Object;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.Map;
import p.k73;
import p.m73;
import java.lang.Integer;
import p.dt5;
import java.util.LinkedHashMap;
import p.ap5;
import java.util.Set;
import java.util.Collection;
import p.tp2;
import java.lang.StringBuilder;

public final class FacebookSignupRequest extends ForwardingMap implements SignupRequest	// class@0009a9 from classes.dex
{
    private final AppData appData;
    private final String email;
    private final String facebookAccessToken;
    private final String facebookUserId;
    private final ReferralData referralData;
    private final TermsData termsData;
    private final UserData userData;

    public void FacebookSignupRequest(String p0,String p1,String p2,UserData p3,TermsData p4,AppData p5,ReferralData p6){
       co5.o(p0, "facebookAccessToken");
       co5.o(p1, "facebookUserId");
       co5.o(p2, "email");
       co5.o(p3, "userData");
       co5.o(p4, "termsData");
       super();
       this.facebookAccessToken = p0;
       this.facebookUserId = p1;
       this.email = p2;
       this.userData = p3;
       this.termsData = p4;
       this.appData = p5;
       this.referralData = p6;
    }
    public void FacebookSignupRequest(String p0,String p1,String p2,UserData p3,TermsData p4,AppData p5,ReferralData p6,int p7,DefaultConstructorMarker p8){
       AppData uAppData = ((p7 & 0x20))? null: p5;
       ReferralData referralData = ((p7 & 0x40))? null: p6;
       super(p0, p1, p2, p3, p4, uAppData, referralData);
       return;
    }
    public static FacebookSignupRequest copy$default(FacebookSignupRequest p0,String p1,String p2,String p3,UserData p4,TermsData p5,AppData p6,ReferralData p7,int p8,Object p9){
       FacebookSignupRequest uFacebookSig;
       FacebookSignupRequest uFacebookSig1;
       FacebookSignupRequest email;
       FacebookSignupRequest userData;
       FacebookSignupRequest termsData;
       FacebookSignupRequest appData;
       FacebookSignupRequest referralData;
       if ((p8 & 0x01)) {
          uFacebookSig = p0.facebookAccessToken;
       }
       if ((p8 & 0x02)) {
          uFacebookSig1 = p0.facebookUserId;
       }
       p9 = uFacebookSig1;
       if ((p8 & 0x04)) {
          email = p0.email;
       }
       FacebookSignupRequest uFacebookSig2 = email;
       if ((p8 & 0x08)) {
          userData = p0.userData;
       }
       FacebookSignupRequest uFacebookSig3 = userData;
       if ((p8 & 0x10)) {
          termsData = p0.termsData;
       }
       FacebookSignupRequest uFacebookSig4 = termsData;
       if ((p8 & 0x20)) {
          appData = p0.appData;
       }
       FacebookSignupRequest uFacebookSig5 = appData;
       if ((p8 & 0x40)) {
          referralData = p0.referralData;
       }
       return p0.copy(uFacebookSig, p9, uFacebookSig2, uFacebookSig3, uFacebookSig4, uFacebookSig5, referralData);
    }
    public final String component1(){
       return this.facebookAccessToken;
    }
    public final String component2(){
       return this.facebookUserId;
    }
    public final String component3(){
       return this.email;
    }
    public final UserData component4(){
       return this.userData;
    }
    public final TermsData component5(){
       return this.termsData;
    }
    public final AppData component6(){
       return this.appData;
    }
    public final ReferralData component7(){
       return this.referralData;
    }
    public final boolean containsKey(Object p0){
       if (!p0 instanceof String) {
          return false;
       }
       return this.containsKey(p0);
    }
    public boolean containsKey(String p0){
       return super.containsKey(p0);
    }
    public final FacebookSignupRequest copy(String p0,String p1,String p2,UserData p3,TermsData p4,AppData p5,ReferralData p6){
       co5.o(p0, "facebookAccessToken");
       co5.o(p1, "facebookUserId");
       co5.o(p2, "email");
       co5.o(p3, "userData");
       co5.o(p4, "termsData");
       FacebookSignupRequest v0 = new FacebookSignupRequest(p0, p1, p2, p3, p4, p5, p6);
       return v0;
    }
    public Object delegate(){
       return this.delegate();
    }
    public Map delegate(){
       FacebookSignupRequest tappData;
       k73 ok73 = m73.a();
       this.userData.setFields(ok73);
       this.termsData.setFields(ok73);
       if ((tappData = this.appData) != null) {
          tappData.setFields(ok73);
       }
       if ((tappData = this.referralData) != null) {
          tappData.setFields(ok73);
       }
       ok73.d("email", this.email);
       ok73.d("fb", Integer.valueOf(1));
       ok73.d("facebook_name", "throwaway");
       ok73.d("facebook_user_id", this.facebookUserId);
       ok73.d("facebook_token", this.facebookAccessToken);
       return ap5.A(ok73.b(1));
    }
    public final Set entrySet(){
       return this.getEntries();
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof FacebookSignupRequest) {
          return false;
       }
       if (!co5.c(this.facebookAccessToken, p0.facebookAccessToken)) {
          return false;
       }
       if (!co5.c(this.facebookUserId, p0.facebookUserId)) {
          return false;
       }
       if (!co5.c(this.email, p0.email)) {
          return false;
       }
       if (!co5.c(this.userData, p0.userData)) {
          return false;
       }
       if (!co5.c(this.termsData, p0.termsData)) {
          return false;
       }
       if (!co5.c(this.appData, p0.appData)) {
          return false;
       }
       if (!co5.c(this.referralData, p0.referralData)) {
          return false;
       }
       return true;
    }
    public final Object get(Object p0){
       if (!p0 instanceof String) {
          return null;
       }
       return this.get(p0);
    }
    public Object get(String p0){
       return super.get(p0);
    }
    public final AppData getAppData(){
       return this.appData;
    }
    public final String getEmail(){
       return this.email;
    }
    public Set getEntries(){
       return super.entrySet();
    }
    public final String getFacebookAccessToken(){
       return this.facebookAccessToken;
    }
    public final String getFacebookUserId(){
       return this.facebookUserId;
    }
    public Set getKeys(){
       return super.keySet();
    }
    public final Object getOrDefault(Object p0,Object p1){
       if (!p0 instanceof String) {
          return p1;
       }
       return this.getOrDefault(p0, p1);
    }
    public Object getOrDefault(String p0,Object p1){
       return super.getOrDefault(p0, p1);
    }
    public final ReferralData getReferralData(){
       return this.referralData;
    }
    public int getSize(){
       return super.size();
    }
    public final TermsData getTermsData(){
       return this.termsData;
    }
    public final UserData getUserData(){
       return this.userData;
    }
    public Collection getValues(){
       return super.values();
    }
    public int hashCode(){
       int i = (this.termsData.hashCode() + ((this.userData.hashCode() + tp2.g(this.email, tp2.g(this.facebookUserId, (this.facebookAccessToken.hashCode() * 31), 31), 31)) * 31)) * 31;
       FacebookSignupRequest tappData = this.appData;
       int i1 = 0;
       int i2 = (tappData == null)? 0: tappData.hashCode();
       i = (i + i2) * 31;
       if ((tappData = this.referralData) != null) {
          i1 = tappData.hashCode();
       }
       return (i + i1);
    }
    public final Set keySet(){
       return this.getKeys();
    }
    public final Object remove(Object p0){
       if (!p0 instanceof String) {
          return null;
       }
       return this.remove(p0);
    }
    public Object remove(String p0){
       return super.remove(p0);
    }
    public final boolean remove(Object p0,Object p1){
       if (!p0 instanceof String) {
          return false;
       }
       if (p1 == null) {
          return false;
       }
       return this.remove(p0, p1);
    }
    public boolean remove(String p0,Object p1){
       return super.remove(p0, p1);
    }
    public final int size(){
       return this.getSize();
    }
    public String toString(){
       return "FacebookSignupRequest\(facebookAccessToken="+this.facebookAccessToken+", facebookUserId="+this.facebookUserId+", email="+this.email+", userData="+this.userData+", termsData="+this.termsData+", appData="+this.appData+", referralData="+this.referralData+')';
    }
    public final Collection values(){
       return this.getValues();
    }
    public FacebookSignupRequest withCreationPoint(String p0){
       FacebookSignupRequest tappData;
       AppData uAppData;
       co5.o(p0, "creationPoint");
       AppData uAppData1 = ((tappData = this.appData) != null && (uAppData = AppData.copy$default(tappData, null, p0, null, 5, null)) != null)? uAppData: new AppData(null, p0, null, 5, null);
       return FacebookSignupRequest.copy$default(this, null, null, null, null, null, uAppData, null, 95, null);
    }
    public SignupRequest withCreationPoint(String p0){
       return this.withCreationPoint(p0);
    }
    public FacebookSignupRequest withKey(String p0){
       FacebookSignupRequest tappData;
       AppData uAppData;
       co5.o(p0, "key");
       AppData uAppData1 = ((tappData = this.appData) != null && (uAppData = AppData.copy$default(tappData, p0, null, null, 6, null)) != null)? uAppData: new AppData(p0, null, null, 6, null);
       return FacebookSignupRequest.copy$default(this, null, null, null, null, null, uAppData, null, 95, null);
    }
    public SignupRequest withKey(String p0){
       return this.withKey(p0);
    }
}
