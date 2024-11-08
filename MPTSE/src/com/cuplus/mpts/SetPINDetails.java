package com.cuplus.mpts;

import java.io.StringReader;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.cuplus.mptsClient.JsonUtil;
import com.cuplus.mptsClient.MPTSClient;


public class SetPINDetails {

	public String setPINInfo(String requestJSON) {
		/** 
		 * Not working need to get sample xml data
		*/

		System.out.println("Request callSetPIN method = "+requestJSON);
		
		try {
			
			Map<String,Object> requestArgsFromT24 = JsonUtil.parseJson(requestJSON);
			String url = (String) requestArgsFromT24.get("URL");
			String msgId = (String) requestArgsFromT24.get("msg_Id");	
			String msgCode = (String) requestArgsFromT24.get("msg_Code");
			String serviceCode = (String) requestArgsFromT24.get("serviceCode");
			String finCategory = (String) requestArgsFromT24.get("fin_Category");
			String reqCategory = (String) requestArgsFromT24.get("req_Category");
			String serviceClass = (String) requestArgsFromT24.get("service_Class");
			String paramCode = (String) requestArgsFromT24.get("parm_Code");
			String value = (String) requestArgsFromT24.get("Value");
			String parmCode1 = (String) requestArgsFromT24.get("param_code1");
			String value1 = (String) requestArgsFromT24.get("Value1");
			String localdt = (String) requestArgsFromT24.get("local_dt");
			String contractNumber = (String) requestArgsFromT24.get("contract_Number");
			String code = (String) requestArgsFromT24.get("Code");
			String type = (String) requestArgsFromT24.get("Type");
			String hexData = (String) requestArgsFromT24.get("HexData");
			
			
			 String input ="<UFXMsg xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" direction=\"Rq\" msg_type=\"Doc\" scheme=\"WAY4Doc\" version=\"2.0\">"+
			"<MsgId>"+msgId+"</MsgId>"+
			"<Source app=\"OPTXML\"/>"+
			"<MsgData>"+
			 "<Doc>"+
			  "<TransType>"+
			   "<TransCode>"+
			    "<MsgCode>"+msgCode+"</MsgCode>"+
			    "<ServiceCode>"+serviceCode+"</ServiceCode>"+
			    "<FinCategory>"+finCategory+"</FinCategory>"+
			    "<RequestCategory>"+reqCategory+"</RequestCategory>"+
			    "<ServiceClass>"+serviceClass+"</ServiceClass>"+
			   "</TransCode>"+
			   "<TransRules>"+
			    "<TransRule>"+
			    "<ParmCode>"+paramCode+"</ParmCode>"+
			     "<Value>"+value+"</Value>"+
			   "</TransRule>"+
			   "</TransRules>"+
			  "</TransType>"+
			  "<DocRefSet>"+
			   "<Parm>"+
			    "<ParmCode>"+parmCode1+"</ParmCode>"+
			    "<Value>"+value1+"</Value>"+
			   "</Parm>"+
			  "</DocRefSet>"+
			  "<LocalDt>"+localdt+"</LocalDt>"+
			  "<Requestor>"+
			    "<ContractNumber>"+contractNumber+"</ContractNumber>"+
			    "<SecurityData>"+
			     "<SecParm>"+
			      "<Code>"+code+"</Code>"+
			      "<Type>"+type+"</Type>"+
			      "<HexData>"+hexData+"</HexData>"+
			     "</SecParm>"+
			    "</SecurityData>"+
			  "</Requestor>"+
			 "</Doc>"+
			"</MsgData>"+
			"</UFXMsg>";
			
			
			  
			  System.out.println("Set pin details XML::"+input);
			
			  String resp_class=null;
			  String resp_text=null;
			  MPTSClient client= new MPTSClient();
			  String body=client.sendPostRequest(input,url);
			 // int statusCode=response.getStatus();
			  //System.out.println(response);
			  DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
				InputSource src = new InputSource();
				src.setCharacterStream(new StringReader(body));

				Document doc = builder.parse(src);
				NodeList nList = doc.getElementsByTagName("UFXMsg");
				
				for(int temp=0; temp<nList.getLength(); temp++){
					Node node=nList.item(temp);
					System.out.println("");
					if(node.getNodeType()==Node.ELEMENT_NODE){
						Element eElement=(Element)node;
					    resp_text=eElement.getAttribute("resp_text");
					    resp_class=eElement.getAttribute("resp_class");
						/*System.out.println("resp text: "+eElement.getAttribute("resp_text"));
						System.out.println("resp code: "+eElement.getAttribute("resp_code"));
						System.out.println("resp class: "+eElement.getAttribute("resp_class"));*/
					}
				}
			
				if(resp_class.equalsIgnoreCase("E")){
					System.out.println("Failed : HTTP error code  : "+resp_class+" resp text::"+ resp_text);
					return "-1"+ ":" +resp_text;
				}else{

					System.out.println("success : HTTP Success code : "+resp_class+" resp text::"+ resp_text);
					return "0" + ":" +resp_text;
				}
			
		} catch (Exception e) {
			e.printStackTrace();
			return "-1";
		}
		
	
		
	}

}
