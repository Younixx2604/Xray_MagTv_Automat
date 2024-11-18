@SCRUM-31 @SCRUM-32
Feature: Homepage Öffnen - Test - xray

	@TEST_SCRUM-13  git diff
	Scenario: Homepage Öffnen - Test - xray
		Given der Benutzer hat einen Webbrowser geöffnet
				When der Benutzer die Magenta TV "https://web.magentatv.de/" öffnet
				Then der URL der göffnete Seite sollte "https://web.magentatv.de/" enthalten

