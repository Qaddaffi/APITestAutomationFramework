@FEATURETEST_:_VisionCore_Health_Check_Status
Feature: Vision Core Health Check Status

@Scenario1_:_VC_HealthCheck_Status_With_No_Failures
Scenario: There entities checked through vision core health check rest service should not have any failures in it

	Given The user wants to check the health of Vision Core application infrastrucure
	When I perform a Get request to fetch the health check status of Vision Core
	And The Vision Core Health Check status is retrived
	Then There should be no failures in the health check status response