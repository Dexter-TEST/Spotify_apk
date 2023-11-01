package com.spotify.login.signupapi.services.model.IdentifierTokenSignupRequestBody;
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
import p.dt5;
import java.util.LinkedHashMap;
import p.ap5;
import java.util.Set;
import java.util.Collection;
import java.lang.StringBuilder;

public final class IdentifierTokenSignupRequestBody extends ForwardingMap implements SignupRequest	// class@0009af from classes.dex
{
    private final AppData appData;
    private final String email;
    private final String identifierToken;
    private final ReferralData referralData;
    private final TermsData termsData;
    private final UserData userData;

    public void IdentifierTokenSignupRequestBody(String p0,UserData p1,TermsData p2,AppData p3,String p4,ReferralData p5){
       co5.o(p0, "identifierToken");
       co5.o(p1, "userData");
       co5.o(p2, "termsData");
       super();
       this.identifierToken = p0;
       this.userData = p1;
       this.termsData = p2;
       this.appData = p3;
       this.email = p4;
       this.referralData = p5;
    }
    public void IdentifierTokenSignupRequestBody(String p0,UserData p1,TermsData p2,AppData p3,String p4,ReferralData p5,int p6,DefaultConstructorMarker p7){
       AppData uAppData = ((p6 & 0x08))? null: p3;
       String str = ((p6 & 0x10))? null: p4;
       ReferralData referralData = ((p6 & 0x20))? null: p5;
       super(p0, p1, p2, uAppData, str, referralData);
       return;
    }
    public static IdentifierTokenSignupRequestBody copy$default(IdentifierTokenSignupRequestBody p0,String p1,UserData p2,TermsData p3,AppData p4,String p5,ReferralData p6,int p7,Object p8){
       IdentifierTokenSignupRequestBody identifierTo;
       IdentifierTokenSignupRequestBody userData;
       IdentifierTokenSignupRequestBody termsData;
       IdentifierTokenSignupRequestBody appData;
       IdentifierTokenSignupRequestBody email;
       IdentifierTokenSignupRequestBody referralData;
       if ((p7 & 0x01)) {
          identifierTo = p0.identifierToken;
       }
       if ((p7 & 0x02)) {
          userData = p0.userData;
       }
       p8 = userData;
       if ((p7 & 0x04)) {
          termsData = p0.termsData;
       }
       IdentifierTokenSignupRequestBody identifierTo1 = termsData;
       if ((p7 & 0x08)) {
          appData = p0.appData;
       }
       IdentifierTokenSignupRequestBody identifierTo2 = appData;
       if ((p7 & 0x10)) {
          email = p0.email;
       }
       IdentifierTokenSignupRequestBody identifierTo3 = email;
       if ((p7 & 0x20)) {
          referralData = p0.referralData;
       }
       return p0.copy(identifierTo, p8, identifierTo1, identifierTo2, identifierTo3, referralData);
    }
    public final String component1(){
       return this.identifierToken;
    }
    public final UserData component2(){
       return this.userData;
    }
    public final TermsData component3(){
       return this.termsData;
    }
    public final AppData component4(){
       return this.appData;
    }
    public final String component5(){
       return this.email;
    }
    public final ReferralData component6(){
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
    public final IdentifierTokenSignupRequestBody copy(String p0,UserData p1,TermsData p2,AppData p3,String p4,ReferralData p5){
       co5.o(p0, "identifierToken");
       co5.o(p1, "userData");
       co5.o(p2, "termsData");
       IdentifierTokenSignupRequestBody v0 = new IdentifierTokenSignupRequestBody(p0, p1, p2, p3, p4, p5);
       return v0;
    }
    public Object delegate(){
       return this.delegate();
    }
    public Map delegate(){
       IdentifierTokenSignupRequestBody tappData;
       k73 ok73 = m73.a();
       this.userData.setFields(ok73);
       this.termsData.setFields(ok73);
       if ((tappData = this.appData) != null) {
          tappData.setFields(ok73);
       }
       if ((tappData = this.referralData) != null) {
          tappData.setFields(ok73);
       }
       tappData = ((tappData = this.email) != null && tappData.length())? 0: 1;
       if (!tappData) {
          ok73.d("email", this.email);
       }
       ok73.d("identifier_token", this.identifierToken);
       return ap5.A(ok73.b(true));
    }
    public final Set entrySet(){
       return this.getEntries();
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof IdentifierTokenSignupRequestBody) {
          return false;
       }
       if (!co5.c(this.identifierToken, p0.identifierToken)) {
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
       if (!co5.c(this.email, p0.email)) {
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
    public final String getIdentifierToken(){
       return this.identifierToken;
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
       int i = (this.termsData.hashCode() + ((this.userData.hashCode() + (this.identifierToken.hashCode() * 31)) * 31)) * 31;
       IdentifierTokenSignupRequestBody tappData = this.appData;
       int i1 = 0;
       int i2 = (tappData == null)? 0: tappData.hashCode();
       i = (i + i2) * 31;
       i2 = ((tappData = this.email) == null)? 0: tappData.hashCode();
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
       return "IdentifierTokenSignupRequestBody\(identifierToken="+this.identifierToken+", userData="+this.userData+", termsData="+this.termsData+", appData="+this.appData+", email="+this.email+", referralData="+this.referralData+')';
    }
    public final Collection values(){
       return this.getValues();
    }
    public IdentifierTokenSignupRequestBody withCreationPoint(String p0){
       IdentifierTokenSignupRequestBody tappData;
       AppData uAppData;
       co5.o(p0, "creationPoint");
       AppData uAppData1 = ((tappData = this.appData) != null && (uAppData = AppData.copy$default(tappData, null, p0, null, 5, null)) != null)? uAppData: new AppData(null, p0, null, 5, null);
       return IdentifierTokenSignupRequestBody.copy$default(this, null, null, null, uAppData, null, null, 55, null);
    }
    public SignupRequest withCreationPoint(String p0){
       return this.withCreationPoint(p0);
    }
    public IdentifierTokenSignupRequestBody withKey(String p0){
       IdentifierTokenSignupRequestBody tappData;
       AppData uAppData;
       co5.o(p0, "key");
       AppData uAppData1 = ((tappData = this.appData) != null && (uAppData = AppData.copy$default(tappData, p0, null, null, 6, null)) != null)? uAppData: new AppData(p0, null, null, 6, null);
       return IdentifierTokenSignupRequestBody.copy$default(this, null, null, null, uAppData, null, null, 55, null);
    }
    public SignupRequest withKey(String p0){
       return this.withKey(p0);
    }
}
