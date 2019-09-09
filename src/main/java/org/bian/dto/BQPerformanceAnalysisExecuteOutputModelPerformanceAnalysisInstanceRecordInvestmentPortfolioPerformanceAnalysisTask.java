package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisExecuteOutputModelPerformanceAnalysisInstanceRecordInvestmentPortfolioPerformanceAnalysisTask
 */
public class BQPerformanceAnalysisExecuteOutputModelPerformanceAnalysisInstanceRecordInvestmentPortfolioPerformanceAnalysisTask   {
  private String investmentPerformanceModelReference = null;

  private Object investmentPerformanceProductServiceActivityReport = null;

  private Object investmentPerformanceFinancialMarketResearchReport = null;

  private String investmentPerformanceWorkProducts = null;

  private String investmentPerformanceRequestResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the performance analysis model used 
   * @return investmentPerformanceModelReference
  **/

  public String getInvestmentPerformanceModelReference() {
    return investmentPerformanceModelReference;
  }

  public void setInvestmentPerformanceModelReference(String investmentPerformanceModelReference) {
    this.investmentPerformanceModelReference = investmentPerformanceModelReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The data file, report of investment transaction details used in the analysis 
   * @return investmentPerformanceProductServiceActivityReport
  **/

  public Object getInvestmentPerformanceProductServiceActivityReport() {
    return investmentPerformanceProductServiceActivityReport;
  }

  public void setInvestmentPerformanceProductServiceActivityReport(Object investmentPerformanceProductServiceActivityReport) {
    this.investmentPerformanceProductServiceActivityReport = investmentPerformanceProductServiceActivityReport;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The content of selected financial market research report or market transaction database in any suitable form used for comparisons 
   * @return investmentPerformanceFinancialMarketResearchReport
  **/

  public Object getInvestmentPerformanceFinancialMarketResearchReport() {
    return investmentPerformanceFinancialMarketResearchReport;
  }

  public void setInvestmentPerformanceFinancialMarketResearchReport(Object investmentPerformanceFinancialMarketResearchReport) {
    this.investmentPerformanceFinancialMarketResearchReport = investmentPerformanceFinancialMarketResearchReport;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the analysis 
   * @return investmentPerformanceWorkProducts
  **/

  public String getInvestmentPerformanceWorkProducts() {
    return investmentPerformanceWorkProducts;
  }

  public void setInvestmentPerformanceWorkProducts(String investmentPerformanceWorkProducts) {
    this.investmentPerformanceWorkProducts = investmentPerformanceWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The output from executing the selected performance analysis  
   * @return investmentPerformanceRequestResult
  **/

  public String getInvestmentPerformanceRequestResult() {
    return investmentPerformanceRequestResult;
  }

  public void setInvestmentPerformanceRequestResult(String investmentPerformanceRequestResult) {
    this.investmentPerformanceRequestResult = investmentPerformanceRequestResult;
  }


}

