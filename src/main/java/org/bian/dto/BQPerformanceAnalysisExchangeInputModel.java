package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAnalysisExchangeInputModelManagedInvestmentPortfolioAnalysisExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisExchangeInputModel
 */
public class BQPerformanceAnalysisExchangeInputModel   {
  private String managedInvestmentPortfolioAnalysisInstanceReference = null;

  private String performanceAnalysisInstanceReference = null;

  private Object performanceAnalysisExchangeActionTaskRecord = null;

  private CRManagedInvestmentPortfolioAnalysisExchangeInputModelManagedInvestmentPortfolioAnalysisExchangeActionRequest performanceAnalysisExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Managed Investment Portfolio Analysis instance 
   * @return managedInvestmentPortfolioAnalysisInstanceReference
  **/

  public String getManagedInvestmentPortfolioAnalysisInstanceReference() {
    return managedInvestmentPortfolioAnalysisInstanceReference;
  }

  public void setManagedInvestmentPortfolioAnalysisInstanceReference(String managedInvestmentPortfolioAnalysisInstanceReference) {
    this.managedInvestmentPortfolioAnalysisInstanceReference = managedInvestmentPortfolioAnalysisInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Performance Analysis instance 
   * @return performanceAnalysisInstanceReference
  **/

  public String getPerformanceAnalysisInstanceReference() {
    return performanceAnalysisInstanceReference;
  }

  public void setPerformanceAnalysisInstanceReference(String performanceAnalysisInstanceReference) {
    this.performanceAnalysisInstanceReference = performanceAnalysisInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return performanceAnalysisExchangeActionTaskRecord
  **/

  public Object getPerformanceAnalysisExchangeActionTaskRecord() {
    return performanceAnalysisExchangeActionTaskRecord;
  }

  public void setPerformanceAnalysisExchangeActionTaskRecord(Object performanceAnalysisExchangeActionTaskRecord) {
    this.performanceAnalysisExchangeActionTaskRecord = performanceAnalysisExchangeActionTaskRecord;
  }


  /**
   * Get performanceAnalysisExchangeActionRequest
   * @return performanceAnalysisExchangeActionRequest
  **/

  public CRManagedInvestmentPortfolioAnalysisExchangeInputModelManagedInvestmentPortfolioAnalysisExchangeActionRequest getPerformanceAnalysisExchangeActionRequest() {
    return performanceAnalysisExchangeActionRequest;
  }

  public void setPerformanceAnalysisExchangeActionRequest(CRManagedInvestmentPortfolioAnalysisExchangeInputModelManagedInvestmentPortfolioAnalysisExchangeActionRequest performanceAnalysisExchangeActionRequest) {
    this.performanceAnalysisExchangeActionRequest = performanceAnalysisExchangeActionRequest;
  }


}

