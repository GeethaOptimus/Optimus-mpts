package com.cuplus.mpts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.cuplus.mptsClient.JsonUtil;

/**
 * @author Geetha
 *
 */
public class MPTSWebService {
	
	public static String callCreateClient(String requestJSON) {
		CreateClient createClient = new CreateClient();
		return createClient.createClientInfo(requestJSON);

	}

	public static String callUpdateClient(String requestJSON) {
		UpdateClient updateClient = new UpdateClient();
		return updateClient.updateClientInfo(requestJSON);

	}

	public static String callCreateAccount(String requestJSON) {
		CreateAccount createAccount = new CreateAccount();
		return createAccount.createAccountInfo(requestJSON);

	}

	public static String callCreateCard(String requestJSON) {
		CreateCard createCard = new CreateCard();
		return createCard.createCardInfo(requestJSON);

	}

	
	public static String callActivateCard(String requestJSON) {
		ActivateCard activateCard = new ActivateCard();
		return activateCard.activateCardInfo(requestJSON);

	}

	public static String callUnlockCard(String requestJSON) {
		UnlockCard unlockCard = new UnlockCard();
		return unlockCard.unlockCardInfo(requestJSON);

	}

	public static String callClearOnlinePin(String requestJSON) {
		ClearOnlinePin clearOnlinePin = new ClearOnlinePin();
		return clearOnlinePin.clearOnlinePinInfo(requestJSON);

	}

	public static String callChangeCardStatus(String requestJSON) {
		ChangeCardStatus changeCardStatus = new ChangeCardStatus();
		return changeCardStatus.changeCardStatusInfo(requestJSON);

	}

	
	public static String callSetPIN(String requestJSON) {
		SetPINDetails setPIN = new SetPINDetails();	
		return setPIN.setPINInfo(requestJSON);

	}
	public static String callClearPIN(String requestJSON) {
		ClearPINDetails clearPIN = new ClearPINDetails();
		return clearPIN.clearPINInfo(requestJSON);

	}
	
	

	public static String  callClientAccountAndCard(String requestJSON) {
		CreateClientAccountAndCard clientAccount= new CreateClientAccountAndCard();
		return clientAccount.clientAccountAndCardInfo(requestJSON);
	}
	
	public static String  callDisableContactless(String requestJSON) {
		DisableContactless disableContactless= new DisableContactless();
		return disableContactless.disableContactlessInfo(requestJSON);
	}
	public static String  callEnableContactless(String requestJSON) {
		EnableContactless enableContactless= new EnableContactless();
		return enableContactless.enableContactlessInfo(requestJSON);
	}

	public static String  callManualEarlierRenew(String requestJSON) {
		ManualEarlierRenew manualEarlierRenew= new ManualEarlierRenew();
		return manualEarlierRenew.manualEarlierRenewInfo(requestJSON);
	}
	
	public static String  callUpdateUsageLimit(String requestJSON) {
		UpdateUsageLimit updateUsageLimit= new UpdateUsageLimit();
		return updateUsageLimit.updateUsageLimitInfo(requestJSON);
	}
	
	
	


public static  Map<String, String> createClientJsonData(){

	  Map<String, String> json= new LinkedHashMap();
	  json.put("URL","http://185.96.11.234:9170/WAY4_Gate/httpadapter");
	  json.put("msg_Id", "201801290007");
	    json.put("reg_number", "201801180001_00045");
	    json.put("Institution", "0022");
	    json.put("object_type", "Client");
	    json.put("action_type", "Add");
	    json.put("client_type", "PR");
		json.put("client_number", "150100026");
		json.put("short_name", "Corina Jordaan");
		json.put("Title", "MRS");
		//json.put("Title", "");
		json.put("first_name", "Corina");
		//json.put("last_name", "Jordaan");
		//json.put("middle_name", "Violeta");
		json.put("middle_name", "");
		json.put("security_name", "Daisa");
		json.put("Country", "GBR");
		json.put("citizen_ship", "GBR");
		json.put("Language", "ENG");
		//json.put("marital_status", "S");
		json.put("birth_date", "1983-11-19");
		//json.put("birth_place", "ROMANIA");
		//json.put("birth_name", "DAISA");
		json.put("Gender", "Female");
		
		json.put("Titl", "MRS");
		json.put("lname", "CORINA JORDAAN");
		json.put("companyName", "INCUTO");
		json.put("phone_type", "Mobile");
		json.put("phone_number", "07881373395");
		
		json.put("EMail", "cjordaan@optimuscards.com");
		//json.put("State", "BERKSHIRE");
		json.put("City", "MAIDENHEAD");
		//json.put("City", "");
		json.put("postal_code", "SL68SY");
		json.put("address_line1", "5 CHESTNUT CLOSE");
		json.put("address_line2", "5 CHESTNUT CLOSE");
		json.put("address_line3", "5 CHESTNUT CLOSE");
		json.put("address_line4", "5 CHESTNUT CLOSE");
	return json;
 }
 
