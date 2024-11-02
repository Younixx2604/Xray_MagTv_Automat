Feature: Homepage Öffnen - Test - xray

	@TEST_SCRUM-13 @TESTEXECUTION-SCRUM-22 @TestExecKey_SCRUM-22
	Scenario: Homepage Öffnen - Test - xray
		Given der Benutzer hat einen Webbrowser geöffnet
				When der Benutzer die Magenta TV "https://web.magentatv.de/" öffnet
				Then der URL der göffnete Seite sollte "https://web.magentatv.de/" enthalten

