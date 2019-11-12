package com.example.aws.elasticsearch.demo.document;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class PersonalCapitalDoc {
  
  //"ACK_ID","FORM_PLAN_YEAR_BEGIN_DATE","FORM_TAX_PRD","TYPE_PLAN_ENTITY_CD","TYPE_DFE_PLAN_ENTITY_CD","INITIAL_FILING_IND","AMENDED_IND","FINAL_FILING_IND","SHORT_PLAN_YR_IND"
    private String ackId;
public String getSponsDfeMailUSAddress1() {
      return sponsDfeMailUSAddress1;
    }
    public void setSponsDfeMailUSAddress1(String sponsDfeMailUSAddress1) {
      this.sponsDfeMailUSAddress1 = sponsDfeMailUSAddress1;
    }
    //    private Date formPlanYearBeginDate;
    private String formTaxPrd;
    private String TYPE_PLAN_ENTITY_CD;
    private String TYPE_DFE_PLAN_ENTITY_CD;
    private String INITIAL_FILING_IND;
    private String AMENDED_IND;
    private String path;
public String getPath() {
      return path;
    }
    public void setPath(String path) {
      this.path = path;
    }
    //    private String finalFilingInd;
//    private String shortPlanYrInd;
//    private String collectiveBargainInd;
//    private String f5558ApplicationFiledInd;
//    private String extAutomaticInd;
//    private String dfvcProgramInd;
//    private String extSpecialInd;
//    private String extSpecialText;
    @JsonProperty("PLAN_NAME")
    private String planName;
  //  private String sponsDfePn;
//    private String planEffDate;
   private String sponsDfeName;
    private String sponsDfeDbaName;
//    private String sponsDfeCareOfName;
    private String sponsDfeMailUSAddress1;
    private String sponsDfeMailUsAddress2;
//    private String sponsDfeMailUsCity;
//    private String sponsDfeMailUsState;
//    private String sponsDfeMailUsZip;
//    private String sponsDfeMailUsForeignAddr1;
//    private String sponsDfeMailUsForeignAddr2;
//    private String sponsDfeMailUsForeignCity;
//    private String sponsDfeMailUsForgnProvSt;
//    private String sponsDfeMailUsForeignCntry;
//    private String sponsDfeMailUsForgnPostalCd;
//    private String sponsDfeLocUsAddr1;
//    private String sponsDfeLocUsAddr2;
//    private String sponsDfeLocUsCity;
//    private String sponsDfeLocUsState;
//    private String sponsDfeLocUsZip;
//    
//    private String sponsDfeLocForeignAddress1;
//    private String sponsDfeLocForeignAddress2;
//    private String sponsDfeLocForeignCity;
//    private String sponsDfeLocForgnProvSt;
//    private String sponsDfeLocForeignCntry;
//    private String sponsDfeLocForgnPostalCd;
//    private String sponsDfeEin;
//    private String sponsDfePhoneNum;
//    private String businessCode;
//    private String adminName;
//    private String adminCareOfName;
//    
//    private String adminUsAddress1;
//    private String adminUsAddress2;
//    private String adminUsCity;
//    private String adminUsState;
//    private String adminForeignAdress1;
//    private String adminForeignAdress2;
//    private String adminForeignCity;
//    private String adminForeignProvState;
//    private String adminForeignCntry;
//    private String adminForeignPostalCd;
//    private String adminEim;
//    private String adminPhoneNum;
//    
//    private String lastRptSponsName;
//    private String lastRptSponsEin;
//    private String lastRptPlanNum;
//    private Date adminSignedDate;
//    public String getAckId() {
//      return ackId;
//    }
//    public void setAckId(String ackId) {
//      this.ackId = ackId;
//    }
//    public Date getFormPlanYearBeginDate() {
//      return formPlanYearBeginDate;
//    }
//    public void setFormPlanYearBeginDate(Date formPlanYearBeginDate) {
//      this.formPlanYearBeginDate = formPlanYearBeginDate;
//    }
//    public String getFormTaxPrd() {
//      return FormTaxPrd;
//    }
//    public void setFormTaxPrd(String formTaxPrd) {
//      FormTaxPrd = formTaxPrd;
//    }
//    public String getTpePlanEntityCd() {
//      return tpePlanEntityCd;
//    }
//    public void setTpePlanEntityCd(String tpePlanEntityCd) {
//      this.tpePlanEntityCd = tpePlanEntityCd;
//    }
//    public String getTypeDfePlanEntityCd() {
//      return typeDfePlanEntityCd;
//    }
//    public void setTypeDfePlanEntityCd(String typeDfePlanEntityCd) {
//      this.typeDfePlanEntityCd = typeDfePlanEntityCd;
//    }
//    public String getInitialFilingInd() {
//      return InitialFilingInd;
//    }
//    public void setInitialFilingInd(String initialFilingInd) {
//      InitialFilingInd = initialFilingInd;
//    }
//    public String getAmendedInd() {
//      return amendedInd;
//    }
//    public void setAmendedInd(String amendedInd) {
//      this.amendedInd = amendedInd;
//    }
//    public String getFinalFilingInd() {
//      return finalFilingInd;
//    }
//    public void setFinalFilingInd(String finalFilingInd) {
//      this.finalFilingInd = finalFilingInd;
//    }
//    public String getShortPlanYrInd() {
//      return shortPlanYrInd;
//    }
//    public void setShortPlanYrInd(String shortPlanYrInd) {
//      this.shortPlanYrInd = shortPlanYrInd;
//    }
//
//    public String getCollectiveBargainInd() {
//      return collectiveBargainInd;
//    }
//    public void setCollectiveBargainInd(String collectiveBargainInd) {
//      this.collectiveBargainInd = collectiveBargainInd;
//    }
//    public String getF5558ApplicationFiledInd() {
//      return f5558ApplicationFiledInd;
//    }
//    public void setF5558ApplicationFiledInd(String f5558ApplicationFiledInd) {
//      this.f5558ApplicationFiledInd = f5558ApplicationFiledInd;
//    }
//    public String getExtAutomaticInd() {
//      return extAutomaticInd;
//    }
//    public void setExtAutomaticInd(String extAutomaticInd) {
//      this.extAutomaticInd = extAutomaticInd;
//    }
//    public String getDfvcProgramInd() {
//      return dfvcProgramInd;
//    }
//    public void setDfvcProgramInd(String dfvcProgramInd) {
//      this.dfvcProgramInd = dfvcProgramInd;
//    }
//    public String getExtSpecialInd() {
//      return extSpecialInd;
//    }
//    public void setExtSpecialInd(String extSpecialInd) {
//      this.extSpecialInd = extSpecialInd;
//    }
//    public String getExtSpecialText() {
//      return extSpecialText;
//    }
//    public void setExtSpecialText(String extSpecialText) {
//      this.extSpecialText = extSpecialText;
//    }
//    public String getPlanName() {
//      return planName;
//    }
//    public void setPlanName(String planName) {
//      this.planName = planName;
//    }
//    public String getSponsDfePn() {
//      return sponsDfePn;
//    }
//    public void setSponsDfePn(String sponsDfePn) {
//      this.sponsDfePn = sponsDfePn;
//    }
//    public String getPlanEffDate() {
//      return planEffDate;
//    }
//    public void setPlanEffDate(String planEffDate) {
//      this.planEffDate = planEffDate;
//    }
//    public String getSponsDfeName() {
//      return sponsDfeName;
//    }
//    public void setSponsDfeName(String sponsDfeName) {
//      this.sponsDfeName = sponsDfeName;
//    }
//    public String getSponsDfeDbaName() {
//      return sponsDfeDbaName;
//    }
//    public void setSponsDfeDbaName(String sponsDfeDbaName) {
//      this.sponsDfeDbaName = sponsDfeDbaName;
//    }
//    public String getSponsDfeCareOfName() {
//      return sponsDfeCareOfName;
//    }
//    public void setSponsDfeCareOfName(String sponsDfeCareOfName) {
//      this.sponsDfeCareOfName = sponsDfeCareOfName;
//    }
//    public String getSponsDfeMailUsAddress1() {
//      return sponsDfeMailUsAddress1;
//    }
//    public void setSponsDfeMailUsAddress1(String sponsDfeMailUsAddress1) {
//      this.sponsDfeMailUsAddress1 = sponsDfeMailUsAddress1;
//    }
//    public String getSponsDfeMailUsAddress2() {
//      return sponsDfeMailUsAddress2;
//    }
//    public void setSponsDfeMailUsAddress2(String sponsDfeMailUsAddress2) {
//      this.sponsDfeMailUsAddress2 = sponsDfeMailUsAddress2;
//    }
//    public String getSponsDfeMailUsCity() {
//      return sponsDfeMailUsCity;
//    }
//    public void setSponsDfeMailUsCity(String sponsDfeMailUsCity) {
//      this.sponsDfeMailUsCity = sponsDfeMailUsCity;
//    }
//    public String getSponsDfeMailUsState() {
//      return sponsDfeMailUsState;
//    }
//    public void setSponsDfeMailUsState(String sponsDfeMailUsState) {
//      this.sponsDfeMailUsState = sponsDfeMailUsState;
//    }
//    public String getSponsDfeMailUsZip() {
//      return sponsDfeMailUsZip;
//    }
//    public void setSponsDfeMailUsZip(String sponsDfeMailUsZip) {
//      this.sponsDfeMailUsZip = sponsDfeMailUsZip;
//    }
//    public String getSponsDfeMailUsForeignAddr1() {
//      return sponsDfeMailUsForeignAddr1;
//    }
//    public void setSponsDfeMailUsForeignAddr1(String sponsDfeMailUsForeignAddr1) {
//      this.sponsDfeMailUsForeignAddr1 = sponsDfeMailUsForeignAddr1;
//    }
//    public String getSponsDfeMailUsForeignAddr2() {
//      return sponsDfeMailUsForeignAddr2;
//    }
//    public void setSponsDfeMailUsForeignAddr2(String sponsDfeMailUsForeignAddr2) {
//      this.sponsDfeMailUsForeignAddr2 = sponsDfeMailUsForeignAddr2;
//    }
//    public String getSponsDfeMailUsForeignCity() {
//      return sponsDfeMailUsForeignCity;
//    }
//    public void setSponsDfeMailUsForeignCity(String sponsDfeMailUsForeignCity) {
//      this.sponsDfeMailUsForeignCity = sponsDfeMailUsForeignCity;
//    }
//    public String getSponsDfeMailUsForgnProvSt() {
//      return sponsDfeMailUsForgnProvSt;
//    }
//    public void setSponsDfeMailUsForgnProvSt(String sponsDfeMailUsForgnProvSt) {
//      this.sponsDfeMailUsForgnProvSt = sponsDfeMailUsForgnProvSt;
//    }
//    public String getSponsDfeMailUsForeignCntry() {
//      return sponsDfeMailUsForeignCntry;
//    }
//    public void setSponsDfeMailUsForeignCntry(String sponsDfeMailUsForeignCntry) {
//      this.sponsDfeMailUsForeignCntry = sponsDfeMailUsForeignCntry;
//    }
//    public String getSponsDfeMailUsForgnPostalCd() {
//      return sponsDfeMailUsForgnPostalCd;
//    }
//    public void setSponsDfeMailUsForgnPostalCd(String sponsDfeMailUsForgnPostalCd) {
//      this.sponsDfeMailUsForgnPostalCd = sponsDfeMailUsForgnPostalCd;
//    }
//    public String getSponsDfeLocUsAddr1() {
//      return sponsDfeLocUsAddr1;
//    }
//    public void setSponsDfeLocUsAddr1(String sponsDfeLocUsAddr1) {
//      this.sponsDfeLocUsAddr1 = sponsDfeLocUsAddr1;
//    }
//    public String getSponsDfeLocUsAddr2() {
//      return sponsDfeLocUsAddr2;
//    }
//    public void setSponsDfeLocUsAddr2(String sponsDfeLocUsAddr2) {
//      this.sponsDfeLocUsAddr2 = sponsDfeLocUsAddr2;
//    }
//    public String getSponsDfeLocUsCity() {
//      return sponsDfeLocUsCity;
//    }
//    public void setSponsDfeLocUsCity(String sponsDfeLocUsCity) {
//      this.sponsDfeLocUsCity = sponsDfeLocUsCity;
//    }
//    public String getSponsDfeLocUsState() {
//      return sponsDfeLocUsState;
//    }
//    public void setSponsDfeLocUsState(String sponsDfeLocUsState) {
//      this.sponsDfeLocUsState = sponsDfeLocUsState;
//    }
//    public String getSponsDfeLocUsZip() {
//      return sponsDfeLocUsZip;
//    }
//    public void setSponsDfeLocUsZip(String sponsDfeLocUsZip) {
//      this.sponsDfeLocUsZip = sponsDfeLocUsZip;
//    }
//    public String getSponsDfeLocForeignAddress1() {
//      return sponsDfeLocForeignAddress1;
//    }
//    public void setSponsDfeLocForeignAddress1(String sponsDfeLocForeignAddress1) {
//      this.sponsDfeLocForeignAddress1 = sponsDfeLocForeignAddress1;
//    }
//    public String getSponsDfeLocForeignAddress2() {
//      return sponsDfeLocForeignAddress2;
//    }
//    public void setSponsDfeLocForeignAddress2(String sponsDfeLocForeignAddress2) {
//      this.sponsDfeLocForeignAddress2 = sponsDfeLocForeignAddress2;
//    }
//    public String getSponsDfeLocForeignCity() {
//      return sponsDfeLocForeignCity;
//    }
//    public void setSponsDfeLocForeignCity(String sponsDfeLocForeignCity) {
//      this.sponsDfeLocForeignCity = sponsDfeLocForeignCity;
//    }
//    public String getSponsDfeLocForgnProvSt() {
//      return sponsDfeLocForgnProvSt;
//    }
//    public void setSponsDfeLocForgnProvSt(String sponsDfeLocForgnProvSt) {
//      this.sponsDfeLocForgnProvSt = sponsDfeLocForgnProvSt;
//    }
//    public String getSponsDfeLocForeignCntry() {
//      return sponsDfeLocForeignCntry;
//    }
//    public void setSponsDfeLocForeignCntry(String sponsDfeLocForeignCntry) {
//      this.sponsDfeLocForeignCntry = sponsDfeLocForeignCntry;
//    }
//    public String getSponsDfeLocForgnPostalCd() {
//      return sponsDfeLocForgnPostalCd;
//    }
//    public void setSponsDfeLocForgnPostalCd(String sponsDfeLocForgnPostalCd) {
//      this.sponsDfeLocForgnPostalCd = sponsDfeLocForgnPostalCd;
//    }
//    public String getSponsDfeEin() {
//      return sponsDfeEin;
//    }
//    public void setSponsDfeEin(String sponsDfeEin) {
//      this.sponsDfeEin = sponsDfeEin;
//    }
//    public String getSponsDfePhoneNum() {
//      return sponsDfePhoneNum;
//    }
//    public void setSponsDfePhoneNum(String sponsDfePhoneNum) {
//      this.sponsDfePhoneNum = sponsDfePhoneNum;
//    }
//    public String getBusinessCode() {
//      return businessCode;
//    }
//    public void setBusinessCode(String businessCode) {
//      this.businessCode = businessCode;
//    }
//    public String getAdminName() {
//      return adminName;
//    }
//    public void setAdminName(String adminName) {
//      this.adminName = adminName;
//    }
//    public String getAdminCareOfName() {
//      return adminCareOfName;
//    }
//    public void setAdminCareOfName(String adminCareOfName) {
//      this.adminCareOfName = adminCareOfName;
//    }
//    public String getAdminUsAddress1() {
//      return adminUsAddress1;
//    }
//    public void setAdminUsAddress1(String adminUsAddress1) {
//      this.adminUsAddress1 = adminUsAddress1;
//    }
//    public String getAdminUsAddress2() {
//      return adminUsAddress2;
//    }
//    public void setAdminUsAddress2(String adminUsAddress2) {
//      this.adminUsAddress2 = adminUsAddress2;
//    }
//    public String getAdminUsCity() {
//      return adminUsCity;
//    }
//    public void setAdminUsCity(String adminUsCity) {
//      this.adminUsCity = adminUsCity;
//    }
//    public String getAdminUsState() {
//      return adminUsState;
//    }
//    public void setAdminUsState(String adminUsState) {
//      this.adminUsState = adminUsState;
//    }
//    public String getAdminForeignAdress1() {
//      return adminForeignAdress1;
//    }
//    public void setAdminForeignAdress1(String adminForeignAdress1) {
//      this.adminForeignAdress1 = adminForeignAdress1;
//    }
//    public String getAdminForeignAdress2() {
//      return adminForeignAdress2;
//    }
//    public void setAdminForeignAdress2(String adminForeignAdress2) {
//      this.adminForeignAdress2 = adminForeignAdress2;
//    }
//    public String getAdminForeignCity() {
//      return adminForeignCity;
//    }
//    public void setAdminForeignCity(String adminForeignCity) {
//      this.adminForeignCity = adminForeignCity;
//    }
//    public String getAdminForeignProvState() {
//      return adminForeignProvState;
//    }
//    public void setAdminForeignProvState(String adminForeignProvState) {
//      this.adminForeignProvState = adminForeignProvState;
//    }
//    public String getAdminForeignCntry() {
//      return adminForeignCntry;
//    }
//    public void setAdminForeignCntry(String adminForeignCntry) {
//      this.adminForeignCntry = adminForeignCntry;
//    }
//    public String getAdminForeignPostalCd() {
//      return adminForeignPostalCd;
//    }
//    public void setAdminForeignPostalCd(String adminForeignPostalCd) {
//      this.adminForeignPostalCd = adminForeignPostalCd;
//    }
//    public String getAdminEim() {
//      return adminEim;
//    }
//    public void setAdminEim(String adminEim) {
//      this.adminEim = adminEim;
//    }
//    public String getAdminPhoneNum() {
//      return adminPhoneNum;
//    }
//    public void setAdminPhoneNum(String adminPhoneNum) {
//      this.adminPhoneNum = adminPhoneNum;
//    }
//    public String getLastRptSponsName() {
//      return lastRptSponsName;
//    }
//    public void setLastRptSponsName(String lastRptSponsName) {
//      this.lastRptSponsName = lastRptSponsName;
//    }
//    public String getLastRptSponsEin() {
//      return lastRptSponsEin;
//    }
//    public void setLastRptSponsEin(String lastRptSponsEin) {
//      this.lastRptSponsEin = lastRptSponsEin;
//    }
//    public String getLastRptPlanNum() {
//      return lastRptPlanNum;
//    }
//    public void setLastRptPlanNum(String lastRptPlanNum) {
//      this.lastRptPlanNum = lastRptPlanNum;
//    }
//    public Date getAdminSignedDate() {
//      return adminSignedDate;
//    }
//    public void setAdminSignedDate(Date adminSignedDate) {
//      this.adminSignedDate = adminSignedDate;
//    }
//    public String getAdminSignedName() {
//      return adminSignedName;
//    }
//    public void setAdminSignedName(String adminSignedName) {
//      this.adminSignedName = adminSignedName;
//    }
//    public String getSponsSignedDate() {
//      return sponsSignedDate;
//    }
//    public void setSponsSignedDate(String sponsSignedDate) {
//      this.sponsSignedDate = sponsSignedDate;
//    }
//    public String getSponsSignedName() {
//      return sponsSignedName;
//    }
//    public void setSponsSignedName(String sponsSignedName) {
//      this.sponsSignedName = sponsSignedName;
//    }
//    public String getDfeSignedDate() {
//      return dfeSignedDate;
//    }
//    public void setDfeSignedDate(String dfeSignedDate) {
//      this.dfeSignedDate = dfeSignedDate;
//    }
//    public String getDfeSignedName() {
//      return dfeSignedName;
//    }
//    public void setDfeSignedName(String dfeSignedName) {
//      this.dfeSignedName = dfeSignedName;
//    }
//    public String getTotPartcpBoyCnt() {
//      return totPartcpBoyCnt;
//    }
//    public void setTotPartcpBoyCnt(String totPartcpBoyCnt) {
//      this.totPartcpBoyCnt = totPartcpBoyCnt;
//    }
//    public String getTotActivePartcpCnt() {
//      return totActivePartcpCnt;
//    }
//    public void setTotActivePartcpCnt(String totActivePartcpCnt) {
//      this.totActivePartcpCnt = totActivePartcpCnt;
//    }
//    public String getRtdSepPartcpRcvgCnt() {
//      return rtdSepPartcpRcvgCnt;
//    }
//    public void setRtdSepPartcpRcvgCnt(String rtdSepPartcpRcvgCnt) {
//      this.rtdSepPartcpRcvgCnt = rtdSepPartcpRcvgCnt;
//    }
//    public String getSubtlActRtdSepCnt() {
//      return subtlActRtdSepCnt;
//    }
//    public void setSubtlActRtdSepCnt(String subtlActRtdSepCnt) {
//      this.subtlActRtdSepCnt = subtlActRtdSepCnt;
//    }
//    public String getBenefRcvgBnftCnt() {
//      return benefRcvgBnftCnt;
//    }
//    public void setBenefRcvgBnftCnt(String benefRcvgBnftCnt) {
//      this.benefRcvgBnftCnt = benefRcvgBnftCnt;
//    }
//    public String getTotActRtdSepBenefCnt() {
//      return totActRtdSepBenefCnt;
//    }
//    public void setTotActRtdSepBenefCnt(String totActRtdSepBenefCnt) {
//      this.totActRtdSepBenefCnt = totActRtdSepBenefCnt;
//    }
//    public String getPartcpAccountBalCnt() {
//      return partcpAccountBalCnt;
//    }
//    public void setPartcpAccountBalCnt(String partcpAccountBalCnt) {
//      this.partcpAccountBalCnt = partcpAccountBalCnt;
//    }
//    public String getSepPartcpPartlVstdCnt() {
//      return sepPartcpPartlVstdCnt;
//    }
//    public void setSepPartcpPartlVstdCnt(String sepPartcpPartlVstdCnt) {
//      this.sepPartcpPartlVstdCnt = sepPartcpPartlVstdCnt;
//    }
//    public String getFundingSec412Ind() {
//      return fundingSec412Ind;
//    }
//    public void setFundingSec412Ind(String fundingSec412Ind) {
//      this.fundingSec412Ind = fundingSec412Ind;
//    }
//    public String getContribEmplrsCnt() {
//      return contribEmplrsCnt;
//    }
//    public void setContribEmplrsCnt(String contribEmplrsCnt) {
//      this.contribEmplrsCnt = contribEmplrsCnt;
//    }
//    public String getTypePensionBnftCode() {
//      return typePensionBnftCode;
//    }
//    public void setTypePensionBnftCode(String typePensionBnftCode) {
//      this.typePensionBnftCode = typePensionBnftCode;
//    }
//    public String getTypeWelfareBnftCode() {
//      return typeWelfareBnftCode;
//    }
//    public void setTypeWelfareBnftCode(String typeWelfareBnftCode) {
//      this.typeWelfareBnftCode = typeWelfareBnftCode;
//    }
//    public String getFundingInsuranceInd() {
//      return fundingInsuranceInd;
//    }
//    public void setFundingInsuranceInd(String fundingInsuranceInd) {
//      this.fundingInsuranceInd = fundingInsuranceInd;
//    }
//    public String getFundingTrustInd() {
//      return fundingTrustInd;
//    }
//    public void setFundingTrustInd(String fundingTrustInd) {
//      this.fundingTrustInd = fundingTrustInd;
//    }
//    public String getFundingGenAssetInd() {
//      return fundingGenAssetInd;
//    }
//    public void setFundingGenAssetInd(String fundingGenAssetInd) {
//      this.fundingGenAssetInd = fundingGenAssetInd;
//    }
//    public String getBenefitInsuranceInd() {
//      return benefitInsuranceInd;
//    }
//    public void setBenefitInsuranceInd(String benefitInsuranceInd) {
//      this.benefitInsuranceInd = benefitInsuranceInd;
//    }
//    public String getBenefitSec412Ind() {
//      return benefitSec412Ind;
//    }
//    public void setBenefitSec412Ind(String benefitSec412Ind) {
//      this.benefitSec412Ind = benefitSec412Ind;
//    }
//    public String getBenefitTrustInd() {
//      return benefitTrustInd;
//    }
//    public void setBenefitTrustInd(String benefitTrustInd) {
//      this.benefitTrustInd = benefitTrustInd;
//    }
//    public String getBenefitGenAssetInd() {
//      return benefitGenAssetInd;
//    }
//    public void setBenefitGenAssetInd(String benefitGenAssetInd) {
//      this.benefitGenAssetInd = benefitGenAssetInd;
//    }
//    public String getSchRAttachedInd() {
//      return schRAttachedInd;
//    }
//    public void setSchRAttachedInd(String schRAttachedInd) {
//      this.schRAttachedInd = schRAttachedInd;
//    }
//    public String getSchMbAttachedInd() {
//      return schMbAttachedInd;
//    }
//    public void setSchMbAttachedInd(String schMbAttachedInd) {
//      this.schMbAttachedInd = schMbAttachedInd;
//    }
//    public String getSchSbAttachedInd() {
//      return schSbAttachedInd;
//    }
//    public void setSchSbAttachedInd(String schSbAttachedInd) {
//      this.schSbAttachedInd = schSbAttachedInd;
//    }
//    public String getSchHAttachedInd() {
//      return schHAttachedInd;
//    }
//    public void setSchHAttachedInd(String schHAttachedInd) {
//      this.schHAttachedInd = schHAttachedInd;
//    }
//    public String getSchIAttachedInd() {
//      return schIAttachedInd;
//    }
//    public void setSchIAttachedInd(String schIAttachedInd) {
//      this.schIAttachedInd = schIAttachedInd;
//    }
//    public String getSchAAttachedInd() {
//      return schAAttachedInd;
//    }
//    public void setSchAAttachedInd(String schAAttachedInd) {
//      this.schAAttachedInd = schAAttachedInd;
//    }
//    public String getNumSchAAttachedCnt() {
//      return numSchAAttachedCnt;
//    }
//    public void setNumSchAAttachedCnt(String numSchAAttachedCnt) {
//      this.numSchAAttachedCnt = numSchAAttachedCnt;
//    }
//    public String getSchCAttachedInd() {
//      return schCAttachedInd;
//    }
//    public void setSchCAttachedInd(String schCAttachedInd) {
//      this.schCAttachedInd = schCAttachedInd;
//    }
//    public String getSchDAttachedInd() {
//      return schDAttachedInd;
//    }
//    public void setSchDAttachedInd(String schDAttachedInd) {
//      this.schDAttachedInd = schDAttachedInd;
//    }
//    public String getSchGAttachedInd() {
//      return schGAttachedInd;
//    }
//    public void setSchGAttachedInd(String schGAttachedInd) {
//      this.schGAttachedInd = schGAttachedInd;
//    }
//    public String getFilingStatus() {
//      return filingStatus;
//    }
//    public void setFilingStatus(String filingStatus) {
//      this.filingStatus = filingStatus;
//    }
//    public String getDateReceived() {
//      return dateReceived;
//    }
//    public void setDateReceived(String dateReceived) {
//      this.dateReceived = dateReceived;
//    }
//    public String getValidAdminSignature() {
//      return validAdminSignature;
//    }
//    public void setValidAdminSignature(String validAdminSignature) {
//      this.validAdminSignature = validAdminSignature;
//    }
//    public String getValidDfeSignature() {
//      return validDfeSignature;
//    }
//    public void setValidDfeSignature(String validDfeSignature) {
//      this.validDfeSignature = validDfeSignature;
//    }
//    public String getValidSponsorSignature() {
//      return validSponsorSignature;
//    }
//    public void setValidSponsorSignature(String validSponsorSignature) {
//      this.validSponsorSignature = validSponsorSignature;
//    }
//    public String getAdminPhoneNumForeign() {
//      return adminPhoneNumForeign;
//    }
//    public void setAdminPhoneNumForeign(String adminPhoneNumForeign) {
//      this.adminPhoneNumForeign = adminPhoneNumForeign;
//    }
//    public String getSponsDfePhoneNumForeign() {
//      return sponsDfePhoneNumForeign;
//    }
//    public void setSponsDfePhoneNumForeign(String sponsDfePhoneNumForeign) {
//      this.sponsDfePhoneNumForeign = sponsDfePhoneNumForeign;
//    }
//    public String getAdminNameSameSponInd() {
//      return adminNameSameSponInd;
//    }
//    public void setAdminNameSameSponInd(String adminNameSameSponInd) {
//      this.adminNameSameSponInd = adminNameSameSponInd;
//    }
//    public String getAdminAddressSameSponInd() {
//      return adminAddressSameSponInd;
//    }
//    public void setAdminAddressSameSponInd(String adminAddressSameSponInd) {
//      this.adminAddressSameSponInd = adminAddressSameSponInd;
//    }
//    public String getPreparerName() {
//      return preparerName;
//    }
//    public void setPreparerName(String preparerName) {
//      this.preparerName = preparerName;
//    }
//    public String getPreparerFirmName() {
//      return preparerFirmName;
//    }
//    public void setPreparerFirmName(String preparerFirmName) {
//      this.preparerFirmName = preparerFirmName;
//    }
//    public String getPreparerUsAddress1() {
//      return preparerUsAddress1;
//    }
//    public void setPreparerUsAddress1(String preparerUsAddress1) {
//      this.preparerUsAddress1 = preparerUsAddress1;
//    }
//    public String getPreparerUsAddress2() {
//      return preparerUsAddress2;
//    }
//    public void setPreparerUsAddress2(String preparerUsAddress2) {
//      this.preparerUsAddress2 = preparerUsAddress2;
//    }
//    public String getPreparerUsCity() {
//      return preparerUsCity;
//    }
//    public void setPreparerUsCity(String preparerUsCity) {
//      this.preparerUsCity = preparerUsCity;
//    }
//    public String getPreparerUsState() {
//      return preparerUsState;
//    }
//    public void setPreparerUsState(String preparerUsState) {
//      this.preparerUsState = preparerUsState;
//    }
//    public String getPreparerUsZip() {
//      return preparerUsZip;
//    }
//    public void setPreparerUsZip(String preparerUsZip) {
//      this.preparerUsZip = preparerUsZip;
//    }
//    public String getPreparerForeignAddress1() {
//      return preparerForeignAddress1;
//    }
//    public void setPreparerForeignAddress1(String preparerForeignAddress1) {
//      this.preparerForeignAddress1 = preparerForeignAddress1;
//    }
//    public String getPreparerForeignAddress2() {
//      return preparerForeignAddress2;
//    }
//    public void setPreparerForeignAddress2(String preparerForeignAddress2) {
//      this.preparerForeignAddress2 = preparerForeignAddress2;
//    }
//    public String getPreparerForeignCity() {
//      return preparerForeignCity;
//    }
//    public void setPreparerForeignCity(String preparerForeignCity) {
//      this.preparerForeignCity = preparerForeignCity;
//    }
//    public String getPreparerForeignProvState() {
//      return preparerForeignProvState;
//    }
//    public void setPreparerForeignProvState(String preparerForeignProvState) {
//      this.preparerForeignProvState = preparerForeignProvState;
//    }
//    public String getPreparerForeignCntry() {
//      return preparerForeignCntry;
//    }
//    public void setPreparerForeignCntry(String preparerForeignCntry) {
//      this.preparerForeignCntry = preparerForeignCntry;
//    }
//    public String getPreparerForeignPostalCd() {
//      return preparerForeignPostalCd;
//    }
//    public void setPreparerForeignPostalCd(String preparerForeignPostalCd) {
//      this.preparerForeignPostalCd = preparerForeignPostalCd;
//    }
//    public String getPreparerPhoneNum() {
//      return preparerPhoneNum;
//    }
//    public void setPreparerPhoneNum(String preparerPhoneNum) {
//      this.preparerPhoneNum = preparerPhoneNum;
//    }
//    public String getPreparerPhoneNumForeign() {
//      return preparerPhoneNumForeign;
//    }
//    public void setPreparerPhoneNumForeign(String preparerPhoneNumForeign) {
//      this.preparerPhoneNumForeign = preparerPhoneNumForeign;
//    }
//    public String getTotActPartcpBoyCnt() {
//      return totActPartcpBoyCnt;
//    }
//    public void setTotActPartcpBoyCnt(String totActPartcpBoyCnt) {
//      this.totActPartcpBoyCnt = totActPartcpBoyCnt;
//    }
//    public String getSubjM1FilingReqInd() {
//      return subjM1FilingReqInd;
//    }
//    public void setSubjM1FilingReqInd(String subjM1FilingReqInd) {
//      this.subjM1FilingReqInd = subjM1FilingReqInd;
//    }
//    public String getComplianceM1FilingReqInd() {
//      return complianceM1FilingReqInd;
//    }
//    public void setComplianceM1FilingReqInd(String complianceM1FilingReqInd) {
//      this.complianceM1FilingReqInd = complianceM1FilingReqInd;
//    }
//    public String getM1ReceiptConfirmationCode() {
//      return m1ReceiptConfirmationCode;
//    }
//    public void setM1ReceiptConfirmationCode(String m1ReceiptConfirmationCode) {
//      this.m1ReceiptConfirmationCode = m1ReceiptConfirmationCode;
//    }
//    public String getAdminManualSignedDate() {
//      return adminManualSignedDate;
//    }
//    public void setAdminManualSignedDate(String adminManualSignedDate) {
//      this.adminManualSignedDate = adminManualSignedDate;
//    }
//    public String getAdminManualSignedName() {
//      return adminManualSignedName;
//    }
//    public void setAdminManualSignedName(String adminManualSignedName) {
//      this.adminManualSignedName = adminManualSignedName;
//    }
//    public String getLastRPTPlanName() {
//      return lastRPTPlanName;
//    }
//    public void setLastRPTPlanName(String lastRPTPlanName) {
//      this.lastRPTPlanName = lastRPTPlanName;
//    }
//    public String getSponsManualSignedDate() {
//      return sponsManualSignedDate;
//    }
//    public void setSponsManualSignedDate(String sponsManualSignedDate) {
//      this.sponsManualSignedDate = sponsManualSignedDate;
//    }
//    public String getSponsManualSignedName() {
//      return sponsManualSignedName;
//    }
//    public void setSponsManualSignedName(String sponsManualSignedName) {
//      this.sponsManualSignedName = sponsManualSignedName;
//    }
//    public String getDfeManualSignedDate() {
//      return dfeManualSignedDate;
//    }
//    public void setDfeManualSignedDate(String dfeManualSignedDate) {
//      this.dfeManualSignedDate = dfeManualSignedDate;
//    }
//    public String getDfeManualsignedName() {
//      return dfeManualsignedName;
//    }
//    public void setDfeManualsignedName(String dfeManualsignedName) {
//      this.dfeManualsignedName = dfeManualsignedName;
//    }
//    private String adminSignedName;
//    private String sponsSignedDate;
//    private String sponsSignedName;
//    private String dfeSignedDate;
//    private String dfeSignedName;
//    private String totPartcpBoyCnt;
//    private String totActivePartcpCnt;
//    private String rtdSepPartcpRcvgCnt;
//    private String subtlActRtdSepCnt;
//    private String benefRcvgBnftCnt;
//    private String totActRtdSepBenefCnt;    
//    private String partcpAccountBalCnt;
//    private String sepPartcpPartlVstdCnt;
//    private String fundingSec412Ind;
//    private String contribEmplrsCnt;
//    private String typePensionBnftCode;
//    private String typeWelfareBnftCode;
//    private String fundingInsuranceInd;    
//    private String fundingTrustInd;
//    private String fundingGenAssetInd;
//    private String benefitInsuranceInd;
//    private String benefitSec412Ind;
//    private String benefitTrustInd;
//    private String benefitGenAssetInd;
//    private String schRAttachedInd;    
//    private String schMbAttachedInd;
//    private String schSbAttachedInd;
//    private String schHAttachedInd;
//    private String schIAttachedInd;
//    private String schAAttachedInd;
//    private String numSchAAttachedCnt;
//    private String schCAttachedInd;
//    private String schDAttachedInd;
//    private String schGAttachedInd;
//    private String filingStatus;
//    private String dateReceived;
//    private String validAdminSignature;
//    private String validDfeSignature;
//    private String validSponsorSignature;
//    private String adminPhoneNumForeign;
//    
//    private String sponsDfePhoneNumForeign;
//    private String adminNameSameSponInd;
//    private String adminAddressSameSponInd;
//    private String preparerName;
//    private String preparerFirmName;
//    private String preparerUsAddress1;
//    private String preparerUsAddress2;
//    private String preparerUsCity;
//    private String preparerUsState;
//    private String preparerUsZip;
//    private String preparerForeignAddress1;
//    private String preparerForeignAddress2;
//    private String preparerForeignCity;
//    private String preparerForeignProvState;
//    private String preparerForeignCntry;
//    private String preparerForeignPostalCd;
//    private String preparerPhoneNum;
//    private String preparerPhoneNumForeign;
//    private String totActPartcpBoyCnt;
//    private String subjM1FilingReqInd;
//    private String complianceM1FilingReqInd;
//    
//    private String m1ReceiptConfirmationCode;
//    private String adminManualSignedDate;
//    private String adminManualSignedName;
//    private String lastRPTPlanName;
//    private String sponsManualSignedDate;
//    private String sponsManualSignedName;
//    private String dfeManualSignedDate;
//    private String dfeManualsignedName;
//    

    public String getTYPE_PLAN_ENTITY_CD() {
      return TYPE_PLAN_ENTITY_CD;
    }
    public void setTYPE_PLAN_ENTITY_CD(String tYPE_PLAN_ENTITY_CD) {
      TYPE_PLAN_ENTITY_CD = tYPE_PLAN_ENTITY_CD;
    }
    public String getTYPE_DFE_PLAN_ENTITY_CD() {
      return TYPE_DFE_PLAN_ENTITY_CD;
    }
    public void setTYPE_DFE_PLAN_ENTITY_CD(String tYPE_DFE_PLAN_ENTITY_CD) {
      TYPE_DFE_PLAN_ENTITY_CD = tYPE_DFE_PLAN_ENTITY_CD;
    }
    public String getINITIAL_FILING_IND() {
      return INITIAL_FILING_IND;
    }
    public void setINITIAL_FILING_IND(String iNITIAL_FILING_IND) {
      INITIAL_FILING_IND = iNITIAL_FILING_IND;
    }
    public String getAMENDED_IND() {
      return AMENDED_IND;
    }
    public void setAMENDED_IND(String aMENDED_IND) {
      AMENDED_IND = aMENDED_IND;
    }
    public String getAckId() {
      return ackId;
    }
    public void setAckId(String ackId) {
      this.ackId = ackId;
    }
    public String getFormTaxPrd() {
      return formTaxPrd;
    }
    public void setFormTaxPrd(String formTaxPrd) {
      this.formTaxPrd = formTaxPrd;
    }
    public String getPlanName() {
      return planName;
    }
    public void setPlanName(String planName) {
      this.planName = planName;
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

    public String getSponsDfeMailUsAddress2() {
      return sponsDfeMailUsAddress2;
    }
    public void setSponsDfeMailUsAddress2(String sponsDfeMailUsAddress2) {
      this.sponsDfeMailUsAddress2 = sponsDfeMailUsAddress2;
    }

    
//    
//    "ACK_ID","FORM_PLAN_YEAR_BEGIN_DATE","FORM_TAX_PRD","TYPE_PLAN_ENTITY_CD","TYPE_DFE_PLAN_ENTITY_CD","INITIAL_FILING_IND","AMENDED_IND","FINAL_FILING_IND","SHORT_PLAN_YR_IND","COLLECTIVE_BARGAIN_IND","F5558_APPLICATION_FILED_IND","EXT_AUTOMATIC_IND",
//    "DFVC_PROGRAM_IND","EXT_SPECIAL_IND","EXT_SPECIAL_TEXT","PLAN_NAME","SPONS_DFE_PN","PLAN_EFF_DATE","SPONSOR_DFE_NAME","SPONS_DFE_DBA_NAME","SPONS_DFE_CARE_OF_NAME","SPONS_DFE_MAIL_US_ADDRESS1","SPONS_DFE_MAIL_US_ADDRESS2",
//    "SPONS_DFE_MAIL_US_CITY","SPONS_DFE_MAIL_US_STATE","SPONS_DFE_MAIL_US_ZIP","SPONS_DFE_MAIL_FOREIGN_ADDR1","SPONS_DFE_MAIL_FOREIGN_ADDR2","SPONS_DFE_MAIL_FOREIGN_CITY",
//    "SPONS_DFE_MAIL_FORGN_PROV_ST","SPONS_DFE_MAIL_FOREIGN_CNTRY","SPONS_DFE_MAIL_FORGN_POSTAL_CD","SPONS_DFE_LOC_US_ADDRESS1","SPONS_DFE_LOC_US_ADDRESS2","SPONS_DFE_LOC_US_CITY",
//    "SPONS_DFE_LOC_US_STATE","SPONS_DFE_LOC_US_ZIP","SPONS_DFE_LOC_FOREIGN_ADDRESS1","SPONS_DFE_LOC_FOREIGN_ADDRESS2","SPONS_DFE_LOC_FOREIGN_CITY","SPONS_DFE_LOC_FORGN_PROV_ST",
//    "SPONS_DFE_LOC_FOREIGN_CNTRY","SPONS_DFE_LOC_FORGN_POSTAL_CD","SPONS_DFE_EIN","SPONS_DFE_PHONE_NUM","BUSINESS_CODE","ADMIN_NAME","ADMIN_CARE_OF_NAME","ADMIN_US_ADDRESS1","ADMIN_US_ADDRESS2",
//    "ADMIN_US_CITY","ADMIN_US_STATE","ADMIN_US_ZIP","ADMIN_FOREIGN_ADDRESS1","ADMIN_FOREIGN_ADDRESS2","ADMIN_FOREIGN_CITY","ADMIN_FOREIGN_PROV_STATE","ADMIN_FOREIGN_CNTRY",
//    "ADMIN_FOREIGN_POSTAL_CD","ADMIN_EIN","ADMIN_PHONE_NUM",
//    "LAST_RPT_SPONS_NAME","LAST_RPT_SPONS_EIN","LAST_RPT_PLAN_NUM","ADMIN_SIGNED_DATE","ADMIN_SIGNED_NAME","SPONS_SIGNED_DATE","SPONS_SIGNED_NAME","DFE_SIGNED_DATE","DFE_SIGNED_NAME",
// "TOT_PARTCP_BOY_CNT","TOT_ACTIVE_PARTCP_CNT","RTD_SEP_PARTCP_RCVG_CNT","RTD_SEP_PARTCP_FUT_CNT","SUBTL_ACT_RTD_SEP_CNT","BENEF_RCVG_BNFT_CNT","TOT_ACT_RTD_SEP_BENEF_CNT",
// "PARTCP_ACCOUNT_BAL_CNT","SEP_PARTCP_PARTL_VSTD_CNT","CONTRIB_EMPLRS_CNT","TYPE_PENSION_BNFT_CODE","TYPE_WELFARE_BNFT_CODE","FUNDING_INSURANCE_IND","FUNDING_SEC412_IND","FUNDING_TRUST_IND",
    //"FUNDING_GEN_ASSET_IND","BENEFIT_INSURANCE_IND","BENEFIT_SEC412_IND","BENEFIT_TRUST_IND","BENEFIT_GEN_ASSET_IND","SCH_R_ATTACHED_IND","SCH_MB_ATTACHED_IND","SCH_SB_ATTACHED_IND",
//  "SCH_H_ATTACHED_IND","SCH_I_ATTACHED_IND","SCH_A_ATTACHED_IND","NUM_SCH_A_ATTACHED_CNT","SCH_C_ATTACHED_IND","SCH_D_ATTACHED_IND","SCH_G_ATTACHED_IND","FILING_STATUS","DATE_RECEIVED","VALID_ADMIN_SIGNATURE",
//  "VALID_DFE_SIGNATURE","VALID_SPONSOR_SIGNATURE","ADMIN_PHONE_NUM_FOREIGN","SPONS_DFE_PHONE_NUM_FOREIGN","ADMIN_NAME_SAME_SPON_IND","ADMIN_ADDRESS_SAME_SPON_IND","PREPARER_NAME","PREPARER_FIRM_NAME", "PREPARER_US_ADDRESS1","PREPARER_US_ADDRESS2","PREPARER_US_CITY","PREPARER_US_STATE","PREPARER_US_ZIP","PREPARER_FOREIGN_ADDRESS1","PREPARER_FOREIGN_ADDRESS2","PREPARER_FOREIGN_CITY",
 //   "PREPARER_FOREIGN_PROV_STATE","PREPARER_FOREIGN_CNTRY","PREPARER_FOREIGN_POSTAL_CD","PREPARER_PHONE_NUM","PREPARER_PHONE_NUM_FOREIGN","TOT_ACT_PARTCP_BOY_CNT","SUBJ_M1_FILING_REQ_IND",
//    "COMPLIANCE_M1_FILING_REQ_IND","M1_RECEIPT_CONFIRMATION_CODE","ADMIN_MANUAL_SIGNED_DATE","ADMIN_MANUAL_SIGNED_NAME","LAST_RPT_PLAN_NAME","SPONS_MANUAL_SIGNED_DATE","SPONS_MANUAL_SIGNED_NAME",
//    "DFE_MANUAL_SIGNED_DATE","DFE_MANUAL_SIGNED_NAME"

}
