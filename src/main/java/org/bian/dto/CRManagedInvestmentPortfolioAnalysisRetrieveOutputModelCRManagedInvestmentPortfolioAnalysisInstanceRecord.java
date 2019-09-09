package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRManagedInvestmentPortfolioAnalysisRetrieveOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecordInvestmentPortfolioAnalysisReport;

import javax.validation.Valid;
  
/**
 * CRManagedInvestmentPortfolioAnalysisRetrieveOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord
 */
public class CRManagedInvestmentPortfolioAnalysisRetrieveOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecord   {
  private String productInstanceReference = null;

  private String customerReference = null;

  private String employeeBusinessUnitReference = null;

  private String investmentPortfolioInstanceReference = null;

  private Object investmentPortfolioInstanceRecord = null;

  private String investmentPortfolioAnalysisSchedule = null;

  private String investmentAccountFulfillmentArrangementInstanceReference = null;

  private CRManagedInvestmentPortfolioAnalysisRetrieveOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecordInvestmentPortfolioAnalysisReport investmentPortfolioAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the investment portfolio product instance 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account primary party/owner 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The employee/business unit with the relationship management responsibilities for the customer 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the investment portfolio record of all holdings  
   * @return investmentPortfolioInstanceReference
  **/

  public String getInvestmentPortfolioInstanceReference() {
    return investmentPortfolioInstanceReference;
  }

  public void setInvestmentPortfolioInstanceReference(String investmentPortfolioInstanceReference) {
    this.investmentPortfolioInstanceReference = investmentPortfolioInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The record of the investment portfolio with the history and projected view of holdings (which may also include a history of valuation) 
   * @return investmentPortfolioInstanceRecord
  **/

  public Object getInvestmentPortfolioInstanceRecord() {
    return investmentPortfolioInstanceRecord;
  }

  public void setInvestmentPortfolioInstanceRecord(Object investmentPortfolioInstanceRecord) {
    this.investmentPortfolioInstanceRecord = investmentPortfolioInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule for performing investment portfolio analysis for the account 
   * @return investmentPortfolioAnalysisSchedule
  **/

  public String getInvestmentPortfolioAnalysisSchedule() {
    return investmentPortfolioAnalysisSchedule;
  }

  public void setInvestmentPortfolioAnalysisSchedule(String investmentPortfolioAnalysisSchedule) {
    this.investmentPortfolioAnalysisSchedule = investmentPortfolioAnalysisSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the underlying investment account 
   * @return investmentAccountFulfillmentArrangementInstanceReference
  **/

  public String getInvestmentAccountFulfillmentArrangementInstanceReference() {
    return investmentAccountFulfillmentArrangementInstanceReference;
  }

  public void setInvestmentAccountFulfillmentArrangementInstanceReference(String investmentAccountFulfillmentArrangementInstanceReference) {
    this.investmentAccountFulfillmentArrangementInstanceReference = investmentAccountFulfillmentArrangementInstanceReference;
  }


  /**
   * Get investmentPortfolioAnalysisReport
   * @return investmentPortfolioAnalysisReport
  **/

  public CRManagedInvestmentPortfolioAnalysisRetrieveOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecordInvestmentPortfolioAnalysisReport getInvestmentPortfolioAnalysisReport() {
    return investmentPortfolioAnalysisReport;
  }

  public void setInvestmentPortfolioAnalysisReport(CRManagedInvestmentPortfolioAnalysisRetrieveOutputModelCRManagedInvestmentPortfolioAnalysisInstanceRecordInvestmentPortfolioAnalysisReport investmentPortfolioAnalysisReport) {
    this.investmentPortfolioAnalysisReport = investmentPortfolioAnalysisReport;
  }


}

