Feature: Get an object from a S3 Bucket
  I want to get an object from a S3 Bucket

  Scenario: Make a Get request to retrieve an object from a S3 Bucket

    When the Get request is made
    Then a succesful response is recieved