package pageObject;

public class PageSavingSimulator {
	
	String xpathPofileForYou = "//*[@id=\"formInvestimento\"]/div[1]/input[1]";
	String xpathPofileForCompany = "//*[@id=\"formInvestimento\"]/div[1]/input[2]";
	String valueProfileForYou = "paraVoce"; 
	String valueProfileForCompany = "paraEmpresa";
	String idValueToApply = "valorAplicar";
	String idValueToSaving = "valorInvestir";
	String idMonth = "tempo";
	String xoathBtnSimulator = "//*[@id=\"formInvestimento\"]/div[5]/ul/li[2]/button";
	String txtValueToApply = "20,00";
	String txtValueToSaving = "20,00";
	String txtQtdMonth = "1";
	String xpathTableResultSimulator = "/html/body/div[3]/div/div/div[1]/div/div[2]/div[1]/table";
	String msgErrorToSaving = "Valor mínimo de 20.00";
	String msgErrorToApply = "Valor mínimo de 20.00";
	String idLblMsgErrorApply = "valorAplicar-error";
	String idLblMsgErrorSaving = "valorInvestir-error";
	
	
	
	public String getIdLblMsgErrorApply() {
		return idLblMsgErrorApply;
	}
	public String getIdLblMsgErrorSaving() {
		return idLblMsgErrorSaving;
	}
	public String getXpathTableResultSimulator() {
		return xpathTableResultSimulator;
	}	
	public String getTxtQtdMonth() {
		return txtQtdMonth;
	}
	public String getTxtValueToApply() {
		return txtValueToApply;
	}
	public String getMsgErrorToSaving() {
		return msgErrorToSaving;
	}
	public String getMsgErrorToApply() {
		return msgErrorToApply;
	}
	public String getTxtValueToSaving() {
		return txtValueToSaving;
	}
	public String getXpathPofileForYou() {
		return xpathPofileForYou;
	}
	public String getXpathPofileForCompany() {
		return xpathPofileForCompany;
	}
	public String getValueProfileForYou() {
		return valueProfileForYou;
	}
	public String getValueProfileForCompany() {
		return valueProfileForCompany;
	}
	public String getIdValueToApply() {
		return idValueToApply;
	}
	public String getIdValueToSaving() {
		return idValueToSaving;
	}
	public String getIdMonth() {
		return idMonth;
	}
	public String getXoathBtnSimulator() {
		return xoathBtnSimulator;
	}
	
	
	
}
