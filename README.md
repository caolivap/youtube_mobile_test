# Youtube Mobile Test (youtube_mobile_test)
This is a base project to create multiple automation scenarios in mobile apps applying devco library and other strategies.

# Scenarios

###Scenario 1 **find_a_video_on_youtube.feature**

 In this example we applied the automation devco library using a new implementation for Mobile automation. You can create one automation to run in Android and iOS, just need to implement a new object **"Locator"**, this object contains the information that the Targets require.

## Devco Library
If you  want to use our implementation you can import the library from maven repository.

    implementation 'co.com.devco.automation:automationDevcoLibrary:X.X.X'
Please check in maven repository what version do you need and change it in the line above.

[AutomationDevcoLibrary - MavenRepository](https://mvnrepository.com/artifact/co.com.devco.automation/automationDevcoLibrary)