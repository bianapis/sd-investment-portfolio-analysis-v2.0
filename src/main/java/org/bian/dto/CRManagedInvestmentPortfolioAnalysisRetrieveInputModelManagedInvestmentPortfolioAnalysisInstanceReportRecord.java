package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAnalysisRetrieveInputModelManagedInvestmentPortfolioAnalysisInstanceReportRecord
 */
public class CRManagedInvestmentPortfolioAnalysisRetrieveInputModelManagedInvestmentPortfolioAnalysisInstanceReportRecord   {
  private String managedInvestmentPortfolioAnalysisInstanceReportReference = null;

  private String managedInvestmentPortfolioAnalysisInstanceReportType = null;

  private String managedInvestmentPortfolioAnalysisInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return managedInvestmentPortfolioAnalysisInstanceReportReference
  **/

  public String getManagedInvestmentPortfolioAnalysisInstanceReportReference() {
    return managedInvestmentPortfolioAnalysisInstanceReportReference;
  }

  public void setManagedInvestmentPortfolioAnalysisInstanceReportReference(String managedInvestmentPortfolioAnalysisInstanceReportReference) {
    this.managedInvestmentPortfolioAnalysisInstanceReportReference = managedInvestmentPortfolioAnalysisInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return managedInvestmentPortfolioAnalysisInstanceReportParameters
  **/

  public String getManagedInvestmentPortfolioAnalysisInstanceReportParameters() {
    return managedInvestmentPortfolioAnalysisInstanceReportParameters;
  }

  public void setManagedInvestmentPortfolioAnalysisInstanceReportParameters(String managedInvestmentPortfolioAnalysisInstanceReportParameters) {
    this.managedInvestmentPortfolioAnalysisInstanceReportParameters = managedInvestmentPortfolioAnalysisInstanceReportParameters;
  }


}

