package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAnalysisRequestInputModelPerformanceAnalysisInstanceRecordInvestmentPortfolioPerformanceAnalysisTask;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisRequestInputModelPerformanceAnalysisInstanceRecord
 */
public class BQPerformanceAnalysisRequestInputModelPerformanceAnalysisInstanceRecord   {
  private BQPerformanceAnalysisRequestInputModelPerformanceAnalysisInstanceRecordInvestmentPortfolioPerformanceAnalysisTask investmentPortfolioPerformanceAnalysisTask = null;


  /**
   * Get investmentPortfolioPerformanceAnalysisTask
   * @return investmentPortfolioPerformanceAnalysisTask
  **/

  public BQPerformanceAnalysisRequestInputModelPerformanceAnalysisInstanceRecordInvestmentPortfolioPerformanceAnalysisTask getInvestmentPortfolioPerformanceAnalysisTask() {
    return investmentPortfolioPerformanceAnalysisTask;
  }

  public void setInvestmentPortfolioPerformanceAnalysisTask(BQPerformanceAnalysisRequestInputModelPerformanceAnalysisInstanceRecordInvestmentPortfolioPerformanceAnalysisTask investmentPortfolioPerformanceAnalysisTask) {
    this.investmentPortfolioPerformanceAnalysisTask = investmentPortfolioPerformanceAnalysisTask;
  }


}

