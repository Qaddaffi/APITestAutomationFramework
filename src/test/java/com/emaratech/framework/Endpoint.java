package com.emaratech.framework;

public interface Endpoint {

	String GET_BYCONFIGURATION_ID ="/embassyConfigurations/{configID}";
	String POST_NEW_EMBASSYCONFIGURATION = "/embassyConfigurations";
	String GET_VISIONCORE_HEALTHCHECK = "/rest/healthCheck/check";
	String PUT_UPDATE_EMBASSYCONFIGURATION = "/embassyConfigurations/{configID}";
	String DELETE_EMBASSYCONFIGURATION = "/embassyConfigurations/{configID}";
	String GET_DETACHEDACCOMPANYPROFILEDETAIL_BY_PARENTPROFILEID = "generalEnquiry/getDetachedFromProfiles?detachedPps={ParentPPSID}";
	String GET_BL_ASSOCIATEDCOUNTRY_LIST = "/CountryAssociations/getAssociatedNationalitiesForParent/{ParentCountryID}";

}
