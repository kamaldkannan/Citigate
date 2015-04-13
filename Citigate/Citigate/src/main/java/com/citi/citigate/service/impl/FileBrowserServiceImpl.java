package com.citi.citigate.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.citi.citigate.rest.resource.Data;
import com.citi.citigate.rest.resource.FileInfo;
import com.citi.citigate.rest.resource.Node;
import com.citi.citigate.service.FileBrowserService;
@Service
public class FileBrowserServiceImpl implements FileBrowserService{

	@Override
	public List<Node> getDirectoryStructure() {
		List<Node> result = new ArrayList<Node>();
		
		
		{
		Node nodeCME = new Node();
		nodeCME.setLabel("CME");
		List<Node> childrenCME = new ArrayList<Node>();
		Node nodeCMEFX = new Node();
		nodeCMEFX.setLabel("FX");

		List<Node> childrenCMEFX = new ArrayList<Node>();
		Node nodeCMEFXDate = new Node();
		nodeCMEFXDate.setLabel("20150401");
		childrenCMEFX.add(nodeCMEFXDate);
		nodeCMEFXDate = new Node();
		nodeCMEFXDate.setLabel("20150402");
		childrenCMEFX.add(nodeCMEFXDate);
		nodeCMEFXDate = new Node();
		nodeCMEFXDate.setLabel("Archive");
		childrenCMEFX.add(nodeCMEFXDate);
		
		nodeCMEFX.setChildren(childrenCMEFX);
		childrenCME.add(nodeCMEFX);
		
		nodeCMEFX = new Node();
		nodeCMEFX.setLabel("CDS");
		childrenCMEFX = new ArrayList<Node>();
		nodeCMEFXDate = new Node();
		nodeCMEFXDate.setLabel("20150401");
		childrenCMEFX.add(nodeCMEFXDate);
		nodeCMEFXDate = new Node();
		nodeCMEFXDate.setLabel("20150402");
		childrenCMEFX.add(nodeCMEFXDate);
		nodeCMEFXDate = new Node();
		nodeCMEFXDate.setLabel("Archive");
		childrenCMEFX.add(nodeCMEFXDate);		
		nodeCMEFX.setChildren(childrenCMEFX);
		childrenCME.add(nodeCMEFX);

		nodeCMEFX = new Node();
		nodeCMEFX.setLabel("IRS");
		childrenCMEFX = new ArrayList<Node>();
		nodeCMEFXDate = new Node();
		nodeCMEFXDate.setLabel("20150401");
		childrenCMEFX.add(nodeCMEFXDate);
		nodeCMEFXDate = new Node();
		nodeCMEFXDate.setLabel("20150402");
		childrenCMEFX.add(nodeCMEFXDate);
		nodeCMEFXDate = new Node();
		nodeCMEFXDate.setLabel("Archive");
		childrenCMEFX.add(nodeCMEFXDate);		
		nodeCMEFX.setChildren(childrenCMEFX);
		childrenCME.add(nodeCMEFX);

		
		nodeCME.setChildren(childrenCME);
		
		result.add(nodeCME);
		}
		
		{
			Node nodeCME = new Node();
			nodeCME.setLabel("LCH");
			List<Node> childrenCME = new ArrayList<Node>();
			Node nodeCMEFX = new Node();
			nodeCMEFX.setLabel("FX");

			List<Node> childrenCMEFX = new ArrayList<Node>();
			Node nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("20150401");
			childrenCMEFX.add(nodeCMEFXDate);
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("20150402");
			childrenCMEFX.add(nodeCMEFXDate);
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("Archive");
			childrenCMEFX.add(nodeCMEFXDate);
			
			nodeCMEFX.setChildren(childrenCMEFX);
			childrenCME.add(nodeCMEFX);
			
			nodeCMEFX = new Node();
			nodeCMEFX.setLabel("CDS");
			childrenCMEFX = new ArrayList<Node>();
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("20150401");
			childrenCMEFX.add(nodeCMEFXDate);
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("20150402");
			childrenCMEFX.add(nodeCMEFXDate);
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("Archive");
			childrenCMEFX.add(nodeCMEFXDate);		
			nodeCMEFX.setChildren(childrenCMEFX);
			childrenCME.add(nodeCMEFX);

			nodeCMEFX = new Node();
			nodeCMEFX.setLabel("IRS");
			childrenCMEFX = new ArrayList<Node>();
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("20150401");
			childrenCMEFX.add(nodeCMEFXDate);
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("20150402");
			childrenCMEFX.add(nodeCMEFXDate);
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("Archive");
			childrenCMEFX.add(nodeCMEFXDate);		
			nodeCMEFX.setChildren(childrenCMEFX);
			childrenCME.add(nodeCMEFX);

			
			nodeCME.setChildren(childrenCME);
			
			result.add(nodeCME);
			}
		
		{
			Node nodeCME = new Node();
			nodeCME.setLabel("JSCC");
			List<Node> childrenCME = new ArrayList<Node>();
			Node nodeCMEFX = new Node();
			nodeCMEFX.setLabel("FX");

			List<Node> childrenCMEFX = new ArrayList<Node>();
			Node nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("20150401");
			childrenCMEFX.add(nodeCMEFXDate);
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("20150402");
			childrenCMEFX.add(nodeCMEFXDate);
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("Archive");
			childrenCMEFX.add(nodeCMEFXDate);
			
			nodeCMEFX.setChildren(childrenCMEFX);
			childrenCME.add(nodeCMEFX);
			
			nodeCMEFX = new Node();
			nodeCMEFX.setLabel("CDS");
			childrenCMEFX = new ArrayList<Node>();
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("20150401");
			childrenCMEFX.add(nodeCMEFXDate);
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("20150402");
			childrenCMEFX.add(nodeCMEFXDate);
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("Archive");
			childrenCMEFX.add(nodeCMEFXDate);		
			nodeCMEFX.setChildren(childrenCMEFX);
			childrenCME.add(nodeCMEFX);

			nodeCMEFX = new Node();
			nodeCMEFX.setLabel("IRS");
			childrenCMEFX = new ArrayList<Node>();
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("20150401");
			childrenCMEFX.add(nodeCMEFXDate);
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("20150402");
			childrenCMEFX.add(nodeCMEFXDate);
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("Archive");
			childrenCMEFX.add(nodeCMEFXDate);		
			nodeCMEFX.setChildren(childrenCMEFX);
			childrenCME.add(nodeCMEFX);

			
			nodeCME.setChildren(childrenCME);
			
			result.add(nodeCME);
			}
		
		{
			Node nodeCME = new Node();
			nodeCME.setLabel("EUREX");
			List<Node> childrenCME = new ArrayList<Node>();
			Node nodeCMEFX = new Node();
			nodeCMEFX.setLabel("FX");

			List<Node> childrenCMEFX = new ArrayList<Node>();
			Node nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("20150401");
			childrenCMEFX.add(nodeCMEFXDate);
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("20150402");
			childrenCMEFX.add(nodeCMEFXDate);
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("Archive");
			childrenCMEFX.add(nodeCMEFXDate);
			
			nodeCMEFX.setChildren(childrenCMEFX);
			childrenCME.add(nodeCMEFX);
			
			nodeCMEFX = new Node();
			nodeCMEFX.setLabel("CDS");
			childrenCMEFX = new ArrayList<Node>();
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("20150401");
			childrenCMEFX.add(nodeCMEFXDate);
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("20150402");
			childrenCMEFX.add(nodeCMEFXDate);
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("Archive");
			childrenCMEFX.add(nodeCMEFXDate);		
			nodeCMEFX.setChildren(childrenCMEFX);
			childrenCME.add(nodeCMEFX);

			nodeCMEFX = new Node();
			nodeCMEFX.setLabel("IRS");
			childrenCMEFX = new ArrayList<Node>();
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("20150401");
			childrenCMEFX.add(nodeCMEFXDate);
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("20150402");
			childrenCMEFX.add(nodeCMEFXDate);
			nodeCMEFXDate = new Node();
			nodeCMEFXDate.setLabel("Archive");
			childrenCMEFX.add(nodeCMEFXDate);		
			nodeCMEFX.setChildren(childrenCMEFX);
			childrenCME.add(nodeCMEFX);

			
			nodeCME.setChildren(childrenCME);
			
			result.add(nodeCME);
			}
		return result;
	}

