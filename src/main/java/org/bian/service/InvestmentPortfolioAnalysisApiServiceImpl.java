/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class InvestmentPortfolioAnalysisApiServiceImpl implements InvestmentPortfolioAnalysisApiService {

	public SDInvestmentPortfolioAnalysisActivateOutputModel activate(SDInvestmentPortfolioAnalysisActivateInputModel request){
		return JsonReader.read("activate-SDInvestmentPortfolioAnalysisActivateOutputModel.json",new TypeReference<SDInvestmentPortfolioAnalysisActivateOutputModel>(){});
	}
	
	public SDInvestmentPortfolioAnalysisConfigureOutputModel configure(String sdReferenceId, SDInvestmentPortfolioAnalysisConfigureInputModel request){
		return JsonReader.read("configure-SDInvestmentPortfolioAnalysisConfigureOutputModel.json",new TypeReference<SDInvestmentPortfolioAnalysisConfigureOutputModel>(){});
	}
	
	public CRManagedInvestmentPortfolioAnalysisEvaluateOutputModel evaluate(String sdReferenceId, CRManagedInvestmentPortfolioAnalysisEvaluateInputModel request){
		return JsonReader.read("evaluate-CRManagedInvestmentPortfolioAnalysisEvaluateOutputModel.json",new TypeReference<CRManagedInvestmentPortfolioAnalysisEvaluateOutputModel>(){});
	}
	
	public BQPerformanceAnalysisExchangeOutputModel exchangePerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAnalysisExchangeInputModel request){
		return JsonReader.read("exchange-BQPerformanceAnalysisExchangeOutputModel.json",new TypeReference<BQPerformanceAnalysisExchangeOutputModel>(){});
	}
	
	public CRManagedInvestmentPortfolioAnalysisExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioAnalysisExchangeInputModel request){
		return JsonReader.read("exchange-CRManagedInvestmentPortfolioAnalysisExchangeOutputModel.json",new TypeReference<CRManagedInvestmentPortfolioAnalysisExchangeOutputModel>(){});
	}
	
	public BQPerformanceAnalysisExecuteOutputModel executePerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAnalysisExecuteInputModel request){
		return JsonReader.read("execute-BQPerformanceAnalysisExecuteOutputModel.json",new TypeReference<BQPerformanceAnalysisExecuteOutputModel>(){});
	}
	
	public CRManagedInvestmentPortfolioAnalysisExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioAnalysisExecuteInputModel request){
		return JsonReader.read("execute-CRManagedInvestmentPortfolioAnalysisExecuteOutputModel.json",new TypeReference<CRManagedInvestmentPortfolioAnalysisExecuteOutputModel>(){});
	}
	
	public SDInvestmentPortfolioAnalysisFeedbackOutputModel feedback(String sdReferenceId, SDInvestmentPortfolioAnalysisFeedbackInputModel request){
		return JsonReader.read("feedback-SDInvestmentPortfolioAnalysisFeedbackOutputModel.json",new TypeReference<SDInvestmentPortfolioAnalysisFeedbackOutputModel>(){});
	}
	
	public BQPerformanceAnalysisRequestOutputModel requestPerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAnalysisRequestInputModel request){
		return JsonReader.read("request-BQPerformanceAnalysisRequestOutputModel.json",new TypeReference<BQPerformanceAnalysisRequestOutputModel>(){});
	}
	
	public CRManagedInvestmentPortfolioAnalysisRequestOutputModel request(String sdReferenceId, String crReferenceId, CRManagedInvestmentPortfolioAnalysisRequestInputModel request){
		return JsonReader.read("request-CRManagedInvestmentPortfolioAnalysisRequestOutputModel.json",new TypeReference<CRManagedInvestmentPortfolioAnalysisRequestOutputModel>(){});
	}
	
	public CRManagedInvestmentPortfolioAnalysisRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRManagedInvestmentPortfolioAnalysisRetrieveOutputModel.json",new TypeReference<CRManagedInvestmentPortfolioAnalysisRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQPerformanceAnalysisRetrieveOutputModel retrievePerformanceanalysis(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPerformanceAnalysisRetrieveOutputModel.json",new TypeReference<BQPerformanceAnalysisRetrieveOutputModel>(){});
	}
	
	public SDInvestmentPortfolioAnalysisRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDInvestmentPortfolioAnalysisRetrieveOutputModel.json",new TypeReference<SDInvestmentPortfolioAnalysisRetrieveOutputModel>(){});
	}
	
}
