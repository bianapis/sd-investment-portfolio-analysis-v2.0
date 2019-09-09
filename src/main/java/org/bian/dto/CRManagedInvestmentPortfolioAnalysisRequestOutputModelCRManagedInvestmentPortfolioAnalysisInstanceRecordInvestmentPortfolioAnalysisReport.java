package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAnalysisRequestOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecordInvestmentPortfolioAnalysisReport
 */
public class CRManagedInvestmentPortfolioAnalysisRequestOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecordInvestmentPortfolioAnalysisReport   {
  private String investmentPortfolioAnalysisResult = null;

  private String investmentPortfolioAnalysisReportingDate = null;

  private String documentDirectoryEntryInstanceReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The consolidated report of the performance evaluation and comparisons from the analysis 
   * @return investmentPortfolioAnalysisResult
  **/

  public String getInvestmentPortfolioAnalysisResult() {
    return investmentPortfolioAnalysisResult;
  }

  public void setInvestmentPortfolioAnalysisResult(String investmentPortfolioAnalysisResult) {
    this.investmentPortfolioAnalysisResult = investmentPortfolioAnalysisResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date/time the performance report was completed 
   * @return investmentPortfolioAnalysisReportingDate
  **/

  public String getInvestmentPortfolioAnalysisReportingDate() {
    return investmentPortfolioAnalysisReportingDate;
  }

  public void setInvestmentPortfolioAnalysisReportingDate(String investmentPortfolioAnalysisReportingDate) {
    this.investmentPortfolioAnalysisReportingDate = investmentPortfolioAnalysisReportingDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated performance analysis reporting documents 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


}

