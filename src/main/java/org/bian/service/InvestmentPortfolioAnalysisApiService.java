/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface InvestmentPortfolioAnalysisApiService {

	SDInvestmentPortfolioAnalysisActivateOutputModel activate(SDInvestmentPortfolioAnalysisActivateInputModel request);
	
	SDInvestmentPortfolioAnalysisConfigureOutputModel configure(String sdReferenceId, SDInvestmentPortfolioAnalysisConfigureInputModel request);
	
	CRManagedInvestmentPortfolioAnalysisEvaluateOutputModel evaluate(String sdReferenceId, CRManagedInvestmentPortfolioAnalysisEvaluateInputModel request);
	
	BQPerformanceAnalysisExchangeOutputModel exchangePerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAnalysisExchangeInputModel request);
	
	CRManagedInvestmentPortfolioAnalysisExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioAnalysisExchangeInputModel request);
	
	BQPerformanceAnalysisExecuteOutputModel executePerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAnalysisExecuteInputModel request);
	
	CRManagedInvestmentPortfolioAnalysisExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioAnalysisExecuteInputModel request);
	
	SDInvestmentPortfolioAnalysisFeedbackOutputModel feedback(String sdReferenceId, SDInvestmentPortfolioAnalysisFeedbackInputModel request);
	
	BQPerformanceAnalysisRequestOutputModel requestPerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAnalysisRequestInputModel request);
	
	CRManagedInvestmentPortfolioAnalysisRequestOutputModel request(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioAnalysisRequestInputModel request);
	
	CRManagedInvestmentPortfolioAnalysisRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQPerformanceAnalysisRetrieveOutputModel retrievePerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDInvestmentPortfolioAnalysisRetrieveOutputModel retrieveSD(String sdReferenceId);
	
}