  public static  Map<String, String> updateClientJsonData(){
	  Map<String, String> json= new LinkedHashMap();
	  json.put("URL","http://185.96.11.234:9170/WAY4_Gate/httpadapter");
	  json.put("msg_Id", "201801290007");
	  	json.put("reg_number", "201801290006_00016");
	  	json.put("Institution", "0022");
	    json.put("object_type", "Client");
	    json.put("action_type", "Update");
		json.put("client_number", "150100003");
		json.put("short_name", "Corina Jordaan");
		json.put("client_type", "PR");
		json.put("Title", "MRS");
		json.put("first_name", "Corina");
		json.put("last_name", "Jordaan");
		json.put("middle_name", "Violeta");
		json.put("security_name", "Daisa");
		json.put("Country", "GBR");
		json.put("citizen_ship", "ROU");
		json.put("Language", "ENG");
		json.put("marital_status", "S");
		json.put("birth_date", "1983-11-19");
		json.put("birth_place", "ROMANIA");
		json.put("birth_name", "DAISA");
		json.put("Gender", "Female");
		
		json.put("Title1", "MRS");
		json.put("lst_name", "CORINA V JORDAAN");
		json.put("company_name", "OPTIMUS CARDS");
		json.put("phone_type", "Mobile");
		json.put("phone_number", "07881373395");
		
		json.put("EMail", "cjordaan@optimuscards.com");
		json.put("State", "BERKSHIRE");
		json.put("City", "MAIDENHEAD");
		json.put("postal_code", "SL68SY");
		json.put("address_line1", "5 CHESTNUT CLOSE");
		json.put("address_line2", "Corr Addr Line 2");
		json.put("address_line3", "Corr Addr Line 3");
		json.put("address_line4", "Corr Addr Line 4");
		return json;
  }
  
  public static  Map<String, String> createAccountClientJsonData(){
	  Map<String, String> json= new LinkedHashMap();
	  json.put("URL","http://185.96.11.234:9170/WAY4_Gate/httpadapter");
	  json.put("msg_Id", "201801290007");
	  	json.put("reg_number", "201801290007_00006");//change 
	  	json.put("Institution", "0022");
	    json.put("object_type", "Contract");
	    json.put("action_type", "Add");
		json.put("client_number", "150100001");
		json.put("short_name", "Corina Jordaan");
		//json.put("contract_number", "50100000019");//change 
		json.put("RBS_MemberID", "CBS_OPT");
		json.put("RBS_number", "CBS_OPT");
		//json.put("currency", "GBP");
		//json.put("contract_name", "Current Account");
		json.put("product_code1", "ACC_GBP");
		
		return json;
  }
 
