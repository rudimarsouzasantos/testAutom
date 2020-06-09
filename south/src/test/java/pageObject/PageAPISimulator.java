package pageObject;

public class PageAPISimulator {
	
	String API = "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador";
	String jsonResponse = "{\"id\":1,\"meses\":[\"112\",\"124\",\"136\",\"148\"],\"valor\":[\"2.802\",\"3.174\",\"3.564\",\"3.971\"]}";
	String xpathJsonResponse = "/html/body/pre";
	
	public String getAPI() {
		return API;
	}
	public String getJsonResponse() {
		return jsonResponse;
	}
	public String getXpathJsonResponse() {
		return xpathJsonResponse;
	}
}
