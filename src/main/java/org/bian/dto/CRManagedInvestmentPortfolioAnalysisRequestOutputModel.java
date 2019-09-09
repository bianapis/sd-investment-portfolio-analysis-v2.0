package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAnalysisRequestOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAnalysisRequestOutputModel
 */
public class CRManagedInvestmentPortfolioAnalysisRequestOutputModel   {
  private CRManagedInvestmentPortfolioAnalysisRequestOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord cRManagedInvestmentPortfolioAnalysisInstanceRecord = null;

  private String managedInvestmentPortfolioAnalysisRequestActionTaskReference = null;

  private Object managedInvestmentPortfolioAnalysisRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get cRManagedInvestmentPortfolioAnalysisInstanceRecord
   * @return cRManagedInvestmentPortfolioAnalysisInstanceRecord
  **/

  public CRManagedInvestmentPortfolioAnalysisRequestOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord getCRManagedInvestmentPortfolioAnalysisInstanceRecord() {
    return cRManagedInvestmentPortfolioAnalysisInstanceRecord;
  }
  @JsonProperty("cRManagedInvestmentPortfolioAnalysisInstanceRecord")
  public void setCRManagedInvestmentPortfolioAnalysisInstanceRecord(CRManagedInvestmentPortfolioAnalysisRequestOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord cRManagedInvestmentPortfolioAnalysisInstanceRecord) {
    this.cRManagedInvestmentPortfolioAnalysisInstanceRecord = cRManagedInvestmentPortfolioAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Managed Investment Portfolio Analysis instance request service call 
   * @return managedInvestmentPortfolioAnalysisRequestActionTaskReference
  **/

  public String getManagedInvestmentPortfolioAnalysisRequestActionTaskReference() {
    return managedInvestmentPortfolioAnalysisRequestActionTaskReference;
  }

  public void setManagedInvestmentPortfolioAnalysisRequestActionTaskReference(String managedInvestmentPortfolioAnalysisRequestActionTaskReference) {
    this.managedInvestmentPortfolioAnalysisRequestActionTaskReference = managedInvestmentPortfolioAnalysisRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return managedInvestmentPortfolioAnalysisRequestActionTaskRecord
  **/

  public Object getManagedInvestmentPortfolioAnalysisRequestActionTaskRecord() {
    return managedInvestmentPortfolioAnalysisRequestActionTaskRecord;
  }

  public void setManagedInvestmentPortfolioAnalysisRequestActionTaskRecord(Object managedInvestmentPortfolioAnalysisRequestActionTaskRecord) {
    this.managedInvestmentPortfolioAnalysisRequestActionTaskRecord = managedInvestmentPortfolioAnalysisRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

