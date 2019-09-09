package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAnalysisRetrieveInputModelManagedInvestmentPortfolioAnalysisInstanceAnalysis;
import org.bian.dto.CRManagedInvestmentPortfolioAnalysisRetrieveInputModelManagedInvestmentPortfolioAnalysisInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAnalysisRetrieveInputModel
 */
public class CRManagedInvestmentPortfolioAnalysisRetrieveInputModel   {
  private Object managedInvestmentPortfolioAnalysisRetrieveActionTaskRecord = null;

  private String managedInvestmentPortfolioAnalysisRetrieveActionRequest = null;

  private CRManagedInvestmentPortfolioAnalysisRetrieveInputModelManagedInvestmentPortfolioAnalysisInstanceReportRecord managedInvestmentPortfolioAnalysisInstanceReportRecord = null;

  private CRManagedInvestmentPortfolioAnalysisRetrieveInputModelManagedInvestmentPortfolioAnalysisInstanceAnalysis managedInvestmentPortfolioAnalysisInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return managedInvestmentPortfolioAnalysisRetrieveActionRequest
  **/

  public String getManagedInvestmentPortfolioAnalysisRetrieveActionRequest() {
    return managedInvestmentPortfolioAnalysisRetrieveActionRequest;
  }

  public void setManagedInvestmentPortfolioAnalysisRetrieveActionRequest(String managedInvestmentPortfolioAnalysisRetrieveActionRequest) {
    this.managedInvestmentPortfolioAnalysisRetrieveActionRequest = managedInvestmentPortfolioAnalysisRetrieveActionRequest;
  }


  /**
   * Get managedInvestmentPortfolioAnalysisInstanceReportRecord
   * @return managedInvestmentPortfolioAnalysisInstanceReportRecord
  **/

  public CRManagedInvestmentPortfolioAnalysisRetrieveInputModelManagedInvestmentPortfolioAnalysisInstanceReportRecord getManagedInvestmentPortfolioAnalysisInstanceReportRecord() {
    return managedInvestmentPortfolioAnalysisInstanceReportRecord;
  }

  public void setManagedInvestmentPortfolioAnalysisInstanceReportRecord(CRManagedInvestmentPortfolioAnalysisRetrieveInputModelManagedInvestmentPortfolioAnalysisInstanceReportRecord managedInvestmentPortfolioAnalysisInstanceReportRecord) {
    this.managedInvestmentPortfolioAnalysisInstanceReportRecord = managedInvestmentPortfolioAnalysisInstanceReportRecord;
  }


  /**
   * Get managedInvestmentPortfolioAnalysisInstanceAnalysis
   * @return managedInvestmentPortfolioAnalysisInstanceAnalysis
  **/

  public CRManagedInvestmentPortfolioAnalysisRetrieveInputModelManagedInvestmentPortfolioAnalysisInstanceAnalysis getManagedInvestmentPortfolioAnalysisInstanceAnalysis() {
    return managedInvestmentPortfolioAnalysisInstanceAnalysis;
  }

  public void setManagedInvestmentPortfolioAnalysisInstanceAnalysis(CRManagedInvestmentPortfolioAnalysisRetrieveInputModelManagedInvestmentPortfolioAnalysisInstanceAnalysis managedInvestmentPortfolioAnalysisInstanceAnalysis) {
    this.managedInvestmentPortfolioAnalysisInstanceAnalysis = managedInvestmentPortfolioAnalysisInstanceAnalysis;
  }


}

