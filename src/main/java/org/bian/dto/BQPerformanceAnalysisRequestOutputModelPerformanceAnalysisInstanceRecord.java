package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAnalysisRequestOutputModelPerformanceAnalysisInstanceRecordInvestmentPortfolioPerformanceAnalysisTask;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisRequestOutputModelPerformanceAnalysisInstanceRecord
 */
public class BQPerformanceAnalysisRequestOutputModelPerformanceAnalysisInstanceRecord   {
  private BQPerformanceAnalysisRequestOutputModelPerformanceAnalysisInstanceRecordInvestmentPortfolioPerformanceAnalysisTask investmentPortfolioPerformanceAnalysisTask = null;


  /**
   * Get investmentPortfolioPerformanceAnalysisTask
   * @return investmentPortfolioPerformanceAnalysisTask
  **/

  public BQPerformanceAnalysisRequestOutputModelPerformanceAnalysisInstanceRecordInvestmentPortfolioPerformanceAnalysisTask getInvestmentPortfolioPerformanceAnalysisTask() {
    return investmentPortfolioPerformanceAnalysisTask;
  }

  public void setInvestmentPortfolioPerformanceAnalysisTask(BQPerformanceAnalysisRequestOutputModelPerformanceAnalysisInstanceRecordInvestmentPortfolioPerformanceAnalysisTask investmentPortfolioPerformanceAnalysisTask) {
    this.investmentPortfolioPerformanceAnalysisTask = investmentPortfolioPerformanceAnalysisTask;
  }


}

