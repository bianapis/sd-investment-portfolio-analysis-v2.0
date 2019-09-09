package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAnalysisExchangeInputModelManagedInvestmentPortfolioAnalysisExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAnalysisExchangeInputModel
 */
public class CRManagedInvestmentPortfolioAnalysisExchangeInputModel   {
  private String investmentPortfolioAnalysisServicingSessionReference = null;

  private String managedInvestmentPortfolioAnalysisInstanceReference = null;

  private Object managedInvestmentPortfolioAnalysisExchangeActionTaskRecord = null;

  private CRManagedInvestmentPortfolioAnalysisExchangeInputModelManagedInvestmentPortfolioAnalysisExchangeActionRequest managedInvestmentPortfolioAnalysisExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return managedInvestmentPortfolioAnalysisExchangeActionTaskRecord
  **/

  public Object getManagedInvestmentPortfolioAnalysisExchangeActionTaskRecord() {
    return managedInvestmentPortfolioAnalysisExchangeActionTaskRecord;
  }

  public void setManagedInvestmentPortfolioAnalysisExchangeActionTaskRecord(Object managedInvestmentPortfolioAnalysisExchangeActionTaskRecord) {
    this.managedInvestmentPortfolioAnalysisExchangeActionTaskRecord = managedInvestmentPortfolioAnalysisExchangeActionTaskRecord;
  }


  /**
   * Get managedInvestmentPortfolioAnalysisExchangeActionRequest
   * @return managedInvestmentPortfolioAnalysisExchangeActionRequest
  **/

  public CRManagedInvestmentPortfolioAnalysisExchangeInputModelManagedInvestmentPortfolioAnalysisExchangeActionRequest getManagedInvestmentPortfolioAnalysisExchangeActionRequest() {
    return managedInvestmentPortfolioAnalysisExchangeActionRequest;
  }

  public void setManagedInvestmentPortfolioAnalysisExchangeActionRequest(CRManagedInvestmentPortfolioAnalysisExchangeInputModelManagedInvestmentPortfolioAnalysisExchangeActionRequest managedInvestmentPortfolioAnalysisExchangeActionRequest) {
    this.managedInvestmentPortfolioAnalysisExchangeActionRequest = managedInvestmentPortfolioAnalysisExchangeActionRequest;
  }


}

