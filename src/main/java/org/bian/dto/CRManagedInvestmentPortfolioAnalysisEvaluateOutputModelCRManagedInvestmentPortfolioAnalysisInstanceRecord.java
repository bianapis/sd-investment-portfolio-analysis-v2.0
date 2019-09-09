package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAnalysisEvaluateOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecordInvestmentPortfolioAnalysisReport;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAnalysisEvaluateOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord
 */
public class CRManagedInvestmentPortfolioAnalysisEvaluateOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord   {
  private String investmentPortfolioInstanceReference = null;

  private Object investmentPortfolioInstanceRecord = null;

  private String investmentPortfolioAnalysisSchedule = null;

  private CRManagedInvestmentPortfolioAnalysisEvaluateOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecordInvestmentPortfolioAnalysisReport investmentPortfolioAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the investment portfolio record of all holdings  
   * @return investmentPortfolioInstanceReference
  **/

  public String getInvestmentPortfolioInstanceReference() {
    return investmentPortfolioInstanceReference;
  }

  public void setInvestmentPortfolioInstanceReference(String investmentPortfolioInstanceReference) {
    this.investmentPortfolioInstanceReference = investmentPortfolioInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The record of the investment portfolio with the history and projected view of holdings (which may also include a history of valuation) 
   * @return investmentPortfolioInstanceRecord
  **/

  public Object getInvestmentPortfolioInstanceRecord() {
    return investmentPortfolioInstanceRecord;
  }

  public void setInvestmentPortfolioInstanceRecord(Object investmentPortfolioInstanceRecord) {
    this.investmentPortfolioInstanceRecord = investmentPortfolioInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule for performing investment portfolio analysis for the account 
   * @return investmentPortfolioAnalysisSchedule
  **/

  public String getInvestmentPortfolioAnalysisSchedule() {
    return investmentPortfolioAnalysisSchedule;
  }

  public void setInvestmentPortfolioAnalysisSchedule(String investmentPortfolioAnalysisSchedule) {
    this.investmentPortfolioAnalysisSchedule = investmentPortfolioAnalysisSchedule;
  }


  /**
   * Get investmentPortfolioAnalysisReport
   * @return investmentPortfolioAnalysisReport
  **/

  public CRManagedInvestmentPortfolioAnalysisEvaluateOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecordInvestmentPortfolioAnalysisReport getInvestmentPortfolioAnalysisReport() {
    return investmentPortfolioAnalysisReport;
  }

  public void setInvestmentPortfolioAnalysisReport(CRManagedInvestmentPortfolioAnalysisEvaluateOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecordInvestmentPortfolioAnalysisReport investmentPortfolioAnalysisReport) {
    this.investmentPortfolioAnalysisReport = investmentPortfolioAnalysisReport;
  }


}

