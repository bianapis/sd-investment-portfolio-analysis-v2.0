package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAnalysisEvaluateInputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAnalysisEvaluateInputModel
 */
public class CRManagedInvestmentPortfolioAnalysisEvaluateInputModel   {
  private String investmentPortfolioAnalysisServicingSessionReference = null;

  private Object managedInvestmentPortfolioAnalysisEvaluateActionRecord = null;

  private String managedInvestmentPortfolioAnalysisInstanceStatus = null;

  private CRManagedInvestmentPortfolioAnalysisEvaluateInputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord cRManagedInvestmentPortfolioAnalysisInstanceRecord = null;


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

  public CRManagedInvestmentPortfolioAnalysisEvaluateInputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord getCRManagedInvestmentPortfolioAnalysisInstanceRecord() {
    return cRManagedInvestmentPortfolioAnalysisInstanceRecord;
  }

  public void setCRManagedInvestmentPortfolioAnalysisInstanceRecord(CRManagedInvestmentPortfolioAnalysisEvaluateInputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord cRManagedInvestmentPortfolioAnalysisInstanceRecord) {
    this.cRManagedInvestmentPortfolioAnalysisInstanceRecord = cRManagedInvestmentPortfolioAnalysisInstanceRecord;
  }


}

