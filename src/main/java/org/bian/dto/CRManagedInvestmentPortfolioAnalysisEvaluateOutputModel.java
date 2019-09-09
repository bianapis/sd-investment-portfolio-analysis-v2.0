package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAnalysisEvaluateOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAnalysisEvaluateOutputModel
 */
public class CRManagedInvestmentPortfolioAnalysisEvaluateOutputModel   {
  private String managedInvestmentPortfolioAnalysisInstanceReference = null;

  private String managedInvestmentPortfolioAnalysisEvaluateActionReference = null;

  private Object managedInvestmentPortfolioAnalysisEvaluateActionRecord = null;

  private String managedInvestmentPortfolioAnalysisInstanceStatus = null;

  private CRManagedInvestmentPortfolioAnalysisEvaluateOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord cRManagedInvestmentPortfolioAnalysisInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return managedInvestmentPortfolioAnalysisEvaluateActionReference
  **/

  public String getManagedInvestmentPortfolioAnalysisEvaluateActionReference() {
    return managedInvestmentPortfolioAnalysisEvaluateActionReference;
  }

  public void setManagedInvestmentPortfolioAnalysisEvaluateActionReference(String managedInvestmentPortfolioAnalysisEvaluateActionReference) {
    this.managedInvestmentPortfolioAnalysisEvaluateActionReference = managedInvestmentPortfolioAnalysisEvaluateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return managedInvestmentPortfolioAnalysisEvaluateActionRecord
  **/

  public Object getManagedInvestmentPortfolioAnalysisEvaluateActionRecord() {
    return managedInvestmentPortfolioAnalysisEvaluateActionRecord;
  }

  public void setManagedInvestmentPortfolioAnalysisEvaluateActionRecord(Object managedInvestmentPortfolioAnalysisEvaluateActionRecord) {
    this.managedInvestmentPortfolioAnalysisEvaluateActionRecord = managedInvestmentPortfolioAnalysisEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Managed Investment Portfolio Analysis instance (e.g. initialised, pending, active) 
   * @return managedInvestmentPortfolioAnalysisInstanceStatus
  **/

  public String getManagedInvestmentPortfolioAnalysisInstanceStatus() {
    return managedInvestmentPortfolioAnalysisInstanceStatus;
  }

  public void setManagedInvestmentPortfolioAnalysisInstanceStatus(String managedInvestmentPortfolioAnalysisInstanceStatus) {
    this.managedInvestmentPortfolioAnalysisInstanceStatus = managedInvestmentPortfolioAnalysisInstanceStatus;
  }


  /**
   * Get cRManagedInvestmentPortfolioAnalysisInstanceRecord
   * @return cRManagedInvestmentPortfolioAnalysisInstanceRecord
  **/

  public CRManagedInvestmentPortfolioAnalysisEvaluateOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord getCRManagedInvestmentPortfolioAnalysisInstanceRecord() {
    return cRManagedInvestmentPortfolioAnalysisInstanceRecord;
  }
  @JsonProperty("cRManagedInvestmentPortfolioAnalysisInstanceRecord")
  public void setCRManagedInvestmentPortfolioAnalysisInstanceRecord(CRManagedInvestmentPortfolioAnalysisEvaluateOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord cRManagedInvestmentPortfolioAnalysisInstanceRecord) {
    this.cRManagedInvestmentPortfolioAnalysisInstanceRecord = cRManagedInvestmentPortfolioAnalysisInstanceRecord;
  }


}

