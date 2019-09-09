package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAnalysisRetrieveOutputModelManagedInvestmentPortfolioAnalysisInstanceReportRecord
 */
public class CRManagedInvestmentPortfolioAnalysisRetrieveOutputModelManagedInvestmentPortfolioAnalysisInstanceReportRecord   {
  private String managedInvestmentPortfolioAnalysisInstanceReportData = null;

  private String managedInvestmentPortfolioAnalysisInstanceReportType = null;

  private Object managedInvestmentPortfolioAnalysisInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return managedInvestmentPortfolioAnalysisInstanceReportData
  **/

  public String getManagedInvestmentPortfolioAnalysisInstanceReportData() {
    return managedInvestmentPortfolioAnalysisInstanceReportData;
  }

  public void setManagedInvestmentPortfolioAnalysisInstanceReportData(String managedInvestmentPortfolioAnalysisInstanceReportData) {
    this.managedInvestmentPortfolioAnalysisInstanceReportData = managedInvestmentPortfolioAnalysisInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return managedInvestmentPortfolioAnalysisInstanceReportType
  **/

  public String getManagedInvestmentPortfolioAnalysisInstanceReportType() {
    return managedInvestmentPortfolioAnalysisInstanceReportType;
  }

  public void setManagedInvestmentPortfolioAnalysisInstanceReportType(String managedInvestmentPortfolioAnalysisInstanceReportType) {
    this.managedInvestmentPortfolioAnalysisInstanceReportType = managedInvestmentPortfolioAnalysisInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return managedInvestmentPortfolioAnalysisInstanceReport
  **/

  public Object getManagedInvestmentPortfolioAnalysisInstanceReport() {
    return managedInvestmentPortfolioAnalysisInstanceReport;
  }

  public void setManagedInvestmentPortfolioAnalysisInstanceReport(Object managedInvestmentPortfolioAnalysisInstanceReport) {
    this.managedInvestmentPortfolioAnalysisInstanceReport = managedInvestmentPortfolioAnalysisInstanceReport;
  }


}

