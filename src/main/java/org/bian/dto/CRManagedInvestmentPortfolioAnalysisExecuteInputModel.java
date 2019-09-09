package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAnalysisExecuteInputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord;
import org.bian.dto.CRManagedInvestmentPortfolioAnalysisExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAnalysisExecuteInputModel
 */
public class CRManagedInvestmentPortfolioAnalysisExecuteInputModel   {
  private String investmentPortfolioAnalysisServicingSessionReference = null;

  private String managedInvestmentPortfolioAnalysisInstanceReference = null;

  private CRManagedInvestmentPortfolioAnalysisExecuteInputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord cRManagedInvestmentPortfolioAnalysisInstanceRecord = null;

  private Object managedInvestmentPortfolioAnalysisExecuteActionTaskRecord = null;

  private CRManagedInvestmentPortfolioAnalysisExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return investmentPortfolioAnalysisServicingSessionReference
  **/

  public String getInvestmentPortfolioAnalysisServicingSessionReference() {
    return investmentPortfolioAnalysisServicingSessionReference;
  }

  public void setInvestmentPortfolioAnalysisServicingSessionReference(String investmentPortfolioAnalysisServicingSessionReference) {
    this.investmentPortfolioAnalysisServicingSessionReference = investmentPortfolioAnalysisServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Managed Investment Portfolio Analysis instance 
   * @return managedInvestmentPortfolioAnalysisInstanceReference
  **/

  public String getManagedInvestmentPortfolioAnalysisInstanceReference() {
    return managedInvestmentPortfolioAnalysisInstanceReference;
  }

  public void setManagedInvestmentPortfolioAnalysisInstanceReference(String managedInvestmentPortfolioAnalysisInstanceReference) {
    this.managedInvestmentPortfolioAnalysisInstanceReference = managedInvestmentPortfolioAnalysisInstanceReference;
  }


  /**
   * Get cRManagedInvestmentPortfolioAnalysisInstanceRecord
   * @return cRManagedInvestmentPortfolioAnalysisInstanceRecord
  **/

  public CRManagedInvestmentPortfolioAnalysisExecuteInputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord getCRManagedInvestmentPortfolioAnalysisInstanceRecord() {
    return cRManagedInvestmentPortfolioAnalysisInstanceRecord;
  }

  public void setCRManagedInvestmentPortfolioAnalysisInstanceRecord(CRManagedInvestmentPortfolioAnalysisExecuteInputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord cRManagedInvestmentPortfolioAnalysisInstanceRecord) {
    this.cRManagedInvestmentPortfolioAnalysisInstanceRecord = cRManagedInvestmentPortfolioAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return managedInvestmentPortfolioAnalysisExecuteActionTaskRecord
  **/

  public Object getManagedInvestmentPortfolioAnalysisExecuteActionTaskRecord() {
    return managedInvestmentPortfolioAnalysisExecuteActionTaskRecord;
  }

  public void setManagedInvestmentPortfolioAnalysisExecuteActionTaskRecord(Object managedInvestmentPortfolioAnalysisExecuteActionTaskRecord) {
    this.managedInvestmentPortfolioAnalysisExecuteActionTaskRecord = managedInvestmentPortfolioAnalysisExecuteActionTaskRecord;
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

