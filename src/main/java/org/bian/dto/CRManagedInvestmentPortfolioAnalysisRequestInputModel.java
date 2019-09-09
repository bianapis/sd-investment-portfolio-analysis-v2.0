package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAnalysisRequestInputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord;
import org.bian.dto.CRManagedInvestmentPortfolioAnalysisRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAnalysisRequestInputModel
 */
public class CRManagedInvestmentPortfolioAnalysisRequestInputModel   {
  private String investmentPortfolioAnalysisServicingSessionReference = null;

  private String managedInvestmentPortfolioAnalysisInstanceReference = null;

  private CRManagedInvestmentPortfolioAnalysisRequestInputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord cRManagedInvestmentPortfolioAnalysisInstanceRecord = null;

  private Object managedInvestmentPortfolioAnalysisRequestActionTaskRecord = null;

  private CRManagedInvestmentPortfolioAnalysisRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRManagedInvestmentPortfolioAnalysisRequestInputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord getCRManagedInvestmentPortfolioAnalysisInstanceRecord() {
    return cRManagedInvestmentPortfolioAnalysisInstanceRecord;
  }

  public void setCRManagedInvestmentPortfolioAnalysisInstanceRecord(CRManagedInvestmentPortfolioAnalysisRequestInputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord cRManagedInvestmentPortfolioAnalysisInstanceRecord) {
    this.cRManagedInvestmentPortfolioAnalysisInstanceRecord = cRManagedInvestmentPortfolioAnalysisInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRManagedInvestmentPortfolioAnalysisRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRManagedInvestmentPortfolioAnalysisRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

