@stories
  Feature: Manage medical appointment
    as a patient
    I want to make a medical appointment request
    Through the Hospital Administration system

  @scenario1
  Scenario Outline: Register a doctor
    Given that carlos needs to register users in the platform
    When he registers the doctor it in the Hospital Administration application
    |strName|strLastName|strPhoneNumber|strIdNumber|
    |<strName>|<strLastName>|<strPhoneNumber>|<strIdNumber>|
    Then verify that it was created with the message Data saved successfully
    |strSaveDoctor|
    |<strSaveDoctor>|
     Examples:
      |strName      |strLastName      |strPhoneNumber|strIdNumber|strSaveDoctor                 |
      |Doctor1      |Lopez            |32228888      |112198775  |Datos guardados correctamente.|

  @scenario2
  Scenario Outline: Register a patient
    Given that carlos needs to register users in the platform
    When he registers the patient it in the Hospital Administration application
      |strName|strLastName|strPhoneNumber|strIdNumber|
      |<strName>|<strLastName>|<strPhoneNumber>|<strIdNumber>|
    Then verify that it was created the patient with the message Data saved successfully
      |strSavePatient|
      |<strSavePatient>|
    Examples:
      |strName      |strLastName      |strPhoneNumber|strIdNumber|strSavePatient                |
      |Paciente1    |Lopez            |32228888      |112198776  |Datos guardados correctamente.|

    @scenario3
    Scenario Outline: Make an appointment schedule
      Given that carlos needs to go to the doctor
      When he does the scheduling of the appointment
        |strDate|strIdNumberPatient|strIdNumberDoctor|strObservations|
        |<strDate>|<strIdNumberPatient>|<strIdNumberDoctor>|<strObservations>|
      Then Verify that the appointment was created with the message Data saved successfully
        |strSaveAppointment|
        |<strSaveAppointment>|

      Examples:
        |strDate      |strIdNumberPatient      |strIdNumberDoctor|strObservations|strSaveAppointment|
        |01/06/2022   |112198776               |112198775        |Revision   |Datos guardados correctamente.|
