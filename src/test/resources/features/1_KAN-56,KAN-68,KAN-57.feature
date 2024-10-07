
Feature: HauptMenu-Navigation-Testen

	Background:
		#@PRECOND_KAN-72
		Given die Homepage "https://web.magentatv.de/" ist geöffnet
	    #@PRECOND_KAN-70
		Given Coockies schliesst

	#Nach Öffnen der Hompage. Prüfen dass Kids-Navigationselement verfügbar und anklickbar ist.
	@TEST_KAN-56 @TESTSET_KAN-58 @Menu
	Scenario: Menu_KIDS_Xray
		When man klickt "KIDS" - Navigationselement an
		Then "https://web.magentatv.de/kinder" wird geöffnet
		
	@TEST_KAN-68 @TESTSET_KAN-58
	Scenario: Menu-Sport-Xray
		When man Sport "Sport" clickt
		Then "https://web.magentatv.de/sport" Sport Seite wird geöffnet

	#Film in Menu-Navigationselement auf der Homepage finden
	@TEST_KAN-57 @TESTSET_KAN-58 @Menu
	Scenario: Menu_Film_Xray
		When man Film Navigationselement "Film" klickt
		Then Film Seite "https://web.magentatv.de/film" wird geöffnet

