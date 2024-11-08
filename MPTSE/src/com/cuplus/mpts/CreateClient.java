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

/**
 * @author Geetha
 *
 */
public class CreateClient {

	
	public String createClientInfo(String requestJSON) {

		System.out.println("Request callCreateClient method = "+requestJSON);

	try {
			Map<String,Object> requestArgsFromT24 = JsonUtil.parseJson(requestJSON);
			String url = (String) requestArgsFromT24.get("URL");
			String msgId = (String) requestArgsFromT24.get("msg_Id");
			
			String regNumber = (String) requestArgsFromT24.get("reg_number");
			System.out.println("Request JSON from CallMPTSEWS = "+regNumber);
			
			String institution = (String) requestArgsFromT24.get("Institution");
			String objectType = (String) requestArgsFromT24.get("object_type");
			String actionType = (String) requestArgsFromT24.get("action_type");
			String clientType = (String) requestArgsFromT24.get("client_type");
			
			String clientNumber = (String) requestArgsFromT24.get("client_number");
			String shortName = (String) requestArgsFromT24.get("short_name");
			String title = (String) requestArgsFromT24.get("Title"); //pass
			System.out.println("title::::::::::::::: "+title);
			String firstName = (String) requestArgsFromT24.get("first_name");
			String lastName = (String) requestArgsFromT24.get("last_name");
			System.out.println("lastName:::::::::::::::= "+lastName);
			String middleName = (String) requestArgsFromT24.get("middle_name");
			System.out.println(":::::::::middleName::::::"+middleName);
			String securityName = (String) requestArgsFromT24.get("security_name");
			String country = (String) requestArgsFromT24.get("Country");
			String citizenship = (String) requestArgsFromT24.get("citizen_ship");
			String language = (String) requestArgsFromT24.get("Language");
			//String maritalStatus = (String) requestArgsFromT24.get("marital_status");
			String birthDate = (String) requestArgsFromT24.get("birth_date");
			//String birthPlace = (String) requestArgsFromT24.get("birth_place");
			//String birthName = (String) requestArgsFromT24.get("birth_name");
			String gender = (String) requestArgsFromT24.get("Gender");
			
			String title1 = (String) requestArgsFromT24.get("Titl");
			String lstName = (String) requestArgsFromT24.get("lname");
			System.out.println("lastName:::::::::lstName::::::"+lstName);
			String companyName = (String) requestArgsFromT24.get("companyName");
			String phoneType = (String) requestArgsFromT24.get("phone_type");
			String phoneNumber = (String) requestArgsFromT24.get("phone_number");
			
			String eMail = (String) requestArgsFromT24.get("EMail");
			String state = (String) requestArgsFromT24.get("State");
			String city = (String) requestArgsFromT24.get("City"); //pass
			String postalCode = (String) requestArgsFromT24.get("postal_code");
			String addressLine1 = (String) requestArgsFromT24.get("address_line1");
			String addressLine2 = (String) requestArgsFromT24.get("address_line2");
			String addressLine3 = (String) requestArgsFromT24.get("address_line3");
			String addressLine4 = (String) requestArgsFromT24.get("address_line4");
			String input="";
			
			if((middleName.equalsIgnoreCase("")) || (title.equalsIgnoreCase("")) || (city.equalsIgnoreCase("")) ){
				//System.out.println("title, middleName and city is  empty");
			
				
				if((middleName.equalsIgnoreCase("")) && (title.equalsIgnoreCase("")) && (city.equalsIgnoreCase("")) ){
					System.out.println("All three title, middleName and city is  empty");

				
				input ="<UFXMsg xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"  msg_type=\"Application\" scheme=\"WAY4Appl\" direction=\"Rq\" version=\"2.0\"> "+
							   " <MsgId>"+msgId+"</MsgId>"+ //201801180001
							    "<Source app=\"OPTXML\"/>"+
							    "<MsgData>"+
							      "<Application>"+
							       "<RegNumber>"+regNumber+"</RegNumber>"+
							        "<Institution>"+institution+"</Institution>"+
							        "<ObjectType>"+objectType+"</ObjectType>"+
							        "<ActionType>"+actionType+"</ActionType>"+
							        "<Data>"+
							         "<Client>"+
							          "<ClientType>"+clientType+"</ClientType>"+
							          "<ClientInfo>"+
							          "<ClientNumber>"+clientNumber+"</ClientNumber>"+
							           		"<ShortName>"+shortName+"</ShortName>"+
								            //"<Title>"+title+"</Title>"+
								            "<FirstName>"+firstName+"</FirstName>"+
								            "<LastName>"+lastName+"</LastName>"+				            
								            //"<MiddleName>"+middleName+"</MiddleName>"+ // pass if data is present
								            "<SecurityName>"+securityName+"</SecurityName>"+
								            "<Country>"+country+"</Country>"+
								            "<Citizenship>"+ citizenship +"</Citizenship>"+
										   "<Language>"+language+"</Language>"+
										 //  "<MaritalStatus>"+maritalStatus+"</MaritalStatus>"+
										   "<BirthDate>"+birthDate+"</BirthDate>"+
										  // "<BirthPlace>"+birthPlace+"</BirthPlace>"+
										  // "<BirthName>"+birthName+"</BirthName>"+
										   "<Gender>"+gender+"</Gender>"+
							          "</ClientInfo>"+
							          "<PlasticInfo>"+
							          "<Title>"+title1+"</Title>"+
							          "<LastName>"+lstName+"</LastName>"+
							          "<CompanyName>"+companyName+"</CompanyName>"+
							           "</PlasticInfo>"+
							          "<PhoneList>"+
							          "<Phone>"+
							           		"<PhoneType>"+phoneType+"</PhoneType>"+
							           		"<PhoneNumber>"+phoneNumber+"</PhoneNumber>"+
							           "</Phone>"+
							           "</PhoneList>"+
							           "<BaseAddress>"+
							           "<EMail>"+eMail+"</EMail>"+
										 "<State>"+state+"</State>"+
										//"<City>"+city+"</City>"+
										"<PostalCode>"+postalCode+"</PostalCode>"+
										"<AddressLine1>"+addressLine1+"</AddressLine1>"+
										"<AddressLine2>"+addressLine2+"</AddressLine2>"+
										"<AddressLine3>"+addressLine3+"</AddressLine3>"+
										"<AddressLine4>"+addressLine4+"</AddressLine4>"+
							       "</BaseAddress>"+
							       "</Client>"+
							     "</Data>"+
							     "</Application>"+
							   "</MsgData>"+
							 "</UFXMsg>";
					
					 System.out.println("Create client XML::"+input);

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
								System.out.println("resp text: "+eElement.getAttribute("resp_text"));
								System.out.println("resp code: "+eElement.getAttribute("resp_code"));
								System.out.println("resp class: "+eElement.getAttribute("resp_class"));
							}
						}
					
						if(resp_class.equalsIgnoreCase("E")){
							System.out.println("Failed : HTTP error code  : "+resp_class+" resp text::"+ resp_text);
							return "-1"+ ":" +resp_text;
						}else{

							System.out.println("success : HTTP Success code : "+resp_class+" resp text::"+ resp_text);
							return "0" + ":" +resp_text;
						}
				
				}
				if((middleName.equalsIgnoreCase("")) && (title.equalsIgnoreCase(""))){
					System.out.println(" middleName and title is  empty");

				
				input ="<UFXMsg xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"  msg_type=\"Application\" scheme=\"WAY4Appl\" direction=\"Rq\" version=\"2.0\"> "+
							   " <MsgId>"+msgId+"</MsgId>"+ //201801180001
							    "<Source app=\"OPTXML\"/>"+
							    "<MsgData>"+
							      "<Application>"+
							       "<RegNumber>"+regNumber+"</RegNumber>"+
							        "<Institution>"+institution+"</Institution>"+
							        "<ObjectType>"+objectType+"</ObjectType>"+
							        "<ActionType>"+actionType+"</ActionType>"+
							        "<Data>"+
							         "<Client>"+
							          "<ClientType>"+clientType+"</ClientType>"+
							          "<ClientInfo>"+
							          "<ClientNumber>"+clientNumber+"</ClientNumber>"+
							           		"<ShortName>"+shortName+"</ShortName>"+
								            //"<Title>"+title+"</Title>"+
								            "<FirstName>"+firstName+"</FirstName>"+
								            "<LastName>"+lastName+"</LastName>"+				            
								           // "<MiddleName>"+middleName+"</MiddleName>"+ // pass if data is present
								            "<SecurityName>"+securityName+"</SecurityName>"+
								            "<Country>"+country+"</Country>"+
								            "<Citizenship>"+ citizenship +"</Citizenship>"+
										   "<Language>"+language+"</Language>"+
										 //  "<MaritalStatus>"+maritalStatus+"</MaritalStatus>"+
										   "<BirthDate>"+birthDate+"</BirthDate>"+
										  // "<BirthPlace>"+birthPlace+"</BirthPlace>"+
										  // "<BirthName>"+birthName+"</BirthName>"+
										   "<Gender>"+gender+"</Gender>"+
							          "</ClientInfo>"+
							          "<PlasticInfo>"+
							          "<Title>"+title1+"</Title>"+
							          "<LastName>"+lstName+"</LastName>"+
							          "<CompanyName>"+companyName+"</CompanyName>"+
							           "</PlasticInfo>"+
							          "<PhoneList>"+
							          "<Phone>"+
							           		"<PhoneType>"+phoneType+"</PhoneType>"+
							           		"<PhoneNumber>"+phoneNumber+"</PhoneNumber>"+
							           "</Phone>"+
							           "</PhoneList>"+
							           "<BaseAddress>"+
							           "<EMail>"+eMail+"</EMail>"+
										 "<State>"+state+"</State>"+
										"<City>"+city+"</City>"+
										"<PostalCode>"+postalCode+"</PostalCode>"+
										"<AddressLine1>"+addressLine1+"</AddressLine1>"+
										"<AddressLine2>"+addressLine2+"</AddressLine2>"+
										"<AddressLine3>"+addressLine3+"</AddressLine3>"+
										"<AddressLine4>"+addressLine4+"</AddressLine4>"+
							       "</BaseAddress>"+
							       "</Client>"+
							     "</Data>"+
							     "</Application>"+
							   "</MsgData>"+
							 "</UFXMsg>";
					
					 System.out.println("Create client XML::"+input);

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
								System.out.println("resp text: "+eElement.getAttribute("resp_text"));
								System.out.println("resp code: "+eElement.getAttribute("resp_code"));
								System.out.println("resp class: "+eElement.getAttribute("resp_class"));
							}
						}
					
