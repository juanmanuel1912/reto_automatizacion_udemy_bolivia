#Autor:

    @stories
    Feature: buy a ticket travel
    The user could buy a ticket on tren to travel in cuzco

    @Scenario:
    Scenario: The user booking succelfully the ticket to the travel Round trip
      Given start testing of evidence register
      Given the user could going to the option of menu book now
      When the user could complete all the dates to buy ticket reservation
        |tipeTravel|destination  |route               |dataToSetIni|yearIni|monthIni|dayIni|dataToSetEnd|yearEnd|monthEnd|dayEnd|adults|children|
        |Round trip|cuzco        |machu               |select      |2022   |Marzo   |20    |select      |2022   |Marzo   |22    |2     |0       |
      Then The ticket is registered succelfull
      And Genered report of evidency login "F:\\automatizacion base screentpaly\\baseAutomate\\baseAutomate\\src\\test\\resources\\evidencias\\EvidenciaPruebas_Login.docx"
      Then  closed the browser login

