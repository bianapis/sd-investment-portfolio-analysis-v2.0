package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceRecordInvestmentPortfolioPerformanceAnalysisTask;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceRecord
 */
public class BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceRecord   {
  private String investmentPortfolioPerformanceAnalysisType = null;

  private BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceRecordInvestmentPortfolioPerformanceAnalysisTask investmentPortfolioPerformanceAnalysisTask = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the type of analysis/algorithm used to evaluate and compare the investment portfolio performance to prevailing market measures 
   * @return investmentPortfolioPerformanceAnalysisType
  **/

  public String getInvestmentPortfolioPerformanceAnalysisType() {
    return investmentPortfolioPerformanceAnalysisType;
  }

  public void setInvestmentPortfolioPerformanceAnalysisType(String investmentPortfolioPerformanceAnalysisType) {
    this.investmentPortfolioPerformanceAnalysisType = investmentPortfolioPerformanceAnalysisType;
  }


  /**
   * Get investmentPortfolioPerformanceAnalysisTask
   * @return investmentPortfolioPerformanceAnalysisTask
  **/

  public BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceRecordInvestmentPortfolioPerformanceAnalysisTask getInvestmentPortfolioPerformanceAnalysisTask() {
    return investmentPortfolioPerformanceAnalysisTask;
  }

  public void setInvestmentPortfolioPerformanceAnalysisTask(BQPerformanceAnalysisRetrieveOutputModelPerformanceAnalysisInstanceRecordInvestmentPortfolioPerformanceAnalysisTask investmentPortfolioPerformanceAnalysisTask) {
    this.investmentPortfolioPerformanceAnalysisTask = investmentPortfolioPerformanceAnalysisTask;
  }


}

