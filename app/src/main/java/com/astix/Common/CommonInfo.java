package com.astix.Common;

import android.net.Uri;

import java.io.File;

public class CommonInfo
{


	// Its for Dev Path on 194 Server


	  public static int flgAllRoutesData=1;
	    public static File imageF_savedInstance=null;
	    public static String imageName_savedInstance=null;
	    public static String clickedTagPhoto_savedInstance=null;
	    public static Uri uriSavedImage_savedInstance=null;

	    public static String imei="";
	    public static String SalesQuoteId="BLANK";
	    public static String quatationFlag="";
	    public static String fileContent="";
	    public static String prcID="NULL";

	    public static String newQuottionID="NULL";
	    public static String globalValueOfPaymentStage="0"+"_"+"0"+"_"+"0";



	    public static String WebServicePath="http://103.20.212.194/WebServiceAndroidSancusNetworksSFADevelopment/Service.asmx";
	    public static String VersionDownloadPath="http://103.20.212.194/downloads/";
		public static String VersionDownloadAPKName="SancusNetworksSFADev.apk";

		public static String DATABASE_NAME = "DbSancusNetworksSFAApp";

		public static int AnyVisit = 0;

		public static int DATABASE_VERSIONID = 3;      // put this field value based on value in table on the server
		public static String AppVersionID = "1.0";   // put this field value based on value in table on the server
		public static int Application_TypeID = 2; //1=Parag Store Mapping,2=Parag SFA Indirect,3=Parag SFA Direct

	    public static String OrderSyncPath="http://103.20.212.194/ReadXML_SancusNetworksSFADevelopment/DefaultSFA.aspx";
	    public static String ImageSyncPath="http://103.20.212.194/ReadXML_SancusNetworksImagesDevelopment/Default.aspx";

	    public static String OrderTextSyncPath="http://103.20.212.194/ReadTxtFileForRSPLSFADevelopment/default.aspx";
	    public static String OrderSyncPathDistributorMap="http://103.20.212.194/ReadXML_SancusNetworksSFADevelopment/DefaultSODistributorMapping.aspx";

	    public static String InvoiceSyncPath="http://103.20.212.194/ReadXML_SancusNetworksInvoiceDevelopment/Default.aspx";

	    public static String DistributorSyncPath="http://103.20.212.194/ReadXML_SancusNetworksSFADistributionDevelopment/Default.aspx";

		public static String OrderXMLFolder="SancusNetworksSFAXml";
		public static String ImagesFolder="SancusNetworksSFAImages";
	    public static String TextFileFolder="SancusNetworksTextFile";
	    public static String InvoiceXMLFolder="SancusNetworksInvoiceXml";
		public static String FinalLatLngJsonFile="SancusNetworksSFAFinalLatLngJson";

	    public static final String DistributorMapXMLFolder="SancusNetworksDistributorMapXML";
	    public static final String DistributorStockXMLFolder="SancusNetworksDistributorStockXML";
	    public static final String DistributorCheckInXMLFolder="SancusNetworksDistributorCheckInXML";

		public static String AppLatLngJsonFile="SancusNetworksSFALatLngJson";

		public static int DistanceRange=3000;
	    public static String SalesPersonTodaysTargetMsg="";
	    public static final String Preference="SancusNetworksPrefrence";
        public static final String AttandancePreference="SancusNetworksAttandancePreference";


        public static int CoverageAreaNodeID=0;
        public static int CoverageAreaNodeType=0;
        public static int SalesmanNodeId=0;
        public static int SalesmanNodeType=0;
        public static int flgDataScope=0;
        public static int FlgDSRSO=0;
        public static int DayStartClick=0;
	   public static String ImagesFolderServer="SancusNetworksSFAImagesServer";

//a



}