	@Override
	public List<FileInfo> getFiles() {
		List <FileInfo> fileList = new ArrayList<FileInfo>();
		fileList.add(new FileInfo("370_IRSMR3_20150401.csv", new Date(), new Date(), 34567, "/CME/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("TradePaymentDetail_20150401.csv", new Date(), new Date(), 32242, "/ICE/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("ProjectedPayment_20150401.csv", new Date(), new Date(), 12353, "/ICE/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("SettlementPrices_20150401.csv", new Date(), new Date(), 34567, "/CME/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("RED.CDX.FILE_20150401.csv", new Date(), new Date(), 678456, "/CME/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("EUREX_CASHFORECAST.csv", new Date(), new Date(), 34567, "/EUREX/IRS/CGMI/20150401"));
		fileList.add(new FileInfo("POSITION_REPORT_CDS.csv", new Date(), new Date(), 787888, "/CME/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("Trade_Register_20150401.csv", new Date(), new Date(), 97843, "/CME/IRS/CGMI/20150401"));
		fileList.add(new FileInfo("TradeLevelNPV_PAI_CBANANY_20150401.csv", new Date(), new Date(), 243534, "/LCH/IRS/CBNANY/20150401"));
		fileList.add(new FileInfo("370_IRSMR3_20150401.csv", new Date(), new Date(), 34567, "/CME/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("TradePaymentDetail_20150401.csv", new Date(), new Date(), 32242, "/ICE/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("ProjectedPayment_20150401.csv", new Date(), new Date(), 12353, "/ICE/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("SettlementPrices_20150401.csv", new Date(), new Date(), 34567, "/CME/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("RED.CDX.FILE_20150401.csv", new Date(), new Date(), 678456, "/CME/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("EUREX_CASHFORECAST.csv", new Date(), new Date(), 34567, "/EUREX/IRS/CGMI/20150401"));
		fileList.add(new FileInfo("POSITION_REPORT_CDS.csv", new Date(), new Date(), 787888, "/CME/CDS/CGMI/20150401"));
		/*fileList.add(new FileInfo("Trade_Register_20150401.csv", new Date(), new Date(), 97843, "/CME/IRS/CGMI/20150401"));
		fileList.add(new FileInfo("TradeLevelNPV_PAI_CBANANY_20150401.csv", new Date(), new Date(), 243534, "/LCH/IRS/CBNANY/20150401"));
		fileList.add(new FileInfo("370_IRSMR3_20150401.csv", new Date(), new Date(), 34567, "/CME/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("TradePaymentDetail_20150401.csv", new Date(), new Date(), 32242, "/ICE/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("ProjectedPayment_20150401.csv", new Date(), new Date(), 12353, "/ICE/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("SettlementPrices_20150401.csv", new Date(), new Date(), 34567, "/CME/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("RED.CDX.FILE_20150401.csv", new Date(), new Date(), 678456, "/CME/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("EUREX_CASHFORECAST.csv", new Date(), new Date(), 34567, "/EUREX/IRS/CGMI/20150401"));
		fileList.add(new FileInfo("POSITION_REPORT_CDS.csv", new Date(), new Date(), 787888, "/CME/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("Trade_Register_20150401.csv", new Date(), new Date(), 97843, "/CME/IRS/CGMI/20150401"));
		fileList.add(new FileInfo("TradeLevelNPV_PAI_CBANANY_20150401.csv", new Date(), new Date(), 243534, "/LCH/IRS/CBNANY/20150401"));
		fileList.add(new FileInfo("370_IRSMR3_20150401.csv", new Date(), new Date(), 34567, "/CME/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("TradePaymentDetail_20150401.csv", new Date(), new Date(), 32242, "/ICE/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("ProjectedPayment_20150401.csv", new Date(), new Date(), 12353, "/ICE/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("SettlementPrices_20150401.csv", new Date(), new Date(), 34567, "/CME/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("RED.CDX.FILE_20150401.csv", new Date(), new Date(), 678456, "/CME/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("EUREX_CASHFORECAST.csv", new Date(), new Date(), 34567, "/EUREX/IRS/CGMI/20150401"));
		fileList.add(new FileInfo("POSITION_REPORT_CDS.csv", new Date(), new Date(), 787888, "/CME/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("Trade_Register_20150401.csv", new Date(), new Date(), 97843, "/CME/IRS/CGMI/20150401"));
		fileList.add(new FileInfo("TradeLevelNPV_PAI_CBANANY_20150401.csv", new Date(), new Date(), 243534, "/LCH/IRS/CBNANY/20150401"));
		fileList.add(new FileInfo("370_IRSMR3_20150401.csv", new Date(), new Date(), 34567, "/CME/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("TradePaymentDetail_20150401.csv", new Date(), new Date(), 32242, "/ICE/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("ProjectedPayment_20150401.csv", new Date(), new Date(), 12353, "/ICE/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("SettlementPrices_20150401.csv", new Date(), new Date(), 34567, "/CME/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("RED.CDX.FILE_20150401.csv", new Date(), new Date(), 678456, "/CME/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("EUREX_CASHFORECAST.csv", new Date(), new Date(), 34567, "/EUREX/IRS/CGMI/20150401"));
		fileList.add(new FileInfo("POSITION_REPORT_CDS.csv", new Date(), new Date(), 787888, "/CME/CDS/CGMI/20150401"));
		fileList.add(new FileInfo("Trade_Register_20150401.csv", new Date(), new Date(), 97843, "/CME/IRS/CGMI/20150401"));
		fileList.add(new FileInfo("TradeLevelNPV_PAI_CBANANY_20150401.csv", new Date(), new Date(), 243534, "/LCH/IRS/CBNANY/20150401"));*/
		return fileList;
	}

}