  public static  Map<String, String> createCardClientJsonData(){
	  Map<String, String> json= new LinkedHashMap();
	  json.put("URL","http://185.96.11.234:9170/WAY4_Gate/httpadapter");
	  json.put("msg_Id", "201808010019");
	  	json.put("reg_number", "201808010019_00001");
	  	json.put("Institution", "0022");
	    json.put("object_type", "Contract");
	    json.put("action_type", "Add");
		json.put("RBS_number", "70100000094");
		json.put("RBS_MemberID", "CBS_OPT");
		json.put("contract_number", "5356495701702186");
		json.put("product_code1", "022_OPT_CONS");
		json.put("title", "MR");
		json.put("last_name", "LUKASZ FABIANSKI");
		json.put("company_name", "INCUTO");
		json.put("addInfo","MOBILE_APP=0;PLASTIC_CODE=202");
		
		return json;
  }
  
  public static  Map<String, String> ActivateCardClientJsonData(){
	  Map<String, String> json= new LinkedHashMap();
	  
	  json.put("URL","http://185.96.11.234:9170/WAY4_Gate/httpadapter");
	  	json.put("msg_Id", "201801300001");
	  	json.put("reg_number", "OPT201808010009_10001");
	  	//json.put("contract_number", "5356495701038193");
	  	json.put("object_type", "Card");
	  	json.put("action_type", "Unlock");
		json.put("contr_number", "5356495701038193");
		json.put("short_name", "&lt;&lt;&lt;NONE&gt;&gt;&gt;");

		return json;
  }
  
  
  public static  Map<String, String> UnlockCardClientJsonData(){
	  Map<String, String> json= new LinkedHashMap();
	  json.put("URL","http://185.96.11.234:9170/WAY4_Gate/httpadapter");
	  json.put("msg_Id", "201801300001");
	  	json.put("reg_number", "201801300001_0002");
	  	json.put("Institution", "0022");
	  	json.put("object_type", "Card");
	  	json.put("action_type", "Unlock");
		json.put("contr_number", "5356345401030083");
		json.put("short_name", "&lt;&lt;&lt;NONE&gt;&gt;&gt;");

		return json;
  }
  
  public static  Map<String, String> ClearOnlinePinJsonData(){
	  Map<String, String> json= new LinkedHashMap();
	  json.put("URL","http://185.96.11.234:9170/WAY4_Gate/httpadapter");
	  	json.put("msg_Id", "201801300001");
	  	json.put("reg_number", "201801300001_0002");
	  	json.put("contract_number", "536340000000001");
	  	json.put("object_type", "Contract");
	  	json.put("action_type", "Update");
	  	json.put("parm_code", "AcceptRq");
	  	json.put("value", "Y");
		json.put("contr_number", "536340000000001");
		json.put("clear_atm_pin", "Y");
		
		return json;
  }
  
  public static  Map<String, String> ChangeCardStatusJsonData(){
	  Map<String, String> json= new LinkedHashMap();
	  json.put("URL","http://185.96.11.234:9170/WAY4_Gate/httpadapter");
	  	json.put("msg_Id", "201808020017");
	  	json.put("reg_number", "201808020017_00001");
	  	json.put("Institution", "0022");
	    json.put("object_type", "Event");
	    json.put("action_type", "Add");
		json.put("contract_number", "5356495701702186");
		json.put("action_code", "SET_STATUS_41");
		json.put("short_name", "&lt;&lt;&lt;NONE&gt;&gt;&gt;");
		json.put("comment", "n/a");
		return json;
  }
  
  
 
  public static  Map<String, String> ClearPINJsonData(){
	  Map<String, String> json= new LinkedHashMap();
	  json.put("URL","http://185.96.11.234:9170/WAY4_Gate/httpadapter");
	  	json.put("msg_Id", "201801290007");
	 	json.put("reg_number", "201801240012_00001");
	 	json.put("contract_number", "536340000000001");
	  	json.put("object_type", "Contract");
	    json.put("action_type", "Update");
	    json.put("parmCode", "AcceptRq"); 
		json.put("value", "Y");
		json.put("contr_number", "50100000019");
		json.put("clear_atm_pin", "Y"); 
		
		return json;
  }
  
