Feature: Navigationsmenu-Xray

	Background:
		#@PRECOND_SCRUM-38
		Given die Homepage "https://web.magentatv.de/" ist geöffnet
		#@PRECOND_SCRUM-39
		Given Coockies schliesst

	@TEST_SCRUM-36 @TESTSET_SCRUM-37
	Scenario: Menu-Sport-Xray
		When man Sport "Sport" clickt
		Then "https://web.magentatv.de/sport" Sport Seite wird geöffnet
		
	@TEST_SCRUM-40 @TESTSET_SCRUM-37
	Scenario: Menu_KIDS_Xray
		When man klickt "KIDS" - Navigationselement an
		Then "https://web.magentatv.de/kinder" wird geöffnet
		
