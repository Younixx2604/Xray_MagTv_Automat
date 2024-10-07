Feature: Homepage Öffnen Testen _ XRAY

	@TEST_KAN-71
	Scenario: Homepage Öffnen Testen _ XRAY
		Given der Benutzer hat einen Webbrowser geöffnet
		When der Benutzer die Magenta TV "https://web.magentatv.de/" öffnet
		Then der URL der göffnete Seite sollte "https://web.magentatv.de/" enthalten
		
