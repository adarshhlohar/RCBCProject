<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>PortalPrePostWithSTP</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>a64f9810-3e15-4854-abfb-3ee4641ad160</testSuiteGuid>
   <testCaseLink>
      <guid>aa631f44-b0a0-4d22-9373-74813072caca</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Digital_STPWithAndWithoutAPI/DigitalPotal/LoginPage</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>6801b82e-1901-4bbe-bf13-d155893252fc</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Digital_STPWithAndWithoutAPI/DigitalPotal/HomePage</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>737a6ceb-d750-463f-bbe7-56c5d29fd807</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Digital_STPWithAndWithoutAPI/DigitalPotal/SelectAutoLoan</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>542ced6c-78c9-4b02-a2e9-9fd09ce7b9f2</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Digital_STPWithAndWithoutAPI/DigitalPotal/LetsgetStarted</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>6756dec5-f049-4643-8efd-8525a37e3508</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Digital_STPWithAndWithoutAPI/DigitalPotal/LoanDetails</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>f62edd54-01db-4436-b543-9f10bc60403e</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/loanInfoForWithAPI</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>f62edd54-01db-4436-b543-9f10bc60403e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>brand</value>
         <variableId>44449700-05e4-492e-a001-486504efb459</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>f62edd54-01db-4436-b543-9f10bc60403e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>unitDescription</value>
         <variableId>7c3c9499-ecc5-49d5-93f2-1e4a7e21bf2a</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>f62edd54-01db-4436-b543-9f10bc60403e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>loanTerm</value>
         <variableId>4d50f680-964d-4bbb-b746-10d1955b4329</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>f62edd54-01db-4436-b543-9f10bc60403e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>downpaymentValue</value>
         <variableId>ff1b30c3-5ce5-4481-9ae2-69619d3067e8</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>f62edd54-01db-4436-b543-9f10bc60403e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>actualCashOut</value>
         <variableId>48b870c9-7f4e-4416-bcd7-0d72dfbdbcc9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>f62edd54-01db-4436-b543-9f10bc60403e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>insuranceType</value>
         <variableId>ae98f721-171d-41e5-93f1-467530a79a4e</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>3a724563-1867-4769-afc4-82a02bfa9da9</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Digital_STPWithAndWithoutAPI/DigitalPotal/BorrowerDetail</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>e2db4eca-aa90-4b42-8b6e-2e0c46253264</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/BorrowerDetails</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>e2db4eca-aa90-4b42-8b6e-2e0c46253264</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>fst_Name</value>
         <variableId>411c40a8-4314-4c65-9ee6-49c35a43d4bd</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e2db4eca-aa90-4b42-8b6e-2e0c46253264</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>mid_Name</value>
         <variableId>bdd0aa3f-205a-4889-8bec-3cf198f538d7</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e2db4eca-aa90-4b42-8b6e-2e0c46253264</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>lst_Name</value>
         <variableId>f2c962c8-f594-4c98-9f5f-1517f180cd67</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e2db4eca-aa90-4b42-8b6e-2e0c46253264</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>suffix</value>
         <variableId>d9a32008-833f-432d-b1c3-f2e381dd8942</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e2db4eca-aa90-4b42-8b6e-2e0c46253264</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>maritalStatus</value>
         <variableId>7821773d-69d6-4a6a-b102-9fd8806ec712</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e2db4eca-aa90-4b42-8b6e-2e0c46253264</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>date</value>
         <variableId>7842892e-d078-4baf-938f-84bb227714df</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e2db4eca-aa90-4b42-8b6e-2e0c46253264</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>email</value>
         <variableId>36c0c017-2309-45dc-a2fe-2d2c868eddb4</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e2db4eca-aa90-4b42-8b6e-2e0c46253264</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>mob_Num</value>
         <variableId>90c5640a-5dd9-4924-a1a9-4ac1549b3a00</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>e2db4eca-aa90-4b42-8b6e-2e0c46253264</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>residence</value>
         <variableId>2618a65d-1cbd-4e11-ba71-563cb3b2e1e6</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>e338e056-eea6-443d-a7c2-b64cf007a523</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Digital_STPWithAndWithoutAPI/DigitalPotal/ConfirmationPage</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>0264bb15-24d4-4241-94cc-e697df59598c</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Digital_STPWithAndWithoutAPI/DigitalPotal/InitialCheckingWithAPI</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>0c4ad191-40d8-4cc0-ad94-de0bc27d7e82</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Digital_STPWithAndWithoutAPI/DigitalPotal/AdditionalPageWithAPI</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>b1bb66f8-668c-48a1-9e28-fd66abc6c876</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/AddiDataForBorrowerAPI</testDataId>
      </testDataLink>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>65d65aa3-e869-4305-b092-b1fd78c8fde4</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/AddiDataForCoBorrowerAPI</testDataId>
      </testDataLink>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>be5525ef-ecdc-4c77-9605-c2c63bc01bed</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/AddiDataForHomeAddressAPI</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>b1bb66f8-668c-48a1-9e28-fd66abc6c876</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>nationality</value>
         <variableId>56f45dca-23bf-4600-b8a4-1a03bbb8cab4</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b1bb66f8-668c-48a1-9e28-fd66abc6c876</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>visaType</value>
         <variableId>007abf31-961e-48d2-a8d8-b40023e9c374</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b1bb66f8-668c-48a1-9e28-fd66abc6c876</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>sex</value>
         <variableId>e62c303e-e097-4e84-9749-c30903f98005</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b1bb66f8-668c-48a1-9e28-fd66abc6c876</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>occupation</value>
         <variableId>7a45129f-5aaf-4e01-8499-7c61a5fb0c0e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b1bb66f8-668c-48a1-9e28-fd66abc6c876</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>idType</value>
         <variableId>5298cbae-62d0-428a-8666-afe939e22aa9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b1bb66f8-668c-48a1-9e28-fd66abc6c876</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>idNumber</value>
         <variableId>65f8629b-9108-44d7-b161-dea8be465dbe</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b1bb66f8-668c-48a1-9e28-fd66abc6c876</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>accountNumber</value>
         <variableId>da46c645-3d79-4bdc-8c36-36194996539c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>be5525ef-ecdc-4c77-9605-c2c63bc01bed</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>country</value>
         <variableId>f75a7232-b34e-494a-ac60-c8bf725154f7</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>be5525ef-ecdc-4c77-9605-c2c63bc01bed</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>region</value>
         <variableId>ca742bcf-a7b4-4693-a19e-25c3b6044cd5</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>be5525ef-ecdc-4c77-9605-c2c63bc01bed</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>province</value>
         <variableId>136e6551-98c9-4ff7-9db2-141642ffa5a6</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>be5525ef-ecdc-4c77-9605-c2c63bc01bed</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>townCityMunicipality</value>
         <variableId>52a59ea4-c3f1-4819-8c96-bb7db451f8b6</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>be5525ef-ecdc-4c77-9605-c2c63bc01bed</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>barangay</value>
         <variableId>eb4c4d7d-2001-4989-b45f-0b1643e548e7</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>be5525ef-ecdc-4c77-9605-c2c63bc01bed</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>streetName</value>
         <variableId>827d09e8-6381-4021-b9a0-92cc7217e2f4</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>be5525ef-ecdc-4c77-9605-c2c63bc01bed</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>unitNoBldgNameBldgNoVillageSubdivision</value>
         <variableId>899131a7-ca02-4532-a64e-a36fdbc449ec</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>65d65aa3-e869-4305-b092-b1fd78c8fde4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>coBorrowerRelationshipWithBorrower</value>
         <variableId>0bf18d5c-9ed8-478b-90b3-4778b3e5f594</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>65d65aa3-e869-4305-b092-b1fd78c8fde4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>coBorrowerFirstName</value>
         <variableId>2f482420-70b1-47d4-bba2-4e30843e74f7</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>65d65aa3-e869-4305-b092-b1fd78c8fde4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>coBorrowerMiddleName</value>
         <variableId>2df7e840-0651-4ae7-b3b0-161aeb8ae299</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>65d65aa3-e869-4305-b092-b1fd78c8fde4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>coBorrowerLastName</value>
         <variableId>71cff1f4-4428-4928-a5ff-3665cb046cfb</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>65d65aa3-e869-4305-b092-b1fd78c8fde4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>coBorrowerSuffix</value>
         <variableId>c57231c1-bedd-44a9-9ab9-638a480e98ba</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>16a21f76-f138-469d-a9c6-fc0bf8921ca7</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Digital_STPWithAndWithoutAPI/DigitalPotal/DocumentUploadPageWith</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>9060d375-998e-421d-85e8-fb9fe73eaa4b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Digital_STPWithAndWithoutAPI/DigitalPotal/SubmitPageSuccess</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>6be61f35-c212-431a-bbce-620a44acce74</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Base_Scripts/TestCaseForPreAndPost/ApplicationPageForPreAndPost</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>eb1accbd-0ea8-4cbb-99bd-1b35904b1696</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/ApplicationSecPreData</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>eb1accbd-0ea8-4cbb-99bd-1b35904b1696</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>show</value>
         <variableId>af30113b-81a4-47fc-badb-cbb347acd1d0</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>eb1accbd-0ea8-4cbb-99bd-1b35904b1696</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>sortBy</value>
         <variableId>7c438659-261b-4040-a509-eec3fd080cf5</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>d0f19519-617f-437d-b858-c399f000af3e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Base_Scripts/TestCaseForPreAndPost/CustomerDetailForPreRelease</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>37140a26-a711-4126-a884-a4a8ca3d01e2</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Base_Scripts/TestCaseForPreAndPost/LoanInformationForPreRelease</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>08d806a7-18cb-47d9-996f-4388b60209c6</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/loanInformationForPreRelease</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>08d806a7-18cb-47d9-996f-4388b60209c6</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>marketingPromoCode</value>
         <variableId>7ea9113b-a4e2-42f2-b010-ebaa86476942</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>08d806a7-18cb-47d9-996f-4388b60209c6</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>loanPurpose</value>
         <variableId>cccd40d3-844c-40c6-8c57-3c327eeb4c79</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>08d806a7-18cb-47d9-996f-4388b60209c6</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>modeOfRelease</value>
         <variableId>1d64916c-27ae-4c7d-b471-b872dff09c35</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>08d806a7-18cb-47d9-996f-4388b60209c6</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>scheduleUnitReleaseDate</value>
         <variableId>13281907-eb91-455b-b210-4bf877477894</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>08d806a7-18cb-47d9-996f-4388b60209c6</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>actualUnitReleaseDate</value>
         <variableId>68264b98-57f2-46d8-97d6-78f6abd52cff</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>08d806a7-18cb-47d9-996f-4388b60209c6</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>paymentType</value>
         <variableId>55981167-f0a6-4029-8833-e3c62d756e1d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>08d806a7-18cb-47d9-996f-4388b60209c6</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>paymentFrequecy</value>
         <variableId>f3cc6c4f-53b1-4f4a-8eb8-99d9d61585e4</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>08d806a7-18cb-47d9-996f-4388b60209c6</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>modeOfPayment</value>
         <variableId>8092ce41-2be0-405f-9b27-b75e0bd0ea49</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>08d806a7-18cb-47d9-996f-4388b60209c6</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>effectiveDateOfAda</value>
         <variableId>f401b8a3-5544-4c6b-8e3d-728ab654dbd3</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>08d806a7-18cb-47d9-996f-4388b60209c6</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>accountNumber</value>
         <variableId>df09e952-ec66-420e-ada0-3099d6546b1a</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>08d806a7-18cb-47d9-996f-4388b60209c6</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>accountName</value>
         <variableId>d788b0b4-e6d1-4e17-90b8-b48c4b4bd8f5</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>54e88c33-9e8a-43d5-a866-79c5ad06ea8e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Base_Scripts/TestCaseForPreAndPost/DocumentCheckListForPreRelease</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>969be808-dfed-4e1f-9696-b901e830288e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Base_Scripts/TestCaseForPreAndPost/CollateralInformationForPreRelease</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>0d7f3c48-f7dc-436d-a3a2-3d6c54bba095</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>6c924381-06e9-4798-b837-ebbc854b0094</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>715eca79-7ae2-4cdd-b1f9-74739f12e1f6</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>3899ba6e-fc0e-4460-adbe-9961ebd5d273</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Base_Scripts/TestCaseForPreAndPost/DisbursmentInfoNew</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>72343862-4adb-41a9-900c-89fde08e0341</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Base_Scripts/TestCaseForPreAndPost/ApplicationPageForPreAndPost</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>52d44a27-5bfa-4cd5-bb5f-fca38e5bcae4</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/ApplicationSecPostData</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>52d44a27-5bfa-4cd5-bb5f-fca38e5bcae4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>show</value>
         <variableId>af30113b-81a4-47fc-badb-cbb347acd1d0</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>52d44a27-5bfa-4cd5-bb5f-fca38e5bcae4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>sortBy</value>
         <variableId>7c438659-261b-4040-a509-eec3fd080cf5</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>87d11b64-f853-4382-b834-7cb66ab50f29</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Base_Scripts/TestCaseForPreAndPost/PostReleaseSubmit</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>