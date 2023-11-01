package com.spotify.login.signupapi.services.model.EmailSignupRequestBody;
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
import p.tp2;
import java.lang.StringBuilder;

public final class EmailSignupRequestBody extends ForwardingMap implements SignupRequest	// class@00099c from classes.dex
{
    private final AppData appData;
    private final String email;
    private final String password;
    private final String passwordRepeat;
    private final ReferralData referralData;
    private final TermsData termsData;
    private final UserData userData;

    public void EmailSignupRequestBody(String p0,String p1,String p2,UserData p3,TermsData p4,AppData p5,ReferralData p6){
       co5.o(p0, "email");
       co5.o(p1, "password");
       co5.o(p2, "passwordRepeat");
       co5.o(p3, "userData");
       co5.o(p4, "termsData");
       super();
       this.email = p0;
       this.password = p1;
       this.passwordRepeat = p2;
       this.userData = p3;
       this.termsData = p4;
       this.appData = p5;
       this.referralData = p6;
    }
    public void EmailSignupRequestBody(String p0,String p1,String p2,UserData p3,TermsData p4,AppData p5,ReferralData p6,int p7,DefaultConstructorMarker p8){
       AppData uAppData = ((p7 & 0x20))? null: p5;
       ReferralData referralData = ((p7 & 0x40))? null: p6;
       super(p0, p1, p2, p3, p4, uAppData, referralData);
       return;
    }
    public static EmailSignupRequestBody copy$default(EmailSignupRequestBody p0,String p1,String p2,String p3,UserData p4,TermsData p5,AppData p6,ReferralData p7,int p8,Object p9){
       EmailSignupRequestBody email;
       EmailSignupRequestBody password;
       EmailSignupRequestBody passwordRepe;
       EmailSignupRequestBody userData;
       EmailSignupRequestBody termsData;
       EmailSignupRequestBody appData;
       EmailSignupRequestBody referralData;
       if ((p8 & 0x01)) {
          email = p0.email;
       }
       if ((p8 & 0x02)) {
          password = p0.password;
       }
       p9 = password;
       if ((p8 & 0x04)) {
          passwordRepe = p0.passwordRepeat;
       }
       EmailSignupRequestBody uEmailSignup = passwordRepe;
       if ((p8 & 0x08)) {
          userData = p0.userData;
       }
       EmailSignupRequestBody uEmailSignup1 = userData;
       if ((p8 & 0x10)) {
          termsData = p0.termsData;
       }
       EmailSignupRequestBody uEmailSignup2 = termsData;
       if ((p8 & 0x20)) {
          appData = p0.appData;
       }
       EmailSignupRequestBody uEmailSignup3 = appData;
       if ((p8 & 0x40)) {
          referralData = p0.referralData;
       }
       return p0.copy(email, p9, uEmailSignup, uEmailSignup1, uEmailSignup2, uEmailSignup3, referralData);
    }
    public final String component1(){
       return this.email;
    }
    public final String component2(){
       return this.password;
    }
    public final String component3(){
       return this.passwordRepeat;
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
    public final EmailSignupRequestBody copy(String p0,String p1,String p2,UserData p3,TermsData p4,AppData p5,ReferralData p6){
       co5.o(p0, "email");
       co5.o(p1, "password");
       co5.o(p2, "passwordRepeat");
       co5.o(p3, "userData");
       co5.o(p4, "termsData");
       EmailSignupRequestBody v0 = new EmailSignupRequestBody(p0, p1, p2, p3, p4, p5, p6);
       return v0;
    }
    public Object delegate(){
       return this.delegate();
    }
    public Map delegate(){
       EmailSignupRequestBody tappData;
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
       ok73.d("password", this.password);
       ok73.d("password_repeat", this.passwordRepeat);
       return ap5.A(ok73.b(true));
    }
    public final Set entrySet(){
       return this.getEntries();
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof EmailSignupRequestBody) {
          return false;
       }
       if (!co5.c(this.email, p0.email)) {
          return false;
       }
       if (!co5.c(this.password, p0.password)) {
          return false;
       }
       if (!co5.c(this.passwordRepeat, p0.passwordRepeat)) {
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
    public final String getPassword(){
       return this.password;
    }
    public final String getPasswordRepeat(){
       return this.passwordRepeat;
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
       int i = (this.termsData.hashCode() + ((this.userData.hashCode() + tp2.g(this.passwordRepeat, tp2.g(this.password, (this.email.hashCode() * 31), 31), 31)) * 31)) * 31;
       EmailSignupRequestBody tappData = this.appData;
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
       return "EmailSignupRequestBody\(email="+this.email+", password="+this.password+", passwordRepeat="+this.passwordRepeat+", userData="+this.userData+", termsData="+this.termsData+", appData="+this.appData+", referralData="+this.referralData+')';
    }
    public final Collection values(){
       return this.getValues();
    }
    public EmailSignupRequestBody withCreationPoint(String p0){
       EmailSignupRequestBody tappData;
       AppData uAppData;
       co5.o(p0, "creationPoint");
       AppData uAppData1 = ((tappData = this.appData) != null && (uAppData = AppData.copy$default(tappData, null, p0, null, 5, null)) != null)? uAppData: new AppData(null, p0, null, 5, null);
       return EmailSignupRequestBody.copy$default(this, null, null, null, null, null, uAppData, null, 95, null);
    }
    public SignupRequest withCreationPoint(String p0){
       return this.withCreationPoint(p0);
    }
    public EmailSignupRequestBody withKey(String p0){
       EmailSignupRequestBody tappData;
       AppData uAppData;
       co5.o(p0, "key");
       AppData uAppData1 = ((tappData = this.appData) != null && (uAppData = AppData.copy$default(tappData, p0, null, null, 6, null)) != null)? uAppData: new AppData(p0, null, null, 6, null);
       return EmailSignupRequestBody.copy$default(this, null, null, null, null, null, uAppData, null, 95, null);
    }
    public SignupRequest withKey(String p0){
       return this.withKey(p0);
    }
}
