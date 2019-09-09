package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAnalysisExecuteOutputModelPerformanceAnalysisInstanceRecordInvestmentPortfolioPerformanceAnalysisTask;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisExecuteOutputModelPerformanceAnalysisInstanceRecord
 */
public class BQPerformanceAnalysisExecuteOutputModelPerformanceAnalysisInstanceRecord   {
  private BQPerformanceAnalysisExecuteOutputModelPerformanceAnalysisInstanceRecordInvestmentPortfolioPerformanceAnalysisTask investmentPortfolioPerformanceAnalysisTask = null;


  /**
   * Get investmentPortfolioPerformanceAnalysisTask
   * @return investmentPortfolioPerformanceAnalysisTask
  **/

  public BQPerformanceAnalysisExecuteOutputModelPerformanceAnalysisInstanceRecordInvestmentPortfolioPerformanceAnalysisTask getInvestmentPortfolioPerformanceAnalysisTask() {
    return investmentPortfolioPerformanceAnalysisTask;
  }

  public void setInvestmentPortfolioPerformanceAnalysisTask(BQPerformanceAnalysisExecuteOutputModelPerformanceAnalysisInstanceRecordInvestmentPortfolioPerformanceAnalysisTask investmentPortfolioPerformanceAnalysisTask) {
    this.investmentPortfolioPerformanceAnalysisTask = investmentPortfolioPerformanceAnalysisTask;
  }


}