						if(resp_class.equalsIgnoreCase("E")){
							System.out.println("Failed : HTTP error code  : "+resp_class+" resp text::"+ resp_text);
							return "-1"+ ":" +resp_text;
						}else{

							System.out.println("success : HTTP Success code : "+resp_class+" resp text::"+ resp_text);
							return "0" + ":" +resp_text;
						}
				
					
				}
				if((title.equalsIgnoreCase("")) && (city.equalsIgnoreCase(""))){
					System.out.println("title  and city is  empty");

					
				input ="<UFXMsg xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"  msg_type=\"Application\" scheme=\"WAY4Appl\" direction=\"Rq\" version=\"2.0\"> "+
							   " <MsgId>"+msgId+"</MsgId>"+ //201801180001
							    "<Source app=\"OPTXML\"/>"+
							    "<MsgData>"+
							      "<Application>"+
							       "<RegNumber>"+regNumber+"</RegNumber>"+
							        "<Institution>"+institution+"</Institution>"+
							        "<ObjectType>"+objectType+"</ObjectType>"+
							        "<ActionType>"+actionType+"</ActionType>"+
							        "<Data>"+
							         "<Client>"+
							          "<ClientType>"+clientType+"</ClientType>"+
							          "<ClientInfo>"+
							          "<ClientNumber>"+clientNumber+"</ClientNumber>"+
							           		"<ShortName>"+shortName+"</ShortName>"+
								            //"<Title>"+title+"</Title>"+
								            "<FirstName>"+firstName+"</FirstName>"+
								            "<LastName>"+lastName+"</LastName>"+				            
								            "<MiddleName>"+middleName+"</MiddleName>"+ // pass if data is present
								            "<SecurityName>"+securityName+"</SecurityName>"+
								            "<Country>"+country+"</Country>"+
								            "<Citizenship>"+ citizenship +"</Citizenship>"+
										   "<Language>"+language+"</Language>"+
										 //  "<MaritalStatus>"+maritalStatus+"</MaritalStatus>"+
										   "<BirthDate>"+birthDate+"</BirthDate>"+
										  // "<BirthPlace>"+birthPlace+"</BirthPlace>"+
										  // "<BirthName>"+birthName+"</BirthName>"+
										   "<Gender>"+gender+"</Gender>"+
							          "</ClientInfo>"+
							          "<PlasticInfo>"+
							          "<Title>"+title1+"</Title>"+
							          "<LastName>"+lstName+"</LastName>"+
							          "<CompanyName>"+companyName+"</CompanyName>"+
							           "</PlasticInfo>"+
							          "<PhoneList>"+
							          "<Phone>"+
							           		"<PhoneType>"+phoneType+"</PhoneType>"+
							           		"<PhoneNumber>"+phoneNumber+"</PhoneNumber>"+
							           "</Phone>"+
							           "</PhoneList>"+
							           "<BaseAddress>"+
							           "<EMail>"+eMail+"</EMail>"+
										 "<State>"+state+"</State>"+
										//"<City>"+city+"</City>"+
										"<PostalCode>"+postalCode+"</PostalCode>"+
										"<AddressLine1>"+addressLine1+"</AddressLine1>"+
										"<AddressLine2>"+addressLine2+"</AddressLine2>"+
										"<AddressLine3>"+addressLine3+"</AddressLine3>"+
										"<AddressLine4>"+addressLine4+"</AddressLine4>"+
							       "</BaseAddress>"+
							       "</Client>"+
							     "</Data>"+
							     "</Application>"+
							   "</MsgData>"+
							 "</UFXMsg>";
					
					 System.out.println("Create client XML::"+input);

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
								System.out.println("resp text: "+eElement.getAttribute("resp_text"));
								System.out.println("resp code: "+eElement.getAttribute("resp_code"));
								System.out.println("resp class: "+eElement.getAttribute("resp_class"));
							}
						}
					
						if(resp_class.equalsIgnoreCase("E")){
							System.out.println("Failed : HTTP error code  : "+resp_class+" resp text::"+ resp_text);
							return "-1"+ ":" +resp_text;
						}else{

							System.out.println("success : HTTP Success code : "+resp_class+" resp text::"+ resp_text);
							return "0" + ":" +resp_text;
						}
				
					
				}
				if((middleName.equalsIgnoreCase(""))  && (city.equalsIgnoreCase("")) ){
					System.out.println(" middleName and city is  empty");

					
				input ="<UFXMsg xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"  msg_type=\"Application\" scheme=\"WAY4Appl\" direction=\"Rq\" version=\"2.0\"> "+
							   " <MsgId>"+msgId+"</MsgId>"+ //201801180001
							    "<Source app=\"OPTXML\"/>"+
							    "<MsgData>"+
							      "<Application>"+
							       "<RegNumber>"+regNumber+"</RegNumber>"+
							        "<Institution>"+institution+"</Institution>"+
							        "<ObjectType>"+objectType+"</ObjectType>"+
							        "<ActionType>"+actionType+"</ActionType>"+
							        "<Data>"+
							         "<Client>"+
							          "<ClientType>"+clientType+"</ClientType>"+
							          "<ClientInfo>"+
							          "<ClientNumber>"+clientNumber+"</ClientNumber>"+
							           		"<ShortName>"+shortName+"</ShortName>"+
								            "<Title>"+title+"</Title>"+
								            "<FirstName>"+firstName+"</FirstName>"+
								            "<LastName>"+lastName+"</LastName>"+				            
								            //"<MiddleName>"+middleName+"</MiddleName>"+ // pass if data is present
								            "<SecurityName>"+securityName+"</SecurityName>"+
								            "<Country>"+country+"</Country>"+
								            "<Citizenship>"+ citizenship +"</Citizenship>"+
										   "<Language>"+language+"</Language>"+
										 //  "<MaritalStatus>"+maritalStatus+"</MaritalStatus>"+
										   "<BirthDate>"+birthDate+"</BirthDate>"+
										  // "<BirthPlace>"+birthPlace+"</BirthPlace>"+
										  // "<BirthName>"+birthName+"</BirthName>"+
										   "<Gender>"+gender+"</Gender>"+
							          "</ClientInfo>"+
							          "<PlasticInfo>"+
							          "<Title>"+title1+"</Title>"+
							          "<LastName>"+lstName+"</LastName>"+
							          "<CompanyName>"+companyName+"</CompanyName>"+
							           "</PlasticInfo>"+
							          "<PhoneList>"+
							          "<Phone>"+
							           		"<PhoneType>"+phoneType+"</PhoneType>"+
							           		"<PhoneNumber>"+phoneNumber+"</PhoneNumber>"+
							           "</Phone>"+
							           "</PhoneList>"+
							           "<BaseAddress>"+
							           "<EMail>"+eMail+"</EMail>"+
										 "<State>"+state+"</State>"+
										//"<City>"+city+"</City>"+
										"<PostalCode>"+postalCode+"</PostalCode>"+
										"<AddressLine1>"+addressLine1+"</AddressLine1>"+
										"<AddressLine2>"+addressLine2+"</AddressLine2>"+
										"<AddressLine3>"+addressLine3+"</AddressLine3>"+
										"<AddressLine4>"+addressLine4+"</AddressLine4>"+
							       "</BaseAddress>"+
							       "</Client>"+
							     "</Data>"+
							     "</Application>"+
							   "</MsgData>"+
							 "</UFXMsg>";
					
					 System.out.println("Create client XML::"+input);

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
								System.out.println("resp text: "+eElement.getAttribute("resp_text"));
								System.out.println("resp code: "+eElement.getAttribute("resp_code"));
								System.out.println("resp class: "+eElement.getAttribute("resp_class"));
							}
						}
					
						if(resp_class.equalsIgnoreCase("E")){
							System.out.println("Failed : HTTP error code  : "+resp_class+" resp text::"+ resp_text);
							return "-1"+ ":" +resp_text;
						}else{

							System.out.println("success : HTTP Success code : "+resp_class+" resp text::"+ resp_text);
							return "0" + ":" +resp_text;
						}
				
				}
				if(middleName.equalsIgnoreCase("")) {
					System.out.println(" middleName is  empty");

					
				input ="<UFXMsg xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"  msg_type=\"Application\" scheme=\"WAY4Appl\" direction=\"Rq\" version=\"2.0\"> "+
							   " <MsgId>"+msgId+"</MsgId>"+ //201801180001
							    "<Source app=\"OPTXML\"/>"+
							    "<MsgData>"+
							      "<Application>"+
							       "<RegNumber>"+regNumber+"</RegNumber>"+
							        "<Institution>"+institution+"</Institution>"+
							        "<ObjectType>"+objectType+"</ObjectType>"+
							        "<ActionType>"+actionType+"</ActionType>"+
							        "<Data>"+
							         "<Client>"+
							          "<ClientType>"+clientType+"</ClientType>"+
							          "<ClientInfo>"+
							          "<ClientNumber>"+clientNumber+"</ClientNumber>"+
							           		"<ShortName>"+shortName+"</ShortName>"+
								            "<Title>"+title+"</Title>"+
								            "<FirstName>"+firstName+"</FirstName>"+
								            "<LastName>"+lastName+"</LastName>"+				            
								           // "<MiddleName>"+middleName+"</MiddleName>"+ // pass if data is present
								            "<SecurityName>"+securityName+"</SecurityName>"+
								            "<Country>"+country+"</Country>"+
								            "<Citizenship>"+ citizenship +"</Citizenship>"+
										   "<Language>"+language+"</Language>"+
										 //  "<MaritalStatus>"+maritalStatus+"</MaritalStatus>"+
										   "<BirthDate>"+birthDate+"</BirthDate>"+
										  // "<BirthPlace>"+birthPlace+"</BirthPlace>"+
										  // "<BirthName>"+birthName+"</BirthName>"+
										   "<Gender>"+gender+"</Gender>"+
							          "</ClientInfo>"+
							          "<PlasticInfo>"+
							          "<Title>"+title1+"</Title>"+
							          "<LastName>"+lstName+"</LastName>"+
							          "<CompanyName>"+companyName+"</CompanyName>"+
							           "</PlasticInfo>"+
							          "<PhoneList>"+
							          "<Phone>"+
							           		"<PhoneType>"+phoneType+"</PhoneType>"+
							           		"<PhoneNumber>"+phoneNumber+"</PhoneNumber>"+
							           "</Phone>"+
							           "</PhoneList>"+
							           "<BaseAddress>"+
							           "<EMail>"+eMail+"</EMail>"+
										 "<State>"+state+"</State>"+
										"<City>"+city+"</City>"+
										"<PostalCode>"+postalCode+"</PostalCode>"+
										"<AddressLine1>"+addressLine1+"</AddressLine1>"+
										"<AddressLine2>"+addressLine2+"</AddressLine2>"+
										"<AddressLine3>"+addressLine3+"</AddressLine3>"+
										"<AddressLine4>"+addressLine4+"</AddressLine4>"+
							       "</BaseAddress>"+
							       "</Client>"+
							     "</Data>"+
							     "</Application>"+
							   "</MsgData>"+
							 "</UFXMsg>";
					
					 System.out.println("Create client XML::"+input);

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
								System.out.println("resp text: "+eElement.getAttribute("resp_text"));
								System.out.println("resp code: "+eElement.getAttribute("resp_code"));
								System.out.println("resp class: "+eElement.getAttribute("resp_class"));
							}
						}
					
						if(resp_class.equalsIgnoreCase("E")){
							System.out.println("Failed : HTTP error code  : "+resp_class+" resp text::"+ resp_text);
							return "-1"+ ":" +resp_text;
						}else{

							System.out.println("success : HTTP Success code : "+resp_class+" resp text::"+ resp_text);
							return "0" + ":" +resp_text;
						}
				
				}
				if(city.equalsIgnoreCase("")) {
					System.out.println(" city is  empty");
				input ="<UFXMsg xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"  msg_type=\"Application\" scheme=\"WAY4Appl\" direction=\"Rq\" version=\"2.0\"> "+
							   " <MsgId>"+msgId+"</MsgId>"+ //201801180001
							    "<Source app=\"OPTXML\"/>"+
							    "<MsgData>"+
							      "<Application>"+
							       "<RegNumber>"+regNumber+"</RegNumber>"+
							        "<Institution>"+institution+"</Institution>"+
							        "<ObjectType>"+objectType+"</ObjectType>"+
							        "<ActionType>"+actionType+"</ActionType>"+
							        "<Data>"+
							         "<Client>"+
							          "<ClientType>"+clientType+"</ClientType>"+
							          "<ClientInfo>"+
							          "<ClientNumber>"+clientNumber+"</ClientNumber>"+
							           		"<ShortName>"+shortName+"</ShortName>"+
								            "<Title>"+title+"</Title>"+
								            "<FirstName>"+firstName+"</FirstName>"+
								            "<LastName>"+lastName+"</LastName>"+				            
								            "<MiddleName>"+middleName+"</MiddleName>"+ // pass if data is present
								            "<SecurityName>"+securityName+"</SecurityName>"+
								            "<Country>"+country+"</Country>"+
								            "<Citizenship>"+ citizenship +"</Citizenship>"+
										   "<Language>"+language+"</Language>"+
										 //  "<MaritalStatus>"+maritalStatus+"</MaritalStatus>"+
										   "<BirthDate>"+birthDate+"</BirthDate>"+
										  // "<BirthPlace>"+birthPlace+"</BirthPlace>"+
										  // "<BirthName>"+birthName+"</BirthName>"+
										   "<Gender>"+gender+"</Gender>"+
							          "</ClientInfo>"+
							          "<PlasticInfo>"+
							          "<Title>"+title1+"</Title>"+
							          "<LastName>"+lstName+"</LastName>"+
							          "<CompanyName>"+companyName+"</CompanyName>"+
							           "</PlasticInfo>"+
							          "<PhoneList>"+
							          "<Phone>"+
							           		"<PhoneType>"+phoneType+"</PhoneType>"+
							           		"<PhoneNumber>"+phoneNumber+"</PhoneNumber>"+
							           "</Phone>"+
							           "</PhoneList>"+
							           "<BaseAddress>"+
							           "<EMail>"+eMail+"</EMail>"+
										 "<State>"+state+"</State>"+
										//"<City>"+city+"</City>"+
										"<PostalCode>"+postalCode+"</PostalCode>"+
										"<AddressLine1>"+addressLine1+"</AddressLine1>"+
										"<AddressLine2>"+addressLine2+"</AddressLine2>"+
										"<AddressLine3>"+addressLine3+"</AddressLine3>"+
										"<AddressLine4>"+addressLine4+"</AddressLine4>"+
							       "</BaseAddress>"+
							       "</Client>"+
							     "</Data>"+
							     "</Application>"+
							   "</MsgData>"+
							 "</UFXMsg>";
					
					 System.out.println("Create client XML::"+input);

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
								System.out.println("resp text: "+eElement.getAttribute("resp_text"));
								System.out.println("resp code: "+eElement.getAttribute("resp_code"));
								System.out.println("resp class: "+eElement.getAttribute("resp_class"));
							}
						}
					
						if(resp_class.equalsIgnoreCase("E")){
							System.out.println("Failed : HTTP error code  : "+resp_class+" resp text::"+ resp_text);
							return "-1"+ ":" +resp_text;
						}else{

							System.out.println("success : HTTP Success code : "+resp_class+" resp text::"+ resp_text);
							return "0" + ":" +resp_text;
						}
				
				}
				if(title.equalsIgnoreCase("")) {
					System.out.println(" title is  empty");
				input ="<UFXMsg xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"  msg_type=\"Application\" scheme=\"WAY4Appl\" direction=\"Rq\" version=\"2.0\"> "+
							   " <MsgId>"+msgId+"</MsgId>"+ //201801180001
							    "<Source app=\"OPTXML\"/>"+
							    "<MsgData>"+
							      "<Application>"+
							       "<RegNumber>"+regNumber+"</RegNumber>"+
							        "<Institution>"+institution+"</Institution>"+
							        "<ObjectType>"+objectType+"</ObjectType>"+
							        "<ActionType>"+actionType+"</ActionType>"+
							        "<Data>"+
							         "<Client>"+
							          "<ClientType>"+clientType+"</ClientType>"+
							          "<ClientInfo>"+
							          "<ClientNumber>"+clientNumber+"</ClientNumber>"+
							           		"<ShortName>"+shortName+"</ShortName>"+
								            //"<Title>"+title+"</Title>"+
								            "<FirstName>"+firstName+"</FirstName>"+
								            "<LastName>"+lastName+"</LastName>"+				            
								            "<MiddleName>"+middleName+"</MiddleName>"+ // pass if data is present
								            "<SecurityName>"+securityName+"</SecurityName>"+
								            "<Country>"+country+"</Country>"+
								            "<Citizenship>"+ citizenship +"</Citizenship>"+
										   "<Language>"+language+"</Language>"+
										 //  "<MaritalStatus>"+maritalStatus+"</MaritalStatus>"+
										   "<BirthDate>"+birthDate+"</BirthDate>"+
										  // "<BirthPlace>"+birthPlace+"</BirthPlace>"+
										  // "<BirthName>"+birthName+"</BirthName>"+
										   "<Gender>"+gender+"</Gender>"+
							          "</ClientInfo>"+
							          "<PlasticInfo>"+
							          "<Title>"+title1+"</Title>"+
							          "<LastName>"+lstName+"</LastName>"+
							          "<CompanyName>"+companyName+"</CompanyName>"+
							           "</PlasticInfo>"+
							          "<PhoneList>"+
							          "<Phone>"+
							           		"<PhoneType>"+phoneType+"</PhoneType>"+
							           		"<PhoneNumber>"+phoneNumber+"</PhoneNumber>"+
							           "</Phone>"+
							           "</PhoneList>"+
							           "<BaseAddress>"+
							           "<EMail>"+eMail+"</EMail>"+
										 "<State>"+state+"</State>"+
										"<City>"+city+"</City>"+
										"<PostalCode>"+postalCode+"</PostalCode>"+
										"<AddressLine1>"+addressLine1+"</AddressLine1>"+
										"<AddressLine2>"+addressLine2+"</AddressLine2>"+
										"<AddressLine3>"+addressLine3+"</AddressLine3>"+
										"<AddressLine4>"+addressLine4+"</AddressLine4>"+
							       "</BaseAddress>"+
							       "</Client>"+
							     "</Data>"+
							     "</Application>"+
							   "</MsgData>"+
							 "</UFXMsg>";
					
					 System.out.println("Create client XML::"+input);

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
								System.out.println("resp text: "+eElement.getAttribute("resp_text"));
								System.out.println("resp code: "+eElement.getAttribute("resp_code"));
								System.out.println("resp class: "+eElement.getAttribute("resp_class"));
							}
						}
					
						if(resp_class.equalsIgnoreCase("E")){
							System.out.println("Failed : HTTP error code  : "+resp_class+" resp text::"+ resp_text);
							return "-1"+ ":" +resp_text;
						}else{

							System.out.println("success : HTTP Success code : "+resp_class+" resp text::"+ resp_text);
							return "0" + ":" +resp_text;
						}
				}
				
			}
			
			if((!middleName.equalsIgnoreCase("")) && (!title.equalsIgnoreCase("")) && (!city.equalsIgnoreCase("")) ){
				System.out.println("title, middleName and city is not empty");
				input ="<UFXMsg xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"  msg_type=\"Application\" scheme=\"WAY4Appl\" direction=\"Rq\" version=\"2.0\"> "+
						   " <MsgId>"+msgId+"</MsgId>"+ //201801180001
						    "<Source app=\"OPTXML\"/>"+
						    "<MsgData>"+
						      "<Application>"+
						       "<RegNumber>"+regNumber+"</RegNumber>"+
						        "<Institution>"+institution+"</Institution>"+
						        "<ObjectType>"+objectType+"</ObjectType>"+
						        "<ActionType>"+actionType+"</ActionType>"+
						        "<Data>"+
						         "<Client>"+
						          "<ClientType>"+clientType+"</ClientType>"+
						          "<ClientInfo>"+
						          "<ClientNumber>"+clientNumber+"</ClientNumber>"+
						           		"<ShortName>"+shortName+"</ShortName>"+
							            "<Title>"+title+"</Title>"+
							            "<FirstName>"+firstName+"</FirstName>"+
							            "<LastName>"+lastName+"</LastName>"+				            
							            "<MiddleName>"+middleName+"</MiddleName>"+ // pass if data is present
							            "<SecurityName>"+securityName+"</SecurityName>"+
							            "<Country>"+country+"</Country>"+
							            "<Citizenship>"+ citizenship +"</Citizenship>"+
									   "<Language>"+language+"</Language>"+
									 //  "<MaritalStatus>"+maritalStatus+"</MaritalStatus>"+
									   "<BirthDate>"+birthDate+"</BirthDate>"+
									  // "<BirthPlace>"+birthPlace+"</BirthPlace>"+
									  // "<BirthName>"+birthName+"</BirthName>"+
									   "<Gender>"+gender+"</Gender>"+
						          "</ClientInfo>"+
						          "<PlasticInfo>"+
						          "<Title>"+title1+"</Title>"+
						          "<LastName>"+lstName+"</LastName>"+
						          "<CompanyName>"+companyName+"</CompanyName>"+
						           "</PlasticInfo>"+
						          "<PhoneList>"+
						          "<Phone>"+
						           		"<PhoneType>"+phoneType+"</PhoneType>"+
						           		"<PhoneNumber>"+phoneNumber+"</PhoneNumber>"+
						           "</Phone>"+
						           "</PhoneList>"+
						           "<BaseAddress>"+
						           "<EMail>"+eMail+"</EMail>"+
									 "<State>"+state+"</State>"+
									"<City>"+city+"</City>"+
									"<PostalCode>"+postalCode+"</PostalCode>"+
									"<AddressLine1>"+addressLine1+"</AddressLine1>"+
									"<AddressLine2>"+addressLine2+"</AddressLine2>"+
									"<AddressLine3>"+addressLine3+"</AddressLine3>"+
									"<AddressLine4>"+addressLine4+"</AddressLine4>"+
						       "</BaseAddress>"+
						       "</Client>"+
						     "</Data>"+
						     "</Application>"+
						   "</MsgData>"+
						 "</UFXMsg>";
				
				 System.out.println("Create client XML::"+input);

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
							System.out.println("resp text: "+eElement.getAttribute("resp_text"));
							System.out.println("resp code: "+eElement.getAttribute("resp_code"));
							System.out.println("resp class: "+eElement.getAttribute("resp_class"));
						}
					}
				
					if(resp_class.equalsIgnoreCase("E")){
						System.out.println("Failed : HTTP error code  : "+resp_class+" resp text::"+ resp_text);
						return "-1"+ ":" +resp_text;
					}else{

						System.out.println("success : HTTP Success code : "+resp_class+" resp text::"+ resp_text);
						return "0" + ":" +resp_text;
					}
			}
			
		
			 
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return "-1";
		}
	return "-1";
	}

}