  public static  Map<String, String> SetPINJsonData(){
	  Map<String, String> json= new LinkedHashMap();
	  json.put("URL","http://185.96.11.234:9170/WAY4_Gate/httpadapter");
	  json.put("msg_Id", "201808030029");
		json.put("msg_Code", "AddServReq");
		json.put("service_Code", "CHANGE_PIN");
		json.put("fin_Category", "Y"); 
		json.put("req_Category", "Q"); 
		json.put("service_Class", "X");
		json.put("parm_Code", "TrustedSource"); 
		json.put("Value", "IVR");
		json.put("param_code1", "RRN");
		json.put("Value1", "180803140833");
		json.put("local_dt", "2018-01-24 12:03:46"); 
		json.put("contract_Number", "5356495701024862"); 
		json.put("Code", "NEW_PIN");
		json.put("Type", "ANSI_HEX"); 
		json.put("HexData", "6F049EA3C94C1C9C");
		
		return json;
  }
  

  
  private static Map<String, String> CreateClientAccountAndCardJsonData() {
	  Map<String, String> json= new LinkedHashMap();
	  json.put("URL","http://185.96.11.234:9170/WAY4_Gate/httpadapter");
	  	json.put("msg_Id", "201808010016");
	  	json.put("reg_number", "201808010016_00001");
	  	json.put("Institution", "0022");
	    json.put("object_type", "client");
	    json.put("action_type", "Add");
	    
	    json.put("client_type", "PR");
	    json.put("client_number", "1701000007");
	    json.put("short_name", "Kamil Grosicki");
	    //json.put("title", "MR");
	    json.put("title", "");
	    json.put("first_name", "Kamil");
		json.put("last_name", "Grosicki");
		//json.put("middle_name", "Violeta");
		json.put("middle_name", "");
		
		
		json.put("security_name", "CONSUM08");
		json.put("country", "GBR");
		json.put("citizenship", "POL");
		json.put("language", "ENG");
		//json.put("maritial_status", "OPT_S");
		
		json.put("birth_date", "1983-11-20");
		//json.put("gender", "Male");
		
		//json.put("title", "MR");
		json.put("last_name1", "KAMIL GROSICKI");
		json.put("company_name1", "INCUTO");
		json.put("phone_type1", "MOBILE");
		json.put("phone_number1", "+447881373395");

		json.put("EMail", "cjordaan@optimuscards.com");
		//json.put("City", "MAIDENHEAD");
		json.put("City", "");
						
		json.put("postal_code", "XX67 8XX");
		json.put("address_line1", "Corr Addr Line 1");
		json.put("address_line2", "Corr Addr Line 2");
		json.put("address_line3", "Corr Addr Line 3");
		json.put("address_line4", "Corr Addr Line 4");
		
		json.put("addInfo","MOBILE_APP=0;PLASTIC_CODE=700");
		
		json.put("reg_number1", "2018008010016_00002");
	  	json.put("Institution1", "0022");
	    json.put("object_type1", "Contract");
	    json.put("action_type1", "Add");
	    
		json.put("rbs_number1", "70100000107");
		json.put("rbs_memId", "CBS_OPT");
		json.put("currency", "GBP");
		json.put("contract_name", "Kamil Grosicki");
		json.put("product_code1", "ACC_GBP");
		
		json.put("reg_number2", "201808010016_00003");
	  	json.put("Institution2", "0022");
	    json.put("object_type2", "Contract");
	    json.put("action_type2", "Add");
	    
	    json.put("contract_number", "5356340000000001");
	    json.put("cbs_number", "201808010016_00005");
	    json.put("currency1", "GBP");
	    json.put("contract_name1", "Kamil Grosicki");
	    json.put("product_code2", "022_OPT_CONS");
	    
	    
	    json.put("reg_number3", "201808030016_10004");
	  	json.put("Institution3", "0022");
	    json.put("object_type3", "Usage");
	    json.put("action_type3", "ActivatePersonal");
	    json.put("Code", "NON_CASH");
	    json.put("MaxNumber", "5");
	    json.put("Amount", "50000");
	    json.put("currency2", "GBP");
	    json.put("Amount1", "5000");
	    json.put("currency3", "GBP");
	    
	    json.put("reg_number4", "201808030016_10005");
	  	json.put("Institution4", "0022");
	    json.put("object_type4", "Usage");
	    json.put("action_type4", "ActivatePersonal");
	    json.put("Code1", "ATM_CASH");
	    json.put("MaxNumber1", "5");
	    json.put("Amount2", "10000");
	    json.put("currency4", "GBP");
	    json.put("Amount3", "1000");
	    json.put("currency5", "GBP");
	    
		return json;
  }
  
