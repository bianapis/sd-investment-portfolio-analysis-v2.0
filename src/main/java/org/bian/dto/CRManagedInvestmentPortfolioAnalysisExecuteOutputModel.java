package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAnalysisExecuteOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAnalysisExecuteOutputModel
 */
public class CRManagedInvestmentPortfolioAnalysisExecuteOutputModel   {
  private CRManagedInvestmentPortfolioAnalysisExecuteOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord cRManagedInvestmentPortfolioAnalysisInstanceRecord = null;

  private String managedInvestmentPortfolioAnalysisExecuteActionTaskReference = null;

  private Object managedInvestmentPortfolioAnalysisExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get cRManagedInvestmentPortfolioAnalysisInstanceRecord
   * @return cRManagedInvestmentPortfolioAnalysisInstanceRecord
  **/

  public CRManagedInvestmentPortfolioAnalysisExecuteOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord getCRManagedInvestmentPortfolioAnalysisInstanceRecord() {
    return cRManagedInvestmentPortfolioAnalysisInstanceRecord;
  }
   
  @JsonProperty("cRManagedInvestmentPortfolioAnalysisInstanceRecord")
  public void setCRManagedInvestmentPortfolioAnalysisInstanceRecord(CRManagedInvestmentPortfolioAnalysisExecuteOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord cRManagedInvestmentPortfolioAnalysisInstanceRecord) {
    this.cRManagedInvestmentPortfolioAnalysisInstanceRecord = cRManagedInvestmentPortfolioAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Managed Investment Portfolio Analysis instance execute service call 
   * @return managedInvestmentPortfolioAnalysisExecuteActionTaskReference
  **/

  public String getManagedInvestmentPortfolioAnalysisExecuteActionTaskReference() {
    return managedInvestmentPortfolioAnalysisExecuteActionTaskReference;
  }

  public void setManagedInvestmentPortfolioAnalysisExecuteActionTaskReference(String managedInvestmentPortfolioAnalysisExecuteActionTaskReference) {
    this.managedInvestmentPortfolioAnalysisExecuteActionTaskReference = managedInvestmentPortfolioAnalysisExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

