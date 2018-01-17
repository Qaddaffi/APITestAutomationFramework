@FEATURETEST_:_Embassy_Configuration_Feature
Feature: Embassy Configuration creation, retrival, update and delete
 
@Scenario1_:_Successfull_Embassy_Configuration_Creation
Scenario: Able to create a new embassy configuration through rest service

		Given The user wants to create a new Embassy Configuration		
		When I post a new create embassy configuration request	
		Then The posted embassy configuration should be saved successfully
		

@Scenario2_:_Successful_Embassy_Configuration_Retrieval
Scenario: Successfull retrival of a valid embassy configuration using ConfigID

		Given A valid embassy configuration exists in embassy configuration table
		When I Perform a Get request method with a ConfigID		
		Then The matching embassy configuration data is retrived
		
@Scenario3_:_Successful_Embassy_Configuration_Updation
Scenario: The user is able to update an existing Embassy Configuration 

		Given An embassy configuration exists in embassy configuration table		
		When I update the embassy configuration details		
		Then The updated embassy configuration should be successfully saved


@Scenario4_:_Successful_Embassy_Configuration_Deletion
Scenario: The user is able to make an existing embassy configuration inactive successfully

		Given A valid Embassy Configuration exists in Vision		
		When I delete an Embassy Configuration		
		Then The Embassy Configuration status should be deleted successfully
		And The status of the deleted Embassy Configuration should be Inactive
		

		
		
