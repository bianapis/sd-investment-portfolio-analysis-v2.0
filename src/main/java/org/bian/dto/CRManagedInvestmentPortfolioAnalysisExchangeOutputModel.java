package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAnalysisExchangeOutputModel
 */
public class CRManagedInvestmentPortfolioAnalysisExchangeOutputModel   {
  private String managedInvestmentPortfolioAnalysisExchangeActionTaskReference = null;

  private Object managedInvestmentPortfolioAnalysisExchangeActionTaskRecord = null;

  private String managedInvestmentPortfolioAnalysisExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Managed Investment Portfolio Analysis instance exchange service call 
   * @return managedInvestmentPortfolioAnalysisExchangeActionTaskReference
  **/

  public String getManagedInvestmentPortfolioAnalysisExchangeActionTaskReference() {
    return managedInvestmentPortfolioAnalysisExchangeActionTaskReference;
  }

  public void setManagedInvestmentPortfolioAnalysisExchangeActionTaskReference(String managedInvestmentPortfolioAnalysisExchangeActionTaskReference) {
    this.managedInvestmentPortfolioAnalysisExchangeActionTaskReference = managedInvestmentPortfolioAnalysisExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return managedInvestmentPortfolioAnalysisExchangeActionResponse
  **/

  public String getManagedInvestmentPortfolioAnalysisExchangeActionResponse() {
    return managedInvestmentPortfolioAnalysisExchangeActionResponse;
  }

  public void setManagedInvestmentPortfolioAnalysisExchangeActionResponse(String managedInvestmentPortfolioAnalysisExchangeActionResponse) {
    this.managedInvestmentPortfolioAnalysisExchangeActionResponse = managedInvestmentPortfolioAnalysisExchangeActionResponse;
  }


}

