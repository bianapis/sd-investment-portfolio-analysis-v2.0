package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAnalysisRetrieveOutputModelManagedInvestmentPortfolioAnalysisInstanceAnalysis
 */
public class CRManagedInvestmentPortfolioAnalysisRetrieveOutputModelManagedInvestmentPortfolioAnalysisInstanceAnalysis   {
  private String managedInvestmentPortfolioAnalysisInstanceAnalysisData = null;

  private String managedInvestmentPortfolioAnalysisInstanceAnalysisReportType = null;

  private Object managedInvestmentPortfolioAnalysisInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return managedInvestmentPortfolioAnalysisInstanceAnalysisData
  **/

  public String getManagedInvestmentPortfolioAnalysisInstanceAnalysisData() {
    return managedInvestmentPortfolioAnalysisInstanceAnalysisData;
  }

  public void setManagedInvestmentPortfolioAnalysisInstanceAnalysisData(String managedInvestmentPortfolioAnalysisInstanceAnalysisData) {
    this.managedInvestmentPortfolioAnalysisInstanceAnalysisData = managedInvestmentPortfolioAnalysisInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return managedInvestmentPortfolioAnalysisInstanceAnalysisReportType
  **/

  public String getManagedInvestmentPortfolioAnalysisInstanceAnalysisReportType() {
    return managedInvestmentPortfolioAnalysisInstanceAnalysisReportType;
  }

  public void setManagedInvestmentPortfolioAnalysisInstanceAnalysisReportType(String managedInvestmentPortfolioAnalysisInstanceAnalysisReportType) {
    this.managedInvestmentPortfolioAnalysisInstanceAnalysisReportType = managedInvestmentPortfolioAnalysisInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return managedInvestmentPortfolioAnalysisInstanceAnalysisReport
  **/

  public Object getManagedInvestmentPortfolioAnalysisInstanceAnalysisReport() {
    return managedInvestmentPortfolioAnalysisInstanceAnalysisReport;
  }

  public void setManagedInvestmentPortfolioAnalysisInstanceAnalysisReport(Object managedInvestmentPortfolioAnalysisInstanceAnalysisReport) {
    this.managedInvestmentPortfolioAnalysisInstanceAnalysisReport = managedInvestmentPortfolioAnalysisInstanceAnalysisReport;
  }


}

