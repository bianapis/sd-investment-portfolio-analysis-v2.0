package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAnalysisRetrieveOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord;
import org.bian.dto.CRManagedInvestmentPortfolioAnalysisRetrieveOutputModelManagedInvestmentPortfolioAnalysisInstanceAnalysis;
import org.bian.dto.CRManagedInvestmentPortfolioAnalysisRetrieveOutputModelManagedInvestmentPortfolioAnalysisInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAnalysisRetrieveOutputModel
 */
public class CRManagedInvestmentPortfolioAnalysisRetrieveOutputModel   {
  private CRManagedInvestmentPortfolioAnalysisRetrieveOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord cRManagedInvestmentPortfolioAnalysisInstanceRecord = null;

  private String managedInvestmentPortfolioAnalysisRetrieveActionTaskReference = null;

  private Object managedInvestmentPortfolioAnalysisRetrieveActionTaskRecord = null;

  private String managedInvestmentPortfolioAnalysisRetrieveActionResponse = null;

  private CRManagedInvestmentPortfolioAnalysisRetrieveOutputModelManagedInvestmentPortfolioAnalysisInstanceReportRecord managedInvestmentPortfolioAnalysisInstanceReportRecord = null;

  private CRManagedInvestmentPortfolioAnalysisRetrieveOutputModelManagedInvestmentPortfolioAnalysisInstanceAnalysis managedInvestmentPortfolioAnalysisInstanceAnalysis = null;


  /**
   * Get cRManagedInvestmentPortfolioAnalysisInstanceRecord
   * @return cRManagedInvestmentPortfolioAnalysisInstanceRecord
  **/

  public CRManagedInvestmentPortfolioAnalysisRetrieveOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord getCRManagedInvestmentPortfolioAnalysisInstanceRecord() {
    return cRManagedInvestmentPortfolioAnalysisInstanceRecord;
  }
  @JsonProperty("cRManagedInvestmentPortfolioAnalysisInstanceRecord")
  public void setCRManagedInvestmentPortfolioAnalysisInstanceRecord(CRManagedInvestmentPortfolioAnalysisRetrieveOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord cRManagedInvestmentPortfolioAnalysisInstanceRecord) {
    this.cRManagedInvestmentPortfolioAnalysisInstanceRecord = cRManagedInvestmentPortfolioAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Managed Investment Portfolio Analysis instance retrieve service call 
   * @return managedInvestmentPortfolioAnalysisRetrieveActionTaskReference
  **/

  public String getManagedInvestmentPortfolioAnalysisRetrieveActionTaskReference() {
    return managedInvestmentPortfolioAnalysisRetrieveActionTaskReference;
  }

  public void setManagedInvestmentPortfolioAnalysisRetrieveActionTaskReference(String managedInvestmentPortfolioAnalysisRetrieveActionTaskReference) {
    this.managedInvestmentPortfolioAnalysisRetrieveActionTaskReference = managedInvestmentPortfolioAnalysisRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return managedInvestmentPortfolioAnalysisRetrieveActionTaskRecord
  **/

  public Object getManagedInvestmentPortfolioAnalysisRetrieveActionTaskRecord() {
    return managedInvestmentPortfolioAnalysisRetrieveActionTaskRecord;
  }

  public void setManagedInvestmentPortfolioAnalysisRetrieveActionTaskRecord(Object managedInvestmentPortfolioAnalysisRetrieveActionTaskRecord) {
    this.managedInvestmentPortfolioAnalysisRetrieveActionTaskRecord = managedInvestmentPortfolioAnalysisRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return managedInvestmentPortfolioAnalysisRetrieveActionResponse
  **/

  public String getManagedInvestmentPortfolioAnalysisRetrieveActionResponse() {
    return managedInvestmentPortfolioAnalysisRetrieveActionResponse;
  }

  public void setManagedInvestmentPortfolioAnalysisRetrieveActionResponse(String managedInvestmentPortfolioAnalysisRetrieveActionResponse) {
    this.managedInvestmentPortfolioAnalysisRetrieveActionResponse = managedInvestmentPortfolioAnalysisRetrieveActionResponse;
  }


  /**
   * Get managedInvestmentPortfolioAnalysisInstanceReportRecord
   * @return managedInvestmentPortfolioAnalysisInstanceReportRecord
  **/

  public CRManagedInvestmentPortfolioAnalysisRetrieveOutputModelManagedInvestmentPortfolioAnalysisInstanceReportRecord getManagedInvestmentPortfolioAnalysisInstanceReportRecord() {
    return managedInvestmentPortfolioAnalysisInstanceReportRecord;
  }

  public void setManagedInvestmentPortfolioAnalysisInstanceReportRecord(CRManagedInvestmentPortfolioAnalysisRetrieveOutputModelManagedInvestmentPortfolioAnalysisInstanceReportRecord managedInvestmentPortfolioAnalysisInstanceReportRecord) {
    this.managedInvestmentPortfolioAnalysisInstanceReportRecord = managedInvestmentPortfolioAnalysisInstanceReportRecord;
  }


  /**
   * Get managedInvestmentPortfolioAnalysisInstanceAnalysis
   * @return managedInvestmentPortfolioAnalysisInstanceAnalysis
  **/

  public CRManagedInvestmentPortfolioAnalysisRetrieveOutputModelManagedInvestmentPortfolioAnalysisInstanceAnalysis getManagedInvestmentPortfolioAnalysisInstanceAnalysis() {
    return managedInvestmentPortfolioAnalysisInstanceAnalysis;
  }

  public void setManagedInvestmentPortfolioAnalysisInstanceAnalysis(CRManagedInvestmentPortfolioAnalysisRetrieveOutputModelManagedInvestmentPortfolioAnalysisInstanceAnalysis managedInvestmentPortfolioAnalysisInstanceAnalysis) {
    this.managedInvestmentPortfolioAnalysisInstanceAnalysis = managedInvestmentPortfolioAnalysisInstanceAnalysis;
  }


}

