package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAnalysisExecuteInputModelPerformanceAnalysisInstanceRecord;
import org.bian.dto.CRManagedInvestmentPortfolioAnalysisExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQPerformanceAnalysisExecuteInputModel
 */
public class BQPerformanceAnalysisExecuteInputModel   {
  private String managedInvestmentPortfolioAnalysisInstanceReference = null;

  private String performanceAnalysisInstanceReference = null;

  private BQPerformanceAnalysisExecuteInputModelPerformanceAnalysisInstanceRecord performanceAnalysisInstanceRecord = null;

  private Object performanceAnalysisExecuteActionTaskRecord = null;

  private CRManagedInvestmentPortfolioAnalysisExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * Get performanceAnalysisInstanceRecord
   * @return performanceAnalysisInstanceRecord
  **/

  public BQPerformanceAnalysisExecuteInputModelPerformanceAnalysisInstanceRecord getPerformanceAnalysisInstanceRecord() {
    return performanceAnalysisInstanceRecord;
  }

  public void setPerformanceAnalysisInstanceRecord(BQPerformanceAnalysisExecuteInputModelPerformanceAnalysisInstanceRecord performanceAnalysisInstanceRecord) {
    this.performanceAnalysisInstanceRecord = performanceAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return performanceAnalysisExecuteActionTaskRecord
  **/

  public Object getPerformanceAnalysisExecuteActionTaskRecord() {
    return performanceAnalysisExecuteActionTaskRecord;
  }

  public void setPerformanceAnalysisExecuteActionTaskRecord(Object performanceAnalysisExecuteActionTaskRecord) {
    this.performanceAnalysisExecuteActionTaskRecord = performanceAnalysisExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRManagedInvestmentPortfolioAnalysisExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRManagedInvestmentPortfolioAnalysisExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