  public static  Map<String, String> DisableContactlessJsonData(){
	  Map<String, String> json= new LinkedHashMap();
	  json.put("URL","http://185.96.11.234:9170/WAY4_Gate/httpadapter");
	    json.put("msg_Id", "201808070001");
	  	json.put("reg_number", "201808070001_00001");
	  	json.put("Institution", "0022");
	    json.put("object_type", "ContractClassifier");
	    json.put("action_type", "AddOrUpdate");
	    json.put("contract_number", "5356495701352271");
	    json.put("Code", "CTLS_FLAG");
		json.put("Value", "CTLS_FLAG_OFF");

		return json;
  }
  
  public static Map<String, String> EnableContactlessJsonData() {
	  Map<String, String> json= new LinkedHashMap();
	  json.put("URL","http://185.96.11.234:9170/WAY4_Gate/httpadapter");
	  	json.put("msg_Id", "201808070006");
	  	json.put("reg_number", "201808070006_00001");
	  	json.put("Institution", "0022");
	    json.put("object_type", "ContractClassifier");
	    json.put("action_type", "AddOrUpdate");
	    json.put("contract_number", "5356495701017650");
		json.put("Code", "CTLS_FLAG");
		json.put("Value", "CTLS_FLAG_ON");
		return json;
	}

  public static Map<String, String> ManualEarlierRenewJsonData() {
	  Map<String, String> json= new LinkedHashMap();
	  json.put("URL","http://185.96.11.234:9170/WAY4_Gate/httpadapter");
	  	json.put("msg_Id", "201801240011");
	  	json.put("reg_number", "201801240011_00001");
	  	json.put("Institution", "0022");
	    json.put("object_type", "Card");
	    json.put("action_type", "Update");
	    json.put("contract_name", "5356340000000001");
		json.put("production_type", "Plastic");
		json.put("production_event", "RPLRE");
		json.put("card_expiry", "2107");
		return json;
	}
  public static Map<String, String> UpdateUsageLimitJsonData() {
	  Map<String, String> json= new LinkedHashMap();
	  json.put("URL","http://185.96.11.234:9170/WAY4_Gate/httpadapter");
	  	json.put("msg_Id", "201801240011");
	  	json.put("reg_number", "201808030034_00001");
	  	json.put("Institution", "0022");
	    json.put("object_type", "Usage");
	    json.put("action_type", "ActivatePersonal");
	    json.put("contract_number", "5356495701144660");
	    json.put("short_name", "&lt;&lt;&lt;NONE&gt;&gt;&gt;");
		json.put("code", "NON_CASH");
		json.put("max_number", "20");
		json.put("amount", "5000");
		json.put("currency", "GBP");
		json.put("amount1", "2000");
		json.put("currency1", "GBP");
		//json.put("date_from", "2");
		return json;
	}
  
 
	
