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

public class CreateClientAccountAndCard {

	public String clientAccountAndCardInfo(String requestJSON) {
		

		System.out.println("Request callClientAccountAndCard method = "+requestJSON);
		
		try {
			
			Map<String,Object> requestArgsFromT24 = JsonUtil.parseJson(requestJSON);
			String url = (String) requestArgsFromT24.get("URL");
			String msgId = (String) requestArgsFromT24.get("msg_Id");
			
			String regNumber = (String) requestArgsFromT24.get("reg_number");
			System.out.println("Request JSON from CallMPTSEWS registration number= "+regNumber);
			
			String institution = (String) requestArgsFromT24.get("Institution");
			String objectType = (String) requestArgsFromT24.get("object_type");
			String actionType = (String) requestArgsFromT24.get("action_type");
			
			 
			String clientType = (String) requestArgsFromT24.get("client_type");
			String clientNumber = (String) requestArgsFromT24.get("client_number");
			String shortName = (String) requestArgsFromT24.get("short_name");
			

			String title = (String) requestArgsFromT24.get("title");
			String firstName = (String) requestArgsFromT24.get("first_name");
			String lastName = (String) requestArgsFromT24.get("last_name");
			String middleName = (String) requestArgsFromT24.get("middle_name");
			System.out.println(":::::::::middleName::::::"+middleName);
			String securityName = (String) requestArgsFromT24.get("security_name");
			String country = (String) requestArgsFromT24.get("country");
			String citizenship = (String) requestArgsFromT24.get("citizenship");
			String language = (String) requestArgsFromT24.get("language");
			String maritialStatus = (String) requestArgsFromT24.get("maritial_status");
			String companyName = (String) requestArgsFromT24.get("company_name");
			String birthDate = (String) requestArgsFromT24.get("birth_date");
			//String gender = (String) requestArgsFromT24.get("gender");
			
			String title1 = (String) requestArgsFromT24.get("title");
			String lastName1 = (String) requestArgsFromT24.get("last_name1");
			String companyName1 = (String) requestArgsFromT24.get("company_name1");
			String phoneType1 = (String) requestArgsFromT24.get("phone_type1");
			String phoneNumber1 = (String) requestArgsFromT24.get("phone_number1");
		
			String email = (String) requestArgsFromT24.get("EMail");
			String city = (String) requestArgsFromT24.get("City"); //pass
			String postalCode = (String) requestArgsFromT24.get("postal_code");
			String addressLine1 = (String) requestArgsFromT24.get("address_line1");
			String addressLine2 = (String) requestArgsFromT24.get("address_line2");
			String addressLine3 = (String) requestArgsFromT24.get("address_line3");
			String addressLine4 = (String) requestArgsFromT24.get("address_line4");
			
			String addInfo = (String) requestArgsFromT24.get("addInfo");
			
			String regNumber1 = (String) requestArgsFromT24.get("reg_number1");
			String institution1 = (String) requestArgsFromT24.get("Institution1");
			String objectType1 = (String) requestArgsFromT24.get("object_type1");
			String actionType1 = (String) requestArgsFromT24.get("action_type1");
			
			String rbsNumber = (String) requestArgsFromT24.get("rbs_number1");
			String rbsMemId = (String) requestArgsFromT24.get("rbs_memId");
			String currency = (String) requestArgsFromT24.get("currency");
			String contract_name = (String) requestArgsFromT24.get("contract_name");
			String productCode1 = (String) requestArgsFromT24.get("product_code1");

			String regNumber2 = (String) requestArgsFromT24.get("reg_number2");
			String institution2 = (String) requestArgsFromT24.get("Institution2");
			String objectType2 = (String) requestArgsFromT24.get("object_type2");
			String actionType2 = (String) requestArgsFromT24.get("action_type2");
			
			String contractNumber = (String) requestArgsFromT24.get("contract_number");
			String cbsNumber = (String) requestArgsFromT24.get("cbs_number");
			String currency1 = (String) requestArgsFromT24.get("currency1");
			String contract_name1 = (String) requestArgsFromT24.get("contract_name1");
			String productCode2 = (String) requestArgsFromT24.get("product_code2");
			
		    
		    String regNumber3 = (String) requestArgsFromT24.get("reg_number3");
			String institution3 = (String) requestArgsFromT24.get("Institution3");
			String objectType3 = (String) requestArgsFromT24.get("object_type3");
			String actionType3 = (String) requestArgsFromT24.get("action_type3");
			String code = (String) requestArgsFromT24.get("Code");
			String maxNumber = (String) requestArgsFromT24.get("MaxNumber");
			String amount = (String) requestArgsFromT24.get("Amount");
			String currency2 = (String) requestArgsFromT24.get("currency2");
			String amount1 = (String) requestArgsFromT24.get("Amount1");
			String currency3 = (String) requestArgsFromT24.get("currency3");
			
		    String regNumber4 = (String) requestArgsFromT24.get("reg_number4");
			String institution4 = (String) requestArgsFromT24.get("Institution4");
			String objectType4 = (String) requestArgsFromT24.get("object_type4");
			String actionType4 = (String) requestArgsFromT24.get("action_type4");
			String code1 = (String) requestArgsFromT24.get("Code1");
			String maxNumber1 = (String) requestArgsFromT24.get("MaxNumber1");
			String amount2 = (String) requestArgsFromT24.get("Amount2");
			String currency4 = (String) requestArgsFromT24.get("currency4");
			String amount3 = (String) requestArgsFromT24.get("Amount3");
			String currency5 = (String) requestArgsFromT24.get("currency5");
		    
			String input="";
			
			if((middleName.equalsIgnoreCase("")) || (title.equalsIgnoreCase("")) || (city.equalsIgnoreCase("")) ){
				//System.out.println("title, middleName and city is  empty");
			
				
				if((middleName.equalsIgnoreCase("")) && (title.equalsIgnoreCase("")) && (city.equalsIgnoreCase("")) ){
					System.out.println("All three title, middleName and city is  empty");
					 input =  "<UFXMsg xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"  msg_type=\"Application\" scheme=\"WAY4Appl\" direction=\"Rq\" version=\"2.0\">"+
				    			"<MsgId>201808010016</MsgId>"+
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
					  			//"<MiddleName></MiddleName>"+
					  			"<SecurityName>"+securityName+"</SecurityName>"+
					  			"<Country>"+country+"</Country>"+
					  			"<Citizenship>"+citizenship+"</Citizenship>"+
					  			"<Language>"+language+"</Language>"+
					  			//"<MaritalStatus>"+maritialStatus+"</MaritalStatus>"+
					  			"<BirthDate>"+birthDate+"</BirthDate>"+
					  			//"<BirthPlace></BirthPlace>"+
					  			//"<BirthName></BirthName>"+
					  			//"<Gender>"+gender+"</Gender>"+
					  			"</ClientInfo>"+
					  			"<PlasticInfo>"+
					  			//"<Title>"+title1+"</Title>"+
					  			"<LastName>"+lastName1+"</LastName>"+
					  			"<CompanyName>"+companyName1+"</CompanyName>"+
					  			"</PlasticInfo>"+
					  			"<PhoneList>"+
					  			"<Phone>"+
					  			"<PhoneType>"+phoneType1+"</PhoneType>"+
					  			"<PhoneNumber>"+phoneNumber1+"</PhoneNumber>"+
					  			"</Phone>"+
								"</PhoneList>"+
								"<BaseAddress>"+
								"<EMail>"+email+"</EMail>"+
								"<State></State>"+
								//"<City></City>"+
								"<PostalCode>"+postalCode+"</PostalCode>"+
								"<AddressLine1>"+addressLine1+"</AddressLine1>"+
								"<AddressLine2>"+addressLine2+"</AddressLine2>"+
								"<AddressLine3>"+addressLine3+"</AddressLine3>"+
								"<AddressLine4>"+addressLine4+"</AddressLine4>"+
								"</BaseAddress>"+
								/*"<AddInfo>"+
								"<AddInfo01>"+addInfo+"</AddInfo01>"+
							    "</AddInfo>"+*/
								"</Client>"+
								"</Data>"+
								"<SubApplList>"+
								"<Application>"+
								"<RegNumber>"+regNumber1+"</RegNumber>"+
								"<Institution>"+institution1+"</Institution>"+
								"<ObjectType>"+objectType1+"</ObjectType>"+
								"<ActionType>"+actionType1+"</ActionType>"+
								"<Data>"+
								"<Contract>"+
								"<ContractIDT>"+
								"<RBSNumber>"+rbsNumber+"</RBSNumber>"+
								"<RBSMemberID>"+rbsMemId+"</RBSMemberID>"+
								"</ContractIDT>"+
								"<Currency>"+currency+"</Currency>"+
								"<ContractName>"+contract_name+"</ContractName>"+
								"<Product>"+
								"<ProductCode1>"+productCode1+"</ProductCode1>"+
								"</Product>"+
								"</Contract>"+
								"</Data>"+
								"<SubApplList>"+
								"<Application>"+
								"<RegNumber>"+regNumber2+"</RegNumber>"+
								"<Institution>"+institution2+"</Institution>"+
								"<ObjectType>"+objectType2+"</ObjectType>"+
								"<ActionType>"+actionType2+"</ActionType>"+
								"<Data>"+
								"<Contract>"+
								"<ContractIDT>"+
								"<ContractNumber>"+contractNumber+"</ContractNumber>"+
								"<CBSNumber>"+cbsNumber+"</CBSNumber>"+
								"</ContractIDT>"+
								"<Currency>"+currency1+"</Currency>"+
								"<ContractName>"+contract_name1+"</ContractName>"+
								"<Product>"+
								"<ProductCode1>"+productCode2+"</ProductCode1>"+
								"</Product>"+
								"<AddContractInfo>"+
								"<AddInfo01>"+addInfo+"</AddInfo01>"+
							    "</AddContractInfo>"+
								"</Contract>"+
								"</Data>"+
								"<SubApplList>"+           
				                "<Application>"+
				                 "<RegNumber>"+regNumber3+"</RegNumber>"+
				                   "<Institution>"+institution3+"</Institution>"+
				                   "<ObjectType>"+objectType3+"</ObjectType>"+
				                   "<ActionType>"+actionType3+"</ActionType>"+
				                   "<Data>"+
				                     "<Usage>"+
				                       "<Code>"+code+"</Code>"+
				                       "<MaxNumber>"+maxNumber+"</MaxNumber>"+
				                       "<MaxAmount>"+
				                         "<Amount>"+amount+"</Amount>"+
				                         "<Currency>"+currency2+"</Currency>"+
				                       "</MaxAmount>"+
				                       "<MaxSingleAmount>"+
				                         "<Amount>"+amount1+"</Amount>"+
				                         "<Currency>"+currency3+"</Currency>"+
				                       "</MaxSingleAmount>"+
				                     "</Usage>"+
				                  "</Data>"+
				                 "</Application>"+ 
				                 "<Application>"+
				                   "<RegNumber>"+regNumber4+"</RegNumber>"+
				                   "<Institution>"+institution4+"</Institution>"+
				                   "<ObjectType>"+objectType4+"</ObjectType>"+
				                   "<ActionType>"+actionType4+"</ActionType>"+
				                   "<Data>"+
				                    " <Usage>"+
				                       "<Code>"+code1+"</Code>"+
				                       "<MaxNumber>"+maxNumber1+"</MaxNumber>"+
				                       "<MaxAmount>"+
				                         "<Amount>"+amount2+"</Amount>"+
				                         "<Currency>"+currency4+"</Currency>"+
				                       "</MaxAmount>"+
				                       "<MaxSingleAmount>"+
				                         "<Amount>"+amount3+"</Amount>"+
				                         "<Currency>"+currency5+"</Currency>"+
				                       "</MaxSingleAmount>"+
				                     "</Usage>"+
				                    "</Data>"+
								    "</Application>"+             
								    "</SubApplList>"+        
								    "</Application>"+
								   "</SubApplList>"+   
								   "</Application>"+
								  "</SubApplList>"+
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
					input =  "<UFXMsg xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"  msg_type=\"Application\" scheme=\"WAY4Appl\" direction=\"Rq\" version=\"2.0\">"+
			    			"<MsgId>201808010016</MsgId>"+
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
				  			//"<MiddleName>"+middleName+"</MiddleName>"+
				  			"<SecurityName>"+securityName+"</SecurityName>"+
				  			"<Country>"+country+"</Country>"+
				  			"<Citizenship>"+citizenship+"</Citizenship>"+
				  			"<Language>"+language+"</Language>"+
				  			//"<MaritalStatus>"+maritialStatus+"</MaritalStatus>"+
				  			"<BirthDate>"+birthDate+"</BirthDate>"+
				  			//"<BirthPlace></BirthPlace>"+
				  			//"<BirthName></BirthName>"+
				  			//"<Gender>"+gender+"</Gender>"+
				  			"</ClientInfo>"+
				  			"<PlasticInfo>"+
				  			//"<Title>"+title1+"</Title>"+
				  			"<LastName>"+lastName1+"</LastName>"+
				  			"<CompanyName>"+companyName1+"</CompanyName>"+
				  			"</PlasticInfo>"+
				  			"<PhoneList>"+
				  			"<Phone>"+
				  			"<PhoneType>"+phoneType1+"</PhoneType>"+
				  			"<PhoneNumber>"+phoneNumber1+"</PhoneNumber>"+
				  			"</Phone>"+
							"</PhoneList>"+
							"<BaseAddress>"+
							"<EMail>"+email+"</EMail>"+
							"<State></State>"+
							"<City>"+city+"</City>"+
							"<PostalCode>"+postalCode+"</PostalCode>"+
							"<AddressLine1>"+addressLine1+"</AddressLine1>"+
							"<AddressLine2>"+addressLine2+"</AddressLine2>"+
							"<AddressLine3>"+addressLine3+"</AddressLine3>"+
							"<AddressLine4>"+addressLine4+"</AddressLine4>"+
							"</BaseAddress>"+
							/*"<AddInfo>"+
							"<AddInfo01>"+addInfo+"</AddInfo01>"+
						    "</AddInfo>"+*/
							"</Client>"+
							"</Data>"+
							"<SubApplList>"+
							"<Application>"+
							"<RegNumber>"+regNumber1+"</RegNumber>"+
							"<Institution>"+institution1+"</Institution>"+
							"<ObjectType>"+objectType1+"</ObjectType>"+
							"<ActionType>"+actionType1+"</ActionType>"+
							"<Data>"+
							"<Contract>"+
							"<ContractIDT>"+
							"<RBSNumber>"+rbsNumber+"</RBSNumber>"+
							"<RBSMemberID>"+rbsMemId+"</RBSMemberID>"+
							"</ContractIDT>"+
							"<Currency>"+currency+"</Currency>"+
							"<ContractName>"+contract_name+"</ContractName>"+
							"<Product>"+
							"<ProductCode1>"+productCode1+"</ProductCode1>"+
							"</Product>"+
							"</Contract>"+
							"</Data>"+
							"<SubApplList>"+
							"<Application>"+
							"<RegNumber>"+regNumber2+"</RegNumber>"+
							"<Institution>"+institution2+"</Institution>"+
							"<ObjectType>"+objectType2+"</ObjectType>"+
							"<ActionType>"+actionType2+"</ActionType>"+
							"<Data>"+
							"<Contract>"+
							"<ContractIDT>"+
							"<ContractNumber>"+contractNumber+"</ContractNumber>"+
							"<CBSNumber>"+cbsNumber+"</CBSNumber>"+
							"</ContractIDT>"+
							"<Currency>"+currency1+"</Currency>"+
							"<ContractName>"+contract_name1+"</ContractName>"+
							"<Product>"+
							"<ProductCode1>"+productCode2+"</ProductCode1>"+
							"</Product>"+
							"<AddContractInfo>"+
							"<AddInfo01>"+addInfo+"</AddInfo01>"+
						    "</AddContractInfo>"+
							"</Contract>"+
							"</Data>"+
							"<SubApplList>"+           
			                "<Application>"+
			                 "<RegNumber>"+regNumber3+"</RegNumber>"+
			                   "<Institution>"+institution3+"</Institution>"+
			                   "<ObjectType>"+objectType3+"</ObjectType>"+
			                   "<ActionType>"+actionType3+"</ActionType>"+
			                   "<Data>"+
			                     "<Usage>"+
			                       "<Code>"+code+"</Code>"+
			                       "<MaxNumber>"+maxNumber+"</MaxNumber>"+
			                       "<MaxAmount>"+
			                         "<Amount>"+amount+"</Amount>"+
			                         "<Currency>"+currency2+"</Currency>"+
			                       "</MaxAmount>"+
			                       "<MaxSingleAmount>"+
			                         "<Amount>"+amount1+"</Amount>"+
			                         "<Currency>"+currency3+"</Currency>"+
			                       "</MaxSingleAmount>"+
			                     "</Usage>"+
			                  "</Data>"+
			                 "</Application>"+ 
			                 "<Application>"+
			                   "<RegNumber>"+regNumber4+"</RegNumber>"+
			                   "<Institution>"+institution4+"</Institution>"+
			                   "<ObjectType>"+objectType4+"</ObjectType>"+
			                   "<ActionType>"+actionType4+"</ActionType>"+
			                   "<Data>"+
			                    " <Usage>"+
			                       "<Code>"+code1+"</Code>"+
			                       "<MaxNumber>"+maxNumber1+"</MaxNumber>"+
			                       "<MaxAmount>"+
			                         "<Amount>"+amount2+"</Amount>"+
			                         "<Currency>"+currency4+"</Currency>"+
			                       "</MaxAmount>"+
			                       "<MaxSingleAmount>"+
			                         "<Amount>"+amount3+"</Amount>"+
			                         "<Currency>"+currency5+"</Currency>"+
			                       "</MaxSingleAmount>"+
			                     "</Usage>"+
			                    "</Data>"+
							    "</Application>"+             
							    "</SubApplList>"+        
							    "</Application>"+
							   "</SubApplList>"+   
							   "</Application>"+
							  "</SubApplList>"+
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

					input =  "<UFXMsg xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"  msg_type=\"Application\" scheme=\"WAY4Appl\" direction=\"Rq\" version=\"2.0\">"+
			    			"<MsgId>201808010016</MsgId>"+
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
				  			"<MiddleName>"+middleName+"</MiddleName>"+
				  			"<SecurityName>"+securityName+"</SecurityName>"+
				  			"<Country>"+country+"</Country>"+
				  			"<Citizenship>"+citizenship+"</Citizenship>"+
				  			"<Language>"+language+"</Language>"+
				  			//"<MaritalStatus>"+maritialStatus+"</MaritalStatus>"+
				  			"<BirthDate>"+birthDate+"</BirthDate>"+
				  			//"<BirthPlace></BirthPlace>"+
				  			//"<BirthName></BirthName>"+
				  			//"<Gender>"+gender+"</Gender>"+
				  			"</ClientInfo>"+
				  			"<PlasticInfo>"+
				  			//"<Title>"+title1+"</Title>"+
				  			"<LastName>"+lastName1+"</LastName>"+
				  			"<CompanyName>"+companyName1+"</CompanyName>"+
				  			"</PlasticInfo>"+
				  			"<PhoneList>"+
				  			"<Phone>"+
				  			"<PhoneType>"+phoneType1+"</PhoneType>"+
				  			"<PhoneNumber>"+phoneNumber1+"</PhoneNumber>"+
				  			"</Phone>"+
							"</PhoneList>"+
							"<BaseAddress>"+
							"<EMail>"+email+"</EMail>"+
							"<State></State>"+
							//"<City>"+city+"</City>"+
							"<PostalCode>"+postalCode+"</PostalCode>"+
							"<AddressLine1>"+addressLine1+"</AddressLine1>"+
							"<AddressLine2>"+addressLine2+"</AddressLine2>"+
							"<AddressLine3>"+addressLine3+"</AddressLine3>"+
							"<AddressLine4>"+addressLine4+"</AddressLine4>"+
							"</BaseAddress>"+
							/*"<AddInfo>"+
							"<AddInfo01>"+addInfo+"</AddInfo01>"+
						    "</AddInfo>"+*/
							"</Client>"+
							"</Data>"+
							"<SubApplList>"+
							"<Application>"+
							"<RegNumber>"+regNumber1+"</RegNumber>"+
							"<Institution>"+institution1+"</Institution>"+
							"<ObjectType>"+objectType1+"</ObjectType>"+
							"<ActionType>"+actionType1+"</ActionType>"+
							"<Data>"+
							"<Contract>"+
							"<ContractIDT>"+
							"<RBSNumber>"+rbsNumber+"</RBSNumber>"+
							"<RBSMemberID>"+rbsMemId+"</RBSMemberID>"+
							"</ContractIDT>"+
							"<Currency>"+currency+"</Currency>"+
							"<ContractName>"+contract_name+"</ContractName>"+
							"<Product>"+
							"<ProductCode1>"+productCode1+"</ProductCode1>"+
							"</Product>"+
							"</Contract>"+
							"</Data>"+
							"<SubApplList>"+
							"<Application>"+
							"<RegNumber>"+regNumber2+"</RegNumber>"+
							"<Institution>"+institution2+"</Institution>"+
							"<ObjectType>"+objectType2+"</ObjectType>"+
							"<ActionType>"+actionType2+"</ActionType>"+
							"<Data>"+
							"<Contract>"+
							"<ContractIDT>"+
							"<ContractNumber>"+contractNumber+"</ContractNumber>"+
							"<CBSNumber>"+cbsNumber+"</CBSNumber>"+
							"</ContractIDT>"+
							"<Currency>"+currency1+"</Currency>"+
							"<ContractName>"+contract_name1+"</ContractName>"+
							"<Product>"+
							"<ProductCode1>"+productCode2+"</ProductCode1>"+
							"</Product>"+
							"<AddContractInfo>"+
							"<AddInfo01>"+addInfo+"</AddInfo01>"+
						    "</AddContractInfo>"+
							"</Contract>"+
							"</Data>"+
							"<SubApplList>"+           
			                "<Application>"+
			                 "<RegNumber>"+regNumber3+"</RegNumber>"+
			                   "<Institution>"+institution3+"</Institution>"+
			                   "<ObjectType>"+objectType3+"</ObjectType>"+
			                   "<ActionType>"+actionType3+"</ActionType>"+
			                   "<Data>"+
			                     "<Usage>"+
			                       "<Code>"+code+"</Code>"+
			                       "<MaxNumber>"+maxNumber+"</MaxNumber>"+
			                       "<MaxAmount>"+
			                         "<Amount>"+amount+"</Amount>"+
			                         "<Currency>"+currency2+"</Currency>"+
			                       "</MaxAmount>"+
			                       "<MaxSingleAmount>"+
			                         "<Amount>"+amount1+"</Amount>"+
			                         "<Currency>"+currency3+"</Currency>"+
			                       "</MaxSingleAmount>"+
			                     "</Usage>"+
			                  "</Data>"+
			                 "</Application>"+ 
			                 "<Application>"+
			                   "<RegNumber>"+regNumber4+"</RegNumber>"+
			                   "<Institution>"+institution4+"</Institution>"+
			                   "<ObjectType>"+objectType4+"</ObjectType>"+
			                   "<ActionType>"+actionType4+"</ActionType>"+
			                   "<Data>"+
			                    " <Usage>"+
			                       "<Code>"+code1+"</Code>"+
			                       "<MaxNumber>"+maxNumber1+"</MaxNumber>"+
			                       "<MaxAmount>"+
			                         "<Amount>"+amount2+"</Amount>"+
			                         "<Currency>"+currency4+"</Currency>"+
			                       "</MaxAmount>"+
			                       "<MaxSingleAmount>"+
			                         "<Amount>"+amount3+"</Amount>"+
			                         "<Currency>"+currency5+"</Currency>"+
			                       "</MaxSingleAmount>"+
			                     "</Usage>"+
			                    "</Data>"+
							    "</Application>"+             
							    "</SubApplList>"+        
							    "</Application>"+
							   "</SubApplList>"+   
							   "</Application>"+
							  "</SubApplList>"+
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

					input =  "<UFXMsg xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"  msg_type=\"Application\" scheme=\"WAY4Appl\" direction=\"Rq\" version=\"2.0\">"+
			    			"<MsgId>201808010016</MsgId>"+
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
				  			//"<MiddleName>"+middleName+"</MiddleName>"+
				  			"<SecurityName>"+securityName+"</SecurityName>"+
				  			"<Country>"+country+"</Country>"+
				  			"<Citizenship>"+citizenship+"</Citizenship>"+
				  			"<Language>"+language+"</Language>"+
				  			//"<MaritalStatus>"+maritialStatus+"</MaritalStatus>"+
				  			"<BirthDate>"+birthDate+"</BirthDate>"+
				  			//"<BirthPlace></BirthPlace>"+
				  			//"<BirthName></BirthName>"+
				  			//"<Gender>"+gender+"</Gender>"+
				  			"</ClientInfo>"+
				  			"<PlasticInfo>"+
				  			//"<Title>"+title1+"</Title>"+
				  			"<LastName>"+lastName1+"</LastName>"+
				  			"<CompanyName>"+companyName1+"</CompanyName>"+
				  			"</PlasticInfo>"+
				  			"<PhoneList>"+
				  			"<Phone>"+
				  			"<PhoneType>"+phoneType1+"</PhoneType>"+
				  			"<PhoneNumber>"+phoneNumber1+"</PhoneNumber>"+
				  			"</Phone>"+
							"</PhoneList>"+
							"<BaseAddress>"+
							"<EMail>"+email+"</EMail>"+
							"<State></State>"+
							//"<City>"+city+"</City>"+
							"<PostalCode>"+postalCode+"</PostalCode>"+
							"<AddressLine1>"+addressLine1+"</AddressLine1>"+
							"<AddressLine2>"+addressLine2+"</AddressLine2>"+
							"<AddressLine3>"+addressLine3+"</AddressLine3>"+
							"<AddressLine4>"+addressLine4+"</AddressLine4>"+
							"</BaseAddress>"+
							/*"<AddInfo>"+
							"<AddInfo01>"+addInfo+"</AddInfo01>"+
						    "</AddInfo>"+*/
							"</Client>"+
							"</Data>"+
							"<SubApplList>"+
							"<Application>"+
							"<RegNumber>"+regNumber1+"</RegNumber>"+
							"<Institution>"+institution1+"</Institution>"+
							"<ObjectType>"+objectType1+"</ObjectType>"+
							"<ActionType>"+actionType1+"</ActionType>"+
							"<Data>"+
							"<Contract>"+
							"<ContractIDT>"+
							"<RBSNumber>"+rbsNumber+"</RBSNumber>"+
							"<RBSMemberID>"+rbsMemId+"</RBSMemberID>"+
							"</ContractIDT>"+
							"<Currency>"+currency+"</Currency>"+
							"<ContractName>"+contract_name+"</ContractName>"+
							"<Product>"+
							"<ProductCode1>"+productCode1+"</ProductCode1>"+
							"</Product>"+
							"</Contract>"+
							"</Data>"+
							"<SubApplList>"+
							"<Application>"+
							"<RegNumber>"+regNumber2+"</RegNumber>"+
							"<Institution>"+institution2+"</Institution>"+
							"<ObjectType>"+objectType2+"</ObjectType>"+
							"<ActionType>"+actionType2+"</ActionType>"+
							"<Data>"+
							"<Contract>"+
							"<ContractIDT>"+
							"<ContractNumber>"+contractNumber+"</ContractNumber>"+
							"<CBSNumber>"+cbsNumber+"</CBSNumber>"+
							"</ContractIDT>"+
							"<Currency>"+currency1+"</Currency>"+
							"<ContractName>"+contract_name1+"</ContractName>"+
							"<Product>"+
							"<ProductCode1>"+productCode2+"</ProductCode1>"+
							"</Product>"+
							"<AddContractInfo>"+
							"<AddInfo01>"+addInfo+"</AddInfo01>"+
						    "</AddContractInfo>"+
							"</Contract>"+
							"</Data>"+
							"<SubApplList>"+           
			                "<Application>"+
			                 "<RegNumber>"+regNumber3+"</RegNumber>"+
			                   "<Institution>"+institution3+"</Institution>"+
			                   "<ObjectType>"+objectType3+"</ObjectType>"+
			                   "<ActionType>"+actionType3+"</ActionType>"+
			                   "<Data>"+
			                     "<Usage>"+
			                       "<Code>"+code+"</Code>"+
			                       "<MaxNumber>"+maxNumber+"</MaxNumber>"+
			                       "<MaxAmount>"+
			                         "<Amount>"+amount+"</Amount>"+
			                         "<Currency>"+currency2+"</Currency>"+
			                       "</MaxAmount>"+
			                       "<MaxSingleAmount>"+
			                         "<Amount>"+amount1+"</Amount>"+
			                         "<Currency>"+currency3+"</Currency>"+
			                       "</MaxSingleAmount>"+
			                     "</Usage>"+
			                  "</Data>"+
			                 "</Application>"+ 
			                 "<Application>"+
			                   "<RegNumber>"+regNumber4+"</RegNumber>"+
			                   "<Institution>"+institution4+"</Institution>"+
			                   "<ObjectType>"+objectType4+"</ObjectType>"+
			                   "<ActionType>"+actionType4+"</ActionType>"+
			                   "<Data>"+
			                    " <Usage>"+
			                       "<Code>"+code1+"</Code>"+
			                       "<MaxNumber>"+maxNumber1+"</MaxNumber>"+
			                       "<MaxAmount>"+
			                         "<Amount>"+amount2+"</Amount>"+
			                         "<Currency>"+currency4+"</Currency>"+
			                       "</MaxAmount>"+
			                       "<MaxSingleAmount>"+
			                         "<Amount>"+amount3+"</Amount>"+
			                         "<Currency>"+currency5+"</Currency>"+
			                       "</MaxSingleAmount>"+
			                     "</Usage>"+
			                    "</Data>"+
							    "</Application>"+             
							    "</SubApplList>"+        
							    "</Application>"+
							   "</SubApplList>"+   
							   "</Application>"+
							  "</SubApplList>"+
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

					
					input =  "<UFXMsg xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"  msg_type=\"Application\" scheme=\"WAY4Appl\" direction=\"Rq\" version=\"2.0\">"+
			    			"<MsgId>201808010016</MsgId>"+
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
				  			//"<MiddleName>"+middleName+"</MiddleName>"+
				  			"<SecurityName>"+securityName+"</SecurityName>"+
				  			"<Country>"+country+"</Country>"+
				  			"<Citizenship>"+citizenship+"</Citizenship>"+
				  			"<Language>"+language+"</Language>"+
				  			//"<MaritalStatus>"+maritialStatus+"</MaritalStatus>"+
				  			"<BirthDate>"+birthDate+"</BirthDate>"+
				  			//"<BirthPlace></BirthPlace>"+
				  			//"<BirthName></BirthName>"+
				  			//"<Gender>"+gender+"</Gender>"+
				  			"</ClientInfo>"+
				  			"<PlasticInfo>"+
				  			//"<Title>"+title1+"</Title>"+
				  			"<LastName>"+lastName1+"</LastName>"+
				  			"<CompanyName>"+companyName1+"</CompanyName>"+
				  			"</PlasticInfo>"+
				  			"<PhoneList>"+
				  			"<Phone>"+
				  			"<PhoneType>"+phoneType1+"</PhoneType>"+
				  			"<PhoneNumber>"+phoneNumber1+"</PhoneNumber>"+
				  			"</Phone>"+
							"</PhoneList>"+
							"<BaseAddress>"+
							"<EMail>"+email+"</EMail>"+
							"<State></State>"+
							"<City>"+city+"</City>"+
							"<PostalCode>"+postalCode+"</PostalCode>"+
							"<AddressLine1>"+addressLine1+"</AddressLine1>"+
							"<AddressLine2>"+addressLine2+"</AddressLine2>"+
							"<AddressLine3>"+addressLine3+"</AddressLine3>"+
							"<AddressLine4>"+addressLine4+"</AddressLine4>"+
							"</BaseAddress>"+
							/*"<AddInfo>"+
							"<AddInfo01>"+addInfo+"</AddInfo01>"+
						    "</AddInfo>"+*/
							"</Client>"+
							"</Data>"+
							"<SubApplList>"+
							"<Application>"+
							"<RegNumber>"+regNumber1+"</RegNumber>"+
							"<Institution>"+institution1+"</Institution>"+
							"<ObjectType>"+objectType1+"</ObjectType>"+
							"<ActionType>"+actionType1+"</ActionType>"+
							"<Data>"+
							"<Contract>"+
							"<ContractIDT>"+
							"<RBSNumber>"+rbsNumber+"</RBSNumber>"+
							"<RBSMemberID>"+rbsMemId+"</RBSMemberID>"+
							"</ContractIDT>"+
							"<Currency>"+currency+"</Currency>"+
							"<ContractName>"+contract_name+"</ContractName>"+
							"<Product>"+
							"<ProductCode1>"+productCode1+"</ProductCode1>"+
							"</Product>"+
							"</Contract>"+
							"</Data>"+
							"<SubApplList>"+
							"<Application>"+
							"<RegNumber>"+regNumber2+"</RegNumber>"+
							"<Institution>"+institution2+"</Institution>"+
							"<ObjectType>"+objectType2+"</ObjectType>"+
							"<ActionType>"+actionType2+"</ActionType>"+
							"<Data>"+
							"<Contract>"+
							"<ContractIDT>"+
							"<ContractNumber>"+contractNumber+"</ContractNumber>"+
							"<CBSNumber>"+cbsNumber+"</CBSNumber>"+
							"</ContractIDT>"+
							"<Currency>"+currency1+"</Currency>"+
							"<ContractName>"+contract_name1+"</ContractName>"+
							"<Product>"+
							"<ProductCode1>"+productCode2+"</ProductCode1>"+
							"</Product>"+
							"<AddContractInfo>"+
							"<AddInfo01>"+addInfo+"</AddInfo01>"+
						    "</AddContractInfo>"+
							"</Contract>"+
							"</Data>"+
							"<SubApplList>"+           
			                "<Application>"+
			                 "<RegNumber>"+regNumber3+"</RegNumber>"+
			                   "<Institution>"+institution3+"</Institution>"+
			                   "<ObjectType>"+objectType3+"</ObjectType>"+
			                   "<ActionType>"+actionType3+"</ActionType>"+
			                   "<Data>"+
			                     "<Usage>"+
			                       "<Code>"+code+"</Code>"+
			                       "<MaxNumber>"+maxNumber+"</MaxNumber>"+
			                       "<MaxAmount>"+
			                         "<Amount>"+amount+"</Amount>"+
			                         "<Currency>"+currency2+"</Currency>"+
			                       "</MaxAmount>"+
			                       "<MaxSingleAmount>"+
			                         "<Amount>"+amount1+"</Amount>"+
			                         "<Currency>"+currency3+"</Currency>"+
			                       "</MaxSingleAmount>"+
			                     "</Usage>"+
			                  "</Data>"+
			                 "</Application>"+ 
			                 "<Application>"+
			                   "<RegNumber>"+regNumber4+"</RegNumber>"+
			                   "<Institution>"+institution4+"</Institution>"+
			                   "<ObjectType>"+objectType4+"</ObjectType>"+
			                   "<ActionType>"+actionType4+"</ActionType>"+
			                   "<Data>"+
			                    " <Usage>"+
			                       "<Code>"+code1+"</Code>"+
			                       "<MaxNumber>"+maxNumber1+"</MaxNumber>"+
			                       "<MaxAmount>"+
			                         "<Amount>"+amount2+"</Amount>"+
			                         "<Currency>"+currency4+"</Currency>"+
			                       "</MaxAmount>"+
			                       "<MaxSingleAmount>"+
			                         "<Amount>"+amount3+"</Amount>"+
			                         "<Currency>"+currency5+"</Currency>"+
			                       "</MaxSingleAmount>"+
			                     "</Usage>"+
			                    "</Data>"+
							    "</Application>"+             
							    "</SubApplList>"+        
							    "</Application>"+
							   "</SubApplList>"+   
							   "</Application>"+
							  "</SubApplList>"+
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

					input =  "<UFXMsg xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"  msg_type=\"Application\" scheme=\"WAY4Appl\" direction=\"Rq\" version=\"2.0\">"+
			    			"<MsgId>201808010016</MsgId>"+
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
				  			"<MiddleName>"+middleName+"</MiddleName>"+
				  			"<SecurityName>"+securityName+"</SecurityName>"+
				  			"<Country>"+country+"</Country>"+
				  			"<Citizenship>"+citizenship+"</Citizenship>"+
				  			"<Language>"+language+"</Language>"+
				  			//"<MaritalStatus>"+maritialStatus+"</MaritalStatus>"+
				  			"<BirthDate>"+birthDate+"</BirthDate>"+
				  			//"<BirthPlace></BirthPlace>"+
				  			//"<BirthName></BirthName>"+
				  			//"<Gender>"+gender+"</Gender>"+
				  			"</ClientInfo>"+
				  			"<PlasticInfo>"+
				  			//"<Title>"+title1+"</Title>"+
				  			"<LastName>"+lastName1+"</LastName>"+
				  			"<CompanyName>"+companyName1+"</CompanyName>"+
				  			"</PlasticInfo>"+
				  			"<PhoneList>"+
				  			"<Phone>"+
				  			"<PhoneType>"+phoneType1+"</PhoneType>"+
				  			"<PhoneNumber>"+phoneNumber1+"</PhoneNumber>"+
				  			"</Phone>"+
							"</PhoneList>"+
							"<BaseAddress>"+
							"<EMail>"+email+"</EMail>"+
							"<State></State>"+
							//"<City>"+city+"</City>"+
							"<PostalCode>"+postalCode+"</PostalCode>"+
							"<AddressLine1>"+addressLine1+"</AddressLine1>"+
							"<AddressLine2>"+addressLine2+"</AddressLine2>"+
							"<AddressLine3>"+addressLine3+"</AddressLine3>"+
							"<AddressLine4>"+addressLine4+"</AddressLine4>"+
							"</BaseAddress>"+
							/*"<AddInfo>"+
							"<AddInfo01>"+addInfo+"</AddInfo01>"+
						    "</AddInfo>"+*/
							"</Client>"+
							"</Data>"+
							"<SubApplList>"+
							"<Application>"+
							"<RegNumber>"+regNumber1+"</RegNumber>"+
							"<Institution>"+institution1+"</Institution>"+
							"<ObjectType>"+objectType1+"</ObjectType>"+
							"<ActionType>"+actionType1+"</ActionType>"+
							"<Data>"+
							"<Contract>"+
							"<ContractIDT>"+
							"<RBSNumber>"+rbsNumber+"</RBSNumber>"+
							"<RBSMemberID>"+rbsMemId+"</RBSMemberID>"+
							"</ContractIDT>"+
							"<Currency>"+currency+"</Currency>"+
							"<ContractName>"+contract_name+"</ContractName>"+
							"<Product>"+
							"<ProductCode1>"+productCode1+"</ProductCode1>"+
							"</Product>"+
							"</Contract>"+
							"</Data>"+
							"<SubApplList>"+
							"<Application>"+
							"<RegNumber>"+regNumber2+"</RegNumber>"+
							"<Institution>"+institution2+"</Institution>"+
							"<ObjectType>"+objectType2+"</ObjectType>"+
							"<ActionType>"+actionType2+"</ActionType>"+
							"<Data>"+
							"<Contract>"+
							"<ContractIDT>"+
							"<ContractNumber>"+contractNumber+"</ContractNumber>"+
							"<CBSNumber>"+cbsNumber+"</CBSNumber>"+
							"</ContractIDT>"+
							"<Currency>"+currency1+"</Currency>"+
							"<ContractName>"+contract_name1+"</ContractName>"+
							"<Product>"+
							"<ProductCode1>"+productCode2+"</ProductCode1>"+
							"</Product>"+
							"<AddContractInfo>"+
							"<AddInfo01>"+addInfo+"</AddInfo01>"+
						    "</AddContractInfo>"+
							"</Contract>"+
							"</Data>"+
							"<SubApplList>"+           
			                "<Application>"+
			                 "<RegNumber>"+regNumber3+"</RegNumber>"+
			                   "<Institution>"+institution3+"</Institution>"+
			                   "<ObjectType>"+objectType3+"</ObjectType>"+
			                   "<ActionType>"+actionType3+"</ActionType>"+
			                   "<Data>"+
			                     "<Usage>"+
			                       "<Code>"+code+"</Code>"+
			                       "<MaxNumber>"+maxNumber+"</MaxNumber>"+
			                       "<MaxAmount>"+
			                         "<Amount>"+amount+"</Amount>"+
			                         "<Currency>"+currency2+"</Currency>"+
			                       "</MaxAmount>"+
			                       "<MaxSingleAmount>"+
			                         "<Amount>"+amount1+"</Amount>"+
			                         "<Currency>"+currency3+"</Currency>"+
			                       "</MaxSingleAmount>"+
			                     "</Usage>"+
			                  "</Data>"+
			                 "</Application>"+ 
			                 "<Application>"+
			                   "<RegNumber>"+regNumber4+"</RegNumber>"+
			                   "<Institution>"+institution4+"</Institution>"+
			                   "<ObjectType>"+objectType4+"</ObjectType>"+
			                   "<ActionType>"+actionType4+"</ActionType>"+
			                   "<Data>"+
			                    " <Usage>"+
			                       "<Code>"+code1+"</Code>"+
			                       "<MaxNumber>"+maxNumber1+"</MaxNumber>"+
			                       "<MaxAmount>"+
			                         "<Amount>"+amount2+"</Amount>"+
			                         "<Currency>"+currency4+"</Currency>"+
			                       "</MaxAmount>"+
			                       "<MaxSingleAmount>"+
			                         "<Amount>"+amount3+"</Amount>"+
			                         "<Currency>"+currency5+"</Currency>"+
			                       "</MaxSingleAmount>"+
			                     "</Usage>"+
			                    "</Data>"+
							    "</Application>"+             
							    "</SubApplList>"+        
							    "</Application>"+
							   "</SubApplList>"+   
							   "</Application>"+
							  "</SubApplList>"+
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

					input =  "<UFXMsg xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"  msg_type=\"Application\" scheme=\"WAY4Appl\" direction=\"Rq\" version=\"2.0\">"+
			    			"<MsgId>201808010016</MsgId>"+
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
				  			"<MiddleName>"+middleName+"</MiddleName>"+
				  			"<SecurityName>"+securityName+"</SecurityName>"+
				  			"<Country>"+country+"</Country>"+
				  			"<Citizenship>"+citizenship+"</Citizenship>"+
				  			"<Language>"+language+"</Language>"+
				  			//"<MaritalStatus>"+maritialStatus+"</MaritalStatus>"+
				  			"<BirthDate>"+birthDate+"</BirthDate>"+
				  			//"<BirthPlace></BirthPlace>"+
				  			//"<BirthName></BirthName>"+
				  			//"<Gender>"+gender+"</Gender>"+
				  			"</ClientInfo>"+
				  			"<PlasticInfo>"+
				  			//"<Title>"+title1+"</Title>"+
				  			"<LastName>"+lastName1+"</LastName>"+
				  			"<CompanyName>"+companyName1+"</CompanyName>"+
				  			"</PlasticInfo>"+
				  			"<PhoneList>"+
				  			"<Phone>"+
				  			"<PhoneType>"+phoneType1+"</PhoneType>"+
				  			"<PhoneNumber>"+phoneNumber1+"</PhoneNumber>"+
				  			"</Phone>"+
							"</PhoneList>"+
							"<BaseAddress>"+
							"<EMail>"+email+"</EMail>"+
							"<State></State>"+
							"<City>"+city+"</City>"+
							"<PostalCode>"+postalCode+"</PostalCode>"+
							"<AddressLine1>"+addressLine1+"</AddressLine1>"+
							"<AddressLine2>"+addressLine2+"</AddressLine2>"+
							"<AddressLine3>"+addressLine3+"</AddressLine3>"+
							"<AddressLine4>"+addressLine4+"</AddressLine4>"+
							"</BaseAddress>"+
							/*"<AddInfo>"+
							"<AddInfo01>"+addInfo+"</AddInfo01>"+
						    "</AddInfo>"+*/
							"</Client>"+
							"</Data>"+
							"<SubApplList>"+
							"<Application>"+
							"<RegNumber>"+regNumber1+"</RegNumber>"+
							"<Institution>"+institution1+"</Institution>"+
							"<ObjectType>"+objectType1+"</ObjectType>"+
							"<ActionType>"+actionType1+"</ActionType>"+
							"<Data>"+
							"<Contract>"+
							"<ContractIDT>"+
							"<RBSNumber>"+rbsNumber+"</RBSNumber>"+
							"<RBSMemberID>"+rbsMemId+"</RBSMemberID>"+
							"</ContractIDT>"+
							"<Currency>"+currency+"</Currency>"+
							"<ContractName>"+contract_name+"</ContractName>"+
							"<Product>"+
							"<ProductCode1>"+productCode1+"</ProductCode1>"+
							"</Product>"+
							"</Contract>"+
							"</Data>"+
							"<SubApplList>"+
							"<Application>"+
							"<RegNumber>"+regNumber2+"</RegNumber>"+
							"<Institution>"+institution2+"</Institution>"+
							"<ObjectType>"+objectType2+"</ObjectType>"+
							"<ActionType>"+actionType2+"</ActionType>"+
							"<Data>"+
							"<Contract>"+
							"<ContractIDT>"+
							"<ContractNumber>"+contractNumber+"</ContractNumber>"+
							"<CBSNumber>"+cbsNumber+"</CBSNumber>"+
							"</ContractIDT>"+
							"<Currency>"+currency1+"</Currency>"+
							"<ContractName>"+contract_name1+"</ContractName>"+
							"<Product>"+
							"<ProductCode1>"+productCode2+"</ProductCode1>"+
							"</Product>"+
							"<AddContractInfo>"+
							"<AddInfo01>"+addInfo+"</AddInfo01>"+
						    "</AddContractInfo>"+
							"</Contract>"+
							"</Data>"+
							"<SubApplList>"+           
			                "<Application>"+
			                 "<RegNumber>"+regNumber3+"</RegNumber>"+
			                   "<Institution>"+institution3+"</Institution>"+
			                   "<ObjectType>"+objectType3+"</ObjectType>"+
			                   "<ActionType>"+actionType3+"</ActionType>"+
			                   "<Data>"+
			                     "<Usage>"+
			                       "<Code>"+code+"</Code>"+
			                       "<MaxNumber>"+maxNumber+"</MaxNumber>"+
			                       "<MaxAmount>"+
			                         "<Amount>"+amount+"</Amount>"+
			                         "<Currency>"+currency2+"</Currency>"+
			                       "</MaxAmount>"+
			                       "<MaxSingleAmount>"+
			                         "<Amount>"+amount1+"</Amount>"+
			                         "<Currency>"+currency3+"</Currency>"+
			                       "</MaxSingleAmount>"+
			                     "</Usage>"+
			                  "</Data>"+
			                 "</Application>"+ 
			                 "<Application>"+
			                   "<RegNumber>"+regNumber4+"</RegNumber>"+
			                   "<Institution>"+institution4+"</Institution>"+
			                   "<ObjectType>"+objectType4+"</ObjectType>"+
			                   "<ActionType>"+actionType4+"</ActionType>"+
			                   "<Data>"+
			                    " <Usage>"+
			                       "<Code>"+code1+"</Code>"+
			                       "<MaxNumber>"+maxNumber1+"</MaxNumber>"+
			                       "<MaxAmount>"+
			                         "<Amount>"+amount2+"</Amount>"+
			                         "<Currency>"+currency4+"</Currency>"+
			                       "</MaxAmount>"+
			                       "<MaxSingleAmount>"+
			                         "<Amount>"+amount3+"</Amount>"+
			                         "<Currency>"+currency5+"</Currency>"+
			                       "</MaxSingleAmount>"+
			                     "</Usage>"+
			                    "</Data>"+
							    "</Application>"+             
							    "</SubApplList>"+        
							    "</Application>"+
							   "</SubApplList>"+   
							   "</Application>"+
							  "</SubApplList>"+
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

				input =  "<UFXMsg xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"  msg_type=\"Application\" scheme=\"WAY4Appl\" direction=\"Rq\" version=\"2.0\">"+
		    			"<MsgId>201808010016</MsgId>"+
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
			  			"<MiddleName>"+middleName+"</MiddleName>"+
			  			"<SecurityName>"+securityName+"</SecurityName>"+
			  			"<Country>"+country+"</Country>"+
			  			"<Citizenship>"+citizenship+"</Citizenship>"+
			  			"<Language>"+language+"</Language>"+
			  			//"<MaritalStatus>"+maritialStatus+"</MaritalStatus>"+
			  			"<BirthDate>"+birthDate+"</BirthDate>"+
			  			//"<BirthPlace></BirthPlace>"+
			  			//"<BirthName></BirthName>"+
			  			//"<Gender>"+gender+"</Gender>"+
			  			"</ClientInfo>"+
			  			"<PlasticInfo>"+
			  			//"<Title>"+title1+"</Title>"+
			  			"<LastName>"+lastName1+"</LastName>"+
			  			"<CompanyName>"+companyName1+"</CompanyName>"+
			  			"</PlasticInfo>"+
			  			"<PhoneList>"+
			  			"<Phone>"+
			  			"<PhoneType>"+phoneType1+"</PhoneType>"+
			  			"<PhoneNumber>"+phoneNumber1+"</PhoneNumber>"+
			  			"</Phone>"+
						"</PhoneList>"+
						"<BaseAddress>"+
						"<EMail>"+email+"</EMail>"+
						"<State></State>"+
						"<City>"+city+"</City>"+
						"<PostalCode>"+postalCode+"</PostalCode>"+
						"<AddressLine1>"+addressLine1+"</AddressLine1>"+
						"<AddressLine2>"+addressLine2+"</AddressLine2>"+
						"<AddressLine3>"+addressLine3+"</AddressLine3>"+
						"<AddressLine4>"+addressLine4+"</AddressLine4>"+
						"</BaseAddress>"+
						/*"<AddInfo>"+
						"<AddInfo01>"+addInfo+"</AddInfo01>"+
					    "</AddInfo>"+*/
						"</Client>"+
						"</Data>"+
						"<SubApplList>"+
						"<Application>"+
						"<RegNumber>"+regNumber1+"</RegNumber>"+
						"<Institution>"+institution1+"</Institution>"+
						"<ObjectType>"+objectType1+"</ObjectType>"+
						"<ActionType>"+actionType1+"</ActionType>"+
						"<Data>"+
						"<Contract>"+
						"<ContractIDT>"+
						"<RBSNumber>"+rbsNumber+"</RBSNumber>"+
						"<RBSMemberID>"+rbsMemId+"</RBSMemberID>"+
						"</ContractIDT>"+
						"<Currency>"+currency+"</Currency>"+
						"<ContractName>"+contract_name+"</ContractName>"+
						"<Product>"+
						"<ProductCode1>"+productCode1+"</ProductCode1>"+
						"</Product>"+
						"</Contract>"+
						"</Data>"+
						"<SubApplList>"+
						"<Application>"+
						"<RegNumber>"+regNumber2+"</RegNumber>"+
						"<Institution>"+institution2+"</Institution>"+
						"<ObjectType>"+objectType2+"</ObjectType>"+
						"<ActionType>"+actionType2+"</ActionType>"+
						"<Data>"+
						"<Contract>"+
						"<ContractIDT>"+
						"<ContractNumber>"+contractNumber+"</ContractNumber>"+
						"<CBSNumber>"+cbsNumber+"</CBSNumber>"+
						"</ContractIDT>"+
						"<Currency>"+currency1+"</Currency>"+
						"<ContractName>"+contract_name1+"</ContractName>"+
						"<Product>"+
						"<ProductCode1>"+productCode2+"</ProductCode1>"+
						"</Product>"+
						"<AddContractInfo>"+
						"<AddInfo01>"+addInfo+"</AddInfo01>"+
					    "</AddContractInfo>"+
						"</Contract>"+
						"</Data>"+
						"<SubApplList>"+           
		                "<Application>"+
		                 "<RegNumber>"+regNumber3+"</RegNumber>"+
		                   "<Institution>"+institution3+"</Institution>"+
		                   "<ObjectType>"+objectType3+"</ObjectType>"+
		                   "<ActionType>"+actionType3+"</ActionType>"+
		                   "<Data>"+
		                     "<Usage>"+
		                       "<Code>"+code+"</Code>"+
		                       "<MaxNumber>"+maxNumber+"</MaxNumber>"+
		                       "<MaxAmount>"+
		                         "<Amount>"+amount+"</Amount>"+
		                         "<Currency>"+currency2+"</Currency>"+
		                       "</MaxAmount>"+
		                       "<MaxSingleAmount>"+
		                         "<Amount>"+amount1+"</Amount>"+
		                         "<Currency>"+currency3+"</Currency>"+
		                       "</MaxSingleAmount>"+
		                     "</Usage>"+
		                  "</Data>"+
		                 "</Application>"+ 
		                 "<Application>"+
		                   "<RegNumber>"+regNumber4+"</RegNumber>"+
		                   "<Institution>"+institution4+"</Institution>"+
		                   "<ObjectType>"+objectType4+"</ObjectType>"+
		                   "<ActionType>"+actionType4+"</ActionType>"+
		                   "<Data>"+
		                    " <Usage>"+
		                       "<Code>"+code1+"</Code>"+
		                       "<MaxNumber>"+maxNumber1+"</MaxNumber>"+
		                       "<MaxAmount>"+
		                         "<Amount>"+amount2+"</Amount>"+
		                         "<Currency>"+currency4+"</Currency>"+
		                       "</MaxAmount>"+
		                       "<MaxSingleAmount>"+
		                         "<Amount>"+amount3+"</Amount>"+
		                         "<Currency>"+currency5+"</Currency>"+
		                       "</MaxSingleAmount>"+
		                     "</Usage>"+
		                    "</Data>"+
						    "</Application>"+             
						    "</SubApplList>"+        
						    "</Application>"+
						   "</SubApplList>"+   
						   "</Application>"+
						  "</SubApplList>"+
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
			
			
			
			
			
			
			  return "-1";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "-1";
		}
		
	
		
	}

}
