package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAnalysisRetrieveInputModelManagedInvestmentPortfolioAnalysisInstanceAnalysis
 */
public class CRManagedInvestmentPortfolioAnalysisRetrieveInputModelManagedInvestmentPortfolioAnalysisInstanceAnalysis   {
  private String managedInvestmentPortfolioAnalysisInstanceAnalysisReference = null;

  private String managedInvestmentPortfolioAnalysisInstanceAnalysisReportType = null;

  private String managedInvestmentPortfolioAnalysisInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return managedInvestmentPortfolioAnalysisInstanceAnalysisReference
  **/

  public String getManagedInvestmentPortfolioAnalysisInstanceAnalysisReference() {
    return managedInvestmentPortfolioAnalysisInstanceAnalysisReference;
  }

  public void setManagedInvestmentPortfolioAnalysisInstanceAnalysisReference(String managedInvestmentPortfolioAnalysisInstanceAnalysisReference) {
    this.managedInvestmentPortfolioAnalysisInstanceAnalysisReference = managedInvestmentPortfolioAnalysisInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return managedInvestmentPortfolioAnalysisInstanceAnalysisParameters
  **/

  public String getManagedInvestmentPortfolioAnalysisInstanceAnalysisParameters() {
    return managedInvestmentPortfolioAnalysisInstanceAnalysisParameters;
  }

  public void setManagedInvestmentPortfolioAnalysisInstanceAnalysisParameters(String managedInvestmentPortfolioAnalysisInstanceAnalysisParameters) {
    this.managedInvestmentPortfolioAnalysisInstanceAnalysisParameters = managedInvestmentPortfolioAnalysisInstanceAnalysisParameters;
  }


}

