package com.example.aws.elasticsearch.demo.document;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class PersonalCapitalDoc {

  @JsonProperty("ACK_ID")
  private String ackId;

  @JsonProperty("FORM_PLAN_YEAR_BEGIN_DATE")
  private Date formPlanYearBeginDate;

  @JsonProperty("FORM_TAX_PRD")
  private String formTaxPrd;

  @JsonProperty("TYPE_PLAN_ENTITY_CD")
  private String typePlanEntityCd;

  @JsonProperty("TYPE_DFE_PLAN_ENTITY_CD")
  private String typeDfePlanEntityCd;

  @JsonProperty("INITIAL_FILING_IND")
  private String initialFilingInd;

  @JsonProperty("AMENDED_IND")
  private String AMENDED_IND;

  @JsonProperty("FINAL_FILING_IND")
  private String finalFilingInd;

  @JsonProperty("SHORT_PLAN_YR_IND")
  private String shortPlanYrInd;

  @JsonProperty("COLLECTIVE_BARGAIN_IND")
  private String collectiveBargainInd;

  @JsonProperty("F5558_APPLICATION_FILED_IND")
  private String f5558ApplicationFiledInd;

  @JsonProperty("EXT_AUTOMATIC_IND")
  private String extAutomaticInd;

  @JsonProperty("DFVC_PROGRAM_IND")
  private String dfvcProgramInd;

  @JsonProperty("EXT_SPECIAL_IND")
  private String extSpecialInd;

  @JsonProperty("EXT_SPECIAL_TEXT")
  private String extSpecialText;

  @JsonProperty("PLAN_NAME")
  private String planName;

  @JsonProperty("SPONS_DFE_PN")
  private String sponsDfePn;

  @JsonProperty("PLAN_EFF_DATE")
  private String planEffDate;

  @JsonProperty("SPONSOR_DFE_NAME")
  private String sponsDfeName;

  @JsonProperty("SPONS_DFE_DBA_NAME")
  private String sponsDfeDbaName;

  @JsonProperty("SPONS_DFE_CARE_OF_NAME")
  private String sponsDfeCareOfName;

  @JsonProperty("SPONS_DFE_MAIL_US_ADDRESS1")
  private String sponsDfeMailUSAddress1;

  @JsonProperty("SPONS_DFE_MAIL_US_ADDRESS2")
  private String sponsDfeMailUsAddress2;

  @JsonProperty("SPONS_DFE_MAIL_US_CITY")
  private String sponsDfeMailUsCity;

  @JsonProperty("SPONS_DFE_MAIL_US_STATE")
  private String sponsDfeMailUsState;

  @JsonProperty("SPONS_DFE_MAIL_US_ZIP")
  private String sponsDfeMailUsZip;

  @JsonProperty("SPONS_DFE_MAIL_FOREIGN_ADDR1")
  private String sponsDfeMailUsForeignAddr1;

  @JsonProperty("SPONS_DFE_MAIL_FOREIGN_ADDR2")
  private String sponsDfeMailUsForeignAddr2;

  @JsonProperty("SPONS_DFE_MAIL_FOREIGN_CITY")
  private String sponsDfeMailUsForeignCity;

  @JsonProperty("SPONS_DFE_MAIL_FORGN_PROV_ST")
  private String sponsDfeMailUsForgnProvSt;

  @JsonProperty("SPONS_DFE_MAIL_FOREIGN_CNTRY")
  private String sponsDfeMailUsForeignCntry;

  @JsonProperty("SPONS_DFE_MAIL_FORGN_POSTAL_CD")
  private String sponsDfeMailUsForgnPostalCd;

  @JsonProperty("SPONS_DFE_LOC_US_ADDRESS1")
  private String sponsDfeLocUsAddr1;

  @JsonProperty("SPONS_DFE_LOC_US_ADDRESS2")
  private String sponsDfeLocUsAddr2;

  @JsonProperty("SPONS_DFE_LOC_US_CITY")
  private String sponsDfeLocUsCity;

  @JsonProperty("SPONS_DFE_LOC_US_STATE")
  private String sponsDfeLocUsState;

  @JsonProperty("SPONS_DFE_LOC_US_ZIP")
  private String sponsDfeLocUsZip;

  @JsonProperty("SPONS_DFE_LOC_FOREIGN_ADDRESS1")
  private String sponsDfeLocForeignAddress1;

  @JsonProperty("SPONS_DFE_LOC_FOREIGN_ADDRESS2")
  private String sponsDfeLocForeignAddress2;

  @JsonProperty("SPONS_DFE_LOC_FOREIGN_CITY")
  private String sponsDfeLocForeignCity;

  @JsonProperty("SPONS_DFE_LOC_FORGN_PROV_ST")
  private String sponsDfeLocForgnProvSt;

  @JsonProperty("SPONS_DFE_LOC_FOREIGN_CNTRY")
  private String sponsDfeLocForeignCntry;

  @JsonProperty("SPONS_DFE_LOC_FORGN_POSTAL_CD")
  private String sponsDfeLocForgnPostalCd;

  @JsonProperty("SPONS_DFE_EIN")
  private String sponsDfeEin;

  @JsonProperty("SPONS_DFE_PHONE_NUM")
  private String sponsDfePhoneNum;

  @JsonProperty("BUSINESS_CODE")
  private String businessCode;

  @JsonProperty("ADMIN_NAME")
  private String adminName;

  @JsonProperty("ADMIN_CARE_OF_NAME")
  private String adminCareOfName;

  @JsonProperty("ADMIN_US_ADDRESS1")
  private String adminUsAddress1;

  @JsonProperty("ADMIN_US_ADDRESS2")
  private String adminUsAddress2;

  @JsonProperty("ADMIN_US_CITY")
  private String adminUsCity;

  @JsonProperty("ADMIN_US_STATE")
  private String adminUsState;

  @JsonProperty("ADMIN_FOREIGN_ADDRESS1")
  private String adminForeignAdress1;

  @JsonProperty("ADMIN_FOREIGN_ADDRESS2")
  private String adminForeignAdress2;

  @JsonProperty("ADMIN_FOREIGN_CITY")
  private String adminForeignCity;

  @JsonProperty("ADMIN_FOREIGN_PROV_STATE")
  private String adminForeignProvState;

  @JsonProperty("ADMIN_FOREIGN_CNTRY")
  private String adminForeignCntry;

  @JsonProperty("ADMIN_FOREIGN_POSTAL_CD")
  private String adminForeignPostalCd;

  @JsonProperty("ADMIN_EIN")
  private String adminEim;

  @JsonProperty("ADMIN_PHONE_NUM")
  private String adminPhoneNum;

  @JsonProperty("LAST_RPT_SPONS_NAME")
  private String lastRptSponsName;

  @JsonProperty("LAST_RPT_SPONS_EIN")
  private String lastRptSponsEin;

  @JsonProperty("LAST_RPT_PLAN_NUM")
  private String lastRptPlanNum;

  @JsonProperty("ADMIN_SIGNED_DATE")
  private Date adminSignedDate;

  @JsonProperty("ADMIN_SIGNED_NAME")
  private String adminSignedName;

  @JsonProperty("SPONS_SIGNED_DATE")
  private String sponsSignedDate;

  @JsonProperty("SPONS_SIGNED_NAME")
  private String sponsSignedName;

  @JsonProperty("DFE_SIGNED_DATE")
  private String dfeSignedDate;

  @JsonProperty("DFE_SIGNED_NAME")
  private String dfeSignedName;

  @JsonProperty("TOT_PARTCP_BOY_CNT")
  private String totPartcpBoyCnt;

  @JsonProperty("TOT_ACTIVE_PARTCP_CNT")
  private String totActivePartcpCnt;

  @JsonProperty("RTD_SEP_PARTCP_RCVG_CNT")
  private String rtdSepPartcpRcvgCnt;

  @JsonProperty("SUBTL_ACT_RTD_SEP_CNT")
  private String subtlActRtdSepCnt;

  @JsonProperty("BENEF_RCVG_BNFT_CNT")
  private String benefRcvgBnftCnt;

  @JsonProperty("TOT_ACT_RTD_SEP_BENEF_CNT")
  private String totActRtdSepBenefCnt;

  @JsonProperty("PARTCP_ACCOUNT_BAL_CNT")
  private String partcpAccountBalCnt;

  @JsonProperty("SEP_PARTCP_PARTL_VSTD_CNT")
  private String sepPartcpPartlVstdCnt;

  @JsonProperty("FUNDING_SEC412_IND")
  private String fundingSec412Ind;

  @JsonProperty("CONTRIB_EMPLRS_CNT")
  private String contribEmplrsCnt;

  @JsonProperty("TYPE_PENSION_BNFT_CODE")
  private String typePensionBnftCode;

  @JsonProperty("TYPE_WELFARE_BNFT_CODE")
  private String typeWelfareBnftCode;

  @JsonProperty("FUNDING_INSURANCE_IND")
  private String fundingInsuranceInd;

  @JsonProperty("FUNDING_TRUST_IND")
  private String fundingTrustInd;

  @JsonProperty("FUNDING_GEN_ASSET_IND")
  private String fundingGenAssetInd;

  @JsonProperty("BENEFIT_INSURANCE_IND")
  private String benefitInsuranceInd;

  @JsonProperty("BENEFIT_SEC412_IND")
  private String benefitSec412Ind;

  @JsonProperty("BENEFIT_TRUST_IND")
  private String benefitTrustInd;

  @JsonProperty("BENEFIT_GEN_ASSET_IND")
  private String benefitGenAssetInd;

  @JsonProperty("SCH_R_ATTACHED_IND")
  private String schRAttachedInd;

  @JsonProperty("SCH_MB_ATTACHED_IND")
  private String schMbAttachedInd;

  @JsonProperty("SCH_SB_ATTACHED_IND")
  private String schSbAttachedInd;

  @JsonProperty("SCH_H_ATTACHED_IND")
  private String schHAttachedInd;

  @JsonProperty("SCH_I_ATTACHED_IND")
  private String schIAttachedInd;

  @JsonProperty("SCH_A_ATTACHED_IND")
  private String schAAttachedInd;

  @JsonProperty("NUM_SCH_A_ATTACHED_CNT")
  private String numSchAAttachedCnt;

  @JsonProperty("SCH_C_ATTACHED_IND")
  private String schCAttachedInd;

  @JsonProperty("SCH_D_ATTACHED_IND")
  private String schDAttachedInd;

  @JsonProperty("SCH_G_ATTACHED_IND")
  private String schGAttachedInd;

  @JsonProperty("FILING_STATUS")
  private String filingStatus;

  @JsonProperty("DATE_RECEIVED")
  private String dateReceived;

  @JsonProperty("VALID_ADMIN_SIGNATURE")
  private String validAdminSignature;

  @JsonProperty("VALID_DFE_SIGNATURE")
  private String validDfeSignature;

  @JsonProperty("VALID_SPONSOR_SIGNATURE")
  private String validSponsorSignature;

  @JsonProperty("ADMIN_PHONE_NUM_FOREIGN")
  private String adminPhoneNumForeign;

  @JsonProperty("SPONS_DFE_PHONE_NUM_FOREIGN")
  private String sponsDfePhoneNumForeign;

  @JsonProperty("ADMIN_NAME_SAME_SPON_IND")
  private String adminNameSameSponInd;

  @JsonProperty("ADMIN_ADDRESS_SAME_SPON_IND")
  private String adminAddressSameSponInd;

  @JsonProperty("PREPARER_NAME")
  private String preparerName;

  @JsonProperty("PREPARER_FIRM_NAME")
  private String preparerFirmName;

  @JsonProperty("PREPARER_US_ADDRESS1")
  private String preparerUsAddress1;

  @JsonProperty("PREPARER_US_ADDRESS2")
  private String preparerUsAddress2;

  @JsonProperty("PREPARER_US_CITY")
  private String preparerUsCity;

  @JsonProperty("PREPARER_US_STATE")
  private String preparerUsState;

  @JsonProperty("PREPARER_US_ZIP")
  private String preparerUsZip;

  @JsonProperty("PREPARER_FOREIGN_ADDRESS1")
  private String preparerForeignAddress1;

  @JsonProperty("PREPARER_FOREIGN_ADDRESS2")
  private String preparerForeignAddress2;

  @JsonProperty("PREPARER_FOREIGN_CITY")
  private String preparerForeignCity;

  @JsonProperty("PREPARER_FOREIGN_PROV_STATE")
  private String preparerForeignProvState;

  @JsonProperty("PREPARER_FOREIGN_CNTRY")
  private String preparerForeignCntry;

  @JsonProperty("PREPARER_FOREIGN_POSTAL_CD")
  private String preparerForeignPostalCd;

  @JsonProperty("PREPARER_PHONE_NUM")
  private String preparerPhoneNum;

  @JsonProperty("PREPARER_PHONE_NUM_FOREIGN")
  private String preparerPhoneNumForeign;

  @JsonProperty("TOT_ACT_PARTCP_BOY_CNT")
  private String totActPartcpBoyCnt;

  @JsonProperty("SUBJ_M1_FILING_REQ_IND")
  private String subjM1FilingReqInd;

  @JsonProperty("COMPLIANCE_M1_FILING_REQ_IND")
  private String complianceM1FilingReqInd;

  @JsonProperty("M1_RECEIPT_CONFIRMATION_CODE")
  private String m1ReceiptConfirmationCode;

  @JsonProperty("ADMIN_MANUAL_SIGNED_DATE")
  private String adminManualSignedDate;

  @JsonProperty("ADMIN_MANUAL_SIGNED_NAME")
  private String adminManualSignedName;

  @JsonProperty("LAST_RPT_PLAN_NAME")
  private String lastRPTPlanName;

  @JsonProperty("SPONS_MANUAL_SIGNED_DATE")
  private String sponsManualSignedDate;

  @JsonProperty("SPONS_MANUAL_SIGNED_NAME")
  private String sponsManualSignedName;

  @JsonProperty("DFE_MANUAL_SIGNED_DATE")
  private String dfeManualSignedDate;

  @JsonProperty("DFE_MANUAL_SIGNED_NAME")
  private String dfeManualsignedName;

  public String getAckId() {
    return ackId;
  }

  public void setAckId(String ackId) {
    this.ackId = ackId;
  }

  public Date getFormPlanYearBeginDate() {
    return formPlanYearBeginDate;
  }

  public void setFormPlanYearBeginDate(Date formPlanYearBeginDate) {
    this.formPlanYearBeginDate = formPlanYearBeginDate;
  }

  public String getFormTaxPrd() {
    return formTaxPrd;
  }

  public void setFormTaxPrd(String formTaxPrd) {
    this.formTaxPrd = formTaxPrd;
  }

  public String getTypePlanEntityCd() {
    return typePlanEntityCd;
  }

  public void setTypePlanEntityCd(String typePlanEntityCd) {
    this.typePlanEntityCd = typePlanEntityCd;
  }

  public String getTypeDfePlanEntityCd() {
    return typeDfePlanEntityCd;
  }

  public void setTypeDfePlanEntityCd(String typeDfePlanEntityCd) {
    this.typeDfePlanEntityCd = typeDfePlanEntityCd;
  }

  public String getInitialFilingInd() {
    return initialFilingInd;
  }

  public void setInitialFilingInd(String initialFilingInd) {
    this.initialFilingInd = initialFilingInd;
  }

  public String getAMENDED_IND() {
    return AMENDED_IND;
  }

  public void setAMENDED_IND(String aMENDED_IND) {
    AMENDED_IND = aMENDED_IND;
  }

  public String getFinalFilingInd() {
    return finalFilingInd;
  }

  public void setFinalFilingInd(String finalFilingInd) {
    this.finalFilingInd = finalFilingInd;
  }

  public String getShortPlanYrInd() {
    return shortPlanYrInd;
  }

  public void setShortPlanYrInd(String shortPlanYrInd) {
    this.shortPlanYrInd = shortPlanYrInd;
  }

  public String getCollectiveBargainInd() {
    return collectiveBargainInd;
  }

  public void setCollectiveBargainInd(String collectiveBargainInd) {
    this.collectiveBargainInd = collectiveBargainInd;
  }

  public String getF5558ApplicationFiledInd() {
    return f5558ApplicationFiledInd;
  }

  public void setF5558ApplicationFiledInd(String f5558ApplicationFiledInd) {
    this.f5558ApplicationFiledInd = f5558ApplicationFiledInd;
  }

  public String getExtAutomaticInd() {
    return extAutomaticInd;
  }

  public void setExtAutomaticInd(String extAutomaticInd) {
    this.extAutomaticInd = extAutomaticInd;
  }

  public String getDfvcProgramInd() {
    return dfvcProgramInd;
  }

  public void setDfvcProgramInd(String dfvcProgramInd) {
    this.dfvcProgramInd = dfvcProgramInd;
  }

  public String getExtSpecialInd() {
    return extSpecialInd;
  }

  public void setExtSpecialInd(String extSpecialInd) {
    this.extSpecialInd = extSpecialInd;
  }

  public String getExtSpecialText() {
    return extSpecialText;
  }

  public void setExtSpecialText(String extSpecialText) {
    this.extSpecialText = extSpecialText;
  }

  public String getPlanName() {
    return planName;
  }

  public void setPlanName(String planName) {
    this.planName = planName;
  }

  public String getSponsDfePn() {
    return sponsDfePn;
  }

  public void setSponsDfePn(String sponsDfePn) {
    this.sponsDfePn = sponsDfePn;
  }

  public String getPlanEffDate() {
    return planEffDate;
  }

  public void setPlanEffDate(String planEffDate) {
    this.planEffDate = planEffDate;
  }

  public String getSponsDfeName() {
    return sponsDfeName;
  }

  public void setSponsDfeName(String sponsDfeName) {
    this.sponsDfeName = sponsDfeName;
  }

  public String getSponsDfeDbaName() {
    return sponsDfeDbaName;
  }

  public void setSponsDfeDbaName(String sponsDfeDbaName) {
    this.sponsDfeDbaName = sponsDfeDbaName;
  }

  public String getSponsDfeCareOfName() {
    return sponsDfeCareOfName;
  }

  public void setSponsDfeCareOfName(String sponsDfeCareOfName) {
    this.sponsDfeCareOfName = sponsDfeCareOfName;
  }

  public String getSponsDfeMailUSAddress1() {
    return sponsDfeMailUSAddress1;
  }

  public void setSponsDfeMailUSAddress1(String sponsDfeMailUSAddress1) {
    this.sponsDfeMailUSAddress1 = sponsDfeMailUSAddress1;
  }

  public String getSponsDfeMailUsAddress2() {
    return sponsDfeMailUsAddress2;
  }

  public void setSponsDfeMailUsAddress2(String sponsDfeMailUsAddress2) {
    this.sponsDfeMailUsAddress2 = sponsDfeMailUsAddress2;
  }

  public String getSponsDfeMailUsCity() {
    return sponsDfeMailUsCity;
  }

  public void setSponsDfeMailUsCity(String sponsDfeMailUsCity) {
    this.sponsDfeMailUsCity = sponsDfeMailUsCity;
  }

  public String getSponsDfeMailUsState() {
    return sponsDfeMailUsState;
  }

  public void setSponsDfeMailUsState(String sponsDfeMailUsState) {
    this.sponsDfeMailUsState = sponsDfeMailUsState;
  }

  public String getSponsDfeMailUsZip() {
    return sponsDfeMailUsZip;
  }

  public void setSponsDfeMailUsZip(String sponsDfeMailUsZip) {
    this.sponsDfeMailUsZip = sponsDfeMailUsZip;
  }

  public String getSponsDfeMailUsForeignAddr1() {
    return sponsDfeMailUsForeignAddr1;
  }

  public void setSponsDfeMailUsForeignAddr1(String sponsDfeMailUsForeignAddr1) {
    this.sponsDfeMailUsForeignAddr1 = sponsDfeMailUsForeignAddr1;
  }

  public String getSponsDfeMailUsForeignAddr2() {
    return sponsDfeMailUsForeignAddr2;
  }

  public void setSponsDfeMailUsForeignAddr2(String sponsDfeMailUsForeignAddr2) {
    this.sponsDfeMailUsForeignAddr2 = sponsDfeMailUsForeignAddr2;
  }

  public String getSponsDfeMailUsForeignCity() {
    return sponsDfeMailUsForeignCity;
  }

  public void setSponsDfeMailUsForeignCity(String sponsDfeMailUsForeignCity) {
    this.sponsDfeMailUsForeignCity = sponsDfeMailUsForeignCity;
  }

  public String getSponsDfeMailUsForgnProvSt() {
    return sponsDfeMailUsForgnProvSt;
  }

  public void setSponsDfeMailUsForgnProvSt(String sponsDfeMailUsForgnProvSt) {
    this.sponsDfeMailUsForgnProvSt = sponsDfeMailUsForgnProvSt;
  }

  public String getSponsDfeMailUsForeignCntry() {
    return sponsDfeMailUsForeignCntry;
  }

  public void setSponsDfeMailUsForeignCntry(String sponsDfeMailUsForeignCntry) {
    this.sponsDfeMailUsForeignCntry = sponsDfeMailUsForeignCntry;
  }

  public String getSponsDfeMailUsForgnPostalCd() {
    return sponsDfeMailUsForgnPostalCd;
  }

  public void setSponsDfeMailUsForgnPostalCd(String sponsDfeMailUsForgnPostalCd) {
    this.sponsDfeMailUsForgnPostalCd = sponsDfeMailUsForgnPostalCd;
  }

  public String getSponsDfeLocUsAddr1() {
    return sponsDfeLocUsAddr1;
  }

  public void setSponsDfeLocUsAddr1(String sponsDfeLocUsAddr1) {
    this.sponsDfeLocUsAddr1 = sponsDfeLocUsAddr1;
  }

  public String getSponsDfeLocUsAddr2() {
    return sponsDfeLocUsAddr2;
  }

  public void setSponsDfeLocUsAddr2(String sponsDfeLocUsAddr2) {
    this.sponsDfeLocUsAddr2 = sponsDfeLocUsAddr2;
  }

  public String getSponsDfeLocUsCity() {
    return sponsDfeLocUsCity;
  }

  public void setSponsDfeLocUsCity(String sponsDfeLocUsCity) {
    this.sponsDfeLocUsCity = sponsDfeLocUsCity;
  }

  public String getSponsDfeLocUsState() {
    return sponsDfeLocUsState;
  }

  public void setSponsDfeLocUsState(String sponsDfeLocUsState) {
    this.sponsDfeLocUsState = sponsDfeLocUsState;
  }

  public String getSponsDfeLocUsZip() {
    return sponsDfeLocUsZip;
  }

  public void setSponsDfeLocUsZip(String sponsDfeLocUsZip) {
    this.sponsDfeLocUsZip = sponsDfeLocUsZip;
  }

  public String getSponsDfeLocForeignAddress1() {
    return sponsDfeLocForeignAddress1;
  }

  public void setSponsDfeLocForeignAddress1(String sponsDfeLocForeignAddress1) {
    this.sponsDfeLocForeignAddress1 = sponsDfeLocForeignAddress1;
  }

  public String getSponsDfeLocForeignAddress2() {
    return sponsDfeLocForeignAddress2;
  }

  public void setSponsDfeLocForeignAddress2(String sponsDfeLocForeignAddress2) {
    this.sponsDfeLocForeignAddress2 = sponsDfeLocForeignAddress2;
  }

  public String getSponsDfeLocForeignCity() {
    return sponsDfeLocForeignCity;
  }

  public void setSponsDfeLocForeignCity(String sponsDfeLocForeignCity) {
    this.sponsDfeLocForeignCity = sponsDfeLocForeignCity;
  }

  public String getSponsDfeLocForgnProvSt() {
    return sponsDfeLocForgnProvSt;
  }

  public void setSponsDfeLocForgnProvSt(String sponsDfeLocForgnProvSt) {
    this.sponsDfeLocForgnProvSt = sponsDfeLocForgnProvSt;
  }

  public String getSponsDfeLocForeignCntry() {
    return sponsDfeLocForeignCntry;
  }

  public void setSponsDfeLocForeignCntry(String sponsDfeLocForeignCntry) {
    this.sponsDfeLocForeignCntry = sponsDfeLocForeignCntry;
  }

  public String getSponsDfeLocForgnPostalCd() {
    return sponsDfeLocForgnPostalCd;
  }

  public void setSponsDfeLocForgnPostalCd(String sponsDfeLocForgnPostalCd) {
    this.sponsDfeLocForgnPostalCd = sponsDfeLocForgnPostalCd;
  }

  public String getSponsDfeEin() {
    return sponsDfeEin;
  }

  public void setSponsDfeEin(String sponsDfeEin) {
    this.sponsDfeEin = sponsDfeEin;
  }

  public String getSponsDfePhoneNum() {
    return sponsDfePhoneNum;
  }

  public void setSponsDfePhoneNum(String sponsDfePhoneNum) {
    this.sponsDfePhoneNum = sponsDfePhoneNum;
  }

  public String getBusinessCode() {
    return businessCode;
  }

  public void setBusinessCode(String businessCode) {
    this.businessCode = businessCode;
  }

  public String getAdminName() {
    return adminName;
  }

  public void setAdminName(String adminName) {
    this.adminName = adminName;
  }

  public String getAdminCareOfName() {
    return adminCareOfName;
  }

  public void setAdminCareOfName(String adminCareOfName) {
    this.adminCareOfName = adminCareOfName;
  }

  public String getAdminUsAddress1() {
    return adminUsAddress1;
  }

  public void setAdminUsAddress1(String adminUsAddress1) {
    this.adminUsAddress1 = adminUsAddress1;
  }

  public String getAdminUsAddress2() {
    return adminUsAddress2;
  }

  public void setAdminUsAddress2(String adminUsAddress2) {
    this.adminUsAddress2 = adminUsAddress2;
  }

  public String getAdminUsCity() {
    return adminUsCity;
  }

  public void setAdminUsCity(String adminUsCity) {
    this.adminUsCity = adminUsCity;
  }

  public String getAdminUsState() {
    return adminUsState;
  }

  public void setAdminUsState(String adminUsState) {
    this.adminUsState = adminUsState;
  }

  public String getAdminForeignAdress1() {
    return adminForeignAdress1;
  }

  public void setAdminForeignAdress1(String adminForeignAdress1) {
    this.adminForeignAdress1 = adminForeignAdress1;
  }

  public String getAdminForeignAdress2() {
    return adminForeignAdress2;
  }

  public void setAdminForeignAdress2(String adminForeignAdress2) {
    this.adminForeignAdress2 = adminForeignAdress2;
  }

  public String getAdminForeignCity() {
    return adminForeignCity;
  }

  public void setAdminForeignCity(String adminForeignCity) {
    this.adminForeignCity = adminForeignCity;
  }

  public String getAdminForeignProvState() {
    return adminForeignProvState;
  }

  public void setAdminForeignProvState(String adminForeignProvState) {
    this.adminForeignProvState = adminForeignProvState;
  }

  public String getAdminForeignCntry() {
    return adminForeignCntry;
  }

  public void setAdminForeignCntry(String adminForeignCntry) {
    this.adminForeignCntry = adminForeignCntry;
  }

  public String getAdminForeignPostalCd() {
    return adminForeignPostalCd;
  }

  public void setAdminForeignPostalCd(String adminForeignPostalCd) {
    this.adminForeignPostalCd = adminForeignPostalCd;
  }

  public String getAdminEim() {
    return adminEim;
  }

  public void setAdminEim(String adminEim) {
    this.adminEim = adminEim;
  }

  public String getAdminPhoneNum() {
    return adminPhoneNum;
  }

  public void setAdminPhoneNum(String adminPhoneNum) {
    this.adminPhoneNum = adminPhoneNum;
  }

  public String getLastRptSponsName() {
    return lastRptSponsName;
  }

  public void setLastRptSponsName(String lastRptSponsName) {
    this.lastRptSponsName = lastRptSponsName;
  }

  public String getLastRptSponsEin() {
    return lastRptSponsEin;
  }

  public void setLastRptSponsEin(String lastRptSponsEin) {
    this.lastRptSponsEin = lastRptSponsEin;
  }

  public String getLastRptPlanNum() {
    return lastRptPlanNum;
  }

  public void setLastRptPlanNum(String lastRptPlanNum) {
    this.lastRptPlanNum = lastRptPlanNum;
  }

  public Date getAdminSignedDate() {
    return adminSignedDate;
  }

  public void setAdminSignedDate(Date adminSignedDate) {
    this.adminSignedDate = adminSignedDate;
  }

  public String getAdminSignedName() {
    return adminSignedName;
  }

  public void setAdminSignedName(String adminSignedName) {
    this.adminSignedName = adminSignedName;
  }

  public String getSponsSignedDate() {
    return sponsSignedDate;
  }

  public void setSponsSignedDate(String sponsSignedDate) {
    this.sponsSignedDate = sponsSignedDate;
  }

  public String getSponsSignedName() {
    return sponsSignedName;
  }

  public void setSponsSignedName(String sponsSignedName) {
    this.sponsSignedName = sponsSignedName;
  }

  public String getDfeSignedDate() {
    return dfeSignedDate;
  }

  public void setDfeSignedDate(String dfeSignedDate) {
    this.dfeSignedDate = dfeSignedDate;
  }

  public String getDfeSignedName() {
    return dfeSignedName;
  }

  public void setDfeSignedName(String dfeSignedName) {
    this.dfeSignedName = dfeSignedName;
  }

  public String getTotPartcpBoyCnt() {
    return totPartcpBoyCnt;
  }

  public void setTotPartcpBoyCnt(String totPartcpBoyCnt) {
    this.totPartcpBoyCnt = totPartcpBoyCnt;
  }

  public String getTotActivePartcpCnt() {
    return totActivePartcpCnt;
  }

  public void setTotActivePartcpCnt(String totActivePartcpCnt) {
    this.totActivePartcpCnt = totActivePartcpCnt;
  }

  public String getRtdSepPartcpRcvgCnt() {
    return rtdSepPartcpRcvgCnt;
  }

  public void setRtdSepPartcpRcvgCnt(String rtdSepPartcpRcvgCnt) {
    this.rtdSepPartcpRcvgCnt = rtdSepPartcpRcvgCnt;
  }

  public String getSubtlActRtdSepCnt() {
    return subtlActRtdSepCnt;
  }

  public void setSubtlActRtdSepCnt(String subtlActRtdSepCnt) {
    this.subtlActRtdSepCnt = subtlActRtdSepCnt;
  }

  public String getBenefRcvgBnftCnt() {
    return benefRcvgBnftCnt;
  }

  public void setBenefRcvgBnftCnt(String benefRcvgBnftCnt) {
    this.benefRcvgBnftCnt = benefRcvgBnftCnt;
  }

  public String getTotActRtdSepBenefCnt() {
    return totActRtdSepBenefCnt;
  }

  public void setTotActRtdSepBenefCnt(String totActRtdSepBenefCnt) {
    this.totActRtdSepBenefCnt = totActRtdSepBenefCnt;
  }

  public String getPartcpAccountBalCnt() {
    return partcpAccountBalCnt;
  }

  public void setPartcpAccountBalCnt(String partcpAccountBalCnt) {
    this.partcpAccountBalCnt = partcpAccountBalCnt;
  }

  public String getSepPartcpPartlVstdCnt() {
    return sepPartcpPartlVstdCnt;
  }

  public void setSepPartcpPartlVstdCnt(String sepPartcpPartlVstdCnt) {
    this.sepPartcpPartlVstdCnt = sepPartcpPartlVstdCnt;
  }

  public String getFundingSec412Ind() {
    return fundingSec412Ind;
  }

  public void setFundingSec412Ind(String fundingSec412Ind) {
    this.fundingSec412Ind = fundingSec412Ind;
  }

  public String getContribEmplrsCnt() {
    return contribEmplrsCnt;
  }

  public void setContribEmplrsCnt(String contribEmplrsCnt) {
    this.contribEmplrsCnt = contribEmplrsCnt;
  }

  public String getTypePensionBnftCode() {
    return typePensionBnftCode;
  }

  public void setTypePensionBnftCode(String typePensionBnftCode) {
    this.typePensionBnftCode = typePensionBnftCode;
  }

  public String getTypeWelfareBnftCode() {
    return typeWelfareBnftCode;
  }

  public void setTypeWelfareBnftCode(String typeWelfareBnftCode) {
    this.typeWelfareBnftCode = typeWelfareBnftCode;
  }

  public String getFundingInsuranceInd() {
    return fundingInsuranceInd;
  }

  public void setFundingInsuranceInd(String fundingInsuranceInd) {
    this.fundingInsuranceInd = fundingInsuranceInd;
  }

  public String getFundingTrustInd() {
    return fundingTrustInd;
  }

  public void setFundingTrustInd(String fundingTrustInd) {
    this.fundingTrustInd = fundingTrustInd;
  }

  public String getFundingGenAssetInd() {
    return fundingGenAssetInd;
  }

  public void setFundingGenAssetInd(String fundingGenAssetInd) {
    this.fundingGenAssetInd = fundingGenAssetInd;
  }

  public String getBenefitInsuranceInd() {
    return benefitInsuranceInd;
  }

  public void setBenefitInsuranceInd(String benefitInsuranceInd) {
    this.benefitInsuranceInd = benefitInsuranceInd;
  }

  public String getBenefitSec412Ind() {
    return benefitSec412Ind;
  }

  public void setBenefitSec412Ind(String benefitSec412Ind) {
    this.benefitSec412Ind = benefitSec412Ind;
  }

  public String getBenefitTrustInd() {
    return benefitTrustInd;
  }

  public void setBenefitTrustInd(String benefitTrustInd) {
    this.benefitTrustInd = benefitTrustInd;
  }

  public String getBenefitGenAssetInd() {
    return benefitGenAssetInd;
  }

  public void setBenefitGenAssetInd(String benefitGenAssetInd) {
    this.benefitGenAssetInd = benefitGenAssetInd;
  }

  public String getSchRAttachedInd() {
    return schRAttachedInd;
  }

  public void setSchRAttachedInd(String schRAttachedInd) {
    this.schRAttachedInd = schRAttachedInd;
  }

  public String getSchMbAttachedInd() {
    return schMbAttachedInd;
  }

  public void setSchMbAttachedInd(String schMbAttachedInd) {
    this.schMbAttachedInd = schMbAttachedInd;
  }

  public String getSchSbAttachedInd() {
    return schSbAttachedInd;
  }

  public void setSchSbAttachedInd(String schSbAttachedInd) {
    this.schSbAttachedInd = schSbAttachedInd;
  }

  public String getSchHAttachedInd() {
    return schHAttachedInd;
  }

  public void setSchHAttachedInd(String schHAttachedInd) {
    this.schHAttachedInd = schHAttachedInd;
  }

  public String getSchIAttachedInd() {
    return schIAttachedInd;
  }

  public void setSchIAttachedInd(String schIAttachedInd) {
    this.schIAttachedInd = schIAttachedInd;
  }

  public String getSchAAttachedInd() {
    return schAAttachedInd;
  }

  public void setSchAAttachedInd(String schAAttachedInd) {
    this.schAAttachedInd = schAAttachedInd;
  }

  public String getNumSchAAttachedCnt() {
    return numSchAAttachedCnt;
  }

  public void setNumSchAAttachedCnt(String numSchAAttachedCnt) {
    this.numSchAAttachedCnt = numSchAAttachedCnt;
  }

  public String getSchCAttachedInd() {
    return schCAttachedInd;
  }

  public void setSchCAttachedInd(String schCAttachedInd) {
    this.schCAttachedInd = schCAttachedInd;
  }

  public String getSchDAttachedInd() {
    return schDAttachedInd;
  }

  public void setSchDAttachedInd(String schDAttachedInd) {
    this.schDAttachedInd = schDAttachedInd;
  }

  public String getSchGAttachedInd() {
    return schGAttachedInd;
  }

  public void setSchGAttachedInd(String schGAttachedInd) {
    this.schGAttachedInd = schGAttachedInd;
  }

  public String getFilingStatus() {
    return filingStatus;
  }

  public void setFilingStatus(String filingStatus) {
    this.filingStatus = filingStatus;
  }

  public String getDateReceived() {
    return dateReceived;
  }

  public void setDateReceived(String dateReceived) {
    this.dateReceived = dateReceived;
  }

  public String getValidAdminSignature() {
    return validAdminSignature;
  }

  public void setValidAdminSignature(String validAdminSignature) {
    this.validAdminSignature = validAdminSignature;
  }

  public String getValidDfeSignature() {
    return validDfeSignature;
  }

  public void setValidDfeSignature(String validDfeSignature) {
    this.validDfeSignature = validDfeSignature;
  }

  public String getValidSponsorSignature() {
    return validSponsorSignature;
  }

  public void setValidSponsorSignature(String validSponsorSignature) {
    this.validSponsorSignature = validSponsorSignature;
  }

  public String getAdminPhoneNumForeign() {
    return adminPhoneNumForeign;
  }

  public void setAdminPhoneNumForeign(String adminPhoneNumForeign) {
    this.adminPhoneNumForeign = adminPhoneNumForeign;
  }

  public String getSponsDfePhoneNumForeign() {
    return sponsDfePhoneNumForeign;
  }

  public void setSponsDfePhoneNumForeign(String sponsDfePhoneNumForeign) {
    this.sponsDfePhoneNumForeign = sponsDfePhoneNumForeign;
  }

  public String getAdminNameSameSponInd() {
    return adminNameSameSponInd;
  }

  public void setAdminNameSameSponInd(String adminNameSameSponInd) {
    this.adminNameSameSponInd = adminNameSameSponInd;
  }

  public String getAdminAddressSameSponInd() {
    return adminAddressSameSponInd;
  }

  public void setAdminAddressSameSponInd(String adminAddressSameSponInd) {
    this.adminAddressSameSponInd = adminAddressSameSponInd;
  }

  public String getPreparerName() {
    return preparerName;
  }

  public void setPreparerName(String preparerName) {
    this.preparerName = preparerName;
  }

  public String getPreparerFirmName() {
    return preparerFirmName;
  }

  public void setPreparerFirmName(String preparerFirmName) {
    this.preparerFirmName = preparerFirmName;
  }

  public String getPreparerUsAddress1() {
    return preparerUsAddress1;
  }

  public void setPreparerUsAddress1(String preparerUsAddress1) {
    this.preparerUsAddress1 = preparerUsAddress1;
  }

  public String getPreparerUsAddress2() {
    return preparerUsAddress2;
  }

  public void setPreparerUsAddress2(String preparerUsAddress2) {
    this.preparerUsAddress2 = preparerUsAddress2;
  }

  public String getPreparerUsCity() {
    return preparerUsCity;
  }

  public void setPreparerUsCity(String preparerUsCity) {
    this.preparerUsCity = preparerUsCity;
  }

  public String getPreparerUsState() {
    return preparerUsState;
  }

  public void setPreparerUsState(String preparerUsState) {
    this.preparerUsState = preparerUsState;
  }

  public String getPreparerUsZip() {
    return preparerUsZip;
  }

  public void setPreparerUsZip(String preparerUsZip) {
    this.preparerUsZip = preparerUsZip;
  }

  public String getPreparerForeignAddress1() {
    return preparerForeignAddress1;
  }

  public void setPreparerForeignAddress1(String preparerForeignAddress1) {
    this.preparerForeignAddress1 = preparerForeignAddress1;
  }

  public String getPreparerForeignAddress2() {
    return preparerForeignAddress2;
  }

  public void setPreparerForeignAddress2(String preparerForeignAddress2) {
    this.preparerForeignAddress2 = preparerForeignAddress2;
  }

  public String getPreparerForeignCity() {
    return preparerForeignCity;
  }

  public void setPreparerForeignCity(String preparerForeignCity) {
    this.preparerForeignCity = preparerForeignCity;
  }

  public String getPreparerForeignProvState() {
    return preparerForeignProvState;
  }

  public void setPreparerForeignProvState(String preparerForeignProvState) {
    this.preparerForeignProvState = preparerForeignProvState;
  }

  public String getPreparerForeignCntry() {
    return preparerForeignCntry;
  }

  public void setPreparerForeignCntry(String preparerForeignCntry) {
    this.preparerForeignCntry = preparerForeignCntry;
  }

  public String getPreparerForeignPostalCd() {
    return preparerForeignPostalCd;
  }

  public void setPreparerForeignPostalCd(String preparerForeignPostalCd) {
    this.preparerForeignPostalCd = preparerForeignPostalCd;
  }

  public String getPreparerPhoneNum() {
    return preparerPhoneNum;
  }

  public void setPreparerPhoneNum(String preparerPhoneNum) {
    this.preparerPhoneNum = preparerPhoneNum;
  }

  public String getPreparerPhoneNumForeign() {
    return preparerPhoneNumForeign;
  }

  public void setPreparerPhoneNumForeign(String preparerPhoneNumForeign) {
    this.preparerPhoneNumForeign = preparerPhoneNumForeign;
  }

  public String getTotActPartcpBoyCnt() {
    return totActPartcpBoyCnt;
  }

  public void setTotActPartcpBoyCnt(String totActPartcpBoyCnt) {
    this.totActPartcpBoyCnt = totActPartcpBoyCnt;
  }

  public String getSubjM1FilingReqInd() {
    return subjM1FilingReqInd;
  }

  public void setSubjM1FilingReqInd(String subjM1FilingReqInd) {
    this.subjM1FilingReqInd = subjM1FilingReqInd;
  }

  public String getComplianceM1FilingReqInd() {
    return complianceM1FilingReqInd;
  }

  public void setComplianceM1FilingReqInd(String complianceM1FilingReqInd) {
    this.complianceM1FilingReqInd = complianceM1FilingReqInd;
  }

  public String getM1ReceiptConfirmationCode() {
    return m1ReceiptConfirmationCode;
  }

  public void setM1ReceiptConfirmationCode(String m1ReceiptConfirmationCode) {
    this.m1ReceiptConfirmationCode = m1ReceiptConfirmationCode;
  }

  public String getAdminManualSignedDate() {
    return adminManualSignedDate;
  }

  public void setAdminManualSignedDate(String adminManualSignedDate) {
    this.adminManualSignedDate = adminManualSignedDate;
  }

  public String getAdminManualSignedName() {
    return adminManualSignedName;
  }

  public void setAdminManualSignedName(String adminManualSignedName) {
    this.adminManualSignedName = adminManualSignedName;
  }

  public String getLastRPTPlanName() {
    return lastRPTPlanName;
  }

  public void setLastRPTPlanName(String lastRPTPlanName) {
    this.lastRPTPlanName = lastRPTPlanName;
  }

  public String getSponsManualSignedDate() {
    return sponsManualSignedDate;
  }

  public void setSponsManualSignedDate(String sponsManualSignedDate) {
    this.sponsManualSignedDate = sponsManualSignedDate;
  }

  public String getSponsManualSignedName() {
    return sponsManualSignedName;
  }

  public void setSponsManualSignedName(String sponsManualSignedName) {
    this.sponsManualSignedName = sponsManualSignedName;
  }

  public String getDfeManualSignedDate() {
    return dfeManualSignedDate;
  }

  public void setDfeManualSignedDate(String dfeManualSignedDate) {
    this.dfeManualSignedDate = dfeManualSignedDate;
  }

  public String getDfeManualsignedName() {
    return dfeManualsignedName;
  }

  public void setDfeManualsignedName(String dfeManualsignedName) {
    this.dfeManualsignedName = dfeManualsignedName;
  }

}