	public static void main(String[] args) {

		System.out.println("MPTSE WS Client call");

		Map<String, String> json = new HashMap();

		// CreateClient
	/*	String requestJSON1 = new String();	
		try {
			requestJSON1 = JsonUtil.convertToJson(createClientJsonData());
			callCreateClient(requestJSON1);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		

		// UpdateClient institute, client type CompanyName
		String requestJSON2 = new String();
		  try{ requestJSON2=JsonUtil.convertToJson(updateClientJsonData());
		  callUpdateClient(requestJSON2);
		  }catch(Exception e){ e.printStackTrace(); }

		 System.out.println(callUpdateClient(requestJSON2));
		
		//CreateAccount
	/*	String requestJSON3 = new String();
		try {
			requestJSON3 = JsonUtil.convertToJson(createAccountClientJsonData());
			callCreateAccount(requestJSON3);
		} catch (Exception e) {
			e.printStackTrace();
		}
 
		//CreateCard
			String requestJSON4 = new String();
		try {
			requestJSON4 = JsonUtil.convertToJson(createCardClientJsonData());
			callCreateCard(requestJSON4);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		//ActivateCard
		String requestJSON5 = new String();
		try{ 
			requestJSON5=JsonUtil.convertToJson(ActivateCardClientJsonData());
			callActivateCard(requestJSON5);
		  }catch(Exception e){ e.printStackTrace(); }
	
	
		//UnlockCard 
		 String requestJSON6 = new String();
		try{ 
			requestJSON6=JsonUtil.convertToJson(UnlockCardClientJsonData());
			callUnlockCard(requestJSON6);
		  }catch(Exception e){ e.printStackTrace(); }
		  
			
		//ClearOnlinePinAttempts
		  String requestJSON7 = new String();
		try{ 
			requestJSON7=JsonUtil.convertToJson(ClearOnlinePinJsonData());
			 callClearOnlinePin(requestJSON7);
		  }catch(Exception e){ e.printStackTrace(); }

		 
		//ChangeCardStatus
		  String requestJSON8 = new String();
		try{ 
			requestJSON8=JsonUtil.convertToJson(ChangeCardStatusJsonData());
			  callChangeCardStatus(requestJSON8);
		  }catch(Exception e){ e.printStackTrace(); }
		  
		//ChangeAccountStatus  (no Xml data)
	
		
		//Clear PIN
		  String requestJSON9 = new String();
		try{ 
			requestJSON9=JsonUtil.convertToJson(ClearPINJsonData());
			 callClearPIN(requestJSON9);
			  
		  }catch(Exception e){ e.printStackTrace(); }
	
	  
		//Set PIN
		  String requestJSON10 = new String();
		try{ 
			requestJSON10=JsonUtil.convertToJson(SetPINJsonData());
			callSetPIN(requestJSON10);
		  }catch(Exception e){ e.printStackTrace(); }

		  
		//create card holder and card
	  	
		 
		//CreateClientAccountAndCardJsonData
		  String requestJSON11 = new String();
		try{ 
			requestJSON11=JsonUtil.convertToJson(CreateClientAccountAndCardJsonData());
			 callClientAccountAndCard(requestJSON11);
		  }catch(Exception e){ e.printStackTrace(); }
	
				 
		//DiaableContactless
	   String requestJSON12 = new String();
		try{ 
			requestJSON12=JsonUtil.convertToJson(DisableContactlessJsonData());
			callDisableContactless(requestJSON12);
		  }catch(Exception e){ e.printStackTrace(); }

			  
		//EnableContactless
		  String requestJSON13 = new String();
		try{ 
			requestJSON13=JsonUtil.convertToJson(EnableContactlessJsonData());
			callEnableContactless(requestJSON13);
		  }catch(Exception e){ e.printStackTrace(); }
	*/
		
		//ManualEarlierRenew
		  String requestJSON14 = new String();
			try{ 
				requestJSON14=JsonUtil.convertToJson(ManualEarlierRenewJsonData());
				callManualEarlierRenew(requestJSON14);
			  }catch(Exception e){ e.printStackTrace(); }
	
			//UpdateUsageLimit
	/*	 String requestJSON15 = new String();
			try{ 
				requestJSON15=JsonUtil.convertToJson(UpdateUsageLimitJsonData());
				callUpdateUsageLimit(requestJSON15);
			  }catch(Exception e){ e.printStackTrace(); }
*/
		  
			
	}



}